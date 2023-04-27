/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abV
 */
class abv_1
extends aKT {
    private boolean b = true;

    abv_1() {
    }

    @Override
    protected ItemStack b(aYE aYE2, ItemStack itemStack) {
        BlockPos blockPos;
        World world = tb_2.a(aYE2);
        if (aV8.k(world, blockPos = amv_2.a(tb_2.f(aYE2), hy_0.a(tb_2.e(aYE2))))) {
            aV8.a(world, blockPos, abb_1.a(Blocks.c));
            if (act_2.a(itemStack, 1, world.o)) {
                itemStack.a = 0;
            }
        } else if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) == Blocks.Y) {
            BlocksInvoker.c(Blocks.Y, world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.Y), h2_0.P, Boolean.TRUE));
            aV8.j(world, blockPos);
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
}

