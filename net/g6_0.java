/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import com.google.common.base.Predicate;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.g6
 */
public class g6_0
extends ft_2 {
    private ov_0 R;
    public static J_ T;
    private ov_0 P;
    public static jw_0 Q;
    private static Predicate<auo_0> S;

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        return tileEntity instanceof a6t_0 ? gk_0.c((a6t_0)tileEntity) : super.g(world, blockPos);
    }

    private static boolean lambda$static$0(auo_0 auo_02) {
        return at_0.a(auo_02) != null && BlockStateInvoker.getBlock(at_0.a(auo_02)) == Blocks.ck && at_0.b(auo_02) instanceof a6t_0 && gk_0.c((a6t_0)at_0.b(auo_02)) == 1;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        return super.b(world, blockPos, iBlockState);
    }

    @Override
    public String C() {
        return ahq_0.b(a5Q.g);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
    }

    protected g6_0() {
        super(Material.I);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object) EnumFacing.NORTH)), T, Boolean.FALSE));
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }

    static {
        Q = au_2.a(a5Q.a);
        T = aWq.a(a5Q.h);
        S = g6_0::lambda$static$0;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.skull;
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6t_0();
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, T))) {
            n |= 8;
        }
        return n;
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)atn_0.D(entityLivingBase))), T, Boolean.FALSE);
    }

    public boolean a(World world, BlockPos blockPos, ItemStack itemStack) {
        return act_2.c(itemStack) == 1 && amv_2.h(blockPos) >= 2 && aV8.p(world) != EnumDifficulty.PEACEFUL && !world.isRemote && av_2.a(this.a(), world, blockPos) != null;
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, T);
    }

    public void a(World world, BlockPos blockPos, a6t_0 a6t_02) {
        if (gk_0.c(a6t_02) == 1 && amv_2.h(blockPos) >= 2 && aV8.p(world) != EnumDifficulty.PEACEFUL && !world.isRemote) {
            ov_0 ov_02 = this.b();
            x__0 x__02 = av_2.a(ov_02, world, blockPos);
            int n = 0;
            while (true) {
                auo_0 auo_02 = a2n_0.a(x__02, n, 0, 0);
                aV8.a(world, at_0.c(auo_02), BlockStateInvoker.a(at_0.a(auo_02), T, Boolean.TRUE), 2);
                ++n;
            }
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    protected ov_0 b() {
        if (this.R == null) {
            this.R = gb_0.a(gb_0.a(gb_0.a(gb_0.a(gb_0.a(gb_0.a(), new String[]{a5Q.f, a5Q.d, a5Q.e}), '#', at_0.a(E6.a(Blocks.s))), '^', S), '~', at_0.a(E6.a(Blocks.air))));
        }
        return this.R;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        if (aSY.a(entityPlayer.abilities)) {
            iBlockState = BlockStateInvoker.a(iBlockState, T, Boolean.TRUE);
            aV8.a(world, blockPos, iBlockState, 4);
        }
        super.a(world, blockPos, iBlockState, entityPlayer);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)SJ.a(n & 7))), T, auk_2.b((n & 8) > 0));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.skull;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            TileEntity tileEntity;
            if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, T)) && (tileEntity = aV8.z(world, blockPos)) instanceof a6t_0) {
                a6t_0 a6t_02 = (a6t_0)tileEntity;
                ItemStack itemStack = new ItemStack(Items.skull, 1, this.g(world, blockPos));
                if (gk_0.c(a6t_02) == 3 && gk_0.a(a6t_02) != null) {
                    act_2.b(itemStack, new NBTTagCompound());
                    NBTTagCompound nBTTagCompound = new NBTTagCompound();
                    S1.a(nBTTagCompound, gk_0.a(a6t_02));
                    tn_0.a(act_2.a(itemStack), a5Q.c, (NBTBase)nBTTagCompound);
                }
                g6_0.a(world, blockPos, itemStack);
            }
            super.a(world, blockPos, iBlockState);
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        switch (AN.a[((EnumFacing)((Object)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), Q))).ordinal()]) {
            default: {
                this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                break;
            }
            case 2: {
                this.a(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                break;
            }
            case 3: {
                this.a(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                break;
            }
            case 4: {
                this.a(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                break;
            }
            case 5: {
                this.a(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
            }
        }
    }

    protected ov_0 a() {
        if (this.P == null) {
            this.P = gb_0.a(gb_0.a(gb_0.a(gb_0.a(gb_0.a(), new String[]{a5Q.i, a5Q.b, a5Q.j}), '#', at_0.a(E6.a(Blocks.s))), '~', at_0.a(E6.a(Blocks.air))));
        }
        return this.P;
    }
}

