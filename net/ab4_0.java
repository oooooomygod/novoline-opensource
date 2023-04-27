/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.IBlockAccess;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ab4
 */
public class ab4_0
implements aqz_0 {
    public String q = null;
    public static String[] k;
    private int h = 0;
    public static String m;
    private static int c = 2;
    public static String x;
    private int d = 0;
    private aP2[] g = null;
    private String f = null;
    private float[][] j = null;
    private int l = -1;
    private int r = -1;
    public static String o;
    private int z = 0;
    public static String b;
    private static int p = -1;
    private static int t = 1;
    public static String n;
    public static String u;
    public static String i;
    private int y = 0;
    private static int s = 0;
    public static String v;
    public String w = null;
    private int[] e = null;
    public static String a;

    private aP2 b(int n) {
        aP2.b();
        if (this.g == null) {
            return null;
        }
        int n2 = 0;
        if (n2 < this.g.length) {
            aP2 aP22 = this.g[n2];
            if (AM.b(aP22) == n) {
                return aP22;
            }
            ++n2;
        }
        return null;
    }

    public int e() {
        return this.z;
    }

    public boolean e(String string) {
        block10: {
            block9: {
                aP2.b();
                if (this.l == 0 || this.l == 1) break block9;
                if (this.l != 2) {
                    return false;
                }
                if (this.r >= 0) break block10;
                this.r = 0xFFFFFF;
            }
            if (this.f == null) {
                ab4_0.b(aL0.a(aL0.a(new StringBuilder(), WI.a), string).toString());
                return false;
            }
            this.b();
            if (this.e == null) {
                return false;
            }
            if (this.r < 0) {
                if (this.l == 0) {
                    this.r = this.a(127, 127);
                }
                if (this.l == 1) {
                    this.r = this.c(il_0.G, new BlockPos(0, 64, 0));
                }
            }
        }
        return true;
    }

    public int a(int n) {
        n = ys_2.a(n, 0, this.e.length - 1);
        return this.e[n] & 0xFFFFFF;
    }

    public int a(IBlockAccess iBlockAccess, double d, double d2, double d3, int n) {
        int n2;
        int n3;
        aP2.b();
        if (this.l == 2) {
            return this.r;
        }
        int n4 = MathHelper.floor_double(d);
        int n5 = MathHelper.floor_double(d2);
        int n6 = MathHelper.floor_double(d3);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        zw_1 zw_12 = new zw_1(0, 0, 0);
        int n11 = n4 - n;
        if (n11 <= n4 + n) {
            n3 = n6 - n;
            if (n3 <= n6 + n) {
                aut_1.a(zw_12, n11, n5, n3);
                n2 = this.a(iBlockAccess, (BlockPos)zw_12);
                n7 += n2 >> 16 & 0xFF;
                n8 += n2 >> 8 & 0xFF;
                n9 += n2 & 0xFF;
                ++n10;
                ++n3;
            }
            ++n11;
        }
        n11 = n7 / n10;
        n3 = n8 / n10;
        n2 = n9 / n10;
        return n11 << 16 | n3 << 8 | n2;
    }

    public boolean a(afn_0 afn_02) {
        return az9_0.a(afn_02, this.g);
    }

    private int b(il_0 il_02, BlockPos blockPos) {
        double d = MathHelper.b(hw_0.c(il_02, blockPos), 0.0f, 1.0f);
        double d2 = MathHelper.b(hw_0.a(il_02), 0.0f, 1.0f);
        int n = (int)((1.0 - d) * (double)(this.z - 1));
        int n2 = (int)((1.0 - (d2 *= d)) * (double)(this.h - 1));
        return this.a(n, n2);
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        il_0 il_02 = axn_1.a(iBlockAccess, blockPos);
        return this.a(il_02, blockPos);
    }

    public int a() {
        aP2.b();
        return this.l == 2 ? 1 : this.e.length;
    }

    public int a(int n, int n2) {
        n = ys_2.a(n, 0, this.z - 1);
        n2 = ys_2.a(n2, 0, this.h - 1);
        return this.e[n2 * this.z + n] & 0xFFFFFF;
    }

    public float[][] f() {
        aP2.b();
        if (this.j == null) {
            this.j = ab4_0.a(this.e);
        }
        return this.j;
    }

    public ab4_0(Properties properties, String string, int n, int n2, String string2) {
        kn_0 kn_02 = new kn_0(WI.B);
        this.w = aNT.e(kn_02, string);
        this.q = aNT.g(kn_02, string);
        this.l = this.d(dk_1.b(properties, WI.x, string2));
        this.g = aNT.c(kn_02, dk_1.a(properties, WI.H));
        this.f = ab4_0.a(dk_1.a(properties, WI.w), string, this.q);
        this.r = aNT.a(dk_1.a(properties, WI.i), -1);
        this.d = aNT.a(kn_02, dk_1.a(properties, WI.n), 0);
        this.y = aNT.a(kn_02, dk_1.a(properties, WI.b), 0);
        this.z = n;
        this.h = n2;
    }

    public void a(aP2 aP22) {
        aP2.b();
        if (this.g == null) {
            this.g = new aP2[0];
        }
        this.g = (aP2[])ys_2.a((Object[])this.g, (Object)aP22);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), WI.d), this.q), WI.v), this.w), WI.h), ys_2.a(this.g)), WI.C), this.f).toString();
    }

    public int a(il_0 il_02, BlockPos blockPos) {
        aP2.b();
        return this.l == 0 ? this.b(il_02, blockPos) : (this.l == 1 ? this.c(il_02, blockPos) : this.r);
    }

    public void b(int n, int n2) {
        aP2.b();
        aP2 aP22 = this.b(n);
        AM.a(aP22, n2);
        this.a(new aP2(n, n2));
    }

    private int d(String string) {
        aP2.b();
        if (string == null) {
            return 0;
        }
        if (string.equals(WI.j)) {
            return 0;
        }
        if (string.equals(WI.o)) {
            return 1;
        }
        if (string.equals(WI.L)) {
            return 2;
        }
        ab4_0.b(aL0.a(aL0.a(new StringBuilder(), WI.k), string).toString());
        return -1;
    }

    public int d() {
        aP2.b();
        if (this.l == 2) {
            return this.r;
        }
        int n = a5_0.a(axn_1.B, this.e.length);
        return this.e[n];
    }

    private int c(il_0 il_02, BlockPos blockPos) {
        aP2.b();
        int n = il_02.s;
        int n2 = amv_2.h(blockPos) - this.y;
        if (this.d > 0) {
            int n3 = amv_2.j(blockPos) << 16 + amv_2.i(blockPos);
            int n4 = ys_2.a(n3);
            int n5 = this.d * 2 + 1;
            int n6 = (n4 & 0xFF) % n5 - this.d;
            n2 += n6;
        }
        return this.a(n, n2);
    }

    public boolean a(String string) {
        aP2.b();
        if (this.g == null) {
            this.g = this.g();
            if (this.g == null) {
                ab4_0.b(aL0.a(aL0.a(new StringBuilder(), WI.K), string).toString());
                return false;
            }
        }
        return true;
    }

    private aP2[] g() {
        aP2.b();
        Block block = BlocksInvoker.a(this.w);
        return new aP2[]{new aP2(BlocksInvoker.v(block))};
    }

    private static String a(String string, String string2) {
        String string3;
        aP2.b();
        string = aH3.a(string, string2);
        if (!(StringInvoker.e(string, string2) || StringInvoker.e(string, WI.I) || StringInvoker.e(string, WI.m))) {
            string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string2), WI.c), string).toString();
        }
        if (StringInvoker.c(string, WI.l)) {
            string = StringInvoker.b(string, 0, StringInvoker.c(string) - 4);
        }
        if (StringInvoker.e(string, string3 = WI.F)) {
            string = StringInvoker.a(string, StringInvoker.c(string3));
        }
        if (StringInvoker.e(string, WI.J)) {
            string = StringInvoker.a(string, 1);
        }
        return string;
    }

    @Override
    public boolean a() {
        aP2.b();
        return this.l == 2;
    }

    private static void c(String string) {
        tf_0.h(aL0.a(aL0.a(new StringBuilder(), WI.r), string).toString());
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[9];
        int n = 0;
        String string = "jso+\u0005kh~*A\u0006~ns=Fy\u0005nnj W\u0007{`h&Ip1\ttWg=L}>nd\u0006knt\"Dh";
        int n2 = "jso+\u0005kh~*A\u0006~ns=Fy\u0005nnj W\u0007{`h&Ip1\ttWg=L}>nd\u0006knt\"Dh".length();
        int n3 = 4;
        int n4 = -1;
        while (true) {
            int n5 = 42;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "7\r#j\u0015:g\u0006,.*o\r,";
                            n2 = "7\r#j\u0015:g\u0006,.*o\r,".length();
                            n3 = 7;
                            n4 = -1;
                            n5 = 105;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x27));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    private static void b(String string) {
        tf_0.e(aL0.a(aL0.a(new StringBuilder(), WI.z), string).toString());
    }

    private void b() {
        BufferedImage bufferedImage;
        String string;
        block9: {
            InputStream inputStream;
            block8: {
                aP2.b();
                this.e = null;
                if (this.f == null) {
                    return;
                }
                string = aL0.a(aL0.a(new StringBuilder(), this.f), WI.e).toString();
                ResourceLocation resourceLocation = new ResourceLocation(string);
                inputStream = ys_2.b(resourceLocation);
                if (inputStream != null) break block8;
                return;
            }
            bufferedImage = aiv_2.a(inputStream);
            if (bufferedImage != null) break block9;
            return;
        }
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        boolean bl = this.z < 0 || this.z == n;
        boolean bl2 = this.h < 0 || this.h == n2;
        this.z = n;
        this.h = n2;
        if (this.z <= 0 || this.h <= 0) {
            ab4_0.b(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), WI.N), n), WI.q), n2), WI.E), string).toString());
            return;
        }
        this.e = new int[n * n2];
        try {
            jj_0.a(bufferedImage, 0, 0, n, n2, this.e, 0, n);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    public int c() {
        return this.h;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String a(String string, String string2, String string3) {
        aP2.b();
        if (string != null) {
            String string4 = WI.y;
            if (StringInvoker.c(string, string4)) {
                string = StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(string4));
            }
            string = ab4_0.a(string, string3);
            return string;
        }
        String string5 = string2;
        int n = StringInvoker.c(string2, 47);
        if (n >= 0) {
            string5 = StringInvoker.a(string2, n + 1);
        }
        int n2 = StringInvoker.c(string5, 46);
        string5 = StringInvoker.b(string5, 0, n2);
        string5 = ab4_0.a(string5, string3);
        return string5;
    }

    public int[] h() {
        Object object;
        aP2.b();
        if (this.g == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int n = 0;
        if (n < this.g.length) {
            object = this.g[n];
            if (AM.b((aP2)object) >= 0) {
                aS0.b(hashSet, P8.d(AM.b((aP2)object)));
            }
            ++n;
        }
        Integer[] integerArray = (Integer[])aS0.a(hashSet, new Integer[aS0.d(hashSet)]);
        object = new int[integerArray.length];
        int n2 = 0;
        if (n2 < integerArray.length) {
            object[n2] = P8.b(integerArray[n2]);
            ++n2;
        }
        return object;
    }

    private static float[][] a(int[] nArray) {
        aP2.b();
        float[][] fArray = new float[nArray.length][3];
        int n = 0;
        if (n < nArray.length) {
            int n2 = nArray[n];
            float f = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n2 & 0xFF) / 255.0f;
            float[] fArray2 = fArray[n];
            fArray2[0] = f;
            fArray2[1] = f2;
            fArray2[2] = f3;
            ++n;
        }
        return fArray;
    }
}

