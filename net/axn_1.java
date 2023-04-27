/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 *  org.apache.commons.lang3.tuple.Pair
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.Vec3;
import net.minecraft.multiplayer.WorldClient;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/*
 * Renamed from net.axN
 */
public class axn_1 {
    private static ab4_0 x;
    private static int v;
    private static ab4_0 G;
    private static IBlockState Q;
    private static int[] t;
    private static ab4_0[] b;
    private static asr_0 R;
    private static ab4_0 r;
    private static ab4_0[] V;
    private static ab4_0 j;
    private static ab4_0 m;
    private static int[] i;
    private static int D;
    private static ab4_0 s;
    private static ab4_0 U;
    private static int h;
    private static int[] d;
    private static ab4_0 T;
    private static int[] W;
    private static int N;
    private static asr_0 o;
    private static IBlockState S;
    private static ab4_0 P;
    private static String I;
    private static ab4_0 O;
    private static aqz_0 u;
    private static int e;
    private static asr_0 y;
    private static ab4_0 a;
    private static boolean C;
    private static Vec3 L;
    private static aqz_0 z;
    private static aqz_0 n;
    public static Random B;
    private static aqz_0 A;
    private static float[][] X;
    private static int g;
    private static Vec3 w;
    private static ab4_0 l;
    private static ab4_0 q;
    private static float[][] p;
    private static aqz_0 k;
    private static int F;
    private static float[][] E;
    private static ab4_0 H;
    private static int f;
    private static float[][] J;
    private static Vec3 Y;
    private static ab4_0 M;
    private static int[] K;
    private static ab4_0[][] c;

    public static Vec3 a(IBlockAccess iBlockAccess, double d, double d2, double d3) {
        aP2.b();
        if (m == null) {
            return null;
        }
        int n = ar9_0.a(m, iBlockAccess, d, d2, d3, 3);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        Vec3 vec3 = a0p_0.a(y, f, f2, f3);
        return vec3;
    }

    private static void d(String string) {
        tf_0.h(aL0.a(aL0.a(new StringBuilder(), alb_1.a3), string).toString());
    }

    public static void a(mi_1 mi_12, IBlockAccess iBlockAccess, double d, double d2, double d3) {
        if (x != null) {
            IBlockState iBlockState = aG3.c(iBlockAccess, new BlockPos(d, d2, d3));
            int n = axn_1.a(iBlockState, 15);
            int n2 = ar9_0.a(x, n);
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            float f = (float)n3 / 255.0f;
            float f2 = (float)n4 / 255.0f;
            float f3 = (float)n5 / 255.0f;
            lz_2.a(mi_12, f, f2, f3);
        }
    }

    private static int[] f() {
        aP2.b();
        MapColor[] mapColorArray = MapColor.u;
        int[] nArray = new int[mapColorArray.length];
        a7r_0.a(nArray, -1);
        int n = 0;
        if (n < mapColorArray.length && n < nArray.length) {
            MapColor mapColor = mapColorArray[n];
            nArray[n] = mapColor.g;
            ++n;
        }
        return nArray;
    }

