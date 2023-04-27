/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;

public class aL8 {
    public static byte[] g = new byte[]{0, 1, 2, 3, 4};
    public static byte c = 3;
    public static byte f = 2;
    public static byte a = 0;
    public static byte b = 4;
    public static byte d = 1;
    private static ListInvoker[] e;

    public static ListInvoker[] b() {
        return e;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        e = listInvokerArray;
    }

    static {
        aL8.b(new ListInvoker[2]);
    }
}

