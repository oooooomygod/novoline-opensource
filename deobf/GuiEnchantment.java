/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.item.ItemStack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import net.GuiContainer;
import net.I18n;
import net.MathHelper;
import net.ResourceLocation;
import net.ScaledResolution;
import net.World;
import net.a5_0;
import net.aBO;
import net.aL0;
import net.aN5;
import net.aSK;
import net.aSY;
import net.aad_1;
import net.act_2;
import net.aec_1;
import net.afy_2;
import net.anw_0;
import net.ap3_0;
import net.arf_2;
import net.au5_0;
import net.awt_2;
import net.jt_0;
import net.my_0;
import net.ne_0;
import net.ri_1;
import net.xr_1;

public class GuiEnchantment
extends GuiContainer {
    private aSK al;
    public float as;
    private static ResourceLocation aq = new ResourceLocation(jt_0.j);
    public float av;
    private static ri_1 an;
    public float ar;
    ItemStack ak;
    public float au;
    public float ap;
    private aad_1 ai;
    private static ResourceLocation am;
    public float at;
    private Random ao = new Random();
    public int aw;
    private arf_2 aj;

    public GuiEnchantment(aSK aSK2, World world, arf_2 arf_22) {
        super(new aad_1(aSK2, world));
        this.al = aSK2;
        this.ai = (aad_1)this.F;
        this.aj = arf_22;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        int n4 = (this.n - this.L) / 2;
        int n5 = (this.f - this.Y) / 2;
        int n6 = 0;
        while (true) {
            int n7 = n - (n4 + 60);
            int n8 = n2 - (n5 + 14 + 19 * n6);
            if (n7 < 108 && n8 < 19 && ap3_0.a(this.ai, this.t.player, n6)) {
                PlayerControllerInvoker.a(this.t.playerController, this.ai.f, n6);
            }
            ++n6;
        }
    }

    @Override
    protected void b(int n, int n2) {
        FontRendererInvoker.a(this.q, aBO.d(au5_0.a(this.aj)), 12.0f, 5.0f, 0x404040);
        FontRendererInvoker.a(this.q, aBO.d(InventoryInvoker.d(this.al)), 8.0f, this.Y - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), aq);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.loadIdentity();
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        GlStateManagerInvoker.viewport((ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 320) / 2 * ScaledResolutionInvoker.getScaleFactor(scaledResolution), (ScaledResolutionInvoker.i(scaledResolution) - 240) / 2 * ScaledResolutionInvoker.getScaleFactor(scaledResolution), 320 * ScaledResolutionInvoker.getScaleFactor(scaledResolution), 240 * ScaledResolutionInvoker.getScaleFactor(scaledResolution));
        GlStateManagerInvoker.translate(-0.34f, 0.23f, 0.0f);
        awt_2.a(90.0f, 1.3333334f, 9.0f, 80.0f);
        float f2 = 1.0f;
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.loadIdentity();
        ne_0.a();
        GlStateManagerInvoker.translate(0.0f, 3.3f, -16.0f);
        GlStateManagerInvoker.c(f2, f2, f2);
        float f3 = 5.0f;
        GlStateManagerInvoker.c(f3, f3, f3);
        GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), am);
        GlStateManagerInvoker.b(20.0f, 1.0f, 0.0f, 0.0f);
        float f4 = this.av + (this.as - this.av) * f;
        GlStateManagerInvoker.translate((1.0f - f4) * 0.2f, (1.0f - f4) * 0.1f, (1.0f - f4) * 0.25f);
        GlStateManagerInvoker.b(-(1.0f - f4) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(180.0f, 1.0f, 0.0f, 0.0f);
        float f5 = this.at + (this.au - this.at) * f + 0.25f;
        float f6 = this.at + (this.au - this.at) * f + 0.75f;
        f5 = (f5 - (float)MathHelper.a((double)f5)) * 1.6f - 0.3f;
        f6 = (f6 - (float)MathHelper.a((double)f6)) * 1.6f - 0.3f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        GlStateManagerInvoker.c();
        aec_1.a(an, null, 0.0f, f5, f6, f4, 0.0f, 0.0625f);
        GlStateManagerInvoker.y();
        ne_0.e();
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.viewport(0, 0, this.t.displayWidth, this.t.displayHeight);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.popMatrix();
        ne_0.e();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        aN5.a(aN5.a(), this.ai.p);
        ap3_0.a(this.ai);
        int n5 = 0;
        while (true) {
            int n6 = n3 + 60;
            int cfr_ignored_0 = n6 + 20;
            aN5.a(aN5.a());
            zLevel = 0.0f;
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), aq);
            int cfr_ignored_1 = this.ai.m[n5];
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.c(n6, n4 + 14 + 19 * n5, 0, 185, 108, 19);
            ++n5;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
        aSY.a(this.t.player.abilities);
        int n3 = ap3_0.a(this.ai);
        int n4 = 0;
        while (true) {
            int n5 = this.ai.m[n4];
            int n6 = this.ai.n[n4];
            int n7 = n4 + 1;
            if (this.a(60, 14 + 19 * n4, 108, 17, n, n2)) {
                String string;
                ArrayList arrayList = my_0.c();
                if (xr_1.a(n6 & 0xFF) != null) {
                    string = xr_1.c(xr_1.a(n6 & 0xFF), (n6 & 0xFF00) >> 8);
                    ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), anw_0.WHITE.toString()), anw_0.ITALIC.toString()), I18n.format(jt_0.f, new Object[]{string})).toString());
                }
                ListInvoker.add(arrayList, jt_0.e);
                if (this.t.player.bL < n5) {
                    ListInvoker.add(arrayList, aL0.c(aL0.a(aL0.a(new StringBuilder(), anw_0.RED.toString()), jt_0.m), this.ai.m[n4]).toString());
                } else {
                    string = jt_0.l;
                    string = I18n.format(jt_0.g, new Object[0]);
                    if (n3 >= n7) {
                        ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), anw_0.GRAY.toString()), jt_0.n), string).toString());
                    } else {
                        ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), anw_0.RED.toString()), jt_0.k), string).toString());
                    }
                    string = I18n.format(jt_0.b, new Object[0]);
                    ListInvoker.add(arrayList, aL0.a(aL0.a(aL0.a(new StringBuilder(), anw_0.GRAY.toString()), jt_0.i), string).toString());
                }
                this.a(arrayList, n, n2);
                return;
            }
            ++n4;
        }
    }

    @Override
    public void g() {
        super.g();
        this.b();
    }

    static {
        am = new ResourceLocation(jt_0.d);
        an = new ri_1();
    }

    public void b() {
        ItemStack itemStack = ItemStackInvoker.a(afy_2.a(this.F, 0));
        if (!act_2.e(itemStack, this.ak)) {
            this.ak = itemStack;
            do {
                this.ar += (float)(a5_0.a(this.ao, 4) - a5_0.a(this.ao, 4));
            } while (!(this.au > this.ar + 1.0f) && !(this.au < this.ar - 1.0f));
        }
        ++this.aw;
        this.at = this.au;
        this.av = this.as;
        int n = 0;
        while (true) {
            if (this.ai.m[n] != 0) {
                // empty if block
            }
            ++n;
        }
    }
}

