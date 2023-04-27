/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package net;

import org.apache.commons.lang3.tuple.Pair;

/*
 * Renamed from net.aoI
 */
public class aoi_0 {
    private static int b;

    public static void b(int n) {
        b = n;
    }

    static {
        if (aoi_0.b() == 0) {
            aoi_0.b(44);
        }
    }

    public static int b() {
        return b;
    }

    public static Object a(Pair pair) {
        return pair.getRight();
    }

    public static Object b(Pair pair) {
        return pair.getLeft();
    }

    public static int c() {
        aoi_0.b();
        return 77;
    }
}

