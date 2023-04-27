/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import java.util.Random;
import net.minecraft.block.Block;
import net.CreativeTabs;

/*
 * Renamed from net.gZ
 */
public class gz_1
extends Block {
    @Override
    public int a(Random random) {
        return 3 + a5_0.a(random, 5);
    }

    @Override
    public int a(int n, Random random) {
        return MathInvoker.b(9, this.a(random) + a5_0.a(random, 1 + n));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.melon;
    }

    protected gz_1() {
        super(Material.h, MapColor.F);
        this.a(CreativeTabs.m);
    }
}

