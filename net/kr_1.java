/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.akz_0;
import net.jc_0;

/*
 * Renamed from net.kR
 */
public class kr_1
extends Enum<kr_1> {
    public static /* enum */ kr_1 ALL = new kr_1(akz_0.b);
    private String c;
    private static int b;
    private static /* synthetic */ kr_1[] d;
    public static /* enum */ kr_1 FAVORITE;

    static {
        FAVORITE = new kr_1(akz_0.c);
        kr_1.b(0);
        d = new kr_1[]{ALL, FAVORITE};
    }

    public static void b(int n) {
        b = n;
    }

    public static int a() {
        kr_1.b();
        return 29;
    }

    public String c() {
        return this.c;
    }

    public static kr_1 valueOf(String string) {
        return (kr_1)jc_0.a(kr_1.class, string);
    }

    private kr_1(String string2) {
        this.c = string2;
    }

    public static int b() {
        return b;
    }

    public static kr_1[] values() {
        return (kr_1[])d.clone();
    }
}

