/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.BlockRendererDispatcher;
import net.minecraft.init.Blocks;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.minecraft.renderer.texture.TextureMap;

/*
 * Renamed from net.a7y
 */
public class a7y_0
implements KB<nf_2> {
    private j9_0 a;

    @Override
    public void a(nf_2 nf_22, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (avp_0.c(nf_22) != 0) {
            BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(MCInvoker.f());
            GlStateManagerInvoker.c();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.b(5.0f + 180.0f * ((rd_1)apr_2.a((j9_0)this.a)).l.t / (float)Math.PI, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.translate(-0.9375f, -0.625f, -0.9375f);
            float f8 = 0.5f;
            GlStateManagerInvoker.c(f8, -f8, f8);
            int n = avp_0.a(nf_22, f3);
            int n2 = n % 65536;
            int n3 = n / 65536;
            OpenGlHelper.a(apl_1.ab, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            apr_2.a(this.a, TextureMap.r);
            xd_0.a(blockRendererDispatcher, ye_1.a(Blocks.bY), 1.0f);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.y();
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    public a7y_0(j9_0 j9_02) {
        this.a = j9_02;
    }
}

