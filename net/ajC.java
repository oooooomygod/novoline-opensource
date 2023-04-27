/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ajC {
    private List<BlockPos> e = my_0.c();
    private BlockPos c;
    private EnumFacing d;
    private BlockPos f;
    private World b;
    private List<BlockPos> a = my_0.c();

    private void a(int n, int n2) {
        ArrayList arrayList = my_0.c();
        ArrayList arrayList2 = my_0.c();
        ArrayList arrayList3 = my_0.c();
        ListInvoker.addAll(arrayList, ListInvoker.subList(this.e, 0, n2));
        ListInvoker.addAll(arrayList2, ListInvoker.subList(this.e, ListInvoker.size(this.e) - n, ListInvoker.size(this.e)));
        ListInvoker.addAll(arrayList3, ListInvoker.subList(this.e, n2, ListInvoker.size(this.e) - n));
        ListInvoker.clear(this.e);
        ListInvoker.addAll(this.e, arrayList);
        ListInvoker.addAll(this.e, arrayList2);
        ListInvoker.addAll(this.e, arrayList3);
    }

    private boolean b(BlockPos blockPos) {
        BlockPos blockPos2;
        Block block = BlockStateInvoker.getBlock(aV8.q(this.b, blockPos));
        if (BlocksInvoker.getBlockState(block) == Material.air) {
            return true;
        }
        if (!CB.a(block, this.b, blockPos, this.d, false)) {
            return true;
        }
        if (blockPos.equals(this.f)) {
            return true;
        }
        if (ListInvoker.contains(this.e, blockPos)) {
            return true;
        }
        int n = 1;
        if (n + ListInvoker.size(this.e) > 12) {
            return false;
        }
        while (block == Blocks.b && BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(this.b, blockPos2 = amv_2.a(blockPos, SJ.b(this.d), n)))) != Material.air && CB.a(block, this.b, blockPos2, this.d, false) && !blockPos2.equals(this.f)) {
            if (++n + ListInvoker.size(this.e) <= 12) continue;
            return false;
        }
        int n2 = 0;
        int n3 = n - 1;
        while (true) {
            ListInvoker.add(this.e, amv_2.a(blockPos, SJ.b(this.d), n3));
            ++n2;
            --n3;
        }
    }

    public List<BlockPos> b() {
        return this.e;
    }

    private boolean a(BlockPos blockPos) {
        for (EnumFacing enumFacing : EnumFacing.values()) {
            if (SJ.h(enumFacing) == SJ.h(this.d) || this.b(amv_2.a(blockPos, enumFacing))) continue;
            return false;
        }
        return true;
    }

    public List<BlockPos> a() {
        return this.a;
    }

    public ajC(World world, BlockPos blockPos, EnumFacing enumFacing, boolean bl) {
        this.b = world;
        this.f = blockPos;
        this.d = enumFacing;
        this.c = amv_2.a(blockPos, enumFacing);
    }

    public boolean c() {
        ListInvoker.clear(this.e);
        ListInvoker.clear(this.a);
        Block block = BlockStateInvoker.getBlock(aV8.q(this.b, this.c));
        if (!CB.a(block, this.b, this.c, this.d, false)) {
            if (BlocksInvoker.n(block) != 1) {
                return false;
            }
            ListInvoker.add(this.a, this.c);
            return true;
        }
        if (!this.b(this.c)) {
            return false;
        }
        Iterator iterator = ListInvoker.iterator(this.e);
        while (dz_0.c(iterator)) {
            BlockPos blockPos = (BlockPos)dz_0.b(iterator);
            BlockPos blockPos2 = blockPos;
            if (BlockStateInvoker.getBlock(aV8.q(this.b, blockPos2)) != Blocks.b || this.a(blockPos2)) continue;
            return false;
        }
        return true;
    }
}

