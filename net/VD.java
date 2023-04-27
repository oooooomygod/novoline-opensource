/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import deobf.IBlockAccess;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class VD {
    private static int b = (int)MathInvoker.b(17.0, 2.0);
    private Set<ChunkCoordIntPair> a = axe_2.a();

    private static Exception a(Exception exception) {
        return exception;
    }

    protected static BlockPos a(World world, int n, int n2) {
        Chunk chunk = aV8.a(world, n, n2);
        int n3 = n * 16 + a5_0.a(world.o, 16);
        int n4 = n2 * 16 + a5_0.a(world.o, 16);
        int n5 = MathHelper.c(aqp_2.c(chunk, new BlockPos(n3, 0, n4)) + 1, 16);
        int n6 = a5_0.a(world.o, n5);
        return new BlockPos(n3, n6, n4);
    }

    public int a(WorldServer worldServer, boolean bl, boolean bl2, boolean bl3) {
        return 0;
    }

    public static void a(World world, il_0 il_02, int n, int n2, int n3, int n4, Random random) {
        List list = hw_0.a(il_02, a40.CREATURE);
        if (!ListInvoker.isEmpty(list)) {
            while (a5_0.e(random) < hw_0.f(il_02)) {
                cp_0 cp_02 = (cp_0)mp_1.a(world.o, list);
                int n5 = cp_02.c + a5_0.a(random, 1 + cp_02.d - cp_02.c);
                amk_0 amk_02 = null;
                int n6 = n + a5_0.a(random, n3);
                int n7 = n2 + a5_0.a(random, n4);
                int n8 = n6;
                int n9 = n7;
                int n10 = 0;
                if (n10 >= n5) continue;
                int n11 = 0;
                while (true) {
                    block7: {
                        BlockPos blockPos;
                        if (VD.a(adr_2.ON_GROUND, world, blockPos = aV8.a(world, new BlockPos(n6, 0, n7)))) {
                            nl_1 nl_12;
                            try {
                                nl_12 = (nl_1)ap6_0.a(ara_2.b(cp_02.b, new Class[]{World.class}), new Object[]{world});
                            }
                            catch (Exception exception) {
                                ch_2.a(exception);
                                break block7;
                            }
                            CG.a(nl_12, (float)n6 + 0.5f, amv_2.h(blockPos), (float)n7 + 0.5f, a5_0.e(random) * 360.0f, 0.0f);
                            aV8.b(world, nl_12);
                            amk_02 = CG.a(nl_12, aV8.b(world, new BlockPos(nl_12)), amk_02);
                        }
                        n6 += a5_0.a(random, 5) - a5_0.a(random, 5);
                        n7 += a5_0.a(random, 5) - a5_0.a(random, 5);
                        while (n6 < n || n6 >= n + n3 || n7 < n2 || n7 >= n2 + n3) {
                            n6 = n8 + a5_0.a(random, 5) - a5_0.a(random, 5);
                            n7 = n9 + a5_0.a(random, 5) - a5_0.a(random, 5);
                        }
                    }
                    ++n11;
                }
            }
        }
    }

    public static boolean a(adr_2 adr_22, World world, BlockPos blockPos) {
        if (!ak9_0.a(aV8.x(world), blockPos)) {
            return false;
        }
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (adr_22 == adr_2.IN_WATER) {
            return akm_1.f(BlocksInvoker.getBlockState(block)) && akm_1.f(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))))) && !BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))));
        }
        BlockPos blockPos2 = amv_2.g(blockPos);
        if (!aV8.a((IBlockAccess)world, blockPos2)) {
            return false;
        }
        Block block2 = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
        boolean bl = block2 != Blocks.bedrock && block2 != Blocks.ao;
        return !BlocksInvoker.x(block) && !akm_1.f(BlocksInvoker.getBlockState(block)) && !BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))));
    }
}

