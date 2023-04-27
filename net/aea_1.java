/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.aL0;
import net.alf_1;
import net.aoz_1;

/*
 * Renamed from net.aeA
 */
public enum aea_1 {
    CAPE(0, alf_1.m),
    JACKET(1, alf_1.o),
    LEFT_SLEEVE(2, alf_1.j),
    RIGHT_SLEEVE(3, alf_1.c),
    LEFT_PANTS_LEG(4, alf_1.b),
    RIGHT_PANTS_LEG(5, alf_1.n),
    HAT(6, alf_1.g);

    private IChatComponent b;
    private int c;
    private int a;
    private String e;

    public String a() {
        return this.e;
    }

    public int d() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    private aea_1(int n2, String string2) {
        this.a = n2;
        this.c = 1 << n2;
        this.e = string2;
        this.b = new aoz_1(aL0.a(aL0.a(new StringBuilder(), alf_1.a), string2).toString(), new Object[0]);
    }

    public IChatComponent b() {
        return this.b;
    }
}

