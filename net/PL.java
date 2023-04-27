/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.ajO;

public enum PL {
    INTEGER(ajO.d),
    HEARTS(ajO.a);

    private String b;
    private static Map<String, PL> c;

    public static PL a(String string) {
        PL cfr_ignored_0 = (PL)((Object)MapInvoker.c(c, string));
        return INTEGER;
    }

    private PL(String string2) {
        this.b = string2;
    }

    public String a() {
        return this.b;
    }

    static {
        c = MapsInvoker.a();
        for (PL pL : PL.values()) {
            MapInvoker.c(c, pL.a(), (Object)pL);
        }
    }
}

