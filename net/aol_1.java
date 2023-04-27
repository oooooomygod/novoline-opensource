/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.Color;

/*
 * Renamed from net.aol
 */
public class aol_1 {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public static int a(float f, float f2, float f3) {
        return Color.HSBtoRGB(f, f2, f3);
    }

    public static float[] a(int n, int n2, int n3, float[] fArray) {
        return Color.RGBtoHSB(n, n2, n3, fArray);
    }

    public static Color a(Color color) {
        return color.brighter();
    }

    public static Color b(float f, float f2, float f3) {
        return Color.getHSBColor(f, f2, f3);
    }

    public static int g(Color color) {
        return color.getGreen();
    }

    public static int c(Color color) {
        return color.getRed();
    }

    public static float[] a(Color color, float[] fArray) {
        return color.getColorComponents(fArray);
    }

    public static int f(Color color) {
        return color.getBlue();
    }

    public static boolean c() {
        aol_1.b();
        return true;
    }

    public static boolean b() {
        return b;
    }

    static {
        if (aol_1.b()) {
            aol_1.b(true);
        }
    }

    public static int e(Color color) {
        return color.getAlpha();
    }

    public static int b(Color color) {
        return color.getRGB();
    }

    public static Color d(Color color) {
        return color.darker();
    }
}

