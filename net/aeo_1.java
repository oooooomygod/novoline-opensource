/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.wp_2;

/*
 * Renamed from net.aeO
 */
public enum aeo_1 implements ab9_0
{
    DEFAULT(0, wp_2.h, wp_2.c),
    CHISELED(1, wp_2.a, wp_2.f),
    SMOOTH(2, wp_2.g, wp_2.i);

    private String d;
    private static aeo_1[] b;
    private int a;
    private String c;

    private aeo_1(int n2, String string2, String string3) {
        this.a = n2;
        this.c = string2;
        this.d = string3;
    }

    public String b() {
        return this.d;
    }

    @Override
    public String a() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public static aeo_1 a(int n) {
        if (n >= b.length) {
            n = 0;
        }
        return b[n];
    }

    static {
        b = new aeo_1[aeo_1.values().length];
        aeo_1[] aeo_1Array = aeo_1.values();
        int n = aeo_1Array.length;
        for (int i = 0; i < n; ++i) {
            aeo_1 aeo_12;
            aeo_1.b[aeo_12.c()] = aeo_12 = aeo_1Array[i];
        }
    }

    public String toString() {
        return this.c;
    }
}

