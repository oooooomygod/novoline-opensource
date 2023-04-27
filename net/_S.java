/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.minecraft.block.BlockPos;


public abstract class _S
extends _v_0 {
    protected boolean b;
    protected nu_1 d;
    private int e;
    private int f;
    private int c;
    private boolean g;

    @Override
    public boolean f() {
        aMY.j(this.d);
        return false;
    }

    protected boolean a(EntityLivingBase entityLivingBase, boolean bl) {
        if (!_S.a(this.d, entityLivingBase, bl, this.b)) {
            return false;
        }
        if (!aMY.b(this.d, new BlockPos(entityLivingBase))) {
            return false;
        }
        if (this.g) {
            if (--this.f <= 0) {
                this.c = 0;
            }
            if (this.c == 0) {
                this.c = this.a(entityLivingBase) ? 1 : 2;
            }
            return this.c != 2;
        }
        return true;
    }

    public _S(nu_1 nu_12, boolean bl, boolean bl2) {
        this.d = nu_12;
        this.b = bl;
        this.g = bl2;
    }

    @Override
    public void b() {
        this.c = 0;
        this.f = 0;
        this.e = 0;
    }

    public static boolean a(nl_1 nl_12, EntityLivingBase entityLivingBase, boolean bl, boolean bl2) {
        return false;
    }

    private boolean a(EntityLivingBase entityLivingBase) {
        this.f = 10 + a5_0.a(aMY.o(this.d), 5);
        tz_1.a(aMY.a(this.d), entityLivingBase);
        return false;
    }

    protected double a() {
        aMY.a(this.d, abb_0.c);
        return 16.0;
    }

    @Override
    public void a() {
        aMY.a(this.d, null);
    }

    public _S(nu_1 nu_12, boolean bl) {
        this(nu_12, bl, false);
    }
}

