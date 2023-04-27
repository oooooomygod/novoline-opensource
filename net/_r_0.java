/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net._r
 */
public class _r_0
extends _v_0 {
    private int f;
    private double c;
    boolean g;
    int k;
    private double h;
    protected nu_1 l;
    Class<? extends Entity> e;
    private double j;
    double b;
    aMH i;
    World d;

    protected double a(EntityLivingBase entityLivingBase) {
        return this.l.width * 2.0f * this.l.width * 2.0f + entityLivingBase.width;
    }

    public _r_0(nu_1 nu_12, double d, boolean bl) {
        this.l = nu_12;
        this.d = nu_12.worldObj;
        this.b = d;
        this.g = bl;
        this.a(3);
    }

    @Override
    public void a() {
        tz_1.a(aMY.a(this.l));
    }

    @Override
    public boolean f() {
        EntityLivingBase entityLivingBase = aMY.j(this.l);
        return atn_0.J(entityLivingBase) && (!this.g ? !tz_1.b(aMY.a(this.l)) : aMY.b(this.l, new BlockPos(entityLivingBase)));
    }

    @Override
    public boolean g() {
        aMY.j(this.l);
        return false;
    }

    @Override
    public void d() {
        EntityLivingBase entityLivingBase = aMY.j(this.l);
        abs_1.a(aMY.p(this.l), entityLivingBase, 30.0f, 30.0f);
        double d = aMY.a(this.l, entityLivingBase.posX, atn_0.i((EntityLivingBase)entityLivingBase).a, entityLivingBase.posZ);
        double d2 = this.a(entityLivingBase);
        --this.f;
        if ((this.g || aCE.a(aMY.l(this.l), entityLivingBase)) && this.f <= 0 && (this.c == 0.0 && this.j == 0.0 && this.h == 0.0 || atn_0.a(entityLivingBase, this.c, this.j, this.h) >= 1.0 || a5_0.e(aMY.o(this.l)) < 0.05f)) {
            this.c = entityLivingBase.posX;
            this.j = atn_0.i((EntityLivingBase)entityLivingBase).a;
            this.h = entityLivingBase.posZ;
            this.f = 4 + a5_0.a(aMY.o(this.l), 7);
            if (d > 1024.0) {
                this.f += 10;
            } else if (d > 256.0) {
                this.f += 5;
            }
            if (!tz_1.a(aMY.a(this.l), entityLivingBase, this.b)) {
                this.f += 15;
            }
        }
        this.k = MathInvoker.max(this.k - 1, 0);
        if (d <= d2 && this.k <= 0) {
            this.k = 20;
            if (aMY.t(this.l) != null) {
                aMY.n(this.l);
            }
            aMY.b(this.l, (Entity)entityLivingBase);
        }
    }

    public _r_0(nu_1 nu_12, Class<? extends Entity> clazz, double d, boolean bl) {
        this(nu_12, d, bl);
        this.e = clazz;
    }

    @Override
    public void b() {
        tz_1.a(aMY.a(this.l), this.i, this.b);
        this.f = 0;
    }
}

