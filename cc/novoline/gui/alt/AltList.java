/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 */
package cc.novoline.gui.alt;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.NBTTagList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.awt.Color;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.NBTTagCompound;
import net.ScaledResolution;
import net.a0I;
import net.a1V;
import net.a1p;
import net.a7l_0;
import net.aMF;
import net.aNW;
import net.aN_;
import net.aR8;
import net.aV3;
import net.aV9;
import net.adj_1;
import net.adp_0;
import net.aho_1;
import net.ahp_2;
import net.ahv_2;
import net.amx_1;
import net.aol_1;
import net.arx_0;
import net.att_0;
import net.aw__0;
import net.ay7_0;
import net.cb_2;
import net.d4_0;
import net.dz_0;
import net.kv_0;
import net.oc_1;
import net.tn_0;
import net.tq_0;

public class AltList {
    private List<ahp_2> d;
    private Novoline j;
    private double k;
    private ahv_2 b = new ahv_2(this);
    private double g;
    private double e;
    private static String[] f;
    private boolean h;
    private double i;
    private double c;
    private aNW<aV9, aV9> a = new aNW<aV9, aV9>((Collection<aV9>)cb_2.a((ObjectList)new ObjectArrayList()), this::lambda$new$0, AltList::lambda$new$1);

    private aV9 lambda$new$0(aV9 aV92) {
        AltList.i();
        if (this.o() == null || aw__0.d(a1p.a(this.o()))) {
            return aV92;
        }
        if (aV92 == null) {
            return null;
        }
        return StringInvoker.e(StringInvoker.i(tq_0.b(aV92)), StringInvoker.i(StringInvoker.h(a1p.a(this.o())))) ? aV92 : null;
    }

    public double e() {
        return this.i;
    }

    public double h() {
        return this.g;
    }

