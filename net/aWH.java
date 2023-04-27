/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.MCInvoker;
import deobf.SettingType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import net.MathHelper;
import net.XJ;
import net.a1V;
import net.a3u_0;
import net.aMF;
import net.aS4;
import net.aen_2;
import net.ahg_0;
import net.aiy_0;
import net.aol_1;
import net.axq_1;
import net.dz_0;
import net.hb_2;
import net.lx_1;
import net.oc_1;
import net.wc_1;
import org.checkerframework.checker.nullness.qual.Nullable;

public class aWH {
    private boolean e;
    private List<aiy_0> a;
    private XJ b;
    private AbstractModule c;
    private float d;

    public void h() {
        float f;
        float f2;
        block9: {
            double d;
            block8: {
                f2 = axq_1.e(lx_1.b(this.b)) + ListInvoker.indexOf(lx_1.a(this.b), this) * axq_1.h(lx_1.b(this.b));
                aS4.b();
                f = f2 + (float)axq_1.h(lx_1.b(this.b));
                d = MCInvoker.O(MCInvoker.f()) / 13;
                if (!this.b()) break block8;
                if (!(this.d < 3.0f)) break block9;
                this.d = (float)MathHelper.b((double)this.d + 3.0 / d, 0.0, 3.0);
            }
            if (this.d > 0.0f) {
                this.d = (float)MathHelper.b((double)this.d - 3.0 / d, 0.0, 3.0);
            }
        }
        int n = axq_1.i(lx_1.b(this.b));
        if (this.b()) {
            long l4 = 0L;
            int n2 = (int)f2 + 1;
            if ((float)n2 < f - 2.0f) {
                a1V.b((double)n + 6.5, (double)n2, (double)(n + 8), (double)(n2 + 1), hb_2.a(l4));
                l4 -= 120L;
                ++n2;
            }
        }
        axq_1.a(lx_1.b(this.b), wc_1.a(this.c), (double)((float)(n + 7) + this.d), (double)f2 + (double)axq_1.a(lx_1.b(this.b), 20) * 0.3 - (double)(10 - axq_1.b(lx_1.b(this.b))) * 0.2, wc_1.g(this.c) ? -1 : aol_1.b(new Color(163, 163, 163, 255)));
        if (this.g()) {
            float f3 = axq_1.i(lx_1.b(this.b)) + this.c() + 16;
            float f4 = axq_1.e(lx_1.b(this.b));
            float f5 = a3u_0.f((aiy_0)ListInvoker.get(this.a, 0)) + 6;
            float f6 = ListInvoker.size(this.a) * axq_1.h(lx_1.b(this.b));
            axq_1.a(lx_1.b(this.b), f3, f4, f5, f6);
            ListInvoker.forEach(this.a, aiy_0::h);
        }
        if (ListInvoker.b() != null) {
            aS4.b(new ListInvoker[2]);
        }
    }

    public List<aiy_0> f() {
        return this.a;
    }

    public aWH(AbstractModule abstractModule, XJ xJ) {
        Setting setting;
        aS4.b();
        this.a = new ObjectArrayList();
        this.d = 0.0f;
        this.c = abstractModule;
        this.b = xJ;
        this.a(false);
        Iterator iterator = ListInvoker.iterator(ManagerInvoker.a(abstractModule));
        if (dz_0.c(iterator) && this.a(setting = (Setting)dz_0.b(iterator))) {
            ListInvoker.add(this.a, new aiy_0(setting, this));
        }
    }

    public @Nullable aiy_0 a() {
        return (aiy_0)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.a), aiy_0::b)), null);
    }

    public boolean g() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public AbstractModule i() {
        return this.c;
    }

    public boolean d() {
        return ListInvoker.isEmpty(this.a);
    }

    public XJ e() {
        return this.b;
    }

    public int c() {
        aS4.b();
        int n = 0;
        Iterator iterator = ListInvoker.iterator(aen_2.a(NovolineInvoker.l(axq_1.c(lx_1.b(this.b))), lx_1.e(this.b)));
        if (dz_0.c(iterator)) {
            AbstractModule abstractModule = (AbstractModule)dz_0.b(iterator);
            if (axq_1.a(lx_1.b(this.b), wc_1.a(abstractModule)) > n) {
                n = axq_1.a(lx_1.b(this.b), wc_1.a(abstractModule));
            }
        }
        return n;
    }

    public boolean a(Setting setting) {
        aS4.b();
        return ahg_0.v(setting) == SettingType.COMBOBOX || ahg_0.v(setting) == SettingType.CHECKBOX || ahg_0.v(setting) == SettingType.SLIDER || ahg_0.v(setting) == SettingType.SELECTBOX;
    }

    public boolean b() {
        aS4.b();
        return ListInvoker.indexOf(lx_1.a(this.b), this) == axq_1.a(lx_1.b(this.b));
    }
}

