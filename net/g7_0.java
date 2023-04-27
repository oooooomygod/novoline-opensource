/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.g7
 */
public class g7_0
extends Block {
    public static JC<xq_1> R;
    public static J_ P;
    public static J_ Q;
    public static JC<az_0> S;
    public static jw_0 T;

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return g7_0.e(g7_0.a(iBlockAccess, blockPos));
    }

    public static EnumFacing a(int n) {
        return SJ.c(SJ.b(n & 3));
    }

    protected static boolean d(int n) {
        return (n & 0x10) != 0;
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return amv_2.h(blockPos) < 255 && aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && super.e(world, blockPos) && super.e(world, amv_2.e(blockPos));
    }

    private void b(int n) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        EnumFacing enumFacing = g7_0.a(n);
        g7_0.e(n);
        g7_0.d(n);
        if (enumFacing == EnumFacing.EAST) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
        } else if (enumFacing == EnumFacing.SOUTH) {
            this.a(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (enumFacing == EnumFacing.WEST) {
            this.a(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
        } else if (enumFacing == EnumFacing.NORTH) {
            this.a(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
        }
    }

    private Item a() {
        return this == Blocks.bb ? Items.iron_door : (this == Blocks.o ? Items.spruce_door : (this == Blocks.aC ? Items.birch_door : (this == Blocks.ax ? Items.jungle_door : (this == Blocks.aV ? Items.acacia_door : (this == Blocks.az ? Items.dark_oak_door : Items.oak_door)))));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return BlockStateInvoker.b(iBlockState, R) == xq_1.UPPER ? null : this.a();
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    public void a(World world, BlockPos blockPos, boolean bl) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == this) {
            IBlockState iBlockState2;
            BlockPos blockPos2 = BlockStateInvoker.b(iBlockState, R) == xq_1.LOWER ? blockPos : amv_2.g(blockPos);
            IBlockState iBlockState3 = iBlockState2 = blockPos == blockPos2 ? iBlockState : aV8.q(world, blockPos2);
            if (BlockStateInvoker.getBlock(iBlockState2) == this && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, P)) != bl) {
                aV8.a(world, blockPos2, BlockStateInvoker.a(iBlockState2, P, auk_2.b(bl)), 2);
                aV8.a(world, blockPos2, blockPos);
                aV8.a(world, null, 1003, blockPos, 0);
            }
        }
    }

    protected static boolean c(int n) {
        return (n & 8) != 0;
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        this.a((IBlockAccess)world, blockPos);
        return super.f(world, blockPos);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        IBlockState iBlockState2;
        if (this.o == Material.t) {
            return true;
        }
        BlockPos blockPos2 = BlockStateInvoker.b(iBlockState, R) == xq_1.LOWER ? blockPos : amv_2.g(blockPos);
        IBlockState iBlockState3 = iBlockState2 = blockPos.equals(blockPos2) ? iBlockState : aV8.q(world, blockPos2);
        if (BlockStateInvoker.getBlock(iBlockState2) != this) {
            return false;
        }
        iBlockState = BlockStateInvoker.a(iBlockState2, P);
        aV8.a(world, blockPos2, iBlockState, 2);
        aV8.a(world, blockPos2, blockPos);
        aV8.a(world, entityPlayer, auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 1003 : 1006, blockPos, 0);
        return true;
    }

    @Override
    public String C() {
        return ahq_0.b(StringInvoker.a(aL0.a(aL0.a(new StringBuilder(), this.J()), DP.f).toString(), DP.d, DP.g));
    }

    static {
        T = au_2.a(DP.a, cs_1.HORIZONTAL);
        P = aWq.a(DP.e);
        S = xu_0.a(DP.h, az_0.class);
        Q = aWq.a(DP.b);
        R = xu_0.a(DP.c, xq_1.class);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (BlockStateInvoker.b(iBlockState, R) == xq_1.UPPER) {
            BlockPos blockPos2 = amv_2.g(blockPos);
            IBlockState iBlockState2 = aV8.q(world, blockPos2);
            if (BlockStateInvoker.getBlock(iBlockState2) != this) {
                aV8.j(world, blockPos);
            } else if (block != this) {
                this.a(world, blockPos2, iBlockState2, block);
            }
        } else {
            boolean bl = false;
            BlockPos blockPos3 = amv_2.e(blockPos);
            IBlockState iBlockState3 = aV8.q(world, blockPos3);
            if (BlockStateInvoker.getBlock(iBlockState3) != this) {
                aV8.j(world, blockPos);
                bl = true;
            }
            if (!aV8.a((IBlockAccess)world, amv_2.g(blockPos))) {
                aV8.j(world, blockPos);
                bl = true;
                if (BlockStateInvoker.getBlock(iBlockState3) == this) {
                    aV8.j(world, blockPos3);
                }
            }
            if (!world.isRemote) {
                this.a(world, blockPos, iBlockState, 0);
            }
        }
    }

    @Override
    public IBlockState c(int n) {
        return (n & 8) > 0 ? BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)xq_1.UPPER)), S, (Comparable)((Object)((n & 1) > 0 ? az_0.RIGHT : az_0.LEFT))), Q, auk_2.b((n & 2) > 0)) : BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)xq_1.LOWER)), T, (Comparable)((Object)SJ.c(SJ.b(n & 3)))), P, auk_2.b((n & 4) > 0));
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        if (BlockStateInvoker.b(iBlockState, R) == xq_1.UPPER) {
            n |= 8;
            if (BlockStateInvoker.b(iBlockState, S) == az_0.RIGHT) {
                n |= 1;
            }
            if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
                n |= 2;
            }
        } else {
            n |= SJ.j(SJ.l((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, T))));
            if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
                n |= 4;
            }
        }
        return n;
    }

    public static EnumFacing c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return g7_0.a(g7_0.a(iBlockAccess, blockPos));
    }

    @Override
    public int F() {
        return 1;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (BlockStateInvoker.b(iBlockState, R) == xq_1.LOWER) {
            IBlockState iBlockState2 = aG3.c(iBlockAccess, amv_2.e(blockPos));
            if (BlockStateInvoker.getBlock(iBlockState2) == this) {
                iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, S, BlockStateInvoker.b(iBlockState2, S)), Q, BlockStateInvoker.b(iBlockState2, Q));
            }
        } else {
            IBlockState iBlockState3 = aG3.c(iBlockAccess, amv_2.g(blockPos));
            if (BlockStateInvoker.getBlock(iBlockState3) == this) {
                iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, T, BlockStateInvoker.b(iBlockState3, T)), P, BlockStateInvoker.b(iBlockState3, P));
            }
        }
        return iBlockState;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return this.a();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        BlockPos blockPos2 = amv_2.g(blockPos);
        if (aSY.a(entityPlayer.abilities) && BlockStateInvoker.b(iBlockState, R) == xq_1.UPPER && BlockStateInvoker.getBlock(aV8.q(world, blockPos2)) == this) {
            aV8.j(world, blockPos2);
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.b(g7_0.a(iBlockAccess, blockPos));
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public MovingObjectPosition a(World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        this.a((IBlockAccess)world, blockPos);
        return super.a(world, blockPos, vec3, vec32);
    }

    protected g7_0(Material material) {
        super(material);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), T, (Comparable)((Object)EnumFacing.NORTH)), P, Boolean.FALSE), S, (Comparable)((Object)az_0.LEFT)), Q, Boolean.FALSE), R, (Comparable)((Object)xq_1.LOWER)));
    }

    protected static boolean e(int n) {
        return (n & 4) != 0;
    }

    @Override
    protected a42 s() {
        return new a42(this, R, T, P, S, Q);
    }

    public static boolean b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return g7_0.e(g7_0.a(iBlockAccess, blockPos));
    }

    public static int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        int n;
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        int n2 = BlockStateInvoker.getBlock(iBlockState).d(iBlockState);
        g7_0.c(n2);
        IBlockState iBlockState2 = aG3.c(iBlockAccess, amv_2.g(blockPos));
        int n3 = n = BlockStateInvoker.getBlock(iBlockState2).d(iBlockState2);
        IBlockState iBlockState3 = aG3.c(iBlockAccess, amv_2.e(blockPos));
        BlockStateInvoker.getBlock(iBlockState3).d(iBlockState3);
        int n4 = n2;
        boolean bl = (n4 & 1) != 0;
        boolean bl2 = (n4 & 2) != 0;
        return g7_0.f(n3) | 8 | 0x10 | 0x20;
    }

    protected static int f(int n) {
        return n & 7;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        return super.b(world, blockPos, iBlockState);
    }
}

