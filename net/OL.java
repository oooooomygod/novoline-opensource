/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.ITextureObject;
import deobf.MCInvoker;
import net.minecraft.renderer.texture.TextureMap;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lwjgl.opengl.GL11;

public class OL {
    public static KM i;
    public static int j = 0;
    public static IntBuffer p;
    public static aG6 n;
    public static String q;
    static int c;
    static ResourceLocation o;
    public static aG6 d;
    public static int m;
    public static int h = 0;
    public static int[] g;
    public static int a = -8421377;
    public static Map<Integer, aG6> k;
    public static int l = 0x100000;
    public static ByteBuffer b;
    public static TextureMap e;
    public static aI_ f;

    public static ITextureObject a() {
        DynamicTexture dynamicTexture = new DynamicTexture(1, 1);
        arp_1.b((DynamicTexture)dynamicTexture)[0] = -1;
        arp_1.a(dynamicTexture);
        return dynamicTexture;
    }

    public static int a(int n, int n2, int n3, int n4) {
        int n5;
        a0D.k();
        int n6 = n >>> 24 & 0xFF;
        int n7 = n2 >>> 24 & 0xFF;
        int n8 = n3 >>> 24 & 0xFF;
        int n9 = n4 >>> 24 & 0xFF;
        int n10 = n6 + n7 + n8 + n9;
        int n11 = (n10 + 2) / 4;
        if (n10 != 0) {
            n5 = n10;
        }
        n5 = 4;
        n6 = 1;
        n7 = 1;
        n8 = 1;
        n9 = 1;
        int n12 = (n5 + 1) / 2;
        int n13 = n11 << 24 | ((n >>> 16 & 0xFF) * n6 + (n2 >>> 16 & 0xFF) * n7 + (n3 >>> 16 & 0xFF) * n8 + (n4 >>> 16 & 0xFF) * n9 + n12) / n5 << 16 | ((n >>> 8 & 0xFF) * n6 + (n2 >>> 8 & 0xFF) * n7 + (n3 >>> 8 & 0xFF) * n8 + (n4 >>> 8 & 0xFF) * n9 + n12) / n5 << 8 | ((n >>> 0 & 0xFF) * n6 + (n2 >>> 0 & 0xFF) * n7 + (n3 >>> 0 & 0xFF) * n8 + (n4 >>> 0 & 0xFF) * n9 + n12) / n5 << 0;
        return n13;
    }

    public static void a(int n, int[] nArray, int n2, int n3, DynamicTexture dynamicTexture) {
        aG6 aG62 = arp_1.c(dynamicTexture);
        GlStateManagerInvoker.k(aG62.b);
        OL.a(nArray, n2, n3, 0, 0, 0);
        GlStateManagerInvoker.k(aG62.c);
        OL.a(nArray, n2, n3, 0, 0, 1);
        GlStateManagerInvoker.k(aG62.a);
        OL.a(nArray, n2, n3, 0, 0, 2);
        GlStateManagerInvoker.k(aG62.b);
    }

    public static void c(int[] nArray, int n, int n2, int n3) {
        MathInvoker.b(n2, n3);
        int n4 = n;
        int n5 = n2;
        int n6 = n3;
        a0D.r();
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if (n5 > 1 && n6 > 1) {
            n7 = n4 + n5 * n6;
            n8 = n5 / 2;
            int n11 = 0;
            n9 = n6 / 2;
            if (n11 < n9) {
                int n12 = n7 + n11 * n8;
                int n13 = n4 + n11 * 2 * n5;
                int n14 = 0;
                if (n14 < n8) {
                    nArray[n12 + n14] = OL.b(nArray[n13 + n14 * 2], nArray[n13 + n14 * 2 + 1], nArray[n13 + n5 + n14 * 2], nArray[n13 + n5 + n14 * 2 + 1]);
                    ++n14;
                }
                ++n11;
            }
            ++n10;
            n5 = n8;
            n6 = n9;
            n4 = n7;
        }
    }

    public static KM a(KM kM) {
        i = kM;
        return kM;
    }

