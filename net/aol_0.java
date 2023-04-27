/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Properties;
import net.Gj;
import net.ResourceLocation;
import net.a0W;
import net.aIt;
import net.aL0;
import net.aNT;
import net.aP2;
import net.act_0;
import net.aga_1;
import net.axw_1;
import net.dk_1;
import net.il_0;
import net.kn_0;
import net.nl_1;
import net.pe_1;
import net.ys_2;

/*
 * Renamed from net.aOl
 */
public class aol_0 {
    public String b = null;
    public String d = null;
    public aga_1[] a = null;
    public ResourceLocation[] c = null;

    public aol_0(String string, ResourceLocation[] resourceLocationArray) {
        kn_0 kn_02 = new kn_0(Gj.m);
        this.b = aNT.e(kn_02, string);
        this.d = aNT.g(kn_02, string);
        this.c = resourceLocationArray;
    }

    public aol_0(Properties properties, String string, ResourceLocation resourceLocation) {
        kn_0 kn_02 = new kn_0(Gj.g);
        this.b = aNT.e(kn_02, string);
        this.d = aNT.g(kn_02, string);
        this.a = this.a(properties, resourceLocation, kn_02);
    }

    private a0W a(Properties properties, int n) {
        String string = dk_1.a(properties, aL0.c(aL0.a(new StringBuilder(), Gj.e), n).toString());
        aP2.b();
        String string2 = dk_1.a(properties, aL0.c(aL0.a(new StringBuilder(), Gj.d), n).toString());
        if (string == null && string2 == null) {
            return null;
        }
        int n2 = 0;
        if (string != null && (n2 = ys_2.a(string, -1)) < 0) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), Gj.f), string).toString());
            return null;
        }
        int n3 = 256;
        if (string2 != null && (n3 = ys_2.a(string2, -1)) < 0) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), Gj.h), string2).toString());
            return null;
        }
        a0W a0W2 = new a0W();
        pe_1.a(a0W2, new act_0(n2, n3));
        return a0W2;
    }

    public ResourceLocation a(ResourceLocation resourceLocation, nl_1 nl_12) {
        int n;
        aP2.b();
        if (this.a != null && (n = 0) < this.a.length) {
            aga_1 aga_12 = this.a[n];
            if (aIt.a(aga_12, nl_12)) {
                return aIt.a(aga_12, resourceLocation, nl_12.bh);
            }
            ++n;
        }
        if (this.c != null) {
            n = nl_12.bh;
            int n2 = n % this.c.length;
            return this.c[n2];
        }
        return resourceLocation;
    }

    public boolean a(String string) {
        Object object;
        int n;
        aP2.b();
        if (this.c == null && this.a == null) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), Gj.j), string).toString());
            return false;
        }
        if (this.a != null && (n = 0) < this.a.length) {
            object = this.a[n];
            if (!((aga_1)object).a(string)) {
                return false;
            }
            ++n;
        }
        if (this.c != null && (n = 0) < this.c.length) {
            object = this.c[n];
            if (!ys_2.d((ResourceLocation)object)) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), Gj.b), axw_1.b((ResourceLocation)object)).toString());
                return false;
            }
            ++n;
        }
        return true;
    }

    private aga_1[] a(Properties properties, ResourceLocation resourceLocation, kn_0 kn_02) {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        int n = dk_1.b(properties);
        int n2 = 0;
        if (n2 < n) {
            int n3 = n2 + 1;
            String string = dk_1.a(properties, aL0.c(aL0.a(new StringBuilder(), Gj.n), n3).toString());
            int[] nArray = aNT.b(kn_02, string);
            int[] nArray2 = aNT.b(kn_02, dk_1.a(properties, aL0.c(aL0.a(new StringBuilder(), Gj.k), n3).toString()));
            il_0[] il_0Array = aNT.d(kn_02, dk_1.a(properties, aL0.c(aL0.a(new StringBuilder(), Gj.a), n3).toString()));
            a0W a0W2 = aNT.f(kn_02, dk_1.a(properties, aL0.c(aL0.a(new StringBuilder(), Gj.i), n3).toString()));
            if (a0W2 == null) {
                a0W2 = this.a(properties, n3);
            }
            aga_1 aga_12 = new aga_1(resourceLocation, nArray, nArray2, il_0Array, a0W2);
            ListInvoker.add(arrayList, aga_12);
            ++n2;
        }
        aga_1[] aga_1Array = (aga_1[])ListInvoker.toArray(arrayList, new aga_1[ListInvoker.size(arrayList)]);
        return aga_1Array;
    }
}

