/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.management.RuntimeMXBean;
import java.util.List;

/*
 * Renamed from net.auU
 */
public class auu_0 {
    private static String[] b;

    public static String b(RuntimeMXBean runtimeMXBean) {
        return runtimeMXBean.getClassPath();
    }

    static {
        if (auu_0.b() != null) {
            auu_0.b(new String[3]);
        }
    }

    public static List a(RuntimeMXBean runtimeMXBean) {
        return runtimeMXBean.getInputArguments();
    }

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

