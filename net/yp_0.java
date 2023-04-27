/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.HashSet;

/*
 * Renamed from net.yP
 */
public class yp_0 {
    public static boolean a(HashSet hashSet, Object object) {
        return hashSet.add(object);
    }

    public static boolean a(HashSet hashSet, Collection collection) {
        return hashSet.removeAll(collection);
    }
}

