/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.NBTInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;
import java.util.List;

/*
 * Renamed from net.b2
 */
public class b2_0
extends am_0 {
    @Override
    public int a() {
        return 2;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length > 0 && stringArray.length <= 3 ? b2_0.b(stringArray, 0, blockPos) : (stringArray.length > 3 && stringArray.length <= 6 ? b2_0.b(stringArray, 3, blockPos) : (stringArray.length > 6 && stringArray.length <= 9 ? b2_0.b(stringArray, 6, blockPos) : (stringArray.length == 10 ? b2_0.a(stringArray, aqn_1.o, aqn_1.a) : null)));
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aqn_1.e;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 9) {
            throw new ip_2(aqn_1.d, new Object[0]);
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, 0);
        BlockPos blockPos = b2_0.b(iCommandSender, stringArray, 0, false);
        BlockPos blockPos2 = b2_0.b(iCommandSender, stringArray, 3, false);
        BlockPos blockPos3 = b2_0.b(iCommandSender, stringArray, 6, false);
        HF hF = new HF(blockPos, blockPos2);
        HF hF2 = new HF(blockPos3, amv_2.a(blockPos3, aqu_2.f(hF)));
        int n = aqu_2.e(hF) * aqu_2.c(hF) * aqu_2.d(hF);
        if (n > 524288) {
            throw new ht_1(aqn_1.p, P8.d(n), P8.d(524288));
        }
        if (hF.c >= 0 && hF.a < 256 && hF2.c >= 0 && hF2.a < 256) {
            World world = alj_1.a(iCommandSender);
            if (aV8.a(world, hF) && aV8.a(world, hF2)) {
                if (stringArray.length <= 9 || stringArray[9].equals(aqn_1.j)) {
                    // empty if block
                }
                n = 0;
                BlockPos blockPos4 = new BlockPos(hF2.f - hF.f, hF2.c - hF.c, hF2.b - hF.b);
                z6_0 z6_02 = new z6_0();
                z6_0 z6_03 = new z6_0();
                for (int i = hF.b; i <= hF.e; ++i) {
                    for (int j = hF.c; j <= hF.a; ++j) {
                        for (int k = hF.f; k <= hF.d; ++k) {
                            ain_1.a(z6_02, k, j, i);
                            ain_1.a(z6_03, k + amv_2.j(blockPos4), j + amv_2.h(blockPos4), i + amv_2.i(blockPos4));
                            IBlockState iBlockState = aV8.q(world, z6_02);
                            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.air) continue;
                            if (iBlockState == aV8.q(world, z6_03)) {
                                TileEntity tileEntity = aV8.z(world, z6_02);
                                TileEntity tileEntity2 = aV8.z(world, z6_03);
                                NBTTagCompound nBTTagCompound = new NBTTagCompound();
                                NBTInvoker.a(tileEntity, nBTTagCompound);
                                tn_0.a(nBTTagCompound, aqn_1.n);
                                tn_0.a(nBTTagCompound, aqn_1.f);
                                tn_0.a(nBTTagCompound, aqn_1.l);
                                NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
                                NBTInvoker.a(tileEntity2, nBTTagCompound2);
                                tn_0.a(nBTTagCompound2, aqn_1.b);
                                tn_0.a(nBTTagCompound2, aqn_1.i);
                                tn_0.a(nBTTagCompound2, aqn_1.k);
                                if (!nBTTagCompound.equals(nBTTagCompound2)) {
                                    // empty if block
                                }
                            }
                            ++n;
                            throw new ht_1(aqn_1.q, new Object[0]);
                        }
                    }
                }
                alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, n);
                b2_0.a(iCommandSender, (ICommand)this, aqn_1.m, P8.d(n));
                return;
            }
            throw new ht_1(aqn_1.h, new Object[0]);
        }
        throw new ht_1(aqn_1.c, new Object[0]);
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b() {
        return aqn_1.g;
    }
}

