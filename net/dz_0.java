/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;

/*
 * Renamed from net.Dz
 */
public class dz_0 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(Iterator iterator) {
        iterator.remove();
    }

    public static Object b(Iterator iterator) {
        return iterator.next();
    }

    public static boolean c(Iterator iterator) {
        return iterator.hasNext();
    }

    static {
        if (dz_0.b() == null) {
            dz_0.b(new String[4]);
        }
    }

    public static String[] b() {
        return b;
    }
}

