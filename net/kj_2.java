/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.EntityPlayerSP;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.kj
 */
public class kj_2
extends jg_1<AbstractClientPlayer> {
    private boolean m;

    public void d(AbstractClientPlayer abstractClientPlayer) {
        float f = 1.0f;
        GlStateManagerInvoker.b(f, f, f);
        rv_0 rv_02 = this.a();
        this.c(abstractClientPlayer);
        rv_02.m = false;
        rv_02.f = 0.0f;
        aoe_0.a(rv_02, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, abstractClientPlayer);
        aoe_0.a(rv_02);
    }

    @Override
    protected void a(AbstractClientPlayer abstractClientPlayer, double d, double d2, double d3, String string, float f, double d4) {
        if (d4 < 100.0) {
            za_2 za_22 = aUi.s(abstractClientPlayer);
            acl_0 acl_02 = VM.a(za_22, 2);
            QU qU = VM.c(za_22, aUi.q(abstractClientPlayer), acl_02);
            this.a(abstractClientPlayer, aL0.a(aL0.a(aL0.c(new StringBuilder(), hs_0.d(qU)), aWY.a), afi_1.b(acl_02)).toString(), d, d2, d3, 64);
            d2 += (double)((float)FontRendererInvoker.d(this.b()) * 1.15f * f);
        }
        super.a(abstractClientPlayer, d, d2, d3, string, f, d4);
    }

    @Override
    public void a() {
        GlStateManagerInvoker.translate(0.0f, 0.1875f, 0.0f);
    }

    private void c(AbstractClientPlayer abstractClientPlayer) {
        rv_0 rv_02 = this.a();
        if (aUi.d(abstractClientPlayer)) {
            aoe_0.a(rv_02, false);
            rv_02.r.p = true;
            rv_02.k.p = true;
        } else {
            InventoryInvoker.g(abstractClientPlayer.inventory);
            aoe_0.a(rv_02, true);
            rv_02.k.p = aUi.a(abstractClientPlayer, aea_1.HAT);
            rv_02.z.p = aUi.a(abstractClientPlayer, aea_1.JACKET);
            rv_02.x.p = aUi.a(abstractClientPlayer, aea_1.LEFT_PANTS_LEG);
            rv_02.s.p = aUi.a(abstractClientPlayer, aea_1.RIGHT_PANTS_LEG);
            rv_02.y.p = aUi.a(abstractClientPlayer, aea_1.LEFT_SLEEVE);
            rv_02.w.p = aUi.a(abstractClientPlayer, aea_1.RIGHT_SLEEVE);
            rv_02.n = 0;
            rv_02.i = false;
            rv_02.m = aUi.m(abstractClientPlayer);
            rv_02.p = 0;
        }
    }

    public rv_0 a() {
        return (rv_0)super.d();
    }

    @Override
    public void a(AbstractClientPlayer abstractClientPlayer, double d, double d2, double d3, float f, float f2) {
        if (!aUi.b(abstractClientPlayer) || this.a.r == abstractClientPlayer) {
            double d4 = d2;
            if (aUi.m(abstractClientPlayer) && !(abstractClientPlayer instanceof EntityPlayerSP)) {
                d4 = d2 - 0.125;
            }
            this.c(abstractClientPlayer);
            super.a(abstractClientPlayer, d, d4, d3, f, f2);
        }
    }

    public kj_2(RenderManager renderManager) {
        this(renderManager, false);
    }

    public kj_2(RenderManager renderManager, boolean bl) {
        super(renderManager, new rv_0(0.0f, bl), 0.5f);
        this.m = bl;
        this.b(new aY7(this));
        this.b(new mr_1(this));
        this.b(new abq_2(this));
        this.b(new sw_0(this));
        this.b(new Tf(this));
        this.b(new ado_1(this.a().r));
    }

    public void a(AbstractClientPlayer abstractClientPlayer) {
        float f = 1.0f;
        GlStateManagerInvoker.b(f, f, f);
        rv_0 rv_02 = this.a();
        this.c(abstractClientPlayer);
        rv_02.f = 0.0f;
        rv_02.m = false;
        aoe_0.a(rv_02, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, abstractClientPlayer);
        aoe_0.b(rv_02);
    }

    protected void a(AbstractClientPlayer abstractClientPlayer, float f) {
        float f2 = 0.9375f;
        GlStateManagerInvoker.c(f2, f2, f2);
    }

    protected ResourceLocation b(AbstractClientPlayer abstractClientPlayer) {
        return aUi.a(abstractClientPlayer);
    }

    @Override
    protected void a(AbstractClientPlayer abstractClientPlayer, float f, float f2, float f3) {
        if (aUi.k(abstractClientPlayer) && aUi.f(abstractClientPlayer)) {
            GlStateManagerInvoker.b(aUi.j(abstractClientPlayer), 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.b(this.a(abstractClientPlayer), 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.b(270.0f, 0.0f, 1.0f, 0.0f);
        } else {
            super.a(abstractClientPlayer, f, f2, f3);
        }
    }

    @Override
    protected void a(AbstractClientPlayer abstractClientPlayer, double d, double d2, double d3) {
        if (aUi.k(abstractClientPlayer) && aUi.f(abstractClientPlayer)) {
            super.b(abstractClientPlayer, d + (double)abstractClientPlayer.bQ, d2 + (double)abstractClientPlayer.bJ, d3 + (double)abstractClientPlayer.bz);
        } else {
            super.b(abstractClientPlayer, d, d2, d3);
        }
    }
}

