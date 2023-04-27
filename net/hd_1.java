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
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.hD
 */
public class hd_1
extends Block {
    public static J_ R;
    public static J_ S;
    public static jw_0 Q;
    public static J_ P;

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    private void a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        aV8.c(world, blockPos, this);
        aV8.c(world, amv_2.a(blockPos, SJ.b(enumFacing)), this);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)SJ.b(n & 3))), R, auk_2.b((n & 8) > 0)), S, auk_2.b((n & 4) > 0));
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.a(iBlockState, P, auk_2.b(!aV8.a(iBlockAccess, amv_2.g(blockPos))));
    }

    private void a(World world, BlockPos blockPos, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.1, (double)amv_2.i(blockPos) + 0.5, e8_0.e, 0.4f, 0.6f);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return eh_0.b(SJ.h(enumFacing)) && BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, SJ.b(enumFacing)))).D();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S));
        auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R));
        this.a(world, blockPos, iBlockState, true, false, -1, null);
        aV8.c(world, blockPos, this);
        aV8.c(world, amv_2.a(blockPos, SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)))), this);
        super.a(world, blockPos, iBlockState);
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl, boolean bl2, int n, IBlockState iBlockState2) {
        BlockPos blockPos2;
        Object object;
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q));
        boolean bl3 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S));
        boolean bl4 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R));
        boolean bl5 = !aV8.a((IBlockAccess)world, amv_2.g(blockPos));
        boolean bl6 = true;
        boolean bl7 = false;
        int n2 = 0;
        IBlockState[] iBlockStateArray = new IBlockState[42];
        int n3 = 1;
        while (true) {
            if (BlockStateInvoker.getBlock((IBlockState)(object = aV8.q(world, blockPos2 = amv_2.a(blockPos, enumFacing, n3)))) == Blocks.be) {
                if (BlockStateInvoker.b((IBlockState)object, Q) != SJ.b(enumFacing)) break;
                n2 = n3;
                break;
            }
            if (BlockStateInvoker.getBlock((IBlockState)object) != Blocks.b7 && n3 != n) {
                iBlockStateArray[n3] = null;
                bl6 = false;
            } else {
                if (n3 == n) {
                    object = (IBlockState)aWU.a(iBlockState2, object);
                }
                boolean bl8 = !auk_2.a((Boolean)BlockStateInvoker.b((IBlockState)object, h5_0.V));
                auk_2.a((Boolean)BlockStateInvoker.b((IBlockState)object, h5_0.Q));
                boolean bl9 = auk_2.a((Boolean)BlockStateInvoker.b((IBlockState)object, h5_0.S));
                bl6 &= bl9 == bl5;
                bl7 |= true;
                iBlockStateArray[n3] = object;
                if (n3 == n) {
                    aV8.a(world, blockPos, (Block)this, this.a(world));
                    bl6 &= bl8;
                }
            }
            ++n3;
        }
        IBlockState iBlockState3 = BlockStateInvoker.a(BlockStateInvoker.a(this.m(), S, auk_2.b(bl6)), R, auk_2.b(bl7 &= (bl6 &= false)));
        blockPos2 = amv_2.a(blockPos, enumFacing, n2);
        object = SJ.b(enumFacing);
        aV8.a(world, blockPos2, BlockStateInvoker.a(iBlockState3, Q, (Comparable)object), 3);
        this.a(world, blockPos2, (EnumFacing)object);
        this.a(world, blockPos2, bl6, bl7, bl3, bl4);
        this.a(world, blockPos, bl6, bl7, bl3, bl4);
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState3, Q, (Comparable)((Object)enumFacing)), 3);
        this.a(world, blockPos, enumFacing);
        if (bl3 != bl6) {
            boolean bl10 = true;
        }
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        IBlockState iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, Boolean.FALSE), S, Boolean.FALSE), P, Boolean.FALSE);
        if (eh_0.b(SJ.h(enumFacing))) {
            iBlockState = BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)enumFacing));
        }
        return iBlockState;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
            n |= 8;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, S))) {
            n |= 4;
        }
        return n;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        EnumFacing enumFacing;
        if (block != this && this.a(world, blockPos, iBlockState) && !BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, SJ.b(enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)))))).D()) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (!BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, (EnumFacing)object))).D()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R)) ? 0 : (BlockStateInvoker.b(iBlockState, Q) == enumFacing ? 15 : 0);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, R, S, P);
    }

    public hd_1() {
        super(Material.I);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)EnumFacing.NORTH)), R, Boolean.FALSE), S, Boolean.FALSE), P, Boolean.FALSE));
        this.a(CreativeTabs.j);
        this.a(true);
    }

    static {
        Q = au_2.a(e8_0.h, cs_1.HORIZONTAL);
        R = aWq.a(e8_0.b);
        S = aWq.a(e8_0.f);
        P = aWq.a(e8_0.c);
    }

    private boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.e(world, blockPos)) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
            return false;
        }
        return true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        this.a(world, blockPos, iBlockState, false, true, -1, null);
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R)) ? 15 : 0;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        switch (aix_1.a[((EnumFacing)((Object)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), Q))).ordinal()]) {
            case 1: {
                this.a(0.0f, 0.2f, 0.3125f, 0.375f, 0.8f, 0.6875f);
                break;
            }
            case 2: {
                this.a(0.625f, 0.2f, 0.3125f, 1.0f, 0.8f, 0.6875f);
                break;
            }
            case 3: {
                this.a(0.3125f, 0.2f, 0.0f, 0.6875f, 0.8f, 0.375f);
                break;
            }
            case 4: {
                this.a(0.3125f, 0.2f, 0.625f, 0.6875f, 0.8f, 1.0f);
            }
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        this.a(world, blockPos, iBlockState, false, false, -1, null);
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT_MIPPED;
    }
}

