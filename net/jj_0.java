/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/*
 * Renamed from net.Jj
 */
public class jj_0 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static int a(BufferedImage bufferedImage, int n, int n2) {
        return bufferedImage.getRGB(n, n2);
    }

    public static int d(BufferedImage bufferedImage) {
        return bufferedImage.getHeight();
    }

    public static String[] b() {
        return b;
    }

    public static int e(BufferedImage bufferedImage) {
        return bufferedImage.getType();
    }

    static {
        if (jj_0.b() != null) {
            jj_0.b(new String[1]);
        }
    }

    public static Graphics c(BufferedImage bufferedImage) {
        return bufferedImage.getGraphics();
    }

    public static void a(BufferedImage bufferedImage, int n, int n2, int n3) {
        bufferedImage.setRGB(n, n2, n3);
    }

    public static int[] a(BufferedImage bufferedImage, int n, int n2, int n3, int n4, int[] nArray, int n5, int n6) {
        jj_0.b();
        int[] nArray2 = bufferedImage.getRGB(n, n2, n3, n4, nArray, n5, n6);
        if (ListInvoker.b() != null) {
            jj_0.b(new String[4]);
        }
        return nArray2;
    }

    public static int f(BufferedImage bufferedImage) {
        return bufferedImage.getWidth();
    }

    public static void b(BufferedImage bufferedImage, int n, int n2, int n3, int n4, int[] nArray, int n5, int n6) {
        jj_0.b();
        bufferedImage.setRGB(n, n2, n3, n4, nArray, n5, n6);
        ListInvoker.b(new ListInvoker[1]);
    }

    public static Graphics2D a(BufferedImage bufferedImage) {
        return bufferedImage.createGraphics();
    }

    public static WritableRaster b(BufferedImage bufferedImage) {
        return bufferedImage.getRaster();
    }
}

