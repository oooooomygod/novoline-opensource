/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import java.util.Iterator;

import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.og
 */
public class og_0
extends Entity {
    private int al;
    private int ak = 5;
    private String am;
    private int an;
    public float ap = (float)(MathInvoker.a() * Math.PI * 2.0);
    private static Logger aj = LogManagerInvoker.c();
    private String ao;

    public String b() {
        return this.am;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (this.n() != null && act_2.k(this.n()) == Items.nether_star && aDJ.h(damageSource)) {
            return false;
        }
        this.k();
        this.ak = (int)((float)this.ak - f);
        if (this.ak <= 0) {
            this.E();
        }
        return false;
    }

    public og_0(World world) {
        super(world);
        this.c(0.25f, 0.25f);
        this.a(new ItemStack(Blocks.air, 0));
    }

    @Override
    protected void g() {
        aom_0.a(this.t(), 10, 5);
    }

    @Override
    public boolean aB() {
        return false;
    }

    public void b(String string) {
        this.am = string;
    }

    @Override
    public void f(int n) {
        super.f(n);
        if (!this.worldObj.isRemote) {
            this.h();
        }
    }

    @Override
    public void d(EntityPlayer entityPlayer) {
        if (!this.worldObj.isRemote) {
            ItemStack itemStack = this.n();
            int n = itemStack.a;
            if (this.al == 0 && (this.am == null || 6000 - this.an <= 200 || this.am.equals(entityPlayer.getName())) && InventoryInvoker.b(entityPlayer.inventory, itemStack)) {
                EntityPlayer entityPlayer2;
                if (act_2.k(itemStack) == px_0.a(Blocks.b2)) {
                    a6w_0.a(entityPlayer, apf_0.L);
                }
                if (act_2.k(itemStack) == px_0.a(Blocks.bO)) {
                    a6w_0.a(entityPlayer, apf_0.L);
                }
                if (act_2.k(itemStack) == Items.leather) {
                    a6w_0.a(entityPlayer, apf_0.c);
                }
                if (act_2.k(itemStack) == Items.diamond) {
                    a6w_0.a(entityPlayer, apf_0.J);
                }
                if (act_2.k(itemStack) == Items.blaze_rod) {
                    a6w_0.a(entityPlayer, apf_0.z);
                }
                if (act_2.k(itemStack) == Items.diamond && this.d() != null && (entityPlayer2 = aV8.b(this.worldObj, this.d())) != entityPlayer) {
                    a6w_0.a(entityPlayer2, apf_0.e);
                }
                if (!this.Q()) {
                    aV8.a(this.worldObj, (Entity)entityPlayer, cq_1.j, 0.2f, ((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.7f + 1.0f) * 2.0f);
                }
                a6w_0.a(entityPlayer, this, n);
                if (itemStack.a <= 0) {
                    this.E();
                }
            }
        }
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        this.ak = tn_0.o(nBTTagCompound, cq_1.n) & 0xFF;
        this.an = tn_0.o(nBTTagCompound, cq_1.m);
        if (tn_0.b(nBTTagCompound, cq_1.a)) {
            this.al = tn_0.o(nBTTagCompound, cq_1.k);
        }
        if (tn_0.b(nBTTagCompound, cq_1.l)) {
            this.am = tn_0.m(nBTTagCompound, cq_1.p);
        }
        if (tn_0.b(nBTTagCompound, cq_1.b)) {
            this.ao = tn_0.m(nBTTagCompound, cq_1.f);
        }
        NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, cq_1.h);
        this.a(act_2.a(nBTTagCompound2));
        if (this.n() == null) {
            this.E();
        }
    }

    public void c(String string) {
        this.ao = string;
    }

    @Override
    public String getName() {
        return this.e() ? this.y() : ahq_0.b(aL0.a(aL0.a(new StringBuilder(), cq_1.e), act_2.l(this.n())).toString());
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, cq_1.d, (short)((byte)this.ak));
        tn_0.a(nBTTagCompound, cq_1.o, (short)this.an);
        tn_0.a(nBTTagCompound, cq_1.i, (short)this.al);
        if (this.d() != null) {
            tn_0.a(nBTTagCompound, cq_1.c, this.ao);
        }
        if (this.b() != null) {
            tn_0.a(nBTTagCompound, cq_1.q, this.am);
        }
        if (this.n() != null) {
            tn_0.a(nBTTagCompound, cq_1.g, (NBTBase)act_2.a(this.n(), new NBTTagCompound()));
        }
    }

    public void e() {
        this.an = -6000;
    }

    public void a(ItemStack itemStack) {
        aom_0.b(this.t(), 10, itemStack);
        aom_0.f(this.t(), 10);
    }

    private boolean a(og_0 og_02) {
        if (og_02 == this) {
            return false;
        }
        if (og_02.n() && this.n()) {
            ItemStack itemStack = this.n();
            ItemStack itemStack2 = og_02.n();
            if (this.al != Short.MAX_VALUE && og_02.al != Short.MAX_VALUE) {
                if (this.an != Short.MIN_VALUE && og_02.an != Short.MIN_VALUE) {
                    if (act_2.k(itemStack2) != act_2.k(itemStack)) {
                        return false;
                    }
                    if (act_2.b(itemStack2) ^ act_2.b(itemStack)) {
                        return false;
                    }
                    if (act_2.b(itemStack2) && !act_2.a(itemStack2).equals(act_2.a(itemStack))) {
                        return false;
                    }
                    if (act_2.k(itemStack2) == null) {
                        return false;
                    }
                    if (px_0.l(act_2.k(itemStack2)) && act_2.c(itemStack2) != act_2.c(itemStack)) {
                        return false;
                    }
                    if (itemStack2.a < itemStack.a) {
                        return og_02.a(this);
                    }
                    if (itemStack2.a + itemStack.a > act_2.f(itemStack2)) {
                        return false;
                    }
                    itemStack2.a += itemStack.a;
                    og_02.al = MathInvoker.max(og_02.al, this.al);
                    og_02.an = MathInvoker.b(og_02.an, this.an);
                    og_02.a(itemStack2);
                    this.E();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    protected void e(int n) {
        this.a(DamageSource.b, (float)n);
    }

    public void f() {
        this.al = 0;
    }

    public void a() {
        this.an = 4800;
    }

    public og_0(World world, double d, double d2, double d3, ItemStack itemStack) {
        this(world, d, d2, d3);
        this.a(itemStack);
    }

    public boolean g() {
        return this.al > 0;
    }

    @Override
    public void onUpdate() {
        if (this.n() == null) {
            this.E();
        } else {
            super.onUpdate();
            if (this.al > 0 && this.al != Short.MAX_VALUE) {
                --this.al;
            }
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            this.motionY -= (double)0.04f;
            this.H = this.pushOutOfBlocks(this.posX, (this.getEntityBoundingBox().a + this.getEntityBoundingBox().c) / 2.0, this.posZ);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            boolean bl = (int)this.prevPosX != (int)this.posX || (int)this.prevPosY != (int)this.posY || (int)this.prevPosZ != (int)this.posZ;
            if (this.ticksExisted % 25 == 0) {
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this)))) == Material.e) {
                    this.motionY = 0.2f;
                    this.motionX = (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f;
                    this.motionZ = (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f;
                    this.a(cq_1.r, 0.4f, 2.0f + a5_0.e(this.Q) * 0.4f);
                }
                if (!this.worldObj.isRemote) {
                    this.h();
                }
            }
            float f = 0.98f;
            if (this.onGround) {
                f = BlockStateInvoker.getBlock((IBlockState)aV8.q((World)this.worldObj, (BlockPos)new BlockPos((int)MathHelper.floor_double((double)this.posX), (int)(MathHelper.floor_double((double)this.getEntityBoundingBox().a) - 1), (int)MathHelper.floor_double((double)this.posZ)))).z * 0.98f;
            }
            this.motionX *= (double)f;
            this.motionY *= (double)0.98f;
            this.motionZ *= (double)f;
            if (this.onGround) {
                this.motionY *= -0.5;
            }
            if (this.an != Short.MIN_VALUE) {
                ++this.an;
            }
            this.G();
            if (!this.worldObj.isRemote && this.an >= 6000) {
                this.E();
            }
        }
    }

    public void c() {
        this.al = 10;
    }

    public void l() {
        this.i();
        this.an = 5999;
    }

    public ItemStack n() {
        aom_0.c(this.t(), 10);
        return new ItemStack(Blocks.stone);
    }

    public String d() {
        return this.ao;
    }

    @Override
    public void G() {
        if (aV8.a(this.worldObj, this.getEntityBoundingBox(), Material.M, (Entity)this)) {
            if (!this.W && !this.L) {
                this.F();
            }
            this.W = true;
        } else {
            this.W = false;
        }
    }

    @Override
    protected boolean p() {
        return false;
    }

    private void h() {
        Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, og_0.class, h__0.d(this.getEntityBoundingBox(), 0.5, 0.0, 0.5)));
        while (dz_0.c(iterator)) {
            og_0 og_02 = (og_0)dz_0.b(iterator);
            this.a(og_02);
        }
    }

    public void i() {
        this.al = Short.MAX_VALUE;
    }

    public og_0(World world, double d, double d2, double d3) {
        super(world);
        this.c(0.25f, 0.25f);
        this.j(d, d2, d3);
        this.rotationYaw = (float)(MathInvoker.a() * 360.0);
        this.motionX = (float)(MathInvoker.a() * (double)0.2f - (double)0.1f);
        this.motionY = 0.2f;
        this.motionZ = (float)(MathInvoker.a() * (double)0.2f - (double)0.1f);
    }

    public int m() {
        return this.an;
    }

    public void c(int n) {
        this.al = n;
    }
}

