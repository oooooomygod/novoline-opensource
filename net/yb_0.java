/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Yb
 */
public class yb_0
extends Y_ {
    private boolean e;
    private EnumFacing d;

    public yb_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.d = enumFacing;
        this.b = hF;
        this.e = aqu_2.c(hF) > 3;
    }

    public static HF a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing) {
        HF hF = new HF(n, n2, n3, n, n2 + 2, n3);
        if (a5_0.a(random, 4) == 0) {
            hF.a += 4;
        }
        switch (aRI.a[enumFacing.ordinal()]) {
            case 1: {
                hF.f = n - 1;
                hF.d = n + 3;
                hF.b = n3 - 4;
                break;
            }
            case 2: {
                hF.f = n - 1;
                hF.d = n + 3;
                hF.e = n3 + 4;
                break;
            }
            case 3: {
                hF.f = n - 4;
                hF.b = n3 - 1;
                hF.e = n3 + 3;
                break;
            }
            case 4: {
                hF.d = n + 4;
                hF.b = n3 - 1;
                hF.e = n3 + 3;
            }
        }
        return Y_.a(list, hF) != null ? null : hF;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, uh_1.a, this.e);
        tn_0.b(nBTTagCompound, uh_1.c, SJ.j(this.d));
    }

    public yb_0() {
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        int n = this.a();
        switch (aRI.a[this.d.ordinal()]) {
            case 1: {
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c, this.b.b - 1, EnumFacing.NORTH, n);
                acq_0.a(y_, list, random, this.b.f - 1, this.b.c, this.b.b + 1, EnumFacing.WEST, n);
                acq_0.a(y_, list, random, this.b.d + 1, this.b.c, this.b.b + 1, EnumFacing.EAST, n);
                break;
            }
            case 2: {
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c, this.b.e + 1, EnumFacing.SOUTH, n);
                acq_0.a(y_, list, random, this.b.f - 1, this.b.c, this.b.b + 1, EnumFacing.WEST, n);
                acq_0.a(y_, list, random, this.b.d + 1, this.b.c, this.b.b + 1, EnumFacing.EAST, n);
                break;
            }
            case 3: {
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c, this.b.b - 1, EnumFacing.NORTH, n);
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c, this.b.e + 1, EnumFacing.SOUTH, n);
                acq_0.a(y_, list, random, this.b.f - 1, this.b.c, this.b.b + 1, EnumFacing.WEST, n);
                break;
            }
            case 4: {
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c, this.b.b - 1, EnumFacing.NORTH, n);
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c, this.b.e + 1, EnumFacing.SOUTH, n);
                acq_0.a(y_, list, random, this.b.d + 1, this.b.c, this.b.b + 1, EnumFacing.EAST, n);
            }
        }
        if (this.e) {
            if (a5_0.a(random)) {
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c + 3 + 1, this.b.b - 1, EnumFacing.NORTH, n);
            }
            if (a5_0.a(random)) {
                acq_0.a(y_, list, random, this.b.f - 1, this.b.c + 3 + 1, this.b.b + 1, EnumFacing.WEST, n);
            }
            if (a5_0.a(random)) {
                acq_0.a(y_, list, random, this.b.d + 1, this.b.c + 3 + 1, this.b.b + 1, EnumFacing.EAST, n);
            }
            if (a5_0.a(random)) {
                acq_0.a(y_, list, random, this.b.f + 1, this.b.c + 3 + 1, this.b.e + 1, EnumFacing.SOUTH, n);
            }
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        this.e = tn_0.c(nBTTagCompound, uh_1.b);
        this.d = SJ.b(tn_0.g(nBTTagCompound, uh_1.d));
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        if (this.e) {
            this.a(world, hF, this.b.f + 1, this.b.c, this.b.b, this.b.d - 1, this.b.c + 3 - 1, this.b.e, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
            this.a(world, hF, this.b.f, this.b.c, this.b.b + 1, this.b.d, this.b.c + 3 - 1, this.b.e - 1, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
            this.a(world, hF, this.b.f + 1, this.b.a - 2, this.b.b, this.b.d - 1, this.b.a, this.b.e, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
            this.a(world, hF, this.b.f, this.b.a - 2, this.b.b + 1, this.b.d, this.b.a, this.b.e - 1, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
            this.a(world, hF, this.b.f + 1, this.b.c + 3, this.b.b + 1, this.b.d - 1, this.b.c + 3, this.b.e - 1, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        } else {
            this.a(world, hF, this.b.f + 1, this.b.c, this.b.b, this.b.d - 1, this.b.a, this.b.e, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
            this.a(world, hF, this.b.f, this.b.c, this.b.b + 1, this.b.d, this.b.a, this.b.e - 1, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        this.a(world, hF, this.b.f + 1, this.b.c, this.b.b + 1, this.b.f + 1, this.b.a, this.b.b + 1, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, this.b.f + 1, this.b.c, this.b.e - 1, this.b.f + 1, this.b.a, this.b.e - 1, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, this.b.d - 1, this.b.c, this.b.b + 1, this.b.d - 1, this.b.a, this.b.b + 1, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, this.b.d - 1, this.b.c, this.b.e - 1, this.b.d - 1, this.b.a, this.b.e - 1, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.air), false);
        for (int i = this.b.f; i <= this.b.d; ++i) {
            for (int j = this.b.b; j <= this.b.e; ++j) {
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, i, this.b.c - 1, j, hF))) != Material.air) continue;
                this.b(world, BlocksInvoker.t(Blocks.planks), i, this.b.c - 1, j, hF);
            }
        }
        return true;
    }
}

