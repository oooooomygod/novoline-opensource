/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;

public class _F
extends _O {
    private nb_1 j;

    @Override
    public void b() {
        super.b();
        arg_0.a(ayq_1.c(this.j), false);
    }

    @Override
    public boolean g() {
        return ayq_1.d(this.j) && !ayq_1.b(this.j) && super.g();
    }

    @Override
    public void a() {
        super.a();
        ayq_1.a(this.j, false);
    }

    @Override
    public boolean f() {
        return super.f();
    }

    @Override
    protected boolean a(World world, BlockPos blockPos) {
        if (!aV8.k(world, amv_2.e(blockPos))) {
            return false;
        }
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (block == Blocks.R) {
            TileEntity tileEntity = aV8.z(world, blockPos);
            return tileEntity instanceof a6O && ((a6O)tileEntity).q < 1;
        }
        if (block == Blocks.a) {
            return true;
        }
        return block == Blocks.aw && BlockStateInvoker.b(iBlockState, gp_2.R) != a5E.HEAD;
    }

    public _F(nb_1 nb_12, double d) {
        super(nb_12, d, 8);
        this.j = nb_12;
    }

    @Override
    public void d() {
        super.d();
        arg_0.a(ayq_1.c(this.j), false);
        if (!this.b()) {
            ayq_1.a(this.j, false);
        } else if (!ayq_1.b(this.j)) {
            ayq_1.a(this.j, true);
        }
    }
}

