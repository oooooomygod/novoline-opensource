/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NBTInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Renamed from net.bk
 */
public class bk_2
extends am_0 {
    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length > 0 && stringArray.length <= 3 ? bk_2.b(stringArray, 0, blockPos) : (stringArray.length > 3 && stringArray.length <= 6 ? bk_2.b(stringArray, 3, blockPos) : (stringArray.length > 6 && stringArray.length <= 9 ? bk_2.b(stringArray, 6, blockPos) : (stringArray.length == 10 ? bk_2.a(stringArray, aXH.s, aXH.n, aXH.o) : (stringArray.length == 11 ? bk_2.a(stringArray, aXH.a, aXH.e, aXH.w) : (stringArray.length == 12 && aXH.p.equals(stringArray[9]) ? bk_2.a(stringArray, a82.c(Block.m)) : null)))));
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aXH.k;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 9) {
            throw new ip_2(aXH.t, new Object[0]);
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, 0);
        BlockPos blockPos = bk_2.b(iCommandSender, stringArray, 0, false);
        BlockPos blockPos2 = bk_2.b(iCommandSender, stringArray, 3, false);
        BlockPos blockPos3 = bk_2.b(iCommandSender, stringArray, 6, false);
        HF hF = new HF(blockPos, blockPos2);
        HF hF2 = new HF(blockPos3, amv_2.a(blockPos3, aqu_2.f(hF)));
        int n = aqu_2.e(hF) * aqu_2.c(hF) * aqu_2.d(hF);
        if (n > 32768) {
            throw new ht_1(aXH.h, P8.d(n), P8.d(32768));
        }
        Block block = null;
        int n2 = -1;
        if ((stringArray.length < 11 || !stringArray[10].equals(aXH.m) && !stringArray[10].equals(aXH.f)) && aqu_2.b(hF, hF2)) {
            throw new ht_1(aXH.d, new Object[0]);
        }
        if (stringArray.length < 11 || stringArray[10].equals(aXH.q)) {
            // empty if block
        }
        if (hF.c >= 0 && hF.a < 256 && hF2.c >= 0 && hF2.a < 256) {
            World world = alj_1.a(iCommandSender);
            if (aV8.a(world, hF) && aV8.a(world, hF2)) {
                Object object;
                Object object2;
                Object object3;
                if (stringArray.length >= 10 && !stringArray[9].equals(aXH.b) && stringArray[9].equals(aXH.l)) {
                    if (stringArray.length < 12) {
                        throw new ip_2(aXH.x, new Object[0]);
                    }
                    block = bk_2.e(iCommandSender, stringArray[11]);
                    if (stringArray.length >= 13) {
                        n2 = bk_2.a(stringArray[12], 0, 15);
                    }
                }
                ArrayList arrayList = my_0.c();
                ArrayList arrayList2 = my_0.c();
                ArrayList arrayList3 = my_0.c();
                LinkedList linkedList = my_0.b();
                BlockPos blockPos4 = new BlockPos(hF2.f - hF.f, hF2.c - hF.c, hF2.b - hF.b);
                for (int i = hF.b; i <= hF.e; ++i) {
                    for (int j = hF.c; j <= hF.a; ++j) {
                        for (int k = hF.f; k <= hF.d; ++k) {
                            object3 = new BlockPos(k, j, i);
                            object2 = amv_2.a((BlockPos)object3, (zl_2)blockPos4);
                            object = aV8.q(world, (BlockPos)object3);
                            if (BlockStateInvoker.getBlock((IBlockState)object) == Blocks.air || BlockStateInvoker.getBlock((IBlockState)object) != block || BlocksInvoker.c(BlockStateInvoker.getBlock((IBlockState)object), (IBlockState)object) != n2) continue;
                            TileEntity tileEntity = aV8.z(world, (BlockPos)object3);
                            NBTTagCompound nBTTagCompound = new NBTTagCompound();
                            NBTInvoker.a(tileEntity, nBTTagCompound);
                            ListInvoker.add(arrayList2, new HO((BlockPos)object2, (IBlockState)object, nBTTagCompound));
                            aky_1.d(linkedList, object3);
                        }
                    }
                }
                Object object4 = aky_1.f(linkedList);
                while (dz_0.c((Iterator)object4)) {
                    BlockPos blockPos5 = (BlockPos)dz_0.b((Iterator)object4);
                    TileEntity tileEntity = aV8.z(world, blockPos5);
                    if (tileEntity instanceof rs_1) {
                        apw_0.d((rs_1)((Object)tileEntity));
                    }
                    aV8.a(world, blockPos5, BlocksInvoker.t(Blocks.ao), 2);
                }
                object4 = aky_1.f(linkedList);
                while (dz_0.c((Iterator)object4)) {
                    BlockPos blockPos6 = (BlockPos)dz_0.b((Iterator)object4);
                    aV8.a(world, blockPos6, BlocksInvoker.t(Blocks.air), 3);
                }
                object4 = my_0.c();
                ListInvoker.addAll((List)object4, arrayList);
                ListInvoker.addAll((List)object4, arrayList2);
                ListInvoker.addAll((List)object4, arrayList3);
                List list = my_0.a((List)object4);
                Object object5 = ListInvoker.iterator(list);
                while (dz_0.c((Iterator)object5)) {
                    object3 = (HO)dz_0.b((Iterator)object5);
                    object2 = aV8.z(world, ((HO)object3).c);
                    if (object2 instanceof rs_1) {
                        apw_0.d((rs_1)object2);
                    }
                    aV8.a(world, ((HO)object3).c, BlocksInvoker.t(Blocks.ao), 2);
                }
                n = 0;
                object5 = ListInvoker.iterator((List)object4);
                while (dz_0.c((Iterator)object5)) {
                    object3 = (HO)dz_0.b((Iterator)object5);
                    if (!aV8.a(world, ((HO)object3).c, ((HO)object3).a, 2)) continue;
                    ++n;
                }
                object5 = ListInvoker.iterator(arrayList2);
                while (dz_0.c((Iterator)object5)) {
                    object3 = (HO)dz_0.b((Iterator)object5);
                    object2 = aV8.z(world, ((HO)object3).c);
                    if (((HO)object3).b != null) {
                        tn_0.b(((HO)object3).b, aXH.j, amv_2.j(((HO)object3).c));
                        tn_0.b(((HO)object3).b, aXH.i, amv_2.h(((HO)object3).c));
                        tn_0.b(((HO)object3).b, aXH.c, amv_2.i(((HO)object3).c));
                        NBTInvoker.b((TileEntity)object2, ((HO)object3).b);
                        NBTInvoker.k((TileEntity)object2);
                    }
                    aV8.a(world, ((HO)object3).c, ((HO)object3).a, 2);
                }
                object5 = ListInvoker.iterator(list);
                while (dz_0.c((Iterator)object5)) {
                    object3 = (HO)dz_0.b((Iterator)object5);
                    aV8.b(world, ((HO)object3).c, BlockStateInvoker.getBlock(((HO)object3).a));
                }
                object5 = aV8.a(world, hF, false);
                object3 = ListInvoker.iterator((List)object5);
                while (dz_0.c((Iterator)object3)) {
                    object2 = (a5D)dz_0.b((Iterator)object3);
                    if (!aqu_2.a(hF, ((a5D)object2).b)) continue;
                    object = amv_2.a(((a5D)object2).b, (zl_2)blockPos4);
                    aV8.c(world, (BlockPos)object, aqj_1.a((a5D)object2), (int)(((a5D)object2).a - uv_2.f(aV8.s(world))), ((a5D)object2).f);
                }
                throw new ht_1(aXH.g, new Object[0]);
            }
            throw new ht_1(aXH.y, new Object[0]);
        }
        throw new ht_1(aXH.r, new Object[0]);
    }

    @Override
    public String b() {
        return aXH.v;
    }
}

