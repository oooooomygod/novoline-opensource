/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.an0_0;

/*
 * Renamed from net.ml
 */
public enum ml_2 {
    FLOAT(4, an0_0.e, 5126),
    UBYTE(1, an0_0.f, 5121),
    BYTE(1, an0_0.j, 5120),
    USHORT(2, an0_0.m, 5123),
    SHORT(2, an0_0.l, 5122),
    UINT(4, an0_0.c, 5125),
    INT(4, an0_0.h, 5124);

    private String c;
    private int b;
    private int a;

    private ml_2(int n2, String string2, int n3) {
        this.a = n2;
        this.c = string2;
        this.b = n3;
    }

    public String b() {
        return this.c;
    }

    public int a() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}

