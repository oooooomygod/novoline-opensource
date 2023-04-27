/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.Map;
import net.arj_2;

public enum Type {
    LEGACY(arj_2.d),
    MOJANG(arj_2.c);

    private String b;
    private static Map<String, Type> c;

    static {
        c = MapsInvoker.a();
        for (Type type : Type.values()) {
            MapInvoker.c(c, type.b, (Object)type);
        }
    }

    private Type(String string2) {
        this.b = string2;
    }

    public static Type a(String string) {
        return (Type)((Object)MapInvoker.c(c, StringInvoker.i(string)));
    }
}

