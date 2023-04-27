/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Joiner
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.renderer.texture.TextureMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.apY
 */
public class apy_1 {
    private static aBU m;
    private atF r;
    private Map<String, ResourceLocation> t;
    private Map<Item, List<String>> q;
    private static aBU n;
    private static Set<ResourceLocation> l;
    private Map<ResourceLocation, aBU> h;
    private Map<ResourceLocation, KM> a = MapsInvoker.a();
    private static aBU e;
    private apm_1 j;
    private aI_ g;
    private static Logger u;
    private Map<ResourceLocation, asr_2> f;
    private Map<aRJ, a38> k;
    protected static aRJ d;
    private x9_0 p;
    private static aBU i;
    private static Joiner c;
    private TextureMap o;
    private zg_2<aRJ, JE> b;
    private static Map<String, String> s;

    static {
        u = LogManagerInvoker.c();
        l = axe_2.a(new ResourceLocation[]{new ResourceLocation(a3e_0.dR), new ResourceLocation(a3e_0.dC), new ResourceLocation(a3e_0.w), new ResourceLocation(a3e_0.y), new ResourceLocation(a3e_0.O), new ResourceLocation(a3e_0.l), new ResourceLocation(a3e_0.aJ), new ResourceLocation(a3e_0.cb), new ResourceLocation(a3e_0.bn), new ResourceLocation(a3e_0.cK), new ResourceLocation(a3e_0.cz), new ResourceLocation(a3e_0.a2), new ResourceLocation(a3e_0.cW), new ResourceLocation(a3e_0.bx), new ResourceLocation(a3e_0.aa), new ResourceLocation(a3e_0.ay), new ResourceLocation(a3e_0.b1), new ResourceLocation(a3e_0.bg)});
        d = new aRJ(a3e_0.dK, a3e_0.b9);
        s = MapsInvoker.a();
        c = aSB.a(a3e_0.aH);
        e = ayl_0.a(a3e_0.aw);
        i = ayl_0.a(a3e_0.c9);
        m = ayl_0.a(a3e_0.c8);
        n = ayl_0.a(a3e_0.aW);
        MapInvoker.c(s, a3e_0.a7, a3e_0.dG);
        apy_1.e.i = a3e_0.ax;
        apy_1.i.i = a3e_0.bw;
        apy_1.m.i = a3e_0.bE;
        apy_1.n.i = a3e_0.dT;
    }

    private void lambda$loadSprites$0(Set set, TextureMap textureMap) {
        Iterator iterator = aS0.f(set);
        while (dz_0.c(iterator)) {
            ResourceLocation resourceLocation = (ResourceLocation)dz_0.b(iterator);
            MapInvoker.c(this.a, resourceLocation, h9.a(textureMap, resourceLocation));
        }
    }

