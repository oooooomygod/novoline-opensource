/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class KM {
    public int v = 0;
    protected List e = my_0.c();
    public int s;
    protected boolean o;
    protected int r;
    private static String B = "CL_00001062";
    private String h;
    public boolean D = false;
    public int u = -1;
    private float k;
    public float f;
    private float j;
    protected int[][] c;
    public KM t = null;
    protected int g;
    public float x;
    public boolean b = false;
    public int a;
    private bc_0 w;
    public KM C = null;
    private int i = -1;
    protected int z;
    protected int d;
    private static String q;
    protected int p;
    private static String A;
    public KM n = null;
    private float y;
    protected int l;
    private float m;

    public float c() {
        return this.j;
    }

    public int d() {
        return this.r;
    }

    public void a(List list) {
        this.e = list;
        if (this.C != null) {
            this.C.a(list);
        }
    }

    private static int[][] a(int[][] nArray, int n, int n2, int n3) {
        int[][] nArrayArray = new int[nArray.length][];
        for (int i = 0; i < nArray.length; ++i) {
            int[] nArray2 = nArray[i];
            nArrayArray[i] = new int[(n >> i) * (n2 >> i)];
            SystemInvoker.a(nArray2, n3 * nArrayArray[i].length, nArrayArray[i], 0, nArrayArray[i].length);
        }
        return nArrayArray;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public int e() {
        return ListInvoker.size(this.e);
    }

    public void a(KM kM) {
        this.g = kM.g;
        this.l = kM.l;
        this.d = kM.d;
        this.r = kM.r;
        this.o = kM.o;
        this.j = kM.j;
        this.k = kM.k;
        this.y = kM.y;
        this.m = kM.m;
        if (this.C != null) {
            this.C.a(this.d, this.r, 0, 0, false);
        }
    }

    public int a() {
        return this.g;
    }

    public double b(float f) {
        float f2 = this.k - this.j;
        return (f - this.j) / f2 * 16.0f;
    }

    public void f() {
        if (this.u < 0) {
            this.u = aiv_2.a();
            aiv_2.a(this.u, this.v, this.d, this.r);
            aH3.d();
        }
        aH3.c(this.u);
    }

    public void a(bc_0 bc_02) {
        this.w = bc_02;
    }

    public boolean b(aI_ aI_2, ResourceLocation resourceLocation) {
        return true;
    }

    public double c(float f) {
        float f2 = this.m - this.y;
        return (f - this.y) / f2 * 16.0f;
    }

    public void a(ResourceLocation resourceLocation, int n) throws IOException {
        abh_2 abh_22 = ys_2.c(resourceLocation);
        BufferedImage bufferedImage = aiv_2.a(dw_0.b(abh_22));
        if (this.d != jj_0.f(bufferedImage)) {
            bufferedImage = aH3.b(bufferedImage, this.d);
        }
        bc_0 cfr_ignored_0 = (bc_0)dw_0.a(abh_22, d8_0.w);
        int[][] nArrayArray = new int[n][];
        nArrayArray[0] = new int[jj_0.f(bufferedImage) * jj_0.d(bufferedImage)];
        jj_0.a(bufferedImage, 0, 0, jj_0.f(bufferedImage), jj_0.d(bufferedImage), nArrayArray[0], 0, jj_0.f(bufferedImage));
        ListInvoker.add(this.e, nArrayArray);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), d8_0.r), this.h), '\''), d8_0.i), ListInvoker.size(this.e)), d8_0.a), this.o), d8_0.o), this.g), d8_0.x), this.l), d8_0.s), this.r), d8_0.v), this.d), d8_0.z), this.j), d8_0.p), this.k), d8_0.C), this.y), d8_0.j), this.m), '}').toString();
    }

    public void a(BufferedImage[] bufferedImageArray, bc_0 bc_02) throws IOException {
        Object object;
        this.i();
        int n = jj_0.f(bufferedImageArray[0]);
        int n2 = jj_0.d(bufferedImageArray[0]);
        this.d = n;
        this.r = n2;
        int[][] nArrayArray = new int[bufferedImageArray.length][];
        for (int i = 0; i < bufferedImageArray.length; ++i) {
            object = bufferedImageArray[i];
            if (jj_0.f((BufferedImage)object) != n >> i || jj_0.d((BufferedImage)object) != n2 >> i) {
                throw new RuntimeException(StringInvoker.a(d8_0.b, new Object[]{P8.d(i), P8.d(jj_0.f((BufferedImage)object)), P8.d(jj_0.d((BufferedImage)object)), P8.d(n >> i), P8.d(n2 >> i)}));
            }
            nArrayArray[i] = new int[jj_0.f((BufferedImage)object) * jj_0.d((BufferedImage)object)];
            jj_0.a((BufferedImage)object, 0, 0, jj_0.f((BufferedImage)object), jj_0.d((BufferedImage)object), nArrayArray[i], 0, jj_0.f((BufferedImage)object));
        }
        if (n2 != n) {
            throw new RuntimeException(d8_0.m);
        }
        ListInvoker.add(this.e, nArrayArray);
        if (!this.b) {
            if (ys_2.aC()) {
                this.q();
            }
            Iterator iterator = ListInvoker.iterator(this.e);
            while (dz_0.c(iterator)) {
                object = dz_0.b(iterator);
                int[][] nArray = (int[][])object;
                if (StringInvoker.e(this.h, d8_0.k)) continue;
                for (int[] nArray2 : nArray) {
                    this.a(nArray2);
                }
            }
            if (this.C != null) {
                this.C.a(bufferedImageArray, bc_02);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = ":#~Cq>/H_\u0017A".toCharArray();
        int n2 = 0;
        int n3 = 24;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x61));
            n3 = n3;
        }
    }

    public float n() {
        return this.m;
    }

    public void d(int n) {
        ArrayList arrayList = my_0.c();
        for (int i = 0; i < ListInvoker.size(this.e); ++i) {
            int[][] nArray = (int[][])ListInvoker.get(this.e, i);
            try {
                akr_1.a(arrayList, aiv_2.a(n, this.d, nArray));
                continue;
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, d8_0.D);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, d8_0.n);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, d8_0.d, P8.d(i));
                CrashReportCategoryInvoker.a(crashReportCategory, d8_0.t, () -> KM.lambda$generateMipmaps$0(nArray));
                throw new ReportedException(crashReport);
            }
        }
        this.a(arrayList);
        if (this.C != null) {
            this.C.d(n);
        }
    }

    public float d(float f) {
        f -= this.x;
        float f2 = (float)this.a / (float)this.r;
        return f *= f2;
    }

    public bc_0 m() {
        return this.w;
    }

    public List<int[][]> p() {
        ArrayList<int[][]> arrayList = new ArrayList<int[][]>();
        ListInvoker.addAll(arrayList, this.e);
        return arrayList;
    }

    public void a(int n) {
        this.i = n;
    }

    public void o() {
        if (this.u >= 0) {
            aiv_2.a(this.u);
            this.u = -1;
        }
    }

    protected static KM a(ResourceLocation resourceLocation) {
        String string = resourceLocation.toString();
        return q.equals(string) ? new K9(string) : (A.equals(string) ? new KH(string) : new KM(string));
    }

    public float j() {
        return this.y;
    }

    private void a(int[] nArray) {
        long l4 = 0L;
        long l5 = 0L;
        long l6 = 0L;
        long l7 = 0L;
        for (int n : nArray) {
            int n2 = n >> 24 & 0xFF;
            if (n2 < 16) continue;
            int n3 = n >> 16 & 0xFF;
            int n4 = n >> 8 & 0xFF;
            int n5 = n & 0xFF;
            l4 += (long)n3;
            l5 += (long)n4;
            l6 += (long)n5;
            ++l7;
        }
        long l8 = l7 - 0L;
        int cfr_ignored_1 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
    }

    public boolean a(aI_ aI_2, ResourceLocation resourceLocation) {
        return false;
    }

    private KM(KM kM) {
        this.h = kM.h;
        this.D = true;
    }

    private void i() {
        this.w = null;
        this.a(my_0.c());
        this.z = 0;
        this.p = 0;
        if (this.C != null) {
            this.C.i();
        }
    }

    public static void a(String string) {
        A = string;
    }

    protected KM(String string) {
        this.h = string;
        if (ys_2.O()) {
            this.C = new KM(this);
        }
    }

    public void r() {
        ListInvoker.clear(this.e);
        if (this.C != null) {
            this.C.r();
        }
    }

    public float b(double d) {
        float f = this.m - this.y;
        return this.y + f * ((float)d / 16.0f);
    }

    public float a(float f) {
        f -= this.f;
        float f2 = (float)this.s / (float)this.d;
        return f *= f2;
    }

    public int[][] c(int n) {
        return (int[][])ListInvoker.get(this.e, n);
    }

    public void e(int n) {
        this.r = n;
        if (this.C != null) {
            this.C.e(this.r);
        }
    }

    private void f(int n) {
        if (ListInvoker.size(this.e) <= n) {
            for (int i = ListInvoker.size(this.e); i <= n; ++i) {
                ListInvoker.add(this.e, null);
            }
        }
        if (this.C != null) {
            this.C.f(n);
        }
    }

    private static String lambda$generateMipmaps$0(int[][] nArray) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        int[][] nArray2 = nArray;
        int n = nArray2.length;
        for (int i = 0; i < n; ++i) {
            int[] cfr_ignored_0 = nArray2[i];
            if (aL0.a(stringBuilder) > 0) {
                aL0.a(stringBuilder, d8_0.E);
            }
            aL0.a(stringBuilder, (Object)d8_0.h);
        }
        return stringBuilder.toString();
    }

    private void k() {
        int n;
        int n2;
        double d = 1.0 - (double)this.p / (double)aDf.a(this.w, this.z);
        int n3 = aDf.b(this.w, this.z);
        if (n3 != (n2 = aDf.b(this.w, (this.z + 1) % (n = this.w.d() == 0 ? ListInvoker.size(this.e) : this.w.d()))) && n2 < ListInvoker.size(this.e)) {
            int[][] nArray = (int[][])ListInvoker.get(this.e, n3);
            int[][] nArray2 = (int[][])ListInvoker.get(this.e, n2);
            if (this.c == null || this.c.length != nArray.length) {
                this.c = new int[nArray.length][];
            }
            for (int i = 0; i < nArray.length; ++i) {
                if (this.c[i] == null) {
                    this.c[i] = new int[nArray[i].length];
                }
                if (i >= nArray2.length || nArray2[i].length != nArray[i].length) continue;
                for (int j = 0; j < nArray[i].length; ++j) {
                    int n4 = nArray[i][j];
                    int n5 = nArray2[i][j];
                    int n6 = (int)((double)((n4 & 0xFF0000) >> 16) * d + (double)((n5 & 0xFF0000) >> 16) * (1.0 - d));
                    int n7 = (int)((double)((n4 & 0xFF00) >> 8) * d + (double)((n5 & 0xFF00) >> 8) * (1.0 - d));
                    int n8 = (int)((double)(n4 & 0xFF) * d + (double)(n5 & 0xFF) * (1.0 - d));
                    this.c[i][j] = n4 & 0xFF000000 | n6 << 16 | n7 << 8 | n8;
                }
            }
            aiv_2.a(this.c, this.d, this.r, this.g, this.l, false, false);
        }
    }

    public int t() {
        return this.i;
    }

    public void b(int n) {
        this.d = n;
        if (this.C != null) {
            this.C.b(this.d);
        }
    }

    public void h() {
        if (this.w != null) {
            ++this.p;
            if (this.p >= aDf.a(this.w, this.z)) {
                int n = aDf.b(this.w, this.z);
                int n2 = this.w.d() == 0 ? ListInvoker.size(this.e) : this.w.d();
                this.z = (this.z + 1) % n2;
                this.p = 0;
                int n3 = aDf.b(this.w, this.z);
                boolean bl = false;
                boolean bl2 = this.D;
                if (n != n3 && n3 < ListInvoker.size(this.e)) {
                    aiv_2.a((int[][])ListInvoker.get(this.e, n3), this.d, this.r, this.g, this.l, bl, bl2);
                }
            } else if (aDf.e(this.w)) {
                this.k();
            }
        }
    }

    public boolean u() {
        return this.w != null;
    }

    public String b() {
        return this.h;
    }

    public static void b(String string) {
        q = string;
    }

    public float s() {
        return this.k;
    }

    public int l() {
        return this.d;
    }

    public float a(double d) {
        float f = this.k - this.j;
        return this.j + f * (float)d / 16.0f;
    }

    public int g() {
        return this.l;
    }

    public void a(int n, int n2, int n3, int n4, boolean bl) {
        this.g = n3;
        this.l = n4;
        this.o = bl;
        float f = (float)((double)0.01f / (double)n);
        float f2 = (float)((double)0.01f / (double)n2);
        this.j = (float)n3 / (float)((double)n) + f;
        this.k = (float)(n3 + this.d) / (float)((double)n) - f;
        this.y = (float)n4 / (float)n2 + f2;
        this.m = (float)(n4 + this.r) / (float)n2 - f2;
        this.f = MathInvoker.a(this.j, this.k);
        this.x = MathInvoker.a(this.y, this.m);
        if (this.C != null) {
            this.C.a(this.d, this.r, 0, 0, false);
        }
        if (this.t != null) {
            this.t.a(n, n2, n3, n4, bl);
        }
        if (this.n != null) {
            this.n.a(n, n2, n3, n4, bl);
        }
    }

    private void q() {
        KM kM;
        ResourceLocation resourceLocation;
        String string;
        this.v = h9.c(ys_2.a());
        if (aVE.ci) {
            string = aL0.a(aL0.a(new StringBuilder(), this.h), d8_0.c).toString();
            resourceLocation = new ResourceLocation(string);
            resourceLocation = h9.a(ys_2.a(), resourceLocation, 0);
            if (ys_2.d(resourceLocation)) {
                try {
                    kM = new KM(string);
                    kM.b = true;
                    kM.a(this);
                    kM.a(resourceLocation, this.v + 1);
                    kM.d(this.v);
                    this.t = kM;
                }
                catch (IOException iOException) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), d8_0.g), string).toString());
                    ys_2.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(iOException.getClass())), d8_0.l), a4E.a(iOException)).toString());
                }
            }
        }
        if (aVE.r) {
            string = aL0.a(aL0.a(new StringBuilder(), this.h), d8_0.B).toString();
            resourceLocation = new ResourceLocation(string);
            resourceLocation = h9.a(ys_2.a(), resourceLocation, 0);
            if (ys_2.d(resourceLocation)) {
                try {
                    kM = new KM(string);
                    kM.b = true;
                    kM.a(this);
                    kM.a(resourceLocation, this.v + 1);
                    kM.d(this.v);
                    this.n = kM;
                }
                catch (IOException iOException) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), d8_0.y), string).toString());
                    ys_2.d(aL0.a(aL0.a(aL0.a(new StringBuilder(), ara_2.b(iOException.getClass())), d8_0.A), a4E.a(iOException)).toString());
                }
            }
        }
    }
}

