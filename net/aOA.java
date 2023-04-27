/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapsInvoker;
import deobf.EntityPlayer;
import java.util.List;
import java.util.Map;
import net.PL;
import net.adq_1;
import net.anw_0;
import net.asb_1;
import net.ye_0;
import net.yz_0;

public interface aOA {
    public static Map<String, aOA> c = MapsInvoker.a();
    public static aOA d;
    public static aOA e;
    public static aOA[] f;
    public static aOA a;
    public static aOA g;
    public static aOA h;
    public static aOA b;
    public static aOA[] i;

    public int a(List<EntityPlayer> var1);

    static {
        g = new ye_0(adq_1.g);
        b = new ye_0(adq_1.n);
        d = new ye_0(adq_1.I);
        e = new ye_0(adq_1.J);
        h = new ye_0(adq_1.t);
        a = new yz_0(adq_1.s);
        i = new aOA[]{new asb_1(adq_1.c, anw_0.BLACK), new asb_1(adq_1.H, anw_0.DARK_BLUE), new asb_1(adq_1.K, anw_0.DARK_GREEN), new asb_1(adq_1.k, anw_0.DARK_AQUA), new asb_1(adq_1.E, anw_0.DARK_RED), new asb_1(adq_1.L, anw_0.DARK_PURPLE), new asb_1(adq_1.v, anw_0.GOLD), new asb_1(adq_1.A, anw_0.GRAY), new asb_1(adq_1.b, anw_0.DARK_GRAY), new asb_1(adq_1.q, anw_0.BLUE), new asb_1(adq_1.D, anw_0.GREEN), new asb_1(adq_1.h, anw_0.AQUA), new asb_1(adq_1.x, anw_0.RED), new asb_1(adq_1.p, anw_0.LIGHT_PURPLE), new asb_1(adq_1.d, anw_0.YELLOW), new asb_1(adq_1.w, anw_0.WHITE)};
        f = new aOA[]{new asb_1(adq_1.y, anw_0.BLACK), new asb_1(adq_1.C, anw_0.DARK_BLUE), new asb_1(adq_1.z, anw_0.DARK_GREEN), new asb_1(adq_1.u, anw_0.DARK_AQUA), new asb_1(adq_1.B, anw_0.DARK_RED), new asb_1(adq_1.e, anw_0.DARK_PURPLE), new asb_1(adq_1.a, anw_0.GOLD), new asb_1(adq_1.l, anw_0.GRAY), new asb_1(adq_1.f, anw_0.DARK_GRAY), new asb_1(adq_1.i, anw_0.BLUE), new asb_1(adq_1.r, anw_0.GREEN), new asb_1(adq_1.m, anw_0.AQUA), new asb_1(adq_1.j, anw_0.RED), new asb_1(adq_1.o, anw_0.LIGHT_PURPLE), new asb_1(adq_1.G, anw_0.YELLOW), new asb_1(adq_1.F, anw_0.WHITE)};
    }

    public boolean c();

    public PL b();

    public String a();
}

