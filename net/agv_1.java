/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import java.awt.Color;
import net.qt_1;

/*
 * Renamed from net.agV
 */
public class agv_1 {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static void a(qt_1 qt_12, EntityPlayer entityPlayer, float f, int n, Color color) {
        qt_12.a(entityPlayer, f, n, color);
    }

    public static boolean a() {
        agv_1.b();
        return true;
    }

    static {
        if (agv_1.b()) {
            agv_1.b(true);
        }
    }
}

