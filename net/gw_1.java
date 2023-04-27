/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.gW
 */
public class gw_1
extends gj_1
implements ale_1 {
    public static js_0 Q = a7X.a(aF_.a, 0, 2);

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.dye;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(n))), Q, P8.d((n & 0xF) >> 2));
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, P8.d(P8.b((Integer)BlockStateInvoker.b(iBlockState, Q)) + 1)), 2);
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        return my_2.c(YZ.BROWN);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!this.a(world, blockPos, iBlockState)) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, Q));
        int n2 = 4 + n * 2;
        int n3 = 5 + n * 2;
        float f = (float)n2 / 2.0f;
        switch (akj_0.a[enumFacing.ordinal()]) {
            case 1: {
                this.a((8.0f - f) / 16.0f, (12.0f - (float)n3) / 16.0f, (15.0f - (float)n2) / 16.0f, (8.0f + f) / 16.0f, 0.75f, 0.9375f);
                break;
            }
            case 2: {
                this.a((8.0f - f) / 16.0f, (12.0f - (float)n3) / 16.0f, 0.0625f, (8.0f + f) / 16.0f, 0.75f, (1.0f + (float)n2) / 16.0f);
                break;
            }
            case 3: {
                this.a(0.0625f, (12.0f - (float)n3) / 16.0f, (8.0f - f) / 16.0f, (1.0f + (float)n2) / 16.0f, 0.75f, (8.0f + f) / 16.0f);
                break;
            }
            case 4: {
                this.a((15.0f - (float)n2) / 16.0f, (12.0f - (float)n3) / 16.0f, (8.0f - f) / 16.0f, 0.9375f, 0.75f, (8.0f + f) / 16.0f);
            }
        }
    }

    public gw_1() {
        super(Material.F);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)), Q, P8.d(0)));
        this.a(true);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return true;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, Q)) < 2;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        return n |= P8.b((Integer)BlockStateInvoker.b(iBlockState, Q)) << 2;
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        if (!eh_0.b(SJ.h(enumFacing))) {
            enumFacing = EnumFacing.NORTH;
        }
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(enumFacing))), Q, P8.d(0));
    }

    @Override
    protected a42 s() {
        return new a42(this, P, Q);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        return super.b(world, blockPos, iBlockState);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        int n;
        if (!this.a(world, blockPos, iBlockState)) {
            this.b(world, blockPos, iBlockState);
        } else if (a5_0.a(world.o, 5) == 0 && (n = P8.b((Integer)BlockStateInvoker.b(iBlockState, Q))) < 2) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, P8.d(n + 1)), 2);
        }
    }

    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        IBlockState iBlockState2 = aV8.q(world, blockPos = amv_2.a(blockPos, (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))));
        return BlockStateInvoker.getBlock(iBlockState2) == Blocks.b2 && BlockStateInvoker.b(iBlockState2, BlockPlanks.P) == F3.JUNGLE;
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        this.a((IBlockAccess)world, blockPos);
        return super.f(world, blockPos);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        int n2 = P8.b((Integer)BlockStateInvoker.b(iBlockState, Q));
        int n3 = 1;
        if (n2 >= 2) {
            n3 = 3;
        }
        int n4 = 0;
        while (true) {
            gw_1.a(world, blockPos, new ItemStack(Items.dye, 1, my_2.c(YZ.BROWN)));
            ++n4;
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        EnumFacing enumFacing = SJ.a(entityLivingBase.rotationYaw);
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)enumFacing)), 2);
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        aV8.a(world, blockPos, Blocks.air.m(), 3);
        this.a(world, blockPos, iBlockState, 0);
    }
}

