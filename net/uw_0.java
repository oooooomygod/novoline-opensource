/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectCollection
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package net;

import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * Renamed from net.Uw
 */
public class uw_0 {
    private static boolean b;

    public static boolean c() {
        uw_0.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static ObjectIterator b(ObjectCollection objectCollection) {
        return objectCollection.iterator();
    }

    public static boolean b() {
        return b;
    }

    static {
        if (!uw_0.b()) {
            uw_0.b(true);
        }
    }

    public static boolean a(ObjectCollection objectCollection, Predicate predicate) {
        return objectCollection.removeIf(predicate);
    }

    public static Stream a(ObjectCollection objectCollection) {
        return objectCollection.stream();
    }
}

