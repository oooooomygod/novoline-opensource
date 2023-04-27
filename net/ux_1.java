/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MapFactory;
import net.a3f_0;
import net.jc_0;
import net.u9;
import net.um_1;
import net.us_1;

/*
 * Renamed from net.uX
 */
abstract class ux_1
extends Enum<ux_1>
implements MapFactory {
    public static /* enum */ ux_1 SORTED_NATURAL;
    private static ux_1[] a;
    public static /* enum */ ux_1 INSERTION_ORDERED;
    public static /* enum */ ux_1 UNORDERED;

    public static ux_1[] values() {
        return (ux_1[])a.clone();
    }

    static {
        UNORDERED = new us_1();
        SORTED_NATURAL = new um_1();
        INSERTION_ORDERED = new u9();
        a = new ux_1[]{UNORDERED, SORTED_NATURAL, INSERTION_ORDERED};
    }

    private ux_1() {
    }

    ux_1(a3f_0 a3f_02) {
        this();
    }

    public static ux_1 valueOf(String string) {
        return (ux_1)jc_0.a(ux_1.class, string);
    }
}

