/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.iN
 */
public class in_1
extends i7_0 {
    private Block b;

    public in_1(Block block) {
        this.b = block;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean a(World var1_1, Random var2_2, BlockPos var3_3) {
        var3_3 = amv_2.a(var3_3, -8, 0, -8);
        while (amv_2.h(var3_3) > 5 && aV8.k(var1_1, var3_3)) {
            var3_3 = amv_2.g(var3_3);
        }
        if (amv_2.h(var3_3) <= 4) {
            return false;
        }
        var3_3 = amv_2.d(var3_3, 4);
        var4_4 = new boolean[2048];
        var6_6 = 0;
        var5_5 = a5_0.a(var2_2, 4) + 4;
        if (var6_6 < var5_5) {
            var7_7 = a5_0.c(var2_2) * 6.0 + 3.0;
            var9_9 = a5_0.c(var2_2) * 4.0 + 2.0;
            var11_11 = a5_0.c(var2_2) * 6.0 + 3.0;
            var13_12 = a5_0.c(var2_2) * (16.0 - var7_7 - 2.0) + 1.0 + var7_7 / 2.0;
            var15_13 = a5_0.c(var2_2) * (8.0 - var9_9 - 4.0) + 2.0 + var9_9 / 2.0;
            var17_14 = a5_0.c(var2_2) * (16.0 - var11_11 - 2.0) + 1.0 + var11_11 / 2.0;
            var19_15 = 1;
            var20_16 = 1;
            var21_17 = 1;
            while (true) {
                if ((var28_21 = (var22_18 = ((double)var19_15 - var13_12) / (var7_7 / 2.0)) * var22_18 + (var24_19 = ((double)var21_17 - var15_13) / (var9_9 / 2.0)) * var24_19 + (var26_20 = ((double)var20_16 - var17_14) / (var11_11 / 2.0)) * var26_20) < 1.0) {
                    var4_4[(var19_15 * 16 + var20_16) * 8 + var21_17] = true;
                }
                ++var21_17;
            }
        }
        var6_6 = 0;
        var7_8 = 0;
        var8_22 = 0;
        while (true) {
            var4_4[(var6_6 * 16 + var7_8) * 8 + var8_22];
            var4_4[((var6_6 + 1) * 16 + var7_8) * 8 + var8_22];
            if (var4_4[((var6_6 - 1) * 16 + var7_8) * 8 + var8_22]) ** GOTO lbl-1000
            var4_4[(var6_6 * 16 + var7_8 + 1) * 8 + var8_22];
            if (var4_4[(var6_6 * 16 + var7_8 - 1) * 8 + var8_22]) ** GOTO lbl-1000
            var4_4[(var6_6 * 16 + var7_8) * 8 + var8_22 + 1];
            if (var4_4[(var6_6 * 16 + var7_8) * 8 + var8_22 - 1]) lbl-1000:
            // 3 sources

            {
                v0 = true;
            } else {
                v0 = false;
            }
            var9_10 = v0;
            var10_23 = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(var1_1, amv_2.a(var3_3, var6_6, var8_22, var7_8))));
            if (!akm_1.i(var10_23) && BlockStateInvoker.getBlock(aV8.q(var1_1, amv_2.a(var3_3, var6_6, var8_22, var7_8))) != this.b) {
                return false;
            }
            ++var8_22;
        }
    }
}

