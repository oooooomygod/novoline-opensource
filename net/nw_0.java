/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.nW
 */
public class nw_0
extends mi_1 {
    private RenderManager aB = MCInvoker.j(MCInvoker.f());
    private int aC;
    private float aA;
    private Entity aD;
    private Entity az;
    private int aE;

    @Override
    public void onUpdate() {
        ++this.aC;
        if (this.aC == this.aE) {
            this.E();
        }
    }

    public nw_0(World world, Entity entity, Entity entity2, float f) {
        super(world, entity.posX, entity.posY, entity.posZ, entity.motionX, entity.motionY, entity.motionZ);
        this.aD = entity;
        this.az = entity2;
        this.aE = 3;
        this.aA = f;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.aC + f) / (float)this.aE;
        f7 *= f7;
        double d = this.aD.posX;
        double d2 = this.aD.posY;
        double d3 = this.aD.posZ;
        double d4 = this.az.lastTickPosX + (this.az.posX - this.az.lastTickPosX) * (double)f;
        double d5 = this.az.lastTickPosY + (this.az.posY - this.az.lastTickPosY) * (double)f + (double)this.aA;
        double d6 = this.az.lastTickPosZ + (this.az.posZ - this.az.lastTickPosZ) * (double)f;
        double d7 = d + (d4 - d) * (double)f7;
        double d8 = d2 + (d5 - d2) * (double)f7;
        double d9 = d3 + (d6 - d3) * (double)f7;
        int n = this.d(f);
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.a(apl_1.ab, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        FT.a(this.aB, this.aD, (float)(d7 -= aj), (float)(d8 -= ap), (float)(d9 -= aw), this.aD.rotationYaw, f);
    }

    @Override
    public int f() {
        return 3;
    }
}

