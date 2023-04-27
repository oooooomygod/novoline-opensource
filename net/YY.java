/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import java.util.Random;

public class YY
extends YC {
    private boolean h;

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (!this.a(world, hF, 0)) {
            return false;
        }
        this.a(world, hF, 1, 1, 1, 5, 1, 7, BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), false);
        this.a(world, hF, 1, 4, 2, 5, 4, 7, BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), false);
        this.a(world, hF, 2, 1, 0, 4, 1, 0, BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), false);
        this.a(world, hF, 2, 2, 2, 3, 3, 2, BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), false);
        this.a(world, hF, 1, 2, 3, 1, 3, 6, BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), false);
        this.a(world, hF, 5, 2, 3, 5, 3, 6, BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), false);
        this.a(world, hF, 2, 2, 7, 4, 3, 7, BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), BlocksInvoker.a(Blocks.planks, aER.b(F3.SPRUCE)), false);
        this.a(world, hF, 1, 0, 2, 1, 3, 2, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 5, 0, 2, 5, 3, 2, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 1, 0, 7, 1, 3, 7, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 5, 0, 7, 5, 3, 7, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.b(world, BlocksInvoker.t(Blocks.Z), 2, 3, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 3, 3, 7, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 1, 3, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 5, 3, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 5, 3, 5, hF);
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.N), fw_2.Q, (Comparable)((Object)atY.MUSHROOM_RED)), 1, 3, 5, hF);
        this.b(world, BlocksInvoker.t(Blocks.aq), 3, 2, 6, hF);
        this.b(world, aLT.a(Blocks.au), 4, 2, 6, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 1, 2, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 5, 2, 1, hF);
        int n = this.a(Blocks.a7, 3);
        int n2 = this.a(Blocks.a7, 1);
        int n3 = this.a(Blocks.a7, 0);
        int n4 = this.a(Blocks.a7, 2);
        this.a(world, hF, 0, 4, 1, 6, 4, 1, BlocksInvoker.a(Blocks.aT, n), BlocksInvoker.a(Blocks.aT, n), false);
        this.a(world, hF, 0, 4, 2, 0, 4, 7, BlocksInvoker.a(Blocks.aT, n3), BlocksInvoker.a(Blocks.aT, n3), false);
        this.a(world, hF, 6, 4, 2, 6, 4, 7, BlocksInvoker.a(Blocks.aT, n2), BlocksInvoker.a(Blocks.aT, n2), false);
        this.a(world, hF, 0, 4, 8, 6, 4, 8, BlocksInvoker.a(Blocks.aT, n4), BlocksInvoker.a(Blocks.aT, n4), false);
        int n5 = 2;
        int n6 = 1;
        while (true) {
            this.a(world, BlocksInvoker.t(Blocks.b2), n6, -1, n5, hF);
            n6 += 4;
        }
    }

    public YY(Random random, int n, int n2) {
        super(random, n, 64, n2, 7, 7, 9);
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, gr_0.a, this.h);
    }

    public YY() {
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.h = tn_0.c(nBTTagCompound, gr_0.b);
    }
}

