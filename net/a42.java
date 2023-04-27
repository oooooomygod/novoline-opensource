/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableList
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;

public class a42 {
    private static Joiner a = aSB.a(kt_0.c);
    private ImmutableList<a4_0> c;
    private static Function<a4_0, String> d = new aHG();
    private Block e;
    private ImmutableList<IBlockState> b;

    public Block d() {
        return this.e;
    }

    public ImmutableList<IBlockState> a() {
        return this.b;
    }

    public IBlockState c() {
        return (IBlockState)a7c_0.a(this.b, 0);
    }

    public Collection<a4_0> b() {
        return this.c;
    }

    private List<Iterable<Comparable>> e() {
        ArrayList arrayList = my_0.c();
        for (int i = 0; i < a7c_0.b(this.c); ++i) {
            ListInvoker.add(arrayList, aPS.b((a4_0)a7c_0.a(this.c, i)));
        }
        return arrayList;
    }

    public a42(Block block, a4_0 ... a4_0Array) {
        Object object;
        this.e = block;
        a7r_0.a((Object[])a4_0Array, new aU5(this));
        this.c = a7c_0.a(a4_0Array);
        LinkedHashMap linkedHashMap = MapsInvoker.c();
        ArrayList arrayList = my_0.c();
        Iterator iterator = OV.a(kk_0.a(this.e()));
        while (dz_0.c(iterator)) {
            object = (List)dz_0.b(iterator);
            Map map = D8.a(this.c, (Iterable)object);
            aFo aFo2 = new aFo(block, da_1.a(map), null);
            MapInvoker.c(linkedHashMap, map, aFo2);
            ListInvoker.add(arrayList, aFo2);
        }
        iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            object = (aFo)dz_0.b(iterator);
            ((aFo)object).a(linkedHashMap);
        }
        this.b = a7c_0.a(arrayList);
    }

    public String toString() {
        return mg_2.a(mg_2.a(aWU.a(this), kt_0.b, a82.b(Block.m, this.e)), kt_0.a, DZ.a(this.c, d)).toString();
    }
}

