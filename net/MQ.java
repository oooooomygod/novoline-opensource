/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.mn_1;


public enum MQ implements ab9_0
{
    DEFAULT(0, mn_1.k, mn_1.f),
    CHISELED(1, mn_1.e, mn_1.b),
    LINES_Y(2, mn_1.m, mn_1.j),
    LINES_X(3, mn_1.l, mn_1.c),
    LINES_Z(4, mn_1.h, mn_1.d);

    private String c;
    private int d;
    private static MQ[] b;
    private String e;

    public static MQ a(int n) {
        if (n >= b.length) {
            n = 0;
        }
        return b[n];
    }

    static {
        b = new MQ[MQ.values().length];
        MQ[] mQArray = MQ.values();
        int n = mQArray.length;
        for (int i = 0; i < n; ++i) {
            MQ mQ;
            MQ.b[mQ.a()] = mQ = mQArray[i];
        }
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String a() {
        return this.e;
    }

    public int a() {
        return this.d;
    }

    private MQ(int n2, String string2, String string3) {
        this.d = n2;
        this.e = string2;
        this.c = string3;
    }
}

