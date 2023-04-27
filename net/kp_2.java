/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.kp
 */
public class kp_2
extends kj_2 {
    private boolean n;

    @Override
    protected void a(AbstractClientPlayer abstractClientPlayer, float f, float f2, float f3) {
        super.a(abstractClientPlayer, f, f2, f3);
    }

    @Override
    protected void a(AbstractClientPlayer abstractClientPlayer, double d, double d2, double d3) {
        super.a(abstractClientPlayer, d, d2, d3);
    }

    @Override
    public rv_0 a() {
        jc_0.c();
        if (!(this.h instanceof rr_1)) {
            this.h = new rr_1(0.0f, this.n);
        }
        return (rr_1)this.h;
    }

    private void b(AbstractClientPlayer abstractClientPlayer) {
        jc_0.b();
        rr_1 rr_12 = (rr_1)this.a();
        if (aUi.d(abstractClientPlayer)) {
            aC9.a(rr_12, false);
            rr_12.r.p = true;
            rr_12.k.p = true;
        }
        ItemStack itemStack = InventoryInvoker.g(abstractClientPlayer.inventory);
        aC9.a(rr_12, true);
        rr_12.k.p = aUi.a(abstractClientPlayer, aea_1.HAT);
        rr_12.z.p = aUi.a(abstractClientPlayer, aea_1.JACKET);
        rr_12.x.p = aUi.a(abstractClientPlayer, aea_1.LEFT_PANTS_LEG);
        rr_12.s.p = aUi.a(abstractClientPlayer, aea_1.RIGHT_PANTS_LEG);
        rr_12.y.p = aUi.a(abstractClientPlayer, aea_1.LEFT_SLEEVE);
        rr_12.w.p = aUi.a(abstractClientPlayer, aea_1.RIGHT_SLEEVE);
        rr_12.n = 0;
        rr_12.i = false;
        rr_12.m = aUi.m(abstractClientPlayer);
        rr_12.p = 0;
        rr_12.p = 1;
        if (aUi.i(abstractClientPlayer) > 0) {
            ti_1 ti_12 = act_2.m(itemStack);
            if (ti_12 == ti_1.BLOCK) {
                rr_12.p = 3;
            }
            if (ti_12 == ti_1.BOW) {
                rr_12.i = true;
            }
        }
    }

    @Override
    protected ResourceLocation b(AbstractClientPlayer abstractClientPlayer) {
        return aUi.a(abstractClientPlayer);
    }

    @Override
    protected void a(AbstractClientPlayer abstractClientPlayer, float f) {
        jc_0.b();
        float f2 = 0.9375f;
        GlStateManagerInvoker.c(f2, f2, f2);
        aC9.a((rr_1)this.a(), abstractClientPlayer);
        aC9.b((rr_1)this.h, 0.0625f);
        atJ atJ2 = s6_0.a(aUi.c(abstractClientPlayer));
        if (((F5)aGD.a((String)an2_0.a)).e) {
            GL11.glPushMatrix();
            float f3 = 0.0625f;
            GL11.glScalef((float)(-f3), (float)(-f3), (float)f3);
            abo_2.b(atJ2.J, (rr_1)this.a());
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
        aC9.a((rr_1)this.a(), 0.0625f);
    }

    public kp_2(RenderManager renderManager) {
        super(renderManager, false);
        this.n = false;
        jc_0.c();
        this.h = new rr_1(0.0f, false);
        ListInvoker.clear(this.g);
        this.b(new ayx_0(this));
        this.b(new mr_1(this));
        this.b(new afe_0(this));
        this.b(new aEF((rr_1)this.a()));
        if (ListInvoker.b() != null) {
            jc_0.b(false);
        }
    }

    @Override
    public void a(AbstractClientPlayer abstractClientPlayer) {
        float f = 1.0f;
        GlStateManagerInvoker.b(f, f, f);
        rv_0 rv_02 = this.a();
        this.b(abstractClientPlayer);
        rv_02.f = 0.0f;
        rv_02.m = false;
        aoe_0.a(rv_02, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, abstractClientPlayer);
        aoe_0.b(rv_02);
    }

    public kp_2(RenderManager renderManager, boolean bl) {
        super(renderManager, bl);
        jc_0.c();
        this.n = bl;
        this.h = new rr_1(0.0f, bl);
        ListInvoker.clear(this.g);
        this.b(new ayx_0(this));
        this.b(new mr_1(this));
        this.b(new afe_0(this));
        this.b(new aEF((rr_1)this.a()));
        ListInvoker.b(new ListInvoker[5]);
    }

    @Override
    public void d(AbstractClientPlayer abstractClientPlayer) {
        float f = 1.0f;
        GlStateManagerInvoker.b(f, f, f);
        rv_0 rv_02 = this.a();
        this.b(abstractClientPlayer);
        rv_02.m = false;
        rv_02.f = 0.0f;
        aoe_0.a(rv_02, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, abstractClientPlayer);
        aoe_0.a(rv_02);
    }

    public void d() {
        GlStateManagerInvoker.translate(0.0f, 0.1875f, 0.0f);
    }
}

