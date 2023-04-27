/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.tw_1;

/*
 * Renamed from net.aSz
 */
public enum asz_0 {
    POSITIVE(tw_1.c, 0, 1, tw_1.d),
    NEGATIVE(tw_1.f, 1, -1, tw_1.b);

    private String b;
    private int a;

    public int a() {
        return this.a;
    }

    public String toString() {
        return this.b;
    }

    private asz_0(String string2, int n2, int n3, String string3) {
        this.a = n3;
        this.b = string3;
    }
}

