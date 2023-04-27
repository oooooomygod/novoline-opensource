/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class a5O {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static Rectangle a(Rectangle2D rectangle2D) {
        return rectangle2D.getBounds();
    }

    static {
        if (a5O.b() == null) {
            a5O.b(new ListInvoker[5]);
        }
    }
}

