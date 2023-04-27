/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import net.Gui;

/*
 * Renamed from net.wh
 */
public class wh_1 {
    public static void a(double d, double d2, int n, int n2, int n3, int n4) {
        Gui.b(d, d2, n, n2, n3, n4);
    }

    public static void a(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4) {
        FontRendererInvoker.b();
        Gui.a(n, n2, f, f2, n3, n4, n5, n6, f3, f4);
        ListInvoker.b(new ListInvoker[4]);
    }

    public static void a(double d, double d2, float f, float f2, int n, int n2, double d3, double d4, float f3, float f4) {
        FontRendererInvoker.b();
        Gui.a(d, d2, f, f2, n, n2, d3, d4, f3, f4);
        if (ListInvoker.b() != null) {
            FontRendererInvoker.b(new String[5]);
        }
    }

    public static void a(int n, int n2, float f, float f2, int n3, int n4, float f3, float f4) {
        Gui.a(n, n2, f, f2, n3, n4, f3, f4);
    }
}

