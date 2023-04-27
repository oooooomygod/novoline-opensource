/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayerSP;
import deobf.EnumFacing;
import deobf.MCInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import deobf.TimerUtil;
import deobf.Vec3;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aKv
 */
public class akv_0 {
    private static Minecraft a = MCInvoker.f();

    public static float d(float f) {
        int n = MathHelper.f(akv_0.a.gameSettings.aw / 0.005f);
        float f2 = 0.005f * (float)n;
        float f3 = f2 * f2 * f2 * 1.2f;
        return f - f % f3;
    }

    public static float c(float f, float f2) {
        TimerUtil.e();
        float f3 = MathInvoker.b(f - f2) % 360.0f;
        return f3 > 180.0f ? 360.0f - f3 : f3;
    }

    public static double[] e(double d, double d2, double d3) {
        double d4 = MathHelper.e(d * d + d2 * d2);
        double d5 = MathInvoker.c(d2, d) * 180.0 / Math.PI - 90.0;
        double d6 = -(MathInvoker.c(d3, d4) * 180.0 / Math.PI);
        return new double[]{akv_0.a.player.rotationYaw + MathHelper.a((float)(d5 - (double)akv_0.a.player.rotationYaw)), akv_0.a.player.rotationPitch + MathHelper.a((float)(d6 - (double)akv_0.a.player.rotationPitch))};
    }

    public static MovingObjectPosition d(float f, float f2) {
        PlayerInvoker.b(akv_0.a.player);
        Vec3 vec3 = akv_0.a();
        Vec3 vec32 = akv_0.a(f2, f);
        Vec3 vec33 = aNE.a(vec3, vec32.xCoord * 3.0, vec32.yCoord * 3.0, vec32.zCoord * 3.0);
        return BlockInvoker.a(akv_0.a.world, vec3, vec33, false, false, false);
    }

    public static float[] c(double d, double d2, double d3) {
        EntityPlayerSP entityPlayerSP = akv_0.a.player;
        double d4 = d - entityPlayerSP.posX;
        double d5 = d2 - (entityPlayerSP.posY + (double)PlayerInvoker.X(entityPlayerSP));
        double d6 = d3 - entityPlayerSP.posZ;
        double d7 = MathHelper.e(d4 * d4 + d6 * d6);
        float f = (float)(MathInvoker.c(d6, d4) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(MathInvoker.c(d5, d7) * 180.0 / Math.PI));
        return new float[]{entityPlayerSP.rotationYaw + MathHelper.a(f - entityPlayerSP.rotationYaw), entityPlayerSP.rotationPitch + MathHelper.a(f2 - entityPlayerSP.rotationPitch)};
    }

    public static float[] a(BlockPos blockPos, EnumFacing enumFacing) {
        double d = (double)amv_2.j(blockPos) + 0.5 - akv_0.a.player.posX + (double)SJ.k(enumFacing) / 2.0;
        double d2 = (double)amv_2.i(blockPos) + 0.5 - akv_0.a.player.posZ + (double)SJ.a(enumFacing) / 2.0;
        double d3 = akv_0.a.player.posY + (double)PlayerInvoker.X(akv_0.a.player) - (double)amv_2.h(blockPos);
        double d4 = MathHelper.e(d * d + d2 * d2);
        float f = (float)(MathInvoker.c(d2, d) * 180.0 / Math.PI) - 90.0f;
        TimerUtil.e();
        float f2 = (float)(MathInvoker.c(d3, d4) * 180.0 / Math.PI);
        if (f < 0.0f) {
            f += 360.0f;
        }
        return new float[]{f, f2};
    }

    public static float e(float f) {
        return f - anf_2.a(anf_2.c()) * 0.5f;
    }

    public static float[] d(double d, double d2, double d3) {
        double d4 = d - akv_0.a.player.posX;
        double d5 = d2 - akv_0.a.player.posY;
        double d6 = d3 - akv_0.a.player.posZ;
        double d7 = MathHelper.e(d4 * d4 + d6 * d6);
        return new float[]{(float)(MathInvoker.c(d6, d4) * 180.0 / Math.PI) - 90.0f, (float)(-(MathInvoker.c(d5, d7) * 180.0 / Math.PI))};
    }

