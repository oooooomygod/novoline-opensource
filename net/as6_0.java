/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import javax.script.ScriptException;

/*
 * Renamed from net.as6
 */
public class as6_0 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (as6_0.b() != null) {
            as6_0.b(new ListInvoker[3]);
        }
    }

    public static String a(ScriptException scriptException) {
        return scriptException.getMessage();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ScriptException scriptException) {
        scriptException.printStackTrace();
    }
}

