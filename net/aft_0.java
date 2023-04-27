/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.afT
 */
public class aft_0 {
    private boolean a;
    private World d;
    private List<BlockPos> e;
    private BlockPos f;
    private IBlockState b;
    g9_0 c;
    private g9_0 g;

    public aft_0(g9_0 g9_02, World world, BlockPos blockPos, IBlockState iBlockState) {
        this.c = g9_02;
        this.e = my_0.c();
        this.d = world;
        this.f = blockPos;
        this.b = iBlockState;
        this.g = (g9_0)BlockStateInvoker.getBlock(iBlockState);
        az_1 az_12 = (az_1)((Object)BlockStateInvoker.b(iBlockState, ask_1.a(g9_02)));
        this.a = this.g.P;
        this.a(az_12);
    }

    private boolean a(aft_0 aft_02) {
        return this.b(aft_02) || ListInvoker.size(this.e) != 2;
    }

    private void a() {
        for (int i = 0; i < ListInvoker.size(this.e); ++i) {
            aft_0 aft_02 = this.a((BlockPos)ListInvoker.get(this.e, i));
            if (aft_02.b(this)) {
                ListInvoker.set(this.e, i, aft_02.f);
                continue;
            }
            ListInvoker.remove(this.e, i--);
        }
    }

    private boolean d(BlockPos blockPos) {
        return ask_1.a(this.d, blockPos) || ask_1.a(this.d, amv_2.e(blockPos)) || ask_1.a(this.d, amv_2.g(blockPos));
    }

