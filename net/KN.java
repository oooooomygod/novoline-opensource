/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.fonts.api.FontRenderer;
import java.util.List;
import net.aq7_0;
import net.aqx_2;
import net.ax4_0;

public class KN {
    private static int b;

    public static void a(ClickGUI clickGUI, AbstractModule abstractModule) {
        clickGUI.a(abstractModule);
    }

    public static void b(int n) {
        b = n;
    }

    public static aq7_0 c(ClickGUI clickGUI) {
        return clickGUI.k();
    }

    public static int c() {
        KN.b();
        return 20;
    }

    public static void f(ClickGUI clickGUI) {
        clickGUI.j();
    }

    public static aqx_2 e(ClickGUI clickGUI) {
        return clickGUI.a();
    }

    public static void b(ClickGUI clickGUI, FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl) {
        int n2 = KN.c();
        clickGUI.b(fontRenderer, string, d, d2, n, bl);
        if (ListInvoker.b() != null) {
            KN.b(++n2);
        }
    }

    public static List b(ClickGUI clickGUI) {
        return clickGUI.b();
    }

    public static ax4_0 d(ClickGUI clickGUI) {
        return clickGUI.d();
    }

    public static int b() {
        return b;
    }

    public static void a(ClickGUI clickGUI, FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl) {
        KN.b();
        clickGUI.a(fontRenderer, string, d, d2, n, bl);
        ListInvoker.b(new ListInvoker[1]);
    }

    static {
        if (KN.c() != 0) {
            KN.b(14);
        }
    }

    public static Novoline a(ClickGUI clickGUI) {
        return clickGUI.c();
    }
}

