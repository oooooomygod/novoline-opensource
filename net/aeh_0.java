/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;

/*
 * Renamed from net.aEh
 */
public class aeh_0 {
    private static String[] b;
    private int c;
    private float[] a;

    public static String[] d() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (aeh_0.d() != null) {
            aeh_0.b(new String[5]);
        }
    }

    public int b() {
        return this.c;
    }

    public void c() {
        aeh_0.d();
        float f = (float)this.c / 2.0f;
        float f2 = 0.0f;
        int n = 0;
        if (n < this.c) {
            float f3 = (float)n / f;
            this.a[n] = 1.0f / (MathInvoker.b(f) * 2.5066283f) * (float)MathInvoker.l(-0.5 * (double)f3 * (double)f3);
            f2 += this.a[n] * 2.0f;
            ++n;
            ListInvoker.b(new ListInvoker[3]);
        }
        if ((n = 0) < this.c) {
            int n2 = n++;
            this.a[n2] = this.a[n2] / f2;
        }
    }

    public float[] a() {
        return this.a;
    }

    public aeh_0(int n) {
        this.c = n;
        this.a = new float[n];
    }
}

