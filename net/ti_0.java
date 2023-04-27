/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import net.BT;
import net.dz_0;
import net.ms_0;

/*
 * Renamed from net.tI
 */
public class ti_0 {
    public static <T extends BT> T a(Random random, Collection<T> collection) {
        return ti_0.a(random, collection, ti_0.a(collection));
    }

    public static int a(Collection<? extends BT> collection) {
        int n = 0;
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            BT bT = (BT)dz_0.b(iterator);
            n += bT.a;
        }
        return n;
    }

    public static <T extends BT> T a(Collection<T> collection, int n) {
        Iterator iterator = ms_0.a(collection);
        if (dz_0.c(iterator)) {
            BT bT = (BT)dz_0.b(iterator);
            n -= bT.a;
            return (T)bT;
        }
        return (T)((BT)null);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static <T extends BT> T a(Random random, Collection<T> collection, int n) {
        throw new IllegalArgumentException();
    }
}

