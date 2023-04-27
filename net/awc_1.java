/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.UUID;

/*
 * Renamed from net.awC
 */
public class awc_1 {
    private static boolean b;

    public static UUID a() {
        return UUID.randomUUID();
    }

    public static boolean d() {
        return b;
    }

    public static boolean c() {
        awc_1.d();
        return true;
    }

    public static UUID a(String string) {
        return UUID.fromString(string);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static long b(UUID uUID) {
        return uUID.getMostSignificantBits();
    }

    public static UUID a(byte[] byArray) {
        return UUID.nameUUIDFromBytes(byArray);
    }

    public static long a(UUID uUID) {
        return uUID.getLeastSignificantBits();
    }

    static {
        if (!awc_1.d()) {
            awc_1.b(true);
        }
    }
}

