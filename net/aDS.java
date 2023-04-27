/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
package net;

import cc.novoline.invoke.ListInvoker;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class aDS {
    private static ListInvoker[] b;

    static {
        if (aDS.b() == null) {
            aDS.b(new ListInvoker[3]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static Throwable a(Throwable throwable) {
        return ExceptionUtils.getRootCause((Throwable)throwable);
    }
}

