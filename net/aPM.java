/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.agu_2;

public enum aPM implements ab9_0
{
    SUNFLOWER(0, agu_2.b),
    SYRINGA(1, agu_2.h),
    GRASS(2, agu_2.d, agu_2.k),
    FERN(3, agu_2.f, agu_2.e),
    ROSE(4, agu_2.o, agu_2.c),
    PAEONIA(5, agu_2.j);

    private int c;
    private static aPM[] b;
    private String d;
    private String a;

    public String b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    static {
        b = new aPM[aPM.values().length];
        aPM[] aPMArray = aPM.values();
        int n = aPMArray.length;
        for (int i = 0; i < n; ++i) {
            aPM aPM2;
            aPM.b[aPM2.c()] = aPM2 = aPMArray[i];
        }
    }

    public static aPM a(int n) {
        if (n >= b.length) {
            n = 0;
        }
        return b[n];
    }

    private aPM(int n2, String string2) {
        this(n2, string2, string2);
    }

    private aPM(int n2, String string2, String string3) {
        this.c = n2;
        this.a = string2;
        this.d = string3;
    }

    public String toString() {
        return this.a;
    }

    @Override
    public String a() {
        return this.a;
    }
}

