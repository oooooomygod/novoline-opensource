/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.FontRenderer;
import java.util.List;
import net.aI_;

public class FontRendererInvoker {
    private static String[] b;

    public static void setUnicodeFlag(FontRenderer fontRenderer, boolean bl) {
        fontRenderer.a(bl);
    }

    public static String[] b() {
        return b;
    }

    public static int a(FontRenderer fontRenderer, String string) {
        return fontRenderer.a(string);
    }

    public static double c(FontRenderer fontRenderer) {
        return fontRenderer.a();
    }

    public static void b(FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl) {
        fontRenderer.a(string, d, d2, n, bl);
    }

    public static void a(FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl) {
        fontRenderer.c(string, d, d2, n, bl);
    }

    public static int b(FontRenderer fontRenderer, char c) {
        return fontRenderer.b(c);
    }

    public static int c(FontRenderer fontRenderer, String string, int n) {
        return fontRenderer.e(string, n);
    }

    public static boolean b(FontRenderer fontRenderer) {
        return fontRenderer.f();
    }

    public static void setBidiFlag(FontRenderer fontRenderer, boolean bl) {
        fontRenderer.b(bl);
    }

    public static void a(FontRenderer fontRenderer, String string, int n, int n2, int n3, int n4) {
        fontRenderer.a(string, n, n2, n3, n4);
    }

    public static List b(FontRenderer fontRenderer, String string, int n) {
        return fontRenderer.d(string, n);
    }

    public static String a(String string) {
        return FontRenderer.b(string);
    }

    public static int a(FontRenderer fontRenderer, String string, float f, float f2, int n) {
        return fontRenderer.a(string, f, f2, n);
    }

    public static int a(FontRenderer fontRenderer, String string, float f, float f2, int n, boolean bl) {
        return fontRenderer.b(string, f, f2, n, bl);
    }

    public static int d(FontRenderer fontRenderer) {
        return fontRenderer.h();
    }

    public static String a(FontRenderer fontRenderer, String string, int n, boolean bl) {
        return fontRenderer.a(string, n, bl);
    }

    public static void a(FontRenderer fontRenderer, aI_ aI_2) {
        fontRenderer.b(aI_2);
    }

    public static int a(FontRenderer fontRenderer, char c) {
        return fontRenderer.e(c);
    }

    public static int drawStringWithShadow(FontRenderer fontRenderer, String string, float f, float f2, int n) {
        return fontRenderer.b(string, f, f2, n);
    }

    static {
        if (FontRendererInvoker.b() == null) {
            FontRendererInvoker.b(new String[5]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static boolean a(FontRenderer fontRenderer) {
        return fontRenderer.e();
    }

    public static String a(FontRenderer fontRenderer, String string, int n) {
        return fontRenderer.a(string, n);
    }
}

