/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.ListInvoker;
import net.wr_2;

public class aRD {
    private static boolean b;

    static {
        if (!aRD.b()) {
            aRD.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(wr_2 wr_22, ClickGUI clickGUI, int n, int n2, double d, double d2, int n3, int n4) {
        aRD.a();
        wr_22.a(clickGUI, n, n2, d, d2, n3, n4);
        ListInvoker.b(new ListInvoker[2]);
    }

    public static void a(wr_2 wr_22, ClickGUI clickGUI, int n, int n2, double d, double d2) {
        wr_22.a(clickGUI, n, n2, d, d2);
    }

    public static boolean a() {
        aRD.b();
        return true;
    }

    public static boolean b() {
        return b;
    }
}

