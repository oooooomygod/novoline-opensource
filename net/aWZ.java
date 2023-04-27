/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import deobf.IResourcePack;
import deobf.MCInvoker;
import net.minecraft.renderer.texture.TextureMap;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class aWZ {
    private static Map[] m = null;
    private static int q = 4;
    private static int e = 3;
    private static KM i;
    private static int g = 1;
    private static int d = 5;
    private static String[] f;
    private static int b = 2;
    public static IBlockState n;
    private static int k = 2;
    private static azp_0[][] h;
    private static int l = 0;
    private static int[] c;
    private static int j = 0;
    private static int o = 1;
    private static boolean a;
    private static azp_0[][] p;

    private static KM a(azp_0 azp_02, IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, int n, int n2, KM kM, int n3, atV atV2) {
        aP2.b();
        boolean[] blArray = en_0.b(atV2);
        switch (n2) {
            case 0: {
                blArray[0] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                blArray[1] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                blArray[2] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
                blArray[3] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
            }
            case 1: {
                blArray[0] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                blArray[1] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                blArray[2] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                blArray[3] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
            }
            case 2: {
                blArray[0] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                blArray[1] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                blArray[2] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                blArray[3] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
            }
            case 3: {
                blArray[0] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                blArray[1] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                blArray[2] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                blArray[3] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
            }
            case 4: {
                blArray[0] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
                blArray[1] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                blArray[2] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                blArray[3] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
            }
            case 5: {
                blArray[0] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                blArray[1] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
                blArray[2] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                blArray[3] = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
            }
        }
        int n4 = 0;
        if (blArray[0] & !blArray[1] & !blArray[2] & !blArray[3]) {
            n4 = 3;
        }
        if (!blArray[0] & blArray[1] & !blArray[2] & !blArray[3]) {
            n4 = 1;
        }
        if (!blArray[0] & !blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 12;
        }
        if (!blArray[0] & !blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 36;
        }
        if (blArray[0] & blArray[1] & !blArray[2] & !blArray[3]) {
            n4 = 2;
        }
        if (!blArray[0] & !blArray[1] & blArray[2] & blArray[3]) {
            n4 = 24;
        }
        if (blArray[0] & !blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 15;
        }
        if (blArray[0] & !blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 39;
        }
        if (!blArray[0] & blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 13;
        }
        if (!blArray[0] & blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 37;
        }
        if (!blArray[0] & blArray[1] & blArray[2] & blArray[3]) {
            n4 = 25;
        }
        if (blArray[0] & !blArray[1] & blArray[2] & blArray[3]) {
            n4 = 27;
        }
        if (blArray[0] & blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 38;
        }
        if (blArray[0] & blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 14;
        }
        if (blArray[0] & blArray[1] & blArray[2] & blArray[3]) {
            n4 = 26;
        }
        return azp_02.q[n4];
    }

    private static String[] a() {
        String[] stringArray;
        int n;
        ArrayList arrayList = new ArrayList();
        aP2.b();
        String string = a2K.ad;
        if (ys_2.e(new ResourceLocation(a2K.F))) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), string), a2K.W).toString());
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), string), a2K.j).toString());
        }
        if (ys_2.e(new ResourceLocation(a2K.ah))) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), string), a2K.X).toString());
        }
        if (ys_2.e(new ResourceLocation(a2K.C))) {
            ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), string), a2K.i).toString());
        }
        if ((n = 0) < (stringArray = new String[]{a2K.b, a2K.B, a2K.K, a2K.v, a2K.n, a2K.c, a2K.ac, a2K.Y, a2K.E, a2K.ap, a2K.e, a2K.P, a2K.O, a2K.t, a2K.m, a2K.a}).length) {
            String string2 = stringArray[n];
            if (ys_2.e(new ResourceLocation(aL0.a(aL0.a(aL0.a(new StringBuilder(), a2K.w), string2), a2K.af).toString()))) {
                ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), string), n), a2K.k), string2), a2K.p), string2), a2K.u).toString());
                ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), string), n), a2K.A), string2), a2K.x), string2), a2K.ao).toString());
            }
            ++n;
        }
        String[] stringArray2 = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        return stringArray2;
    }

    private static a9Z a(KM kM, Block block, IBlockState iBlockState, a9Z a9Z2) {
        aP2.b();
        if (m == null) {
            return a9Z2;
        }
        int n = qg_2.o(kM);
        if (n >= 0 && n < m.length) {
            a9Z a9Z3;
            IdentityHashMap identityHashMap = m[n];
            if (identityHashMap == null) {
                aWZ.m[n] = identityHashMap = new IdentityHashMap(1);
            }
            if ((a9Z3 = (a9Z)MapInvoker.c(identityHashMap, a9Z2)) == null) {
                a9Z3 = aWZ.a(a9Z2, kM);
                MapInvoker.c(identityHashMap, a9Z2, a9Z3);
            }
            return a9Z3;
        }
        return a9Z2;
    }

    private static int b(int n, int n2) {
        aP2.b();
        int n3 = (n2 & 0xC) >> 2;
        switch (n3) {
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
        }
        return 0;
    }

    public static void b(TextureMap textureMap) {
        h = null;
        aP2.b();
        p = null;
        m = null;
        if (ys_2.u()) {
            IResourcePack[] iResourcePackArray = ys_2.d();
            int n = iResourcePackArray.length - 1;
            IResourcePack iResourcePack = iResourcePackArray[n];
            aWZ.a(textureMap, iResourcePack);
            --n;
            aWZ.a(textureMap, ys_2.g());
            ResourceLocation resourceLocation = new ResourceLocation(a2K.as);
            i = h9.a(textureMap, resourceLocation);
            m = new Map[h9.e(textureMap) + 1];
            if (h.length <= 0) {
                h = null;
            }
            if (p.length <= 0) {
                p = null;
            }
        }
    }

    private static a9Z a(a9Z a9Z2, KM kM) {
        aP2.b();
        int[] nArray = (int[])aX3.d(a9Z2).clone();
        KM kM2 = aX3.a(a9Z2);
        int n = 0;
        aWZ.a(nArray, n, kM2, kM);
        ++n;
        a9Z a9Z3 = new a9Z(nArray, aX3.e(a9Z2), aX3.f(a9Z2), kM);
        return a9Z3;
    }

    public static int a(int n) {
        aP2.b();
        int n2 = n % 16;
        return n2 == 1 ? n + 2 : (n2 == 3 ? n - 2 : n);
    }

    public static KM a(azp_0 azp_02, int n, KM kM) {
        aP2.b();
        if (azp_02.w != 1) {
            return kM;
        }
        if (n >= 0 && n < c.length) {
            int n2 = c[n];
            KM[] kMArray = azp_02.q;
            return n2 >= 0 && n2 < kMArray.length ? kMArray[n2] : kM;
        }
        return kM;
    }

    private static int a(int n, int n2) {
        aP2.b();
        switch (n2) {
            case 0: {
                return n;
            }
            case 1: {
                switch (n) {
                    case 0: {
                        return 2;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 1;
                    }
                    case 3: {
                        return 0;
                    }
                }
                return n;
            }
            case 2: {
                switch (n) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 5;
                    }
                    default: {
                        return n;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: 
                }
                return 0;
            }
        }
        return n;
    }

    private static KM d(azp_0 azp_02, IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, int n, int n2, KM kM, int n3) {
        aP2.b();
        boolean bl = false;
        boolean bl2 = false;
        switch (n) {
            case 0: {
                if (n2 == 1 || n2 == 0) {
                    return null;
                }
                bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
            }
            case 1: {
                if (n2 == 3 || n2 == 2) {
                    return null;
                }
                bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
            }
            case 2: {
                if (n2 == 5 || n2 == 4) {
                    return null;
                }
                bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
            }
        }
        int n4 = 3;
        n4 = 3;
        return azp_02.q[n4];
    }

    private static KM a(azp_0 azp_02, BlockPos blockPos, int n) {
        aP2.b();
        if (azp_02.q.length == 1) {
            return azp_02.q[0];
        }
        int n2 = amv_2.j(blockPos);
        int n3 = amv_2.h(blockPos);
        int n4 = amv_2.i(blockPos);
        int n5 = 0;
        int n6 = 0;
        switch (n) {
            case 0: {
                n5 = n2;
                n6 = n4;
            }
            case 1: {
                n5 = n2;
                n6 = n4;
            }
            case 2: {
                n5 = -n2 - 1;
                n6 = -n3;
            }
            case 3: {
                n5 = n2;
                n6 = -n3;
            }
            case 4: {
                n5 = n4;
                n6 = -n3;
            }
            case 5: {
                n5 = -n4 - 1;
                n6 = -n3;
            }
        }
        n6 %= azp_02.R;
        if ((n5 %= azp_02.p) < 0) {
            n5 += azp_02.p;
        }
        if (n6 < 0) {
            n6 += azp_02.R;
        }
        int n7 = n6 * azp_02.p + n5;
        return azp_02.q[n7];
    }

    private static KM a(azp_0 azp_02, IBlockAccess iBlockAccess, afn_0 afn_02, BlockPos blockPos, int n, KM kM, atV atV2) {
        int n2;
        int n3;
        aP2.b();
        int n4 = 0;
        int n5 = n3 = aqc_1.a(afn_02);
        Block block = aqc_1.d(afn_02);
        if (block instanceof gk_1) {
            n4 = aWZ.b(n, n3);
            if (aE8.a(azp_02) <= 3) {
                n5 = n3 & 3;
            }
        }
        if (block instanceof gm_1) {
            n4 = aWZ.c(n, n3);
            if (aE8.a(azp_02) <= 2 && n5 > 2) {
                n5 = 2;
            }
        }
        if (!aE8.a(azp_02, aqc_1.c(afn_02), n5)) {
            return null;
        }
        if (n >= 0 && azp_02.v != 63 && (1 << (n2 = n) & azp_02.v) == 0) {
            return null;
        }
        n2 = amv_2.h(blockPos);
        if (n2 >= azp_02.M && n2 <= azp_02.h) {
            il_0 il_02;
            if (azp_02.X != null && !aE8.a(azp_02, il_02 = aG3.d(iBlockAccess, blockPos))) {
                return null;
            }
            switch (azp_02.w) {
                case 1: {
                    return aWZ.a(azp_02, iBlockAccess, afn_02, blockPos, n4, n, kM, n3, atV2);
                }
                case 2: {
                    return aWZ.a(azp_02, iBlockAccess, afn_02, blockPos, n4, n, kM, n3);
                }
                case 3: {
                    return aWZ.b(azp_02, iBlockAccess, afn_02, blockPos, n4, n, kM, n3);
                }
                case 4: {
                    return aWZ.b(azp_02, blockPos, n);
                }
                case 5: {
                    return aWZ.a(azp_02, blockPos, n);
                }
                case 6: {
                    return aWZ.d(azp_02, iBlockAccess, afn_02, blockPos, n4, n, kM, n3);
                }
                case 7: {
                    return aWZ.a(azp_02);
                }
                case 8: {
                    return aWZ.e(azp_02, iBlockAccess, afn_02, blockPos, n4, n, kM, n3);
                }
                case 9: {
                    return aWZ.c(azp_02, iBlockAccess, afn_02, blockPos, n4, n, kM, n3);
                }
            }
            return null;
        }
        return null;
    }

    private static List a(azp_0[][] azp_0Array) {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        int n = 0;
        if (n < azp_0Array.length) {
            Object[] objectArray = azp_0Array[n];
            ArrayList arrayList2 = null;
            arrayList2 = new ArrayList(a7r_0.a(objectArray));
            ListInvoker.add(arrayList, arrayList2);
            ++n;
        }
        return arrayList;
    }

    static {
        h = null;
        p = null;
        a = false;
        f = new String[]{a2K.aa, a2K.d, a2K.U, a2K.l, a2K.ak, a2K.L, a2K.N, a2K.I, a2K.s, a2K.S, a2K.al, a2K.H, a2K.r, a2K.aq, a2K.y, a2K.at, a2K.Q, a2K.o, a2K.am, a2K.q, a2K.ai, a2K.aj, a2K.Z, a2K.D, a2K.an, a2K.T, a2K.M};
        c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 0, 0, 0, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 0, 0, 0, 0, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 0, 0, 0, 0, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0, 0, 0, 0, 0};
        n = BlocksInvoker.t(Blocks.air);
        i = null;
    }

    private static KM a(azp_0 azp_02, IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, int n, int n2, KM kM, int n3) {
        aP2.b();
        boolean bl = false;
        boolean bl2 = false;
        switch (n) {
            case 0: {
                switch (n2) {
                    case 0: 
                    case 1: {
                        return null;
                    }
                    case 2: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                    }
                    case 3: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                    }
                    case 4: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                    }
                    case 5: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
                    }
                }
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                    }
                    case 1: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.d(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
                    }
                    case 2: 
                    case 3: {
                        return null;
                    }
                    case 4: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
                    }
                    case 5: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                    }
                }
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                    }
                    case 1: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.a(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
                    }
                    case 2: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
                    }
                    case 3: {
                        bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
                        bl2 = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.g(blockPos), n2, kM, n3);
                    }
                    case 4: 
                    case 5: {
                        return null;
                    }
                }
            }
        }
        int n4 = 3;
        n4 = 3;
        return azp_02.q[n4];
    }

    private static KM b(azp_0 azp_02, BlockPos blockPos, int n) {
        aP2.b();
        if (azp_02.q.length == 1) {
            return azp_02.q[0];
        }
        int n2 = n / azp_02.F * azp_02.F;
        int n3 = ys_2.a(blockPos, n2) & Integer.MAX_VALUE;
        int n4 = 0;
        if (azp_02.a == null) {
            n4 = n3 % azp_02.q.length;
        }
        int n5 = n3 % azp_02.C;
        int n6 = 0;
        int[] nArray = azp_02.Q;
        if (n6 < nArray.length) {
            if (n5 < nArray[n6]) {
                n4 = n6;
            }
            ++n6;
        }
        return azp_02.q[n4];
    }

    public static synchronized a9Z a(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, a9Z a9Z2, atV atV2) {
        aP2.b();
        aX3.a(a9Z2);
        return a9Z2;
    }

    private static EnumFacing b(int n) {
        switch (n) {
            case 0: {
                return EnumFacing.DOWN;
            }
            case 1: {
                return EnumFacing.UP;
            }
            case 2: {
                return EnumFacing.NORTH;
            }
            case 3: {
                return EnumFacing.SOUTH;
            }
            case 4: {
                return EnumFacing.WEST;
            }
            case 5: {
                return EnumFacing.EAST;
            }
        }
        return EnumFacing.UP;
    }

    private static KM a(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, EnumFacing enumFacing, KM kM, atV atV2) {
        aP2.b();
        KM kM2 = aWZ.a(iBlockAccess, iBlockState, blockPos, enumFacing, kM, true, atV2);
        if (!a) {
            return kM2;
        }
        if (kM2 == kM) {
            return kM2;
        }
        KM kM3 = kM2;
        int n = 0;
        KM kM4 = aWZ.a(iBlockAccess, iBlockState, blockPos, enumFacing, kM3, false, atV2);
        if (kM4 == kM3) {
            // empty if block
        }
        kM3 = kM4;
        ++n;
        return kM3;
    }

    private static boolean b() {
        Object object;
        ArrayList arrayList = new ArrayList();
        aP2.b();
        int n = 0;
        if (n < p.length) {
            object = p[n];
            if (object != null) {
                ListInvoker.addAll(arrayList, a7r_0.a(object));
            }
            ++n;
        }
        if ((n = 0) < h.length) {
            object = h[n];
            if (object != null) {
                ListInvoker.addAll(arrayList, a7r_0.a(object));
            }
            ++n;
        }
        azp_0[] azp_0Array = (azp_0[])ListInvoker.toArray(arrayList, new azp_0[ListInvoker.size(arrayList)]);
        object = new HashSet();
        HashSet hashSet = new HashSet();
        int n2 = 0;
        if (n2 < azp_0Array.length) {
            azp_0 azp_02 = azp_0Array[n2];
            if (azp_02.V != null) {
                aS0.a((Set)object, a7r_0.a(azp_02.V));
            }
            if (azp_02.q != null) {
                aS0.a(hashSet, a7r_0.a(azp_02.q));
            }
            ++n2;
        }
        aS0.c((Set)object, hashSet);
        return !aS0.b((Set)object);
    }

    public static KM a(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, EnumFacing enumFacing, KM kM, boolean bl, atV atV2) {
        azp_0 azp_02;
        int n;
        int n2;
        azp_0[] azp_0Array;
        int n3;
        aP2.b();
        BlockStateInvoker.getBlock(iBlockState);
        if (!(iBlockState instanceof afn_0)) {
            return kM;
        }
        afn_0 afn_02 = (afn_0)iBlockState;
        if (p != null && (n3 = qg_2.o(kM)) >= 0 && n3 < p.length) {
            azp_0Array = p[n3];
            n2 = aWZ.a(enumFacing);
            n = 0;
            if (n < azp_0Array.length) {
                azp_02 = azp_0Array[n];
                if (azp_02 != null && aE8.a(azp_02, aqc_1.c(afn_02))) {
                    KM kM2 = aWZ.a(azp_02, iBlockAccess, afn_02, blockPos, n2, kM, atV2);
                    return kM2;
                }
                ++n;
            }
        }
        if (h != null && bl && (n3 = en_0.h(atV2)) >= 0 && n3 < h.length) {
            azp_0Array = h[n3];
            n2 = aWZ.a(enumFacing);
            n = 0;
            if (n < azp_0Array.length) {
                azp_02 = azp_0Array[n];
                if (azp_02 != null && aE8.a(azp_02, kM)) {
                    KM kM3 = aWZ.a(azp_02, iBlockAccess, afn_02, blockPos, n2, kM, atV2);
                    return kM3;
                }
                ++n;
            }
        }
        return kM;
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }

    private static KM b(azp_0 azp_02, IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, int n, int n2, KM kM, int n3) {
        aP2.b();
        boolean bl = false;
        switch (n) {
            case 0: {
                if (n2 == 1 || n2 == 0) {
                    return null;
                }
                bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.e(blockPos), n2, kM, n3);
            }
            case 1: {
                if (n2 == 3 || n2 == 2) {
                    return null;
                }
                bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.b(blockPos), n2, kM, n3);
            }
            case 2: {
                if (n2 == 5 || n2 == 4) {
                    return null;
                }
                bl = aWZ.a(azp_02, iBlockAccess, iBlockState, amv_2.f(blockPos), n2, kM, n3);
            }
        }
        return null;
    }

    private static KM a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, int n) {
        iBlockState = BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), iBlockState, iBlockAccess, blockPos);
        aP2.b();
        ap__0.b(xd_0.a(MCInvoker.Y(MCInvoker.f())), iBlockState);
        return null;
    }

    private static void a(TextureMap textureMap) {
    }

    private static void a(int[] nArray, int n, KM kM, KM kM2) {
        int n2 = nArray.length / 4;
        int n3 = n2 * n;
        float f = axx_1.a(nArray[n3 + 4]);
        float f2 = axx_1.a(nArray[n3 + 4 + 1]);
        double d = qg_2.b(kM, f);
        double d2 = qg_2.c(kM, f2);
        nArray[n3 + 4] = axx_1.e(qg_2.a(kM2, d));
        nArray[n3 + 4 + 1] = axx_1.e(qg_2.b(kM2, d2));
    }

    private static int c(int n, int n2) {
        aP2.b();
        switch (n2) {
            case 3: {
                return 2;
            }
            case 4: {
                return 1;
            }
        }
        return 0;
    }

    public static int a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        aP2.b();
        return bl2 && bl ? (bl3 ? (bl4 ? 34 : 50) : (bl4 ? 18 : 2)) : (bl2 && !bl ? (bl3 ? (bl4 ? 35 : 51) : (bl4 ? 19 : 3)) : (!bl2 && bl ? (bl3 ? (bl4 ? 33 : 49) : (bl4 ? 17 : 1)) : (bl3 ? (bl4 ? 32 : 48) : (bl4 ? 16 : 0))));
    }

    private static void a(azp_0 azp_02, List list, int n) {
        ArrayList arrayList;
        aP2.b();
        if (n >= ListInvoker.size(list)) {
            ListInvoker.add(list, null);
        }
        if ((arrayList = (ArrayList)ListInvoker.get(list, n)) == null) {
            arrayList = new ArrayList();
            ListInvoker.set(list, n, arrayList);
        }
        ListInvoker.add(arrayList, azp_02);
    }

    public static int a(EnumFacing enumFacing) {
        aP2.b();
        return -1;
    }

    private static azp_0[][] a(List list) {
        aP2.b();
        azp_0[][] azp_0Array = new azp_0[ListInvoker.size(list)][];
        int n = 0;
        if (n < ListInvoker.size(list)) {
            List list2 = (List)ListInvoker.get(list, n);
            azp_0[] azp_0Array2 = (azp_0[])ListInvoker.toArray(list2, new azp_0[ListInvoker.size(list2)]);
            azp_0Array[n] = azp_0Array2;
            ++n;
        }
        return azp_0Array;
    }

    private static KM c(azp_0 azp_02, IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, int n, int n2, KM kM, int n3) {
        KM[] kMArray = azp_02.q;
        aP2.b();
        KM kM2 = aWZ.d(azp_02, iBlockAccess, iBlockState, blockPos, n, n2, kM, n3);
        if (kM2 != null && kM2 != kM && kM2 != kMArray[3]) {
            return kM2;
        }
        KM kM3 = aWZ.a(azp_02, iBlockAccess, iBlockState, blockPos, n, n2, kM, n3);
        return kM3 == kMArray[0] ? kMArray[4] : (kM3 == kMArray[1] ? kMArray[5] : (kM3 == kMArray[2] ? kMArray[6] : kM3));
    }

    private static boolean a(azp_0 azp_02, IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, int n, KM kM, int n2) {
        aP2.b();
        IBlockState iBlockState2 = aG3.c(iBlockAccess, blockPos);
        if (iBlockState == iBlockState2) {
            return true;
        }
        if (azp_02.H == 2) {
            if (iBlockState2 == null) {
                return false;
            }
            if (iBlockState2 == aWZ.n) {
                return false;
            }
            KM kM2 = aWZ.a(iBlockAccess, blockPos, iBlockState2, n);
            return kM2 == kM;
        }
        return azp_02.H == 3 ? (iBlockState2 == null ? false : (iBlockState2 == aWZ.n ? false : BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState2)) == BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)))) : false;
    }

    private static KM e(azp_0 azp_02, IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, int n, int n2, KM kM, int n3) {
        KM[] kMArray = azp_02.q;
        aP2.b();
        KM kM2 = aWZ.a(azp_02, iBlockAccess, iBlockState, blockPos, n, n2, kM, n3);
        if (kM2 != null && kM2 != kM && kM2 != kMArray[3]) {
            return kM2;
        }
        KM kM3 = aWZ.d(azp_02, iBlockAccess, iBlockState, blockPos, n, n2, kM, n3);
        return kM3 == kMArray[0] ? kMArray[4] : (kM3 == kMArray[1] ? kMArray[5] : (kM3 == kMArray[2] ? kMArray[6] : kM3));
    }

    public static void a(TextureMap textureMap, IResourcePack iResourcePack) {
        String[] stringArray = amc_0.a(iResourcePack, a2K.f, a2K.g, aWZ.a());
        a7r_0.d(stringArray);
        aP2.b();
        List list = aWZ.a(p);
        List list2 = aWZ.a(h);
        int n = 0;
        if (n < stringArray.length) {
            block8: {
                String string = stringArray[n];
                ys_2.a(aL0.a(aL0.a(new StringBuilder(), a2K.J), string).toString());
                ResourceLocation resourceLocation = new ResourceLocation(string);
                InputStream inputStream = avv_0.a(iResourcePack, resourceLocation);
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), a2K.z), string).toString());
                Properties properties = new Properties();
                dk_1.a(properties, inputStream);
                azp_0 azp_02 = new azp_0(properties, string);
                if (!aE8.a(azp_02, string)) break block8;
                azp_02.a(textureMap);
                aWZ.b(azp_02, list);
                azp_0 azp_03 = azp_02;
                try {
                    aWZ.a(azp_03, list2);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), a2K.h), string).toString());
                }
                catch (Exception exception) {
                    ch_2.a(exception);
                }
            }
            ++n;
        }
        h = aWZ.a(list2);
        p = aWZ.a(list);
        a = aWZ.b();
        ys_2.a(aL0.a(aL0.a(new StringBuilder(), a2K.ae), a).toString());
    }

    private static void b(azp_0 azp_02, List list) {
        int n;
        aP2.b();
        if (azp_02.V != null && (n = 0) < azp_02.V.length) {
            KM kM = azp_02.V[n];
            if (!(kM instanceof KM)) {
                ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a2K.G), kM), a2K.ab), qg_2.g(kM)).toString());
            }
            int n2 = qg_2.o(kM);
            ys_2.d(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), a2K.ar), n2), a2K.V), qg_2.g(kM)).toString());
            aWZ.a(azp_02, list, n2);
            ++n;
        }
    }

    private static void a(azp_0 azp_02, List list) {
        int n;
        aP2.b();
        if (azp_02.o != null && (n = 0) < azp_02.o.length) {
            int n2 = AM.b(azp_02.o[n]);
            ys_2.d(aL0.c(aL0.a(new StringBuilder(), a2K.ag), n2).toString());
            aWZ.a(azp_02, list, n2);
            ++n;
        }
    }

    private static KM a(azp_0 azp_02) {
        return azp_02.q[0];
    }
}

