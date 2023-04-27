/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.MCInvoker;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;

import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class aIZ {
    public static int[] c;
    public static DynamicTexture d;
    private static Logger b;
    private static IntBuffer e;
    private static int[] a;

    static void b(int n) {
        GlStateManager.k(n);
    }

    private static void a(int[] nArray, int n, int n2) {
        int[] nArray2 = nArray;
        if (MCInvoker.f().gameSettings.bV) {
            nArray2 = aIZ.a(nArray);
        }
        HD.h(e);
        HD.a(e, nArray2, n, n2);
        iw_0.a(HD.a(e, 0), n2);
    }

    public static void a(int n, int[] nArray, int n2, int n3) {
        aIZ.b(n);
        aIZ.a(0, nArray, n2, n3, 0, 0, false, false, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(int n, int n2, int n3, int n4) {
        Class clazz = aIZ.class;
        if (aC8.b(ail_0.bk)) {
            clazz = aC8.a(ail_0.bk);
        }
        Class clazz2 = clazz;
        synchronized (clazz2) {
            aIZ.c(n);
            aIZ.b(n);
        }
        GL11.glTexParameteri((int)3553, (int)33085, (int)n2);
        GL11.glTexParameterf((int)3553, (int)33082, (float)0.0f);
        GL11.glTexParameterf((int)3553, (int)33083, (float)n2);
        GL11.glTexParameterf((int)3553, (int)34049, (float)0.0f);
        int n5 = 0;
        while (n5 <= n2) {
            GL11.glTexImage2D((int)3553, (int)n5, (int)6408, (int)(n3 >> n5), (int)(n4 >> n5), (int)0, (int)32993, (int)33639, (IntBuffer)null);
            ++n5;
        }
        return;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static int[] a(aI_ aI_2, ResourceLocation resourceLocation) throws IOException {
        aIZ.a(dw_0.b(j6_0.b(aI_2, resourceLocation)));
        return null;
    }

    public static int a(int n) {
        int n2 = n >> 24 & 0xFF;
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        int n6 = (n3 * 30 + n4 * 59 + n5 * 11) / 100;
        int n7 = (n3 * 30 + n4 * 70) / 100;
        int n8 = (n3 * 30 + n5 * 70) / 100;
        return n2 << 24 | n6 << 16 | n7 << 8 | n8;
    }

    public static int[] a(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            nArray2[i] = aIZ.a(nArray[i]);
        }
        return nArray2;
    }

    public static int a(int n, BufferedImage bufferedImage) {
        return aIZ.a(n, bufferedImage, false, false);
    }

    public static void a(boolean bl) {
        GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
    }

    public static int a() {
        return GlStateManagerInvoker.q();
    }

    private static int a(int n, int n2, int n3, int n4, int n5) {
        float f = (float)MathInvoker.b((double)((float)(n >> n5 & 0xFF) / 255.0f), 2.2);
        float f2 = (float)MathInvoker.b((double)((float)(n2 >> n5 & 0xFF) / 255.0f), 2.2);
        float f3 = (float)MathInvoker.b((double)((float)(n3 >> n5 & 0xFF) / 255.0f), 2.2);
        float f4 = (float)MathInvoker.b((double)((float)(n4 >> n5 & 0xFF) / 255.0f), 2.2);
        float f5 = (float)MathInvoker.b((double)(f + f2 + f3 + f4) * 0.25, 0.45454545454545453);
        return (int)((double)f5 * 255.0);
    }

    private static void b(boolean bl) {
        aIZ.a(bl, false);
    }

    public static int[][] a(int n, int n2, int[][] nArray) {
        int n3;
        int[][] nArrayArray = new int[n + 1][];
        nArrayArray[0] = nArray[0];
        boolean bl = false;
        for (n3 = 0; n3 < nArray.length; ++n3) {
            if (nArray[0][n3] >> 24 != 0) continue;
            bl = true;
            break;
        }
        for (n3 = 1; n3 <= n; ++n3) {
            if (nArray[n3] != null) {
                nArrayArray[n3] = nArray[n3];
                continue;
            }
            int[] nArray2 = nArrayArray[n3 - 1];
            int[] nArray3 = new int[nArray2.length >> 2];
            int n4 = n2 >> n3;
            int n5 = nArray3.length / n4;
            int n6 = n4 << 1;
            for (int i = 0; i < n4; ++i) {
                for (int j = 0; j < n5; ++j) {
                    int n7 = 2 * (i + j * n6);
                    nArray3[i + j * n4] = aIZ.a(nArray2[n7], nArray2[n7 + 1], nArray2[n7 + n6], nArray2[n7 + 1 + n6], bl);
                }
            }
            nArrayArray[n3] = nArray3;
        }
        return nArrayArray;
    }

    public static int a(int n, BufferedImage bufferedImage, int n2, int n3, boolean bl, boolean bl2) {
        aIZ.b(n);
        aIZ.a(bufferedImage, n2, n3, bl, bl2);
        return n;
    }

    public static void c(int n) {
        GlStateManager.l(n);
    }

    public static void a(int n, int n2, int n3) {
        aIZ.a(n, 0, n2, n3);
    }

    private static void a(BufferedImage bufferedImage, int n, int n2, boolean bl, boolean bl2) {
        int n3 = jj_0.f(bufferedImage);
        int n4 = jj_0.d(bufferedImage);
        int n5 = 0x400000 / n3;
        int[] nArray = new int[n5 * n3];
        aIZ.b(bl);
        aIZ.a(bl2);
        for (int i = 0; i < n3 * n4; i += n3 * n5) {
            int n6 = i / n3;
            int n7 = MathInvoker.b(n5, n4 - n6);
            int n8 = n3 * n7;
            jj_0.a(bufferedImage, 0, n6, n3, n7, nArray, 0, n3);
            aIZ.a(nArray, n8);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n, (int)(n2 + n6), (int)n3, (int)n7, (int)32993, (int)33639, (IntBuffer)e);
        }
    }

    public static int a(int n, BufferedImage bufferedImage, boolean bl, boolean bl2) {
        aIZ.a(n, jj_0.f(bufferedImage), jj_0.d(bufferedImage));
        return aIZ.a(n, bufferedImage, 0, 0, bl, bl2);
    }

    static {
        b = LogManagerInvoker.c();
        e = N4.a(0x400000);
        d = new DynamicTexture(16, 16);
        c = arp_1.b(d);
        int[] nArray = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
        int[] nArray2 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
        int n = nArray.length;
        int n2 = 0;
        while (true) {
            SystemInvoker.a(nArray, 0, c, 16 * n2, n);
            SystemInvoker.a(nArray2, 0, c, 16 * n2 + n, n);
            ++n2;
        }
    }

    public static void a(String string, int n, int n2, int n3, int n4) {
        aIZ.b(n);
        GL11.glPixelStorei((int)3333, (int)1);
        GL11.glPixelStorei((int)3317, (int)1);
        for (int i = 0; i <= n2; ++i) {
            File file = new File(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), string), av7_0.b), i), av7_0.c).toString());
            int n5 = n3 >> i;
            int n6 = n4 >> i;
            int n7 = n5 * n6;
            IntBuffer intBuffer = a9w_0.b(n7);
            int[] nArray = new int[n7];
            GL11.glGetTexImage((int)3553, (int)i, (int)32993, (int)33639, (IntBuffer)intBuffer);
            HD.a(intBuffer, nArray);
            BufferedImage bufferedImage = new BufferedImage(n5, n6, 2);
            jj_0.b(bufferedImage, 0, 0, n5, n6, nArray, 0, n5);
            try {
                aI8.a((RenderedImage)bufferedImage, av7_0.d, file);
                LoggerInvoker.a(b, av7_0.e, new Object[]{zq_2.j(file)});
                continue;
            }
            catch (Exception exception) {
                LoggerInvoker.c(b, av7_0.a, exception);
            }
        }
    }

    public static void a(boolean bl, boolean bl2) {
        GL11.glTexParameteri((int)3553, (int)10241, (int)9987);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
    }

    public static BufferedImage a(InputStream inputStream) throws IOException {
        return null;
    }

    public static void b(int[] nArray, int n, int n2) {
        int[] nArray2 = new int[n];
        int n3 = n2 / 2;
        for (int i = 0; i < n3; ++i) {
            SystemInvoker.a(nArray, i * n, nArray2, 0, n);
            SystemInvoker.a(nArray, (n2 - 1 - i) * n, nArray, i * n, n);
            SystemInvoker.a(nArray2, 0, nArray, (n2 - 1 - i) * n, n);
        }
    }

    private static void a(int[] nArray, int n) {
        aIZ.a(nArray, 0, n);
    }

    private static void a(int n, int[] nArray, int n2, int n3, int n4, int n5, boolean bl, boolean bl2, boolean bl3) {
        int n6;
        int n7 = 0x400000 / n2;
        aIZ.a(bl, bl3);
        aIZ.a(bl2);
        for (int i = 0; i < n2 * n3; i += n2 * n6) {
            int n8 = i / n2;
            n6 = MathInvoker.b(n7, n3 - n8);
            int n9 = n2 * n6;
            aIZ.a(nArray, i, n9);
            GL11.glTexSubImage2D((int)3553, (int)n, (int)n4, (int)(n5 + n8), (int)n2, (int)n6, (int)32993, (int)33639, (IntBuffer)e);
        }
    }

    private static int a(int n, int n2, int n3, int n4, boolean bl) {
        return NH.a(n, n2, n3, n4);
    }

    public static void a(int[][] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        for (int i = 0; i < nArray.length; ++i) {
            int[] nArray2 = nArray[i];
            aIZ.a(i, nArray2, n >> i, n2 >> i, n3 >> i, n4 >> i, bl, bl2, nArray.length > 1);
        }
    }
}

