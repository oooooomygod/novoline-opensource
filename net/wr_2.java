/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import java.util.function.Consumer;
import net.KN;
import net.WE;
import net.a1V;
import net.a7l_0;
import net.aan_1;
import net.adj_1;
import net.aol_1;
import net.ng_0;

/*
 * Renamed from net.wr
 */
public class wr_2 {
    private double a;
    private double b;
    public Consumer<String> e;
    public String d;
    private static String[] c;
    private double g;
    private double f;

    public boolean a(int n, int n2) {
        wr_2.b();
        return (double)n >= this.b && (double)n <= this.b + this.g && (double)n2 >= this.a && (double)n2 <= this.a + this.f;
    }

    public void a(ClickGUI clickGUI, int n, int n2, double d, double d2) {
        wr_2.b();
        this.b = d;
        this.a = d2;
        a1V.b(d, d2, d + this.g, d2 + this.f, this.a(n, n2) ? aol_1.b(new Color(60, 60, 60)) : aol_1.b(new Color(54, 54, 54)));
        a1V.b(d + 1.0, d2 + 1.0, d + this.g - 1.0, d2 + this.f - 1.0, aol_1.b(new Color(50, 50, 50)));
        FontRenderer fontRenderer = adj_1.a(ng_0.a, 17);
        KN.b(clickGUI, fontRenderer, this.d, d + this.g / 2.0 - (double)(a7l_0.a(fontRenderer, this.d) / 2), d2 + 0.5 + this.f / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), -1, true);
    }

    public wr_2(String string, Consumer<String> consumer, double d, double d2) {
        this.d = string;
        this.e = consumer;
        this.g = d;
        this.f = d2;
    }

    public void a(ClickGUI clickGUI, int n, int n2, double d, double d2, int n3, int n4) {
        wr_2.b();
        this.b = d;
        this.a = d2;
        a1V.b(d, d2, d + this.g, d2 + this.f, this.a(n, n2) ? n4 : n3);
        a1V.b(d + 1.0, d2 + 1.0, d + this.g - 1.0, d2 + this.f - 1.0, n3);
        FontRenderer fontRenderer = adj_1.a(ng_0.a, 17);
        KN.b(clickGUI, fontRenderer, this.d, d + this.g / 2.0 - (double)(a7l_0.a(fontRenderer, this.d) / 2), d2 + 0.5 + this.f / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), -1, true);
    }

    public static String[] b() {
        return c;
    }

    static {
        if (wr_2.b() != null) {
            wr_2.b(new String[4]);
        }
    }

    public static void b(String[] stringArray) {
        c = stringArray;
    }

    public void a(int n, int n2, int n3) {
        wr_2.b();
        if (n3 == 0 && this.a(n, n2)) {
            aan_1.a(this.e, WE.a);
        }
    }
}

