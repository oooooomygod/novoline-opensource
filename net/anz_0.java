/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.UnmodifiableIterator
 */
package net;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from net.anz
 */
public class anz_0 {
    public static Iterator a(Iterator iterator, int n) {
        return Iterators.limit((Iterator)iterator, (int)n);
    }

    public static UnmodifiableIterator a(Iterator iterator, Predicate predicate) {
        return Iterators.filter((Iterator)iterator, (Predicate)predicate);
    }

    public static Object[] b(Iterator iterator, Class clazz) {
        return Iterators.toArray((Iterator)iterator, (Class)clazz);
    }

    public static UnmodifiableIterator a() {
        return Iterators.emptyIterator();
    }

    public static Iterator a(Iterator iterator, Iterator iterator2) {
        return Iterators.concat((Iterator)iterator, (Iterator)iterator2);
    }

    public static boolean a(Iterator iterator, Object object) {
        return Iterators.contains((Iterator)iterator, (Object)object);
    }

    public static UnmodifiableIterator a(Object object) {
        return Iterators.singletonIterator((Object)object);
    }

    public static UnmodifiableIterator a(Object[] objectArray) {
        return Iterators.forArray((Object[])objectArray);
    }

    public static boolean a(Collection collection, Iterator iterator) {
        return Iterators.addAll((Collection)collection, (Iterator)iterator);
    }

    public static UnmodifiableIterator a(Iterator iterator, Class clazz) {
        return Iterators.filter((Iterator)iterator, (Class)clazz);
    }

    public static Iterator a(Iterator iterator, Function function) {
        return Iterators.transform((Iterator)iterator, (Function)function);
    }

    public static UnmodifiableIterator a(Iterator iterator) {
        return Iterators.unmodifiableIterator((Iterator)iterator);
    }

    public static Iterator b(Iterator iterator) {
        return Iterators.concat((Iterator)iterator);
    }
}

