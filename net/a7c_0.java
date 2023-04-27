/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.UnmodifiableIterator
 */
package net;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;

/*
 * Renamed from net.a7c
 */
public class a7c_0 {
    public static int b(ImmutableList immutableList) {
        return immutableList.size();
    }

    public static ImmutableList.Builder a() {
        return ImmutableList.builder();
    }

    public static UnmodifiableIterator a(ImmutableList immutableList) {
        return immutableList.iterator();
    }

    public static ImmutableList a(Iterable iterable) {
        return ImmutableList.copyOf((Iterable)iterable);
    }

    public static ImmutableList a(Object[] objectArray) {
        return ImmutableList.copyOf((Object[])objectArray);
    }

    public static ImmutableList a(Collection collection) {
        return ImmutableList.copyOf((Collection)collection);
    }

    public static Object a(ImmutableList immutableList, int n) {
        return immutableList.get(n);
    }

    public static ImmutableList b() {
        return ImmutableList.of();
    }
}

