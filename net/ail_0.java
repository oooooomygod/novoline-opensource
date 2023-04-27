/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.vecmath.Matrix4f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.base.Optional;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayerMP;
import deobf.EntityRenderer;
import deobf.GuiScreen;
import net.minecraft.block.Block;
import net.minecraft.resources.ResourcePackRepository;
import deobf.TileEntity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.vecmath.Matrix4f;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aIl
 */
public class ail_0 {
    public static aVJ c;
    public static arc_0 du;
    public static aVJ au;
    public static aVJ c7;
    public static aVJ dq;
    public static ahy_1 H;
    public static aVJ M;
    public static ahy_1 ci;
    public static arc_0 t;
    public static aVJ di;
    public static ahy_1 cI;
    public static aVJ cr;
    public static aqh_0 dg;
    public static ahy_1 aP;
    public static arc_0 d;
    public static aVJ bc;
    public static ON m;
    public static arc_0 dt;
    public static arc_0 b6;
    public static aVJ at;
    public static arc_0 b;
    public static aVJ bC;
    public static arc_0 ca;
    public static aVJ bf;
    public static arc_0 dv;
    public static aVJ b1;
    public static aVJ cv;
    public static arc_0 aR;
    public static arc_0 n;
    public static aVJ aZ;
    public static ON co;
    public static arc_0 bB;
    public static arc_0 aO;
    public static aVJ aj;
    public static aVJ c0;
    public static ahy_1 c_;
    public static ON cX;
    public static ahy_1 bw;
    public static arc_0 dk;
    public static arc_0 bS;
    public static ahy_1 V;
    public static ahy_1 af;
    public static aVJ ct;
    public static ahy_1 b2;
    public static arc_0 dd;
    public static ahy_1 b4;
    public static aVJ ai;
    public static arc_0 j;
    public static ahy_1 cy;
    public static aVJ aK;
    public static aVJ G;
    public static arc_0 cP;
    public static aVJ dp;
    public static arc_0 bx;
    public static arc_0 i;
    public static arc_0 dx;
    public static ahy_1 A;
    public static aVJ br;
    public static arc_0 cg;
    public static arc_0 a2;
    public static aVJ cM;
    public static aVJ dm;
    public static arc_0 cE;
    public static ahy_1 an;
    public static aVJ a3;
    public static arc_0 bk;
    public static ON aC;
    public static ON da;
    public static arc_0 c9;
    public static aVJ bp;
    public static aqh_0 bA;
    public static aVJ cs;
    public static aVJ aX;
    public static aVJ bL;
    public static arc_0 ce;
    public static aVJ Y;
    public static aVJ a5;
    private static boolean bO;
    public static arc_0 ab;
    public static arc_0 b5;
    public static ON cW;
    public static aVJ dh;
    public static ahy_1 ck;
    public static arc_0 U;
    public static aVJ E;
    public static aVJ db;
    public static arc_0 aE;
    public static aVJ ah;
    public static arc_0 c1;
    public static arc_0 ay;
    public static aVJ cL;
    public static arc_0 bz;
    public static aVJ b8;
    public static ahy_1 as;
    public static aVJ aV;
    public static aVJ c8;
    public static ahy_1 a4;
    public static arc_0 bd;
    public static ahy_1 a;
    public static aVJ be;
    public static ahy_1 bv;
    public static aVJ a_;
    public static ON bV;
    public static aVJ bo;
    public static aqh_0 w;
    public static arc_0 dA;
    public static aVJ bH;
    public static aVJ bK;
    public static arc_0 aW;
    public static aVJ bG;
    public static aVJ bN;
    public static ahy_1 K;
    public static aVJ aF;
    public static aVJ cY;
    public static arc_0 bZ;
    public static arc_0 cp;
    public static ahy_1 bu;
    public static arc_0 cD;
    public static ahy_1 cf;
    public static arc_0 cm;
    public static arc_0 ar;
    public static arc_0 cw;
    public static aVJ aY;
    public static arc_0 f;
    public static ahy_1 aG;
    public static ahy_1 b9;
    public static ahy_1 ds;
    public static ahy_1 cK;
    public static arc_0 bs;
    public static aVJ ak;
    public static arc_0 cz;
    private static boolean aB;
    public static aVJ ag;
    public static aqh_0 a9;
    public static ahy_1 B;
    public static aVJ bj;
    public static aVJ b0;
    public static arc_0 L;
    public static ahy_1 bE;
    public static arc_0 a7;
    public static arc_0 dj;
    public static arc_0 bW;
    public static ahy_1 cd;
    public static ahy_1 al;
    public static aVJ cx;
    public static arc_0 l;
    public static aVJ p;
    public static arc_0 cC;
    public static aVJ bD;
    public static ahy_1 cj;
    public static aVJ q;
    public static aVJ dz;
    public static ahy_1 Z;
    private static ListInvoker[] x;
    public static aVJ aA;
    public static ahy_1 dw;
    public static aVJ c3;
    public static ahy_1 cl;
    public static arc_0 aU;
    public static ahy_1 aa;
    public static arc_0 by;
    public static arc_0 N;
    public static aVJ cR;
    public static ahy_1 av;
    public static aVJ bF;
    public static arc_0 bP;
    public static aVJ cB;
    public static arc_0 bn;
    public static arc_0 bX;
    public static ON cn;
    public static aVJ y;
    public static ahy_1 aS;
    public static ahy_1 b7;
    public static aVJ c6;
    public static aVJ bi;
    public static aVJ bT;
    public static ahy_1 cc;
    public static arc_0 ax;
    public static arc_0 c5;
    public static aVJ aJ;
    public static ahy_1 cS;
    public static aVJ P;
    public static ahy_1 s;
    public static arc_0 cO;
    public static arc_0 dl;
    public static arc_0 a8;
    public static ON dn;
    public static ON ao;
    public static aVJ v;
    public static aVJ c4;
    public static arc_0 ch;
    public static aVJ b3;
    public static aVJ ba;
    public static arc_0 cU;
    public static arc_0 cG;
    public static arc_0 r;
    public static ahy_1 S;
    public static arc_0 ae;
    public static arc_0 dr;
    public static aVJ z;
    public static ON bl;
    public static aVJ a0;
    public static ahy_1 F;
    public static arc_0 dc;
    public static aVJ bJ;
    public static ahy_1 bY;
    public static aVJ bU;
    public static aVJ cu;
    public static ahy_1 ac;
    public static aVJ bM;
    public static aVJ cq;
    public static arc_0 g;
    public static aqh_0 aT;
    public static aVJ aD;
    public static aVJ az;
    public static ahy_1 h;
    public static ahy_1 ad;
    public static arc_0 am;
    public static aVJ aI;
    public static ahy_1 b_;
    public static aVJ k;
    public static ON bR;
    public static aVJ bb;
    public static arc_0 bh;
    public static aVJ cJ;
    public static arc_0 a1;
    public static ahy_1 cT;
    public static aVJ I;
    public static ahy_1 aN;
    public static ahy_1 aM;
    public static aVJ aq;
    public static aVJ dy;
    public static arc_0 cV;
    public static aqh_0 bq;
    public static ahy_1 aH;
    public static ON cF;
    public static ahy_1 W;
    public static aqh_0 a6;
    public static arc_0 cH;
    public static aVJ Q;
    public static ahy_1 O;
    public static aVJ bg;
    public static aVJ e;
    public static aVJ de;
    public static ON cA;
    public static arc_0 bQ;
    public static arc_0 C;
    public static arc_0 aQ;
    public static aVJ T;
    public static arc_0 aL;
    public static aVJ df;
    public static aVJ cZ;
    public static ahy_1 aw;
    public static arc_0 X;
    public static ahy_1 cQ;
    public static aVJ bt;
    public static aVJ R;
    public static ahy_1 c2;
    public static ahy_1 ap;
    public static arc_0 cb;
    public static aVJ u;
    public static aVJ J;
    public static arc_0 cN;
    public static arc_0 bI;
    public static arc_0 bm;
    public static arc_0 o;
    public static ahy_1 D;

