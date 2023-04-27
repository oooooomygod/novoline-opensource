/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.fc
 */
public class fc_2
extends Block {
    @Override
    public boolean e(World world, BlockPos blockPos) {
        return super.e(world, blockPos) && this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))));
    }

    protected boolean a(Block block) {
        return block == Blocks.grass || block == Blocks.dirt || block == Blocks.al;
    }

    protected fc_2() {
        this(Material.F);
    }

    protected void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.a(world, blockPos, iBlockState)) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.a(world, blockPos, Blocks.air.m(), 3);
        }
    }

    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        return this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))));
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        this.b(world, blockPos, iBlockState);
    }

    protected fc_2(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.a(true);
        this.a(0.3f, 0.0f, 0.3f, 0.7f, 0.6f, 0.7f);
        this.a(CreativeTabs.l);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean v() {
        return false;
    }

    protected fc_2(Material material) {
        this(material, akm_1.j(material));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        super.a(world, blockPos, iBlockState, block);
        this.b(world, blockPos, iBlockState);
    }
}

