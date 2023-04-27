/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.NBTInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;
import java.util.List;

/*
 * Renamed from net.cW
 */
public class cw_1
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        Object object;
        World world;
        if (stringArray.length < 4) {
            throw new ip_2(aea_0.e, new Object[0]);
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, 0);
        BlockPos blockPos = cw_1.b(iCommandSender, stringArray, 0, false);
        Block block = am_0.e(iCommandSender, stringArray[3]);
        int n = 0;
        if (stringArray.length >= 5) {
            n = cw_1.a(stringArray[4], 0, 15);
        }
        if (!aV8.isBlockLoaded(world = alj_1.a(iCommandSender), blockPos)) {
            throw new ht_1(aea_0.q, new Object[0]);
        }
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        if (stringArray.length >= 7 && BlocksInvoker.c(block)) {
            object = aBO.d(cw_1.a(iCommandSender, stringArray, 6));
            try {
                nBTTagCompound = jv_2.a((String)object);
            }
            catch (az3_0 az3_02) {
                throw new ht_1(aea_0.f, az3_02.getMessage());
            }
        }
        if (stringArray.length >= 6) {
            if (stringArray[5].equals(aea_0.m)) {
                aV8.b(world, blockPos, true);
                if (block == Blocks.air) {
                    cw_1.a(iCommandSender, (ICommand)this, aea_0.j, new Object[0]);
                    return;
                }
            } else if (stringArray[5].equals(aea_0.i) && !aV8.k(world, blockPos)) {
                throw new ht_1(aea_0.c, new Object[0]);
            }
        }
        if ((object = aV8.z(world, blockPos)) instanceof rs_1) {
            apw_0.d((rs_1)object);
        }
        aV8.a(world, blockPos, BlocksInvoker.t(Blocks.air), block == Blocks.air ? 2 : 4);
        IBlockState iBlockState = BlocksInvoker.a(block, n);
        if (!aV8.a(world, blockPos, iBlockState, 2)) {
            throw new ht_1(aea_0.o, new Object[0]);
        }
        TileEntity tileEntity = aV8.z(world, blockPos);
        tn_0.b(nBTTagCompound, aea_0.n, amv_2.j(blockPos));
        tn_0.b(nBTTagCompound, aea_0.d, amv_2.h(blockPos));
        tn_0.b(nBTTagCompound, aea_0.p, amv_2.i(blockPos));
        NBTInvoker.b(tileEntity, nBTTagCompound);
        aV8.b(world, blockPos, BlockStateInvoker.getBlock(iBlockState));
        alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, 1);
        cw_1.a(iCommandSender, (ICommand)this, aea_0.l, new Object[0]);
    }

    @Override
    public String b() {
        return aea_0.b;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aea_0.h;
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length > 0 && stringArray.length <= 3 ? cw_1.b(stringArray, 0, blockPos) : (stringArray.length == 4 ? cw_1.a(stringArray, a82.c(Block.m)) : (stringArray.length == 6 ? cw_1.a(stringArray, aea_0.k, aea_0.g, aea_0.a) : null));
    }

    @Override
    public int a() {
        return 2;
    }
}

