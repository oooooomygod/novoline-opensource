/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.math.BigInteger;

/*
 * Renamed from net.apn
 */
public class apn_2 {
    private static ListInvoker[] b;

    static {
        if (apn_2.b() != null) {
            apn_2.b(new ListInvoker[5]);
        }
    }

    public static byte[] a(BigInteger bigInteger) {
        return bigInteger.toByteArray();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static String a(BigInteger bigInteger, int n) {
        return bigInteger.toString(n);
    }
}

