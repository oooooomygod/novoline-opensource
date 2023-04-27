/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

class a7O
extends Slot {
    BlockPos f;
    aam_1 h;
    World g;

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return (aSY.a(entityPlayer.abilities) || entityPlayer.bL >= this.h.q) && this.h.q > 0 && this.d();
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return false;
    }

    a7O(aam_1 aam_12, rs_1 rs_12, int n, int n2, int n3, World world, BlockPos blockPos) {
        this.h = aam_12;
        this.g = world;
        this.f = blockPos;
        super(rs_12, n, n2, n3);
    }

    @Override
    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        Object object;
        if (!aSY.a(entityPlayer.abilities)) {
            a6w_0.a(entityPlayer, -this.h.q);
        }
        apw_0.a(aam_1.b(this.h), 0, null);
        if (aam_1.a(this.h) > 0) {
            object = apw_0.b(aam_1.b(this.h), 1);
            if (((ItemStack)object).a > aam_1.a(this.h)) {
                ((ItemStack)object).a -= aam_1.a(this.h);
                apw_0.a(aam_1.b(this.h), 1, (ItemStack)object);
            } else {
                apw_0.a(aam_1.b(this.h), 1, null);
            }
        } else {
            apw_0.a(aam_1.b(this.h), 1, null);
        }
        this.h.q = 0;
        object = aV8.q(this.g, this.f);
        if (!aSY.a(entityPlayer.abilities) && !this.g.isRemote && BlockStateInvoker.getBlock((IBlockState)object) == Blocks.J && a5_0.e(a6w_0.H(entityPlayer)) < 0.12f) {
            int n = P8.b((Integer)BlockStateInvoker.b((IBlockState)object, gc_2.R));
            if (++n > 2) {
                aV8.j(this.g, this.f);
                aV8.c(this.g, 1020, this.f, 0);
            } else {
                aV8.a(this.g, this.f, BlockStateInvoker.a((IBlockState)object, gc_2.R, P8.d(n)), 2);
                aV8.c(this.g, 1021, this.f, 0);
            }
        } else if (!this.g.isRemote) {
            aV8.c(this.g, 1021, this.f, 0);
        }
    }
}

