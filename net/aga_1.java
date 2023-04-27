/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.a0W;
import net.aL0;
import net.aP2;
import net.amv_2;
import net.aux__0;
import net.axw_1;
import net.az9_0;
import net.il_0;
import net.nl_1;
import net.pe_1;
import net.ut_1;
import net.ys_2;

/*
 * Renamed from net.agA
 */
public class aga_1 {
    private int[] b = null;
    private int[] a = null;
    private il_0[] d = null;
    private ResourceLocation[] e = null;
    public int[] g = null;
    private a0W h = null;
    private ResourceLocation f = null;
    public int c = 1;

    public aga_1(ResourceLocation resourceLocation, int[] nArray, int[] nArray2, il_0[] il_0Array, a0W a0W2) {
        this.f = resourceLocation;
        this.b = nArray;
        this.a = nArray2;
        this.d = il_0Array;
        this.h = a0W2;
    }

    public boolean a(String string) {
        aP2.b();
        this.e = new ResourceLocation[this.b.length];
        aux__0.b(this.f);
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), ut_1.g), axw_1.b(this.f)).toString());
        return false;
    }

    public boolean a(nl_1 nl_12) {
        aP2.b();
        return !az9_0.a(nl_12.bp, this.d) ? false : (this.h != null && nl_12.bu != null ? pe_1.a(this.h, amv_2.h(nl_12.bu)) : true);
    }

    public ResourceLocation a(ResourceLocation resourceLocation, int n) {
        aP2.b();
        int n2 = 0;
        if (this.a == null) {
            n2 = n % this.e.length;
        }
        int n3 = n % this.c;
        int n4 = 0;
        if (n4 < this.g.length) {
            if (this.g[n4] > n3) {
                n2 = n4;
            }
            ++n4;
        }
        return this.e[n2];
    }
}

