/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.ad__0;
import net.afx_2;
import net.aoc_2;
import net.ayi_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.af3
 */
public abstract class af3_0 {
    public static Object a = new Object();
    private static ListInvoker[] b;

    public abstract void a(@NonNull ad__0 var1);

    public static @NonNull af3_0 a(af3_0 ... af3_0Array) {
        return new afx_2(af3_0Array);
    }

    static {
        af3_0.b(null);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static @NonNull ayi_1 d() {
        return new ayi_1();
    }

    public static @NonNull aoc_2 c() {
        return new aoc_2();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }
}

