/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.Iterator;

import net.CreativeTabs;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.gE
 */
public class ge_1
extends Block {
    public static JC<aAP> Q = xu_0.a(aAL.c, aAP.class);
    public static J_ P = aWq.a(aAL.a);

    @Override
    protected a42 s() {
        return new a42(this, Q, P);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        IBlockState iBlockState = BlockStateInvoker.a(this.m(), P, Boolean.FALSE);
        if (ge_1.b(world, blockPos, SJ.b(enumFacing))) {
            return BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)asm_1.a(enumFacing, atn_0.D(entityLivingBase))));
        }
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (object == enumFacing || !ge_1.b(world, blockPos, SJ.b((EnumFacing)object))) continue;
            return BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)asm_1.a((EnumFacing)object, atn_0.D(entityLivingBase))));
        }
        if (aV8.a((IBlockAccess)world, amv_2.g(blockPos))) {
            return BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)asm_1.a(EnumFacing.UP, atn_0.D(entityLivingBase))));
        }
        return iBlockState;
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        for (EnumFacing enumFacing : EnumFacing.values()) {
            if (!ge_1.b(world, blockPos, enumFacing)) continue;
            return true;
        }
        return false;
    }

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 0 : (asm_1.a((aAP)((Object)BlockStateInvoker.b(iBlockState, Q))) == enumFacing ? 15 : 0);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)asm_1.a(n & 7))), P, auk_2.b((n & 8) > 0));
    }

    protected static boolean b(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return fe_0.b(world, blockPos, enumFacing);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return ge_1.b(world, blockPos, SJ.b(enumFacing));
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= asm_1.b((aAP)((Object)BlockStateInvoker.b(iBlockState, Q)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 8;
        }
        return n;
    }

    private boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.e(world, blockPos)) {
            return true;
        }
        this.a(world, blockPos, iBlockState, 0);
        aV8.j(world, blockPos);
        return false;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 15 : 0;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            aV8.c(world, blockPos, this);
            EnumFacing enumFacing = asm_1.a((aAP)((Object)BlockStateInvoker.b(iBlockState, Q)));
            aV8.c(world, amv_2.a(blockPos, SJ.b(enumFacing)), this);
        }
        super.a(world, blockPos, iBlockState);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!world.isRemote) {
            iBlockState = BlockStateInvoker.a(iBlockState, P);
            aV8.a(world, blockPos, iBlockState, 3);
            aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aAL.b, 0.3f, auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 0.6f : 0.5f);
            aV8.c(world, blockPos, this);
            EnumFacing enumFacing2 = asm_1.a((aAP)((Object)BlockStateInvoker.b(iBlockState, Q)));
            aV8.c(world, amv_2.a(blockPos, SJ.b(enumFacing2)), this);
        }
        return true;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    public static int a(EnumFacing enumFacing) {
        switch (enumFacing) {
            case DOWN: {
                return 0;
            }
            case UP: {
                return 5;
            }
            case NORTH: {
                return 4;
            }
            case SOUTH: {
                return 3;
            }
            case WEST: {
                return 2;
            }
            case EAST: {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        float f = 0.1875f;
        switch ((aAP)((Object)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), Q))) {
            case EAST: {
                this.a(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
                break;
            }
            case WEST: {
                this.a(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
                break;
            }
            case SOUTH: {
                this.a(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
                break;
            }
            case NORTH: {
                this.a(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
                break;
            }
            case UP_Z: 
            case UP_X: {
                f = 0.25f;
                this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.6f, 0.5f + f);
                break;
            }
            case DOWN_X: 
            case DOWN_Z: {
                f = 0.25f;
                this.a(0.5f - f, 0.4f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
            }
        }
    }

    protected ge_1() {
        super(Material.I);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)aAP.NORTH)), P, Boolean.FALSE));
        this.a(CreativeTabs.j);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (this.a(world, blockPos, iBlockState) && !ge_1.b(world, blockPos, SJ.b(asm_1.a((aAP)((Object)BlockStateInvoker.b(iBlockState, Q)))))) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }
}

