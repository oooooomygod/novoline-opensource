/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.aCD;
import net.ys_1;

public abstract class aKX
implements aCD {
    protected float i;
    protected boolean e = false;
    protected ResourceLocation f;
    protected ys_1 a = ys_1.LINEAR;
    protected float g = 1.0f;
    protected float d;
    protected float b = 1.0f;
    protected float h;
    protected int c = 0;

    @Override
    public ResourceLocation h() {
        return this.f;
    }

    protected aKX(ResourceLocation resourceLocation) {
        this.f = resourceLocation;
    }

    @Override
    public float b() {
        return this.g;
    }

    @Override
    public int a() {
        return this.c;
    }

    @Override
    public float i() {
        return this.i;
    }

    @Override
    public ys_1 d() {
        return this.a;
    }

    @Override
    public boolean g() {
        return this.e;
    }

    @Override
    public float f() {
        return this.h;
    }

    @Override
    public float e() {
        return this.b;
    }

    @Override
    public float c() {
        return this.d;
    }
}

