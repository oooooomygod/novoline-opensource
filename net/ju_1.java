/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityMinecart;
import deobf.MCInvoker;
import net.minecraft.renderer.texture.TextureMap;
import deobf.Vec3;

/*
 * Renamed from net.jU
 */
public class ju_1<T extends EntityMinecart>
extends j7_0<T> {
    private static ResourceLocation f = new ResourceLocation(uy_2.a);
    protected q1_0 e = new ra_1();

    public ju_1(RenderManager renderManager) {
        super(renderManager);
        this.c = 0.5f;
    }

    @Override
    protected ResourceLocation a(T t) {
        return f;
    }

    public void a(T t, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        this.b(t);
        long l4 = (long)yw_2.d(t) * 493286711L;
        l4 = l4 * l4 * 4392167121L + l4 * 98761L;
        float f3 = (((float)(l4 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f4 = (((float)(l4 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float f5 = (((float)(l4 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        GlStateManagerInvoker.translate(f3, f4, f5);
        double d4 = ((EntityMinecart)t).lastTickPosX + (((EntityMinecart)t).posX - ((EntityMinecart)t).lastTickPosX) * (double)f2;
        double d5 = ((EntityMinecart)t).lastTickPosY + (((EntityMinecart)t).posY - ((EntityMinecart)t).lastTickPosY) * (double)f2;
        double d6 = ((EntityMinecart)t).lastTickPosZ + (((EntityMinecart)t).posZ - ((EntityMinecart)t).lastTickPosZ) * (double)f2;
        Vec3 vec3 = yw_2.a(t, d4, d5, d6);
        float f6 = ((EntityMinecart)t).prevRotationPitch + (((EntityMinecart)t).rotationPitch - ((EntityMinecart)t).prevRotationPitch) * f2;
        Vec3 vec32 = yw_2.a(t, d4, d5, d6, 0.3f);
        Vec3 vec33 = yw_2.a(t, d4, d5, d6, -0.3f);
        vec32 = vec3;
        vec33 = vec3;
        d += vec3.xCoord - d4;
        d2 += (vec32.yCoord + vec33.yCoord) / 2.0 - d5;
        d3 += vec3.zCoord - d6;
        Vec3 vec34 = aNE.a(vec33, -vec32.xCoord, -vec32.yCoord, -vec32.zCoord);
        if (aNE.c(vec34) != 0.0) {
            vec34 = aNE.b(vec34);
            f = (float)(MathInvoker.c(vec34.zCoord, vec34.xCoord) * 180.0 / Math.PI);
            f6 = (float)(MathInvoker.b(vec34.yCoord) * 73.0);
        }
        GlStateManagerInvoker.translate((float)d, (float)d2 + 0.375f, (float)d3);
        GlStateManagerInvoker.b(180.0f - f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(-f6, 0.0f, 0.0f, 1.0f);
        float f7 = (float)yw_2.e(t) - f2;
        float f8 = yw_2.g(t) - f2;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f7 > 0.0f) {
            GlStateManagerInvoker.b(MathHelper.sin(f7) * f7 * f8 / 10.0f * (float)yw_2.b(t), 1.0f, 0.0f, 0.0f);
        }
        int n = yw_2.f(t);
        IBlockState iBlockState = yw_2.a(t);
        if (BlocksInvoker.y(BlockStateInvoker.getBlock(iBlockState)) != -1) {
            GlStateManagerInvoker.pushMatrix();
            this.a(TextureMap.r);
            GlStateManagerInvoker.c(0.75f, 0.75f, 0.75f);
            GlStateManagerInvoker.translate(-0.5f, (float)(n - 8) / 16.0f, 0.5f);
            this.a(t, f2, iBlockState);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.b(t);
        }
        GlStateManagerInvoker.c(-1.0f, -1.0f, 1.0f);
        aV7.a(this.e, t, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GlStateManagerInvoker.popMatrix();
        super.b(t, d, d2, d3, f, f2);
    }

    protected void a(T t, float f, IBlockState iBlockState) {
        GlStateManagerInvoker.pushMatrix();
        xd_0.a(MCInvoker.Y(MCInvoker.f()), iBlockState, yw_2.a(t, f));
        GlStateManagerInvoker.popMatrix();
    }
}

