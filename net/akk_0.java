/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import cc.novoline.modules.AbstractModule;
import com.google.common.reflect.TypeToken;
import deobf.ModuleHolder;

/*
 * Renamed from net.akK
 */
public class akk_0 {
    private static String b;

    static {
        if (akk_0.b() != null) {
            akk_0.b("aHohoc");
        }
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    public static AbstractModule b(ModuleHolder moduleHolder) {
        return moduleHolder.c();
    }

    public static TypeToken a(ModuleHolder moduleHolder) {
        return moduleHolder.d();
    }
}

