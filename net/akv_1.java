/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.eb_2;

/*
 * Renamed from net.akV
 */
public enum akv_1 implements ab9_0
{
    DEFAULT(0, eb_2.d, eb_2.f),
    CHISELED(1, eb_2.a, eb_2.c),
    SMOOTH(2, eb_2.h, eb_2.g);

    private String b;
    private int e;
    private String c;
    private static akv_1[] a;

    public static akv_1 a(int n) {
        if (n >= a.length) {
            n = 0;
        }
        return a[n];
    }

    public int c() {
        return this.e;
    }

    public String b() {
        return this.c;
    }

    public String toString() {
        return this.b;
    }

    @Override
    public String a() {
        return this.b;
    }

    static {
        a = new akv_1[akv_1.values().length];
        akv_1[] akv_1Array = akv_1.values();
        int n = akv_1Array.length;
        for (int i = 0; i < n; ++i) {
            akv_1 akv_12;
            akv_1.a[akv_12.c()] = akv_12 = akv_1Array[i];
        }
    }

    private akv_1(int n2, String string2, String string3) {
        this.e = n2;
        this.b = string2;
        this.c = string3;
    }
}

