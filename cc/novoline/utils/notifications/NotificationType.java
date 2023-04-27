/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils.notifications;

import cc.novoline.invoke.ListInvoker;

public enum NotificationType {
    SUCCESS,
    WARNING,
    ERROR,
    INFO;

    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        NotificationType.b(new ListInvoker[5]);
    }
}

