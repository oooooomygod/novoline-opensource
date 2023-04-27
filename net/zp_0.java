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
 * Renamed from net.Zp
 */
public class zp_0
extends YJ {
    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 0, 0, 4, 1, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 0, 4, 5, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 2, 0, 0, 5, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 4, 2, 0, 4, 5, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 3, 1, 0, 4, 1, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 0, 3, 3, 0, 4, 3, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 4, 3, 1, 4, 4, 1, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 4, 3, 3, 4, 4, 3, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 0, 6, 0, 4, 6, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, n2, hF);
            ++n2;
        }
    }

    public zp_0() {
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.a((zr_0)y_, list, random, 1, 0, true);
    }

    public static zp_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, 0, 0, 5, 7, 5, enumFacing);
        return zp_0.a(hF) && Y_.a(list, hF) == null ? new zp_0(n4, random, hF, enumFacing) : null;
    }

    public zp_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }
}

