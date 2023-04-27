/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.fW
 */
public class fw_1
extends Block {
    @Override
    public boolean f() {
        return false;
    }

    @Override
    public float M() {
        return 1.0f;
    }

    @Override
    public int q() {
        return -1;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
    }

    protected fw_1() {
        super(Material.u);
        this.h();
        this.a(6000001.0f);
        this.R();
        this.M = true;
    }
}

