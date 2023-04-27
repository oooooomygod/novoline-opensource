/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.EntityLivingBase;
import deobf.IChatComponent;

public class aAJ {
    private int e;
    private String d;
    private float b;
    private float a;
    private float c;
    private DamageSource f;

    public DamageSource a() {
        return this.f;
    }

    public float e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public aAJ(DamageSource damageSource, int n, float f, float f2, String string, float f3) {
        this.f = damageSource;
        this.e = n;
        this.c = f2;
        this.b = f;
        this.d = string;
        this.a = f3;
    }

    public float d() {
        return this.f == DamageSource.m ? Float.MAX_VALUE : this.a;
    }

    public boolean c() {
        return aDJ.d(this.f) instanceof EntityLivingBase;
    }

    public IChatComponent b() {
        return aDJ.d(this.a()) == null ? null : ayj_0.P(aDJ.d(this.a()));
    }
}

