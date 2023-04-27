/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * Renamed from net.a3g
 */
public class a3g_0 {
    private static String[] b;

    static {
        if (a3g_0.b() != null) {
            a3g_0.b(new String[5]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static ZoneId a(ZonedDateTime zonedDateTime) {
        return zonedDateTime.getZone();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static ZonedDateTime a(ZoneId zoneId) {
        return ZonedDateTime.now(zoneId);
    }
}

