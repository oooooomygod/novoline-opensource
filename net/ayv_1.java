/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import net.OV;
import net.dz_0;

/*
 * Renamed from net.ayV
 */
public class ayv_1 {
    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }

    public static <K, V> Map<K, V> a(Iterable<K> iterable, Iterable<V> iterable2) {
        return ayv_1.a(iterable, iterable2, MapsInvoker.c());
    }

    public static <K, V> Map<K, V> a(Iterable<K> iterable, Iterable<V> iterable2, Map<K, V> map) {
        Iterator iterator = OV.a(iterable2);
        Iterator iterator2 = OV.a(iterable);
        while (dz_0.c(iterator2)) {
            Object object = dz_0.b(iterator2);
            MapInvoker.c(map, object, dz_0.b(iterator));
        }
        if (dz_0.c(iterator)) {
            throw new NoSuchElementException();
        }
        return map;
    }
}

