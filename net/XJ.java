/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.EnumModuleType;
import deobf.MCInvoker;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Iterator;
import java.util.List;

public class XJ {
    private boolean a;
    private List<aWH> d;
    private TabGui b;
    private EnumModuleType e;
    private float c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double[] f() {
        aS4.b();
        double d = 15 + ListInvoker.indexOf(axq_1.g(this.b), this) * 12;
        String string = StringInvoker.a(this.e.name());
        int n = -1;
        switch (string.hashCode()) {
            case 1993470708: {
                if (!string.equals(aAS.f)) return new double[]{60.0, (float)(d + 5.0)};
                n = 0;
            }
            case 678949039: {
                if (!string.equals(aAS.c)) return new double[]{60.0, (float)(d + 5.0)};
                n = 1;
            }
            case -1932423455: {
                if (!string.equals(aAS.e)) return new double[]{60.0, (float)(d + 5.0)};
                n = 2;
            }
            case -1146279864: {
                if (!string.equals(aAS.a)) return new double[]{60.0, (float)(d + 5.0)};
                n = 3;
            }
            case 1185082643: {
                if (!string.equals(aAS.d)) return new double[]{60.0, (float)(d + 5.0)};
                n = 4;
            }
            case 2366700: {
                if (!string.equals(aAS.b)) return new double[]{60.0, (float)(d + 5.0)};
                n = 5;
            }
        }
        return new double[]{60.0, (float)(d + 5.0)};
    }

    public void a() {
        double d;
        double d2;
        block8: {
            double d3;
            block7: {
                aS4.b();
                d2 = axq_1.e(this.b) + ListInvoker.indexOf(axq_1.g(this.b), this) * axq_1.h(this.b);
                d = d2 + (double)axq_1.h(this.b);
                d3 = MCInvoker.O(MCInvoker.f()) / 13;
                if (!this.g()) break block7;
                if (!(this.c < 3.0f)) break block8;
                this.c = (float)MathHelper.b((double)this.c + 3.0 / d3, 0.0, 3.0);
            }
            if (this.c > 0.0f) {
                this.c = (float)MathHelper.b((double)this.c - 3.0 / d3, 0.0, 3.0);
            }
        }
        String string = aL0.a(aL0.a(new StringBuilder(), StringInvoker.b(this.e.name(), 0)), StringInvoker.i(StringInvoker.a(this.e.name(), 1))).toString();
        if (this.g()) {
            long l4 = 0L;
            int n = (int)d2 + 1;
            if ((double)n < d - 1.0) {
                a1V.b(2.0, (double)n, 3.5, (double)(n + 1), hb_2.a(l4));
                l4 -= 120L;
                ++n;
            }
        }
        axq_1.a(this.b, string, (double)(3.0f + this.c), d2 + (double)axq_1.a(this.b, 20) * 0.3 - (double)(10 - axq_1.b(this.b)) * 0.2, -1);
        if (this.h()) {
            float f = axq_1.i(this.b) + 5;
            float f2 = axq_1.e(this.b);
            float f3 = agh_1.f((aWH)ListInvoker.get(this.d, ListInvoker.size(this.d) - 1)) + 6;
            float f4 = ListInvoker.size(this.d) * axq_1.h(this.b);
            axq_1.a(this.b, f, f2, f3, f4);
            ListInvoker.forEach(this.d, aWH::h);
        }
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public boolean h() {
        return this.a;
    }

    public TabGui b() {
        return this.b;
    }

    public EnumModuleType d() {
        return this.e;
    }

    public List<aWH> c() {
        return this.d;
    }

    public boolean g() {
        aS4.b();
        return ListInvoker.indexOf(axq_1.g(this.b), this) == axq_1.j(this.b);
    }

    public XJ(TabGui tabGui, EnumModuleType enumModuleType) {
        aS4.b();
        this.d = new ObjectArrayList();
        this.c = 0.0f;
        this.e = enumModuleType;
        this.b = tabGui;
        this.a(false);
        Iterator iterator = ListInvoker.iterator(aen_2.a(NovolineInvoker.l(axq_1.c(tabGui)), enumModuleType));
        if (dz_0.c(iterator)) {
            AbstractModule abstractModule = (AbstractModule)dz_0.b(iterator);
            ListInvoker.add(this.d, new aWH(abstractModule, this));
        }
    }

    public aWH e() {
        aWH aWH2;
        aS4.b();
        Iterator iterator = ListInvoker.iterator(this.d);
        if (dz_0.c(iterator) && (aWH2 = (aWH)dz_0.b(iterator)).b()) {
            return aWH2;
        }
        return null;
    }
}

