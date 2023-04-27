/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NBTInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.fS
 */
public class fs_1
extends ft_2 {
    public static jw_0 P = au_2.a(aHD.a, cs_1.HORIZONTAL);
    public int Q;

    private boolean g(World world, BlockPos blockPos) {
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) == this) {
            Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, (EnumFacing)object))) != this) continue;
                return true;
            }
        }
        return false;
    }

    public IBlockState a(World world, BlockPos blockPos, IBlockState iBlockState) {
        Object var4_4 = null;
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            IBlockState iBlockState2 = aV8.q(world, amv_2.a(blockPos, (EnumFacing)object));
            if (BlockStateInvoker.getBlock(iBlockState2) == this) {
                return iBlockState;
            }
            if (!BlockStateInvoker.getBlock(iBlockState2).z()) continue;
            var4_4 = null;
            break;
        }
        return BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)SJ.b(var4_4)));
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)atn_0.D(entityLivingBase)));
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return enumFacing == EnumFacing.UP ? this.a(iBlockAccess, blockPos, iBlockState, enumFacing) : 0;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof rs_1) {
            iz_0.a(world, blockPos, (rs_1)((Object)tileEntity));
            aV8.d(world, blockPos, this);
        }
        super.a(world, blockPos, iBlockState);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6O();
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return afy_2.a(this.d(world, blockPos));
    }

    @Override
    public boolean v() {
        return false;
    }

    protected fs_1(int n) {
        super(Material.wood);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)));
        this.Q = n;
        this.a(CreativeTabs.l);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, iBlockState);
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            BlockPos blockPos2 = amv_2.a(blockPos, (EnumFacing)object);
            IBlockState iBlockState2 = aV8.q(world, blockPos2);
            if (BlockStateInvoker.getBlock(iBlockState2) != this) continue;
            this.b(world, blockPos2, iBlockState2);
        }
    }

    public IBlockState b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            IBlockState iBlockState2 = aV8.q(world, amv_2.a(blockPos));
            IBlockState iBlockState3 = aV8.q(world, amv_2.b(blockPos));
            IBlockState iBlockState4 = aV8.q(world, amv_2.d(blockPos));
            IBlockState iBlockState5 = aV8.q(world, amv_2.f(blockPos));
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
            Block block = BlockStateInvoker.getBlock(iBlockState2);
            Block block2 = BlockStateInvoker.getBlock(iBlockState3);
            Block block3 = BlockStateInvoker.getBlock(iBlockState4);
            Block block4 = BlockStateInvoker.getBlock(iBlockState5);
            if (block != this && block2 != this) {
                boolean bl = block.z();
                boolean bl2 = block2.z();
                if (block3 == this || block4 == this) {
                    BlockPos blockPos2 = block3 == this ? amv_2.d(blockPos) : amv_2.f(blockPos);
                    IBlockState iBlockState6 = aV8.q(world, amv_2.a(blockPos2));
                    IBlockState iBlockState7 = aV8.q(world, amv_2.b(blockPos2));
                    enumFacing = EnumFacing.SOUTH;
                    EnumFacing enumFacing2 = block3 == this ? (EnumFacing)((Object)BlockStateInvoker.b(iBlockState4, P)) : (EnumFacing)((Object)BlockStateInvoker.b(iBlockState5, P));
                    if (enumFacing2 == EnumFacing.NORTH) {
                        enumFacing = EnumFacing.NORTH;
                    }
                    Block block5 = BlockStateInvoker.getBlock(iBlockState6);
                    Block block6 = BlockStateInvoker.getBlock(iBlockState7);
                    if (block5.z() && !block6.z()) {
                        enumFacing = EnumFacing.SOUTH;
                    }
                    if (block6.z() && !block5.z()) {
                        enumFacing = EnumFacing.NORTH;
                    }
                }
            } else {
                BlockPos blockPos3 = block == this ? amv_2.a(blockPos) : amv_2.b(blockPos);
                IBlockState iBlockState8 = aV8.q(world, amv_2.d(blockPos3));
                IBlockState iBlockState9 = aV8.q(world, amv_2.f(blockPos3));
                enumFacing = EnumFacing.EAST;
                EnumFacing enumFacing3 = block == this ? (EnumFacing)((Object)BlockStateInvoker.b(iBlockState2, P)) : (EnumFacing)((Object)BlockStateInvoker.b(iBlockState3, P));
                if (enumFacing3 == EnumFacing.WEST) {
                    enumFacing = EnumFacing.WEST;
                }
                Block block7 = BlockStateInvoker.getBlock(iBlockState8);
                Block block8 = BlockStateInvoker.getBlock(iBlockState9);
                if ((block3.z() || block7.z()) && !block4.z() && !block8.z()) {
                    enumFacing = EnumFacing.EAST;
                }
                if ((block4.z() || block8.z()) && !block3.z() && !block7.z()) {
                    enumFacing = EnumFacing.WEST;
                }
            }
            iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)enumFacing));
            aV8.a(world, blockPos, iBlockState, 3);
        }
        return iBlockState;
    }

    private boolean c(World world, BlockPos blockPos) {
        return this.f(world, blockPos) || this.h(world, blockPos);
    }

    @Override
    public boolean b() {
        return this.Q == 1;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        if (!this.b()) {
            return 0;
        }
        int n = 0;
        TileEntity tileEntity = aG3.a(iBlockAccess, blockPos);
        if (tileEntity instanceof a6O) {
            n = ((a6O)tileEntity).q;
        }
        return MathHelper.a(n, 0, 15);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    private boolean h(World world, BlockPos blockPos) {
        Iterator iterator = ListInvoker.iterator(aV8.a(world, nb_1.class, new rm_2(amv_2.j(blockPos), amv_2.h(blockPos) + 1, amv_2.i(blockPos), amv_2.j(blockPos) + 1, amv_2.h(blockPos) + 2, amv_2.i(blockPos) + 1)));
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            nb_1 nb_12 = (nb_1)entity;
            if (!ayq_1.b(nb_12)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity;
        EnumFacing enumFacing = SJ.b(SJ.b(MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0f / 360.0f) + 0.5) & 3));
        iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)enumFacing));
        BlockPos blockPos2 = amv_2.a(blockPos);
        BlockPos blockPos3 = amv_2.b(blockPos);
        BlockPos blockPos4 = amv_2.d(blockPos);
        BlockPos blockPos5 = amv_2.f(blockPos);
        boolean bl = this == BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
        boolean bl2 = this == BlockStateInvoker.getBlock(aV8.q(world, blockPos3));
        boolean bl3 = this == BlockStateInvoker.getBlock(aV8.q(world, blockPos4));
        boolean bl4 = this == BlockStateInvoker.getBlock(aV8.q(world, blockPos5));
        aV8.a(world, blockPos, iBlockState, 3);
        if (act_2.g(itemStack) && (tileEntity = aV8.z(world, blockPos)) instanceof a6O) {
            aM0.a((a6O)tileEntity, act_2.w(itemStack));
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        super.a(world, blockPos, iBlockState, block);
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6O) {
            NBTInvoker.i(tileEntity);
        }
    }

    @Override
    public IBlockState c(int n) {
        EnumFacing enumFacing = SJ.a(n);
        if (SJ.h(enumFacing) == kl_1.Y) {
            enumFacing = EnumFacing.NORTH;
        }
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing));
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!world.isRemote) {
            aHP aHP2 = this.d(world, blockPos);
            a6w_0.a(entityPlayer, aHP2);
            if (this.Q == 0) {
                a6w_0.a(entityPlayer, aop_1.E);
            } else if (this.Q == 1) {
                a6w_0.a(entityPlayer, aop_1.G);
            }
        }
        return true;
    }

    @Override
    public boolean i() {
        return true;
    }

    public aHP d(World world, BlockPos blockPos) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (!(tileEntity instanceof a6O)) {
            return null;
        }
        aHP aHP2 = (a6O)tileEntity;
        if (this.c(world, blockPos)) {
            return null;
        }
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            BlockPos blockPos2 = amv_2.a(blockPos, (EnumFacing)object);
            Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
            if (block != this) continue;
            if (this.c(world, blockPos2)) {
                return null;
            }
            TileEntity tileEntity2 = aV8.z(world, blockPos2);
            if (!(tileEntity2 instanceof a6O)) continue;
            if (object != EnumFacing.WEST && object != EnumFacing.NORTH) {
                aHP2 = new adq_2(aHD.c, aHP2, (a6O)tileEntity2);
                continue;
            }
            aHP2 = new adq_2(aHD.b, (a6O)tileEntity2, aHP2);
        }
        return aHP2;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos))) == this) {
            this.a(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
        } else if (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.b(blockPos))) == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
        } else if (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.d(blockPos))) == this) {
            this.a(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        } else if (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.f(blockPos))) == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
        } else {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }

    private boolean f(World world, BlockPos blockPos) {
        return BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).D();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int q() {
        return 2;
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        int n = 0;
        BlockPos blockPos2 = amv_2.d(blockPos);
        BlockPos blockPos3 = amv_2.f(blockPos);
        BlockPos blockPos4 = amv_2.a(blockPos);
        BlockPos blockPos5 = amv_2.b(blockPos);
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos2)) == this) {
            if (this.g(world, blockPos2)) {
                return false;
            }
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos3)) == this) {
            if (this.g(world, blockPos3)) {
                return false;
            }
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos4)) == this) {
            if (this.g(world, blockPos4)) {
                return false;
            }
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos5)) == this) {
            if (this.g(world, blockPos5)) {
                return false;
            }
            ++n;
        }
        return true;
    }
}

