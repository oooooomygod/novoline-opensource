/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.Vec3;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.Fz
 */
public class fz_0 {
    private static float i;
    private static Vec3 c;
    public static FloatBuffer e;
    public static FloatBuffer j;
    public static FloatBuffer b;
    private static float a;
    private static float g;
    private static float f;
    public static IntBuffer d;
    private static float h;

    public static float d() {
        return g;
    }

    public static float e() {
        return f;
    }

    public static float c() {
        return h;
    }

    public static float a() {
        return a;
    }

    public static void a(EntityPlayer entityPlayer, boolean bl) {
        GlStateManagerInvoker.a(2982, e);
        GlStateManagerInvoker.a(2983, j);
        GL11.glGetInteger((int)2978, (IntBuffer)d);
        float f = (HD.b(d, 0) + HD.b(d, 2)) / 2;
        float f2 = (HD.b(d, 1) + HD.b(d, 3)) / 2;
        afs_2.b(f, f2, 0.0f, e, j, d, b);
        c = new Vec3(aHB.b(b, 0), aHB.b(b, 1), aHB.b(b, 2));
        int n = 1;
        float f3 = entityPlayer.rotationPitch;
        float f4 = entityPlayer.rotationYaw;
        h = MathHelper.cos(f4 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        a = MathHelper.sin(f4 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        i = -a * MathHelper.sin(f3 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        g = h * MathHelper.sin(f3 * (float)Math.PI / 180.0f) * (float)(1 - n * 2);
        fz_0.f = MathHelper.cos(f3 * (float)Math.PI / 180.0f);
    }

    static {
        d = N4.a(16);
        e = N4.d(16);
        j = N4.d(16);
        b = N4.d(3);
        c = new Vec3(0.0, 0.0, 0.0);
    }

    public static Vec3 a(Entity entity, double d) {
        double d2 = entity.prevPosX + (entity.posX - entity.prevPosX) * d;
        double d3 = entity.prevPosY + (entity.posY - entity.prevPosY) * d;
        double d4 = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * d;
        double d5 = d2 + fz_0.c.xCoord;
        double d6 = d3 + fz_0.c.yCoord;
        double d7 = d4 + fz_0.c.zCoord;
        return new Vec3(d5, d6, d7);
    }

    public static Block a(World world, Entity entity, float f) {
        Vec3 vec3 = fz_0.a(entity, f);
        BlockPos blockPos = new BlockPos(vec3);
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (akm_1.f(BlocksInvoker.getBlockState(block))) {
            float f2;
            float f3 = 0.0f;
            if (BlockStateInvoker.getBlock(iBlockState) instanceof BlockLiquid) {
                f3 = mu_1.a(P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P))) - 0.11111111f;
            }
            if (vec3.yCoord >= (double)(f2 = (float)(amv_2.h(blockPos) + 1) - f3)) {
                block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos)));
            }
        }
        return block;
    }

    public static float f() {
        return i;
    }

    public static Vec3 b() {
        return c;
    }
}

