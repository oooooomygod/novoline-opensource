/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import com.google.common.base.Predicate;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import deobf.ITileEntityProvider;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.gu
 */
public class gu_2
extends gr_2
implements ITileEntityProvider {
    public static JC<aeh_2> S;
    public static J_ R;

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
            n |= 8;
        }
        if (BlockStateInvoker.b(iBlockState, S) == aeh_2.SUBTRACT) {
            n |= 4;
        }
        return n;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.comparator;
    }

    private no_2 a(World world, EnumFacing enumFacing, BlockPos blockPos) {
        List list = aV8.a(world, no_2.class, new rm_2(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos), amv_2.j(blockPos) + 1, amv_2.h(blockPos) + 1, amv_2.i(blockPos) + 1), (Predicate)new IC(this, enumFacing));
        return ListInvoker.size(list) == 1 ? (no_2)ListInvoker.get(list, 0) : null;
    }

    @Override
    protected IBlockState c(IBlockState iBlockState) {
        Boolean bl = (Boolean)BlockStateInvoker.b(iBlockState, R);
        aeh_2 aeh_22 = (aeh_2)((Object)BlockStateInvoker.b(iBlockState, S));
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(Blocks.bk.m(), P, (Comparable)((Object)enumFacing)), R, bl), S, (Comparable)((Object)aeh_22));
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, int n, int n2) {
        super.a(world, blockPos, iBlockState, n, n2);
        TileEntity tileEntity = aV8.z(world, blockPos);
        return NBTInvoker.a(tileEntity, n, n2);
    }

    @Override
    protected IBlockState b(IBlockState iBlockState) {
        Boolean bl = (Boolean)BlockStateInvoker.b(iBlockState, R);
        aeh_2 aeh_22 = (aeh_2)((Object)BlockStateInvoker.b(iBlockState, S));
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(Blocks.bR.m(), P, (Comparable)((Object)enumFacing)), R, bl), S, (Comparable)((Object)aeh_22));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(n))), R, auk_2.b((n & 8) > 0)), S, (Comparable)((Object)((n & 4) > 0 ? aeh_2.SUBTRACT : aeh_2.COMPARE)));
    }

    @Override
    protected int f(IBlockState iBlockState) {
        return 2;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!aSY.g(entityPlayer.abilities)) {
            return false;
        }
        iBlockState = BlockStateInvoker.a(iBlockState, S);
        aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, acg_0.b, 0.3f, BlockStateInvoker.b(iBlockState, S) == aeh_2.SUBTRACT ? 0.55f : 0.5f);
        aV8.a(world, blockPos, iBlockState, 2);
        this.f(world, blockPos, iBlockState);
        return true;
    }

    private void f(World world, BlockPos blockPos, IBlockState iBlockState) {
        int n = this.g(world, blockPos, iBlockState);
        TileEntity tileEntity = aV8.z(world, blockPos);
        int n2 = 0;
        if (tileEntity instanceof a64) {
            a64 a642 = (a64)tileEntity;
            n2 = UD.a(a642);
            UD.a(a642, n);
        }
        if (n2 != n || BlockStateInvoker.b(iBlockState, S) == aeh_2.COMPARE) {
            boolean bl = this.g(world, blockPos, iBlockState);
            this.d(iBlockState);
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, R, Boolean.FALSE), 2);
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    protected boolean d(IBlockState iBlockState) {
        return this.Q || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R));
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a64();
    }

    @Override
    public String C() {
        return ahq_0.b(acg_0.a);
    }

    @Override
    protected a42 s() {
        return new a42(this, P, S, R);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.c(world, blockPos, iBlockState);
        aV8.b(world, blockPos, this.a(world, 0));
    }

    static {
        R = aWq.a(acg_0.c);
        S = xu_0.a(acg_0.d, aeh_2.class);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (this.Q) {
            aV8.a(world, blockPos, BlockStateInvoker.a(this.b(iBlockState), R, Boolean.TRUE), 4);
        }
        this.f(world, blockPos, iBlockState);
    }

    public gu_2(boolean bl) {
        super(bl);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)), R, Boolean.FALSE), S, (Comparable)((Object)aeh_2.COMPARE)));
        this.a = true;
    }

    @Override
    protected int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity = aG3.a(iBlockAccess, blockPos);
        return tileEntity instanceof a64 ? UD.a((a64)tileEntity) : 0;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.comparator;
    }

    @Override
    protected boolean g(World world, BlockPos blockPos, IBlockState iBlockState) {
        int n = this.f(world, blockPos, iBlockState);
        return n >= 15;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.a(world, blockPos, iBlockState);
        aV8.n(world, blockPos);
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase)))), R, Boolean.FALSE), S, (Comparable)((Object)aeh_2.COMPARE));
    }

    @Override
    protected void e(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!aV8.a(world, blockPos, this)) {
            int n;
            int n2 = this.g(world, blockPos, iBlockState);
            TileEntity tileEntity = aV8.z(world, blockPos);
            int n3 = n = tileEntity instanceof a64 ? UD.a((a64)tileEntity) : 0;
            if (n2 != n || this.d(iBlockState) != this.g(world, blockPos, iBlockState)) {
                if (this.h(world, blockPos, iBlockState)) {
                    aV8.a(world, blockPos, this, 2, -1);
                } else {
                    aV8.a(world, blockPos, this, 2, 0);
                }
            }
        }
    }

    @Override
    protected int f(World world, BlockPos blockPos, IBlockState iBlockState) {
        int n = super.f(world, blockPos, iBlockState);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
        if (block.i()) {
            n = block.a(world, blockPos2);
        } else if (n < 15 && block.D()) {
            block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos2, enumFacing)));
            if (block.i()) {
                n = block.a(world, blockPos2);
            } else if (block.w() == Material.air) {
                no_2 no_22 = this.a(world, enumFacing, blockPos2);
                n = yd_1.f(no_22);
            }
        }
        return n;
    }

    private int g(World world, BlockPos blockPos, IBlockState iBlockState) {
        return BlockStateInvoker.b(iBlockState, S) == aeh_2.SUBTRACT ? MathInvoker.max(this.f(world, blockPos, iBlockState) - this.b((IBlockAccess)world, blockPos, iBlockState), 0) : this.f(world, blockPos, iBlockState);
    }
}

