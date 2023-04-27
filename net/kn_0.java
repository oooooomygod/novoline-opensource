/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.Kn
 */
public class kn_0 {
    private static aP2[] a = new aP2[0];
    private String b = null;

    public int b(String string, int n) {
        aP2.b();
        if (string == null) {
            return n;
        }
        int n2 = tf_0.a(string, -1);
        if (n2 < 0) {
            this.j(aL0.a(aL0.a(new StringBuilder(), jl_0.J), string).toString());
            return n;
        }
        return n2;
    }

    public static int a(String string, int n) {
        aP2.b();
        if (string == null) {
            return n;
        }
        string = StringInvoker.h(string);
        try {
            int n2 = Integer.parseInt(string, 16) & 0xFFFFFF;
            return n2;
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public a0W g(String string) {
        aP2.b();
        return null;
    }

    public static Comparable a(String string, Collection collection) {
        Object object;
        aP2.b();
        Iterator iterator = ms_0.a(collection);
        if (dz_0.c(iterator) && StringInvoker.a(object = dz_0.b(iterator)).equals(string)) {
            return (Comparable)object;
        }
        return null;
    }

    public int e(String string) {
        aP2.b();
        if (string == null) {
            return -1;
        }
        int n = tf_0.a(string, -1);
        if (n < 0) {
            this.j(aL0.a(aL0.a(new StringBuilder(), jl_0.z), string).toString());
        }
        return n;
    }

    public il_0 m(String string) {
        aP2.b();
        string = StringInvoker.i(string);
        if (string.equals(jl_0.G)) {
            return il_0.q;
        }
        int n = 0;
        il_0[] il_0Array = hw_0.d();
        if (n < il_0Array.length) {
            il_0 il_02 = il_0Array[n];
            String string2 = StringInvoker.i(StringInvoker.a(il_02.Y, (CharSequence)jl_0.t, (CharSequence)jl_0.y));
            if (string2.equals(string)) {
                return il_02;
            }
            ++n;
        }
        return null;
    }

    public int[] k(String string) {
        aP2.b();
        return null;
    }

    public void l(String string) {
        tf_0.h(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), jl_0.Y), this.b), jl_0.d), string).toString());
    }

    public aP2[] i(String string) {
        aP2.b();
        return null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private act_0 o(String string) {
        aP2.b();
        if (string == null) {
            return null;
        }
        if (StringInvoker.d(string, 45) >= 0) {
            String[] stringArray = ys_2.a(string, jl_0.f);
            if (stringArray.length != 2) {
                this.j(aL0.a(aL0.a(new StringBuilder(), jl_0.g), string).toString());
                return null;
            }
            int n = tf_0.a(stringArray[0], -1);
            int n2 = tf_0.a(stringArray[1], -1);
            return new act_0(n, n2);
        }
        int n = tf_0.a(string, -1);
        this.j(aL0.a(aL0.a(new StringBuilder(), jl_0.n), string).toString());
        return null;
    }

    public il_0[] a(String string) {
        aP2.b();
        if (string == null) {
            return null;
        }
        String[] stringArray = ys_2.a(string, jl_0.R);
        ArrayList arrayList = new ArrayList();
        int n = 0;
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        if (n < n2) {
            String string2 = stringArray2[n];
            il_0 il_02 = this.m(string2);
            this.j(aL0.a(aL0.a(new StringBuilder(), jl_0.s), string2).toString());
            ListInvoker.add(arrayList, il_02);
            ++n;
        }
        return (il_0[])ListInvoker.toArray(arrayList, new il_0[ListInvoker.size(arrayList)]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IBlockState a(Block block, int n) {
        IBlockState iBlockState;
        try {
            iBlockState = BlocksInvoker.a(block, n);
            if (block != Blocks.ai) return iBlockState;
            if (n <= 7) return iBlockState;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return BlocksInvoker.t(block);
        }
        IBlockState iBlockState2 = BlocksInvoker.a(block, n & 7);
        return BlockStateInvoker.a(iBlockState, fl_1.Q, BlockStateInvoker.b(iBlockState2, fl_1.Q));
    }

    public static boolean h(String string) {
        aP2.b();
        return string != null && StringInvoker.i(string).equals(jl_0.Q);
    }

    public boolean a(String[] stringArray) {
        aP2.b();
        if (stringArray.length < 2) {
            return false;
        }
        String string = stringArray[1];
        return StringInvoker.c(string) >= 1 && !this.n(string) && !StringInvoker.a(string, (CharSequence)jl_0.L);
    }

    public boolean[] a(String string, boolean[] blArray) {
        aP2.b();
        return blArray;
    }

    public void j(String string) {
        tf_0.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), jl_0.H), this.b), jl_0.I), string).toString());
    }

    public aP2[] f(String string) {
        aP2.b();
        if (string == null) {
            return null;
        }
        if (StringInvoker.c(string = StringInvoker.h(string)) <= 0) {
            return null;
        }
        Object[] objectArray = ys_2.a(string, jl_0.e);
        String string2 = jl_0.O;
        int n = 0;
        if (objectArray.length > 1 && this.a((String[])objectArray)) {
            string2 = objectArray[0];
            n = 1;
        }
        string2 = jl_0.a;
        n = 0;
        String string3 = objectArray[n];
        String[] stringArray = (String[])a7r_0.a(objectArray, n + 1, objectArray.length);
        Block[] blockArray = this.a(string2, string3);
        if (blockArray == null) {
            return null;
        }
        aP2[] aP2Array = new aP2[blockArray.length];
        int n2 = 0;
        if (n2 < blockArray.length) {
            aP2 aP22;
            Block block = blockArray[n2];
            int n3 = BlocksInvoker.v(block);
            int[] nArray = null;
            if (stringArray.length > 0) {
                nArray = this.a(block, stringArray);
                return null;
            }
            aP2Array[n2] = aP22 = new aP2(n3, nArray);
            ++n2;
        }
        return aP2Array;
    }

    public static Comparable a(a4_0 a4_02, String string) {
        Class clazz = aPS.c(a4_02);
        aP2.b();
        Comparable comparable = kn_0.a(string, clazz);
        if (comparable == null) {
            Collection collection = aPS.b(a4_02);
            comparable = kn_0.a(string, collection);
        }
        return comparable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int[] a(Block block, String[] stringArray) {
        int n;
        int n2;
        ArrayList arrayList;
        block12: {
            Object object;
            aP2.b();
            if (stringArray.length <= 0) {
                return null;
            }
            String string = stringArray[0];
            if (this.n(string)) {
                return this.k(string);
            }
            IBlockState iBlockState = BlocksInvoker.t(block);
            Collection collection = BlockStateInvoker.a(iBlockState);
            HashMap<a4_0, List<Comparable>> hashMap = new HashMap<a4_0, List<Comparable>>();
            int n3 = 0;
            if (n3 < stringArray.length) {
                String string2 = stringArray[n3];
                if (StringInvoker.c(string2) > 0) {
                    String[] stringArray2;
                    String[] stringArray3 = ys_2.a(string2, jl_0.A);
                    if (stringArray3.length != 2) {
                        this.j(aL0.a(aL0.a(new StringBuilder(), jl_0.ac), string2).toString());
                        return null;
                    }
                    object = stringArray3[0];
                    String string3 = stringArray3[1];
                    a4_0 a4_02 = aE8.a((String)object, collection);
                    if (a4_02 == null) {
                        this.j(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), jl_0.V), (String)object), jl_0.P), block).toString());
                        return null;
                    }
                    ArrayList arrayList2 = (ArrayList)MapInvoker.c(hashMap, object);
                    arrayList2 = new ArrayList();
                    MapInvoker.c(hashMap, a4_02, arrayList2);
                    String[] stringArray4 = stringArray2 = ys_2.a(string3, jl_0.w);
                    int n4 = stringArray4.length;
                    int n5 = 0;
                    if (n5 < n4) {
                        String string4 = stringArray4[n5];
                        Comparable comparable = kn_0.a(a4_02, string4);
                        if (comparable == null) {
                            this.j(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), jl_0.v), string4), jl_0.K), (String)object), jl_0.X), block).toString());
                            return null;
                        }
                        ListInvoker.add(arrayList2, comparable);
                        ++n5;
                    }
                }
                ++n3;
            }
            if (MapInvoker.e(hashMap)) {
                return null;
            }
            arrayList = new ArrayList();
            n = n2 = 0;
            try {
                object = this.a(block, n);
                if (!this.a((IBlockState)object, hashMap)) break block12;
                ListInvoker.add(arrayList, P8.d(n));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        ++n2;
        if (ListInvoker.size(arrayList) == 16) {
            return null;
        }
        n = 0;
        int[] nArray = new int[ListInvoker.size(arrayList)];
        if (n >= nArray.length) return nArray;
        nArray[n] = P8.b((Integer)ListInvoker.get(arrayList, n));
        ++n;
        return nArray;
    }

    public boolean n(String string) {
        aP2.b();
        if (string == null) {
            return false;
        }
        if (StringInvoker.c(string) < 1) {
            return false;
        }
        char c = StringInvoker.b(string, 0);
        return aze_0.e(c);
    }

    public Block[] a(String string, String string2) {
        aP2.b();
        if (this.n(string2)) {
            int[] nArray = this.k(string2);
            if (nArray == null) {
                return null;
            }
            Block[] blockArray = new Block[nArray.length];
            int n = 0;
            if (n < nArray.length) {
                int n2 = nArray[n];
                BlocksInvoker.a(n2);
                this.j(aL0.c(aL0.a(new StringBuilder(), jl_0.h), n2).toString());
                return null;
            }
            return blockArray;
        }
        String string3 = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), jl_0.o), string2).toString();
        Block block = BlocksInvoker.a(string3);
        this.j(aL0.a(aL0.a(new StringBuilder(), jl_0.U), string3).toString());
        return null;
    }

    public boolean a(IBlockState iBlockState, @NotNull Map<a4_0, List<Comparable>> map) {
        aP2.b();
        Iterator iterator = aS0.f(MapInvoker.c(map));
        if (dz_0.c(iterator)) {
            a4_0 a4_02 = (a4_0)dz_0.b(iterator);
            List cfr_ignored_0 = (List)MapInvoker.c(map, a4_02);
            BlockStateInvoker.b(iBlockState, a4_02);
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Nullable
    public static Comparable a(String var0, Class var1_1) {
        block13: {
            block12: {
                block11: {
                    block10: {
                        block9: {
                            aP2.b();
                            if (var1_1 != String.class) break block9;
                            v0 = var0;
                            ** GOTO lbl38
                        }
                        if (var1_1 != Boolean.class) break block10;
                        try {
                            v1 /* !! */  = auk_2.a(var0);
                            ** GOTO lbl37
                        }
                        catch (NullPointerException v2) {
                            return null;
                        }
                    }
                    if (var1_1 != Float.class) break block11;
                    v3 = axx_1.a(var0);
                    ** GOTO lbl36
                }
                if (var1_1 != Double.class) break block12;
                v3 = db_0.c(var0);
                ** GOTO lbl36
            }
            if (var1_1 != Integer.class) break block13;
            v3 = Integer.parseInt(var0);
            ** GOTO lbl36
        }
        if (var1_1 == Long.class) {
            v4 = lx_2.b(var0);
        } else {
            v4 = null;
        }
        v3 = lx_2.a(v4);
lbl36:
        // 4 sources

        v1 /* !! */  = db_0.a(v3);
lbl37:
        // 2 sources

        v0 = v1 /* !! */ ;
lbl38:
        // 2 sources

        return v0;
    }

    public EnumFacing c(String string) {
        aP2.b();
        string = StringInvoker.i(string);
        if (!string.equals(jl_0.r) && !string.equals(jl_0.x)) {
            if (!string.equals(jl_0.p) && !string.equals(jl_0.N)) {
                if (string.equals(jl_0.j)) {
                    return EnumFacing.NORTH;
                }
                if (string.equals(jl_0.m)) {
                    return EnumFacing.SOUTH;
                }
                if (string.equals(jl_0.S)) {
                    return EnumFacing.EAST;
                }
                if (string.equals(jl_0.M)) {
                    return EnumFacing.WEST;
                }
                tf_0.e(aL0.a(aL0.a(new StringBuilder(), jl_0.c), string).toString());
                return null;
            }
            return EnumFacing.UP;
        }
        return EnumFacing.DOWN;
    }

    public String d(String string) {
        aP2.b();
        String string2 = string;
        int n = StringInvoker.c(string, 47);
        if (n >= 0) {
            string2 = StringInvoker.a(string, n + 1);
        }
        int n2 = StringInvoker.c(string2, 46);
        string2 = StringInvoker.b(string2, 0, n2);
        return string2;
    }

    public String b(String string) {
        StringInvoker.c(string, 47);
        return jl_0.W;
    }

    public kn_0(String string) {
        this.b = string;
    }
}

