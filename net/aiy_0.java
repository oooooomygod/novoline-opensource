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
import cc.novoline.invoke.StringPropertyInvoker;
import deobf.MCInvoker;
import deobf.SettingType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import net.Ba;
import net.MathHelper;
import net.a1V;
import net.aMF;
import net.aS4;
import net.aWH;
import net.acy_1;
import net.agh_1;
import net.ags_2;
import net.ahg_0;
import net.aj_;
import net.aol_1;
import net.aqe_2;
import net.auk_2;
import net.ava_0;
import net.axq_1;
import net.dz_0;
import net.hb_2;
import net.lx_1;
import net.oc_1;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.aIy
 */
public class aiy_0 {
    private Setting b;
    private float e;
    private List<aS4> d;
    private boolean a;
    private aWH c;

    public void a(boolean bl) {
        this.a = bl;
    }

    private int lambda$getLongestS$0(Setting setting) {
        return axq_1.a(lx_1.b(agh_1.c(this.c)), ahg_0.j(setting));
    }

    public int e() {
        return acy_1.a(aj_.b(aj_.a(aMF.a(ListInvoker.stream(ManagerInvoker.a(agh_1.d(this.c))), this::lambda$getLongestS$0), aiy_0::lambda$getLongestS$1)), 0);
    }

    public Setting f() {
        return this.b;
    }

    public List<aS4> g() {
        return this.d;
    }

    public boolean b() {
        aS4.b();
        return ListInvoker.indexOf(agh_1.a(this.c), this) == axq_1.d(lx_1.b(agh_1.c(this.c)));
    }

    public void h() {
        float f;
        float f2;
        block11: {
            double d;
            block10: {
                aS4.b();
                f2 = axq_1.e(lx_1.b(agh_1.c(this.c))) + ListInvoker.indexOf(agh_1.a(this.c), this) * axq_1.h(lx_1.b(agh_1.c(this.c)));
                f = f2 + (float)axq_1.h(lx_1.b(agh_1.c(this.c)));
                d = MCInvoker.O(MCInvoker.f()) / 13;
                if (!this.b()) break block10;
                if (!(this.e < 3.0f)) break block11;
                this.e = (float)MathHelper.b((double)this.e + 3.0 / d, 0.0, 3.0);
                ListInvoker.b(new ListInvoker[4]);
            }
            if (this.e > 0.0f) {
                this.e = (float)MathHelper.b((double)this.e - 3.0 / d, 0.0, 3.0);
            }
        }
        int n = axq_1.i(lx_1.b(agh_1.c(this.c))) + agh_1.f(this.c);
        if (this.b()) {
            long l4 = 0L;
            int n2 = (int)f2 + 1;
            if ((float)n2 < f - 2.0f) {
                a1V.b((double)n + 17.5, (double)n2, (double)(n + 19), (double)(n2 + 1), hb_2.a(l4));
                l4 -= 120L;
                ++n2;
            }
        }
        axq_1.a(lx_1.b(agh_1.c(this.c)), ahg_0.j(this.b), (double)((float)n + this.e + 18.0f), (double)f2 + (double)axq_1.a(lx_1.b(agh_1.c(this.c)), 20) * 0.3 - (double)(10 - axq_1.b(lx_1.b(agh_1.c(this.c)))) * 0.2, ahg_0.v(this.b) == SettingType.CHECKBOX ? (auk_2.a((Boolean)Ba.b(ahg_0.l(this.f()))) ? -1 : aol_1.b(new Color(163, 163, 163, 255))) : -1);
        if (this.d()) {
            float f3;
            float f4;
            aS4 aS42 = (aS4)ListInvoker.get(this.d, 0);
            SettingType settingType = ahg_0.v(aqe_2.a(aS42).f());
            float f5 = axq_1.e(lx_1.b(agh_1.c(this.c)));
            float f6 = ListInvoker.size(this.d) * axq_1.h(lx_1.b(agh_1.c(this.c)));
            if (settingType == SettingType.COMBOBOX) {
                f4 = n + aqe_2.a(aS42).e() + 27;
                f3 = aqe_2.b(aS42) + 10;
                axq_1.a(lx_1.b(agh_1.c(this.c)), f4, f5, f3, f6);
            }
            if (settingType == SettingType.SELECTBOX) {
                f4 = n + aqe_2.a(aS42).e() + 27;
                f3 = aqe_2.b(aS42) + 10;
                axq_1.a(lx_1.b(agh_1.c(this.c)), f4, f5, f3, f6);
            }
            if (settingType == SettingType.SLIDER) {
                f4 = n + aqe_2.a(aS42).e() + 27;
                f3 = (float)aqe_2.b(aS42) + 5.0f;
                axq_1.a(lx_1.b(agh_1.c(this.c)), f4, f5, f3, f6);
            }
            ListInvoker.forEach(this.d, aS4::e);
        }
    }

    public aWH a() {
        return this.c;
    }

    private static boolean lambda$getLongestS$1(int n) {
        aS4.b();
        return n >= 0;
    }

    public aiy_0(Setting setting, aWH aWH2) {
        aS4.b();
        this.d = new ObjectArrayList();
        this.e = 0.0f;
        this.b = setting;
        this.c = aWH2;
        this.a(false);
        switch (ags_2.a[ahg_0.v(setting).ordinal()]) {
            case 1: {
                ListInvoker.add(this.d, new aS4(this));
            }
            case 2: {
                String string;
                Iterator iterator = ListInvoker.iterator(ava_0.b(ahg_0.k(setting)));
                if (dz_0.c(iterator)) {
                    string = (String)dz_0.b(iterator);
                    ListInvoker.add(this.d, new aS4(this, string));
                }
            }
            case 3: {
                Iterator iterator = ListInvoker.iterator(StringPropertyInvoker.a(ahg_0.z(setting)));
                if (!dz_0.c(iterator)) break;
                String string = (String)dz_0.b(iterator);
                ListInvoker.add(this.d, new aS4(this, string));
            }
        }
    }

    public boolean d() {
        return this.a;
    }

    public @Nullable aS4 c() {
        return (aS4)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.d), aS4::d)), null);
    }
}

