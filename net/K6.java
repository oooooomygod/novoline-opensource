/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.stats.Achievement;
import deobf.IChatComponent;

public class K6 {
    public static Achievement a(Achievement achievement, IStatStringFormat iStatStringFormat) {
        return achievement.a(iStatStringFormat);
    }

    public static Achievement a(Achievement achievement) {
        return achievement.c();
    }

    public static boolean d(Achievement achievement) {
        return achievement.b();
    }

    public static Achievement a(Achievement achievement, Class clazz) {
        return achievement.a(clazz);
    }

    public static Achievement f(Achievement achievement) {
        return achievement.e();
    }

    public static Achievement b(Achievement achievement) {
        return achievement.f();
    }

    public static String e(Achievement achievement) {
        return achievement.d();
    }

    public static IChatComponent c(Achievement achievement) {
        return achievement.g();
    }
}

