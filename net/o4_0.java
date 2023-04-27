/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import deobf.EntityMinecart;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.o4
 */
public class o4_0
extends EntityMinecart {
    public double ax;
    public double av;
    private int aw;

    @Override
    protected void e() {
        double d = this.av * this.av + this.ax * this.ax;
        if (d > 1.0E-4) {
            d = MathHelper.e(d);
            this.av /= d;
            this.ax /= d;
            double d2 = 1.0;
            this.motionX *= (double)0.8f;
            this.motionY *= 0.0;
            this.motionZ *= (double)0.8f;
            this.motionX += this.av * d2;
            this.motionZ += this.ax * d2;
        } else {
            this.motionX *= (double)0.98f;
            this.motionY *= 0.0;
            this.motionZ *= (double)0.98f;
        }
        super.e();
    }

    public o4_0(World world) {
        super(world);
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.coal) {
            if (!aSY.a(entityPlayer.abilities) && --itemStack.a == 0) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
            }
            this.aw += 3600;
        }
        this.av = this.posX - entityPlayer.posX;
        this.ax = this.posZ - entityPlayer.posZ;
        return true;
    }

    @Override
    protected void a(BlockPos blockPos, IBlockState iBlockState) {
        super.a(blockPos, iBlockState);
        double d = this.av * this.av + this.ax * this.ax;
        if (d > 1.0E-4 && this.motionX * this.motionX + this.motionZ * this.motionZ > 0.001) {
            d = MathHelper.e(d);
            this.av /= d;
            this.ax /= d;
            if (this.av * this.motionX + this.ax * this.motionZ < 0.0) {
                this.av = 0.0;
                this.ax = 0.0;
            } else {
                double d2 = d / this.j();
                this.av *= d2;
                this.ax *= d2;
            }
        }
    }

    @Override
    protected double j() {
        return 0.2;
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.av = tn_0.n(nBTTagCompound, CM.e);
        this.ax = tn_0.n(nBTTagCompound, CM.c);
        this.aw = tn_0.o(nBTTagCompound, CM.g);
    }

    @Override
    public anf_0 d() {
        return anf_0.FURNACE;
    }

    public o4_0(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    protected void i(boolean bl) {
        aom_0.b(this.l, 16, axt_2.a((byte)(aom_0.g(this.l, 16) | 1)));
    }

    @Override
    public IBlockState k() {
        return BlockStateInvoker.a(BlocksInvoker.t(this.a() ? Blocks.a : Blocks.ab), fs_2.Q, (Comparable)((Object) EnumFacing.NORTH));
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.aw > 0) {
            --this.aw;
        }
        if (this.aw <= 0) {
            this.ax = 0.0;
            this.av = 0.0;
        }
        this.i(this.aw > 0);
        if (this.a() && a5_0.a(this.Q, 4) == 0) {
            aV8.a(this.worldObj, B7.SMOKE_LARGE, this.posX, this.posY + 0.8, this.posZ, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    protected boolean a() {
        return (aom_0.g(this.l, 16) & 1) != 0;
    }

    @Override
    public void a(DamageSource damageSource) {
        super.a(damageSource);
        if (!aDJ.h(damageSource) && J9.c(aV8.k(this.worldObj), CM.f)) {
            this.a(new ItemStack(Blocks.ab, 1), 0.0f);
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, CM.b, this.av);
        tn_0.a(nBTTagCompound, CM.d, this.ax);
        tn_0.a(nBTTagCompound, CM.a, (short)this.aw);
    }
}

