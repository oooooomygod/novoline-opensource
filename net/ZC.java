/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZC
extends zd_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 3, 0);
        }
        this.a(world, hF, 1, 0, 1, 4, 12, 4, BlocksInvoker.t(Blocks.cobblestone), db_2.a(Blocks.flowing_water), false);
        this.b(world, BlocksInvoker.t(Blocks.air), 2, 12, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 3, 12, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 2, 12, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 3, 12, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 13, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 14, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 4, 13, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 4, 14, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 13, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 14, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 4, 13, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 4, 14, 4, hF);
        this.a(world, hF, 1, 15, 1, 4, 15, 4, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        boolean bl = false;
        int n = 0;
        while (true) {
            ++n;
        }
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        aAU.e((zw_0)y_, list, random, this.b.f - 1, this.b.a - 4, this.b.b + 1, EnumFacing.WEST, this.a());
        aAU.e((zw_0)y_, list, random, this.b.d + 1, this.b.a - 4, this.b.b + 1, EnumFacing.EAST, this.a());
        aAU.e((zw_0)y_, list, random, this.b.f + 1, this.b.a - 4, this.b.b - 1, EnumFacing.NORTH, this.a());
        aAU.e((zw_0)y_, list, random, this.b.f + 1, this.b.a - 4, this.b.e + 1, EnumFacing.SOUTH, this.a());
    }

    public ZC(zw_0 zw_02, int n, Random random, int n2, int n3) {
        super(zw_02, n);
        this.c = abw_2.a(cs_1.HORIZONTAL, random);
        switch (aaj_1.a[this.c.ordinal()]) {
            case 1: 
            case 2: {
                this.b = new HF(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
                break;
            }
            default: {
                this.b = new HF(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
            }
        }
    }

    public ZC() {
    }
}

