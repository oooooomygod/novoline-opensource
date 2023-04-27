/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abr
 */
class abr_2
extends aKT {
    private boolean b = true;

    @Override
    protected void a(aYE aYE2) {
        if (this.b) {
            aV8.c(tb_2.a(aYE2), 1000, tb_2.f(aYE2), 0);
        } else {
            aV8.c(tb_2.a(aYE2), 1001, tb_2.f(aYE2), 0);
        }
    }

    @Override
    protected ItemStack b(aYE aYE2, ItemStack itemStack) {
        if (YZ.WHITE == my_2.b(act_2.c(itemStack))) {
            BlockPos blockPos;
            World world = tb_2.a(aYE2);
            if (KQ.a(itemStack, world, blockPos = amv_2.a(tb_2.f(aYE2), hy_0.a(tb_2.e(aYE2))))) {
                if (!world.isRemote) {
                    aV8.c(world, 2005, blockPos, 0);
                }
            } else {
                this.b = false;
            }
            return itemStack;
        }
        return super.b(aYE2, itemStack);
    }

    abr_2() {
    }
}

