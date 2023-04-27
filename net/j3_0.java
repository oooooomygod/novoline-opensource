/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Dimension;
import java.nio.IntBuffer;
import java.util.ArrayList;
import net.HD;
import net.N4;
import net.a4l_0;
import net.aH3;
import net.aL0;
import net.aP2;
import net.ys_2;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.j3
 */
public class j3_0 {
    private boolean d;
    private int[][] h;
    private int e;
    private int f;
    private Dimension[] g;
    private String b;
    private int[] c;
    private IntBuffer[] a;

    public static IntBuffer[] a(Dimension[] dimensionArray, int[][] nArray) {
        aP2.b();
        if (dimensionArray == null) {
            return null;
        }
        IntBuffer[] intBufferArray = new IntBuffer[dimensionArray.length];
        int n = 0;
        if (n < dimensionArray.length) {
            Dimension dimension = dimensionArray[n];
            int n2 = dimension.width * dimension.height;
            IntBuffer intBuffer = N4.a(n2);
            int[] nArray2 = nArray[n];
            HD.h(intBuffer);
            HD.b(intBuffer, nArray2);
            HD.h(intBuffer);
            intBufferArray[n] = intBuffer;
            ++n;
        }
        return intBufferArray;
    }

    public static Dimension[] a(int n, int n2, String string) {
        aP2.b();
        int n3 = aH3.b(n);
        int n4 = aH3.b(n2);
        if (n3 == n && n4 == n2) {
            ArrayList arrayList = new ArrayList();
            int n5 = n3;
            int n6 = n4;
            n5 /= 2;
            if ((n6 /= 2) <= 0) {
                Dimension[] dimensionArray = (Dimension[])ListInvoker.toArray(arrayList, new Dimension[ListInvoker.size(arrayList)]);
                return dimensionArray;
            }
            if (n5 <= 0) {
                n5 = 1;
            }
            if (n6 <= 0) {
                n6 = 1;
            }
            int n7 = n5 * n6 * 4;
            Dimension dimension = new Dimension(n5, n6);
            ListInvoker.add(arrayList, dimension);
        }
        ys_2.d(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), a4l_0.b), string), a4l_0.c), n), a4l_0.a), n2).toString());
        return new Dimension[0];
    }

    public static int[][] a(int[] nArray, int n, int n2, Dimension[] dimensionArray) {
        int[] nArray2 = nArray;
        int n3 = n;
        boolean bl = true;
        aP2.b();
        int[][] nArrayArray = new int[dimensionArray.length][];
        int n4 = 0;
        if (n4 < dimensionArray.length) {
            Dimension dimension = dimensionArray[n4];
            int n5 = dimension.width;
            int n6 = dimension.height;
            int[] nArray3 = new int[n5 * n6];
            nArrayArray[n4] = nArray3;
            int cfr_ignored_0 = n4 + 1;
            int n7 = 0;
            if (n7 < n5) {
                int n8 = 0;
                if (n8 < n6) {
                    int n9;
                    int n10 = nArray2[n7 * 2 + n8 * 2 * n3];
                    int n11 = nArray2[n7 * 2 + 1 + n8 * 2 * n3];
                    int n12 = nArray2[n7 * 2 + 1 + (n8 * 2 + 1) * n3];
                    int n13 = nArray2[n7 * 2 + (n8 * 2 + 1) * n3];
                    nArray3[n7 + n8 * n5] = n9 = j3_0.a(n10, n11, n12, n13);
                    ++n8;
                }
                ++n7;
            }
            nArray2 = nArray3;
            n3 = n5;
            if (n5 <= 1 || n6 <= 1) {
                bl = false;
            }
            ++n4;
        }
        return nArrayArray;
    }

    private static int b(int n, int n2) {
        aP2.b();
        int n3 = (n & 0xFF000000) >> 24 & 0xFF;
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        int n5 = (n3 + n4) / 2;
        if (n3 == 0 && n4 == 0) {
            n3 = 1;
            n4 = 1;
        }
        if (n3 == 0) {
            n = n2;
            n5 /= 2;
        }
        if (n4 == 0) {
            n2 = n;
            n5 /= 2;
        }
        int n6 = (n >> 16 & 0xFF) * n3;
        int n7 = (n >> 8 & 0xFF) * n3;
        int n8 = (n & 0xFF) * n3;
        int n9 = (n2 >> 16 & 0xFF) * n4;
        int n10 = (n2 >> 8 & 0xFF) * n4;
        int n11 = (n2 & 0xFF) * n4;
        int n12 = (n6 + n9) / (n3 + n4);
        int n13 = (n7 + n10) / (n3 + n4);
        int n14 = (n8 + n11) / (n3 + n4);
        return n5 << 24 | n12 << 16 | n13 << 8 | n14;
    }

    private int a(int n, int n2) {
        int n3 = (n & 0xFF000000) >> 24 & 0xFF;
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        return (n3 + n4 >> 1 << 24) + ((n & 0xFEFEFE) + (n2 & 0xFEFEFE) >> 1);
    }

    public static void b(int n, int n2, String string) {
        aP2.b();
        Dimension[] dimensionArray = j3_0.a(n, n2, string);
        int n3 = 0;
        if (n3 < dimensionArray.length) {
            Dimension dimension = dimensionArray[n3];
            int n4 = dimension.width;
            int n5 = dimension.height;
            int n6 = n3 + 1;
            GL11.glTexImage2D((int)3553, (int)n6, (int)6408, (int)n4, (int)n5, (int)0, (int)32993, (int)33639, (IntBuffer)null);
            ++n3;
        }
    }

    public static int a(int n, int n2, int n3, int n4) {
        int n5 = j3_0.b(n, n2);
        int n6 = j3_0.b(n3, n4);
        int n7 = j3_0.b(n5, n6);
        return n7;
    }

    public j3_0(String string, int n, int n2, int[] nArray, boolean bl) {
        this.b = string;
        aP2.b();
        this.e = n;
        this.f = n2;
        this.c = nArray;
        this.d = bl;
        this.g = j3_0.a(n, n2, string);
        this.h = j3_0.a(nArray, n, n2, this.g);
        this.a = j3_0.a(this.g, this.h);
    }
}

