/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.f7
 */
public class f7_0
extends f3_0 {
    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
        a6w_0.d(entityPlayer, 0.025f);
        if (this.c() && alf_0.d(entityPlayer)) {
            ItemStack itemStack = this.b(iBlockState);
            f7_0.a(world, blockPos, itemStack);
        } else {
            if (qq_2.i(world.d)) {
                aV8.j(world, blockPos);
                return;
            }
            int n = alf_0.i(entityPlayer);
            this.a(world, blockPos, iBlockState, n);
            Material material = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))).w();
            if (akm_1.d(material) || akm_1.f(material)) {
                aV8.a(world, blockPos, Blocks.flowing_water.m());
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public f7_0() {
        super(Material.v, false);
        this.z = 0.98f;
        this.a(true);
        this.a(CreativeTabs.m);
    }

    @Override
    public int F() {
        return 0;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.TRANSLUCENT;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (aV8.b(world, YG.BLOCK, blockPos) > 11 - this.H()) {
            if (qq_2.i(world.d)) {
                aV8.j(world, blockPos);
            } else {
                this.a(world, blockPos, aV8.q(world, blockPos), 0);
                aV8.a(world, blockPos, Blocks.water.m());
            }
        }
    }
}

