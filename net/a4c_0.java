/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a5Y;
import net.aP2;
import net.ry_1;
import net.up_0;
import net.z8_0;

/*
 * Renamed from net.a4c
 */
public class a4c_0 {
    private int a = 0;
    private float b = 0.0f;
    private a5Y c = null;

    public void a(ry_1 ry_12, float f) {
        aP2.b();
        a5Y a5Y2 = z8_0.a(ry_12, this.a);
        if (a5Y2 != null) {
            up_0.a(a5Y2, f);
        }
        up_0.b(this.c, f * this.b);
    }

    public a4c_0(int n, float f, a5Y a5Y2) {
        this.a = n;
        this.b = f;
        this.c = a5Y2;
    }

    public a5Y a() {
        return this.c;
    }
}

