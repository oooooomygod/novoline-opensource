/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.OpenGlHelper;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.jO
 */
public abstract class jo_0<T extends nl_1>
extends jg_1<T> {
    public void a(T t, float f) {
        int n = CG.c(t, f);
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.a(apl_1.ab, n2, (float)n3);
    }

    private double a(double d, double d2, double d3) {
        return d + (d2 - d) * d3;
    }

    @Override
    protected void a(T t, double d, double d2, double d3, float f, float f2) {
        if (!ys_2.aC() || !aVE.ch) {
            Entity entity = CG.j(t);
            d2 -= (1.6 - (double)((nl_1)t).n) * 0.5;
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            double d4 = this.a((double)entity.prevRotationYaw, (double)entity.rotationYaw, (double)(f2 * 0.5f)) * 0.01745329238474369;
            double d5 = this.a((double)entity.prevRotationPitch, (double)entity.rotationPitch, (double)(f2 * 0.5f)) * 0.01745329238474369;
            double d6 = MathHelper.b(d4);
            double d7 = MathHelper.h(d4);
            double d8 = MathHelper.h(d5);
            if (entity instanceof nc_2) {
                d6 = 0.0;
                d7 = 0.0;
                d8 = -1.0;
            }
            double d9 = MathHelper.b(d5);
            double d10 = this.a(entity.prevPosX, entity.posX, (double)f2) - d6 * 0.7 - d7 * 0.5 * d9;
            double d11 = this.a(entity.prevPosY + (double)ayj_0.n(entity) * 0.7, entity.posY + (double)ayj_0.n(entity) * 0.7, (double)f2) - d8 * 0.5 - 0.25;
            double d12 = this.a(entity.prevPosZ, entity.posZ, (double)f2) - d7 * 0.7 + d6 * 0.5 * d9;
            double d13 = this.a((double)((nl_1)t).ay, (double)((nl_1)t).aD, (double)f2) * 0.01745329238474369 + 1.5707963267948966;
            d6 = (double)MathHelper.b(d13) * (double)((nl_1)t).width * 0.4;
            d7 = (double)MathHelper.h(d13) * (double)((nl_1)t).width * 0.4;
            double d14 = this.a(((nl_1)t).prevPosX, ((nl_1)t).posX, (double)f2) + d6;
            double d15 = this.a(((nl_1)t).prevPosY, ((nl_1)t).posY, (double)f2);
            double d16 = this.a(((nl_1)t).prevPosZ, ((nl_1)t).posZ, (double)f2) + d7;
            d += d6;
            d3 += d7;
            double d17 = (float)(d10 - d14);
            double d18 = (float)(d11 - d15);
            double d19 = (float)(d12 - d16);
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.A();
            if (ys_2.aC()) {
                a3c_0.G();
            }
            WorldRendererInvoker.begin(worldRenderer, 5, DefaultVertexFormats.d);
            int n = 0;
            while (true) {
                float f3 = 0.5f;
                float f4 = 0.4f;
                float f5 = 0.3f;
                int cfr_ignored_0 = n % 2;
                float f6 = (float)n / 24.0f;
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + d17 * (double)f6 + 0.0, d2 + d18 * (double)(f6 * f6 + f6) * 0.5 + (double)((24.0f - (float)n) / 18.0f + 0.125f), d3 + d19 * (double)f6), f3 *= 0.7f, f4 *= 0.7f, f5 *= 0.7f, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + d17 * (double)f6 + 0.025, d2 + d18 * (double)(f6 * f6 + f6) * 0.5 + (double)((24.0f - (float)n) / 18.0f + 0.125f) + 0.025, d3 + d19 * (double)f6), f3, f4, f5, 1.0f));
                ++n;
            }
        }
    }

    @Override
    public boolean a(T t, ao7_0 ao7_02, double d, double d2, double d3) {
        if (super.a(t, ao7_02, d, d2, d3)) {
            return true;
        }
        if (CG.t(t) && CG.j(t) != null) {
            Entity entity = CG.j(t);
            return are_0.a(ao7_02, ayj_0.u(entity));
        }
        return false;
    }

    public jo_0(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
    }

    @Override
    protected boolean a(T t) {
        return super.c(t) && (CG.h(t) || CG.r(t) && t == this.a.p);
    }

    @Override
    public void b(T t, double d, double d2, double d3, float f, float f2) {
        super.a(t, d, d2, d3, f, f2);
        this.a(t, d, d2, d3, f, f2);
    }
}

