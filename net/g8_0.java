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
import java.util.Random;

/*
 * Renamed from net.g8
 */
public class g8_0
extends Block {
    public static JC<a04> P;
    public static J_ Q;
    public static jw_0 R;

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(aG3.c(iBlockAccess, blockPos));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a(iBlockState);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.b(iBlockState);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    static {
        R = au_2.a(asp_1.c);
        P = xu_0.a(asp_1.a, a04.class);
        Q = aWq.a(asp_1.b);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return BlockStateInvoker.b(aV8.q(world, blockPos), P) == a04.STICKY ? px_0.a(Blocks.E) : px_0.a(Blocks.bB);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
        BlockPos blockPos2 = amv_2.a(blockPos, SJ.b(enumFacing));
        IBlockState iBlockState2 = aV8.q(world, blockPos2);
        if (BlockStateInvoker.getBlock(iBlockState2) != Blocks.bB && BlockStateInvoker.getBlock(iBlockState2) != Blocks.E) {
            aV8.j(world, blockPos);
        } else {
            BlockStateInvoker.getBlock(iBlockState2).a(world, blockPos2, iBlockState2, block);
        }
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.a(world, blockPos, iBlockState);
        EnumFacing enumFacing = SJ.b((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R)));
        blockPos = amv_2.a(blockPos, enumFacing);
        IBlockState iBlockState2 = aV8.q(world, blockPos);
        if ((BlockStateInvoker.getBlock(iBlockState2) == Blocks.bB || BlockStateInvoker.getBlock(iBlockState2) == Blocks.E) && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, gi_2.P))) {
            BlockStateInvoker.getBlock(iBlockState2).a(world, blockPos, iBlockState2, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        EnumFacing enumFacing;
        BlockPos blockPos2;
        Block block;
        if (aSY.a(entityPlayer.abilities) && ((block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos, SJ.b(enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R))))))) == Blocks.bB || block == Blocks.E)) {
            aV8.j(world, blockPos2);
        }
        super.a(world, blockPos, iBlockState, entityPlayer);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), R, (Comparable)((Object)g8_0.a(n))), P, (Comparable)((Object)((n & 8) > 0 ? a04.STICKY : a04.DEFAULT)));
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return false;
    }

    public void a(IBlockState iBlockState) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R));
        switch (aub_2.a[enumFacing.ordinal()]) {
            case 1: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
                break;
            }
            case 2: {
                this.a(0.0f, 0.75f, 0.0f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 3: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.25f);
                break;
            }
            case 4: {
                this.a(0.0f, 0.0f, 0.75f, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 5: {
                this.a(0.0f, 0.0f, 0.0f, 0.25f, 1.0f, 1.0f);
                break;
            }
            case 6: {
                this.a(0.75f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return false;
    }

    public static EnumFacing a(int n) {
        int n2 = n & 7;
        return n2 > 5 ? null : SJ.a(n2);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R)));
        if (BlockStateInvoker.b(iBlockState, P) == a04.STICKY) {
            n |= 8;
        }
        return n;
    }

    public g8_0() {
        super(Material.d);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, (Comparable)((Object)EnumFacing.NORTH)), P, (Comparable)((Object)a04.DEFAULT)), Q, Boolean.FALSE));
        this.a(h);
        this.setHardness(0.5f);
    }

    @Override
    protected a42 s() {
        return new a42(this, R, P, Q);
    }

    private void b(IBlockState iBlockState) {
        switch (aub_2.a[((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, R))).ordinal()]) {
            case 1: {
                this.a(0.375f, 0.25f, 0.375f, 0.625f, 1.0f, 0.625f);
                break;
            }
            case 2: {
                this.a(0.375f, 0.0f, 0.375f, 0.625f, 0.75f, 0.625f);
                break;
            }
            case 3: {
                this.a(0.25f, 0.375f, 0.25f, 0.75f, 0.625f, 1.0f);
                break;
            }
            case 4: {
                this.a(0.25f, 0.375f, 0.0f, 0.75f, 0.625f, 0.75f);
                break;
            }
            case 5: {
                this.a(0.375f, 0.25f, 0.25f, 0.625f, 0.75f, 1.0f);
                break;
            }
            case 6: {
                this.a(0.0f, 0.375f, 0.25f, 0.75f, 0.625f, 0.75f);
            }
        }
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }
}

