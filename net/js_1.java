/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.EntityLivingBase;
import deobf.OpenGlHelper;
import deobf.Tessellator;
import deobf.Vec3;
import net.minecraft.renderer.WorldRenderer;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.jS
 */
public class js_1
extends jo_0<nx_1> {
    private static ResourceLocation p;
    private static ResourceLocation m;
    private static ResourceLocation o;
    int n;

    private Vec3 a(EntityLivingBase entityLivingBase, double d, float f) {
        double d2 = entityLivingBase.lastTickPosX + (entityLivingBase.posX - entityLivingBase.lastTickPosX) * (double)f;
        double d3 = d + entityLivingBase.lastTickPosY + (entityLivingBase.posY - entityLivingBase.lastTickPosY) * (double)f;
        double d4 = entityLivingBase.lastTickPosZ + (entityLivingBase.posZ - entityLivingBase.lastTickPosZ) * (double)f;
        return new Vec3(d2, d3, d4);
    }

    @Override
    public void a(nx_1 nx_12, double d, double d2, double d3, float f, float f2) {
        if (this.n != a4L.a((r4_0)this.h)) {
            this.h = new r4_0();
            this.n = a4L.a((r4_0)this.h);
        }
        super.b(nx_12, d, d2, d3, f, f2);
        EntityLivingBase entityLivingBase = aBR.l(nx_12);
        float f3 = aBR.b(nx_12, f2);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        this.a(m);
        GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
        GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.A();
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.c(true);
        float f4 = 240.0f;
        OpenGlHelper.a(apl_1.ab, f4, f4);
        GlStateManagerInvoker.b(770, 1, 1, 0);
        float f5 = (float)aV8.d(nx_12.worldObj) + f2;
        float f6 = f5 * 0.5f % 1.0f;
        float f7 = aBR.d(nx_12);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2 + f7, (float)d3);
        Vec3 vec3 = this.a(entityLivingBase, (double)entityLivingBase.n * 0.5, f2);
        Vec3 vec32 = this.a(nx_12, (double)f7, f2);
        Vec3 vec33 = aNE.b(vec3, vec32);
        double d4 = aNE.c(vec33) + 1.0;
        vec33 = aNE.b(vec33);
        float f8 = (float)MathInvoker.h(vec33.yCoord);
        float f9 = (float)MathInvoker.c(vec33.zCoord, vec33.xCoord);
        GlStateManagerInvoker.b((1.5707964f + -f9) * 57.295776f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f8 * 57.295776f, 1.0f, 0.0f, 0.0f);
        boolean bl = true;
        double d5 = (double)f5 * 0.05 * (1.0 - (double)(bl & true) * 2.5);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        float f10 = f3 * f3;
        int n = 64 + (int)(f10 * 240.0f);
        int n2 = 32 + (int)(f10 * 192.0f);
        int n3 = 128 - (int)(f10 * 64.0f);
        double d6 = (double)bl * 0.2;
        double d7 = d6 * 1.41;
        double d8 = 0.0 + (double)MathHelper.b(d5 + 2.356194490192345) * d7;
        double d9 = 0.0 + (double)MathHelper.h(d5 + 2.356194490192345) * d7;
        double d10 = 0.0 + (double)MathHelper.b(d5 + 0.7853981633974483) * d7;
        double d11 = 0.0 + (double)MathHelper.h(d5 + 0.7853981633974483) * d7;
        double d12 = 0.0 + (double)MathHelper.b(d5 + 3.9269908169872414) * d7;
        double d13 = 0.0 + (double)MathHelper.h(d5 + 3.9269908169872414) * d7;
        double d14 = 0.0 + (double)MathHelper.b(d5 + 5.497787143782138) * d7;
        double d15 = 0.0 + (double)MathHelper.h(d5 + 5.497787143782138) * d7;
        double d16 = 0.0 + (double)MathHelper.b(d5 + Math.PI) * d6;
        double d17 = 0.0 + (double)MathHelper.h(d5 + Math.PI) * d6;
        double d18 = 0.0 + (double)MathHelper.b(d5 + 0.0) * d6;
        double d19 = 0.0 + (double)MathHelper.h(d5 + 0.0) * d6;
        double d20 = 0.0 + (double)MathHelper.b(d5 + 1.5707963267948966) * d6;
        double d21 = 0.0 + (double)MathHelper.h(d5 + 1.5707963267948966) * d6;
        double d22 = 0.0 + (double)MathHelper.b(d5 + 4.71238898038469) * d6;
        double d23 = 0.0 + (double)MathHelper.h(d5 + 4.71238898038469) * d6;
        double d24 = -1.0f + f6;
        double d25 = d4 * (0.5 / d6) + d24;
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d16, d4, d17), 0.4999, d25), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d16, 0.0, d17), 0.4999, d24), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d18, 0.0, d19), 0.0, d24), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d18, d4, d19), 0.0, d25), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d20, d4, d21), 0.4999, d25), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d20, 0.0, d21), 0.4999, d24), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d22, 0.0, d23), 0.0, d24), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d22, d4, d23), 0.0, d25), n, n2, n3, 255));
        double d26 = 0.0;
        if (nx_12.ticksExisted % 2 == 0) {
            d26 = 0.5;
        }
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d8, d4, d9), 0.5, d26 + 0.5), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d10, d4, d11), 1.0, d26 + 0.5), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d14, d4, d15), 1.0, d26), n, n2, n3, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d12, d4, d13), 0.5, d26), n, n2, n3, 255));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.popMatrix();
    }

    @Override
    protected void a(nx_1 nx_12, float f) {
        if (aBR.f(nx_12)) {
            GlStateManagerInvoker.c(2.35f, 2.35f, 2.35f);
        }
    }

    @Override
    protected ResourceLocation a(nx_1 nx_12) {
        return aBR.f(nx_12) ? p : o;
    }

    static {
        o = new ResourceLocation(aSA.b);
        p = new ResourceLocation(aSA.a);
        m = new ResourceLocation(aSA.c);
    }

    @Override
    public boolean a(nx_1 nx_12, ao7_0 ao7_02, double d, double d2, double d3) {
        if (super.a(nx_12, ao7_02, d, d2, d3)) {
            return true;
        }
        if (aBR.e(nx_12)) {
            EntityLivingBase entityLivingBase = aBR.l(nx_12);
            Vec3 vec3 = this.a(entityLivingBase, (double)entityLivingBase.n * 0.5, 1.0f);
            Vec3 vec32 = this.a(nx_12, (double)aBR.d(nx_12), 1.0f);
            return are_0.a(ao7_02, h__0.a(vec32.xCoord, vec32.yCoord, vec32.zCoord, vec3.xCoord, vec3.yCoord, vec3.zCoord));
        }
        return false;
    }

    public js_1(RenderManager renderManager) {
        super(renderManager, new r4_0(), 0.5f);
        this.n = a4L.a((r4_0)this.h);
    }
}

