/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abu
 */
class abu_2
extends aKT {
    @Override
    protected ItemStack b(aYE aYE2, ItemStack itemStack) {
        World world = tb_2.a(aYE2);
        BlockPos blockPos = amv_2.a(tb_2.f(aYE2), hy_0.a(tb_2.e(aYE2)));
        od_1 od_12 = new od_1(world, (double)amv_2.j(blockPos) + 0.5, amv_2.h(blockPos), (double)amv_2.i(blockPos) + 0.5, null);
        aV8.b(world, od_12);
        aV8.a(world, od_12, afb_2.a, 1.0f, 1.0f);
        --itemStack.a;
        return itemStack;
    }

    abu_2() {
    }
}

