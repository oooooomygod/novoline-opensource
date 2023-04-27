/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.Entity;

public class atC {
    private static String[] b;

    static {
        if (atC.c() == null) {
            atC.b(new String[1]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] c() {
        return b;
    }

    public static void a() {
        aZD.a();
    }

    public static a9k_0 a(aZD aZD2, String string) {
        return aZD2.a(string);
    }

    public static aZD a(Entity entity) {
        return aZD.a(entity);
    }

    public static kp_2 a(AbstractClientPlayer abstractClientPlayer) {
        return aZD.a(abstractClientPlayer);
    }

    public static void b() {
        aZD.c();
    }
}

