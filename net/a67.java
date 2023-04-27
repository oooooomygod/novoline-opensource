/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.LinkedHashMap;
import java.util.Map;

import deobf.EnumFacing;
import net.minecraft.block.Block;

class a67
extends a6r_0 {
    atF b;

    a67(atF atF2) {
        this.b = atF2;
    }

    @Override
    protected aRJ a(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = MapsInvoker.b((Map)BlockStateInvoker.b(iBlockState));
        if (BlockStateInvoker.b(iBlockState, fh_1.R) != EnumFacing.UP) {
            MapInvoker.a((Map)linkedHashMap, fh_1.P);
        }
        return new aRJ((ResourceLocation)a82.b(Block.m, BlockStateInvoker.getBlock(iBlockState)), this.a(linkedHashMap));
    }
}

