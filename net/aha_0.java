/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aHA;
import net.aHR;
import net.ad__0;
import net.jc_0;

/*
 * Renamed from net.aHa
 */
public abstract class aha_0
extends Enum<aha_0> {
    public static /* enum */ aha_0 MERGE = new aHR();
    private static aha_0[] a;
    public static /* enum */ aha_0 OVERWRITE;

    public abstract void a(ad__0 var1, ad__0 var2);

    public static aha_0 valueOf(String string) {
        return (aha_0)jc_0.a(aha_0.class, string);
    }

    private aha_0() {
    }

    public static aha_0[] values() {
        return (aha_0[])a.clone();
    }

    aha_0(aHR aHR2) {
        this();
    }

    static {
        OVERWRITE = new aHA();
        a = new aha_0[]{MERGE, OVERWRITE};
    }
}

