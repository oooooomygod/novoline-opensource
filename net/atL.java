/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;

public class atL {
    private double d;
    private boolean c;
    private double b;
    private ResourceLocation a;

    public void a(double d) {
        this.d = d;
    }

    public double b() {
        return this.d;
    }

    public atL(ResourceLocation resourceLocation, double d, double d2, boolean bl) {
        this.a = resourceLocation;
        this.d = d;
        this.b = d2;
        this.c = bl;
    }

    public void b(double d) {
        this.b = d;
    }

    public boolean a() {
        return this.c;
    }

    public double c() {
        return this.b;
    }

    public ResourceLocation d() {
        return this.a;
    }

    public atL(atL atL2) {
        this.a = atL2.a;
        this.d = atL2.d;
        this.b = atL2.b;
        this.c = atL2.c;
    }
}

