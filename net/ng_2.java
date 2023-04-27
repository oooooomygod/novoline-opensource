/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.ng
 */
public class ng_2
extends mi_1 {
    private EntityLivingBase az;

    protected ng_2(World world, double d, double d2, double d3) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.av = 1.0f;
        this.ao = 1.0f;
        this.an = 1.0f;
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.motionX = 0.0;
        this.ar = 0.0f;
        this.am = 30;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.az != null) {
            RenderManager renderManager = MCInvoker.j(MCInvoker.f());
            FT.b(renderManager, mi_1.aj, mi_1.ap, mi_1.aw);
            float f7 = 0.42553192f;
            float f8 = ((float)this.ay + f) / (float)this.am;
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.b(770, 771);
            float f9 = 240.0f;
            OpenGlHelper.a(apl_1.ab, f9, f9);
            GlStateManagerInvoker.pushMatrix();
            float f10 = 0.05f + 0.5f * MathHelper.sin(f8 * (float)Math.PI);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f10);
            GlStateManagerInvoker.translate(0.0f, 1.8f, 0.0f);
            GlStateManagerInvoker.b(180.0f - entity.rotationYaw, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.b(60.0f - 150.0f * f8 - entity.rotationPitch, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.translate(0.0f, -0.4f, -1.5f);
            GlStateManagerInvoker.c(f7, f7, f7);
            this.az.prevRotationYaw = 0.0f;
            this.az.rotationYaw = 0.0f;
            this.az.aR = 0.0f;
            this.az.aP = 0.0f;
            FT.a(renderManager, this.az, 0.0, 0.0, 0.0, 0.0f, f);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.enableDepth();
        }
    }

    @Override
    public int f() {
        return 3;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.az == null) {
            nx_1 nx_12 = new nx_1(this.worldObj);
            aBR.g(nx_12);
            this.az = nx_12;
        }
    }
}