    public static Vec3 b(Vec3 vec3, IBlockAccess iBlockAccess, double d, double d2, double d3) {
        aP2.b();
        if (T == null) {
            return vec3;
        }
        int n = ar9_0.a(T, iBlockAccess, d, d2, d3, 3);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)vec3.xCoord / 0.5f;
        float f5 = (float)vec3.yCoord / 0.66275f;
        float f6 = (float)vec3.zCoord;
        Vec3 vec32 = a0p_0.a(o, f *= f4, f2 *= f5, f3 *= f6);
        return vec32;
    }

    private static void a(ab4_0 ab4_02, List list, int n) {
        ArrayList arrayList;
        aP2.b();
        if (n >= ListInvoker.size(list)) {
            ListInvoker.add(list, null);
        }
        if ((arrayList = (ArrayList)ListInvoker.get(list, n)) == null) {
            arrayList = new ArrayList();
            ListInvoker.set(list, n, arrayList);
        }
        ListInvoker.add(arrayList, ab4_02);
    }

    private static String a(String string, String string2, String[] stringArray, String string3) {
        aP2.b();
        try {
            ResourceLocation resourceLocation = new ResourceLocation(string);
            ys_2.b(resourceLocation);
            return string3;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return string3;
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            return string3;
        }
    }

    private static int a(lt_0 lt_02, ItemStack itemStack, int n, int n2) {
        aP2.b();
        act_2.c(itemStack);
        return n2;
    }

    protected static il_0 a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        aP2.b();
        il_0 il_02 = aG3.d(iBlockAccess, blockPos);
        if (il_02 == il_0.aw && !ys_2.J()) {
            il_02 = il_0.G;
        }
        return il_02;
    }

    private static void a(ab4_0 ab4_02, List list) {
        int n;
        aP2.b();
        int[] nArray = ar9_0.c(ab4_02);
        if (nArray != null && nArray.length > 0 && (n = 0) < nArray.length) {
            int n2 = nArray[n];
            axn_1.e(aL0.c(aL0.a(new StringBuilder(), alb_1.c), n2).toString());
            axn_1.a(ab4_02, list, n2);
            ++n;
        }
        axn_1.e(aL0.a(aL0.a(new StringBuilder(), alb_1.bm), ys_2.a(nArray)).toString());
    }

    private static int a(Properties properties, String[] stringArray) {
        aP2.b();
        int n = 0;
        if (n < stringArray.length) {
            String string = stringArray[n];
            int n2 = axn_1.c(properties, string);
            if (n2 >= 0) {
                return n2;
            }
            ++n;
        }
        return -1;
    }

    static ab4_0 d() {
        return P;
    }

    private static int a(IBlockState iBlockState, int n) {
        aP2.b();
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (!(block instanceof gs_1)) {
            return n;
        }
        Comparable comparable = BlockStateInvoker.b(iBlockState, gs_1.U);
        if (!(comparable instanceof Integer)) {
            return n;
        }
        Integer n2 = (Integer)comparable;
        return P8.b(n2);
    }

    private static void a(String string) {
        aP2.b();
        try {
            ResourceLocation resourceLocation = new ResourceLocation(string);
            ys_2.b(resourceLocation);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            return;
        }
    }

    public static void b(mi_1 mi_12, IBlockAccess iBlockAccess, double d, double d2, double d3) {
        aP2.b();
        if (G != null || c != null) {
            BlockPos blockPos = new BlockPos(d, d2, d3);
            atV atV2 = en_0.a(iBlockAccess, S, blockPos);
            int n = axn_1.a(iBlockAccess, S, blockPos, atV2);
            int n2 = n >> 16 & 0xFF;
            int n3 = n >> 8 & 0xFF;
            int n4 = n & 0xFF;
            float f = (float)n2 / 255.0f;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            if (e >= 0) {
                int n5 = e >> 16 & 0xFF;
                int n6 = e >> 8 & 0xFF;
                int n7 = e & 0xFF;
                f *= (float)n5 / 255.0f;
                f2 *= (float)n6 / 255.0f;
                f3 *= (float)n7 / 255.0f;
            }
            lz_2.a(mi_12, f, f2, f3);
        }
    }

    private static int[] a(Properties properties, String string, String string2, String string3) {
        aP2.b();
        int[] nArray = new int[MapColor.u.length];
        a7r_0.a(nArray, -1);
        int n = 0;
        Iterator iterator = aS0.f(dk_1.c(properties));
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            String string4 = dk_1.a(properties, (String)object);
            if (StringInvoker.e((String)object, string2)) {
                String string5 = MZ.a((String)object, string2);
                int n2 = axn_1.b(string5);
                int n3 = axn_1.c(string4);
                if (n2 >= 0 && n2 < nArray.length && n3 >= 0) {
                    nArray[n2] = n3;
                    ++n;
                }
                axn_1.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.bj), object), alb_1.aK), string4).toString());
            }
        }
        return null;
    }

    private static int[] d(Properties properties, String string, String string2, String string3) {
        aP2.b();
        int[] nArray = new int[32];
        a7r_0.a(nArray, -1);
        int n = 0;
        Iterator iterator = aS0.f(dk_1.c(properties));
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            String string4 = dk_1.a(properties, (String)object);
            if (StringInvoker.e((String)object, string2)) {
                String string5 = MZ.a((String)object, string2);
                int n2 = ys_2.a(string5, -1);
                int n3 = axn_1.c(string4);
                if (n2 >= 0 && n2 < nArray.length && n3 >= 0) {
                    nArray[n2] = n3;
                    ++n;
                }
                axn_1.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.aq), object), alb_1.aL), string4).toString());
            }
        }
        return null;
    }

    public static int a(int n, int n2) {
        aP2.b();
        if (t == null) {
            return n2;
        }
        if (n >= 0 && n < t.length) {
            int n3 = t[n];
            return n3 < 0 ? n2 : n3;
        }
        return n2;
    }

    private static Vec3 b(Vec3 vec3) {
        aP2.b();
        return w == null ? vec3 : w;
    }

    private static float[][] e(Properties properties, String string, String string2, String string3) {
        aP2.b();
        YZ[] yZArray = YZ.values();
        HashMap hashMap = new HashMap();
        int n = 0;
        if (n < yZArray.length) {
            YZ yZ = yZArray[n];
            MapInvoker.c(hashMap, my_2.d(yZ), yZ);
            ++n;
        }
        float[][] fArrayArray = new float[yZArray.length][];
        int n2 = 0;
        Iterator iterator = aS0.f(dk_1.c(properties));
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            String string4 = dk_1.a(properties, (String)object);
            if (StringInvoker.e((String)object, string2)) {
                String string5 = MZ.a((String)object, string2);
                if (string5.equals(alb_1.bk)) {
                    string5 = alb_1.M;
                }
                YZ yZ = (YZ)MapInvoker.c(hashMap, string5);
                int n3 = axn_1.c(string4);
                if (n3 >= 0) {
                    float[] fArray = new float[]{(float)(n3 >> 16 & 0xFF) / 255.0f, (float)(n3 >> 8 & 0xFF) / 255.0f, (float)(n3 & 0xFF) / 255.0f};
                    fArrayArray[yZ.ordinal()] = fArray;
                    ++n2;
                }
                axn_1.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.ao), object), alb_1.N), string4).toString());
            }
        }
        return null;
    }

    private static int c(Properties properties, String string) {
        aP2.b();
        String string2 = dk_1.a(properties, string);
        if (string2 == null) {
            return -1;
        }
        int n = axn_1.c(string2 = StringInvoker.h(string2));
        if (n < 0) {
            axn_1.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.aM), string), alb_1.A), string2).toString());
            return n;
        }
        axn_1.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), alb_1.aj), string2).toString());
        return n;
    }

    private static int b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        aP2.b();
        return h < 0 ? BlocksInvoker.d(Blocks.an, iBlockAccess, blockPos) : h;
    }

    static {
        I = alb_1.bF;
        G = null;
        H = null;
        P = null;
        M = null;
        l = null;
        V = null;
        c = null;
        T = null;
        o = new asr_0();
        r = null;
        R = new asr_0();
        m = null;
        y = new asr_0();
        b = null;
        f = 0;
        E = new float[16][3];
        J = new float[16][3];
        x = null;
        U = null;
        g = -1;
        q = null;
        s = null;
        O = null;
        j = null;
        a = null;
        C = true;
        e = -1;
        v = -1;
        h = -1;
        D = -1;
        F = -1;
        N = -1;
        w = null;
        Y = null;
        L = null;
        i = null;
        d = null;
        X = null;
        p = null;
        W = null;
        K = null;
        t = null;
        Q = BlocksInvoker.t(Blocks.dirt);
        S = aBF.a(Blocks.water);
        B = new Random();
        k = new YU();
        z = new au4();
        u = new aeg_1();
        A = new MS();
        n = new a5Z();
    }

    private static ab4_0[] b(Properties properties, String string) {
        int n;
        String string2;
        ArrayList arrayList = new ArrayList();
        String string3 = alb_1.bH;
        HashMap hashMap = new HashMap();
        aP2.b();
        String[] stringArray = aS0.f(dk_1.c(properties));
        if (dz_0.c((Iterator)stringArray)) {
            Object object = dz_0.b((Iterator)stringArray);
            string2 = dk_1.a(properties, (String)object);
            if (StringInvoker.e((String)object, string3)) {
                MapInvoker.c(hashMap, object, string2);
            }
        }
        if ((n = 0) < (stringArray = (String[])aS0.a(MapInvoker.c(hashMap), new String[MapInvoker.a(hashMap)])).length) {
            string2 = stringArray[n];
            String string4 = dk_1.a(properties, string2);
            axn_1.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.ba), string2), alb_1.a), string4).toString());
            String string5 = StringInvoker.a(string2, StringInvoker.c(string3));
            String string6 = aH3.a(string);
            string5 = aH3.a(string5, string6);
            ab4_0 ab4_02 = axn_1.a(string5, 256, 256);
            axn_1.e(aL0.a(aL0.a(new StringBuilder(), alb_1.br), string5).toString());
            kn_0 kn_02 = new kn_0(alb_1.aw);
            aP2[] aP2Array = aNT.c(kn_02, string4);
            if (aP2Array != null && aP2Array.length > 0) {
                int n2 = 0;
                if (n2 < aP2Array.length) {
                    aP2 aP22 = aP2Array[n2];
                    ar9_0.a(ab4_02, aP22);
                    ++n2;
                }
                ListInvoker.add(arrayList, ab4_02);
            }
            axn_1.e(aL0.a(aL0.a(new StringBuilder(), alb_1.bv), string4).toString());
            ++n;
        }
        if (ListInvoker.size(arrayList) <= 0) {
            return null;
        }
        ab4_0[] ab4_0Array = (ab4_0[])ListInvoker.toArray(arrayList, new ab4_0[ListInvoker.size(arrayList)]);
        return ab4_0Array;
    }

    private static Vec3 c(Vec3 vec3) {
        aP2.b();
        return Y == null ? vec3 : Y;
    }

    public static Vec3 a(Vec3 vec3, World world, Entity entity, float f) {
        aP2.b();
        int n = qq_2.j(world.d);
        switch (n) {
            case 0: {
                Minecraft minecraft = MCInvoker.f();
                vec3 = axn_1.b(vec3, (IBlockAccess)minecraft.world, entity.posX, entity.posY + 1.0, entity.posZ);
            }
            case 1: {
                vec3 = axn_1.a(vec3);
            }
        }
        return vec3;
    }

    private static int c(String string) {
        aP2.b();
        if (string == null) {
            return -1;
        }
        string = StringInvoker.h(string);
        try {
            int n = P8.a(string, 16) & 0xFFFFFF;
            return n;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    private static int a(IBlockState iBlockState) {
        if (x == null) {
            return -1;
        }
        int n = axn_1.a(iBlockState, 15);
        int n2 = ar9_0.a(x, n);
        return n2;
    }

    private static void e(String string) {
        tf_0.e(aL0.a(aL0.a(new StringBuilder(), alb_1.bh), string).toString());
    }

    private static Vec3 a(Vec3 vec3, IBlockAccess iBlockAccess, double d, double d2, double d3) {
        aP2.b();
        if (r == null) {
            return vec3;
        }
        int n = ar9_0.a(r, iBlockAccess, d, d2, d3, 3);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        float f4 = (float)vec3.xCoord / 0.753f;
        float f5 = (float)vec3.yCoord / 0.8471f;
        float f6 = (float)vec3.zCoord;
        Vec3 vec32 = a0p_0.a(R, f *= f4, f2 *= f5, f3 *= f6);
        return vec32;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(String string, int n) {
        int n2;
        BufferedImage bufferedImage;
        block5: {
            InputStream inputStream;
            block4: {
                aP2.b();
                try {
                    inputStream = ys_2.b(new ResourceLocation(string));
                    if (inputStream != null) break block4;
                    return n;
                }
                catch (IOException iOException) {
                    return n;
                }
            }
            bufferedImage = aI8.a(inputStream);
            aZ6.b(inputStream);
            if (bufferedImage != null) break block5;
            n2 = n;
            return n2;
        }
        n2 = jj_0.d(bufferedImage);
        return n2;
    }

    public static void g() {
        aP2.b();
        I = alb_1.bl;
        G = null;
        P = null;
        H = null;
        l = null;
        M = null;
        T = null;
        r = null;
        m = null;
        x = null;
        U = null;
        g = -1;
        q = null;
        s = null;
        a = null;
        b = null;
        e = -1;
        v = -1;
        h = -1;
        D = -1;
        F = -1;
        N = -1;
        w = null;
        Y = null;
        L = null;
        V = null;
        c = null;
        C = true;
        i = null;
        d = null;
        X = null;
        p = null;
        W = null;
        axn_1.a(K);
        t = null;
        a39.a();
        I = axn_1.a(alb_1.aT, alb_1.bx, ab4_0.k, alb_1.h);
        String string = alb_1.a0;
        String[] stringArray = new String[]{alb_1.f, alb_1.bG};
        G = axn_1.a(string, stringArray, 256, 256);
        axn_1.h();
        if (ys_2.aF()) {
            String[] stringArray2 = new String[]{alb_1.t, alb_1.a4};
            H = axn_1.a(string, stringArray2, 256, 256);
            String[] stringArray3 = new String[]{alb_1.U, alb_1.H};
            P = axn_1.a(string, stringArray3, 256, 256);
            String[] stringArray4 = new String[]{alb_1.aE, alb_1.be};
            l = axn_1.a(string, stringArray4, 256, 256);
            String[] stringArray5 = new String[]{alb_1.k, alb_1.l};
            M = axn_1.a(string, stringArray5, 256, 256);
            String[] stringArray6 = new String[]{alb_1.aU, alb_1.aB};
            T = axn_1.a(string, stringArray6, 256, 256);
            String[] stringArray7 = new String[]{alb_1.bD, alb_1.ai};
            r = axn_1.a(string, stringArray7, 256, 256);
            String[] stringArray8 = new String[]{alb_1.bc, alb_1.au};
            m = axn_1.a(string, stringArray8, 256, 256);
            String[] stringArray9 = new String[]{alb_1.a1, alb_1.aG};
            x = axn_1.a(string, stringArray9, 16, 1);
            U = axn_1.a(aL0.a(aL0.a(new StringBuilder(), string), alb_1.bM).toString(), -1, -1);
            q = axn_1.a(aL0.a(aL0.a(new StringBuilder(), string), alb_1.P).toString(), -1, -1);
            String[] stringArray10 = new String[]{alb_1.ar, alb_1.bA};
            s = axn_1.a(string, stringArray10, 8, 1);
            j = axn_1.a(aL0.a(aL0.a(new StringBuilder(), string), alb_1.aX).toString(), 8, 1);
            O = axn_1.a(aL0.a(aL0.a(new StringBuilder(), string), alb_1.bd).toString(), 8, 1);
            String[] stringArray11 = new String[]{alb_1.W, alb_1.o};
            a = axn_1.a(string, stringArray11, -1, -1);
            Pair<ab4_0[], Integer> pair = axn_1.i();
            b = (ab4_0[])aoi_0.b(pair);
            f = P8.b((Integer)aoi_0.a(pair));
            axn_1.a(alb_1.I);
            c = axn_1.a(new String[]{aL0.a(aL0.a(new StringBuilder(), string), alb_1.aO).toString(), aL0.a(aL0.a(new StringBuilder(), string), alb_1.a7).toString()}, V, 256, 256);
            axn_1.h();
        }
    }

    private static int a(IBlockAccess iBlockAccess, BlockPos blockPos, aqz_0 aqz_02, zw_1 zw_12) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = amv_2.j(blockPos);
        int n7 = amv_2.h(blockPos);
        aP2.b();
        int n8 = amv_2.i(blockPos);
        zw_1 zw_13 = zw_12;
        int n9 = n6 - 1;
        if (n9 <= n6 + 1) {
            n2 = n8 - 1;
            if (n2 <= n8 + 1) {
                aut_1.a(zw_13, n9, n7, n2);
                n = net.W.a(aqz_02, iBlockAccess, zw_13);
                n3 += n >> 16 & 0xFF;
                n4 += n >> 8 & 0xFF;
                n5 += n & 0xFF;
                ++n2;
            }
            ++n9;
        }
        n9 = n3 / 9;
        n2 = n4 / 9;
        n = n5 / 9;
        return n9 << 16 | n2 << 8 | n;
    }

    public static float[] a(YZ yZ, float[] fArray) {
        return axn_1.a(yZ, p, fArray);
    }

    public static int b(int n) {
        aP2.b();
        return F < 0 ? n : F;
    }

    public static void a(mi_1 mi_12) {
        aP2.b();
        if (v >= 0) {
            int n = v;
            int n2 = n >> 16 & 0xFF;
            int n3 = n >> 8 & 0xFF;
            int n4 = n & 0xFF;
            float f = (float)n2 / 255.0f;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            lz_2.a(mi_12, f, f2, f3);
        }
    }

    public static void h() {
        aP2.b();
        C = P == null && H == null && l == null && M == null && ys_2.J() && ys_2.aV();
    }

    static ab4_0 c() {
        return H;
    }

    private static ab4_0 b(IBlockState iBlockState) {
        aP2.b();
        if (c == null) {
            return null;
        }
        if (!(iBlockState instanceof afn_0)) {
            return null;
        }
        afn_0 afn_02 = (afn_0)iBlockState;
        int n = aqc_1.c(afn_02);
        if (n >= 0 && n < c.length) {
            ab4_0[] cfr_ignored_0 = c[n];
            return null;
        }
        return null;
    }

    public static int a(int n) {
        aP2.b();
        return N < 0 ? n : N;
    }

    static ab4_0 b() {
        return M;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ab4_0 a(String string, int n, int n2) {
        Object object;
        Object object2;
        String string2;
        Properties properties;
        aP2.b();
        try {
            ResourceLocation resourceLocation = new ResourceLocation(string);
            if (!ys_2.d(resourceLocation)) {
                return null;
            }
        }
        catch (Exception exception) {
            ch_2.a(exception);
            return null;
        }
        {
            axn_1.d(aL0.a(aL0.a(new StringBuilder(), alb_1.L), string).toString());
            properties = new Properties();
            string2 = MZ.b(string, alb_1.b, alb_1.an);
            ResourceLocation resourceLocation = new ResourceLocation(string2);
            if (ys_2.d(resourceLocation)) {
                object2 = ys_2.b(resourceLocation);
                dk_1.a(properties, (InputStream)object2);
                aZ6.b((InputStream)object2);
                axn_1.d(aL0.a(aL0.a(new StringBuilder(), alb_1.i), string2).toString());
            }
            dk_1.a(properties, (Object)alb_1.aN, (Object)I);
            dk_1.a(properties, (Object)alb_1.ae, (Object)string);
        }
        string2 = string;
        {
            object2 = new ab4_0(properties, string2, n, n2, I);
            if (!ar9_0.a((ab4_0)object2, string2)) {
                return null;
            }
            object = object2;
        }
        return object;
    }

    private static int[] b(Properties properties, String string, String string2, String string3) {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        Set set = dk_1.c(properties);
        int n = 0;
        Iterator iterator = aS0.f(set);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            String string4 = dk_1.a(properties, (String)object);
            if (StringInvoker.e((String)object, string2)) {
                String string5 = MZ.a((String)object, string2);
                int n2 = axn_1.f(string5);
                int n3 = axn_1.c(string4);
                if (n2 >= 0 && n3 >= 0) {
                    if (ListInvoker.size(arrayList) <= n2) {
                        ListInvoker.add(arrayList, P8.d(-1));
                    }
                    ListInvoker.set(arrayList, n2, P8.d(n3));
                    ++n;
                }
                axn_1.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.aA), object), alb_1.ab), string4).toString());
            }
        }
        return null;
    }

    private static int b(String string) {
        aP2.b();
        return string == null ? -1 : (string.equals(alb_1.ag) ? MapColor.q.p : (string.equals(alb_1.aQ) ? MapColor.r.p : (string.equals(alb_1.m) ? MapColor.z.p : (string.equals(alb_1.ak) ? MapColor.M.p : (string.equals(alb_1.e) ? MapColor.G.p : (string.equals(alb_1.O) ? MapColor.C.p : (string.equals(alb_1.w) ? MapColor.m.p : (string.equals(alb_1.ap) ? MapColor.B.p : (string.equals(alb_1.K) ? MapColor.y.p : (string.equals(alb_1.aH) ? MapColor.d.p : (string.equals(alb_1.aC) ? MapColor.e.p : (string.equals(alb_1.bC) ? MapColor.b.p : (string.equals(alb_1.D) ? MapColor.t.p : (string.equals(alb_1.E) ? MapColor.E.p : (string.equals(alb_1.p) ? MapColor.n.p : (string.equals(alb_1.bu) ? MapColor.v.p : (string.equals(alb_1.F) ? MapColor.D.p : (string.equals(alb_1.C) ? MapColor.l.p : (string.equals(alb_1.al) ? MapColor.A.p : (string.equals(alb_1.bg) ? MapColor.w.p : (!string.equals(alb_1.B) && !string.equals(alb_1.T) ? (!string.equals(alb_1.aV) && !string.equals(alb_1.j) ? (string.equals(alb_1.as) ? MapColor.j.p : (!string.equals(alb_1.a9) && !string.equals(alb_1.u) ? (string.equals(alb_1.bq) ? MapColor.c.p : (string.equals(alb_1.az) ? MapColor.F.p : (string.equals(alb_1.S) ? MapColor.s.p : (string.equals(alb_1.aF) ? MapColor.L.p : (string.equals(alb_1.bE) ? MapColor.H.p : (string.equals(alb_1.aZ) ? MapColor.K.p : (string.equals(alb_1.aY) ? MapColor.k.p : (string.equals(alb_1.bb) ? MapColor.I.p : (string.equals(alb_1.bt) ? MapColor.a.p : (string.equals(alb_1.a6) ? MapColor.N.p : (string.equals(alb_1.bi) ? MapColor.h.p : (string.equals(alb_1.bo) ? MapColor.o.p : -1)))))))))))) : MapColor.i.p)) : MapColor.J.p) : MapColor.x.p)))))))))))))))))))));
    }

    public static void b(mi_1 mi_12) {
        aP2.b();
        if (a != null) {
            int n = ar9_0.g(a);
            int n2 = n >> 16 & 0xFF;
            int n3 = n >> 8 & 0xFF;
            int n4 = n & 0xFF;
            float f = (float)n2 / 255.0f;
            float f2 = (float)n3 / 255.0f;
            float f3 = (float)n4 / 255.0f;
            lz_2.a(mi_12, f, f2, f3);
        }
    }

    private static int g(String string) {
        aP2.b();
        if (string.equals(alb_1.r)) {
            return 0;
        }
        int n = 0;
        Potion[] potionArray = Potion.potionTypes;
        if (n < potionArray.length) {
            Potion potion = potionArray[n];
            if (ari_0.d(potion).equals(string)) {
                return ari_0.f(potion);
            }
            ++n;
        }
        return -1;
    }

    public static int d(int n) {
        aP2.b();
        return D < 0 ? n : D;
    }

    public static int b(int n, int n2) {
        aP2.b();
        if (W == null) {
            return n2;
        }
        if (n >= 0 && n < W.length) {
            int n3 = W[n];
            return n3 < 0 ? n2 : n3;
        }
        return n2;
    }

    public static int a(a9Z a9Z2, Block block, IBlockAccess iBlockAccess, BlockPos blockPos, atV atV2) {
        aqz_0 aqz_02;
        block24: {
            block22: {
                int n;
                block23: {
                    aP2.b();
                    if (c != null) {
                        IBlockState iBlockState = en_0.c(atV2);
                        if (!aX3.b(a9Z2)) {
                            if (block == Blocks.grass) {
                                iBlockState = Q;
                            }
                            if (block == Blocks.af) {
                                return -1;
                            }
                        }
                        if (block == Blocks.ai && en_0.d(atV2) >= 8) {
                            blockPos = amv_2.g(blockPos);
                            iBlockState = aG3.c(iBlockAccess, blockPos);
                        }
                        ab4_0 ab4_02 = axn_1.b(iBlockState);
                        if (ys_2.aV() && !ar9_0.e(ab4_02)) {
                            return axn_1.a(iBlockAccess, blockPos, ab4_02, en_0.a(atV2));
                        }
                        return ar9_0.a(ab4_02, iBlockAccess, blockPos);
                    }
                    if (!aX3.b(a9Z2)) {
                        return -1;
                    }
                    if (block == Blocks.an) {
                        return axn_1.b(iBlockAccess, blockPos);
                    }
                    if (block == Blocks.af) {
                        return axn_1.a(en_0.c(atV2));
                    }
                    if (block instanceof fh_1) {
                        return axn_1.a(block, iBlockAccess, blockPos, atV2);
                    }
                    if (C) {
                        return -1;
                    }
                    n = en_0.d(atV2);
                    if (block == Blocks.grass || block == Blocks.bN || block == Blocks.ai) break block22;
                    if (block != Blocks.ai) break block23;
                    aqz_02 = k;
                    if (n < 8) break block24;
                    blockPos = amv_2.g(blockPos);
                }
                if (block == Blocks.bP) {
                    switch (n & 3) {
                        case 0: {
                            aqz_02 = z;
                        }
                        case 1: {
                            aqz_02 = u;
                        }
                        case 2: {
                            aqz_02 = A;
                        }
                    }
                    aqz_02 = z;
                }
                if (block == Blocks.bM) {
                    aqz_02 = z;
                }
                if (block != Blocks.as) {
                    return -1;
                }
                aqz_02 = z;
            }
            aqz_02 = k;
        }
        return ys_2.aV() && !net.W.a(aqz_02) ? axn_1.a(iBlockAccess, blockPos, aqz_02, en_0.a(atV2)) : net.W.a(aqz_02, iBlockAccess, blockPos);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static boolean a(World world, float f, int[] nArray, boolean bl) {
        aP2.b();
        return false;
    }

    public static float[] b(YZ yZ, float[] fArray) {
        return axn_1.a(yZ, X, fArray);
    }

    private static Pair<ab4_0[], Integer> i() {
        int n;
        Integer[] integerArray;
        String string = alb_1.bK;
        aP2.b();
        String string2 = alb_1.a2;
        String[] stringArray = amc_0.a(string, string2);
        HashMap hashMap = new HashMap();
        int n2 = 0;
        if (n2 < stringArray.length) {
            integerArray = stringArray[n2];
            String string3 = MZ.c((String)integerArray, string, string2);
            n = ys_2.a(string3, Integer.MIN_VALUE);
            if (n == Integer.MIN_VALUE) {
                axn_1.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.z), string3), alb_1.s), (String)integerArray).toString());
            }
            MapInvoker.c(hashMap, P8.d(n), integerArray);
            ++n2;
        }
        Set set = MapInvoker.c(hashMap);
        integerArray = (Integer[])aS0.a(set, new Integer[aS0.d(set)]);
        a7r_0.d(integerArray);
        if (integerArray.length <= 0) {
            return new ImmutablePair(null, (Object)P8.d(0));
        }
        int n3 = P8.b(integerArray[0]);
        n = P8.b(integerArray[integerArray.length - 1]);
        int n4 = n - n3 + 1;
        ab4_0[] ab4_0Array = new ab4_0[n4];
        int n5 = 0;
        if (n5 < integerArray.length) {
            Integer n6 = integerArray[n5];
            String string4 = (String)MapInvoker.c(hashMap, n6);
            ab4_0 ab4_02 = axn_1.a(string4, -1, -1);
            if (ar9_0.a(ab4_02) < 16) {
                axn_1.e(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), alb_1.by), ar9_0.a(ab4_02)), alb_1.bw), string4).toString());
            }
            int n7 = P8.b(n6) - n3;
            ab4_0Array[n7] = ab4_02;
            ++n5;
        }
        return new ImmutablePair((Object)ab4_0Array, (Object)P8.d(n3));
    }

    private static void a(float[][] fArray, float f, int n, int n2, float[][] fArray2) {
        int n3 = (int)MathInvoker.n(f);
        aP2.b();
        int n4 = (int)MathInvoker.j(f);
        if (n3 == n4) {
            int n5 = 0;
            float[] fArray3 = fArray[n + n5 * n2 + n3];
            float[] fArray4 = fArray2[n5];
            int n6 = 0;
            fArray4[n6] = fArray3[n6];
            ++n6;
            ++n5;
        }
        float f2 = 1.0f - (f - (float)n3);
        float f3 = 1.0f - ((float)n4 - f);
        int n7 = 0;
        float[] fArray5 = fArray[n + n7 * n2 + n3];
        float[] fArray6 = fArray[n + n7 * n2 + n4];
        float[] fArray7 = fArray2[n7];
        int n8 = 0;
        fArray7[n8] = fArray5[n8] * f2 + fArray6[n8] * f3;
        ++n8;
        ++n7;
    }

    private static float[] a(YZ yZ, float[][] fArray, float[] fArray2) {
        aP2.b();
        return fArray2;
    }

    private static Vec3 a(Vec3 vec3) {
        aP2.b();
        return L == null ? vec3 : L;
    }

    private static int a(Block block, IBlockAccess iBlockAccess, BlockPos blockPos, atV atV2) {
        aP2.b();
        ab4_0 ab4_02 = s;
        if (block == Blocks.aL && j != null) {
            ab4_02 = j;
        }
        if (block == Blocks.b9 && O != null) {
            ab4_02 = O;
        }
        if (ab4_02 == null) {
            return -1;
        }
        int n = en_0.d(atV2);
        return ar9_0.a(ab4_02, n);
    }

    private static void a(int[] nArray) {
        aP2.b();
        MapColor[] mapColorArray = MapColor.u;
        boolean bl = false;
        int n = 0;
        if (n < mapColorArray.length && n < nArray.length) {
            MapColor mapColor = mapColorArray[n];
            int n2 = nArray[n];
            if (mapColor.g != n2) {
                mapColor.g = n2;
                bl = true;
            }
            ++n;
        }
    }

    public static int a(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, atV atV2) {
        aP2.b();
        Block block = BlockStateInvoker.getBlock(iBlockState);
        aqz_0 aqz_02 = axn_1.b(iBlockState);
        if (aqz_02 == null && BlocksInvoker.getBlockState(block) == Material.M) {
            aqz_02 = n;
        }
        return aqz_02 == null ? BlocksInvoker.d(block, iBlockAccess, blockPos) : (ys_2.aV() && !net.W.a(aqz_02) ? axn_1.a(iBlockAccess, blockPos, aqz_02, en_0.a(atV2)) : net.W.a(aqz_02, iBlockAccess, blockPos));
    }

    private static Vec3 a(Properties properties, String string) {
        aP2.b();
        int n = axn_1.c(properties, string);
        if (n < 0) {
            return null;
        }
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        float f = (float)n2 / 255.0f;
        float f2 = (float)n3 / 255.0f;
        float f3 = (float)n4 / 255.0f;
        return new Vec3(f, f2, f3);
    }

    private static ab4_0 a(String string, String[] stringArray, int n, int n2) {
        aP2.b();
        int n3 = 0;
        if (n3 < stringArray.length) {
            String string2 = stringArray[n3];
            string2 = aL0.a(aL0.a(new StringBuilder(), string), string2).toString();
            ab4_0 ab4_02 = axn_1.a(string2, n, n2);
            return ab4_02;
        }
        return null;
    }

    private static int f(String string) {
        aP2.b();
        if (string == null) {
            return -1;
        }
        int n = ub_1.a(string);
        if (n < 0) {
            return -1;
        }
        String string2 = ub_1.a(n);
        return !ys_2.a((Object)string, (Object)string2) ? -1 : n;
    }

    static ab4_0 a() {
        return G;
    }

    public static int a(float f) {
        if (U == null) {
            return -1;
        }
        int n = (int)MathInvoker.f((double)((MathHelper.sin(f) + 1.0f) * (float)(ar9_0.f(U) - 1)) / 2.0);
        int n2 = ar9_0.a(U, n);
        return n2;
    }

    public static Vec3 a(Vec3 vec3, WorldClient worldClient, Entity entity, float f) {
        aP2.b();
        int n = qq_2.j(worldClient.d);
        switch (n) {
            case -1: {
                vec3 = axn_1.b(vec3);
            }
            case 0: {
                Minecraft minecraft = MCInvoker.f();
                vec3 = axn_1.a(vec3, (IBlockAccess)minecraft.world, entity.posX, entity.posY + 1.0, entity.posZ);
            }
            case 1: {
                vec3 = axn_1.c(vec3);
            }
        }
        return vec3;
    }

    static ab4_0 e() {
        return l;
    }

    public static float b(float f) {
        if (g <= 0) {
            return f;
        }
        float f2 = 628.0f / (float)g;
        return f * f2;
    }

    private static ab4_0[][] a(List list) {
        aP2.b();
        ab4_0[][] ab4_0Array = new ab4_0[ListInvoker.size(list)][];
        int n = 0;
        if (n < ListInvoker.size(list)) {
            List list2 = (List)ListInvoker.get(list, n);
            ab4_0[] ab4_0Array2 = (ab4_0[])ListInvoker.toArray(list2, new ab4_0[ListInvoker.size(list2)]);
            ab4_0Array[n] = ab4_0Array2;
            ++n;
        }
        return ab4_0Array;
    }

    public static int c(int n) {
        if (q == null) {
            return -1;
        }
        int n2 = n * ar9_0.f(q) / 255;
        int n3 = ar9_0.a(q, n2);
        return n3;
    }

    private static int[] c(Properties properties, String string, String string2, String string3) {
        aP2.b();
        int[] nArray = new int[Potion.potionTypes.length];
        a7r_0.a(nArray, -1);
        int n = 0;
        Iterator iterator = aS0.f(dk_1.c(properties));
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            String string4 = dk_1.a(properties, (String)object);
            if (StringInvoker.e((String)object, string2)) {
                int n2 = axn_1.g((String)object);
                int n3 = axn_1.c(string4);
                if (n2 >= 0 && n2 < nArray.length && n3 >= 0) {
                    nArray[n2] = n3;
                    ++n;
                }
                axn_1.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), alb_1.d), object), alb_1.g), string4).toString());
            }
        }
        return null;
    }

    public static int a(ItemStack itemStack, int n, int n2) {
        aP2.b();
        if (itemStack == null) {
            return n2;
        }
        Item item = act_2.k(itemStack);
        return item == null ? n2 : (item instanceof lt_0 ? axn_1.a((lt_0)item, itemStack, n, n2) : n2);
    }

    private static ab4_0[][] a(String[] stringArray, ab4_0[] ab4_0Array, int n, int n2) {
        Object object;
        aP2.b();
        String[] stringArray2 = amc_0.a(stringArray, new String[]{alb_1.n});
        a7r_0.d(stringArray2);
        ArrayList arrayList = new ArrayList();
        int n3 = 0;
        if (n3 < stringArray2.length) {
            block10: {
                object = stringArray2[n3];
                axn_1.d(aL0.a(aL0.a(new StringBuilder(), alb_1.bz), (String)object).toString());
                ResourceLocation resourceLocation = new ResourceLocation(alb_1.bn, (String)object);
                InputStream inputStream = ys_2.b(resourceLocation);
                axn_1.e(aL0.a(aL0.a(new StringBuilder(), alb_1.aJ), (String)object).toString());
                Properties properties = new Properties();
                dk_1.a(properties, inputStream);
                ab4_0 ab4_02 = new ab4_0(properties, (String)object, n, n2, I);
                if (!ar9_0.a(ab4_02, (String)object)) break block10;
                if (!ar9_0.b(ab4_02, (String)object)) break block10;
                try {
                    axn_1.a(ab4_02, arrayList);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    axn_1.e(aL0.a(aL0.a(new StringBuilder(), alb_1.q), (String)object).toString());
                }
                catch (Exception exception) {
                    ch_2.a(exception);
                }
            }
            ++n3;
        }
        if ((n3 = 0) < ab4_0Array.length) {
            object = ab4_0Array[n3];
            axn_1.a((ab4_0)object, arrayList);
            ++n3;
        }
        if (ListInvoker.size(arrayList) <= 0) {
            return null;
        }
        ab4_0[][] ab4_0Array2 = axn_1.a(arrayList);
        return ab4_0Array2;
    }
}

