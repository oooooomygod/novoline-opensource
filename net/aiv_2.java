/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import net.ResourceLocation;
import net.aIZ;
import net.aI_;

/*
 * Renamed from net.aiv
 */
public class aiv_2 {
    private static String[] b;

    static {
        if (aiv_2.b() != null) {
            aiv_2.b(new String[5]);
        }
    }

    public static void a(int n, int n2, int n3, int n4) {
        aIZ.a(n, n2, n3, n4);
    }

    public static int[][] a(int n, int n2, int[][] nArray) {
        return aIZ.a(n, n2, nArray);
    }

    public static void a(int[] nArray, int n, int n2) {
        aIZ.b(nArray, n, n2);
    }

    public static BufferedImage a(InputStream inputStream) {
        return aIZ.a(inputStream);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(int n, int[] nArray, int n2, int n3) {
        aIZ.a(n, nArray, n2, n3);
    }

    public static int a(int n, BufferedImage bufferedImage) {
        return aIZ.a(n, bufferedImage);
    }

    public static void a(boolean bl) {
        aIZ.a(bl);
    }

    public static String[] b() {
        return b;
    }

    public static void a(boolean bl, boolean bl2) {
        aIZ.a(bl, bl2);
    }

    public static int b(int n) {
        return aIZ.a(n);
    }

    public static int a() {
        return aIZ.a();
    }

    public static void a(int n, int n2, int n3) {
        aIZ.a(n, n2, n3);
    }

    public static void a(String string, int n, int n2, int n3, int n4) {
        aIZ.a(string, n, n2, n3, n4);
    }

    public static void a(int[][] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        int n5 = TextureManagerInvoker.a();
        aIZ.a(nArray, n, n2, n3, n4, bl, bl2);
        if (ListInvoker.b() != null) {
            TextureManagerInvoker.b(++n5);
        }
    }

    public static void a(int n) {
        aIZ.c(n);
    }

    public static int[] a(aI_ aI_2, ResourceLocation resourceLocation) {
        return aIZ.a(aI_2, resourceLocation);
    }

    public static int a(int n, BufferedImage bufferedImage, boolean bl, boolean bl2) {
        return aIZ.a(n, bufferedImage, bl, bl2);
    }
}

