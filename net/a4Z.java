/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 */
package net;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import java.util.UUID;

public class a4Z {
    private static String b;

    public static String d(GameProfile gameProfile) {
        return gameProfile.getName();
    }

    public static void b(String string) {
        b = string;
    }

    public static UUID a(GameProfile gameProfile) {
        return gameProfile.getId();
    }

    public static boolean b(GameProfile gameProfile) {
        return gameProfile.isComplete();
    }

    public static PropertyMap c(GameProfile gameProfile) {
        return gameProfile.getProperties();
    }

    public static String b() {
        return b;
    }

    static {
        if (a4Z.b() != null) {
            a4Z.b("UhGhQc");
        }
    }
}

