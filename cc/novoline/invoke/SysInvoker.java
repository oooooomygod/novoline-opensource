/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.Sys
 */
package cc.novoline.invoke;

import org.lwjgl.Sys;

public class SysInvoker {
    public static long b() {
        return Sys.getTime();
    }

    public static long a() {
        return Sys.getTimerResolution();
    }

    public static boolean a(String string) {
        return Sys.openURL((String)string);
    }
}

