/*
 * Decompiled with CFR 0.152.
 */
package net;

public class aQJ {
    private float b;
    private float a;
    private float c;

    public void a() {
        this.a = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
    }

    public float a(float f, float f2) {
        this.a += f;
        f = (this.a - this.c) * f2;
        this.b += (f - this.b) * 0.5f;
        if (f > 0.0f && f > this.b || f < 0.0f && f < this.b) {
            f = this.b;
        }
        this.c += f;
        return f;
    }
}

