/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.i7
 */
public abstract class i7_0 {
    private boolean a;

    protected void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.a) {
            aV8.a(world, blockPos, iBlockState, 3);
        } else {
            aV8.a(world, blockPos, iBlockState, 2);
        }
    }

    public void a() {
    }

    public i7_0(boolean bl) {
        this.a = bl;
    }

    public abstract boolean a(World var1, Random var2, BlockPos var3);

    public i7_0() {
        this(false);
    }
}

