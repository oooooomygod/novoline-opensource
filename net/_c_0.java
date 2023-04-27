/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net._c
 */
public abstract class _c_0
extends _v_0 {
    float d;
    float e;
    protected BlockPos b = BlockPos.m;
    boolean g;
    protected nl_1 c;
    protected g7_0 f;

    public _c_0(nl_1 nl_12) {
        this.c = nl_12;
        if (!(CG.e(nl_12) instanceof F_)) {
            throw new IllegalArgumentException(aku_1.a);
        }
    }

    private g7_0 a(BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aV8.q(this.c.worldObj, blockPos));
        return block instanceof g7_0 && BlocksInvoker.getBlockState(block) == Material.wood ? (g7_0)block : null;
    }

    @Override
    public void b() {
        this.g = false;
        this.e = (float)((double)((float)amv_2.j(this.b) + 0.5f) - this.c.posX);
        this.d = (float)((double)((float)amv_2.i(this.b) + 0.5f) - this.c.posZ);
    }

    @Override
    public boolean f() {
        return !this.g;
    }

    @Override
    public boolean g() {
        if (!this.c.g) {
            return false;
        }
        F_ f_ = (F_)CG.e(this.c);
        aMH aMH2 = afv_0.b(f_);
        if (!afG.d(aMH2) && afv_0.c(f_)) {
            for (int i = 0; i < MathInvoker.b(afG.e(aMH2) + 2, afG.c(aMH2)); ++i) {
                aQP aQP2 = afG.a(aMH2, i);
                this.b = new BlockPos(aQP2.c, aQP2.d + 1, aQP2.j);
                if (!(CG.a(this.c, amv_2.j(this.b), this.c.posY, amv_2.i(this.b)) <= 2.25)) continue;
                this.f = this.a(this.b);
                if (this.f == null) continue;
                return true;
            }
            this.b = amv_2.e(new BlockPos(this.c));
            this.f = this.a(this.b);
            return this.f != null;
        }
        return false;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void d() {
        float f;
        float f2 = (float)((double)((float)amv_2.j(this.b) + 0.5f) - this.c.posX);
        float f3 = this.e * f2 + this.d * (f = (float)((double)((float)amv_2.i(this.b) + 0.5f) - this.c.posZ));
        if (f3 < 0.0f) {
            this.g = true;
        }
    }
}

