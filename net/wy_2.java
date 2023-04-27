/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.wy
 */
enum wy_2 {
    NONE(0.0f, 0.0f, 30, 1),
    HOP(0.8f, 0.2f, 20, 10),
    STEP(1.0f, 0.45f, 14, 14),
    SPRINT(1.75f, 0.4f, 1, 8),
    ATTACK(2.0f, 0.7f, 7, 8);

    private int a;
    private int c;
    private float e;
    private float d;

    public float b() {
        return this.e;
    }

    public int a() {
        return this.a;
    }

    public float c() {
        return this.d;
    }

    private wy_2(float f, float f2, int n2, int n3) {
        this.e = f;
        this.d = f2;
        this.c = n2;
        this.a = n3;
    }

    public int d() {
        return this.c;
    }
}

