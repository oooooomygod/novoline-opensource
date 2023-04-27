/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.XY;
import net.a0D;
import net.a3c_0;
import net.adk_2;

public class XK
extends XY {
    private float[] d = new float[4];

    @Override
    protected void d() {
        this.d[0] = 0.0f;
        this.d[1] = 0.0f;
        this.d[2] = 0.0f;
        this.d[3] = 0.0f;
    }

    public void a(float f, float f2, float f3, float f4) {
        a0D.r();
        if (this.b() >= 0 && (this.d[0] != f || this.d[1] != f2 || this.d[2] != f3 || this.d[3] != f4)) {
            adk_2.a(this.b(), f, f2, f3, f4);
            a3c_0.e(this.a());
            this.d[0] = f;
            this.d[1] = f2;
            this.d[2] = f3;
            this.d[3] = f4;
        }
    }

    public XK(String string) {
        super(string);
    }

    public float[] a() {
        return this.d;
    }
}

