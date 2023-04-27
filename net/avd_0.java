/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.World;
import net.ZJ;

/*
 * Renamed from net.aVd
 */
public class avd_0 {
    private static String b = "cvmslb";

    public static void b(String string) {
        b = string;
    }

    static {
        if (avd_0.b() == null) {
            avd_0.b("cvmslb");
        }
    }

    public static String b() {
        return b;
    }

    public static World a(ZJ zJ) {
        return zJ.Q();
    }
}

