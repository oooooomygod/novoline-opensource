/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.Random;

public class at9 {
    private static Random a = new Random();

    public static void a(World world, BlockPos blockPos, rs_1 rs_12) {
        at9.a(world, (double)amv_2.j(blockPos), (double)amv_2.h(blockPos), (double)amv_2.i(blockPos), rs_12);
    }

    private static void a(World world, double d, double d2, double d3, rs_1 rs_12) {
        for (int i = 0; i < apw_0.c(rs_12); ++i) {
            ItemStack itemStack = apw_0.b(rs_12, i);
            at9.a(world, d, d2, d3, itemStack);
        }
    }

    private static void a(World world, double d, double d2, double d3, ItemStack itemStack) {
        float f = a5_0.e(a) * 0.8f + 0.1f;
        float f2 = a5_0.e(a) * 0.8f + 0.1f;
        float f3 = a5_0.e(a) * 0.8f + 0.1f;
        while (itemStack.a > 0) {
            int n = a5_0.a(a, 21) + 10;
            if (n > itemStack.a) {
                n = itemStack.a;
            }
            itemStack.a -= n;
            og_0 og_02 = new og_0(world, d + (double)f, d2 + (double)f2, d3 + (double)f3, new ItemStack(act_2.k(itemStack), n, act_2.c(itemStack)));
            if (act_2.b(itemStack)) {
                act_2.b(aec_0.k(og_02), (NBTTagCompound)tn_0.a(act_2.a(itemStack)));
            }
            float f4 = 0.05f;
            og_02.motionX = a5_0.f(a) * (double)f4;
            og_02.motionY = a5_0.f(a) * (double)f4 + (double)0.2f;
            og_02.motionZ = a5_0.f(a) * (double)f4;
            aV8.b(world, og_02);
        }
    }

    public static void a(World world, Entity entity, rs_1 rs_12) {
        at9.a(world, entity.posX, entity.posY, entity.posZ, rs_12);
    }
}

