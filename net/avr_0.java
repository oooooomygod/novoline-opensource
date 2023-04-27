/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import net.aL0;
import net.aP2;
import net.w0_0;
import net.ys_2;

/*
 * Renamed from net.aVr
 */
public class avr_0 {
    public static int e = 3;
    public static int a = 2;
    public static int i = 1;
    public static int b = 6;
    public static int j = 0;
    public static int g = 5;
    public static int c = 1;
    public static int h = 4;
    public static int d = 8;
    public static int f = 7;

    public static int a(String string) {
        aP2.b();
        if (string == null) {
            return 1;
        }
        if ((string = StringInvoker.h(StringInvoker.i(string))).equals(w0_0.h)) {
            return 0;
        }
        if (string.equals(w0_0.f)) {
            return 1;
        }
        if (string.equals(w0_0.i)) {
            return 2;
        }
        if (string.equals(w0_0.d)) {
            return 3;
        }
        if (string.equals(w0_0.c)) {
            return 4;
        }
        if (string.equals(w0_0.a)) {
            return 5;
        }
        if (string.equals(w0_0.g)) {
            return 6;
        }
        if (string.equals(w0_0.b)) {
            return 7;
        }
        if (string.equals(w0_0.e)) {
            return 8;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), w0_0.j), string).toString());
        return 1;
    }

    public static void a(int n, float f) {
        aP2.b();
        switch (n) {
            case 0: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(770, 771);
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f);
            }
            case 1: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(770, 1);
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f);
            }
            case 2: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(775, 0);
                GlStateManagerInvoker.color(f, f, f, 1.0f);
            }
            case 3: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(774, 771);
                GlStateManagerInvoker.color(f, f, f, f);
            }
            case 4: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(1, 1);
                GlStateManagerInvoker.color(f, f, f, 1.0f);
            }
            case 5: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(0, 769);
                GlStateManagerInvoker.color(f, f, f, 1.0f);
            }
            case 6: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(1, 769);
                GlStateManagerInvoker.color(f, f, f, 1.0f);
            }
            case 7: {
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(774, 768);
                GlStateManagerInvoker.color(f, f, f, 1.0f);
            }
            case 8: {
                GlStateManagerInvoker.enableAlpha();
                GlStateManagerInvoker.disableBlend();
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f);
            }
        }
        GlStateManagerInvoker.enableTexture2D();
    }

    public static void a(float f) {
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 1);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f);
    }
}

