/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.renderer.texture;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.crash.CrashReportCategory;
import deobf.MCInvoker;
import net.minecraft.util.ReportedException;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import net.AbstractTexture;
import net.CJ;
import net.CrashReport;
import net.FG;
import net.ITickableTextureObject;
import net.KM;
import net.MathHelper;
import net.OL;
import net.P8;
import net.ResourceLocation;
import net.aDb;
import net.aH3;
import net.aHU;
import net.aIZ;
import net.aI_;
import net.aL0;
import net.aS0;
import net.aai_1;
import net.aak_1;
import net.abh_2;
import net.adi_0;
import net.ail_0;
import net.aiv_2;
import net.akl_0;
import net.amp_1;
import net.ara_2;
import net.auk_2;
import net.avm_0;
import net.axw_1;
import net.bc_0;
import net.ds_2;
import net.dw_0;
import net.dz_0;
import net.ii_0;
import net.j6_0;
import net.jj_0;
import net.ms_0;
import net.my_0;
import net.qg_2;
import net.ys_2;
import org.apache.logging.log4j.Logger;

public class TextureMap
extends AbstractTexture
implements ITickableTextureObject {
    private int j = 0;
    private KM p;
    public int s = 0;
    private static boolean n;
    public int h = 0;
    private KM[] v = null;
    private double q = -1.0;
    private List<KM> A = my_0.c();
    public static ResourceLocation r;
    private Map<String, KM> k;
    private Map<String, KM> t = MapsInvoker.a();
    private adi_0 l;
    private int u = -1;
    private String w;
    private int y;
    private static Logger m;
    private double i = -1.0;
    public static ResourceLocation x;
    private int o;
    private int z = -1;

    private static Exception a(Exception exception) {
        return exception;
    }

    public TextureMap(String string, boolean bl) {
        this(string, null, bl);
    }

    static {
        m = LogManagerInvoker.c();
        n = auk_2.b(SystemInvoker.a(aak_1.h, aak_1.K));
        x = new ResourceLocation(aak_1.S);
        r = new ResourceLocation(aak_1.d);
    }

    public String c() {
        return this.w;
    }

    public TextureMap(String string, adi_0 adi_02, boolean bl) {
        this.y = -1;
        this.k = MapsInvoker.a();
        this.p = new KM(aak_1.r);
        this.w = string;
        this.l = adi_02;
    }

    public boolean b(KM kM) {
        return this.a(qg_2.g(kM), kM);
    }

    public KM a(String string) {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        return (KM)MapInvoker.c(this.t, resourceLocation.toString());
    }

    public TextureMap(String string) {
        this(string, null);
    }

    public void g() {
        KM kM;
        Object object;
        if (ys_2.aC()) {
            OL.d = this.b();
        }
        aIZ.b(this.a());
        Iterator iterator = ListInvoker.iterator(this.A);
        while (dz_0.c(iterator)) {
            object = dz_0.b(iterator);
            kM = (KM)object;
            if (!this.a(kM)) continue;
            qg_2.n(kM);
            if (kM.t != null) {
                // empty if block
            }
            if (kM.n == null) continue;
        }
        if (ys_2.O()) {
            iterator = ListInvoker.iterator(this.A);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                kM = (KM)object;
                if (!this.a(kM)) continue;
                KM kM2 = kM.C;
                if (kM == aHU.ad || kM == aHU.ap) {
                    kM2.z = kM.z;
                }
                qg_2.c(kM);
                qg_2.n(kM2);
            }
            aIZ.b(this.a());
        }
        if (ys_2.aC()) {
            aIZ.b(this.b().c);
            iterator = ListInvoker.iterator(this.A);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                kM = (KM)object;
                if (kM.t == null || !this.a(kM)) continue;
                if (kM == aHU.ad || kM == aHU.ap) {
                    kM.t.z = kM.z;
                }
                qg_2.n(kM.t);
            }
            aIZ.b(this.b().a);
            iterator = ListInvoker.iterator(this.A);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                kM = (KM)object;
                if (kM.n == null || !this.a(kM)) continue;
                if (kM == aHU.ad || kM == aHU.ap) {
                    kM.t.z = kM.z;
                }
                qg_2.n(kM.n);
            }
            aIZ.b(this.a());
        }
        if (ys_2.aC()) {
            OL.d = null;
        }
    }

    private static String lambda$loadTextureAtlas$0(KM kM) throws Exception {
        return aL0.c(aL0.a(aL0.c(new StringBuilder(), qg_2.b(kM)), aak_1.n), qg_2.i(kM)).toString();
    }

    private void a(int n, int n2) {
        this.z = -1;
        this.u = -1;
        this.v = null;
        if (this.y > 0) {
            this.z = n / this.y;
            this.u = n2 / this.y;
            this.v = new KM[this.z * this.u];
            this.i = 1.0 / (double)this.z;
            this.q = 1.0 / (double)this.u;
            Iterator iterator = ms_0.a(this.k.values());
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                KM kM = (KM)object;
                double d = 0.5 / (double)n;
                double d2 = 0.5 / (double)n2;
                double d3 = (double)MathInvoker.a(qg_2.a(kM), qg_2.m(kM)) + d;
                double d4 = (double)MathInvoker.a(qg_2.f(kM), qg_2.k(kM)) + d2;
                double d5 = (double)MathInvoker.b(qg_2.a(kM), qg_2.m(kM)) - d;
                double d6 = (double)MathInvoker.b(qg_2.f(kM), qg_2.k(kM)) - d2;
                int n3 = (int)(d3 / this.i);
                int n4 = (int)(d4 / this.q);
                int n5 = (int)(d5 / this.i);
                int n6 = (int)(d6 / this.q);
                for (int i = n3; i <= n5; ++i) {
                    if (i < this.z) {
                        for (int j = n4; j <= n6; ++j) {
                            if (j < this.z) {
                                int n7 = j * this.z + i;
                                this.v[n7] = kM;
                                continue;
                            }
                            ys_2.d(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), aak_1.x), j), aak_1.p), qg_2.g(kM)).toString());
                        }
                        continue;
                    }
                    ys_2.d(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), aak_1.A), i), aak_1.i), qg_2.g(kM)).toString());
                }
            }
        }
    }

    public void b(int n) {
        this.o = n;
    }

    @Override
    public void a(aI_ aI_2) throws IOException {
        OL.f = aI_2;
        if (this.l != null) {
            this.a(aI_2, this.l);
        }
    }

    private int h() {
        int n = 1 << this.o;
        if (n < 8) {
            n = 8;
        }
        return n;
    }

    private boolean b(String string) {
        String string2 = StringInvoker.i(string);
        return StringInvoker.e(string2, aak_1.k) || StringInvoker.e(string2, aak_1.M);
    }

    private boolean a(ResourceLocation resourceLocation) {
        String string = axw_1.b(resourceLocation);
        return this.b(string);
    }

    public KM b(ResourceLocation resourceLocation) {
        throw new IllegalArgumentException(aak_1.a);
    }

    private boolean a(KM kM) {
        return kM != aHU.P && kM != aHU.av ? (kM != aHU.N && kM != aHU.d ? (kM != aHU.aw && kM != aHU.p ? (kM == aHU.r ? ys_2.D() : kM == aHU.ad || kM == aHU.ap || ys_2.aW()) : ys_2.K()) : ys_2.aI()) : ys_2.x();
    }

    public boolean i() {
        int n;
        int n2 = GlStateManagerInvoker.E();
        return n2 == (n = this.a());
    }

    private static String lambda$loadTextureAtlas$1(KM kM) throws Exception {
        return aL0.a(aL0.c(new StringBuilder(), qg_2.d(kM)), aak_1.q).toString();
    }

    public TextureMap(String string, adi_0 adi_02) {
        this(string, adi_02, false);
    }

    private int a(Map map, aI_ aI_2) {
        int n;
        int n2 = this.a(map, aI_2, 20);
        if (n2 < 16) {
            n2 = 16;
        }
        if ((n2 = MathHelper.c(n2)) > 16) {
            ys_2.e(aL0.c(aL0.a(new StringBuilder(), aak_1.l), n2).toString());
        }
        if ((n = MathHelper.b(n2)) < 4) {
            n = 4;
        }
        return n;
    }

    @Override
    public void a() {
        this.g();
    }

    private int a(Map map, aI_ aI_2, int n) {
        int n2;
        int n3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        HashMap hashMap = new HashMap();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            block7: {
                object5 = dz_0.b(iterator);
                object4 = (KM)FG.a((Map.Entry)object5);
                ResourceLocation resourceLocation = new ResourceLocation(qg_2.g((KM)object4));
                object3 = this.a(resourceLocation, 0);
                if (qg_2.b((KM)object4, aI_2, resourceLocation)) continue;
                try {
                    abh_2 abh_22 = j6_0.b(aI_2, (ResourceLocation)object3);
                    object2 = dw_0.b(abh_22);
                    object = aH3.a((InputStream)object2, aak_1.m);
                    n3 = ((Dimension)object).width;
                    n2 = MathHelper.c(n3);
                    if (MapInvoker.b(hashMap, P8.d(n2))) break block7;
                    MapInvoker.c(hashMap, P8.d(n2), P8.d(1));
                }
                catch (Exception exception) {}
            }
            int n4 = P8.b((Integer)MapInvoker.c(hashMap, P8.d(n2)));
            MapInvoker.c(hashMap, P8.d(n2), P8.d(n4 + 1));
        }
        int n5 = 0;
        object5 = MapInvoker.c(hashMap);
        object4 = new TreeSet(object5);
        object3 = aS0.f((Set)object4);
        while (dz_0.c((Iterator)object3)) {
            int n6 = P8.b((Integer)dz_0.b((Iterator)object3));
            int n7 = P8.b((Integer)MapInvoker.c(hashMap, P8.d(n6)));
            n5 += n7;
        }
        int n8 = 16;
        int n9 = 0;
        int n10 = n5 * n / 100;
        object2 = aS0.f((Set)object4);
        while (dz_0.c((Iterator)object2)) {
            object = dz_0.b((Iterator)object2);
            n3 = P8.b((Integer)object);
            n2 = P8.b((Integer)MapInvoker.c(hashMap, P8.d(n3)));
            n9 += n2;
            if (n3 > n8) {
                n8 = n3;
            }
            if (n9 <= n10) continue;
            return n8;
        }
        return n8;
    }

    public KM d() {
        return this.p;
    }

    private void f() {
        int n = this.h();
        int[] nArray = this.a(n);
        qg_2.d(this.p, n);
        qg_2.b(this.p, n);
        int[][] nArrayArray = new int[this.o + 1][];
        nArrayArray[0] = nArray;
        qg_2.a(this.p, my_0.a((Object[])new int[][][]{nArrayArray}));
        qg_2.e(this.p, this.j++);
    }

    public int e() {
        return this.j;
    }

    public boolean a(String string, KM kM) {
        if (!MapInvoker.b(this.t, string)) {
            MapInvoker.c(this.t, string, kM);
            if (qg_2.o(kM) < 0) {
                qg_2.e(kM, this.j++);
            }
            return true;
        }
        return false;
    }

    public KM d(String string) {
        ResourceLocation resourceLocation = new ResourceLocation(string);
        return (KM)MapInvoker.c(this.t, resourceLocation.toString());
    }

    private int[] a(int n) {
        BufferedImage bufferedImage = new BufferedImage(16, 16, 2);
        jj_0.b(bufferedImage, 0, 0, 16, 16, aIZ.c, 0, 16);
        BufferedImage bufferedImage2 = aH3.a(bufferedImage, n);
        int[] nArray = new int[n * n];
        jj_0.a(bufferedImage2, 0, 0, n, n, nArray, 0, n);
        return nArray;
    }

    public ResourceLocation a(ResourceLocation resourceLocation, int n) {
        return this.a(resourceLocation) ? new ResourceLocation(axw_1.a(resourceLocation), aL0.a(aL0.a(new StringBuilder(), axw_1.b(resourceLocation)), aak_1.w).toString()) : new ResourceLocation(axw_1.a(resourceLocation), StringInvoker.a(aak_1.I, new Object[]{this.w, axw_1.b(resourceLocation), aak_1.s}));
    }

    public KM c(String string) {
        KM kM = (KM)MapInvoker.c(this.k, string);
        kM = this.p;
        return kM;
    }

    public int b() {
        return this.o;
    }

    public void a(aI_ aI_2, adi_0 adi_02) {
        MapInvoker.d(this.t);
        this.j = 0;
        CJ.a(adi_02, this);
        if (this.o >= 4) {
            this.o = this.a(this.t, aI_2);
            ys_2.e(aL0.c(aL0.a(new StringBuilder(), aak_1.f), this.o).toString());
        }
        this.f();
        this.b();
        this.b(aI_2);
    }

    public KM a(double d, double d2) {
        if (this.v == null) {
            return null;
        }
        int n = (int)(d2 / this.q);
        int n2 = (int)(d / this.i);
        int n3 = n * this.z + n2;
        return n3 <= this.v.length ? this.v[n3] : null;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(aI_ aI_2) {
        int n;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        ys_2.a(aL0.a(aL0.a(new StringBuilder(), aak_1.t), ys_2.O()).toString());
        if (ys_2.O()) {
            Iterator iterator = ms_0.a(this.k.values());
            while (dz_0.c(iterator)) {
                object7 = dz_0.b(iterator);
                qg_2.j((KM)object7);
            }
        }
        ii_0.a(this);
        int n2 = MCInvoker.h();
        object7 = new aai_1(n2, n2, true, 0, this.o);
        MapInvoker.d(this.k);
        ListInvoker.clear(this.A);
        int n3 = Integer.MAX_VALUE;
        aDb.c(ail_0.cv, new Object[]{this});
        int n4 = this.h();
        int n5 = 1 << this.o;
        Iterator iterator = aS0.f(MapInvoker.b(this.t));
        while (dz_0.c(iterator)) {
            Object object8 = dz_0.b(iterator);
            object6 = (KM)FG.a((Map.Entry)object8);
            object5 = new ResourceLocation(qg_2.g((KM)object6));
            object4 = this.a((ResourceLocation)object5, 0);
            if (!qg_2.b((KM)object6, aI_2, (ResourceLocation)object5)) {
                try {
                    abh_2 abh_22 = j6_0.b(aI_2, (ResourceLocation)object4);
                    object3 = new BufferedImage[1 + this.o];
                    object3[0] = aiv_2.a(dw_0.b(abh_22));
                    if (this.o > 0) {
                        int n6 = jj_0.f(object3[0]);
                        object3[0] = aH3.a(object3[0], n4);
                        int n7 = jj_0.f(object3[0]);
                        if (!aH3.a(n6)) {
                            ys_2.e(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aak_1.X), qg_2.g((KM)object6)), aak_1.U), n6), aak_1.D), n7).toString());
                        }
                    }
                    if (!ListInvoker.isEmpty((List)(object2 = amp_1.a((avm_0)(object = (avm_0)dw_0.a(abh_22, aak_1.g)))))) {
                        int n8 = jj_0.f(object3[0]);
                        n = jj_0.d(object3[0]);
                        if (MathHelper.c(n8) != n8 || MathHelper.c(n) != n) {
                            throw new RuntimeException(aak_1.z);
                        }
                    }
                    Iterator iterator2 = ListInvoker.iterator((List)object2);
                    while (dz_0.c(iterator2)) {
                        Object object9 = dz_0.b(iterator2);
                        int n9 = P8.b((Integer)object9);
                        if (n9 >= ((BufferedImage[])object3).length - 1 || object3[n9] != null) continue;
                        ResourceLocation resourceLocation = this.a((ResourceLocation)object5, n9);
                        try {
                            object3[n9] = aiv_2.a(dw_0.b(j6_0.b(aI_2, resourceLocation)));
                        }
                        catch (IOException iOException) {
                            LoggerInvoker.c(m, aak_1.F, new Object[]{P8.d(n9), resourceLocation, iOException});
                        }
                    }
                    object2 = (bc_0)dw_0.a(abh_22, aak_1.y);
                    qg_2.a((KM)object6, object3, (bc_0)object2);
                }
                catch (RuntimeException runtimeException) {
                    LoggerInvoker.a(m, aL0.a(aL0.a(new StringBuilder(), aak_1.T), object4).toString(), runtimeException);
                    continue;
                }
                catch (IOException iOException) {
                    LoggerInvoker.f(m, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aak_1.Q), object4), aak_1.c), ara_2.b(iOException.getClass())).toString());
                    continue;
                }
                n3 = MathInvoker.b(n3, MathInvoker.b(qg_2.b((KM)object6), qg_2.i((KM)object6)));
                int n10 = MathInvoker.b(P8.f(qg_2.b((KM)object6)), P8.f(qg_2.i((KM)object6)));
                if (n10 < n5) {
                    LoggerInvoker.b(m, aak_1.V, new Object[]{object4, P8.d(qg_2.b((KM)object6)), P8.d(qg_2.i((KM)object6)), P8.d(MathHelper.b(n5)), P8.d(MathHelper.b(n10))});
                    n5 = n10;
                }
                akl_0.a((aai_1)object7, (KM)object6);
                continue;
            }
            if (qg_2.a((KM)object6, aI_2, (ResourceLocation)object5)) continue;
            n3 = MathInvoker.b(n3, MathInvoker.b(qg_2.b((KM)object6), qg_2.i((KM)object6)));
            akl_0.a((aai_1)object7, (KM)object6);
        }
        int n11 = MathInvoker.b(n3, n5);
        int n12 = MathHelper.b(n11);
        n12 = 0;
        if (n12 < this.o) {
            LoggerInvoker.e(m, aak_1.C, new Object[]{this.w, P8.d(this.o), P8.d(n12), P8.d(n11)});
            this.o = n12;
        }
        object6 = ms_0.a(this.t.values());
        while (dz_0.c((Iterator)object6)) {
            object5 = dz_0.b((Iterator)object6);
            object4 = (KM)object5;
            try {
                qg_2.c((KM)object4, this.o);
            }
            catch (Throwable throwable) {
                object3 = CrashInvoker.makeCrashReport(throwable, aak_1.B);
                object = CrashInvoker.a((CrashReport)object3, aak_1.E);
                CrashReportCategoryInvoker.a((CrashReportCategory)object, aak_1.J, ((KM)object4)::b);
                CrashReportCategoryInvoker.a((CrashReportCategory)object, aak_1.G, () -> TextureMap.lambda$loadTextureAtlas$0((KM)object4));
                CrashReportCategoryInvoker.a((CrashReportCategory)object, aak_1.L, () -> TextureMap.lambda$loadTextureAtlas$1((KM)object4));
                CrashReportCategoryInvoker.addCrashSection((CrashReportCategory)object, aak_1.Y, P8.d(this.o));
                throw new ReportedException((CrashReport)object3);
            }
        }
        qg_2.c(this.p, this.o);
        akl_0.a((aai_1)object7, this.p);
        akl_0.d((aai_1)object7);
        LoggerInvoker.e(m, aak_1.b, new Object[]{P8.d(akl_0.b((aai_1)object7)), P8.d(akl_0.a((aai_1)object7)), this.w});
        aiv_2.a(this.a(), this.o, akl_0.b((aai_1)object7), akl_0.a((aai_1)object7));
        object6 = MapsInvoker.a(this.t);
        object5 = ListInvoker.iterator(akl_0.c((aai_1)object7));
        while (dz_0.c((Iterator)object5)) {
            object4 = dz_0.b((Iterator)object5);
            KM kM = (KM)object4;
            object3 = qg_2.g(kM);
            ds_2.c((HashMap)object6, object3);
            MapInvoker.c(this.k, object3, kM);
            try {
                aiv_2.a(qg_2.a(kM, 0), qg_2.b(kM), qg_2.i(kM), qg_2.e(kM), qg_2.h(kM), false, false);
            }
            catch (Throwable throwable) {
                object2 = CrashInvoker.makeCrashReport(throwable, aak_1.v);
                CrashReportCategory crashReportCategory = CrashInvoker.a((CrashReport)object2, aak_1.Z);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aak_1.e, this.w);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aak_1.R, kM);
                throw new ReportedException((CrashReport)object2);
            }
            if (!qg_2.l(kM)) continue;
            ListInvoker.add(this.A, kM);
        }
        object5 = ms_0.a(((HashMap)object6).values());
        while (dz_0.c((Iterator)object5)) {
            object4 = dz_0.b((Iterator)object5);
            qg_2.a((KM)object4, this.p);
        }
        if (ys_2.O()) {
            int n13 = akl_0.b((aai_1)object7);
            int n14 = akl_0.a((aai_1)object7);
            Iterator iterator3 = ListInvoker.iterator(akl_0.c((aai_1)object7));
            while (dz_0.c(iterator3)) {
                object3 = dz_0.b(iterator3);
                object = (KM)object3;
                ((KM)object).s = n13;
                ((KM)object).a = n14;
                ((KM)object).v = this.o;
                object2 = ((KM)object).C;
                ((KM)object2).s = n13;
                ((KM)object2).a = n14;
                ((KM)object2).v = this.o;
                qg_2.c((KM)object);
                boolean bl = false;
                n = 1;
                aiv_2.a(qg_2.a((KM)object2, 0), qg_2.b((KM)object2), qg_2.i((KM)object2), qg_2.e((KM)object2), qg_2.h((KM)object2), false, true);
            }
            TextureManagerInvoker.bindTexture(MCInvoker.E(ys_2.at()), r);
        }
        aDb.c(ail_0.bJ, new Object[]{this});
        if (ys_2.a((Object)SystemInvoker.c(aak_1.N), (Object)aak_1.W)) {
            aiv_2.a(StringInvoker.a(this.w, aak_1.o, aak_1.P), this.a(), this.o, akl_0.b((aai_1)object7), akl_0.a((aai_1)object7));
        }
    }
}

