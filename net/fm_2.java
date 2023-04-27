/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;

/*
 * Renamed from net.fm
 */
public class fm_2
extends BlockDispenser {
    private IBehaviorDispenseItem T = new aKT();

    @Override
    public TileEntity a(World world, int n) {
        return new a6F();
    }

    @Override
    protected void a(World world, BlockPos blockPos) {
        aal_2 aal_22 = new aal_2(world, blockPos);
        a6B a6B2 = (a6B)ha_0.a(aal_22);
        a24.b(a6B2);
        aV8.c(world, 1001, blockPos, 0);
    }

    @Override
    protected IBehaviorDispenseItem a(ItemStack itemStack) {
        return this.T;
    }
}

