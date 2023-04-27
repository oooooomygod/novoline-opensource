/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CreativeTabs;

/*
 * Renamed from net.hA
 */
public class ha_1
extends Block {
    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.string;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        ayj_0.g(entity);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    public ha_1() {
        super(Material.n);
        this.a(CreativeTabs.l);
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean v() {
        return false;
    }
}

