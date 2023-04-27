/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import com.google.common.base.Predicate;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net._k
 */
public class _k_0
extends _v_0 {
    private World c;
    private nl_1 d;
    private static Predicate<IBlockState> e = E6.a(E6.a(Blocks.bN), fg_1.P, an7_0.a(a4b.GRASS));
    int b;

    @Override
    public void a() {
        this.b = 0;
    }

    @Override
    public boolean g() {
        if (a5_0.a(CG.a(this.d), CG.q(this.d) ? 50 : 1000) != 0) {
            return false;
        }
        BlockPos blockPos = new BlockPos(this.d.posX, this.d.posY, this.d.posZ);
        return aqv_2.a(e, aV8.q(this.c, blockPos)) || BlockStateInvoker.getBlock(aV8.q(this.c, amv_2.g(blockPos))) == Blocks.grass;
    }

    @Override
    public void b() {
        this.b = 40;
        aV8.a(this.c, (Entity)this.d, (byte)10);
        tz_1.a(CG.e(this.d));
    }

    public int a() {
        return this.b;
    }

    public _k_0(nl_1 nl_12) {
        this.d = nl_12;
        this.c = nl_12.worldObj;
        this.a(7);
    }

    @Override
    public boolean f() {
        return this.b > 0;
    }

    @Override
    public void d() {
        this.b = MathInvoker.max(0, this.b - 1);
        if (this.b == 4) {
            BlockPos blockPos = new BlockPos(this.d.posX, this.d.posY, this.d.posZ);
            if (aqv_2.a(e, aV8.q(this.c, blockPos))) {
                if (J9.c(aV8.k(this.c), MW.b)) {
                    aV8.b(this.c, blockPos, false);
                }
                CG.G(this.d);
            } else {
                BlockPos blockPos2 = amv_2.g(blockPos);
                if (BlockStateInvoker.getBlock(aV8.q(this.c, blockPos2)) == Blocks.grass) {
                    if (J9.c(aV8.k(this.c), MW.a)) {
                        aV8.c(this.c, 2001, blockPos2, BlocksInvoker.v(Blocks.grass));
                        aV8.a(this.c, blockPos2, BlocksInvoker.t(Blocks.dirt), 2);
                    }
                    CG.G(this.d);
                }
            }
        }
    }
}

