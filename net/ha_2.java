/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from net.ha
 */
public class ha_2
extends Block {
    public static J_ S = aWq.a(U1.a);
    public static J_ P;
    public static J_ T;
    public static J_[] U;
    public static J_ R;
    public static J_ Q;

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return hw_0.b(aG3.d(iBlockAccess, blockPos), blockPos);
    }

    private boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        IBlockState iBlockState2 = iBlockState;
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            IBlockState iBlockState3;
            Object object = dz_0.b(iterator);
            J_ j_ = ha_2.a((EnumFacing)object);
            if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, j_)) || this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, (EnumFacing)object)))) || BlockStateInvoker.getBlock(iBlockState3 = aV8.q(world, amv_2.e(blockPos))) == this && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState3, j_))) continue;
            iBlockState = BlockStateInvoker.a(iBlockState, j_, Boolean.FALSE);
        }
        if (ha_2.a(iBlockState) == 0) {
            return false;
        }
        if (iBlockState2 != iBlockState) {
            aV8.a(world, blockPos, iBlockState, 2);
        }
        return true;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        if (!world.isRemote && a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) == Items.shears) {
            a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
            ha_2.a(world, blockPos, new ItemStack(Blocks.as, 1, 0));
        } else {
            super.a(world, entityPlayer, blockPos, iBlockState, tileEntity);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote && a5_0.a(world.o, 4) == 0) {
            int n = -4;
            int n2 = -4;
            int n3 = -1;
            while (true) {
                if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, n, n3, n2))) == this) {
                    void var6_13;
                    --var6_13;
                    break;
                }
                ++n3;
            }
            EnumFacing enumFacing = SJ.a(random);
            BlockPos blockPos2 = amv_2.e(blockPos);
            if (enumFacing == EnumFacing.UP && amv_2.h(blockPos) < 255 && aV8.k(world, blockPos2)) {
                IBlockState iBlockState2 = iBlockState;
                Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
                while (dz_0.c(iterator)) {
                    Object object = dz_0.b(iterator);
                    if (!a5_0.a(random) && this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos2, (EnumFacing)object))))) continue;
                    iBlockState2 = BlockStateInvoker.a(iBlockState2, ha_2.a((EnumFacing)object), Boolean.FALSE);
                }
                if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, T)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, Q)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, P)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, R))) {
                    aV8.a(world, blockPos2, iBlockState2, 2);
                }
            } else if (eh_0.b(SJ.h(enumFacing)) && !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, ha_2.a(enumFacing)))) {
                BlockPos blockPos3 = amv_2.a(blockPos, enumFacing);
                Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos3));
                if (block.o == Material.air) {
                    EnumFacing enumFacing2 = SJ.l(enumFacing);
                    EnumFacing enumFacing3 = SJ.c(enumFacing);
                    boolean bl = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, ha_2.a(enumFacing2)));
                    boolean bl2 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, ha_2.a(enumFacing3)));
                    BlockPos blockPos4 = amv_2.a(blockPos3, enumFacing2);
                    BlockPos blockPos5 = amv_2.a(blockPos3, enumFacing3);
                    if (this.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos4)))) {
                        aV8.a(world, blockPos3, BlockStateInvoker.a(this.m(), ha_2.a(enumFacing2), Boolean.TRUE), 2);
                    } else if (this.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos5)))) {
                        aV8.a(world, blockPos3, BlockStateInvoker.a(this.m(), ha_2.a(enumFacing3), Boolean.TRUE), 2);
                    } else if (aV8.k(world, blockPos4) && this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, enumFacing2))))) {
                        aV8.a(world, blockPos4, BlockStateInvoker.a(this.m(), ha_2.a(SJ.b(enumFacing)), Boolean.TRUE), 2);
                    } else if (aV8.k(world, blockPos5) && this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, enumFacing3))))) {
                        aV8.a(world, blockPos5, BlockStateInvoker.a(this.m(), ha_2.a(SJ.b(enumFacing)), Boolean.TRUE), 2);
                    } else if (this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos3))))) {
                        aV8.a(world, blockPos3, this.m(), 2);
                    }
                } else if (akm_1.g(block.o) && block.v()) {
                    aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, ha_2.a(enumFacing), Boolean.TRUE), 2);
                }
            } else if (amv_2.h(blockPos) > 1) {
                BlockPos blockPos6 = amv_2.g(blockPos);
                IBlockState iBlockState3 = aV8.q(world, blockPos6);
                Block block = BlockStateInvoker.getBlock(iBlockState3);
                if (block.o == Material.air) {
                    IBlockState iBlockState4 = iBlockState;
                    Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
                    while (dz_0.c(iterator)) {
                        Object object = dz_0.b(iterator);
                        if (!a5_0.a(random)) continue;
                        iBlockState4 = BlockStateInvoker.a(iBlockState4, ha_2.a((EnumFacing)object), Boolean.FALSE);
                    }
                    if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState4, T)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState4, Q)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState4, P)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState4, R))) {
                        aV8.a(world, blockPos6, iBlockState4, 2);
                    }
                } else if (block == this) {
                    IBlockState iBlockState5 = iBlockState3;
                    Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
                    while (dz_0.c(iterator)) {
                        Object object = dz_0.b(iterator);
                        J_ j_ = ha_2.a((EnumFacing)object);
                        if (!a5_0.a(random) || !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, j_))) continue;
                        iBlockState5 = BlockStateInvoker.a(iBlockState5, j_, Boolean.TRUE);
                    }
                    if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState5, T)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState5, Q)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState5, P)) || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState5, R))) {
                        aV8.a(world, blockPos6, iBlockState5, 2);
                    }
                }
            }
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, S, T, Q, P, R);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.a(iBlockState, S, auk_2.b(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos))).L()));
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    public static int a(IBlockState iBlockState) {
        int n = 0;
        for (J_ j_ : U) {
            if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, j_))) continue;
            ++n;
        }
        return n;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote && !this.a(world, blockPos, iBlockState)) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public int e(IBlockState iBlockState) {
        return zm_1.b();
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private boolean a(Block block) {
        return block.v() && akm_1.d(block.o);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        switch (a84.a[enumFacing.ordinal()]) {
            case 1: {
                return this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))));
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, SJ.b(enumFacing)))));
            }
        }
        return false;
    }

    @Override
    public boolean b(World world, BlockPos blockPos) {
        return true;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public int r() {
        return zm_1.b();
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, auk_2.b((n & 1) > 0)), R, auk_2.b((n & 2) > 0)), T, auk_2.b((n & 4) > 0)), Q, auk_2.b((n & 8) > 0));
    }

    public static J_ a(EnumFacing enumFacing) {
        switch (a84.a[enumFacing.ordinal()]) {
            case 1: {
                return S;
            }
            case 2: {
                return T;
            }
            case 3: {
                return P;
            }
            case 4: {
                return Q;
            }
            case 5: {
                return R;
            }
        }
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), enumFacing), U1.c).toString());
    }

    static {
        T = aWq.a(U1.f);
        Q = aWq.a(U1.d);
        P = aWq.a(U1.e);
        R = aWq.a(U1.b);
        U = new J_[]{S, T, P, R, Q};
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        float f = 1.0f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (auk_2.a((Boolean)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), R))) {
            f4 = MathInvoker.b(f4, 0.0625f);
            f = 0.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), Q))) {
            f = MathInvoker.a(f, 0.9375f);
            f4 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), T))) {
            f6 = MathInvoker.b(f6, 0.0625f);
            f3 = 0.0f;
            f = 0.0f;
            f4 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P))) {
            f3 = MathInvoker.a(f3, 0.9375f);
            f6 = 1.0f;
            f = 0.0f;
            f4 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
        }
        if (this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos))))) {
            f2 = MathInvoker.a(f2, 0.9375f);
            f5 = 1.0f;
            f = 0.0f;
            f4 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
        }
        this.a(f, f2, f3, f4, f5, f6);
    }

    public ha_2() {
        super(Material.f);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), S, Boolean.FALSE), T, Boolean.FALSE), Q, Boolean.FALSE), P, Boolean.FALSE), R, Boolean.FALSE));
        this.a(true);
        this.a(CreativeTabs.l);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public void o() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        IBlockState iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), S, Boolean.FALSE), T, Boolean.FALSE), Q, Boolean.FALSE), P, Boolean.FALSE), R, Boolean.FALSE);
        return eh_0.b(SJ.h(enumFacing)) ? BlockStateInvoker.a(iBlockState, ha_2.a(SJ.b(enumFacing)), Boolean.TRUE) : iBlockState;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 1;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
            n |= 2;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, T))) {
            n |= 4;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
            n |= 8;
        }
        return n;
    }
}

