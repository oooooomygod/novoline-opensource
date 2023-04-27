/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl
 *  com.viaversion.viaversion.ViaManagerImpl$ViaManagerBuilder
 */
package net;

import com.viaversion.viaversion.ViaManagerImpl;

public class EN {
    private static String b = "uzK8S";

    public static void a(ViaManagerImpl viaManagerImpl) {
        viaManagerImpl.init();
    }

    static {
        if (EN.b() == null) {
            EN.b("uzK8S");
        }
    }

    public static ViaManagerImpl.ViaManagerBuilder a() {
        return ViaManagerImpl.builder();
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }
}

