/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.all
 */
class all_2
extends _J {
    private ns_1 k;
    private EnumFacing i;
    private boolean j;

    @Override
    public boolean g() {
        if (aN9.a(this.k) != null) {
            return false;
        }
        if (!tz_1.b(aN9.b(this.k))) {
            return false;
        }
        Random random = aN9.d(this.k);
        if (a5_0.a(random, 10) == 0) {
            this.i = SJ.a(random);
            BlockPos blockPos = amv_2.a(new BlockPos(this.k.posX, this.k.posY + 0.5, this.k.posZ), this.i);
            IBlockState iBlockState = aV8.q(this.k.worldObj, blockPos);
            if (YF.a(iBlockState)) {
                this.j = true;
                return true;
            }
        }
        this.j = false;
        return super.g();
    }

    @Override
    public boolean f() {
        return !this.j && super.f();
    }

    @Override
    public void b() {
        if (!this.j) {
            super.b();
        } else {
            World world = this.k.worldObj;
            BlockPos blockPos = amv_2.a(new BlockPos(this.k.posX, this.k.posY + 0.5, this.k.posZ), this.i);
            IBlockState iBlockState = aV8.q(world, blockPos);
            if (YF.a(iBlockState)) {
                aV8.a(world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bV), h6_0.P, (Comparable)((Object)SL.a(iBlockState))), 3);
                aN9.c(this.k);
                aN9.e(this.k);
            }
        }
    }

    public all_2(ns_1 ns_12) {
        super(ns_12, 1.0, 10);
        this.k = ns_12;
        this.a(1);
    }
}

