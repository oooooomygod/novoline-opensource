/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;

public class aON {
    private String a;
    private String b;
    private String d;
    private static ListInvoker[] c;

    public String c() {
        return this.b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        c = listInvokerArray;
    }

    public aON(String string, String string2, String string3) {
        this.a = string;
        this.d = string2;
        this.b = string3;
    }

    static {
        if (aON.b() != null) {
            aON.b(new ListInvoker[5]);
        }
    }

    public String d() {
        return this.d;
    }

    public static ListInvoker[] b() {
        return c;
    }

    public String e() {
        return this.a;
    }
}

