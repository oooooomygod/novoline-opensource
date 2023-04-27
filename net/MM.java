/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net;

import com.google.common.collect.Multimap;
import java.util.Collection;

public class MM {
    public static boolean b(Multimap multimap, Object object, Object object2) {
        return multimap.put(object, object2);
    }

    public static boolean c(Multimap multimap) {
        return multimap.isEmpty();
    }

    public static void b(Multimap multimap) {
        multimap.clear();
    }

    public static boolean a(Multimap multimap, Object object, Object object2) {
        return multimap.remove(object, object2);
    }

    public static Collection a(Multimap multimap) {
        return multimap.entries();
    }

    public static Collection a(Multimap multimap, Object object) {
        return multimap.get(object);
    }
}

