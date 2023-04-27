/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTTagList;
import net.NBTTagCompound;
import net.a46;
import net.aBA;
import net.ct_2;
import net.ea_2;
import net.tn_0;

/*
 * Renamed from net.aOn
 */
public class aon_0 {
    public static void a(ea_2 ea_22, NBTTagCompound nBTTagCompound, ct_2 ct_22) {
        tn_0.b(nBTTagCompound, a46.a, ea_22.j);
        tn_0.b(nBTTagCompound, a46.u, ea_22.l);
        tn_0.a(nBTTagCompound, a46.g, ea_22.d);
        int[] nArray = new int[ea_22.e.length];
        for (int i = 0; i < ea_22.e.length; ++i) {
            nArray[i] = ea_22.e[i];
        }
        tn_0.a(nBTTagCompound, a46.j, nArray);
        tn_0.a(nBTTagCompound, a46.h, ea_22.a);
        NBTTagList nBTTagList = new NBTTagList();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4 = 0;
            int n5 = n2 << 11 | n4 << 7 | n3 + (n << 4);
            byte cfr_ignored_0 = ea_22.b[n5];
            ++n3;
        }
    }

    private static ClassCastException a(ClassCastException classCastException) {
        return classCastException;
    }

    public static ea_2 a(NBTTagCompound nBTTagCompound) {
        int n = tn_0.g(nBTTagCompound, a46.i);
        int n2 = tn_0.g(nBTTagCompound, a46.q);
        ea_2 ea_22 = new ea_2(n, n2);
        ea_22.b = tn_0.j(nBTTagCompound, a46.B);
        ea_22.g = new aBA(tn_0.j(nBTTagCompound, a46.A), 7);
        ea_22.f = new aBA(tn_0.j(nBTTagCompound, a46.x), 7);
        ea_22.k = new aBA(tn_0.j(nBTTagCompound, a46.e), 7);
        ea_22.e = tn_0.j(nBTTagCompound, a46.o);
        ea_22.a = tn_0.c(nBTTagCompound, a46.c);
        ea_22.c = tn_0.c(nBTTagCompound, a46.r, 10);
        ea_22.i = tn_0.c(nBTTagCompound, a46.z, 10);
        ea_22.h = tn_0.c(nBTTagCompound, a46.y, 10);
        try {
            ea_22.d = tn_0.f(nBTTagCompound, a46.d);
        }
        catch (ClassCastException classCastException) {
            ea_22.d = tn_0.g(nBTTagCompound, a46.v);
        }
        return ea_22;
    }
}

