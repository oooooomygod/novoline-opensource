/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import net.NBTTagCompound;
import net.aS0;
import net.akp_0;
import net.atj_0;
import net.dz_0;
import net.tn_0;
import net.wb_2;
import net.xg_1;

/*
 * Renamed from net.w_
 */
public class w__0 {
    private TreeMap a = new TreeMap();
    private static String b = "CL_00000136";

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0003w&@@ \u0012p\nJF".toCharArray();
        int n2 = 0;
        int n3 = 40;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x68));
            n3 = n3;
        }
    }

    public NBTTagCompound a() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        Iterator iterator = aS0.f(atj_0.a(this.a));
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            xg_1 xg_12 = (xg_1)atj_0.b(this.a, object);
            tn_0.a(nBTTagCompound, (String)object, xg_12.a());
        }
        return nBTTagCompound;
    }

    public w__0() {
        this.a(akp_0.y, akp_0.h, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.p, akp_0.q, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.k, akp_0.u, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.a, akp_0.w, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.e, akp_0.g, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.b, akp_0.B, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.A, akp_0.m, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.i, akp_0.s, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.t, akp_0.l, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.n, akp_0.v, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.z, akp_0.C, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.d, akp_0.x, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.f, akp_0.r, wb_2.NUMERICAL_VALUE);
        this.a(akp_0.o, akp_0.c, wb_2.BOOLEAN_VALUE);
        this.a(akp_0.j, akp_0.E, wb_2.BOOLEAN_VALUE);
    }

    public boolean a(String string) {
        xg_1 xg_12 = (xg_1)atj_0.b(this.a, string);
        return xg_12.c();
    }

    public boolean a(String string, wb_2 wb_22) {
        xg_1 xg_12 = (xg_1)atj_0.b(this.a, string);
        return xg_12.d() == wb_22 || wb_22 == wb_2.ANY_VALUE;
    }

    public void a(String string, String string2) {
        xg_1 xg_12 = (xg_1)atj_0.b(this.a, string);
        xg_12.a(string2);
    }

    public String b(String string) {
        xg_1 xg_12 = (xg_1)atj_0.b(this.a, string);
        return xg_12.a();
    }

    public String[] b() {
        Set set = atj_0.a(this.a);
        return (String[])aS0.a(set, new String[aS0.d(set)]);
    }

    public void a(NBTTagCompound nBTTagCompound) {
        Iterator iterator = aS0.f(tn_0.c(nBTTagCompound));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            String string2 = nBTTagCompound.k(string);
            this.a(string, string2);
        }
    }

    public boolean c(String string) {
        return atj_0.c(this.a, string);
    }

    public void a(String string, String string2, wb_2 wb_22) {
        atj_0.a(this.a, string, new xg_1(string2, wb_22));
    }

    public int d(String string) {
        xg_1 xg_12 = (xg_1)atj_0.b(this.a, string);
        return xg_12.b();
    }
}

