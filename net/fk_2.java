/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.fk
 */
public class fk_2
extends fn_1 {
    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        super.a(world, blockPos, iBlockState, f, n);
        if (!world.isRemote && P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) >= 7 && a5_0.a(world.o, 50) == 0) {
            fk_2.a(world, blockPos, new ItemStack(Items.poisonous_potato));
        }
    }

    @Override
    protected Item b() {
        return Items.potato;
    }

    @Override
    protected Item a() {
        return Items.potato;
    }
}

