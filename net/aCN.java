/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.ObjectMapperFactory;
import net.a9j_0;

public class aCN {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (aCN.b() != null) {
            aCN.b(new ListInvoker[3]);
        }
    }

    public static a9j_0 a(ObjectMapperFactory objectMapperFactory, Class clazz) {
        return objectMapperFactory.a(clazz);
    }
}

