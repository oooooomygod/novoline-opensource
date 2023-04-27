/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;

/*
 * Renamed from net.oa
 */
public class oa_2
extends Entity {
    public int ap;
    private int ak = 5;
    private int aj;
    private int ao;
    public int am;
    public int an;
    private EntityPlayer al;

    @Override
    public void G() {
        aV8.a(this.worldObj, this.getEntityBoundingBox(), Material.M, (Entity)this);
    }

    @Override
    protected void g() {
    }

    @Override
    protected void e(int n) {
        this.a(DamageSource.b, (float)n);
    }

    public int b() {
        return this.aj;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, qv_1.a, (short)((byte)this.ak));
        tn_0.a(nBTTagCompound, qv_1.g, (short)this.am);
        tn_0.a(nBTTagCompound, qv_1.c, (short)this.aj);
    }

    @Override
    public void d(EntityPlayer entityPlayer) {
        if (!this.worldObj.isRemote && this.ap == 0 && entityPlayer.bB == 0) {
            entityPlayer.bB = 2;
            aV8.a(this.worldObj, (Entity)entityPlayer, qv_1.b, 0.1f, 0.5f * ((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.7f + 1.8f));
            a6w_0.a(entityPlayer, this, 1);
            a6w_0.d(entityPlayer, this.aj);
            this.E();
        }
    }

    @Override
    public int d(float f) {
        float f2 = 0.5f;
        f2 = MathHelper.b(f2, 0.0f, 1.0f);
        int n = super.d(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    public oa_2(World world, double d, double d2, double d3, int n) {
        super(world);
        this.c(0.5f, 0.5f);
        this.j(d, d2, d3);
        this.rotationYaw = (float)(MathInvoker.a() * 360.0);
        this.motionX = (float)(MathInvoker.a() * (double)0.2f - (double)0.1f) * 2.0f;
        this.motionY = (float)(MathInvoker.a() * 0.2) * 2.0f;
        this.motionZ = (float)(MathInvoker.a() * (double)0.2f - (double)0.1f) * 2.0f;
        this.aj = n;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        this.ak = tn_0.o(nBTTagCompound, qv_1.e) & 0xFF;
        this.am = tn_0.o(nBTTagCompound, qv_1.f);
        this.aj = tn_0.o(nBTTagCompound, qv_1.h);
    }

    @Override
    protected boolean p() {
        return false;
    }

    public int a() {
        return this.aj >= 2477 ? 10 : (this.aj >= 1237 ? 9 : (this.aj >= 617 ? 8 : (this.aj >= 307 ? 7 : (this.aj >= 149 ? 6 : (this.aj >= 73 ? 5 : (this.aj >= 37 ? 4 : (this.aj >= 17 ? 3 : (this.aj >= 7 ? 2 : (this.aj >= 3 ? 1 : 0)))))))));
    }

    public oa_2(World world) {
        super(world);
        this.c(0.25f, 0.25f);
    }

    public static int a(int n) {
        return n >= 2477 ? 2477 : (n >= 1237 ? 1237 : (n >= 617 ? 617 : (n >= 307 ? 307 : (n >= 149 ? 149 : (n >= 73 ? 73 : (n >= 37 ? 37 : (n >= 17 ? 17 : (n >= 7 ? 7 : (n >= 3 ? 3 : 1)))))))));
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        this.k();
        this.ak = (int)((float)this.ak - f);
        if (this.ak <= 0) {
            this.E();
        }
        return false;
    }

    @Override
    public void onUpdate() {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        super.onUpdate();
        if (this.ap > 0) {
            --this.ap;
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= (double)0.03f;
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this)))) == Material.e) {
            this.motionY = 0.2f;
            this.motionX = (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f;
            this.motionZ = (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f;
            this.a(qv_1.d, 0.4f, 2.0f + a5_0.e(this.Q) * 0.4f);
        }
        this.pushOutOfBlocks(this.posX, (this.getEntityBoundingBox().a + this.getEntityBoundingBox().c) / 2.0, this.posZ);
        double d6 = 8.0;
        if (this.ao < this.an - 20 + this.r() % 100) {
            if (this.al == null || this.al.g(this) > d6 * d6) {
                this.al = aV8.a(this.worldObj, (Entity)this, d6);
            }
            this.ao = this.an;
        }
        if (this.al != null && a6w_0.l(this.al)) {
            this.al = null;
        }
        if (this.al != null && (d5 = 1.0 - (d4 = MathInvoker.d((d3 = (this.al.posX - this.posX) / d6) * d3 + (d2 = (this.al.posY + (double)this.al.w() - this.posY) / d6) * d2 + (d = (this.al.posZ - this.posZ) / d6) * d))) > 0.0) {
            d5 *= d5;
            this.motionX += d3 / d4 * d5 * 0.1;
            this.motionY += d2 / d4 * d5 * 0.1;
            this.motionZ += d / d4 * d5 * 0.1;
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        float f = 0.98f;
        if (this.onGround) {
            f = BlockStateInvoker.getBlock((IBlockState)aV8.q((World)this.worldObj, (BlockPos)new BlockPos((int)MathHelper.floor_double((double)this.posX), (int)(MathHelper.floor_double((double)this.getEntityBoundingBox().a) - 1), (int)MathHelper.floor_double((double)this.posZ)))).z * 0.98f;
        }
        this.motionX *= (double)f;
        this.motionY *= (double)0.98f;
        this.motionZ *= (double)f;
        if (this.onGround) {
            this.motionY *= (double)-0.9f;
        }
        ++this.an;
        ++this.am;
        if (this.am >= 6000) {
            this.E();
        }
    }

    @Override
    public boolean aB() {
        return false;
    }
}