    private void h() {
        MapInvoker.c(this.q, px_0.a(Blocks.stone), my_0.a(new String[]{a3e_0.bz, a3e_0.ca, a3e_0.ae, a3e_0.bI, a3e_0.bT, a3e_0.aU, a3e_0.bt}));
        MapInvoker.c(this.q, px_0.a(Blocks.dirt), my_0.a(new String[]{a3e_0.cZ, a3e_0.cG, a3e_0.aj}));
        MapInvoker.c(this.q, px_0.a(Blocks.planks), my_0.a(new String[]{a3e_0.az, a3e_0.c3, a3e_0.ch, a3e_0.cM, a3e_0.aI, a3e_0.c4}));
        MapInvoker.c(this.q, px_0.a(Blocks.sapling), my_0.a(new String[]{a3e_0.aF, a3e_0.cu, a3e_0.dz, a3e_0.v, a3e_0.dH, a3e_0.cq}));
        MapInvoker.c(this.q, px_0.a(Blocks.sand), my_0.a(new String[]{a3e_0.V, a3e_0.I}));
        MapInvoker.c(this.q, px_0.a(Blocks.b2), my_0.a(new String[]{a3e_0.aQ, a3e_0.bB, a3e_0.bh, a3e_0.E}));
        MapInvoker.c(this.q, px_0.a(Blocks.bP), my_0.a(new String[]{a3e_0.co, a3e_0.dp, a3e_0.bo, a3e_0.ah}));
        MapInvoker.c(this.q, px_0.a(Blocks.aM), my_0.a(new String[]{a3e_0.b5, a3e_0.bq}));
        MapInvoker.c(this.q, px_0.a(Blocks.bG), my_0.a(new String[]{a3e_0.U, a3e_0.a5, a3e_0.dm}));
        MapInvoker.c(this.q, px_0.a(Blocks.r), my_0.a(new String[]{a3e_0.k, a3e_0.cX, a3e_0.aM}));
        MapInvoker.c(this.q, px_0.a(Blocks.bN), my_0.a(new String[]{a3e_0.al, a3e_0.dr, a3e_0.bf}));
        MapInvoker.c(this.q, px_0.a(Blocks.ca), my_0.a(new String[]{a3e_0.aP}));
        MapInvoker.c(this.q, px_0.a(Blocks.b_), my_0.a(new String[]{a3e_0.dk, a3e_0.bl, a3e_0.L, a3e_0.aE, a3e_0.aN, a3e_0.P, a3e_0.e, a3e_0.dw, a3e_0.bA, a3e_0.cP, a3e_0.cY, a3e_0.dF, a3e_0.dt, a3e_0.c0, a3e_0.bX, a3e_0.bk}));
        MapInvoker.c(this.q, px_0.a(Blocks.G), my_0.a(new String[]{a3e_0.b}));
        MapInvoker.c(this.q, px_0.a(Blocks.bY), my_0.a(new String[]{a3e_0.cf, a3e_0.aB, a3e_0.Z, a3e_0.bM, a3e_0.bP, a3e_0.aL, a3e_0.cV, a3e_0.a9, a3e_0.br}));
        MapInvoker.c(this.q, px_0.a(Blocks.bA), my_0.a(new String[]{a3e_0.bj, a3e_0.aG, a3e_0.aO, a3e_0.b2, a3e_0.dl, a3e_0.bL, a3e_0.bY}));
        MapInvoker.c(this.q, px_0.a(Blocks.bf), my_0.a(new String[]{a3e_0.du}));
        MapInvoker.c(this.q, px_0.a(Blocks.am), my_0.a(new String[]{a3e_0.dg, a3e_0.cA, a3e_0.cm, a3e_0.c6, a3e_0.bv, a3e_0.dO, a3e_0.cw, a3e_0.dU, a3e_0.ao, a3e_0.q, a3e_0.r, a3e_0.ck, a3e_0.bN, a3e_0.cS, a3e_0.dn, a3e_0.bR}));
        MapInvoker.c(this.q, px_0.a(Blocks.bV), my_0.a(new String[]{a3e_0.dA, a3e_0.aX, a3e_0.a8, a3e_0.cC, a3e_0.c1, a3e_0.N}));
        MapInvoker.c(this.q, px_0.a(Blocks.z), my_0.a(new String[]{a3e_0.dX, a3e_0.a6, a3e_0.bW, a3e_0.bQ}));
        MapInvoker.c(this.q, px_0.a(Blocks.e), my_0.a(new String[]{a3e_0.Q, a3e_0.dh, a3e_0.dJ, a3e_0.bU, a3e_0.t, a3e_0.dD}));
        MapInvoker.c(this.q, px_0.a(Blocks.w), my_0.a(new String[]{a3e_0.dM, a3e_0.aT}));
        MapInvoker.c(this.q, px_0.a(Blocks.J), my_0.a(new String[]{a3e_0.ad, a3e_0.bK, a3e_0.d}));
        MapInvoker.c(this.q, px_0.a(Blocks.v), my_0.a(new String[]{a3e_0.a4, a3e_0.f, a3e_0.di}));
        MapInvoker.c(this.q, px_0.a(Blocks.cr), my_0.a(new String[]{a3e_0.T, a3e_0.dc, a3e_0.bu, a3e_0.cI, a3e_0.cj, a3e_0.i, a3e_0.bD, a3e_0.cy, a3e_0.dS, a3e_0.bC, a3e_0.b_, a3e_0.bG, a3e_0.an, a3e_0.aR, a3e_0.cp, a3e_0.cn}));
        MapInvoker.c(this.q, px_0.a(Blocks.ad), my_0.a(new String[]{a3e_0.by, a3e_0.ab, a3e_0.aA, a3e_0.S, a3e_0.cT, a3e_0.de, a3e_0.b8, a3e_0.dy, a3e_0.ct, a3e_0.aK, a3e_0.db, a3e_0.c2, a3e_0.h, a3e_0.R, a3e_0.au, a3e_0.bb}));
        MapInvoker.c(this.q, px_0.a(Blocks.bM), my_0.a(new String[]{a3e_0.cF, a3e_0.be}));
        MapInvoker.c(this.q, px_0.a(Blocks.bO), my_0.a(new String[]{a3e_0.aC, a3e_0.c}));
        MapInvoker.c(this.q, px_0.a(Blocks.aD), my_0.a(new String[]{a3e_0.as, a3e_0.cg, a3e_0.p}));
        MapInvoker.c(this.q, px_0.a(Blocks.bl), my_0.a(new String[]{a3e_0.dQ, a3e_0.a0, a3e_0.o, a3e_0.G, a3e_0.u, a3e_0.cs, a3e_0.aD, a3e_0.df, a3e_0.cU, a3e_0.dW, a3e_0.ar, a3e_0.dv, a3e_0.cr, a3e_0.cO, a3e_0.ai, a3e_0.am}));
        MapInvoker.c(this.q, px_0.a(Blocks.ai), my_0.a(new String[]{a3e_0.s, a3e_0.dV, a3e_0.n, a3e_0.aq, a3e_0.m, a3e_0.H}));
        MapInvoker.c(this.q, Items.bow, my_0.a(new String[]{a3e_0.cx, a3e_0.cQ, a3e_0.a, a3e_0.dI}));
        MapInvoker.c(this.q, Items.coal, my_0.a(new String[]{a3e_0.cL, a3e_0.B}));
        MapInvoker.c(this.q, Items.fishing_rod, my_0.a(new String[]{a3e_0.K, a3e_0.a3}));
        MapInvoker.c(this.q, Items.fish, my_0.a(new String[]{a3e_0.cv, a3e_0.cD, a3e_0.av, a3e_0.D}));
        MapInvoker.c(this.q, Items.cooked_fish, my_0.a(new String[]{a3e_0.ap, a3e_0.cl}));
        MapInvoker.c(this.q, Items.dye, my_0.a(new String[]{a3e_0.M, a3e_0.X, a3e_0.bF, a3e_0.dP, a3e_0.b0, a3e_0.cR, a3e_0.ak, a3e_0.bm, a3e_0.dE, a3e_0.a_, a3e_0.A, a3e_0.bZ, a3e_0.bS, a3e_0.bs, a3e_0.b4, a3e_0.j}));
        MapInvoker.c(this.q, Items.potionitem, my_0.a(new String[]{a3e_0.bd, a3e_0.c_}));
        MapInvoker.c(this.q, Items.skull, my_0.a(new String[]{a3e_0.bO, a3e_0.bp, a3e_0.aY, a3e_0.cB, a3e_0.a1}));
        MapInvoker.c(this.q, px_0.a(Blocks.ch), my_0.a(new String[]{a3e_0.cN}));
        MapInvoker.c(this.q, px_0.a(Blocks.Z), my_0.a(new String[]{a3e_0.dd}));
        MapInvoker.c(this.q, Items.oak_door, my_0.a(new String[]{a3e_0.da}));
    }

