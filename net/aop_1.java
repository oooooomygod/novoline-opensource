/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.StatBase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from net.aoP
 */
public class aop_1 {
    public static StatBase r;
    public static StatBase[] V;
    public static StatBase E;
    public static StatBase ac;
    public static StatBase[] x;
    public static StatBase S;
    public static StatBase Y;
    public static StatBase Q;
    public static StatBase d;
    public static StatBase P;
    public static StatBase s;
    public static List<aH_> q;
    public static StatBase k;
    public static StatBase R;
    public static StatBase aa;
    public static StatBase j;
    public static StatBase J;
    public static StatBase e;
    public static StatBase ab;
    public static StatBase f;
    public static StatBase C;
    public static StatBase N;
    public static StatBase n;
    public static StatBase a;
    public static StatBase z;
    protected static Map<String, StatBase> H;
    public static StatBase b;
    public static StatBase T;
    public static StatBase L;
    public static StatBase F;
    public static StatBase m;
    public static List<StatBase> g;
    public static StatBase[] v;
    public static StatBase[] p;
    public static StatBase y;
    public static StatBase Z;
    public static StatBase h;
    public static StatBase K;
    public static StatBase l;
    public static StatBase B;
    public static StatBase A;
    public static StatBase D;
    public static StatBase U;
    public static StatBase I;
    public static StatBase G;
    public static StatBase u;
    public static List<StatBase> o;
    public static StatBase O;
    public static StatBase w;
    public static StatBase W;
    public static StatBase i;
    public static StatBase X;
    public static StatBase c;
    public static StatBase M;
    public static StatBase ad;
    public static StatBase t;
    public static List<aH_> ae;

    private static void a(StatBase[] statBaseArray) {
        aop_1.a(statBaseArray, Blocks.water, Blocks.flowing_water);
        aop_1.a(statBaseArray, Blocks.lava, Blocks.flowing_lava);
        aop_1.a(statBaseArray, Blocks.a1, Blocks.ap);
        aop_1.a(statBaseArray, Blocks.a, Blocks.ab);
        aop_1.a(statBaseArray, Blocks.b4, Blocks.b5);
        aop_1.a(statBaseArray, Blocks.ci, Blocks.aP);
        aop_1.a(statBaseArray, Blocks.bk, Blocks.bR);
        aop_1.a(statBaseArray, Blocks.br, Blocks.i);
        aop_1.a(statBaseArray, Blocks.f, Blocks.M);
        aop_1.a(statBaseArray, Blocks.X, Blocks.bA);
        aop_1.a(statBaseArray, Blocks.a_, Blocks.e);
        aop_1.a(statBaseArray, Blocks.ah, Blocks.bf);
        aop_1.a(statBaseArray, Blocks.grass, Blocks.dirt);
        aop_1.a(statBaseArray, Blocks.al, Blocks.dirt);
    }

    private static void b() {
        Iterator iterator = aLP.a(Item.k);
        while (dz_0.c(iterator)) {
            Item item = (Item)dz_0.b(iterator);
            int n = px_0.a(item);
            String string = aop_1.a(item);
            if (!px_0.i(item)) continue;
            aop_1.x[n] = alp_1.b(new aH_(agq_2.aM, string, new aoz_1(agq_2.ag, act_2.B(new ItemStack(item))), item));
        }
        aop_1.a(x);
    }

    private static String a(Item item) {
        ResourceLocation resourceLocation = (ResourceLocation)aLP.c(Item.k, item);
        return StringInvoker.a(resourceLocation.toString(), ':', '.');
    }

    public static StatBase a(String string) {
        return (StatBase)MapInvoker.c(H, string);
    }

    private static void a(StatBase[] statBaseArray, Block block, Block block2) {
        int n = BlocksInvoker.v(block);
        int n2 = BlocksInvoker.v(block2);
        if (statBaseArray[n] != null && statBaseArray[n2] == null) {
            statBaseArray[n2] = statBaseArray[n];
        } else {
            ListInvoker.remove(o, statBaseArray[n]);
            ListInvoker.remove(q, statBaseArray[n]);
            ListInvoker.remove(g, statBaseArray[n]);
            statBaseArray[n] = statBaseArray[n2];
        }
    }

    public static void a() {
        aop_1.c();
        aop_1.e();
        aop_1.b();
        aop_1.d();
        apf_0.a();
        ub_1.b();
    }

