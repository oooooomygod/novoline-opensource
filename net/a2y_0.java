/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.amz_1;

/*
 * Renamed from net.a2y
 */
public enum a2y_0 implements ab9_0
{
    ROUGH(0, amz_1.c, amz_1.h),
    BRICKS(1, amz_1.d, amz_1.b),
    DARK(2, amz_1.g, amz_1.a);

    private String a;
    private int d;
    private static a2y_0[] e;
    private String b;

    @Override
    public String a() {
        return this.b;
    }

    static {
        e = new a2y_0[a2y_0.values().length];
        a2y_0[] a2y_0Array = a2y_0.values();
        int n = a2y_0Array.length;
        for (int i = 0; i < n; ++i) {
            a2y_0 a2y_02;
            a2y_0.e[a2y_02.c()] = a2y_02 = a2y_0Array[i];
        }
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public static a2y_0 a(int n) {
        if (n >= e.length) {
            n = 0;
        }
        return e[n];
    }

    private a2y_0(int n2, String string2, String string3) {
        this.d = n2;
        this.b = string2;
        this.a = string3;
    }
}

