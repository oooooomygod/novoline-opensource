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
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.fL
 */
public class fl_1
extends fc_2
implements ale_1 {
    public static JC<EnumFacing> P;
    public static JC<avb_1> R;
    public static JC<aPM> Q;

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        fl_1.a(world, blockPos, new ItemStack(this, 1, ayv_0.a(this.a((IBlockAccess)world, blockPos))));
    }

    public fl_1() {
        super(Material.f);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)aPM.SUNFLOWER)), R, (Comparable)((Object)avb_1.LOWER)), P, (Comparable)((Object)EnumFacing.NORTH)));
        this.setHardness(0.0f);
        this.a(x);
        this.b(ua_0.b);
    }

    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        if (world.isRemote || a6w_0.n(entityPlayer) == null || act_2.k(a6w_0.n(entityPlayer)) != Items.shears || BlockStateInvoker.b(iBlockState, R) != avb_1.LOWER || !this.a(world, blockPos, iBlockState, entityPlayer)) {
            super.a(world, entityPlayer, blockPos, iBlockState, tileEntity);
        }
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        return ayv_0.a(this.a((IBlockAccess)world, blockPos));
    }

    public void a(World world, BlockPos blockPos, aPM aPM2, int n) {
        aV8.a(world, blockPos, BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)avb_1.LOWER)), Q, (Comparable)((Object)aPM2)), n);
        aV8.a(world, amv_2.e(blockPos), BlockStateInvoker.a(this.m(), R, (Comparable)((Object)avb_1.UPPER)), n);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (BlockStateInvoker.b(iBlockState, R) == avb_1.UPPER) {
            return BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))) == this;
        }
        IBlockState iBlockState2 = aV8.q(world, amv_2.e(blockPos));
        return BlockStateInvoker.getBlock(iBlockState2) == this && super.a(world, blockPos, iBlockState2);
    }

    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return true;
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return super.e(world, blockPos) && aV8.k(world, amv_2.e(blockPos));
    }

    static {
        Q = xu_0.a(ua_0.a, aPM.class);
        R = xu_0.a(ua_0.c, avb_1.class);
        P = gj_1.P;
    }

    public aPM a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == this) {
            iBlockState = this.a(iBlockState, iBlockAccess, blockPos);
            return (aPM)((Object)BlockStateInvoker.b(iBlockState, Q));
        }
        return aPM.FERN;
    }

    @Override
    protected a42 s() {
        return new a42(this, R, Q, P);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        if (BlockStateInvoker.b(iBlockState, R) == avb_1.UPPER) {
            return null;
        }
        aPM aPM2 = (aPM)((Object)BlockStateInvoker.b(iBlockState, Q));
        return aPM2 == aPM.FERN ? null : (aPM2 == aPM.GRASS ? (a5_0.a(random, 8) == 0 ? Items.wheat_seeds : null) : px_0.a(this));
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        aV8.a(world, amv_2.e(blockPos), BlockStateInvoker.a(this.m(), R, (Comparable)((Object)avb_1.UPPER)), 2);
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        aPM aPM2 = this.a(iBlockAccess, blockPos);
        return aPM2 != aPM.GRASS && aPM2 != aPM.FERN ? 0xFFFFFF : aY1.c(iBlockAccess, blockPos);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return BlockStateInvoker.b(iBlockState, R) == avb_1.UPPER ? 8 | SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))) : ayv_0.a((aPM)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public boolean b(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) != this) {
            return true;
        }
        aPM aPM2 = (aPM)((Object)BlockStateInvoker.b(this.a(iBlockState, (IBlockAccess)world, blockPos), Q));
        return aPM2 == aPM.FERN || aPM2 == aPM.GRASS;
    }

    @Override
    public IBlockState c(int n) {
        return (n & 8) > 0 ? BlockStateInvoker.a(this.m(), R, (Comparable)((Object)avb_1.UPPER)) : BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)avb_1.LOWER)), Q, (Comparable)((Object)ayv_0.a(n & 7)));
    }

    private boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        aPM aPM2 = (aPM)((Object)BlockStateInvoker.b(iBlockState, Q));
        if (aPM2 != aPM.FERN && aPM2 != aPM.GRASS) {
            return false;
        }
        a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
        int n = aW5.a(aPM2 == aPM.GRASS ? a4b.GRASS : a4b.FERN);
        fl_1.a(world, blockPos, new ItemStack(Blocks.bN, 2, n));
        return true;
    }

    @Override
    public qn_2 O() {
        return qn_2.XZ;
    }

    @Override
    public int h(IBlockState iBlockState) {
        return BlockStateInvoker.b(iBlockState, R) != avb_1.UPPER && BlockStateInvoker.b(iBlockState, Q) != aPM.GRASS ? ayv_0.a((aPM)((Object)BlockStateInvoker.b(iBlockState, Q))) : 0;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (aPM aPM2 : aPM.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, ayv_0.a(aPM2)));
        }
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState2;
        if (BlockStateInvoker.b(iBlockState, R) == avb_1.UPPER && BlockStateInvoker.getBlock(iBlockState2 = aG3.c(iBlockAccess, amv_2.g(blockPos))) == this) {
            iBlockState = BlockStateInvoker.a(iBlockState, Q, BlockStateInvoker.b(iBlockState2, Q));
        }
        return iBlockState;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        aPM aPM2 = this.a((IBlockAccess)world, blockPos);
        return aPM2 != aPM.GRASS && aPM2 != aPM.FERN;
    }

    @Override
    protected void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.a(world, blockPos, iBlockState)) {
            boolean bl = BlockStateInvoker.b(iBlockState, R) == avb_1.UPPER;
            BlockPos blockPos2 = blockPos;
            BlockPos blockPos3 = amv_2.g(blockPos);
            fl_1 fl_12 = this;
            Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos3));
            if (fl_12 == this) {
                aV8.a(world, blockPos2, Blocks.air.m(), 2);
            }
            if (block == this) {
                aV8.a(world, blockPos3, Blocks.air.m(), 3);
                this.a(world, blockPos3, iBlockState, 0);
            }
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        if (BlockStateInvoker.b(iBlockState, R) == avb_1.UPPER) {
            if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))) == this) {
                if (!aSY.a(entityPlayer.abilities)) {
                    IBlockState iBlockState2 = aV8.q(world, amv_2.g(blockPos));
                    aPM aPM2 = (aPM)((Object)BlockStateInvoker.b(iBlockState2, Q));
                    if (aPM2 != aPM.FERN && aPM2 != aPM.GRASS) {
                        aV8.b(world, amv_2.g(blockPos), true);
                    } else if (!world.isRemote) {
                        if (a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) == Items.shears) {
                            this.a(world, blockPos, iBlockState2, entityPlayer);
                            aV8.j(world, amv_2.g(blockPos));
                        } else {
                            aV8.b(world, amv_2.g(blockPos), true);
                        }
                    } else {
                        aV8.j(world, amv_2.g(blockPos));
                    }
                } else {
                    aV8.j(world, amv_2.g(blockPos));
                }
            }
        } else if (aSY.a(entityPlayer.abilities) && BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))) == this) {
            aV8.a(world, amv_2.e(blockPos), Blocks.air.m(), 2);
        }
        super.a(world, blockPos, iBlockState, entityPlayer);
    }
}

