/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.atJ;
import net.kd_1;
import net.rr_1;

/*
 * Renamed from net.hB
 */
public class hb_1 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    static {
        if (hb_1.b() != null) {
            hb_1.b(new String[4]);
        }
    }

    public static void a(EntityPlayer entityPlayer, rr_1 rr_12, atJ atJ2) {
        kd_1.a(entityPlayer, rr_12, atJ2);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

