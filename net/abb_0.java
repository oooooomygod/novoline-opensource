/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.IAttribute;
import deobf.NBTTagList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import net.AttributeModifier;
import net.Ma;
import net.NBTTagCompound;
import net.S_;
import net.VO;
import net.a2b_0;
import net.aHx;
import net.aL0;
import net.ahw_2;
import net.awc_1;
import net.ch_2;
import net.dc_0;
import net.dz_0;
import net.ht_0;
import net.kv_0;
import net.ms_0;
import net.ow_0;
import net.tn_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.aBb
 */
public class abb_0 {
    private static Logger a = LogManagerInvoker.c();
    public static IAttribute f;
    public static IAttribute c;
    public static IAttribute d;
    public static IAttribute e;
    public static IAttribute b;

    public static AttributeModifier a(NBTTagCompound nBTTagCompound) {
        UUID uUID = new UUID(tn_0.f(nBTTagCompound, a2b_0.C), tn_0.f(nBTTagCompound, a2b_0.B));
        try {
            return new AttributeModifier(uUID, tn_0.m(nBTTagCompound, a2b_0.i), tn_0.n(nBTTagCompound, a2b_0.k), tn_0.g(nBTTagCompound, a2b_0.j));
        }
        catch (Exception exception) {
            LoggerInvoker.warn(a, aL0.a(aL0.a(new StringBuilder(), a2b_0.v), ch_2.b(exception)).toString());
            return null;
        }
    }

    static {
        b = aHx.a(aHx.a(new S_(null, a2b_0.z, 20.0, 0.0, 1024.0), a2b_0.a), true);
        c = aHx.a(new S_(null, a2b_0.t, 32.0, 0.0, 2048.0), a2b_0.s);
        d = aHx.a(new S_(null, a2b_0.D, 0.0, 0.0, 1.0), a2b_0.g);
        e = aHx.a(aHx.a(new S_(null, a2b_0.q, 0.7f, 0.0, 1024.0), a2b_0.u), true);
        f = new S_(null, a2b_0.n, 2.0, 0.0, 2048.0);
    }

    private static void a(ahw_2 ahw_22, NBTTagCompound nBTTagCompound) {
        Ma.a(ahw_22, tn_0.n(nBTTagCompound, a2b_0.e));
        if (tn_0.a(nBTTagCompound, a2b_0.x, 9)) {
            NBTTagList nBTTagList = tn_0.c(nBTTagCompound, a2b_0.o, 10);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                AttributeModifier attributeModifier = abb_0.a(kv_0.g(nBTTagList, i));
                AttributeModifier attributeModifier2 = Ma.a(ahw_22, ow_0.a(attributeModifier));
                Ma.b(ahw_22, attributeModifier2);
                Ma.a(ahw_22, attributeModifier);
            }
        }
    }

    private static NBTTagCompound a(ahw_2 ahw_22) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        IAttribute iAttribute = Ma.c(ahw_22);
        tn_0.a(nBTTagCompound, a2b_0.l, dc_0.c(iAttribute));
        tn_0.a(nBTTagCompound, a2b_0.h, Ma.b(ahw_22));
        Collection collection = Ma.a(ahw_22);
        if (!ms_0.c(collection)) {
            NBTTagList nBTTagList = new NBTTagList();
            Iterator iterator = ms_0.a(collection);
            while (dz_0.c(iterator)) {
                AttributeModifier attributeModifier = (AttributeModifier)dz_0.b(iterator);
                if (!ow_0.c(attributeModifier)) continue;
                kv_0.a(nBTTagList, abb_0.a(attributeModifier));
            }
            tn_0.a(nBTTagCompound, a2b_0.m, nBTTagList);
        }
        return nBTTagCompound;
    }

    public static void a(VO vO, NBTTagList nBTTagList) {
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
            ahw_2 ahw_22 = ht_0.a(vO, tn_0.m(nBTTagCompound, a2b_0.d));
            abb_0.a(ahw_22, nBTTagCompound);
        }
    }

    public static NBTTagList a(VO vO) {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = ms_0.a(ht_0.a(vO));
        while (dz_0.c(iterator)) {
            ahw_2 ahw_22 = (ahw_2)dz_0.b(iterator);
            kv_0.a(nBTTagList, abb_0.a(ahw_22));
        }
        return nBTTagList;
    }

    private static NBTTagCompound a(AttributeModifier attributeModifier) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, a2b_0.f, ow_0.e(attributeModifier));
        tn_0.a(nBTTagCompound, a2b_0.y, ow_0.d(attributeModifier));
        tn_0.b(nBTTagCompound, a2b_0.r, ow_0.b(attributeModifier));
        tn_0.a(nBTTagCompound, a2b_0.b, awc_1.b(ow_0.a(attributeModifier)));
        tn_0.a(nBTTagCompound, a2b_0.c, awc_1.a(ow_0.a(attributeModifier)));
        return nBTTagCompound;
    }
}

