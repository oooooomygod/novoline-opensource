/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumConnectionState;
import net.aQ4;

/*
 * Renamed from net.ao_
 */
public class ao__0 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    static {
        if (ao__0.b() == null) {
            ao__0.b(new String[3]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static int b(aQ4 aQ42) {
        return aQ42.c();
    }

    public static EnumConnectionState a(aQ4 aQ42) {
        return aQ42.b();
    }
}

