/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;

/*
 * Renamed from net.h4
 */
public class h4_0
extends Block {
    public static jw_0 Q = au_2.a(dv_0.a, cs_1.HORIZONTAL);
    public static JC<aR0> R;
    public static J_ P;

    @Override
    public boolean f() {
        return false;
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, P, R);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        return super.b(world, blockPos, iBlockState);
    }

    @Override
    public void o() {
        this.a(0.0f, 0.40625f, 0.0f, 1.0f, 0.59375f, 1.0f);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (this.o != Material.t) {
            iBlockState = BlockStateInvoker.a(iBlockState, P);
            aV8.a(world, blockPos, iBlockState, 2);
            aV8.a(world, entityPlayer, auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 1003 : 1006, blockPos, 0);
        }
        return true;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= h4_0.a((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 4;
        }
        if (BlockStateInvoker.b(iBlockState, R) == aR0.TOP) {
            n |= 8;
        }
        return n;
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        this.a((IBlockAccess)world, blockPos);
        return super.f(world, blockPos);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        IBlockState iBlockState = this.m();
        if (eh_0.b(SJ.h(enumFacing))) {
            iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)enumFacing)), P, Boolean.FALSE);
            iBlockState = BlockStateInvoker.a(iBlockState, R, (Comparable)((Object)(f2 > 0.5f ? aR0.TOP : aR0.BOTTOM)));
        }
        return iBlockState;
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return !auk_2.a((Boolean)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P));
    }

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return !eh_0.c(SJ.h(enumFacing)) && h4_0.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, SJ.b(enumFacing)))));
    }

    @Override
    public MovingObjectPosition a(World world, BlockPos blockPos, Vec3 vec3, Vec3 vec32) {
        this.a((IBlockAccess)world, blockPos);
        return super.a(world, blockPos, vec3, vec32);
    }

    protected h4_0(Material material) {
        super(material);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)EnumFacing.NORTH)), P, Boolean.FALSE), R, (Comparable)((Object)aR0.BOTTOM)));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.a(CreativeTabs.j);
    }

    static {
        P = aWq.a(dv_0.b);
        R = xu_0.a(dv_0.c, aR0.class);
    }

    private static boolean a(Block block) {
        return akm_1.g(block.o) && block.v() || block == Blocks.bs || block instanceof hj_2 || block instanceof hn_2;
    }

    protected static int a(EnumFacing enumFacing) {
        switch (agp_1.a[enumFacing.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
        }
        return 3;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)h4_0.a(n))), P, auk_2.b((n & 4) != 0)), R, (Comparable)((Object)((n & 8) == 0 ? aR0.BOTTOM : aR0.TOP)));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            BlockPos blockPos2 = amv_2.a(blockPos, SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q))));
            if (!h4_0.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos2)))) {
                aV8.j(world, blockPos);
                this.a(world, blockPos, iBlockState, 0);
            } else {
                boolean bl;
                boolean bl2 = aV8.B(world, blockPos);
                if (block.b() && (bl = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) != bl2) {
                    aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, auk_2.b(bl2)), 2);
                    aV8.a(world, null, 1003, blockPos, 0);
                }
            }
        }
    }

    protected static EnumFacing a(int n) {
        switch (n & 3) {
            case 0: {
                return EnumFacing.NORTH;
            }
            case 1: {
                return EnumFacing.SOUTH;
            }
            case 2: {
                return EnumFacing.WEST;
            }
        }
        return EnumFacing.EAST;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(aG3.c(iBlockAccess, blockPos));
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    public void a(IBlockState iBlockState) {
        if (BlockStateInvoker.getBlock(iBlockState) == this) {
            boolean bl = BlockStateInvoker.b(iBlockState, R) == aR0.TOP;
            Boolean bl2 = (Boolean)BlockStateInvoker.b(iBlockState, P);
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q));
            this.a(0.0f, 0.8125f, 0.0f, 1.0f, 1.0f, 1.0f);
            if (auk_2.a(bl2)) {
                if (enumFacing == EnumFacing.NORTH) {
                    this.a(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
                }
                if (enumFacing == EnumFacing.SOUTH) {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
                }
                if (enumFacing == EnumFacing.WEST) {
                    this.a(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                if (enumFacing == EnumFacing.EAST) {
                    this.a(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
                }
            }
        }
    }
}

