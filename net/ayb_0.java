/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a85;
import net.jc_0;

/*
 * Renamed from net.aYb
 */
public class ayb_0
extends Enum<ayb_0> {
    private String e;
    private static String b;
    public static /* enum */ ayb_0 MOJANG;
    public static /* enum */ ayb_0 THEALTENING;
    private static /* synthetic */ ayb_0[] c;
    private String d;

    public static ayb_0 valueOf(String string) {
        return (ayb_0)jc_0.a(ayb_0.class, string);
    }

    private ayb_0(String string2, String string3) {
        this.d = string2;
        this.e = string3;
    }

    public String c() {
        return this.d;
    }

    public static String b() {
        return b;
    }

    public static ayb_0[] values() {
        return (ayb_0[])c.clone();
    }

    static {
        MOJANG = new ayb_0(a85.c, a85.d);
        THEALTENING = new ayb_0(a85.b, a85.a);
        ayb_0.b("SZSoIb");
        c = new ayb_0[]{MOJANG, THEALTENING};
    }

    public String d() {
        return this.e;
    }

    public static void b(String string) {
        b = string;
    }
}

