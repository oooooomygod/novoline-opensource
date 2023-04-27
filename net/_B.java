/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class _B
extends _O {
    private nz_0 k;
    private int l;
    private boolean m;
    private boolean j;

    public _B(nz_0 nz_02, double d) {
        super(nz_02, d, 16);
        this.k = nz_02;
    }

    @Override
    public boolean g() {
        if (this.f <= 0) {
            if (!J9.c(aV8.k(this.k.worldObj), ail_2.a)) {
                return false;
            }
            this.l = -1;
            this.j = ayh_1.s(this.k);
            this.m = ayh_1.g(this.k);
        }
        return super.g();
    }

    @Override
    public void b() {
        super.b();
    }

    @Override
    protected boolean a(World world, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (block == Blocks.al) {
            IBlockState iBlockState = aV8.q(world, blockPos = amv_2.e(blockPos));
            block = BlockStateInvoker.getBlock(iBlockState);
            if (block instanceof fn_1 && P8.b((Integer)BlockStateInvoker.b(iBlockState, fn_1.P)) == 7 && this.m && (this.l == 0 || this.l < 0)) {
                this.l = 0;
                return true;
            }
            if (block == Blocks.air && this.j && (this.l == 1 || this.l < 0)) {
                this.l = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public void d() {
        super.d();
        abs_1.a(ayh_1.l(this.k), (double)amv_2.j(this.h) + 0.5, amv_2.h(this.h) + 1, (double)amv_2.i(this.h) + 0.5, 10.0f, ayh_1.a(this.k));
        if (this.b()) {
            wu_0 wu_02;
            int n;
            World world = this.k.worldObj;
            BlockPos blockPos = amv_2.e(this.h);
            IBlockState iBlockState = aV8.q(world, blockPos);
            Block block = BlockStateInvoker.getBlock(iBlockState);
            if (this.l == 0 && block instanceof fn_1 && P8.b((Integer)BlockStateInvoker.b(iBlockState, fn_1.P)) == 7) {
                aV8.b(world, blockPos, true);
            } else if (this.l == 1 && block == Blocks.air && (n = 0) < ajs_0.a(wu_02 = ayh_1.b(this.k))) {
                ItemStack itemStack = ajs_0.a(wu_02, n);
                if (act_2.k(itemStack) == Items.wheat_seeds) {
                    aV8.a(world, blockPos, BlocksInvoker.t(Blocks.ay), 3);
                } else if (act_2.k(itemStack) == Items.potato) {
                    aV8.a(world, blockPos, BlocksInvoker.t(Blocks.b8), 3);
                } else if (act_2.k(itemStack) == Items.carrot) {
                    aV8.a(world, blockPos, BlocksInvoker.t(Blocks.aY), 3);
                }
                --itemStack.a;
                if (itemStack.a <= 0) {
                    ajs_0.a(wu_02, n, null);
                }
            }
            this.l = -1;
            this.f = 10;
        }
    }

    @Override
    public boolean f() {
        return this.l >= 0 && super.f();
    }

    @Override
    public void a() {
        super.a();
    }
}

