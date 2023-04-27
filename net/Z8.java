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

public class Z8
extends zd_0 {
    private Block h;
    private Block g;

    public static Z8 a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 7, 4, 9, enumFacing);
        return Z8.a(hF) && Y_.a(list, hF) == null ? new Z8(zw_02, n4, random, hF, enumFacing) : null;
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
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.b(nBTTagCompound, azi_1.c, a82.c(Block.m, this.g));
        tn_0.b(nBTTagCompound, azi_1.d, a82.c(Block.m, this.h));
    }

    public Z8(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
        this.g = this.a(random);
        this.h = this.a(random);
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
        this.a(world, hF, 0, 1, 0, 6, 4, 8, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 1, 0, 1, 2, 0, 7, BlocksInvoker.t(Blocks.al), BlocksInvoker.t(Blocks.al), false);
        this.a(world, hF, 4, 0, 1, 5, 0, 7, BlocksInvoker.t(Blocks.al), BlocksInvoker.t(Blocks.al), false);
        this.a(world, hF, 0, 0, 0, 0, 0, 8, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 6, 0, 0, 6, 0, 8, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 1, 0, 0, 5, 0, 0, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 1, 0, 8, 5, 0, 8, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 3, 0, 1, 3, 0, 7, aBF.a(Blocks.water), aBF.a(Blocks.water), false);
        int n = 1;
        while (true) {
            this.b(world, BlocksInvoker.a(this.g, MathHelper.a(random, 2, 7)), 1, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.g, MathHelper.a(random, 2, 7)), 2, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.h, MathHelper.a(random, 2, 7)), 4, 1, n, hF);
            this.b(world, BlocksInvoker.a(this.h, MathHelper.a(random, 2, 7)), 5, 1, n, hF);
            ++n;
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.g = BlocksInvoker.a(tn_0.g(nBTTagCompound, azi_1.a));
        this.h = BlocksInvoker.a(tn_0.g(nBTTagCompound, azi_1.b));
    }

    public Z8() {
    }
}

