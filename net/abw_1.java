/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abW
 */
class abw_1
extends aKT {
    private aKT b = new aKT();

    abw_1() {
    }

    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        lx_0 lx_02 = (lx_0)act_2.k(itemStack);
        BlockPos blockPos = amv_2.a(tb_2.f(aYE2), hy_0.a(tb_2.e(aYE2)));
        if (FM.a(lx_02, tb_2.a(aYE2), blockPos)) {
            act_2.a(itemStack, Items.bucket);
            itemStack.a = 1;
            return itemStack;
        }
        return this.b.a(aYE2, itemStack);
    }
}

