/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;
import deobf.ITileEntityProvider;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.gi
 */
public class gi_2
extends Block {
    public static jw_0 R = au_2.a(aao_2.c);
    public static J_ P = aWq.a(aao_2.b);
    private boolean Q;

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
    }

    @Override
    public IBlockState a(IBlockState iBlockState) {
        return BlockStateInvoker.a(this.m(), R, (Comparable)((Object) EnumFacing.UP));
    }

    @Override
    public void o() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    private boolean a(World world, BlockPos blockPos, EnumFacing enumFacing, boolean bl) {
        aV8.j(world, amv_2.a(blockPos, enumFacing));
        ajC ajC2 = new ajC(world, blockPos, enumFacing, bl);
        List list = aSJ.a(ajC2);
        List list2 = aSJ.c(ajC2);
        if (!aSJ.b(ajC2)) {
            return false;
        }
        int n = ListInvoker.size(list) + ListInvoker.size(list2);
        Block[] blockArray = new Block[n];
        int n2 = ListInvoker.size(list2) - 1;
        while (true) {
            BlockPos blockPos2 = (BlockPos)ListInvoker.get(list2, n2);
            Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
            block.a(world, blockPos2, aV8.q(world, blockPos2), 0);
            aV8.j(world, blockPos2);
            blockArray[--n] = block;
            --n2;
        }
    }

    public static boolean a(Block block, World world, BlockPos blockPos, EnumFacing enumFacing, boolean bl) {
        if (block == Blocks.O) {
            return false;
        }
        if (!ak9_0.a(aV8.x(world), blockPos)) {
            return false;
        }
        if (amv_2.h(blockPos) >= 0 && (enumFacing != EnumFacing.DOWN || amv_2.h(blockPos) != 0)) {
            if (amv_2.h(blockPos) <= aV8.y(world) - 1 && (enumFacing != EnumFacing.UP || amv_2.h(blockPos) != aV8.y(world) - 1)) {
                if (block != Blocks.bB && block != Blocks.E) {
                    if (block.h(world, blockPos) == -1.0f) {
                        return false;
                    }
                    if (block.F() == 2) {
                        return false;
                    }
                    if (block.F() == 1) {
                        return bl;
                    }
                } else if (auk_2.a((Boolean)BlockStateInvoker.b(aV8.q(world, blockPos), P))) {
                    return false;
                }
                return !(block instanceof ITileEntityProvider);
            }
            return false;
        }
        return false;
    }

    private boolean b(World world, BlockPos blockPos, EnumFacing enumFacing) {
        for (EnumFacing enumFacing2 : EnumFacing.values()) {
            if (enumFacing2 == enumFacing || !aV8.a(world, amv_2.a(blockPos, enumFacing2), enumFacing2)) continue;
            return true;
        }
        if (aV8.a(world, blockPos, EnumFacing.DOWN)) {
            return true;
        }
        BlockPos blockPos2 = amv_2.e(blockPos);
        for (EnumFacing enumFacing3 : EnumFacing.values()) {
            if (enumFacing3 == EnumFacing.DOWN || !aV8.a(world, amv_2.a(blockPos2, enumFacing3), enumFacing3)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == this && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
            switch (aeo_2.a[enumFacing.ordinal()]) {
                case 1: {
                    this.a(0.0f, 0.25f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 2: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
                    break;
                }
                case 3: {
                    this.a(0.0f, 0.0f, 0.25f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 4: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.75f);
                    break;
                }
                case 5: {
                    this.a(0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 6: {
                    this.a(0.0f, 0.0f, 0.0f, 0.75f, 1.0f, 1.0f);
                }
            }
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote && aV8.z(world, blockPos) == null) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, R, P);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 8;
        }
        return n;
    }

    public static EnumFacing a(World world, BlockPos blockPos, EntityLivingBase entityLivingBase) {
        if (MathHelper.d((float)entityLivingBase.posX - (float)amv_2.j(blockPos)) < 2.0f && MathHelper.d((float)entityLivingBase.posZ - (float)amv_2.i(blockPos)) < 2.0f) {
            double d = entityLivingBase.posY + (double)atn_0.a(entityLivingBase);
            if (d - (double)amv_2.h(blockPos) > 2.0) {
                return EnumFacing.UP;
            }
            if ((double)amv_2.h(blockPos) - d > 0.0) {
                return EnumFacing.DOWN;
            }
        }
        return SJ.b(atn_0.D(entityLivingBase));
    }

    public gi_2(boolean bl) {
        super(Material.d);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, (Comparable)((Object)EnumFacing.NORTH)), P, Boolean.FALSE));
        this.Q = bl;
        this.a(h);
        this.setHardness(0.5f);
        this.a(CreativeTabs.j);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, R, (Comparable)((Object)gi_2.a(world, blockPos, entityLivingBase))), 2);
        if (!world.isRemote) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, int n, int n2) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
        if (!world.isRemote) {
            this.b(world, blockPos, enumFacing);
            if (n == 1) {
                aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE), 2);
                return false;
            }
            return false;
        }
        if (!this.a(world, blockPos, enumFacing, true)) {
            return false;
        }
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE), 2);
        aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aao_2.d, 0.5f, a5_0.e(world.o) * 0.25f + 0.6f);
        return true;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        return super.b(world, blockPos, iBlockState);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)gi_2.a(world, blockPos, entityLivingBase))), P, Boolean.FALSE);
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
        this.b(world, blockPos, enumFacing);
        if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            if (aSJ.b(new ajC(world, blockPos, enumFacing, true))) {
                aV8.b(world, blockPos, this, 0, SJ.i(enumFacing));
            }
        } else if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.FALSE), 2);
            aV8.b(world, blockPos, this, 1, SJ.i(enumFacing));
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)gi_2.a(n))), P, auk_2.b((n & 8) > 0));
    }

    public static EnumFacing a(int n) {
        int n2 = n & 7;
        return n2 > 5 ? null : SJ.a(n2);
    }
}

