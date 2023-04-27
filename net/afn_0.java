/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableTable
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableTable;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.block.Block;

/*
 * Renamed from net.aFn
 */
public abstract class afn_0
implements IBlockState {
    private static Function a;
    private static String b;
    private int e = -1;
    private int g = -1;
    private ResourceLocation f = null;
    private static Joiner c;
    private int d = -1;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u000e\u0011\u0003J\u000bL`\u007fmoH".toCharArray();
        int n2 = 0;
        int n3 = 125;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x30));
            n3 = n3;
        }
    }

    protected static Object a(Collection collection, Object object) {
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            if (!dz_0.b(iterator).equals(object)) continue;
            if (dz_0.c(iterator)) {
                return dz_0.b(iterator);
            }
            return dz_0.b(ms_0.a(collection));
        }
        return dz_0.b(iterator);
    }

    public IBlockState b(a4_0 a4_02) {
        return aqc_1.a(this, a4_02, (Comparable)afn_0.a(aPS.b(a4_02), aqc_1.a(this, a4_02)));
    }

    public int d() {
        if (this.g < 0) {
            this.g = BlocksInvoker.c(aqc_1.d(this), this);
        }
        return this.g;
    }

    public ImmutableTable<a4_0, Comparable, IBlockState> b() {
        return null;
    }

    public ResourceLocation a() {
        if (this.f == null) {
            this.f = (ResourceLocation)a82.b(Block.m, aqc_1.d(this));
        }
        return this.f;
    }

    public int e() {
        if (this.d < 0) {
            this.d = BlocksInvoker.a(this);
        }
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        aL0.a(stringBuilder, a82.b(Block.m, aqc_1.d(this)));
        if (!da_1.a(aqc_1.b(this))) {
            aL0.a(stringBuilder, fp_0.a);
            aSB.a(c, stringBuilder, DZ.a((Iterable)da_1.b(aqc_1.b(this)), a));
            aL0.a(stringBuilder, fp_0.b);
        }
        return stringBuilder.toString();
    }

    public int c() {
        if (this.e < 0) {
            this.e = BlocksInvoker.v(aqc_1.d(this));
        }
        return this.e;
    }
}

