/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aax_0;
import net.ab9_0;


public enum a4b implements ab9_0
{
    DEAD_BUSH(0, aax_0.f),
    GRASS(1, aax_0.b),
    FERN(2, aax_0.d);

    private String b;
    private static a4b[] a;
    private int d;

    static {
        a = new a4b[a4b.values().length];
        a4b[] a4bArray = a4b.values();
        int n = a4bArray.length;
        for (int i = 0; i < n; ++i) {
            a4b a4b2;
            a4b.a[a4b2.a()] = a4b2 = a4bArray[i];
        }
    }

    public static a4b a(int n) {
        if (n >= a.length) {
            n = 0;
        }
        return a[n];
    }

    public int a() {
        return this.d;
    }

    private a4b(int n2, String string2) {
        this.d = n2;
        this.b = string2;
    }

    public String toString() {
        return this.b;
    }

    @Override
    public String a() {
        return this.b;
    }
}

