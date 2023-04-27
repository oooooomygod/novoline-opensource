/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.UnmodifiableIterator
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import net.my_0;

public class MV {
    public static boolean a(ImmutableSet immutableSet, Object object) {
        return immutableSet.contains(object);
    }

    public static ImmutableSet a(Collection collection) {
        return ImmutableSet.copyOf((Collection)collection);
    }

    public static ImmutableSet a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object[] objectArray) {
        my_0.d();
        ImmutableSet immutableSet = ImmutableSet.of((Object)object, (Object)object2, (Object)object3, (Object)object4, (Object)object5, (Object)object6, (Object[])objectArray);
        ListInvoker.b(new ListInvoker[1]);
        return immutableSet;
    }

    public static ImmutableSet a(Object object, Object object2) {
        return ImmutableSet.of((Object)object, (Object)object2);
    }

    public static UnmodifiableIterator a(ImmutableSet immutableSet) {
        return immutableSet.iterator();
    }
}

