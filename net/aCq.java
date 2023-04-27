/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aGJ;
import net.ab9_0;


public enum aCq implements ab9_0
{
    DEFAULT(0, aGJ.h, aGJ.a),
    MOSSY(1, aGJ.i, aGJ.c),
    CRACKED(2, aGJ.e, aGJ.k),
    CHISELED(3, aGJ.j, aGJ.b);

    private String e;
    private String d;
    private int a;
    private static aCq[] c;

    public int a() {
        return this.a;
    }

    @Override
    public String a() {
        return this.e;
    }

    public static aCq a(int n) {
        if (n >= c.length) {
            n = 0;
        }
        return c[n];
    }

    private aCq(int n2, String string2, String string3) {
        this.a = n2;
        this.e = string2;
        this.d = string3;
    }

    static {
        c = new aCq[aCq.values().length];
        aCq[] aCqArray = aCq.values();
        int n = aCqArray.length;
        for (int i = 0; i < n; ++i) {
            aCq aCq2;
            aCq.c[aCq2.a()] = aCq2 = aCqArray[i];
        }
    }

    public String b() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }
}

