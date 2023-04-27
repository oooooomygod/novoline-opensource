/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net;

import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Lp
 */
public class lp_0
extends L6 {
    @Override
    public int a(ItemStack itemStack, int n) {
        aPM aPM2 = ayv_0.a(act_2.c(itemStack));
        return aPM2 != aPM.GRASS && aPM2 != aPM.FERN ? super.a(itemStack, n) : zl_1.a(0.5, 1.0);
    }

    public lp_0(Block block, Block block2, Function<ItemStack, String> function) {
        super(block, block2, function);
    }
}

