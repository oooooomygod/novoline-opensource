/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;
import java.util.Iterator;
import java.util.List;

public class bR
extends am_0 {
    @Override
    public String b() {
        return oy_1.a;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length > 0 && stringArray.length <= 3 ? bR.b(stringArray, 0, blockPos) : (stringArray.length > 3 && stringArray.length <= 6 ? bR.b(stringArray, 3, blockPos) : (stringArray.length == 7 ? bR.a(stringArray, a82.c(Block.m)) : (stringArray.length == 9 ? bR.a(stringArray, oy_1.k, oy_1.l, oy_1.p, oy_1.w, oy_1.i) : (stringArray.length == 10 && oy_1.s.equals(stringArray[8]) ? bR.a(stringArray, a82.c(Block.m)) : null))));
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return oy_1.h;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        block17: {
            Object object;
            int n;
            if (stringArray.length < 7) {
                throw new ip_2(oy_1.f, new Object[0]);
            }
            alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, 0);
            BlockPos blockPos = bR.b(iCommandSender, stringArray, 0, false);
            BlockPos blockPos2 = bR.b(iCommandSender, stringArray, 3, false);
            Block block = am_0.e(iCommandSender, stringArray[6]);
            int n2 = 0;
            if (stringArray.length >= 8) {
                n2 = bR.a(stringArray[7], 0, 15);
            }
            BlockPos blockPos3 = new BlockPos(MathInvoker.b(amv_2.j(blockPos), amv_2.j(blockPos2)), MathInvoker.b(amv_2.h(blockPos), amv_2.h(blockPos2)), MathInvoker.b(amv_2.i(blockPos), amv_2.i(blockPos2)));
            BlockPos blockPos4 = new BlockPos(MathInvoker.max(amv_2.j(blockPos), amv_2.j(blockPos2)), MathInvoker.max(amv_2.h(blockPos), amv_2.h(blockPos2)), MathInvoker.max(amv_2.i(blockPos), amv_2.i(blockPos2)));
            int n3 = (amv_2.j(blockPos4) - amv_2.j(blockPos3) + 1) * (amv_2.h(blockPos4) - amv_2.h(blockPos3) + 1) * (amv_2.i(blockPos4) - amv_2.i(blockPos3) + 1);
            if (n3 > 32768) {
                throw new ht_1(oy_1.b, P8.d(n3), P8.d(32768));
            }
            if (amv_2.h(blockPos3) < 0 || amv_2.h(blockPos4) >= 256) break block17;
            World world = alj_1.a(iCommandSender);
            for (int i = amv_2.i(blockPos3); i < amv_2.i(blockPos4) + 16; i += 16) {
                for (n = amv_2.j(blockPos3); n < amv_2.j(blockPos4) + 16; n += 16) {
                    if (aV8.isBlockLoaded(world, new BlockPos(n, amv_2.h(blockPos4) - amv_2.h(blockPos3), i))) continue;
                    throw new ht_1(oy_1.n, new Object[0]);
                }
            }
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            n = 0;
            if (stringArray.length >= 10 && BlocksInvoker.c(block)) {
                object = aBO.d(bR.a(iCommandSender, stringArray, 9));
                try {
                    nBTTagCompound = jv_2.a((String)object);
                    n = 1;
                }
                catch (az3_0 az3_02) {
                    throw new ht_1(oy_1.v, az3_02.getMessage());
                }
            }
            object = my_0.c();
            n3 = 0;
            for (int i = amv_2.i(blockPos3); i <= amv_2.i(blockPos4); ++i) {
                for (int j = amv_2.h(blockPos3); j <= amv_2.h(blockPos4); ++j) {
                    for (int k = amv_2.j(blockPos3); k <= amv_2.j(blockPos4); ++k) {
                        IBlockState iBlockState;
                        Object object2;
                        BlockPos blockPos5;
                        block18: {
                            block19: {
                                block21: {
                                    block20: {
                                        blockPos5 = new BlockPos(k, j, i);
                                        if (stringArray.length < 9) break block18;
                                        if (stringArray[8].equals(oy_1.c) || stringArray[8].equals(oy_1.g)) break block19;
                                        if (!stringArray[8].equals(oy_1.e)) break block20;
                                        aV8.b(world, blockPos5, true);
                                        break block18;
                                    }
                                    if (!stringArray[8].equals(oy_1.o)) break block21;
                                    if (!aV8.k(world, blockPos5)) {
                                        continue;
                                    }
                                    break block18;
                                }
                                if (!stringArray[8].equals(oy_1.m) || BlocksInvoker.c(block)) break block18;
                                if (stringArray.length > 9) {
                                    object2 = am_0.e(iCommandSender, stringArray[9]);
                                    if (BlockStateInvoker.getBlock(aV8.q(world, blockPos5)) != object2) continue;
                                }
                                if (stringArray.length <= 10) break block18;
                                int n4 = am_0.d(stringArray[10]);
                                iBlockState = aV8.q(world, blockPos5);
                                if (BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState) != n4) {
                                    continue;
                                }
                                break block18;
                            }
                            if (k != amv_2.j(blockPos3) && k != amv_2.j(blockPos4) && j != amv_2.h(blockPos3) && j != amv_2.h(blockPos4) && i != amv_2.i(blockPos3) && i != amv_2.i(blockPos4)) {
                                if (!stringArray[8].equals(oy_1.u)) continue;
                                aV8.a(world, blockPos5, BlocksInvoker.t(Blocks.air), 2);
                                ListInvoker.add((List)object, blockPos5);
                                continue;
                            }
                        }
                        if ((object2 = aV8.z(world, blockPos5)) instanceof rs_1) {
                            apw_0.d((rs_1)object2);
                        }
                        aV8.a(world, blockPos5, BlocksInvoker.t(Blocks.ao), block == Blocks.ao ? 2 : 4);
                        iBlockState = BlocksInvoker.a(block, n2);
                        if (!aV8.a(world, blockPos5, iBlockState, 2)) continue;
                        ListInvoker.add((List)object, blockPos5);
                        ++n3;
                        TileEntity tileEntity = aV8.z(world, blockPos5);
                        tn_0.b(nBTTagCompound, oy_1.d, amv_2.j(blockPos5));
                        tn_0.b(nBTTagCompound, oy_1.j, amv_2.h(blockPos5));
                        tn_0.b(nBTTagCompound, oy_1.r, amv_2.i(blockPos5));
                        NBTInvoker.b(tileEntity, nBTTagCompound);
                    }
                }
            }
            Iterator iterator = ListInvoker.iterator((List)object);
            while (dz_0.c(iterator)) {
                BlockPos blockPos6 = (BlockPos)dz_0.b(iterator);
                Block block2 = BlockStateInvoker.getBlock(aV8.q(world, blockPos6));
                aV8.b(world, blockPos6, block2);
            }
            throw new ht_1(oy_1.q, new Object[0]);
        }
        throw new ht_1(oy_1.t, new Object[0]);
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }
}

