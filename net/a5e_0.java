/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Pair
 *  kotlin.TuplesKt
 */
package net;

import kotlin.Pair;
import kotlin.TuplesKt;

/*
 * Renamed from net.a5e
 */
public class a5e_0 {
    private static boolean b;

    public static boolean c() {
        a5e_0.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    static {
        if (a5e_0.b()) {
            a5e_0.b(true);
        }
    }

    public static Pair a(Object object, Object object2) {
        return TuplesKt.to((Object)object, (Object)object2);
    }
}