    public static StatBase a(a9Q a9Q2) {
        ub_1.a(a9Q2.c);
        return null;
    }

    static {
        H = MapsInvoker.a();
        o = my_0.c();
        g = my_0.c();
        ae = my_0.c();
        q = my_0.c();
        J = NW.f(ac4.a(new aH0(agq_2.au, new aoz_1(agq_2.aY, new Object[0]))));
        ad = NW.f(ac4.a(new aH0(agq_2.c, new aoz_1(agq_2.p, new Object[0]), StatBase.f)));
        w = NW.f(ac4.a(new aH0(agq_2.I, new aoz_1(agq_2.B, new Object[0]), StatBase.f)));
        d = NW.f(ac4.a(new aH0(agq_2.ay, new aoz_1(agq_2.g, new Object[0]), StatBase.d)));
        z = NW.f(ac4.a(new aH0(agq_2.a6, new aoz_1(agq_2.aP, new Object[0]), StatBase.d)));
        a = NW.f(ac4.a(new aH0(agq_2.r, new aoz_1(agq_2.aw, new Object[0]), StatBase.d)));
        Y = NW.f(ac4.a(new aH0(agq_2.aK, new aoz_1(agq_2.aL, new Object[0]), StatBase.d)));
        Z = NW.f(ac4.a(new aH0(agq_2.a1, new aoz_1(agq_2.aW, new Object[0]), StatBase.d)));
        C = NW.f(ac4.a(new aH0(agq_2.ak, new aoz_1(agq_2.aS, new Object[0]), StatBase.d)));
        D = NW.f(ac4.a(new aH0(agq_2.a2, new aoz_1(agq_2.i, new Object[0]), StatBase.d)));
        s = NW.f(ac4.a(new aH0(agq_2.aO, new aoz_1(agq_2.aH, new Object[0]), StatBase.d)));
        K = NW.f(ac4.a(new aH0(agq_2.F, new aoz_1(agq_2.ar, new Object[0]), StatBase.d)));
        e = NW.f(ac4.a(new aH0(agq_2.ab, new aoz_1(agq_2.ah, new Object[0]), StatBase.d)));
        m = NW.f(ac4.a(new aH0(agq_2.y, new aoz_1(agq_2.L, new Object[0]), StatBase.d)));
        X = NW.f(ac4.a(new aH0(agq_2.n, new aoz_1(agq_2.ao, new Object[0]), StatBase.d)));
        k = NW.f(ac4.a(new aH0(agq_2.aB, new aoz_1(agq_2.an, new Object[0]))));
        l = NW.f(ac4.a(new aH0(agq_2.t, new aoz_1(agq_2.S, new Object[0]))));
        i = ac4.b(new aH0(agq_2.f, new aoz_1(agq_2.k, new Object[0]), StatBase.g));
        O = ac4.b(new aH0(agq_2.at, new aoz_1(agq_2.a5, new Object[0]), StatBase.g));
        ac = ac4.b(new aH0(agq_2.P, new aoz_1(agq_2.Z, new Object[0])));
        y = ac4.b(new aH0(agq_2.V, new aoz_1(agq_2.E, new Object[0])));
        r = ac4.b(new aH0(agq_2.aJ, new aoz_1(agq_2.v, new Object[0])));
        j = ac4.b(new aH0(agq_2.az, new aoz_1(agq_2.as, new Object[0])));
        L = ac4.b(new aH0(agq_2.H, new aoz_1(agq_2.aa, new Object[0])));
        W = ac4.b(new aH0(agq_2.aR, new aoz_1(agq_2.w, new Object[0])));
        B = ac4.b(new aH0(agq_2.m, new aoz_1(agq_2.aU, new Object[0])));
        T = ac4.b(new aH0(agq_2.ap, new aoz_1(agq_2.K, new Object[0])));
        t = ac4.b(new aH0(agq_2.M, new aoz_1(agq_2.J, new Object[0])));
        M = ac4.b(new aH0(agq_2.aI, new aoz_1(agq_2.aT, new Object[0])));
        N = ac4.b(new aH0(agq_2.j, new aoz_1(agq_2.af, new Object[0])));
        F = ac4.b(new aH0(agq_2.aN, new aoz_1(agq_2.ad, new Object[0])));
        A = ac4.b(new aH0(agq_2.s, new aoz_1(agq_2.e, new Object[0])));
        h = ac4.b(new aH0(agq_2.N, new aoz_1(agq_2.q, new Object[0])));
        b = ac4.b(new aH0(agq_2.O, new aoz_1(agq_2.Y, new Object[0])));
        aa = ac4.b(new aH0(agq_2.aC, new aoz_1(agq_2.A, new Object[0])));
        u = ac4.b(new aH0(agq_2.X, new aoz_1(agq_2.aV, new Object[0])));
        n = ac4.b(new aH0(agq_2.aQ, new aoz_1(agq_2.o, new Object[0])));
        ab = ac4.b(new aH0(agq_2.x, new aoz_1(agq_2.ae, new Object[0])));
        P = ac4.b(new aH0(agq_2.am, new aoz_1(agq_2.a4, new Object[0])));
        Q = ac4.b(new aH0(agq_2.b, new aoz_1(agq_2.aF, new Object[0])));
        c = ac4.b(new aH0(agq_2.aE, new aoz_1(agq_2.av, new Object[0])));
        G = ac4.b(new aH0(agq_2.h, new aoz_1(agq_2.al, new Object[0])));
        I = ac4.b(new aH0(agq_2.W, new aoz_1(agq_2.l, new Object[0])));
        f = ac4.b(new aH0(agq_2.aG, new aoz_1(agq_2.U, new Object[0])));
        S = ac4.b(new aH0(agq_2.G, new aoz_1(agq_2.a0, new Object[0])));
        U = ac4.b(new aH0(agq_2.ac, new aoz_1(agq_2.T, new Object[0])));
        R = ac4.b(new aH0(agq_2.a7, new aoz_1(agq_2.d, new Object[0])));
        E = ac4.b(new aH0(agq_2.Q, new aoz_1(agq_2.aZ, new Object[0])));
        v = new StatBase[4096];
        V = new StatBase[32000];
        p = new StatBase[32000];
        x = new StatBase[32000];
    }

