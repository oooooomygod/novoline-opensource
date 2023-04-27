/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;

class _Z
extends _O {
    private boolean k;
    private boolean l = false;
    private ng_1 j;

    public _Z(ng_1 ng_12) {
        super(ng_12, 0.7f, 16);
        this.j = ng_12;
    }

    @Override
    public boolean g() {
        if (this.f <= 0) {
            if (!J9.c(aV8.k(this.j.worldObj), VY.a)) {
                return false;
            }
            this.l = false;
            this.k = ng_1.a(this.j);
        }
        return super.g();
    }

    @Override
    public boolean f() {
        return this.l && super.f();
    }

    @Override
    public void d() {
        super.d();
        abs_1.a(FY.a(this.j), (double)amv_2.j(this.h) + 0.5, amv_2.h(this.h) + 1, (double)amv_2.i(this.h) + 0.5, 10.0f, FY.b(this.j));
        if (this.b()) {
            World world = this.j.worldObj;
            BlockPos blockPos = amv_2.e(this.h);
            IBlockState iBlockState = aV8.q(world, blockPos);
            Block block = BlockStateInvoker.getBlock(iBlockState);
            if (this.l && block instanceof fo_2 && P8.b((Integer)BlockStateInvoker.b(iBlockState, fo_2.P)) == 7) {
                aV8.a(world, blockPos, BlocksInvoker.t(Blocks.air), 2);
                aV8.b(world, blockPos, true);
                this.j.o();
            }
            this.l = false;
            this.f = 10;
        }
    }

    @Override
    public void b() {
        super.b();
    }

    @Override
    protected boolean a(World world, BlockPos blockPos) {
        IBlockState iBlockState;
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (block == Blocks.al && (block = BlockStateInvoker.getBlock(iBlockState = aV8.q(world, blockPos = amv_2.e(blockPos)))) instanceof fo_2 && P8.b((Integer)BlockStateInvoker.b(iBlockState, fo_2.P)) == 7 && this.k && !this.l) {
            this.l = true;
            return true;
        }
        return false;
    }

    @Override
    public void a() {
        super.a();
    }
}

