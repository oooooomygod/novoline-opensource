/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import deobf.MCInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aiT
 */
class ait_0
extends aiy_1 {
    private Map<String, aeb_0> y;
    private List<String> z;
    RL x;

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        FontRendererInvoker.setBidiFlag(this.x.q, true);
        aip_0.a(this.x, this.x.q, ((aeb_0)MapInvoker.c(this.y, ListInvoker.get(this.z, n))).toString(), this.r / 2, n3 + 1, 0xFFFFFF);
        FontRendererInvoker.setBidiFlag(this.x.q, AY.b(ad2_0.d(RL.d(this.x))));
    }

    @Override
    protected int f() {
        return ListInvoker.size(this.z);
    }

    @Override
    protected boolean c(int n) {
        return ((String)ListInvoker.get(this.z, n)).equals(AY.a(ad2_0.d(RL.d(this.x))));
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        aeb_0 aeb_02 = (aeb_0)MapInvoker.c(this.y, ListInvoker.get(this.z, n));
        ad2_0.a(RL.d(this.x), aeb_02);
        RL.b((RL)this.x).gameSettings = AY.a(aeb_02);
        MCInvoker.w(this.n);
        FontRendererInvoker.setUnicodeFlag(this.x.q, ad2_0.b(RL.d(this.x)) || RL.b((RL)this.x).bN);
        FontRendererInvoker.setBidiFlag(this.x.q, ad2_0.isCurrentLanguageBidirectional(RL.d(this.x)));
        RL.a((RL)this.x).k = I18n.format(amo_1.a, new Object[0]);
        RL.c((RL)this.x).k = awu_1.a(RL.b(this.x), aj2.FORCE_UNICODE_FONT);
        awu_1.c(RL.b(this.x));
    }

    @Override
    protected void a() {
        aip_0.a(this.x);
    }

    public ait_0(RL rL, Minecraft minecraft) {
        this.x = rL;
        super(minecraft, rL.n, rL.f, 32, rL.f - 65 + 4, 18);
        this.z = my_0.c();
        this.y = MapsInvoker.a();
        Iterator iterator = ago_0.a(ad2_0.c(RL.d(rL)));
        while (dz_0.c(iterator)) {
            aeb_0 aeb_02 = (aeb_0)dz_0.b(iterator);
            MapInvoker.c(this.y, AY.a(aeb_02), aeb_02);
            ListInvoker.add(this.z, AY.a(aeb_02));
        }
    }

    @Override
    protected int e() {
        return this.f() * 18;
    }
}