    public static int[][] a(String string, int n, int n2, int n3, boolean bl, int n4) {
        a0D.r();
        Object object = new int[n3][];
        int[] nArray = new int[n * n2];
        object[0] = nArray;
        boolean bl2 = false;
        BufferedImage bufferedImage = OL.a(h9.a(e, new ResourceLocation(string), 0));
        if (bufferedImage != null) {
            int n5 = jj_0.f(bufferedImage);
            jj_0.d(bufferedImage);
            if (n5 + (bl ? 16 : 0) == n) {
                bl2 = true;
                jj_0.a(bufferedImage, 0, 0, n5, n5, nArray, 0, n5);
            }
        }
        a7r_0.a(nArray, n4);
        GlStateManagerInvoker.k(OL.d.a);
        object = OL.a(((int[][])object).length - 1, n, object);
        return object;
    }

    public static void a(int n, int n2, int n3, int n4, aai_1 aai_12, TextureMap textureMap) {
        aG6 aG62;
        V6.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ad0_0.k), n2), ad0_0.a), n3), ad0_0.l), n4), ad0_0.m).toString());
        a0D.r();
        e = textureMap;
        textureMap.s = n3;
        textureMap.h = n4;
        d = aG62 = OL.a(textureMap);
        aiv_2.a(aG62.b, n2, n3, n4);
        if (aVE.ci) {
            aiv_2.a(aG62.c, n2, n3, n4);
        }
        if (aVE.r) {
            aiv_2.a(aG62.a, n2, n3, n4);
        }
        GlStateManagerInvoker.k(n);
    }

    public static int[] f(int n) {
        int[] nArray = new int[n * 3];
        a7r_0.a(nArray, 0, n, 0);
        a7r_0.a(nArray, n, n * 2, -8421377);
        a7r_0.a(nArray, n * 2, n * 3, 0);
        return nArray;
    }

    public static void a(KM kM, int[] nArray) {
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static void b(int[] nArray, int n, int n2, int n3) {
        MathInvoker.b(n2, n3);
        int n4 = n;
        int n5 = n2;
        int n6 = n3;
        int n7 = 0;
        int n8 = 0;
        a0D.k();
        int n9 = 0;
        int n10 = 0;
        if (n5 > 1 && n6 > 1) {
            n7 = n4 + n5 * n6;
            n8 = n5 / 2;
            int n11 = 0;
            n9 = n6 / 2;
            if (n11 < n9) {
                int n12 = n7 + n11 * n8;
                int n13 = n4 + n11 * 2 * n5;
                int n14 = 0;
                if (n14 < n8) {
                    nArray[n12 + n14] = OL.a(nArray[n13 + n14 * 2], nArray[n13 + n14 * 2 + 1], nArray[n13 + n5 + n14 * 2], nArray[n13 + n5 + n14 * 2 + 1]);
                    ++n14;
                }
                ++n11;
            }
            ++n10;
            n5 = n8;
            n6 = n9;
            n4 = n7;
        }
    }

    public static int[][] a(KM kM, int[][] nArray, int n, int n2) {
        return nArray;
    }

    public static void d(int n) {
        aG6 aG62 = (aG6)MapInvoker.c(k, P8.d(n));
        OL.b(aG62);
    }

    public static void a(AbstractTexture abstractTexture, int n) {
        a0D.k();
        aG6 aG62 = abstractTexture.a;
        if (aG62 != null) {
            abstractTexture.a = null;
            MapInvoker.a(k, P8.d(aG62.b));
            GlStateManagerInvoker.g(aG62.c);
            GlStateManagerInvoker.g(aG62.a);
            if (aG62.b != n) {
                V6.b(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ad0_0.h), aG62.b), ad0_0.e), n).toString());
                GlStateManagerInvoker.g(aG62.b);
            }
        }
    }

    public static void a(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        int n6 = n * n2;
        IntBuffer intBuffer = OL.b(n6);
        HD.h(intBuffer);
        int n7 = n5 * n6;
        if (nArray.length >= n7 + n6) {
            iw_0.a(HD.a(HD.a(intBuffer, nArray, n7, n6), 0), n6);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
            HD.h(intBuffer);
        }
    }

    public static int b(int n, int n2, int n3, int n4) {
        int n5 = ((n >>> 24 & 0xFF) + (n2 >>> 24 & 0xFF) + (n3 >>> 24 & 0xFF) + (n4 >>> 24 & 0xFF) + 2) / 4 << 24 | ((n >>> 16 & 0xFF) + (n2 >>> 16 & 0xFF) + (n3 >>> 16 & 0xFF) + (n4 >>> 16 & 0xFF) + 2) / 4 << 16 | ((n >>> 8 & 0xFF) + (n2 >>> 8 & 0xFF) + (n3 >>> 8 & 0xFF) + (n4 >>> 8 & 0xFF) + 2) / 4 << 8 | ((n >>> 0 & 0xFF) + (n2 >>> 0 & 0xFF) + (n3 >>> 0 & 0xFF) + (n4 >>> 0 & 0xFF) + 2) / 4 << 0;
        return n5;
    }

    public static int c(int n) {
        a0D.k();
        int n2 = 0;
        if ((n & 0xFFFF0000) != 0) {
            n2 += 16;
            n >>= 16;
        }
        if ((n & 0xFF00) != 0) {
            n2 += 8;
            n >>= 8;
        }
        if ((n & 0xF0) != 0) {
            n2 += 4;
            n >>= 4;
        }
        if ((n & 6) != 0) {
            n2 += 2;
            n >>= 2;
        }
        if ((n & 2) != 0) {
            ++n2;
        }
        return n2;
    }

    public static void b(int[][] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        a0D.r();
        aiv_2.a(nArray, n, n2, n3, n4, bl, bl2);
        if (aVE.ci || aVE.r) {
            if (aVE.ci) {
                GlStateManagerInvoker.k(OL.d.c);
                OL.a(nArray, n, n2, n3, n4, 1);
            }
            if (aVE.r) {
                GlStateManagerInvoker.k(OL.d.a);
                OL.a(nArray, n, n2, n3, n4, 2);
            }
            GlStateManagerInvoker.k(OL.d.b);
        }
    }

    public static void a(int n, int n2, int n3) {
        a0D.r();
        if (aVE.aq && GlStateManagerInvoker.H() == 33984) {
            GlStateManagerInvoker.d(33986);
            GlStateManagerInvoker.k(n2);
            GlStateManagerInvoker.d(33987);
            GlStateManagerInvoker.k(n3);
            GlStateManagerInvoker.d(33984);
        }
        GlStateManagerInvoker.k(n);
    }

    public static void a(aI_ aI_2, ResourceLocation resourceLocation, int n, int n2, int[] nArray) {
        a0D.r();
        if (aVE.ci) {
            OL.a(aI_2, OL.a(resourceLocation, ad0_0.i), n, n2, nArray, n * n2, -8421377);
        }
        if (aVE.r) {
            OL.a(aI_2, OL.a(resourceLocation, ad0_0.g), n, n2, nArray, n * n2 * 2, 0);
        }
    }

    public static void a(int[][] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        int[][] nArray2;
        aiv_2.a(nArray, n, n2, n3, n4, bl, bl2);
        a0D.k();
        boolean bl3 = false;
        if (aVE.ci) {
            nArray2 = OL.a(aL0.a(aL0.a(new StringBuilder(), q), ad0_0.d).toString(), n, n2, nArray.length, bl3, -8421377);
            GlStateManagerInvoker.k(OL.d.c);
            aiv_2.a(nArray2, n, n2, n3, n4, bl, bl2);
        }
        if (aVE.r) {
            nArray2 = OL.a(aL0.a(aL0.a(new StringBuilder(), q), ad0_0.c).toString(), n, n2, nArray.length, bl3, 0);
            GlStateManagerInvoker.k(OL.d.a);
            aiv_2.a(nArray2, n, n2, n3, n4, bl, bl2);
        }
        GlStateManagerInvoker.k(OL.d.b);
    }

    public static IntBuffer b(int n) {
        if (HD.a(p) < n) {
            int n2 = OL.a(n);
            b = a9w_0.d(n2 * 4);
            p = a8q_0.e(b);
        }
        return p;
    }

    public static void a(aG6 aG62) {
        OL.a(aG62.c, aG62.a);
    }

    public static int[][] a(int n, int n2, int[][] nArray) {
        a0D.r();
        int n3 = 1;
        if (n3 <= n) {
            if (nArray[n3] == null) {
                int n4 = n2 >> n3;
                int n5 = n4 * 2;
                int[] nArray2 = nArray[n3 - 1];
                nArray[n3] = new int[n4 * n4];
                int[] nArray3 = nArray[n3];
                int n6 = 0;
                if (n6 < n4) {
                    int n7 = 0;
                    if (n7 < n4) {
                        int n8 = n6 * 2 * n5 + n7 * 2;
                        nArray3[n6 * n4 + n7] = OL.b(nArray2[n8], nArray2[n8 + 1], nArray2[n8 + n5], nArray2[n8 + n5 + 1]);
                        ++n7;
                    }
                    ++n6;
                }
            }
            ++n3;
        }
        return nArray;
    }

    public static void a(JU jU, aI_ aI_2, List list) {
        int n = 0;
        a0D.r();
        int n2 = 0;
        int n3 = 0;
        int[] nArray = null;
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            ResourceLocation resourceLocation = new ResourceLocation((String)object);
            InputStream inputStream = dw_0.b(j6_0.b(aI_2, resourceLocation));
            BufferedImage bufferedImage = aI8.a(inputStream);
            try {
                n = jj_0.f(bufferedImage);
                n2 = jj_0.d(bufferedImage);
                n3 = n * n2;
                nArray = OL.c(n3, 0);
                int[] nArray2 = OL.e(n3 * 3);
                jj_0.a(bufferedImage, 0, 0, n, n2, nArray2, 0, n);
                OL.a(aI_2, resourceLocation, n, n2, nArray2);
                boolean bl = false;
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        OL.a(TZ.a(jU), nArray, n, n2, false, false);
    }

    public static IntBuffer b(int n, int n2) {
        OL.e(n);
        OL.b(n);
        a7r_0.a(g, 0, n, n2);
        HD.a(p, g, 0, n);
        return p;
    }

    static void b() {
        a0D.k();
        TextureManager textureManager = MCInvoker.E(MCInvoker.f());
        ITextureObject iTextureObject = TextureManagerInvoker.b(textureManager, TextureMap.r);
        if (iTextureObject != null) {
            aG6 aG62 = u3_0.a(iTextureObject);
            GlStateManagerInvoker.k(aG62.b);
            GL11.glTexParameteri((int)3553, (int)10241, (int)aVE.cQ[aVE.db]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)aVE.aM[aVE.aV]);
            GlStateManagerInvoker.k(aG62.c);
            GL11.glTexParameteri((int)3553, (int)10241, (int)aVE.cQ[aVE.dm]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)aVE.aM[aVE.cM]);
            GlStateManagerInvoker.k(aG62.a);
            GL11.glTexParameteri((int)3553, (int)10241, (int)aVE.cQ[aVE.ar]);
            GL11.glTexParameteri((int)3553, (int)10240, (int)aVE.aM[aVE.au]);
            GlStateManagerInvoker.k(0);
        }
    }

    public static String a(String string) {
        q = string;
        return string;
    }

    public static void a(aG6 aG62, int[] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        int n5 = n * n2;
        IntBuffer intBuffer = OL.b(n5);
        HD.h(intBuffer);
        HD.a(intBuffer, nArray, 0, n5);
        iw_0.a(HD.a(intBuffer, 0), n5);
        GlStateManagerInvoker.k(aG62.b);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        a0D.k();
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
        if (nArray.length == n5 * 3) {
            HD.h(intBuffer);
            HD.a(HD.a(intBuffer, nArray, n5, n5), 0);
            iw_0.a(HD.a(intBuffer, 0), n5);
        }
        GlStateManagerInvoker.k(aG62.c);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
        if (nArray.length == n5 * 3) {
            HD.h(intBuffer);
            HD.a(intBuffer, nArray, n5 * 2, n5);
            iw_0.a(HD.a(intBuffer, 0), n5);
        }
        GlStateManagerInvoker.k(aG62.a);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)n3, (int)n4, (int)n, (int)n2, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GlStateManagerInvoker.d(33984);
    }

    public static void a(aG6 aG62, int[] nArray, int n, int n2, boolean bl, boolean bl2) {
        a0D.r();
        int n3 = bl ? 9729 : 9728;
        int n4 = bl2 ? 10496 : 10497;
        int n5 = n * n2;
        IntBuffer intBuffer = OL.b(n5);
        HD.h(intBuffer);
        iw_0.a(HD.a(HD.a(intBuffer, nArray, 0, n5), 0), n5);
        GlStateManagerInvoker.k(aG62.b);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n, (int)n2, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n3);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n3);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n4);
        iw_0.a(HD.a(HD.a(intBuffer, nArray, n5, n5), 0), n5);
        GlStateManagerInvoker.k(aG62.c);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n, (int)n2, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n3);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n3);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n4);
        iw_0.a(HD.a(HD.a(intBuffer, nArray, n5 * 2, n5), 0), n5);
        GlStateManagerInvoker.k(aG62.a);
        GL11.glTexImage2D((int)3553, (int)0, (int)6408, (int)n, (int)n2, (int)0, (int)32993, (int)33639, (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)3553, (int)10241, (int)n3);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n3);
        GL11.glTexParameteri((int)3553, (int)10242, (int)n4);
        GL11.glTexParameteri((int)3553, (int)10243, (int)n4);
        GlStateManagerInvoker.k(aG62.b);
    }

    public static int[][] a(int[][] nArray, int n, int n2, int n3) {
        int n4 = nArray.length;
        a0D.r();
        int[][] nArrayArray = new int[n4][];
        int n5 = 0;
        if (n5 < n4) {
            int[] nArray2 = nArray[n5];
            int n6 = (n >> n5) * (n2 >> n5);
            int[] nArray3 = new int[n6 * 3];
            nArrayArray[n5] = nArray3;
            int n7 = nArray2.length / 3;
            int n8 = n6 * n3;
            int n9 = 0;
            SystemInvoker.a(nArray2, n8, nArray3, n9, n6);
            SystemInvoker.a(nArray2, n8 += n7, nArray3, n9 += n6, n6);
            SystemInvoker.a(nArray2, n8 += n7, nArray3, n9 += n6, n6);
            ++n5;
        }
        return nArrayArray;
    }

    public static void a(int n, int n2) {
        a0D.r();
        if (aVE.aq && GlStateManagerInvoker.H() == 33984) {
            GlStateManagerInvoker.d(33986);
            GlStateManagerInvoker.k(n);
            GlStateManagerInvoker.d(33987);
            GlStateManagerInvoker.k(n2);
            GlStateManagerInvoker.d(33984);
        }
    }

    public static void a(int n, int n2, int n3, DynamicTexture dynamicTexture) {
        aG6 aG62 = arp_1.c(dynamicTexture);
        int[] nArray = arp_1.b(dynamicTexture);
        int n4 = n2 * n3;
        a7r_0.a(nArray, n4, n4 * 2, -8421377);
        a7r_0.a(nArray, n4 * 2, n4 * 3, 0);
        aiv_2.a(aG62.b, n2, n3);
        aiv_2.a(false, false);
        aiv_2.a(false);
        aiv_2.a(aG62.c, n2, n3);
        aiv_2.a(false, false);
        aiv_2.a(false);
        aiv_2.a(aG62.a, n2, n3);
        aiv_2.a(false, false);
        aiv_2.a(false);
        GlStateManagerInvoker.k(aG62.b);
    }

    public static ResourceLocation a(ResourceLocation resourceLocation, String string) {
        String string2 = axw_1.b(resourceLocation);
        String[] stringArray = StringInvoker.g(string2, ad0_0.b);
        String string3 = stringArray[0];
        return new ResourceLocation(axw_1.a(resourceLocation), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string3), ad0_0.f), string), ad0_0.j).toString());
    }

    public static int[] e(int n) {
        a0D.r();
        if (g == null) {
            g = new int[0x100000];
        }
        if (g.length < n) {
            g = new int[OL.a(n)];
        }
        return g;
    }

    public static boolean a(int[] nArray, int n, int n2) {
        a0D.k();
        int n3 = n * n2;
        if (nArray[0] >>> 24 == 255 && nArray[n3 - 1] == 0) {
            return true;
        }
        int n4 = 0;
        if (n4 < n3) {
            int n5 = nArray[n4] >>> 24;
            if (n5 != 0 && n5 != 255) {
                return true;
            }
            ++n4;
        }
        return false;
    }

    public static int[] a(BufferedImage bufferedImage, int n, int n2, int n3, int n4, int[] nArray, int n5, int n6) {
        c = n3 * n4;
        jj_0.a(bufferedImage, n, n2, n3, n4, nArray, n5, n6);
        OL.a(f, o, n3, n4, nArray);
        return nArray;
    }

    public static int a(int n, BufferedImage bufferedImage, boolean bl, boolean bl2, aI_ aI_2, ResourceLocation resourceLocation, aG6 aG62) {
        int n2 = jj_0.f(bufferedImage);
        int n3 = jj_0.d(bufferedImage);
        int n4 = n2 * n3;
        int[] nArray = OL.e(n4 * 3);
        jj_0.a(bufferedImage, 0, 0, n2, n3, nArray, 0, n2);
        OL.a(aI_2, resourceLocation, n2, n3, nArray);
        OL.a(aG62, nArray, n2, n3, bl, bl2);
        return n;
    }

    static {
        b = a9w_0.d(0x400000);
        p = a8q_0.e(b);
        g = new int[0x100000];
        k = new HashMap<Integer, aG6>();
        e = null;
        i = null;
        d = null;
        n = null;
        m = 0;
        q = null;
        f = null;
        o = null;
        c = 0;
    }

    public static BufferedImage a(ResourceLocation resourceLocation) {
        InputStream inputStream;
        block5: {
            block4: {
                a0D.k();
                try {
                    if (ys_2.d(resourceLocation)) break block4;
                    return null;
                }
                catch (IOException iOException) {
                    return null;
                }
            }
            inputStream = ys_2.b(resourceLocation);
            if (inputStream != null) break block5;
            return null;
        }
        BufferedImage bufferedImage = aI8.a(inputStream);
        aZ6.b(inputStream);
        return bufferedImage;
    }

    public static abh_2 a(aI_ aI_2, ResourceLocation resourceLocation) throws IOException {
        f = aI_2;
        o = resourceLocation;
        return j6_0.b(aI_2, resourceLocation);
    }

    public static void a(ITextureObject iTextureObject) {
        a0D.k();
        u3_0.c(iTextureObject);
        if (iTextureObject instanceof TextureMap) {
            aVE.d0 = ((TextureMap)iTextureObject).s;
            aVE.s = ((TextureMap)iTextureObject).h;
        }
        aVE.d0 = 0;
        aVE.s = 0;
        OL.b(u3_0.a(iTextureObject));
    }

    public static void a(int[] nArray, int n, int n2, int n3, int n4) {
        a0D.k();
        int n5 = 0;
        int n6 = n;
        int n7 = n2;
        int n8 = n3;
        int n9 = n4;
        if (n7 > 0) {
            GL11.glCopyTexSubImage2D((int)3553, (int)n5, (int)n8, (int)n9, (int)0, (int)0, (int)n6, (int)n7);
            ++n5;
            n6 /= 2;
            n7 /= 2;
            n8 /= 2;
            n9 /= 2;
        }
    }

    public static void a(TextureManager textureManager, ResourceLocation resourceLocation) {
        TextureMap textureMap = (TextureMap)TextureManagerInvoker.b(textureManager, resourceLocation);
        aVE.d0 = textureMap.s;
        aVE.s = textureMap.h;
        d = h9.b(textureMap);
        OL.b(d);
    }

    public static void b(aG6 aG62) {
        a0D.r();
        n = aG62;
        if (aVE.aq && GlStateManagerInvoker.H() == 33984) {
            if (aVE.ci) {
                GlStateManagerInvoker.d(33986);
                GlStateManagerInvoker.k(aG62.c);
            }
            if (aVE.r) {
                GlStateManagerInvoker.d(33987);
                GlStateManagerInvoker.k(aG62.a);
            }
            GlStateManagerInvoker.d(33984);
        }
        GlStateManagerInvoker.k(aG62.b);
    }

    public static int a(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public static int b(int n, int n2, int n3) {
        int n4 = 255 - n3;
        return ((n >>> 24 & 0xFF) * n3 + (n2 >>> 24 & 0xFF) * n4) / 255 << 24 | ((n >>> 16 & 0xFF) * n3 + (n2 >>> 16 & 0xFF) * n4) / 255 << 16 | ((n >>> 8 & 0xFF) * n3 + (n2 >>> 8 & 0xFF) * n4) / 255 << 8 | ((n >>> 0 & 0xFF) * n3 + (n2 >>> 0 & 0xFF) * n4) / 255 << 0;
    }

    public static void a(int[] nArray, int n, int n2, int n3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(aI_ aI_2, ResourceLocation resourceLocation, int n, int n2, int[] nArray, int n3, int n4) {
        block2: {
            a0D.k();
            try {
                abh_2 abh_22 = j6_0.b(aI_2, resourceLocation);
                BufferedImage bufferedImage = aI8.a(dw_0.b(abh_22));
                if (bufferedImage == null || jj_0.f(bufferedImage) != n || jj_0.d(bufferedImage) != n2) break block2;
                jj_0.a(bufferedImage, 0, 0, n, n2, nArray, n3, n);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        a7r_0.a(nArray, n3, n3 + n * n2, n4);
    }

    public static aG6 a(AbstractTexture abstractTexture) {
        aG6 aG62 = abstractTexture.a;
        int n = xz_1.a(abstractTexture);
        aG62 = (aG6)MapInvoker.c(k, P8.d(n));
        aG62 = new aG6(n, GL11.glGenTextures(), GL11.glGenTextures());
        MapInvoker.c(k, P8.d(n), aG62);
        abstractTexture.a = aG62;
        return aG62;
    }

    public static void a(int[][] nArray, int n, int n2, int n3, int n4, int n5) {
        a0D.r();
        int n6 = n * n2;
        IntBuffer intBuffer = OL.b(n6);
        int n7 = nArray.length;
        int n8 = 0;
        int n9 = n;
        int n10 = n2;
        int n11 = n3;
        int n12 = n4;
        if (n10 > 0 && n8 < n7) {
            int n13 = n9 * n10;
            int[] nArray2 = nArray[n8];
            HD.h(intBuffer);
            if (nArray2.length >= n13 * (n5 + 1)) {
                iw_0.a(HD.a(HD.a(intBuffer, nArray2, n13 * n5, n13), 0), n13);
                GL11.glTexSubImage2D((int)3553, (int)n8, (int)n11, (int)n12, (int)n9, (int)n10, (int)32993, (int)33639, (IntBuffer)intBuffer);
            }
            n9 >>= 1;
            n10 >>= 1;
            n11 >>= 1;
            n12 >>= 1;
            ++n8;
        }
        HD.h(intBuffer);
    }

    public static int[] c(int n, int n2) {
        int[] nArray = new int[n * 3];
        a7r_0.a(nArray, 0, n, n2);
        a7r_0.a(nArray, n, n * 2, -8421377);
        a7r_0.a(nArray, n * 2, n * 3, 0);
        return nArray;
    }
}

