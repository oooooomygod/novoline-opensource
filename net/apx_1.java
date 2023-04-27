/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.Entity;
import deobf.IBlockAccess;
import deobf.EnumFacing;
import net.minecraft.block.Block;

/*
 * Renamed from net.apX
 */
public class apx_1
extends ap8_0 {
    private int b(Entity entity, int n, int n2, int n3) {
        z6_0 z6_02 = new z6_0();
        for (int i = n; i < n + this.b; ++i) {
            for (int j = n2; j < n2 + this.c; ++j) {
                for (int k = n3; k < n3 + this.a; ++k) {
                    Block block = BlockStateInvoker.getBlock(aG3.c(this.d, ain_1.a(z6_02, i, j, k)));
                    if (BlocksInvoker.getBlockState(block) == Material.M) continue;
                    return 0;
                }
            }
        }
        return -1;
    }

    private aQP a(Entity entity, int n, int n2, int n3) {
        int n4 = this.b(entity, n, n2, n3);
        return n4 == -1 ? this.a(n, n2, n3) : null;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, Entity entity) {
        super.a(iBlockAccess, entity);
    }

    @Override
    public aQP a(Entity entity) {
        return this.a(MathHelper.floor_double(ayj_0.u((Entity)entity).e), MathHelper.floor_double(ayj_0.u((Entity)entity).a + 0.5), MathHelper.floor_double(ayj_0.u((Entity)entity).f));
    }

    @Override
    public int a(aQP[] aQPArray, Entity entity, aQP aQP2, aQP aQP3, float f) {
        int n = 0;
        for (EnumFacing enumFacing : EnumFacing.values()) {
            aQP aQP4 = this.a(entity, aQP2.c + SJ.k(enumFacing), aQP2.d + SJ.f(enumFacing), aQP2.j + SJ.a(enumFacing));
            if (aQP4.a || !(axw_0.b(aQP4, aQP3) < f)) continue;
            aQPArray[n++] = aQP4;
        }
        return n;
    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public aQP a(Entity entity, double d, double d2, double d3) {
        return this.a(MathHelper.floor_double(d - (double)(entity.width / 2.0f)), MathHelper.floor_double(d2 + 0.5), MathHelper.floor_double(d3 - (double)(entity.width / 2.0f)));
    }
}

