/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.IN;
import net.a0D;
import net.aNN;
import net.aO2;


public class aN8
extends aNN {
    public static String[] i;
    public static String[] h;

    public boolean c() {
        a0D.r();
        return this.c() == 2;
    }

    @Override
    public String a() {
        a0D.r();
        return this.a() ? IN.c() : (this.b() ? IN.d() : (this.c() ? IN.b() : super.a()));
    }

    static {
        h = new String[]{aO2.f, aO2.c, aO2.a};
        i = new String[]{aO2.e, aO2.d, aO2.b};
    }

    public aN8(String string, String string2, int n) {
        super(string, h, string2, i, n);
    }

    public boolean a() {
        a0D.k();
        return this.c() == 0;
    }

    public boolean b() {
        a0D.r();
        return this.c() == 1;
    }
}

