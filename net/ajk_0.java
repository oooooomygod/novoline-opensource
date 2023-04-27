/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MapFactory;
import java.util.concurrent.ConcurrentMap;

/*
 * Renamed from net.ajk
 */
public class ajk_0 {
    private static String b;

    static {
        if (ajk_0.b() != null) {
            ajk_0.b("q9spr");
        }
    }

    public static String b() {
        return b;
    }

    public static ConcurrentMap a(MapFactory mapFactory) {
        return mapFactory.create();
    }

    public static void b(String string) {
        b = string;
    }
}

