/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Zj
 */
public class zj_0
extends YJ {
    public static zj_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -3, 0, 0, 9, 7, 9, enumFacing);
        return zj_0.a(hF) && Y_.a(list, hF) == null ? new zj_0(n4, random, hF, enumFacing) : null;
    }

    public zj_0() {
    }

    public zj_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        int n = 1;
        if (this.c == EnumFacing.WEST || this.c == EnumFacing.NORTH) {
            n = 5;
        }
        this.b((zr_0)y_, list, random, 0, n, a5_0.a(random, 8) > 0);
        this.c((zr_0)y_, list, random, 0, n, a5_0.a(random, 8) > 0);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 0, 0, 8, 1, 8, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 0, 8, 5, 8, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 6, 0, 8, 6, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 0, 2, 5, 0, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 6, 2, 0, 8, 5, 0, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 3, 0, 1, 4, 0, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 7, 3, 0, 7, 4, 0, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 0, 2, 4, 8, 2, 8, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 1, 4, 2, 2, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 6, 1, 4, 7, 2, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 3, 8, 8, 3, 8, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 0, 3, 6, 0, 3, 7, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 8, 3, 6, 8, 3, 7, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 0, 3, 4, 0, 5, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 8, 3, 4, 8, 5, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 3, 5, 2, 5, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 6, 3, 5, 7, 5, 5, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 4, 5, 1, 5, 5, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 7, 4, 5, 7, 5, 5, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n2, -1, n, hF);
            ++n2;
        }
    }
}