    public static float[] b(Entity entity) {
        return null;
    }

    public static float a(float f, float f2, float f3) {
        TimerUtil.e();
        float f4 = f2 - f;
        if (f4 < -180.0f) {
            f4 += 360.0f;
        }
        if (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    public static float a(double d, double d2) {
        double d3;
        TimerUtil.e();
        EntityPlayerSP entityPlayerSP = akv_0.a.player;
        double d4 = d - entityPlayerSP.posX;
        double d5 = d2 - entityPlayerSP.posZ;
        double d6 = MathInvoker.e(MathInvoker.b(d5 / d4));
        if (d5 < 0.0 && d4 < 0.0) {
            d3 = 90.0 + d6;
        }
        if (d5 < 0.0 && d4 > 0.0) {
            d3 = -90.0 + d6;
        }
        d3 = MathInvoker.e(-MathInvoker.b(d4 / d5));
        return MathHelper.a(-(entityPlayerSP.rotationYaw - (float)d3));
    }

    public static float[] b(a3n a3n2) {
        TimerUtil.e();
        double d = (double)amv_2.j(abz_0.a(a3n2)) + 0.5 - akv_0.a.player.posX + (double)SJ.k(abz_0.b(a3n2)) / 2.0;
        double d2 = (double)amv_2.i(abz_0.a(a3n2)) + 0.5 - akv_0.a.player.posZ + (double)SJ.a(abz_0.b(a3n2)) / 2.0;
        double d3 = akv_0.a.player.posY + (double)PlayerInvoker.X(akv_0.a.player) - (double)amv_2.h(abz_0.a(a3n2));
        double d4 = MathHelper.e(d * d + d2 * d2);
        float f = (float)(MathInvoker.c(d2, d) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(MathInvoker.c(d3, d4) * 180.0 / Math.PI);
        if (f < 0.0f) {
            f += 360.0f;
        }
        return new float[]{f, f2};
    }

    public static float[] a(Vec3 vec3) {
        double d = aNE.e(vec3);
        double d2 = aNE.a(vec3);
        double d3 = aNE.d(vec3);
        EntityPlayerSP entityPlayerSP = akv_0.a.player;
        double d4 = d - entityPlayerSP.posX;
        double d5 = d2 - (entityPlayerSP.posY + (double)PlayerInvoker.X(entityPlayerSP));
        double d6 = d3 - entityPlayerSP.posZ;
        double d7 = MathHelper.e(d4 * d4 + d6 * d6);
        float f = (float)(MathInvoker.c(d6, d4) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(MathInvoker.c(d5, d7) * 180.0 / Math.PI));
        return new float[]{MathHelper.a(entityPlayerSP.rotationYaw + f - entityPlayerSP.rotationYaw), entityPlayerSP.rotationPitch + MathHelper.a(f2 - entityPlayerSP.rotationPitch)};
    }

    public static float b(float f) {
        TimerUtil.e();
        f %= 360.0f;
        if (f >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static Vec3 a(float f, float f2) {
        float f3 = MathHelper.b(MathInvoker.o(-f2) - 3.1415927410125732);
        float f4 = MathHelper.h(MathInvoker.o(-f2) - 3.1415927410125732);
        float f5 = -MathHelper.b(MathInvoker.o(-f));
        float f6 = MathHelper.h(MathInvoker.o(-f));
        return new Vec3(f4 * f5, f6, f3 * f5);
    }

    public static float c(float f) {
        int n = MathHelper.f(akv_0.a.gameSettings.aw / 0.005f);
        float f2 = 0.005f * (float)n;
        float f3 = f2 * f2 * f2 * 1.2f;
        return f - f % f3;
    }

    public static float[] a(EntityLivingBase entityLivingBase) {
        double d = entityLivingBase.posX + (entityLivingBase.posX - entityLivingBase.lastTickPosX);
        double d2 = entityLivingBase.posZ + (entityLivingBase.posZ - entityLivingBase.lastTickPosZ);
        double d3 = entityLivingBase.posY + (double)(atn_0.a(entityLivingBase) / 2.0f);
        return akv_0.a(d, d2, d3);
    }

    public static float[] b(float f, float f2) {
        int n = MathHelper.f(akv_0.a.gameSettings.aw / 0.005f);
        float f3 = 0.005f * (float)n;
        float f4 = f3 * f3 * f3 * 1.2f;
        return new float[]{f - f % f4, f2 - f2 % f4};
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public static Vec3 a() {
        return new Vec3(akv_0.a.player.posX, akv_0.a.player.posY + (double)PlayerInvoker.X(akv_0.a.player), akv_0.a.player.posZ);
    }

    public static float[] a(int n, double d, int n2) {
        oq_2 oq_22 = new oq_2(akv_0.a.world);
        oq_22.posX = (double)n + 0.5;
        oq_22.posY = d + 0.5;
        oq_22.posZ = (double)n2 + 0.5;
        return akv_0.a(oq_22);
    }

    public static float a(Entity entity, double d) {
        double d2 = entity.posX - akv_0.a.player.posX;
        double d3 = entity.posZ - akv_0.a.player.posZ;
        double d4 = d - 2.2 + (double)ayj_0.n(entity) - akv_0.a.player.posY;
        double d5 = MathHelper.e(d2 * d2 + d3 * d3);
        double d6 = -MathInvoker.e(MathInvoker.b(d4 / d5));
        return -MathHelper.a(akv_0.a.player.rotationPitch - (float)d6) - 2.5f;
    }

    public static float[] b(BlockPos blockPos) {
        EnumFacing enumFacing = BlocksInvoker.a(blockPos);
        TimerUtil.e();
        double d = (double)amv_2.j(blockPos) + 0.5 - akv_0.a.player.posX + (double)SJ.k(enumFacing) / 2.0;
        double d2 = (double)amv_2.i(blockPos) + 0.5 - akv_0.a.player.posZ + (double)SJ.a(enumFacing) / 2.0;
        double d3 = akv_0.a.player.posY + (double)PlayerInvoker.X(akv_0.a.player) - (double)amv_2.h(blockPos);
        double d4 = MathHelper.e(d * d + d2 * d2);
        float f = (float)(MathInvoker.c(d2, d) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(MathInvoker.c(d3, d4) * 180.0 / Math.PI);
        if (f < 0.0f) {
            f += 360.0f;
        }
        return new float[]{f, f2};
    }

    private akv_0() {
        throw new UnsupportedOperationException(aes_1.a);
    }

    public static float[] a(double d, double d2, double d3) {
        double d4 = d - MCInvoker.f().player.posX;
        double d5 = d2 - MCInvoker.f().player.posZ;
        double d6 = d3 - MCInvoker.f().player.posY - 1.2;
        double d7 = MathHelper.e(d4 * d4 + d5 * d5);
        float f = (float)(MathInvoker.c(d5, d4) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(MathInvoker.c(d6, d7) * 180.0 / Math.PI));
        return new float[]{f, f2};
    }

    public static float[] a(Entity entity) {
        TimerUtil.e();
        if (entity == null) {
            return null;
        }
        double d = entity.posX - akv_0.a.player.posX;
        double d2 = entity.posY + (double)(ayj_0.n(entity) / 2.0f) - (akv_0.a.player.posY + (double)PlayerInvoker.X(akv_0.a.player));
        double d3 = entity.posZ - akv_0.a.player.posZ;
        double d4 = MathHelper.e(d * d + d3 * d3);
        float f = (float)(MathInvoker.c(d3, d) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(MathInvoker.c(d2, d4) * 180.0 / Math.PI));
        return new float[]{(akv_0.a.player.rotationYaw + MathHelper.a(f - akv_0.a.player.rotationYaw)) % 360.0f, (akv_0.a.player.rotationPitch + MathHelper.a(f2 - akv_0.a.player.rotationPitch)) % 360.0f};
    }

    public static float[] a(BlockPos blockPos) {
        double d = amv_2.j(blockPos);
        double d2 = amv_2.h(blockPos);
        double d3 = amv_2.i(blockPos);
        EntityPlayerSP entityPlayerSP = akv_0.a.player;
        double d4 = d - entityPlayerSP.posX;
        double d5 = d2 - (entityPlayerSP.posY + (double)PlayerInvoker.X(entityPlayerSP));
        double d6 = d3 - entityPlayerSP.posZ;
        double d7 = MathHelper.e(d4 * d4 + d6 * d6);
        float f = (float)(MathInvoker.c(d6, d4) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(MathInvoker.c(d5, d7) * 180.0 / Math.PI));
        return new float[]{entityPlayerSP.rotationYaw + MathHelper.a(f - entityPlayerSP.rotationYaw), entityPlayerSP.rotationPitch + MathHelper.a(f2 - entityPlayerSP.rotationPitch)};
    }

    public static float[] b(EntityLivingBase entityLivingBase) {
        double d = entityLivingBase.posX;
        double d2 = entityLivingBase.posZ;
        double d3 = entityLivingBase.posY + (double)(atn_0.a(entityLivingBase) / 2.0f);
        return akv_0.a(d, d2, d3);
    }

    public static float[] a(float[] fArray) {
        int n = MathHelper.f(akv_0.a.gameSettings.aw / 0.005f);
        float f = fArray[0];
        float f2 = fArray[1];
        float f3 = 0.005f * (float)n;
        float f4 = f3 * f3 * f3 * 1.2f;
        return new float[]{f - f % f4, f2 - f2 % f4};
    }

    public static float a(float f) {
        TimerUtil.e();
        return (float)(f > 87.0f ? (double)f - anf_2.a(anf_2.c(), 0.2, 0.5) : (double)f + anf_2.a(anf_2.c(), 0.5, 3.0));
    }

    public static float[] c(EntityLivingBase entityLivingBase) {
        TimerUtil.e();
        return PlayerInvoker.q(akv_0.a.player) ? akv_0.b(entityLivingBase.posX + anf_2.a(anf_2.c(), 0.03, -0.03), entityLivingBase.posY + (double)atn_0.a(entityLivingBase) - 0.4 + anf_2.a(anf_2.c(), 0.07, -0.07), entityLivingBase.posZ + anf_2.a(anf_2.c(), 0.03, -0.03)) : akv_0.b(entityLivingBase.posX, entityLivingBase.posY + (double)atn_0.a(entityLivingBase) - 0.4, entityLivingBase.posZ);
    }

    public static float[] b(double d, double d2, double d3) {
        EntityPlayerSP entityPlayerSP = akv_0.a.player;
        double d4 = d - entityPlayerSP.posX;
        double d5 = d2 - (entityPlayerSP.posY + (double)PlayerInvoker.X(entityPlayerSP));
        double d6 = d3 - entityPlayerSP.posZ;
        double d7 = MathHelper.e(d4 * d4 + d6 * d6);
        float f = (float)(MathInvoker.c(d6, d4) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(MathInvoker.c(d5, d7) * 180.0 / Math.PI));
        return new float[]{f, f2};
    }

    public static float[] a(a3n a3n2) {
        oq_2 oq_22 = new oq_2(akv_0.a.world);
        oq_22.posX = (double)amv_2.j(abz_0.a(a3n2)) + 0.5;
        oq_22.posY = (double)amv_2.h(abz_0.a(a3n2)) + 0.5;
        oq_22.posZ = (double)amv_2.i(abz_0.a(a3n2)) + 0.5;
        return akv_0.a(oq_22);
    }

    public static float b(double d, double d2) {
        Minecraft minecraft = a;
        double d3 = d - (minecraft.player.lastTickPosX + (minecraft.player.posX - minecraft.player.lastTickPosX) * (double)minecraft.timer.b);
        double d4 = d2 - (minecraft.player.lastTickPosZ + (minecraft.player.posZ - minecraft.player.lastTickPosZ) * (double)minecraft.timer.b);
        double cfr_ignored_0 = MathHelper.e(d3 * d3 + d4 * d4);
        return (float)(MathInvoker.c(d4, d3) * 180.0 / Math.PI) - 90.0f;
    }
}

