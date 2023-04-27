/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityLivingBase;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.gb
 */
public class gb_1
extends gk_1 {
    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        kl_1 kl_12 = (kl_1)((Object)BlockStateInvoker.b(iBlockState, P));
        if (kl_12 == kl_1.X) {
            n |= 4;
        } else if (kl_12 == kl_1.Z) {
            n |= 8;
        }
        return n;
    }

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        return new ItemStack(px_0.a(this), 1, 0);
    }

    @Override
    public IBlockState c(int n) {
        kl_1 kl_12 = kl_1.Y;
        int n2 = n & 0xC;
        if (n2 == 4) {
            kl_12 = kl_1.X;
        } else if (n2 == 8) {
            kl_12 = kl_1.Z;
        }
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)kl_12));
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(super.a(world, blockPos, enumFacing, f, f2, f3, n, entityLivingBase), P, (Comparable)((Object)SJ.h(enumFacing)));
    }

    public gb_1() {
        super(Material.grass, MapColor.c);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)kl_1.Y)));
        this.a(CreativeTabs.m);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }
}

