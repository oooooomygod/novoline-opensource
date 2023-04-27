/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.stats.Achievement;
import deobf.GuiAchievement;

public class GuiAchievementInvoker {
    public static void a(GuiAchievement guiAchievement) {
        guiAchievement.b();
    }

    public static void a(GuiAchievement guiAchievement, Achievement achievement) {
        guiAchievement.b(achievement);
    }

    public static void b(GuiAchievement guiAchievement, Achievement achievement) {
        guiAchievement.a(achievement);
    }

    public static void b(GuiAchievement guiAchievement) {
        guiAchievement.c();
    }
}