    protected int b() {
        int n = 0;
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (!this.d(amv_2.a(this.f, (EnumFacing)object))) continue;
            ++n;
        }
        return n;
    }

    private aft_0 a(BlockPos blockPos) {
        aft_0 aft_02;
        IBlockState iBlockState = aV8.q(this.d, blockPos);
        if (ask_1.a(iBlockState)) {
            g9_0 g9_02 = this.c;
            g9_02.getClass();
            return new aft_0(g9_02, this.d, blockPos, iBlockState);
        }
        BlockPos blockPos2 = amv_2.e(blockPos);
        iBlockState = aV8.q(this.d, blockPos2);
        if (ask_1.a(iBlockState)) {
            g9_0 g9_03 = this.c;
            g9_03.getClass();
            return new aft_0(g9_03, this.d, blockPos2, iBlockState);
        }
        blockPos2 = amv_2.g(blockPos);
        iBlockState = aV8.q(this.d, blockPos2);
        if (ask_1.a(iBlockState)) {
            g9_0 g9_04 = this.c;
            g9_04.getClass();
            aft_02 = new aft_0(g9_04, this.d, blockPos2, iBlockState);
        } else {
            aft_02 = null;
        }
        return aft_02;
    }

    private boolean b(BlockPos blockPos) {
        Iterator iterator = ListInvoker.iterator(this.e);
        while (dz_0.c(iterator)) {
            BlockPos blockPos2 = (BlockPos)dz_0.b(iterator);
            BlockPos blockPos3 = blockPos2;
            if (amv_2.j(blockPos3) != amv_2.j(blockPos) || amv_2.i(blockPos3) != amv_2.i(blockPos)) continue;
            return true;
        }
        return false;
    }

    private void c(aft_0 aft_02) {
        ListInvoker.add(this.e, aft_02.f);
        BlockPos blockPos = amv_2.a(this.f);
        BlockPos blockPos2 = amv_2.b(this.f);
        BlockPos blockPos3 = amv_2.d(this.f);
        BlockPos blockPos4 = amv_2.f(this.f);
        this.b(blockPos);
        this.b(blockPos2);
        this.b(blockPos3);
        this.b(blockPos4);
        az_1 az_12 = null;
        az_12 = az_1.NORTH_SOUTH;
        az_12 = az_1.EAST_WEST;
        if (!this.a) {
            az_12 = az_1.SOUTH_EAST;
            az_12 = az_1.SOUTH_WEST;
            az_12 = az_1.NORTH_WEST;
            az_12 = az_1.NORTH_EAST;
        }
        if (az_12 == az_1.NORTH_SOUTH) {
            if (ask_1.a(this.d, amv_2.e(blockPos))) {
                az_12 = az_1.ASCENDING_NORTH;
            }
            if (ask_1.a(this.d, amv_2.e(blockPos2))) {
                az_12 = az_1.ASCENDING_SOUTH;
            }
        }
        if (az_12 == az_1.EAST_WEST) {
            if (ask_1.a(this.d, amv_2.e(blockPos4))) {
                az_12 = az_1.ASCENDING_EAST;
            }
            if (ask_1.a(this.d, amv_2.e(blockPos3))) {
                az_12 = az_1.ASCENDING_WEST;
            }
        }
        az_12 = az_1.NORTH_SOUTH;
        this.b = BlockStateInvoker.a(this.b, ask_1.a(this.g), (Comparable)((Object)az_12));
        aV8.a(this.d, this.f, this.b, 3);
    }

    private boolean c(BlockPos blockPos) {
        this.a(blockPos);
        return false;
    }

    private boolean b(aft_0 aft_02) {
        return this.b(aft_02.f);
    }

    private void a(az_1 az_12) {
        ListInvoker.clear(this.e);
        switch (az_12) {
            case NORTH_SOUTH: {
                ListInvoker.add(this.e, amv_2.a(this.f));
                ListInvoker.add(this.e, amv_2.b(this.f));
                break;
            }
            case EAST_WEST: {
                ListInvoker.add(this.e, amv_2.d(this.f));
                ListInvoker.add(this.e, amv_2.f(this.f));
                break;
            }
            case ASCENDING_EAST: {
                ListInvoker.add(this.e, amv_2.d(this.f));
                ListInvoker.add(this.e, amv_2.e(amv_2.f(this.f)));
                break;
            }
            case ASCENDING_WEST: {
                ListInvoker.add(this.e, amv_2.e(amv_2.d(this.f)));
                ListInvoker.add(this.e, amv_2.f(this.f));
                break;
            }
            case ASCENDING_NORTH: {
                ListInvoker.add(this.e, amv_2.e(amv_2.a(this.f)));
                ListInvoker.add(this.e, amv_2.b(this.f));
                break;
            }
            case ASCENDING_SOUTH: {
                ListInvoker.add(this.e, amv_2.a(this.f));
                ListInvoker.add(this.e, amv_2.e(amv_2.b(this.f)));
                break;
            }
            case SOUTH_EAST: {
                ListInvoker.add(this.e, amv_2.f(this.f));
                ListInvoker.add(this.e, amv_2.b(this.f));
                break;
            }
            case SOUTH_WEST: {
                ListInvoker.add(this.e, amv_2.d(this.f));
                ListInvoker.add(this.e, amv_2.b(this.f));
                break;
            }
            case NORTH_WEST: {
                ListInvoker.add(this.e, amv_2.d(this.f));
                ListInvoker.add(this.e, amv_2.a(this.f));
                break;
            }
            case NORTH_EAST: {
                ListInvoker.add(this.e, amv_2.f(this.f));
                ListInvoker.add(this.e, amv_2.a(this.f));
            }
        }
    }

    public IBlockState c() {
        return this.b;
    }

    public aft_0 a(boolean bl, boolean bl2) {
        BlockPos blockPos = amv_2.a(this.f);
        BlockPos blockPos2 = amv_2.b(this.f);
        BlockPos blockPos3 = amv_2.d(this.f);
        BlockPos blockPos4 = amv_2.f(this.f);
        this.c(blockPos);
        this.c(blockPos2);
        this.c(blockPos3);
        this.c(blockPos4);
        az_1 az_12 = null;
        az_12 = az_1.NORTH_SOUTH;
        az_12 = az_1.EAST_WEST;
        if (!this.a) {
            az_12 = az_1.SOUTH_EAST;
            az_12 = az_1.SOUTH_WEST;
            az_12 = az_1.NORTH_WEST;
            az_12 = az_1.NORTH_EAST;
        }
        az_12 = az_1.NORTH_SOUTH;
        az_12 = az_1.EAST_WEST;
        if (!this.a) {
            az_12 = az_1.SOUTH_EAST;
            az_12 = az_1.SOUTH_WEST;
            az_12 = az_1.NORTH_EAST;
            az_12 = az_1.NORTH_WEST;
        }
        if (az_12 == az_1.NORTH_SOUTH) {
            if (ask_1.a(this.d, amv_2.e(blockPos))) {
                az_12 = az_1.ASCENDING_NORTH;
            }
            if (ask_1.a(this.d, amv_2.e(blockPos2))) {
                az_12 = az_1.ASCENDING_SOUTH;
            }
        }
        if (az_12 == az_1.EAST_WEST) {
            if (ask_1.a(this.d, amv_2.e(blockPos4))) {
                az_12 = az_1.ASCENDING_EAST;
            }
            if (ask_1.a(this.d, amv_2.e(blockPos3))) {
                az_12 = az_1.ASCENDING_WEST;
            }
        }
        az_12 = az_1.NORTH_SOUTH;
        this.a(az_12);
        this.b = BlockStateInvoker.a(this.b, ask_1.a(this.g), (Comparable)((Object)az_12));
        if (aV8.q(this.d, this.f) != this.b) {
            aV8.a(this.d, this.f, this.b, 3);
            Iterator iterator = ListInvoker.iterator(this.e);
            while (dz_0.c(iterator)) {
                BlockPos blockPos5 = (BlockPos)dz_0.b(iterator);
                aft_0 aft_02 = this.a(blockPos5);
                aft_02.a();
                if (!aft_02.a(this)) continue;
                aft_02.c(this);
            }
        }
        return this;
    }
}

