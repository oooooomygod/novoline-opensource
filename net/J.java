/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oshi.SystemInfo
 *  oshi.hardware.HardwareAbstractionLayer
 */
package net;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

public class J {
    private static String[] b;

    public static HardwareAbstractionLayer a(SystemInfo systemInfo) {
        return systemInfo.getHardware();
    }

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (J.b() == null) {
            J.b(new String[3]);
        }
    }
}

