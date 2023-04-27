/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Date;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.a8r
 */
class a8r_0
extends aiy_1 {
    RP x;

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        dr_1 dr_12 = (dr_1)ListInvoker.get(RP.i(this.x), n);
        String string = apn_0.c(dr_12);
        if (aw__0.b((CharSequence)string)) {
            string = aL0.c(aL0.a(aL0.a(new StringBuilder(), RP.g(this.x)), a77.g), n + 1).toString();
        }
        String string2 = apn_0.d(dr_12);
        string2 = aL0.a(aL0.a(aL0.a(new StringBuilder(), string2), a77.b), ai__0.a(RP.h(this.x), new Date(apn_0.b(dr_12)))).toString();
        string2 = aL0.a(aL0.a(new StringBuilder(), string2), a77.e).toString();
        String string3 = a77.h;
        if (apn_0.f(dr_12)) {
            string3 = aL0.a(aL0.a(aL0.a(new StringBuilder(), RP.j(this.x)), a77.f), string3).toString();
        } else {
            string3 = RP.f(this.x)[ar3_0.a(apn_0.a(dr_12))];
            if (apn_0.g(dr_12)) {
                string3 = aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_RED), I18n.format(a77.c, new Object[0])), (Object)anw_0.RESET).toString();
            }
            if (apn_0.e(dr_12)) {
                string3 = aL0.a(aL0.a(aL0.a(new StringBuilder(), string3), a77.d), I18n.format(a77.a, new Object[0])).toString();
            }
        }
        u5_0.a(this.x, this.x.q, string, n2 + 2, n3 + 1, 0xFFFFFF);
        u5_0.a(this.x, this.x.q, string2, n2 + 2, n3 + 12, 0x808080);
        u5_0.a(this.x, this.x.q, string3, n2 + 2, n3 + 12 + 10, 0x808080);
    }

    public a8r_0(RP rP, Minecraft minecraft) {
        this.x = rP;
        super(minecraft, rP.n, rP.f, 32, rP.f - 64, 36);
    }

    @Override
    protected int f() {
        return ListInvoker.size(RP.i(this.x));
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        boolean bl2;
        RP.a(this.x, n);
        RP.c((RP)this.x).g = bl2 = RP.e(this.x) >= 0 && RP.e(this.x) < this.f();
        RP.a((RP)this.x).g = bl2;
        RP.d((RP)this.x).g = bl2;
        RP.b((RP)this.x).g = bl2;
        u5_0.a(this.x, n);
    }

    @Override
    protected boolean c(int n) {
        return n == RP.e(this.x);
    }

    @Override
    protected int e() {
        return ListInvoker.size(RP.i(this.x)) * 36;
    }

    @Override
    protected void a() {
        u5_0.a(this.x);
    }
}

