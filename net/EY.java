/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oshi.hardware.HardwareAbstractionLayer
 *  oshi.hardware.Processor
 */
package net;

import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Processor;

public class EY {
    private static String b = "FjKpmb";

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    static {
        if (EY.b() == null) {
            EY.b("FjKpmb");
        }
    }

    public static Processor[] a(HardwareAbstractionLayer hardwareAbstractionLayer) {
        return hardwareAbstractionLayer.getProcessors();
    }
}

