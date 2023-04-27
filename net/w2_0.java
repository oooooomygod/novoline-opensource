/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MapFactory;
import java.util.Comparator;
import net.UY;
import net.avl_1;
import net.gx_0;
import net.ux_1;

/*
 * Renamed from net.w2
 */
public class w2_0 {
    private static boolean b;

    static {
        if (!w2_0.e()) {
            w2_0.b(true);
        }
    }

    public static MapFactory b() {
        return ux_1.SORTED_NATURAL;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static MapFactory c() {
        return ux_1.UNORDERED;
    }

    public static boolean e() {
        return b;
    }

    private w2_0() {
    }

    public static MapFactory a(Comparator<Object> comparator) {
        return new gx_0((Comparator)UY.a(comparator, avl_1.a), null);
    }

    public static boolean d() {
        w2_0.e();
        return true;
    }

    public static MapFactory a() {
        return ux_1.INSERTION_ORDERED;
    }
}