    private static void d() {
        Object object;
        HashSet hashSet = axe_2.a();
        Iterator iterator = ListInvoker.iterator(am5_0.a(am5_0.c()));
        while (dz_0.c(iterator)) {
            object = (aiy_2)dz_0.b(iterator);
            if (di_1.a((aiy_2)object) == null) continue;
            aS0.b((Set)hashSet, act_2.k(di_1.a((aiy_2)object)));
        }
        iterator = ms_0.a(a3q_0.a(a3q_0.a()).values());
        while (dz_0.c(iterator)) {
            object = (ItemStack)dz_0.b(iterator);
            aS0.b((Set)hashSet, act_2.k((ItemStack)object));
        }
        iterator = aS0.f(hashSet);
        while (dz_0.c(iterator)) {
            object = (Item)dz_0.b(iterator);
            int n = px_0.a((Item)object);
            String string = aop_1.a((Item)object);
            aop_1.V[n] = alp_1.b(new aH_(agq_2.aq, string, new aoz_1(agq_2.aA, act_2.B(new ItemStack((Item)object))), (Item)object));
        }
        MCInvoker.f().f = awd_0.a();
        aop_1.a(V);
    }

    public static StatBase b(a9Q a9Q2) {
        ub_1.a(a9Q2.c);
        return null;
    }

    private static void e() {
        Iterator iterator = aLP.a(Item.k);
        while (dz_0.c(iterator)) {
            Item item = (Item)dz_0.b(iterator);
            int n = px_0.a(item);
            String string = aop_1.a(item);
            aop_1.p[n] = alp_1.b(new aH_(agq_2.ai, string, new aoz_1(agq_2.aD, act_2.B(new ItemStack(item))), item));
            if (item instanceof ItemBlock) continue;
            ListInvoker.add(ae, (aH_)p[n]);
        }
        aop_1.a(p);
    }

    private static void c() {
        Iterator iterator = a82.a(Block.m);
        while (dz_0.c(iterator)) {
            Block block = (Block)dz_0.b(iterator);
            Item item = px_0.a(block);
            int n = BlocksInvoker.v(block);
            String string = aop_1.a(item);
            if (!BlocksInvoker.w(block)) continue;
            aop_1.v[n] = alp_1.b(new aH_(agq_2.aX, string, new aoz_1(agq_2.ax, act_2.B(new ItemStack(block))), item));
            ListInvoker.add(q, (aH_)v[n]);
        }
        aop_1.a(v);
    }
}

