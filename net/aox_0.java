/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.E8;
import net.aBx;

/*
 * Renamed from net.aOx
 */
public class aox_0 {
    private String b;
    private int a;

    public int a() {
        return this.a;
    }

    public static aox_0 a(String string) {
        aBx aBx2 = E8.a(string);
        return new aox_0(E8.a(aBx2), aBx2.b());
    }

    protected aox_0(String string, int n) {
        this.b = string;
        this.a = n;
    }

    public String b() {
        return this.b;
    }
}

