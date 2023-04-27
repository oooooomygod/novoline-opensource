/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;

/*
 * Renamed from net.a6n
 */
public class a6n_0
extends a6r_0 {
    private a4_0<?> d;
    private String b;
    private List<a4_0<?>> c;

    @Override
    protected aRJ a(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = MapsInvoker.b((Map)BlockStateInvoker.b(iBlockState));
        String string = this.d == null ? ((ResourceLocation)a82.b(Block.m, BlockStateInvoker.getBlock(iBlockState))).toString() : aPS.a(this.d, (Comparable)MapInvoker.a((Map)linkedHashMap, this.d));
        if (this.b != null) {
            string = aL0.a(aL0.a(new StringBuilder(), string), this.b).toString();
        }
        Iterator iterator = ListInvoker.iterator(this.c);
        while (dz_0.c(iterator)) {
            a4_0 a4_02 = (a4_0)dz_0.b(iterator);
            MapInvoker.a((Map)linkedHashMap, a4_02);
        }
        return new aRJ(string, this.a(linkedHashMap));
    }

    private a6n_0(a4_0<?> a4_02, String string, List<a4_0<?>> list) {
        this.d = a4_02;
        this.b = string;
        this.c = list;
    }

    a6n_0(a4_0 a4_02, String string, List list, ko_1 ko_12) {
        this(a4_02, string, list);
    }
}

