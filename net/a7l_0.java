/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import net.adj_1;

/*
 * Renamed from net.a7l
 */
public class a7l_0 {
    private static String[] b;

    public static int a(FontRenderer fontRenderer) {
        return fontRenderer.b();
    }

    public static void a(FontRenderer fontRenderer, CharSequence charSequence, double d, double d2, int n, float f, boolean bl) {
        adj_1.a();
        fontRenderer.a(charSequence, d, d2, n, f, bl);
        ListInvoker.b(new ListInvoker[1]);
    }

    public static void a(FontRenderer fontRenderer, CharSequence charSequence, double d, double d2, int n, boolean bl) {
        fontRenderer.a(charSequence, d, d2, n, bl);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static double b(FontRenderer fontRenderer) {
        return fontRenderer.a();
    }

    public static double a(FontRenderer fontRenderer, char c) {
        return fontRenderer.a(c);
    }

    public static void a(FontRenderer fontRenderer, CharSequence charSequence, double d, double d2, int n) {
        fontRenderer.a(charSequence, d, d2, n);
    }

    public static void a(FontRenderer fontRenderer, CharSequence charSequence, float f, float f2, int n, boolean bl) {
        fontRenderer.a(charSequence, f, f2, n, bl);
    }

    public static void a(FontRenderer fontRenderer, CharSequence charSequence, float f, float f2, int n) {
        fontRenderer.a(charSequence, f, f2, n);
    }

    public static String[] b() {
        return b;
    }

    public static String a(FontRenderer fontRenderer, CharSequence charSequence, int n, boolean bl) {
        return fontRenderer.a(charSequence, n, bl);
    }

    public static void a(FontRenderer fontRenderer, CharSequence charSequence, double d, double d2, int n, float f) {
        fontRenderer.b(charSequence, d, d2, n, f);
    }

    static {
        if (a7l_0.b() != null) {
            a7l_0.b(new String[5]);
        }
    }

    public static void b(FontRenderer fontRenderer, CharSequence charSequence, double d, double d2, int n, boolean bl) {
        fontRenderer.b(charSequence, d, d2, n, bl);
    }

    public static void a(FontRenderer fontRenderer, CharSequence charSequence, double d, double d2, int n, boolean bl, boolean bl2) {
        int n2 = adj_1.b();
        fontRenderer.b(charSequence, d, d2, n, bl, bl2);
        if (ListInvoker.b() != null) {
            adj_1.b(++n2);
        }
    }

    public static int a(FontRenderer fontRenderer, CharSequence charSequence) {
        return fontRenderer.a(charSequence);
    }

    public static String a(FontRenderer fontRenderer, CharSequence charSequence, int n) {
        return fontRenderer.a(charSequence, n);
    }
}

