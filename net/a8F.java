/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumPlayerType;
import java.util.List;
import java.util.function.Predicate;
import net.Config;
import net.PlayerManager;

public class a8F {
    public static List a(PlayerManager playerManager, EnumPlayerType enumPlayerType) {
        return playerManager.a(enumPlayerType);
    }

    public static boolean b(PlayerManager playerManager, String string, EnumPlayerType enumPlayerType) {
        return playerManager.c(string, enumPlayerType);
    }

    public static boolean b(PlayerManager playerManager, String string) {
        return playerManager.a(string);
    }

    public static boolean a(PlayerManager playerManager, String string, EnumPlayerType enumPlayerType) {
        return playerManager.b(string, enumPlayerType);
    }

    public static EnumPlayerType a(PlayerManager playerManager, String string) {
        return playerManager.b(string);
    }

    public static boolean a(PlayerManager playerManager, EnumPlayerType enumPlayerType, Predicate predicate) {
        return playerManager.a(enumPlayerType, predicate);
    }

    public static Config a(PlayerManager playerManager) {
        return playerManager.c();
    }

    public static boolean c(PlayerManager playerManager, String string, EnumPlayerType enumPlayerType) {
        return playerManager.a(string, enumPlayerType);
    }
}

