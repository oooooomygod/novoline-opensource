/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Zi
 */
public class zi_0
extends zd_0 {
    private Block g;
    private Block h;
    private Block i;
    private Block j;

    public zi_0() {
    }

    public zi_0(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
        this.g = this.a(random);
        this.i = this.a(random);
        this.h = this.a(random);
        this.j = this.a(random);
    }

    public static zi_0 a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 13, 4, 9, enumFacing);
        return zi_0.a(hF) && Y_.a(list, hF) == null ? new zi_0(zw_02, n4, random, hF, enumFacing) : null;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.b(nBTTagCompound, da_2.d, a82.c(Block.m, this.g));
        tn_0.b(nBTTagCompound, da_2.g, a82.c(Block.m, this.i));
        tn_0.b(nBTTagCompound, da_2.a, a82.c(Block.m, this.h));
        tn_0.b(nBTTagCompound, da_2.b, a82.c(Block.m, this.j));
    }

    private Block a(Random random) {
        switch (a5_0.a(random, 5)) {
            case 0: {
                return Blocks.aY;
            }
            case 1: {
                return Blocks.b8;
            }
        }
        return Blocks.ay;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 4 - 1, 0);
        }
        this.a(world, hF, 0, 1, 0, 12, 4, 8, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 1, 0, 1, 2, 0, 7, BlocksInvoker.t(Blocks.al), BlocksInvoker.t(Blocks.al), false);
        this.a(world, hF, 4, 0, 1, 5, 0, 7, BlocksInvoker.t(Blocks.al), BlocksInvoker.t(Blocks.al), false);
        this.a(world, hF, 7, 0, 1, 8, 0, 7, BlocksInvoker.t(Blocks.al), BlocksInvoker.t(Blocks.al), false);
        this.a(world, hF, 10, 0, 1, 11, 0, 7, BlocksInvoker.t(Blocks.al), BlocksInvoker.t(Blocks.al), false);
        this.a(world, hF, 0, 0, 0, 0, 0, 8, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 6, 0, 0, 6, 0, 8, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 12, 0, 0, 12, 0, 8, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 1, 0, 0, 11, 0, 0, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 1, 0, 8, 11, 0, 8, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 3, 0, 1, 3, 0, 7, aBF.a(Blocks.water), aBF.a(Blocks.water), false);
        this.a(world, hF, 9, 0, 1, 9, 0, 7, aBF.a(Blocks.water), aBF.a(Blocks.water), false);
        int n = 1;
        while (true) {
            this.b(world, BlocksInvoker.a(this.g, MathHelper.a(random, 2, 7)), 1, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.g, MathHelper.a(random, 2, 7)), 2, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.i, MathHelper.a(random, 2, 7)), 4, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.i, MathHelper.a(random, 2, 7)), 5, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.h, MathHelper.a(random, 2, 7)), 7, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.h, MathHelper.a(random, 2, 7)), 8, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.j, MathHelper.a(random, 2, 7)), 10, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.j, MathHelper.a(random, 2, 7)), 11, 1, n, hF);
            ++n;
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.g = BlocksInvoker.a(tn_0.g(nBTTagCompound, da_2.h));
        this.i = BlocksInvoker.a(tn_0.g(nBTTagCompound, da_2.c));
        this.h = BlocksInvoker.a(tn_0.g(nBTTagCompound, da_2.e));
        this.j = BlocksInvoker.a(tn_0.g(nBTTagCompound, da_2.f));
    }
}

