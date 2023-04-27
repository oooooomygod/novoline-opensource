/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.EnumSet;

/*
 * Renamed from net.ace
 */
public class ace_2 {
    public static boolean a(EnumSet enumSet) {
        return enumSet.isEmpty();
    }

    public static EnumSet a(Class clazz) {
        return EnumSet.allOf(clazz);
    }

    public static boolean b(EnumSet enumSet, Object object) {
        return enumSet.add(object);
    }

    public static EnumSet b(Class clazz) {
        return EnumSet.noneOf(clazz);
    }

    public static boolean a(EnumSet enumSet, Collection collection) {
        return enumSet.addAll(collection);
    }

    public static boolean a(EnumSet enumSet, Object object) {
        return enumSet.contains(object);
    }
}

