/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.item.ItemStack;

public class nJ
extends nt_1 {
    public float bI;
    private float bB;
    public float bO;
    public float bL;
    private float bM;
    private float bC;
    private float bN;
    private float bE;
    public float bF;
    public float bK;
    public float bD;
    public float bH;
    public float bG;
    private float bJ;

    @Override
    protected String d() {
        return null;
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    public boolean isInWater() {
        return aV8.a(this.worldObj, h__0.d(this.getEntityBoundingBox(), 0.0, -0.6f, 0.0), Material.M, (Entity)this);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.bL = this.bF;
        this.bG = this.bK;
        this.bO = this.bH;
        this.bI = this.bD;
        this.bH += this.bM;
        if ((double)this.bH > Math.PI * 2) {
            if (this.worldObj.isRemote) {
                this.bH = (float)Math.PI * 2;
            } else {
                this.bH = (float)((double)this.bH - Math.PI * 2);
                if (a5_0.a(this.Q, 10) == 0) {
                    this.bM = 1.0f / (a5_0.e(this.Q) + 1.0f) * 0.2f;
                }
                aV8.a(this.worldObj, (Entity)this, (byte)19);
            }
        }
        if (this.W) {
            float f;
            if (this.bH < (float)Math.PI) {
                f = this.bH / (float)Math.PI;
                this.bD = MathHelper.sin(f * f * (float)Math.PI) * (float)Math.PI * 0.25f;
                if ((double)f > 0.75) {
                    this.bN = 1.0f;
                    this.bE = 1.0f;
                } else {
                    this.bE *= 0.8f;
                }
            } else {
                this.bD = 0.0f;
                this.bN *= 0.9f;
                this.bE *= 0.99f;
            }
            if (!this.worldObj.isRemote) {
                this.motionX = this.bC * this.bN;
                this.motionY = this.bJ * this.bN;
                this.motionZ = this.bB * this.bN;
            }
            f = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.aD += (-((float)MathHelper.c(this.motionX, this.motionZ)) * 180.0f / (float)Math.PI - this.aD) * 0.1f;
            this.rotationYaw = this.aD;
            this.bK = (float)((double)this.bK + Math.PI * (double)this.bE * 1.5);
            this.bF += (-((float)MathHelper.c(f, this.motionY)) * 180.0f / (float)Math.PI - this.bF) * 0.1f;
        } else {
            this.bD = MathHelper.d(MathHelper.sin(this.bH)) * (float)Math.PI * 0.25f;
            if (!this.worldObj.isRemote) {
                this.motionX = 0.0;
                this.motionY -= 0.08;
                this.motionY *= (double)0.98f;
                this.motionZ = 0.0;
            }
            this.bF = (float)((double)this.bF + (double)(-90.0f - this.bF) * 0.02);
        }
    }

    @Override
    protected String ac() {
        return null;
    }

    public nJ(World world) {
        super(world);
        this.c(0.95f, 0.95f);
        a5_0.a(this.Q, (long)(1 + this.r()));
        this.bM = 1.0f / (a5_0.e(this.Q) + 1.0f) * 0.2f;
        aMS.a(this.bx, 0, new aln_2(this));
    }

    @Override
    public void a(byte by) {
        if (by == 19) {
            this.bH = 0.0f;
        } else {
            super.a(by);
        }
    }

    public void b(float f, float f2, float f3) {
        this.bC = f;
        this.bJ = f2;
        this.bB = f3;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 10.0);
    }

    @Override
    public void f(float f, float f2) {
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
    }

    @Override
    protected String C() {
        return null;
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2 = a5_0.a(this.Q, 3 + n) + 1;
        for (int i = 0; i < n2; ++i) {
            this.a(new ItemStack(Items.dye, 1, my_2.c(YZ.BLACK)), 0.0f);
        }
    }

    @Override
    public float w() {
        return this.n * 0.5f;
    }

    @Override
    public boolean B() {
        return this.posY > 45.0 && this.posY < (double)aV8.c(this.worldObj) && super.B();
    }

    @Override
    protected float f() {
        return 0.4f;
    }

    static boolean a(nJ nJ2) {
        return nJ2.W;
    }

    public boolean a() {
        return this.bC != 0.0f || this.bJ != 0.0f || this.bB != 0.0f;
    }

    @Override
    protected Item j() {
        return null;
    }
}

