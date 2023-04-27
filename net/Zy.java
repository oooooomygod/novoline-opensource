/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class Zy
extends YJ {
    private boolean e;

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, yj_0.a, this.e);
    }

    public Zy(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
        this.e = a5_0.a(random, 3) == 0;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.c((zr_0)y_, list, random, 0, 1, true);
    }

    public static Zy a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, 0, 0, 5, 7, 5, enumFacing);
        return Zy.a(hF) && Y_.a(list, hF) == null ? new Zy(n4, random, hF, enumFacing) : null;
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.e = tn_0.c(nBTTagCompound, yj_0.b);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 0, 0, 4, 1, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 2, 0, 4, 5, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 2, 0, 0, 5, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 0, 3, 1, 0, 4, 1, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 0, 3, 3, 0, 4, 3, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.a6), false);
        this.a(world, hF, 4, 2, 0, 4, 5, 0, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 2, 4, 4, 5, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 1, 3, 4, 1, 4, 4, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.ak), false);
        this.a(world, hF, 3, 3, 4, 3, 4, 4, BlocksInvoker.t(Blocks.a6), BlocksInvoker.t(Blocks.ak), false);
        if (this.e && aqu_2.a(hF, new BlockPos(this.b(1, 3), this.a(2), this.a(1, 3)))) {
            this.e = false;
            this.a(world, hF, random, 1, 2, 3, d, 2 + a5_0.a(random, 4));
        }
        this.a(world, hF, 0, 6, 0, 4, 6, 4, BlocksInvoker.t(Blocks.ak), BlocksInvoker.t(Blocks.ak), false);
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.ak), n, -1, n2, hF);
            ++n2;
        }
    }

    public Zy() {
    }
}

