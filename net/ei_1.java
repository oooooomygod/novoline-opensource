/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Vec3;

/*
 * Renamed from net.ei
 */
public class ei_1 {
    public float b;
    public Vec3 c;
    public float a;

    public ei_1 a(float f, float f2) {
        return new ei_1(this, f, f2);
    }

    public ei_1(Vec3 vec3, float f, float f2) {
        this.c = vec3;
        this.b = f;
        this.a = f2;
    }

    public ei_1(ei_1 ei_12, float f, float f2) {
        this.c = ei_12.c;
        this.b = f;
        this.a = f2;
    }

    public ei_1(float f, float f2, float f3, float f4, float f5) {
        this(new Vec3(f, f2, f3), f4, f5);
    }
}