    private ResourceLocation f(ResourceLocation resourceLocation) {
        Iterator iterator = aS0.f(MapInvoker.b(this.h));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            aBU aBU2 = (aBU)FG.a(entry);
            if (!resourceLocation.equals(ayl_0.d(aBU2))) continue;
            return (ResourceLocation)FG.b(entry);
        }
        return null;
    }

    private void j() {
        Iterator iterator = aS0.f(MapInvoker.c(this.k));
        while (dz_0.c(iterator)) {
            aRJ aRJ2 = (aRJ)dz_0.b(iterator);
            Iterator iterator2 = ListInvoker.iterator(aVS.a((a38)MapInvoker.c(this.k, aRJ2)));
            while (dz_0.c(iterator2)) {
                ahs_0 ahs_02 = (ahs_0)dz_0.b(iterator2);
                ResourceLocation resourceLocation = qz_1.d(ahs_02);
                if (MapInvoker.c(this.h, resourceLocation) != null) continue;
                try {
                    aBU aBU2 = this.a(resourceLocation);
                    MapInvoker.c(this.h, resourceLocation, aBU2);
                }
                catch (Exception exception) {
                    LoggerInvoker.b(u, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3e_0.bH), resourceLocation), a3e_0.ci), aRJ2), a3e_0.aZ).toString(), exception);
                }
            }
        }
    }

    private void l() {
        Set<ResourceLocation> set = this.e();
        aS0.a(set, this.g());
        aS0.a(set, TextureMap.x);
        adi_0 adi_02 = arg_0 -> this.lambda$loadSprites$0(set, arg_0);
        h9.a(this.o, this.g, adi_02);
        MapInvoker.c(this.a, new ResourceLocation(a3e_0.cd), h9.a(this.o));
    }

    private void a(asr_2 asr_22, aRJ aRJ2) {
        MapInvoker.c(this.k, aRJ2, to_0.a(asr_22, s9_0.b(aRJ2)));
    }

    private a9Z a(IE iE, aL1 aL12, KM kM, EnumFacing enumFacing, alt_0 alt_02, boolean bl) {
        return abj_1.a(this.p, iE.e, iE.b, aL12, kM, enumFacing, alt_02, iE.c, bl, iE.a);
    }

    private ResourceLocation b(ResourceLocation resourceLocation) {
        return new ResourceLocation(axw_1.a(resourceLocation), aL0.a(aL0.a(aL0.a(new StringBuilder(), a3e_0.dL), axw_1.b(resourceLocation)), a3e_0.F).toString());
    }

    private aBU a(ResourceLocation resourceLocation) throws IOException {
        String string = axw_1.b(resourceLocation);
        if (a3e_0.ag.equals(string)) {
            return e;
        }
        if (a3e_0.ba.equals(string)) {
            return i;
        }
        if (a3e_0.bc.equals(string)) {
            return m;
        }
        if (a3e_0.b6.equals(string)) {
            return n;
        }
        if (StringInvoker.e(string, a3e_0.ce)) {
            String string2 = StringInvoker.a(string, StringInvoker.c(a3e_0.dq));
            String string3 = (String)MapInvoker.c(s, string2);
            throw new FileNotFoundException(resourceLocation.toString());
        }
        Object object = j6_0.b(this.g, this.b(resourceLocation));
        InputStreamReader inputStreamReader = new InputStreamReader(dw_0.b((abh_2)object), Charsets.UTF_8);
        try {
            aBU aBU2 = ayl_0.a(inputStreamReader);
            aBU2.i = resourceLocation.toString();
            object = aBU2;
            return object;
        }
        finally {
            aC_.a(inputStreamReader);
        }
    }

    private Set<ResourceLocation> e() {
        HashSet hashSet = axe_2.a();
        ArrayList arrayList = my_0.a(MapInvoker.c(this.k));
        ListInvoker.sort(arrayList, aN_.a(aRJ::toString));
        Iterator iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            aRJ aRJ2 = (aRJ)dz_0.b(iterator);
            a38 a382 = (a38)MapInvoker.c(this.k, aRJ2);
            Iterator iterator2 = ListInvoker.iterator(aVS.a(a382));
            while (dz_0.c(iterator2)) {
                ahs_0 ahs_02 = (ahs_0)dz_0.b(iterator2);
                aBU cfr_ignored_0 = (aBU)MapInvoker.c(this.h, qz_1.d(ahs_02));
                LoggerInvoker.warn(u, aL0.a(aL0.a(new StringBuilder(), a3e_0.bJ), aRJ2).toString());
            }
        }
        aS0.a((Set)hashSet, l);
        return hashSet;
    }

    private void c() {
        Object object;
        Iterator iterator = ms_0.a(this.t.values());
        while (dz_0.c(iterator)) {
            object = (ResourceLocation)dz_0.b(iterator);
            aBU aBU2 = (aBU)MapInvoker.c(this.h, object);
            if (this.a(aBU2)) {
                aBU aBU3 = this.c(aBU2);
                aBU3.i = ((ResourceLocation)object).toString();
                MapInvoker.c(this.h, object, aBU3);
                continue;
            }
            if (!this.b(aBU2)) continue;
            MapInvoker.c(this.h, object, aBU2);
        }
        iterator = ms_0.a(this.a.values());
        while (dz_0.c(iterator)) {
            object = (KM)dz_0.b(iterator);
            if (qg_2.l((KM)object)) continue;
            qg_2.p((KM)object);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private JE a(aBU aBU2, alt_0 alt_02, boolean bl) {
        KM kM = (KM)MapInvoker.c(this.a, new ResourceLocation(ayl_0.b(aBU2, a3e_0.cE)));
        os_2 os_22 = aie_1.a(new os_2(aBU2), kM);
        Iterator iterator = ListInvoker.iterator(ayl_0.b(aBU2));
        while (dz_0.c(iterator)) {
            IE iE = (IE)dz_0.b(iterator);
            Iterator iterator2 = aS0.f(MapInvoker.c(iE.d));
            while (dz_0.c(iterator2)) {
                EnumFacing enumFacing = (EnumFacing)dz_0.b(iterator2);
                aL1 aL12 = (aL1)MapInvoker.c(iE.d, enumFacing);
                KM kM2 = (KM)MapInvoker.c(this.a, new ResourceLocation(ayl_0.b(aBU2, aL12.b)));
                if (aL12.e == null) {
                    aie_1.a(os_22, this.a(iE, aL12, kM2, enumFacing, alt_02, bl));
                    continue;
                }
                aie_1.a(os_22, aD3.a(alt_02, aL12.e), this.a(iE, aL12, kM2, enumFacing, alt_02, bl));
            }
        }
        return aie_1.a(os_22);
    }

    private boolean b(aBU aBU2) {
        return false;
    }

    private void b() {
        this.d();
        Iterator iterator = ms_0.a(this.h.values());
        while (dz_0.c(iterator)) {
            aBU aBU2 = (aBU)dz_0.b(iterator);
            ayl_0.a(aBU2, this.h);
        }
        ayl_0.a(this.h);
    }

    private ResourceLocation a(String string) {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        return new ResourceLocation(axw_1.a(resourceLocation), aL0.a(aL0.a(new StringBuilder(), a3e_0.at), axw_1.b(resourceLocation)).toString());
    }

    private List<ResourceLocation> e(ResourceLocation resourceLocation) {
        ArrayList arrayList = my_0.a(new ResourceLocation[]{resourceLocation});
        ResourceLocation resourceLocation2 = resourceLocation;
        while ((resourceLocation2 = this.f(resourceLocation2)) != null) {
            ListInvoker.add(arrayList, 0, resourceLocation2);
        }
        return arrayList;
    }

    public apy_1(aI_ aI_2, TextureMap textureMap, atF atF2) {
        this.h = MapsInvoker.c();
        this.k = MapsInvoker.c();
        this.p = new x9_0();
        this.j = new apm_1();
        this.b = new zg_2();
        this.t = MapsInvoker.c();
        this.f = MapsInvoker.a();
        this.q = MapsInvoker.b();
        this.g = aI_2;
        this.o = textureMap;
        this.r = atF2;
    }

    private boolean a(aBU aBU2) {
        return false;
    }

    private void i() {
        this.a(awa_0.a(ap__0.a(this.r)).values());
        MapInvoker.c(this.k, d, new a38(s9_0.b(d), my_0.a(new ahs_0[]{new ahs_0(new ResourceLocation(s9_0.a(d)), alt_0.X0_Y0, false, 1)})));
        ResourceLocation resourceLocation = new ResourceLocation(a3e_0.C);
        asr_2 asr_22 = this.d(resourceLocation);
        this.a(asr_22, new aRJ(resourceLocation, a3e_0.W));
        this.a(asr_22, new aRJ(resourceLocation, a3e_0.cc));
        this.j();
        this.a();
    }

    private ResourceLocation c(ResourceLocation resourceLocation) {
        return new ResourceLocation(axw_1.a(resourceLocation), aL0.a(aL0.a(aL0.a(new StringBuilder(), a3e_0.g), axw_1.b(resourceLocation)), a3e_0.x).toString());
    }

    private void a(Collection<aRJ> collection) {
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            aRJ aRJ2 = (aRJ)dz_0.b(iterator);
            try {
                asr_2 asr_22 = this.d(aRJ2);
                try {
                    this.a(asr_22, aRJ2);
                }
                catch (Exception exception) {
                    LoggerInvoker.warn(u, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3e_0.aV), s9_0.b(aRJ2)), a3e_0.af), aRJ2).toString());
                }
            }
            catch (Exception exception) {
                LoggerInvoker.b(u, aL0.a(aL0.a(new StringBuilder(), a3e_0.bV), aRJ2).toString(), exception);
            }
        }
    }

    private Set<ResourceLocation> g() {
        HashSet hashSet = axe_2.a();
        Iterator iterator = ms_0.a(this.t.values());
        while (dz_0.c(iterator)) {
            Object object;
            Object object2;
            Iterator iterator2;
            ResourceLocation resourceLocation = (ResourceLocation)dz_0.b(iterator);
            aBU aBU2 = (aBU)MapInvoker.c(this.h, resourceLocation);
            aS0.b((Set)hashSet, new ResourceLocation(ayl_0.b(aBU2, a3e_0.dx)));
            if (this.a(aBU2)) {
                iterator2 = ListInvoker.iterator(apm_1.a);
                while (dz_0.c(iterator2)) {
                    object2 = (String)dz_0.b(iterator2);
                    object = new ResourceLocation(ayl_0.b(aBU2, (String)object2));
                    if (ayl_0.c(aBU2) == i && !TextureMap.x.equals(object)) {
                        qg_2.b(((ResourceLocation)object).toString());
                    } else if (ayl_0.c(aBU2) == m && !TextureMap.x.equals(object)) {
                        qg_2.a(((ResourceLocation)object).toString());
                    }
                    aS0.b((Set)hashSet, object);
                }
                continue;
            }
            if (this.b(aBU2)) continue;
            iterator2 = ListInvoker.iterator(ayl_0.b(aBU2));
            while (dz_0.c(iterator2)) {
                object2 = (IE)dz_0.b(iterator2);
                object = ms_0.a(((IE)object2).d.values());
                while (dz_0.c((Iterator)object)) {
                    aL1 aL12 = (aL1)dz_0.b((Iterator)object);
                    aS0.b((Set)hashSet, new ResourceLocation(ayl_0.b(aBU2, aL12.b)));
                }
            }
        }
        return hashSet;
    }

    private void a() {
        this.h();
        Iterator iterator = aLP.a(Item.k);
        while (dz_0.c(iterator)) {
            Item item = (Item)dz_0.b(iterator);
            Iterator iterator2 = ListInvoker.iterator(this.a(item));
            while (dz_0.c(iterator2)) {
                String string = (String)dz_0.b(iterator2);
                ResourceLocation resourceLocation = this.a(string);
                MapInvoker.c(this.t, string, resourceLocation);
                if (MapInvoker.c(this.h, resourceLocation) != null) continue;
                try {
                    aBU aBU2 = this.a(resourceLocation);
                    MapInvoker.c(this.h, resourceLocation, aBU2);
                }
                catch (Exception exception) {
                    LoggerInvoker.b(u, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3e_0.dj), resourceLocation), a3e_0.aS), aLP.c(Item.k, item)), a3e_0.c7).toString(), exception);
                }
            }
        }
    }

    private asr_2 d(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = this.c(resourceLocation);
        asr_2 asr_22 = (asr_2)MapInvoker.c(this.f, resourceLocation2);
        ArrayList arrayList = my_0.c();
        try {
            Iterator iterator = ListInvoker.iterator(j6_0.a(this.g, resourceLocation2));
            while (dz_0.c(iterator)) {
                abh_2 abh_22 = (abh_2)dz_0.b(iterator);
                InputStream inputStream = null;
                try {
                    inputStream = dw_0.b(abh_22);
                    asr_2 asr_23 = to_0.a(new InputStreamReader(inputStream, Charsets.UTF_8));
                    ListInvoker.add(arrayList, asr_23);
                }
                catch (Exception exception) {
                    throw new RuntimeException(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3e_0.bi), resourceLocation), a3e_0.c5), dw_0.c(abh_22)), a3e_0.z), dw_0.a(abh_22)), a3e_0.dB).toString(), exception);
                }
                finally {
                    IOUtilsInvoker.closeQuietly(inputStream);
                }
            }
            asr_22 = new asr_2(arrayList);
        }
        catch (IOException iOException) {
            throw new RuntimeException(aL0.a(aL0.a(new StringBuilder(), a3e_0.b7), resourceLocation2.toString()).toString(), iOException);
        }
        MapInvoker.c(this.f, resourceLocation2, asr_22);
        return asr_22;
    }

    private void k() {
        Object object;
        Object object2;
        Object object3;
        Iterator iterator = aS0.f(MapInvoker.c(this.k));
        while (dz_0.c(iterator)) {
            object3 = (aRJ)dz_0.b(iterator);
            object2 = new qp_0();
            int n = 0;
            object = ListInvoker.iterator(aVS.a((a38)MapInvoker.c(this.k, object3)));
            while (dz_0.c((Iterator)object)) {
                ahs_0 ahs_02 = (ahs_0)dz_0.b((Iterator)object);
                aBU aBU2 = (aBU)MapInvoker.c(this.h, qz_1.d(ahs_02));
                if (ayl_0.g(aBU2)) {
                    ++n;
                    arw_0.a((qp_0)object2, this.a(aBU2, qz_1.c(ahs_02), qz_1.a(ahs_02)), qz_1.b(ahs_02));
                    continue;
                }
                LoggerInvoker.warn(u, aL0.a(aL0.a(new StringBuilder(), a3e_0.J), object3).toString());
            }
            LoggerInvoker.warn(u, aL0.a(aL0.a(new StringBuilder(), a3e_0.cJ), object3).toString());
        }
        iterator = aS0.f(MapInvoker.b(this.t));
        while (dz_0.c(iterator)) {
            object3 = (Map.Entry)dz_0.b(iterator);
            object2 = (ResourceLocation)FG.a((Map.Entry)object3);
            aRJ aRJ2 = new aRJ((String)FG.b((Map.Entry)object3), a3e_0.dN);
            object = (aBU)MapInvoker.c(this.h, object2);
            if (ayl_0.g((aBU)object)) {
                if (this.b((aBU)object)) {
                    PX.a(this.b, aRJ2, new ce_0(ayl_0.a((aBU)object)));
                    continue;
                }
                PX.a(this.b, aRJ2, this.a((aBU)object, alt_0.X0_Y0, false));
                continue;
            }
            LoggerInvoker.warn(u, aL0.a(aL0.a(new StringBuilder(), a3e_0.Y), object2).toString());
        }
    }

    private aBU c(aBU aBU2) {
        return mz_1.a(this.j, this.o, aBU2);
    }

    public NZ<aRJ, JE> f() {
        this.i();
        this.b();
        this.l();
        this.c();
        this.k();
        return this.b;
    }

    private void d() {
        ResourceLocation resourceLocation;
        Object object;
        ArrayDeque arrayDeque = ard_0.a();
        HashSet hashSet = axe_2.a();
        Object object2 = aS0.f(MapInvoker.c(this.h));
        while (dz_0.c((Iterator)object2)) {
            object = (ResourceLocation)dz_0.b((Iterator)object2);
            aS0.b((Set)hashSet, object);
            resourceLocation = ayl_0.d((aBU)MapInvoker.c(this.h, object));
            sd_0.b(arrayDeque, resourceLocation);
        }
        while (!sd_0.a(arrayDeque)) {
            block6: {
                object2 = (ResourceLocation)sd_0.e(arrayDeque);
                if (MapInvoker.c(this.h, object2) != null) continue;
                object = this.a((ResourceLocation)object2);
                MapInvoker.c(this.h, object2, object);
                resourceLocation = ayl_0.d((aBU)object);
                if (aS0.c((Set)hashSet, resourceLocation)) break block6;
                try {
                    sd_0.b(arrayDeque, resourceLocation);
                }
                catch (Exception exception) {
                    LoggerInvoker.b(u, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3e_0.ds), aSB.a(c, this.e((ResourceLocation)object2))), a3e_0.cH), object2), a3e_0.b3).toString(), exception);
                }
            }
            aS0.b((Set)hashSet, object2);
        }
    }

    private List<String> a(Item item) {
        List list = (List)MapInvoker.c(this.q, item);
        list = asg_0.b((Object)((ResourceLocation)aLP.c(Item.k, item)).toString());
        return list;
    }

    private Set<ResourceLocation> d(aBU aBU2) {
        HashSet hashSet = axe_2.a();
        Iterator iterator = ListInvoker.iterator(ayl_0.b(aBU2));
        while (dz_0.c(iterator)) {
            IE iE = (IE)dz_0.b(iterator);
            Iterator iterator2 = ms_0.a(iE.d.values());
            while (dz_0.c(iterator2)) {
                aL1 aL12 = (aL1)dz_0.b(iterator2);
                aS0.b((Set)hashSet, new ResourceLocation(ayl_0.b(aBU2, aL12.b)));
            }
        }
        aS0.b((Set)hashSet, new ResourceLocation(ayl_0.b(aBU2, a3e_0.ac)));
        return hashSet;
    }
}

