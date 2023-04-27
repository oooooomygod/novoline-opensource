/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 */
package net;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.stream.Stream;

/*
 * Renamed from net.pB
 */
public class pb_1 {
    public static Stream a(ObjectSet objectSet) {
        return objectSet.stream();
    }

    public static ObjectIterator b(ObjectSet objectSet) {
        return objectSet.iterator();
    }
}

