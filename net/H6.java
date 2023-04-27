/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.a2x_0;

public enum H6 {
    SHOW_TEXT(a2x_0.c, true),
    SHOW_ACHIEVEMENT(a2x_0.g, true),
    SHOW_ITEM(a2x_0.f, true),
    SHOW_ENTITY(a2x_0.a, true);

    private static Map<String, H6> a = MapsInvoker.a();
    private String c;
    private boolean b;

    private H6(String string2, boolean bl) {
        this.c = string2;
        this.b = bl;
    }

    public String b() {
        return this.c;
    }

    public static H6 a(String string) {
        return (H6)((Object)MapInvoker.c(a, string));
    }

    public boolean a() {
        return this.b;
    }

    static {
        for (H6 h6 : H6.values()) {
            MapInvoker.c(a, h6.b(), (Object)h6);
        }
    }
}

