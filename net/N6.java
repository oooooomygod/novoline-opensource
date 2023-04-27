/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.P8;
import net.aL0;
import net.aW_;

public enum N6 {
    MASTER(aW_.q, 0),
    MUSIC(aW_.f, 1),
    RECORDS(aW_.d, 2),
    WEATHER(aW_.g, 3),
    BLOCKS(aW_.k, 4),
    MOBS(aW_.o, 5),
    ANIMALS(aW_.s, 6),
    PLAYERS(aW_.i, 7),
    AMBIENT(aW_.a, 8);

    private int e;
    private static Map<Integer, N6> a;
    private static Map<String, N6> d;
    private String b;

    static {
        d = MapsInvoker.a();
        a = MapsInvoker.a();
        for (N6 n6 : N6.values()) {
            if (MapInvoker.b(d, n6.a()) || MapInvoker.b(a, P8.d(n6.b()))) {
                throw new Error(aL0.a(aL0.a(new StringBuilder(), aW_.e), (Object)n6).toString());
            }
            MapInvoker.c(d, n6.a(), (Object)n6);
            MapInvoker.c(a, P8.d(n6.b()), (Object)n6);
        }
    }

    private N6(String string2, int n2) {
        this.b = string2;
        this.e = n2;
    }

    public int b() {
        return this.e;
    }

    public String a() {
        return this.b;
    }

    public static N6 a(String string) {
        return (N6)((Object)MapInvoker.c(d, string));
    }
}

