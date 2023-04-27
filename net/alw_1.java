/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.alW
 */
class alw_1
extends _v_0 {
    private nt_2 c;
    private int d;
    private int b;

    @Override
    public void d() {
        --this.b;
        EntityLivingBase entityLivingBase = a6b_0.a(this.c);
        double d = a6b_0.a(this.c, entityLivingBase);
        if (d < 4.0) {
            if (this.b <= 0) {
                this.b = 20;
                a6b_0.b(this.c, entityLivingBase);
            }
            MK.a(a6b_0.e(this.c), entityLivingBase.posX, entityLivingBase.posY, entityLivingBase.posZ, 1.0);
        } else if (d < 256.0) {
            double d2 = entityLivingBase.posX - this.c.posX;
            double d3 = atn_0.i((EntityLivingBase)entityLivingBase).a + (double)(entityLivingBase.n / 2.0f) - (this.c.posY + (double)(this.c.n / 2.0f));
            double d4 = entityLivingBase.posZ - this.c.posZ;
            if (this.b <= 0) {
                ++this.d;
                if (this.d == 1) {
                    this.b = 60;
                    a6b_0.a(this.c, true);
                } else if (this.d <= 4) {
                    this.b = 6;
                } else {
                    this.b = 100;
                    this.d = 0;
                    a6b_0.a(this.c, false);
                }
                if (this.d > 1) {
                    float f = MathHelper.g(MathHelper.e(d)) * 0.5f;
                    aV8.a(this.c.worldObj, (EntityPlayer)null, 1009, new BlockPos((int)this.c.posX, (int)this.c.posY, (int)this.c.posZ), 0);
                    int n = 0;
                    while (true) {
                        oG oG2 = new oG(this.c.worldObj, this.c, d2 + a5_0.f(a6b_0.c(this.c)) * (double)f, d3, d4 + a5_0.f(a6b_0.c(this.c)) * (double)f);
                        oG2.posY = this.c.posY + (double)(this.c.n / 2.0f) + 0.5;
                        aV8.b(this.c.worldObj, oG2);
                        ++n;
                    }
                }
            }
            abs_1.a(a6b_0.b(this.c), entityLivingBase, 10.0f, 10.0f);
        } else {
            tz_1.a(a6b_0.d(this.c));
            MK.a(a6b_0.e(this.c), entityLivingBase.posX, entityLivingBase.posY, entityLivingBase.posZ, 1.0);
        }
        super.d();
    }

    @Override
    public boolean g() {
        EntityLivingBase entityLivingBase = a6b_0.a(this.c);
        return atn_0.J(entityLivingBase);
    }

    @Override
    public void a() {
        a6b_0.a(this.c, false);
    }

    public alw_1(nt_2 nt_22) {
        this.c = nt_22;
        this.a(3);
    }

    @Override
    public void b() {
        this.d = 0;
    }
}