    public static boolean d(aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return false;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, null, aVJ2, objectArray);
                return false;
            }
        }
        Boolean bl = (Boolean)VT.a(method, null, objectArray);
        return auk_2.a(bl);
    }

    public static int c(Object object, aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return 0;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, object, aVJ2, objectArray);
                return 0;
            }
        }
        Integer n = (Integer)VT.a(method, object, objectArray);
        return P8.b(n);
    }

    private static boolean a(String string) {
        ys_2.a(string);
        return true;
    }

    public static boolean a(Class[] classArray, Class[] classArray2) {
        if (classArray.length != classArray2.length) {
            return false;
        }
        for (int i = 0; i < classArray2.length; ++i) {
            Class clazz = classArray[i];
            Class clazz2 = classArray2[i];
            if (clazz == clazz2) continue;
            return false;
        }
        return true;
    }

    private static Object[] a(Object[] objectArray) {
        return new Class[0];
    }

    public static Object a(ahy_1 ahy_12) {
        return ail_0.a(null, ahy_12);
    }

    public static ListInvoker[] b() {
        return x;
    }

    public static double e(aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return 0.0;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, null, aVJ2, objectArray);
                return 0.0;
            }
        }
        Double d = (Double)VT.a(method, null, objectArray);
        return db_0.b(d);
    }

    public static boolean a(Object object, ahy_1 ahy_12, Object object2) {
        Field field;
        block3: {
            aP2.b();
            try {
                field = aSG.b(ahy_12);
                if (field != null) break block3;
                return false;
            }
            catch (Throwable throwable) {
                aWR.c(throwable);
                return false;
            }
        }
        avx_0.a(field, object, object2);
        return true;
    }

    public static float a(Object object, ahy_1 ahy_12, float f) {
        aP2.b();
        Object object2 = ail_0.a(object, ahy_12);
        if (!(object2 instanceof Float)) {
            return f;
        }
        Float f2 = (Float)object2;
        return axx_1.a(f2);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static void a(Object object, aVJ aVJ2, Object ... objectArray) {
        aP2.b();
    }

    public static Object a(Object object, ahy_1 ahy_12) {
        Field field;
        block3: {
            aP2.b();
            try {
                field = aSG.b(ahy_12);
                if (field != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                aWR.c(throwable);
                return null;
            }
        }
        Object object2 = avx_0.a(field, object);
        return object2;
    }

    private static void a(Throwable throwable, Object object, aVJ aVJ2, Object[] objectArray) {
        if (throwable instanceof InvocationTargetException) {
            Throwable throwable2 = aWR.a(throwable);
            if (throwable2 instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException)throwable2;
                throw runtimeException;
            }
            aWR.c(throwable);
        } else {
            if (throwable instanceof IllegalArgumentException) {
                ys_2.d(acy_0.I);
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.E), ayy_0.a(aVJ2)).toString());
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.aI), object).toString());
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.cb), ys_2.a(ail_0.a(objectArray))).toString());
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.bD), ys_2.a(objectArray)).toString());
            }
            ys_2.d(acy_0.ca);
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.cn), ayy_0.a(aVJ2)).toString());
            ayy_0.b(aVJ2);
            aWR.c(throwable);
        }
    }

    public static boolean f(Object object, aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return false;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, object, aVJ2, objectArray);
                return false;
            }
        }
        Boolean bl = (Boolean)VT.a(method, object, objectArray);
        return auk_2.a(bl);
    }

    public static Object a(aVJ aVJ2, Object ... objectArray) {
        try {
            Method method = ayy_0.a(aVJ2);
            return null;
        }
        catch (Throwable throwable) {
            ail_0.a(throwable, null, aVJ2, objectArray);
            return null;
        }
    }

    public static boolean a(Object object) {
        aP2.b();
        if (object == null) {
            return false;
        }
        Object object2 = ail_0.a(ac);
        if (object2 == null) {
            return false;
        }
        Object object3 = ail_0.g(object2, c0, object);
        if (!(object3 instanceof Boolean)) {
            return false;
        }
        Boolean bl = (Boolean)object3;
        return auk_2.a(bl);
    }

    private static void a(boolean bl, String string, ahy_1 ahy_12, Object object) {
        String string2 = ara_2.b(avx_0.c(aSG.b(ahy_12)));
        aP2.b();
        String string3 = avx_0.a(aSG.b(ahy_12));
        String string4 = acy_0.N;
        string4 = acy_0.bc;
        ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), string4), acy_0.aM), string2), acy_0.bV), string3), acy_0.ch), object).toString());
    }

    public static void b(ListInvoker[] listInvokerArray) {
        x = listInvokerArray;
    }

    public static Object a(ON oN, Object ... objectArray) {
        aP2.b();
        Constructor constructor = vi_2.b(oN);
        if (constructor == null) {
            return null;
        }
        try {
            Object object = ap6_0.a(constructor, objectArray);
            return object;
        }
        catch (Throwable throwable) {
            ail_0.a(throwable, oN, objectArray);
            return null;
        }
    }

    static {
        aB = ail_0.a(acy_0.F);
        bW = new arc_0(acy_0.cg);
        V = new ahy_1(bW, acy_0.aO);
        b = new arc_0(acy_0.L);
        cP = new arc_0(acy_0.cf);
        c3 = new aVJ(cP, acy_0.K);
        ae = new arc_0(acy_0.aH);
        cn = new ON(ae, new Class[]{ChunkCoordIntPair.class, EntityPlayerMP.class});
        dA = new arc_0(acy_0.X);
        bo = new aVJ(dA, acy_0.bH);
        dk = new arc_0(acy_0.aR);
        aX = new aVJ(dk, acy_0.aF);
        aZ = new aVJ(dk, acy_0.b9);
        aR = new arc_0(acy_0.Z);
        cF = new ON(aR, new Class[]{GuiScreen.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
        cV = new arc_0(acy_0.b2);
        dn = new ON(cV, new Class[]{GuiScreen.class, Integer.TYPE, Integer.TYPE, Float.TYPE});
        C = new arc_0(acy_0.am);
        cA = new ON(C, new Class[]{EntityRenderer.class, Entity.class, Block.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
        S = new ahy_1(C, acy_0.b);
        cj = new ahy_1(C, acy_0.bu);
        b2 = new ahy_1(C, acy_0.m);
        a8 = new arc_0(acy_0.aL);
        bl = new ON(a8, new Class[]{EntityRenderer.class, Entity.class, Block.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE});
        dw = new ahy_1(a8, acy_0.bY);
        b9 = new ahy_1(a8, acy_0.bm);
        aw = new ahy_1(a8, acy_0.az);
        bB = new arc_0(acy_0.aB);
        db = new aVJ(bB, acy_0.as);
        cU = new arc_0(acy_0.b7);
        c0 = new aVJ(cU, acy_0.aQ);
        a2 = new arc_0(acy_0.a);
        h = new ahy_1(a2, acy_0.an);
        cl = new ahy_1(a2, acy_0.bF);
        cS = new ahy_1(a2, acy_0.bi);
        by = new arc_0(acy_0.aw);
        aC = new ON(by, new Class[]{Block.class, a4_0[].class, aPE[].class});
        l = new arc_0(acy_0.af);
        ah = new aVJ(l, acy_0.B);
        de = new aVJ(l, acy_0.aD);
        Q = new aVJ(l, acy_0.aU);
        bp = new aVJ(l, acy_0.ae);
        bz = new arc_0(acy_0.C);
        dz = new aVJ(bz, acy_0.at);
        br = new aVJ(bz, acy_0.bw);
        b8 = new aVJ(bz, acy_0.be);
        e = new aVJ(bz, acy_0.cm);
        au = new aVJ(bz, acy_0.bl);
        bC = new aVJ(bz, acy_0.M);
        bP = new arc_0(il_0.class);
        Y = new aVJ(bP, acy_0.aC);
        cE = new arc_0(Block.class);
        at = new aVJ(cE, acy_0.c);
        cL = new aVJ(cE, acy_0.ai);
        aY = new aVJ(cE, acy_0.bt);
        a0 = new aVJ(cE, acy_0.ay, new Class[]{a5w_0.class});
        df = new aVJ(cE, acy_0.a3);
        aF = new aVJ(cE, acy_0.ci);
        cB = new aVJ(cE, acy_0.aN);
        cx = new aVJ(cE, acy_0.aA);
        bM = new aVJ(cE, acy_0.bo);
        bc = new aVJ(cE, acy_0.l, new Class[]{IBlockState.class});
        v = new aVJ(cE, acy_0.g);
        ba = new aVJ(cE, acy_0.bZ);
        a5 = new aVJ(cE, acy_0.b3);
        z = new aVJ(cE, acy_0.bh);
        dc = new arc_0(Entity.class);
        aI = new aVJ(dc, acy_0.z);
        aM = new ahy_1(dc, acy_0.t);
        bE = new ahy_1(dc, acy_0.b8);
        bj = new aVJ(dc, acy_0.bW);
        J = new aVJ(dc, acy_0.bj);
        aL = new arc_0(acy_0.aJ);
        b3 = new aVJ(aL, acy_0.p);
        dm = new aVJ(aL, acy_0.cd);
        b1 = new aVJ(aL, acy_0.aY);
        bU = new aVJ(aL, acy_0.a7);
        aq = new aVJ(aL, acy_0.bx);
        b6 = new arc_0(acy_0.cc);
        aV = new aVJ(b6, acy_0.ag);
        aJ = new aVJ(b6, acy_0.aV);
        R = new aVJ(b6, acy_0.aq);
        cY = new aVJ(b6, acy_0.bM);
        M = new aVJ(b6, acy_0.Y);
        di = new aVJ(b6, acy_0.u);
        aD = new aVJ(b6, acy_0.cj);
        cr = new aVJ(b6, acy_0.D);
        aW = new arc_0(acy_0.o);
        bG = new aVJ(aW, acy_0.ar, new Class[]{Matrix4f.class, Optional.class});
        bL = new aVJ(aW, acy_0.bs);
        u = new aVJ(aW, acy_0.bA);
        bi = new aVJ(aW, acy_0.br);
        I = new aVJ(aW, acy_0.bJ);
        dh = new aVJ(aW, acy_0.aZ);
        cM = new aVJ(aW, acy_0.r);
        k = new aVJ(aW, acy_0.ce);
        ai = new aVJ(aW, acy_0.b5);
        az = new aVJ(aW, acy_0.k, new Class[]{alt_0.class});
        P = new aVJ(aW, acy_0.bO);
        bT = new aVJ(aW, acy_0.a5);
        G = new aVJ(aW, acy_0.bk);
        c = new aVJ(aW, acy_0.b6);
        cv = new aVJ(aW, acy_0.bB);
        bJ = new aVJ(aW, acy_0.by);
        a_ = new aVJ(aW, acy_0.bI);
        T = new aVJ(aW, acy_0.a_);
        cs = new aVJ(aW, acy_0.ab);
        cq = new aVJ(aW, acy_0.ck);
        b0 = new aVJ(aW, acy_0.i);
        bF = new aVJ(aW, acy_0.f);
        ak = new aVJ(aW, acy_0.a4);
        a1 = new arc_0(Item.class);
        dy = new aVJ(a1, acy_0.ba);
        bD = new aVJ(a1, acy_0.V);
        dp = new aVJ(a1, acy_0.b4);
        aA = new aVJ(a1, acy_0.W);
        y = new aVJ(a1, acy_0.aX);
        ca = new arc_0(li_0.class);
        ag = new aVJ(ca, acy_0.a1, new Class[]{String.class});
        ce = new arc_0(acy_0.w);
        af = new ahy_1(ce, acy_0.al);
        n = new arc_0(a2l_0.class);
        bK = new aVJ(n, acy_0.aa);
        aQ = new arc_0(TileEntity.class);
        cJ = new aVJ(aQ, acy_0.bf);
        be = new aVJ(aQ, acy_0.bU);
        aj = new aVJ(aQ, acy_0.d);
        ct = new aVJ(aQ, acy_0.ah);
        bZ = new arc_0(hq_0.class);
        bN = new aVJ(bZ, acy_0.bd);
        bg = new aVJ(bZ, acy_0.P);
        dx = new arc_0(aPX.class);
        c8 = new aVJ(dx, acy_0.e);
        a3 = new aVJ(dx, acy_0.J);
        cC = new arc_0(World.class);
        bt = new aVJ(cC, acy_0.cl, new Class[]{a40.class, Boolean.TYPE});
        p = new aVJ(cC, acy_0.Q);
        cz = new arc_0(a9K.class);
        c7 = new aVJ(cz, acy_0.aj);
        cR = new aVJ(cz, acy_0.aG);
        aK = new aVJ(cz, acy_0.bR);
        bn = new arc_0(acy_0.aS);
        m = new ON(bn, new Class[]{GuiScreen.class});
        d = new arc_0(acy_0.bX);
        cm = new arc_0(acy_0.b_);
        dq = new aVJ(cm, acy_0.ap);
        bh = new arc_0(acy_0.G);
        cu = new aVJ(bh, acy_0.U);
        am = new arc_0(acy_0.aP);
        q = new aVJ(am, acy_0.O);
        cG = new arc_0(acy_0.bp);
        cW = new ON(cG, new Class[]{ModelManager.class});
        bd = new arc_0(acy_0.T);
        b7 = new ahy_1(bd, acy_0.bP);
        c5 = new arc_0(acy_0.q);
        cI = new ahy_1(c5, acy_0.a8);
        c6 = new aVJ(c5, acy_0.n);
        E = new aVJ(c5, acy_0.bE);
        cK = new ahy_1(c5, acy_0.bS);
        dj = new arc_0(acy_0.bC);
        ac = new ahy_1(dj, acy_0.aE);
        b5 = new arc_0(acy_0.bL);
        c4 = new aVJ(b5, acy_0.b1);
        bH = new aVJ(b5, acy_0.bQ);
        g = new arc_0(acy_0.bK);
        bb = new aVJ(g, acy_0.bn);
        ch = new arc_0(acy_0.ac);
        K = new ahy_1(ch, acy_0.v);
        bm = new arc_0(acy_0.au);
        bf = new aVJ(bm, acy_0.aK, new Class[]{RenderManager.class, Map.class});
        c1 = new arc_0(acy_0.bT);
        co = new ON(c1, new Class[]{no_2.class, kv_2.class});
        cO = new arc_0(acy_0.h);
        da = new ON(cO, new Class[]{EntityLivingBase.class, jg_1.class, Double.TYPE, Double.TYPE, Double.TYPE});
        ar = new arc_0(acy_0.A);
        ao = new ON(ar, new Class[]{EntityLivingBase.class, jg_1.class, Double.TYPE, Double.TYPE, Double.TYPE});
        dr = new arc_0(acy_0.bv);
        bV = new ON(dr, new Class[]{EntityLivingBase.class, jg_1.class, Double.TYPE, Double.TYPE, Double.TYPE});
        cg = new arc_0(acy_0.j);
        cX = new ON(cg, new Class[]{EntityLivingBase.class, jg_1.class, Double.TYPE, Double.TYPE, Double.TYPE});
        bk = new arc_0(acy_0.H);
        j = new arc_0(acy_0.ax);
        bR = new ON(j, new Class[]{World.class});
        bO = ail_0.a(acy_0.bG);
        dl = new arc_0(TW.class);
        ad = new ahy_1(dl, aac_1.class);
        U = new arc_0(GuiMainMenu.class);
        an = new ahy_1(U, String.class);
        bX = new arc_0(Minecraft.class);
        s = new ahy_1(bX, DefaultResourcePack.class);
        cw = new arc_0(re_2.class);
        ci = new ahy_1(cw, a5Y.class);
        r = new arc_0(rl_2.class);
        bA = new aqh_0(r, a5Y.class, 6);
        aO = new arc_0(r7_0.class);
        b4 = new ahy_1(aO, a5Y.class);
        cc = new ahy_1(aO, a5Y[].class);
        bx = new arc_0(rk_2.class);
        a9 = new aqh_0(bx, a5Y.class, 12);
        cD = new arc_0(r2_0.class);
        w = new aqh_0(cD, a5Y.class, 3);
        L = new arc_0(kw_0.class);
        O = new ahy_1(L, q1_0.class, 0);
        cp = new arc_0(rl_1.class);
        cQ = new ahy_1(cp, a5Y[].class);
        i = new arc_0(ru_0.class);
        ap = new ahy_1(i, a5Y.class);
        cy = new ahy_1(i, a5Y[].class);
        bS = new arc_0(r4_0.class);
        aG = new ahy_1(bS, a5Y.class, 0);
        ck = new ahy_1(bS, a5Y.class, 1);
        bw = new ahy_1(bS, a5Y[].class, 0);
        c_ = new ahy_1(bS, a5Y[].class, 1);
        a7 = new arc_0(r5_0.class);
        a6 = new aqh_0(a7, a5Y.class, 39);
        aE = new arc_0(j2.class);
        B = new ahy_1(aE, ra_2.class);
        du = new arc_0(rr_0.class);
        bu = new ahy_1(du, a5Y.class);
        aN = new ahy_1(du, a5Y[].class);
        c9 = new arc_0(rh_1.class);
        dg = new aqh_0(c9, a5Y.class, 8);
        dv = new arc_0(rz_1.class);
        bq = new aqh_0(dv, a5Y.class, 12);
        o = new arc_0(rf_2.class);
        as = new ahy_1(o, a5Y[].class, 0);
        cd = new ahy_1(o, a5Y[].class, 1);
        bs = new arc_0(rz_2.class);
        aT = new aqh_0(bs, a5Y.class, 4);
        cH = new arc_0(rn_1.class);
        a4 = new ahy_1(cH, a5Y.class);
        av = new ahy_1(cH, a5Y[].class);
        cb = new arc_0(r8_0.class);
        cf = new ahy_1(cb, a5Y.class, 0);
        W = new ahy_1(cb, a5Y.class, 1);
        dt = new arc_0(rx_0.class);
        aa = new ahy_1(dt, a5Y[].class, 0);
        D = new ahy_1(dt, a5Y[].class, 1);
        dd = new arc_0(rs_0.class);
        A = new ahy_1(dd, a5Y.class, 6);
        Z = new ahy_1(dd, a5Y.class, 7);
        N = new arc_0(acy_0.ao);
        ds = new ahy_1(N, acy_0.bz);
        cZ = new aVJ(N, acy_0.S);
        bI = new arc_0(ji_1.class);
        a = new ahy_1(bI, q1_0.class);
        t = new arc_0(ju_1.class);
        F = new ahy_1(t, q1_0.class);
        ay = new arc_0(kv_1.class);
        aS = new ahy_1(ay, rq_2.class);
        aU = new arc_0(ResourcePackRepository.class);
        aP = new ahy_1(aU, List.class, 1);
        ax = new arc_0(ee_1.class);
        aH = new ahy_1(ax, qj_0.class);
        ab = new arc_0(eb_1.class);
        c2 = new ahy_1(ab, rg_2.class, 0);
        H = new ahy_1(ab, rg_2.class, 1);
        f = new arc_0(ef_1.class);
        bv = new ahy_1(f, ri_1.class);
        ail_0.b(new ListInvoker[3]);
        X = new arc_0(ep_1.class);
        b_ = new ahy_1(X, rg_2.class);
        cN = new arc_0(ee_2.class);
        bY = new ahy_1(cN, rp_1.class);
        bQ = new arc_0(ez_2.class);
        cT = new ahy_1(bQ, rq_2.class, 0);
        al = new ahy_1(bQ, rq_2.class, 1);
    }

    private static void a(boolean bl, String string, aVJ aVJ2, Object[] objectArray, Object object) {
        aP2.b();
        String string2 = ara_2.b(VT.c(ayy_0.a(aVJ2)));
        String string3 = VT.a(ayy_0.a(aVJ2));
        String string4 = acy_0.aW;
        string4 = acy_0.a2;
        ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), string4), acy_0.ad), string2), acy_0.b0), string3), acy_0.y), ys_2.a(objectArray)), acy_0.bq), object).toString());
    }

    public static Object a(aqh_0 aqh_02, int n) {
        aP2.b();
        ahy_1 ahy_12 = a2a_0.a(aqh_02, n);
        return ahy_12 == null ? null : ail_0.a(ahy_12);
    }

    public static Object g(Object object, aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, object, aVJ2, objectArray);
                return null;
            }
        }
        Object object2 = VT.a(method, object, objectArray);
        return object2;
    }

    public static Object a(Object object, aqh_0 aqh_02, int n) {
        aP2.b();
        ahy_1 ahy_12 = a2a_0.a(aqh_02, n);
        return ahy_12 == null ? null : ail_0.a(object, ahy_12);
    }

    public static int b(aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return 0;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, null, aVJ2, objectArray);
                return 0;
            }
        }
        Integer n = (Integer)VT.a(method, null, objectArray);
        return P8.b(n);
    }

    public static double e(Object object, aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return 0.0;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, object, aVJ2, objectArray);
                return 0.0;
            }
        }
        Double d = (Double)VT.a(method, object, objectArray);
        return db_0.b(d);
    }

    public static String d(Object object, aVJ aVJ2, Object ... objectArray) {
        try {
            Method method = ayy_0.a(aVJ2);
            return null;
        }
        catch (Throwable throwable) {
            ail_0.a(throwable, object, aVJ2, objectArray);
            return null;
        }
    }

    public static boolean b(ON oN, Object ... objectArray) {
        aP2.b();
        Object object = ail_0.a(oN, objectArray);
        return object == null ? false : ail_0.a(object);
    }

    private static void a(Throwable throwable, ON oN, Object[] objectArray) {
        aP2.b();
        if (throwable instanceof InvocationTargetException) {
            aWR.c(throwable);
        }
        if (throwable instanceof IllegalArgumentException) {
            ys_2.d(acy_0.s);
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.x), vi_2.b(oN)).toString());
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.bN), ys_2.a(ail_0.a(objectArray))).toString());
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.a6), ys_2.a(objectArray)).toString());
        }
        ys_2.d(acy_0.bg);
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), acy_0.ak), vi_2.b(oN)).toString());
        vi_2.c(oN);
        aWR.c(throwable);
    }

    public static float g(aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return 0.0f;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, null, aVJ2, objectArray);
                return 0.0f;
            }
        }
        Float f = (Float)VT.a(method, null, objectArray);
        return axx_1.a(f);
    }

    public static void f(aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            method = ayy_0.a(aVJ2);
            if (method != null) break block3;
            return;
        }
        try {
            VT.a(method, null, objectArray);
        }
        catch (Throwable throwable) {
            ail_0.a(throwable, null, aVJ2, objectArray);
        }
    }

    public static String c(aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return null;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, null, aVJ2, objectArray);
                return null;
            }
        }
        String string = (String)VT.a(method, null, objectArray);
        return string;
    }

    private static void a(boolean bl, String string, aVJ aVJ2, Object[] objectArray) {
        aP2.b();
        String string2 = ara_2.b(VT.c(ayy_0.a(aVJ2)));
        String string3 = VT.a(ayy_0.a(aVJ2));
        String string4 = acy_0.a9;
        string4 = acy_0.a0;
        ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), string4), acy_0.av), string2), acy_0.aT), string3), acy_0.bb), ys_2.a(objectArray)), acy_0.R).toString());
    }

    public static boolean a(ahy_1 ahy_12, Object object) {
        return ail_0.a(null, ahy_12, object);
    }

    private static ahy_1[] a(arc_0 arc_02, Class clazz, int n) {
        ahy_1[] ahy_1Array = new ahy_1[n];
        aP2.b();
        int n2 = 0;
        if (n2 < ahy_1Array.length) {
            ahy_1Array[n2] = new ahy_1(arc_02, clazz, n2);
            ++n2;
        }
        return ahy_1Array;
    }

    public static float b(Object object, aVJ aVJ2, Object ... objectArray) {
        Method method;
        block3: {
            aP2.b();
            try {
                method = ayy_0.a(aVJ2);
                if (method != null) break block3;
                return 0.0f;
            }
            catch (Throwable throwable) {
                ail_0.a(throwable, object, aVJ2, objectArray);
                return 0.0f;
            }
        }
        Float f = (Float)VT.a(method, object, objectArray);
        return axx_1.a(f);
    }
}

