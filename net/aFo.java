/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableTable
 *  com.google.common.collect.Table
 *  com.google.common.collect.UnmodifiableIterator
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.Block;

class aFo
extends afn_0 {
    private ImmutableTable<a4_0, Comparable, IBlockState> j;
    private ImmutableMap<a4_0, Comparable> h;
    private Block i;

    private Map<a4_0, Comparable> a(a4_0 a4_02, Comparable comparable) {
        HashMap hashMap = MapsInvoker.a(this.h);
        MapInvoker.c(hashMap, a4_02, comparable);
        return hashMap;
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public Collection<a4_0> a() {
        return asg_0.a((Collection)da_1.c(this.h));
    }

    @Override
    public ImmutableMap<a4_0, Comparable> c() {
        return this.h;
    }

    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public <T extends Comparable<T>> T a(a4_0<T> a4_02) {
        if (!da_1.a(this.h, a4_02)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), FZ.d), a4_02), FZ.a), BlocksInvoker.E(this.i)).toString());
        }
        return (T)((Comparable)ara_2.a(aPS.c(a4_02), da_1.b(this.h, a4_02)));
    }

    public void a(Map<Map<a4_0, Comparable>, aFo> map) {
        if (this.j != null) {
            throw new IllegalStateException();
        }
        HashBasedTable hashBasedTable = ss_2.a();
        UnmodifiableIterator unmodifiableIterator = MV.a(da_1.c(this.h));
        while (dz_0.c((Iterator)unmodifiableIterator)) {
            a4_0 a4_02 = (a4_0)dz_0.b((Iterator)unmodifiableIterator);
            Iterator iterator = ms_0.a(aPS.b(a4_02));
            while (dz_0.c(iterator)) {
                Comparable comparable = (Comparable)dz_0.b(iterator);
                if (comparable == da_1.b(this.h, a4_02)) continue;
                aB8.a((Table)hashBasedTable, a4_02, comparable, MapInvoker.c(map, this.a(a4_02, comparable)));
            }
        }
        this.j = abe_0.a((Table)hashBasedTable);
    }

    aFo(Block block, ImmutableMap immutableMap, aHG aHG2) {
        this(block, (ImmutableMap<a4_0, Comparable>)immutableMap);
    }

    @Override
    public Block b() {
        return this.i;
    }

    @Override
    public <T extends Comparable<T>, V extends T> IBlockState a(a4_0<T> a4_02, V v) {
        if (!da_1.a(this.h, a4_02)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), FZ.f), a4_02), FZ.g), BlocksInvoker.E(this.i)).toString());
        }
        if (!ms_0.b(aPS.b(a4_02), v)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), FZ.c), a4_02), FZ.h), v), FZ.b), a82.b(Block.m, this.i)), FZ.e).toString());
        }
        return da_1.b(this.h, a4_02) == v ? this : (IBlockState)abe_0.a(this.j, a4_02, v);
    }

    private aFo(Block block, ImmutableMap<a4_0, Comparable> immutableMap) {
        this.i = block;
        this.h = immutableMap;
    }
}

