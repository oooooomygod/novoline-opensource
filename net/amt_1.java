/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.nio.charset.Charset;

/*
 * Renamed from net.amT
 */
public class amt_1 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static Charset c() {
        return Charset.defaultCharset();
    }

    static {
        if (amt_1.b() == null) {
            amt_1.b(new ListInvoker[3]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static Charset a(String string) {
        return Charset.forName(string);
    }
}

