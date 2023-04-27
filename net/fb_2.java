/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.TileEntity;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.fb
 */
public class fb_2
extends ft_2 {
    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6f_0();
    }

    protected fb_2() {
        super(Material.y);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        super.a(world, blockPos, iBlockState, f, n);
        int n2 = 15 + a5_0.a(world.o, 15) + a5_0.a(world.o, 15);
        this.a(world, blockPos, n2);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int q() {
        return 3;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }
}

