/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.InventoryInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.n5
 */
public abstract class n5_0
extends n4_0
implements UH {
    private int bN;
    protected Block bO = Blocks.grass;
    private EntityPlayer bM;

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.e() != 0) {
            this.bN = 0;
        }
        if (this.bN > 0) {
            --this.bN;
            if (this.bN % 10 == 0) {
                double d = a5_0.f(this.Q) * 0.02;
                double d2 = a5_0.f(this.Q) * 0.02;
                double d3 = a5_0.f(this.Q) * 0.02;
                aV8.a(this.worldObj, B7.HEART, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, d, d2, d3, new int[0]);
            }
        }
    }

    @Override
    public void a(byte by) {
        if (by == 18) {
            int n = 0;
            while (true) {
                double d = a5_0.f(this.Q) * 0.02;
                double d2 = a5_0.f(this.Q) * 0.02;
                double d3 = a5_0.f(this.Q) * 0.02;
                aV8.a(this.worldObj, B7.HEART, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, d, d2, d3, new int[0]);
                ++n;
            }
        }
        super.a(by);
    }

    public boolean a(n5_0 n5_02) {
        return n5_02 != this && n5_02.getClass() == this.getClass() && this.u() && n5_02.u();
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, aFS.a, this.bN);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        this.bN = 0;
        return super.a(damageSource, f);
    }

    public void h() {
        this.bN = 0;
    }

    @Override
    protected boolean s() {
        return false;
    }

    @Override
    public float b(BlockPos blockPos) {
        return BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.g(blockPos))) == Blocks.grass ? 10.0f : aV8.i(this.worldObj, blockPos) - 0.5f;
    }

    public void a(EntityPlayer entityPlayer) {
        this.bN = 600;
        this.bM = entityPlayer;
        aV8.a(this.worldObj, (Entity)this, (byte)18);
    }

    protected void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        if (!aSY.a(entityPlayer.abilities)) {
            --itemStack.a;
            if (itemStack.a <= 0) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
            }
        }
    }

    public EntityPlayer v() {
        return this.bM;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (this.b(itemStack) && this.e() == 0 && this.bN <= 0) {
            this.a(entityPlayer, itemStack);
            this.a(entityPlayer);
            return true;
        }
        if (this.j() && this.b(itemStack)) {
            this.a(entityPlayer, itemStack);
            this.b((int)((float)(-this.e() / 20) * 0.1f), true);
            return true;
        }
        return super.a(entityPlayer);
    }

    @Override
    protected int a(EntityPlayer entityPlayer) {
        return 1 + a5_0.a(this.worldObj.o, 3);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.bN = tn_0.g(nBTTagCompound, aFS.b);
    }

    public boolean b(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.wheat;
    }

    public n5_0(World world) {
        super(world);
    }

    @Override
    public boolean B() {
        int n;
        int n2;
        int n3 = MathHelper.floor_double(this.posX);
        BlockPos blockPos = new BlockPos(n3, n2 = MathHelper.floor_double(this.getEntityBoundingBox().a), n = MathHelper.floor_double(this.posZ));
        return BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.g(blockPos))) == this.bO && aV8.g(this.worldObj, blockPos) > 8 && super.B();
    }

    @Override
    public int Q() {
        return 120;
    }

    public boolean u() {
        return this.bN > 0;
    }

    @Override
    protected void f() {
        if (this.e() != 0) {
            this.bN = 0;
        }
        super.f();
    }
}

