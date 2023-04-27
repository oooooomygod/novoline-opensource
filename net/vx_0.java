/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.IBlockState;
import net.V3;
import net.V7;
import net.VI;
import net.VQ;
import net.ab9_0;
import net.aot_0;
import net.jc_0;
import net.vc_0;
import net.vg_0;
import net.vn_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Vx
 */
public abstract class vx_0
extends Enum<vx_0>
implements ab9_0 {
    public static /* enum */ vx_0 MOSSY_STONEBRICK;
    public static /* enum */ vx_0 STONEBRICK;
    public static /* enum */ vx_0 STONE;
    public static /* enum */ vx_0 CHISELED_STONEBRICK;
    private static vx_0[] d;
    private static vx_0[] c;
    private String e;
    private String b;
    public static /* enum */ vx_0 CRACKED_STONEBRICK;
    private int a;
    public static /* enum */ vx_0 COBBLESTONE;

    public String b() {
        return this.b;
    }

    @Override
    public String a() {
        return this.e;
    }

    public String toString() {
        return this.e;
    }

    public static vx_0[] values() {
        return (vx_0[])d.clone();
    }

    private vx_0(int n2, String string2) {
        this(n2, string2, string2);
    }

    private vx_0(int n2, String string2, String string3) {
        this.a = n2;
        this.e = string2;
        this.b = string3;
    }

    vx_0(int n2, String string2, String string3, aot_0 aot_02) {
        this(n2, string2, string3);
    }

    public abstract IBlockState a();

    public static vx_0 valueOf(String string) {
        return (vx_0)jc_0.a(vx_0.class, string);
    }

    public static vx_0 a(int n) {
        if (n >= c.length) {
            n = 0;
        }
        return c[n];
    }

    vx_0(int n2, String string2, aot_0 aot_02) {
        this(n2, string2);
    }

    public int c() {
        return this.a;
    }

    public static vx_0 a(IBlockState iBlockState) {
        for (vx_0 vx_02 : vx_0.values()) {
            if (iBlockState != vx_02.a()) continue;
            return vx_02;
        }
        return STONE;
    }

    static {
        STONE = new V7(0, V3.g);
        COBBLESTONE = new VQ(1, V3.a, V3.b);
        STONEBRICK = new VI(2, V3.k, V3.c);
        MOSSY_STONEBRICK = new vg_0(3, V3.j, V3.m);
        CRACKED_STONEBRICK = new vc_0(4, V3.d, V3.o);
        CHISELED_STONEBRICK = new vn_0(5, V3.e, V3.h);
        d = new vx_0[]{STONE, COBBLESTONE, STONEBRICK, MOSSY_STONEBRICK, CRACKED_STONEBRICK, CHISELED_STONEBRICK};
        c = new vx_0[vx_0.values().length];
        vx_0[] vx_0Array = vx_0.values();
        int n = vx_0Array.length;
        for (int i = 0; i < n; ++i) {
            vx_0 vx_02;
            vx_0.c[vx_02.c()] = vx_02 = vx_0Array[i];
        }
    }
}

