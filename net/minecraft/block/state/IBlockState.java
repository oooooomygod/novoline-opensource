/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package net.minecraft.block.state;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import net.minecraft.block.Block;

public interface IBlockState {
    public Collection<a4_0> a();

    public <T extends Comparable<T>> IBlockState b(a4_0<T> var1);

    public Block b();

    public <T extends Comparable<T>, V extends T> IBlockState a(a4_0<T> var1, V var2);

    public ImmutableMap<a4_0, Comparable> c();

    public <T extends Comparable<T>> T a(a4_0<T> var1);
}

