/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import deobf.Entity;
import deobf.GameSettings;
import deobf.MCInvoker;

public class aEB {
    public static void a(GameSettings gameSettings, World world) {
        aP2.b();
        int n = 3;
        if (gameSettings.B) {
            n = 1;
        }
        aqw_0.a(Blocks.water, n);
        aqw_0.a(Blocks.flowing_water, n);
        if (world != null) {
            em_1 em_12 = aV8.h(world);
            Entity entity = MCInvoker.v(ys_2.at());
            if (entity != null) {
                int n2 = (int)entity.posX / 16;
                int n3 = (int)entity.posZ / 16;
                int n4 = n2 - 512;
                int n5 = n2 + 512;
                int n6 = n3 - 512;
                int n7 = n3 + 512;
                int n8 = 0;
                int n9 = n4;
                if (n9 < n5) {
                    int n10 = n6;
                    if (n10 < n7) {
                        Chunk chunk;
                        if (sf_0.b(em_12, n9, n10) && !((chunk = sf_0.a(em_12, n9, n10)) instanceof jp_2)) {
                            int n11 = n9 << 4;
                            int n12 = n10 << 4;
                            int n13 = n11 + 16;
                            int n14 = n12 + 16;
                            zw_1 zw_12 = new zw_1(0, 0, 0);
                            zw_1 zw_13 = new zw_1(0, 0, 0);
                            int n15 = n11;
                            if (n15 < n13) {
                                int n16 = n12;
                                if (n16 < n14) {
                                    aut_1.a(zw_12, n15, 0, n16);
                                    BlockPos blockPos = aV8.y(world, zw_12);
                                    int n17 = 0;
                                    if (n17 < amv_2.h(blockPos)) {
                                        aut_1.a(zw_13, n15, n17, n16);
                                        IBlockState iBlockState = aV8.q(world, zw_13);
                                        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) == Material.M) {
                                            aV8.a(world, n15, n16, aut_1.b(zw_13), amv_2.h(blockPos));
                                            ++n8;
                                        }
                                        ++n17;
                                    }
                                    ++n16;
                                }
                                ++n15;
                            }
                        }
                        ++n10;
                    }
                    ++n9;
                }
            }
        }
    }
}

