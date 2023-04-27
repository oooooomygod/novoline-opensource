/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.g2
 */
public class g2_0
extends Block {
    public static J_ P;
    public static J_ S;
    public static J_ R;
    public static J_ Q;

    public g2_0(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, Boolean.FALSE), S, Boolean.FALSE), R, Boolean.FALSE), P, Boolean.FALSE));
        this.a(CreativeTabs.l);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, Q, auk_2.b(this.a(iBlockAccess, amv_2.a(blockPos)))), S, auk_2.b(this.a(iBlockAccess, amv_2.f(blockPos)))), R, auk_2.b(this.a(iBlockAccess, amv_2.b(blockPos)))), P, auk_2.b(this.a(iBlockAccess, amv_2.d(blockPos))));
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return true;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        return world.isRemote || ael_0.a(entityPlayer, world, blockPos);
    }

    public boolean a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos));
        return block != Blocks.ao && (block instanceof g2_0 && block.o == this.o || block instanceof gv_2 || akm_1.g(block.o) && block.v() && block.o != Material.h);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(iBlockAccess, amv_2.a(blockPos));
        this.a(iBlockAccess, amv_2.b(blockPos));
        this.a(iBlockAccess, amv_2.d(blockPos));
        this.a(iBlockAccess, amv_2.f(blockPos));
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        f3 = 0.0f;
        f4 = 1.0f;
        f = 0.0f;
        f2 = 1.0f;
        this.a(f, 0.0f, f3, f2, 1.0f, f4);
    }

    public g2_0(Material material) {
        this(material, akm_1.j(material));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return 0;
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a((IBlockAccess)world, amv_2.a(blockPos));
        this.a((IBlockAccess)world, amv_2.b(blockPos));
        this.a((IBlockAccess)world, amv_2.d(blockPos));
        this.a((IBlockAccess)world, amv_2.f(blockPos));
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.375f;
        float f4 = 0.625f;
        f3 = 0.0f;
        f4 = 1.0f;
        this.a(f, 0.0f, f3, f2, 1.5f, f4);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        f3 = 0.375f;
        f4 = 0.625f;
        f = 0.0f;
        f2 = 1.0f;
        this.a(f, 0.0f, f3, f2, 1.5f, f4);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        f3 = 0.0f;
        f4 = 1.0f;
        this.a(f, 0.0f, f3, f2, 1.0f, f4);
    }

    static {
        Q = aWq.a(KV.c);
        S = aWq.a(KV.b);
        R = aWq.a(KV.a);
        P = aWq.a(KV.d);
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, S, P, R);
    }
}

