/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.util.Map;
import net.PlayerUsageSnooper;

public class SnooperInvoker {
    public static void addMemoryStatsToSnooper(PlayerUsageSnooper playerUsageSnooper) {
        playerUsageSnooper.b();
    }

    public static String f(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.i();
    }

    public static long g(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.d();
    }

    public static boolean isSnooperRunning(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.g();
    }

    public static void addStatToSnooper(PlayerUsageSnooper playerUsageSnooper, String string, Object object) {
        playerUsageSnooper.a(string, object);
    }

    public static Map a(PlayerUsageSnooper playerUsageSnooper) {
        return playerUsageSnooper.f();
    }

    public static void startSnooper(PlayerUsageSnooper playerUsageSnooper) {
        playerUsageSnooper.e();
    }

    public static void a(PlayerUsageSnooper playerUsageSnooper, String string, Object object) {
        playerUsageSnooper.b(string, object);
    }

    public static void c(PlayerUsageSnooper playerUsageSnooper) {
        playerUsageSnooper.c();
    }
}

