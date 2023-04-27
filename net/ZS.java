/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZS
extends zd_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 9 - 1, 0);
        }
        this.a(world, hF, 1, 1, 1, 7, 5, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 0, 0, 8, 0, 5, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 5, 0, 8, 5, 5, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 6, 1, 8, 6, 4, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 7, 2, 8, 7, 3, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        int n = this.a(Blocks.a7, 3);
        int n2 = this.a(Blocks.a7, 2);
        int n3 = -1;
        int n4 = 0;
        while (true) {
            this.b(world, BlocksInvoker.a(Blocks.a7, n), n4, 6 + n3, n3, hF);
            this.b(world, BlocksInvoker.a(Blocks.a7, n2), n4, 6 + n3, 5 - n3, hF);
            ++n4;
        }
    }

    @Override
    protected int c(int n, int n2) {
        return 1;
    }

    public ZS() {
    }

    public ZS(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
    }

    public static ZS a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 9, 9, 6, enumFacing);
        return ZS.a(hF) && Y_.a(list, hF) == null ? new ZS(zw_02, n4, random, hF, enumFacing) : null;
    }
}

