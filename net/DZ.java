/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterables
 */
package net;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

public class DZ {
    public static Object a(Iterable iterable, Object object) {
        return Iterables.getFirst((Iterable)iterable, (Object)object);
    }

    public static Iterable a(Iterable iterable, Function function) {
        return Iterables.transform((Iterable)iterable, (Function)function);
    }

    public static Iterable a(Iterable iterable, int n) {
        return Iterables.skip((Iterable)iterable, (int)n);
    }

    public static Object[] a(Iterable iterable, Class clazz) {
        return Iterables.toArray((Iterable)iterable, (Class)clazz);
    }
}

