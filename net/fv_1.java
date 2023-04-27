/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.fV
 */
public class fv_1
extends fv_2 {
    public static J_ P = aWq.a(azl_1.a);
    private afs_1 Q;

    @Override
    protected IBlockState a(IBlockState iBlockState, int n) {
        return BlockStateInvoker.a(iBlockState, P, auk_2.b(true));
    }

    protected fv_1(Material material, afs_1 afs_12) {
        super(material);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, Boolean.FALSE));
        this.Q = afs_12;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, auk_2.b(n == 1));
    }

    @Override
    protected int b(World world, BlockPos blockPos) {
        List list;
        rm_2 rm_22 = this.a(blockPos);
        switch (this.Q) {
            case EVERYTHING: {
                list = aV8.a(world, null, rm_22);
                break;
            }
            case MOBS: {
                list = aV8.a(world, EntityLivingBase.class, rm_22);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!ListInvoker.isEmpty(list)) {
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                if (ayj_0.s(entity)) continue;
                return 15;
            }
        }
        return 0;
    }

    @Override
    protected int b(IBlockState iBlockState) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 15 : 0;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 1 : 0;
    }
}

