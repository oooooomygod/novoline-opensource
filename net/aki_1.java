/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;

/*
 * Renamed from net.akI
 */
public class aki_1 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (aki_1.b() != null) {
            aki_1.b(new ListInvoker[4]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static Attributes a(DirContext dirContext, String string, String[] stringArray) {
        return dirContext.getAttributes(string, stringArray);
    }
}

