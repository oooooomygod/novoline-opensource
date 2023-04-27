/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.block.BlockDirt;

class a6Q
extends a6r_0 {
    atF b;

    a6Q(atF atF2) {
        this.b = atF2;
    }

    @Override
    protected aRJ a(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = MapsInvoker.b((Map)BlockStateInvoker.b(iBlockState));
        String string = xu_0.a(BlockDirt.Q, (a6s_0)MapInvoker.a((Map)linkedHashMap, BlockDirt.Q));
        if (a6s_0.PODZOL != BlockStateInvoker.b(iBlockState, BlockDirt.Q)) {
            MapInvoker.a((Map)linkedHashMap, BlockDirt.P);
        }
        return new aRJ(string, this.a(linkedHashMap));
    }
}

