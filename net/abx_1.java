/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abx
 */
class abx_1
extends aKT {
    private boolean b = true;

    @Override
    protected ItemStack b(aYE aYE2, ItemStack itemStack) {
        World world = tb_2.a(aYE2);
        BlockPos blockPos = amv_2.a(tb_2.f(aYE2), hy_0.a(tb_2.e(aYE2)));
        gv_1 gv_12 = (gv_1)Blocks.ap;
        if (aV8.k(world, blockPos) && avx_2.a(gv_12, world, blockPos)) {
            if (!world.isRemote) {
                aV8.a(world, blockPos, avx_2.a(gv_12), 3);
            }
            --itemStack.a;
        } else {
            this.b = false;
        }
        return itemStack;
    }

    @Override
    protected void a(aYE aYE2) {
        if (this.b) {
            aV8.c(tb_2.a(aYE2), 1000, tb_2.f(aYE2), 0);
        } else {
            aV8.c(tb_2.a(aYE2), 1001, tb_2.f(aYE2), 0);
        }
    }

    abx_1() {
    }
}

