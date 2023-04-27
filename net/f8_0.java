/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;

/*
 * Renamed from net.f8
 */
public class f8_0
extends ft_2 {
    public f8_0() {
        super(Material.w, MapColor.v);
        this.setHardness(3.0f);
        this.a(CreativeTabs.b);
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
    public int q() {
        return 3;
    }

    @Override
    public boolean v() {
        return false;
    }

    public static void a(World world, BlockPos blockPos) {
        aVW.a(nt_0.b, () -> f8_0.lambda$updateColorAsync$1(world, blockPos));
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6G();
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6G) {
            a6w_0.a(entityPlayer, (a6G)tileEntity);
            a6w_0.a(entityPlayer, aop_1.aa);
        }
        return true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6G) {
            IT.c((a6G)tileEntity);
            aV8.b(world, blockPos, this, 1, 0);
        }
    }

    private static void lambda$updateColorAsync$1(World world, BlockPos blockPos) {
        Chunk chunk = aV8.x(world, blockPos);
        int n = amv_2.h(blockPos) - 1;
        BlockPos blockPos2;
        while (aqp_2.a(chunk, blockPos2 = new BlockPos(amv_2.j(blockPos), n, amv_2.i(blockPos)))) {
            IBlockState iBlockState = aV8.q(world, blockPos2);
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.d) {
                a3V.a((WorldServer)world, () -> f8_0.lambda$null$0(world, blockPos2));
            }
            --n;
        }
        return;
    }

    private static void lambda$null$0(World world, BlockPos blockPos) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6G) {
            IT.c((a6G)tileEntity);
            aV8.b(world, blockPos, Blocks.d, 1, 0);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity;
        super.a(world, blockPos, iBlockState, entityLivingBase, itemStack);
        if (act_2.g(itemStack) && (tileEntity = aV8.z(world, blockPos)) instanceof a6G) {
            IT.a((a6G)tileEntity, act_2.w(itemStack));
        }
    }
}

