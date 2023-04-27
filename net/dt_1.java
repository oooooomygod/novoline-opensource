/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;

/*
 * Renamed from net.dT
 */
public class dt_1 {
    private String c;
    private long a;
    private String b;

    public String a() {
        return this.c;
    }

    public void b() {
        this.a = MCInvoker.a();
    }

    public String c() {
        return this.b;
    }

    public dt_1(String string, String string2) {
        this.b = string;
        this.c = string2;
        this.a = MCInvoker.a();
    }
}

