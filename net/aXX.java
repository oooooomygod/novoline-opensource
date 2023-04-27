/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Pair
 *  kotlin.collections.MapsKt
 */
package net;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;

public class aXX {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    static {
        if (!aXX.c()) {
            aXX.b(true);
        }
    }

    public static Map a(Pair pair) {
        return MapsKt.mapOf((Pair)pair);
    }

    public static Map a(Pair[] pairArray) {
        return MapsKt.mapOf((Pair[])pairArray);
    }

    public static boolean c() {
        aXX.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }
}