    public void n() {
        Object object;
        NBTTagList nBTTagList;
        block3: {
            AltList.i();
            nBTTagList = new NBTTagList();
            object = a0I.d(this.a);
            if (!dz_0.c((Iterator)object)) break block3;
            aV9 aV92 = (aV9)dz_0.b((Iterator)object);
            kv_0.a(nBTTagList, tq_0.e(aV92));
        }
        try {
            object = new NBTTagCompound();
            tn_0.a((NBTTagCompound)object, d4_0.g, nBTTagList);
            aR8.a((NBTTagCompound)object, new File(NovolineInvoker.t(NovolineInvoker.getInstance()), d4_0.a));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public double q() {
        return this.k;
    }

    public ahp_2 f() {
        return (ahp_2)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.d), ahp_2::b)), null);
    }

    public void b(int n, int n2) {
        ahp_2 ahp_22;
        Object object;
        AltList.i();
        this.e = ScaledResolutionInvoker.a(new ScaledResolution(NovolineInvoker.d(this.j))) - 20;
        aV3.a(aV3.a(), this.e - this.g + 15.0, this.k - 15.0, this.g, this.c, 30.0, 2.0, new Color(33, 33, 33, 255), true);
        if (this.h) {
            this.g += (230.0 - this.g) * (double)0.025f;
            this.c += (270.0 - this.c) * (double)0.025f;
            ListInvoker.b(new ListInvoker[3]);
        }
        this.g += (30.0 - this.g) * (double)0.04f;
        this.c += (30.0 - this.c) * (double)0.04f;
        FontRenderer fontRenderer = adj_1.a(ay7_0.a, 30);
        a7l_0.b(fontRenderer, d4_0.d, this.e - (double)(a7l_0.a(fontRenderer, d4_0.e) / 2), this.k - (double)(a7l_0.a(fontRenderer) / 2), this.c(n, n2) ? aol_1.b(new Color(0, 150, 255)) : -1, true);
        if (this.h || this.g > 32.0 || this.c > 32.0) {
            Iterator iterator = ListInvoker.iterator(this.d);
            if (dz_0.c(iterator)) {
                object = (ahp_2)dz_0.b(iterator);
                ((ahp_2)object).b(n, n2);
            }
            adp_0.b(false);
            a1V.a(this.e - this.g + 15.0, this.k - 15.0, this.g, this.c, 15.0, -1);
            adp_0.a(true);
            a7l_0.a(att_0.a, (CharSequence)d4_0.c, this.e - 220.0 + 15.0, this.k - 7.0, -1, 2.0f);
            adp_0.a();
            iterator = ListInvoker.iterator(this.d);
            if (dz_0.c(iterator)) {
                object = (ahp_2)dz_0.b(iterator);
                arx_0.a((ahp_2)object, n, n2);
            }
        }
        this.i += ((double)ListInvoker.indexOf(this.d, this.f()) * this.h() - this.i) * (double)0.05f;
        boolean bl = false;
        object = ListInvoker.iterator(this.d);
        if (dz_0.c((Iterator)object) && arx_0.a(ahp_22 = (ahp_2)dz_0.b((Iterator)object))) {
            bl = true;
            if (MathInvoker.a((double)ListInvoker.indexOf(this.d, ahp_22) * this.h() - this.i) >= this.h() - 2.0) {
                ListInvoker.remove(this.d, ahp_22);
            }
        }
    }

    public static String[] i() {
        return f;
    }

    public void a(int n, int n2, int n3) {
        ahp_2 ahp_22;
        Iterator iterator;
        AltList.i();
        if (this.h && dz_0.c(iterator = ListInvoker.iterator(this.d)) && arx_0.a(ahp_22 = (ahp_2)dz_0.b(iterator))) {
            ahp_22.a(n, n2, n3);
        }
        if (this.c(n, n2) && n3 == 0) {
            this.h = !this.h;
        }
    }

    public void a(aNW<aV9, aV9> aNW2) {
        this.a = aNW2;
    }

    public List<ahp_2> a() {
        return this.d;
    }

    static {
        if (AltList.i() == null) {
            AltList.b(new String[2]);
        }
    }

    public aNW<aV9, aV9> g() {
        return this.a;
    }

    public ahv_2 p() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        AltList.i();
        a0I.c(this.a);
        try {
            int n;
            block6: {
                aV9 aV92;
                NBTTagCompound nBTTagCompound = aR8.a(new File(NovolineInvoker.t(NovolineInvoker.getInstance()), d4_0.f));
                if (nBTTagCompound == null) {
                    return;
                }
                n = 0;
                NBTTagList nBTTagList = tn_0.c(nBTTagCompound, d4_0.b, 10);
                if (n >= kv_0.c(nBTTagList)) return;
                try {
                    aV92 = tq_0.a(this, kv_0.g(nBTTagList, n));
                }
                catch (Throwable throwable) {
                    break block6;
                }
                a0I.b(this.a, aV92);
            }
            ++n;
            return;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public boolean c(int n, int n2) {
        AltList.i();
        return MathInvoker.b(this.e - (double)n, 2.0) + MathInvoker.b(this.k - (double)n2, 2.0) <= 225.0;
    }

    public aho_1 o() {
        ahp_2 ahp_22;
        AltList.i();
        Iterator iterator = ListInvoker.iterator(this.d);
        if (dz_0.c(iterator) && (ahp_22 = (ahp_2)dz_0.b(iterator)) instanceof ahv_2) {
            ahv_2 ahv_22 = (ahv_2)ahp_22;
            return ahv_22.f();
        }
        return null;
    }

    private static Comparator lambda$new$1() {
        return aN_.a(aV9::g);
    }

    public void a(int n, int n2) {
        ahp_2 ahp_22;
        Iterator iterator;
        AltList.i();
        if (this.h && dz_0.c(iterator = ListInvoker.iterator(this.d)) && arx_0.a(ahp_22 = (ahp_2)dz_0.b(iterator))) {
            ahp_22.a(n, n2);
        }
    }

    public void a(char c, int n) {
        ahp_2 ahp_22;
        AltList.i();
        Iterator iterator = ListInvoker.iterator(this.d);
        if (dz_0.c(iterator) && arx_0.a(ahp_22 = (ahp_2)dz_0.b(iterator))) {
            ahp_22.a(c, n);
        }
    }

    public double m() {
        return this.c;
    }

    public Novoline b() {
        return this.j;
    }

    public AltList(Novoline novoline) {
        this.d = new CopyOnWriteArrayList<ahp_2>();
        this.j = novoline;
        this.e = ScaledResolutionInvoker.a(new ScaledResolution(NovolineInvoker.d(novoline))) - 20;
        this.k = 20.0;
        AltList.i();
        this.g = 30.0;
        this.c = 30.0;
        if (ListInvoker.b() != null) {
            AltList.b(new String[5]);
        }
    }

    private static Comparator lambda$newInstance$3() {
        return aN_.a(aV9::g);
    }

    public void d() {
        this.c();
        ahv_2 ahv_22 = new ahv_2(this);
        amx_1.a(ahv_22, true);
        ListInvoker.add(this.d, ahv_22);
    }

    public double k() {
        return this.e;
    }

    public aNW<aV9, aV9> l() {
        return new aNW<aV9, aV9>((Collection<aV9>)cb_2.a((ObjectList)new ObjectArrayList()), this::lambda$newInstance$2, AltList::lambda$newInstance$3);
    }

    public static void b(String[] stringArray) {
        f = stringArray;
    }

    public double[] j() {
        return new double[]{this.e - this.g + 15.0 + 5.0, this.k, this.e - this.g + 15.0 + this.g, this.k + this.c - 15.0};
    }

    private aV9 lambda$newInstance$2(aV9 aV92) {
        AltList.i();
        if (this.o() == null || aw__0.d(a1p.a(this.o()))) {
            return aV92;
        }
        if (aV92 == null) {
            return null;
        }
        return StringInvoker.e(StringInvoker.i(tq_0.b(aV92)), StringInvoker.i(StringInvoker.h(a1p.a(this.o())))) ? aV92 : null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

