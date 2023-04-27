/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.aS0;
import net.akr_2;

public enum aFJ {
    ALWAYS(akr_2.c, 0),
    NEVER(akr_2.g, 1),
    HIDE_FOR_OTHER_TEAMS(akr_2.f, 2),
    HIDE_FOR_OWN_TEAM(akr_2.a, 3);

    public int field_178827_f;
    public String field_178830_e;
    private static Map<String, aFJ> b;

    static {
        b = MapsInvoker.a();
        for (aFJ aFJ2 : aFJ.values()) {
            MapInvoker.c(b, aFJ2.field_178830_e, (Object)aFJ2);
        }
    }

    private aFJ(String string2, int n2) {
        this.field_178830_e = string2;
        this.field_178827_f = n2;
    }

    public static String[] a() {
        return (String[])aS0.a(MapInvoker.c(b), new String[0]);
    }

    public static aFJ a(String string) {
        return (aFJ)((Object)MapInvoker.c(b, string));
    }
}

