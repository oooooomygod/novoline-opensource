/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Sg
 */
public class sg_0
extends Gui
implements p7_0 {
    private static ResourceLocation g = new ResourceLocation(Y7.a);
    private Minecraft f;
    private long j;
    private aee_2 h;
    public static ResourceLocation i = new ResourceLocation(Y7.b);

    private void a(int n, int n2, float f, float f2, dp_1 dp_12) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.f), i);
        if (dp_12 != aee_2.g) {
            int n3 = (int)(f2 * 255.0f);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(n2, f, 0.0f);
            float f3 = a55.b(dp_12) ? 1.0f : 0.25f;
            GlStateManagerInvoker.color(f3, f3, f3, f2);
            a55.a(dp_12, f3, n3);
            GlStateManagerInvoker.popMatrix();
            String string = StringInvoker.a((Object)awu_1.a(GameSettingsInvoker.getKeyCode(this.f.gameSettings.E[n])));
            if (n3 > 3 && a55.b(dp_12)) {
                FontRendererInvoker.drawStringWithShadow(this.f.fontRendererObj, string, n2 + 19 - 2 - FontRendererInvoker.a(this.f.fontRendererObj, string), f + 6.0f + 3.0f, 0xFFFFFF + (n3 << 24));
            }
        }
    }

    public void c() {
        this.j = MCInvoker.a();
        if (this.a()) {
            int n = ans_0.b(this.h);
            if (n != -1) {
                ans_0.b(this.h, n);
            }
        } else {
            this.h = new aee_2(this);
        }
    }

    public boolean a() {
        return this.h != null;
    }

    @Override
    public void a(aee_2 aee_22) {
        this.h = null;
        this.j = 0L;
    }

    public sg_0(Minecraft minecraft) {
        this.f = minecraft;
    }

    public void a(int n) {
        int n2;
        for (n2 = ans_0.b(this.h) + n; !(n2 > 8 || ans_0.a(this.h, n2) != aee_2.g && a55.b(ans_0.a(this.h, n2))); n2 += n) {
        }
        if (n2 <= 8) {
            ans_0.b(this.h, n2);
            this.j = MCInvoker.a();
        }
    }

    public void a(ScaledResolution scaledResolution, float f) {
        if (this.h != null) {
            float f2 = this.b();
            if (f2 <= 0.0f) {
                ans_0.c(this.h);
            } else {
                int n = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2;
                float f3 = zLevel;
                zLevel = -90.0f;
                float f4 = (float)ScaledResolutionInvoker.i(scaledResolution) - 22.0f * f2;
                sr_1 sr_12 = ans_0.a(this.h);
                this.a(scaledResolution, f2, n, f4, sr_12);
                zLevel = f3;
            }
        }
    }

    public void a(ScaledResolution scaledResolution) {
        int n = (int)(this.b() * 255.0f);
        if (n > 3 && this.h != null) {
            dp_1 dp_12 = ans_0.d(this.h);
            String string = dp_12 != aee_2.g ? aBO.a(a55.a(dp_12)) : aBO.a(CX.a(ans_0.e(this.h)));
            int n2 = (ScaledResolutionInvoker.getScaledWidth(scaledResolution) - FontRendererInvoker.a(this.f.fontRendererObj, string)) / 2;
            int n3 = ScaledResolutionInvoker.i(scaledResolution) - 35;
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            FontRendererInvoker.drawStringWithShadow(this.f.fontRendererObj, string, n2, n3, 0xFFFFFF + (n << 24));
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.popMatrix();
        }
    }

    protected void a(ScaledResolution scaledResolution, float f, int n, float f2, sr_1 sr_12) {
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.f), g);
        this.a(n - 91, f2, 0, 0, 182, 22);
        if (aif_1.a(sr_12) >= 0) {
            this.a(n - 91 - 1 + aif_1.a(sr_12) * 20, f2 - 1.0f, 0, 22, 24, 22);
        }
        ne_0.f();
        int n2 = 0;
        while (true) {
            this.a(n2, ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2 - 90 + n2 * 20 + 2, f2 + 3.0f, f, aif_1.a(sr_12, n2));
            ++n2;
        }
    }

    private float b() {
        long l4 = this.j - MCInvoker.a() + 5000L;
        return MathHelper.b((float)l4 / 2000.0f, 0.0f, 1.0f);
    }

    public void b(int n) {
        this.j = MCInvoker.a();
        if (this.h != null) {
            ans_0.b(this.h, n);
        } else {
            this.h = new aee_2(this);
        }
    }
}

