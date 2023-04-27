/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.world.GameType;
import deobf.NetworkSystem;
import net.minecraft.server.management.ServerConfigurationManager;
import net.IntegratedServer;
import net.PlayerUsageSnooper;
import net.WorldServer;

public class IntegratedServerInvoker {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static boolean j(IntegratedServer integratedServer) {
        return integratedServer.m();
    }

    public static void l(IntegratedServer integratedServer) {
        integratedServer.p();
    }

    public static String n(IntegratedServer integratedServer) {
        return integratedServer.b();
    }

    public static ServerConfigurationManager a(IntegratedServer integratedServer) {
        return integratedServer.an();
    }

    public static int d(IntegratedServer integratedServer) {
        return integratedServer.Q();
    }

    public static WorldServer a(IntegratedServer integratedServer, int n) {
        return integratedServer.c(n);
    }

    static {
        if (IntegratedServerInvoker.b() == null) {
            IntegratedServerInvoker.b(new ListInvoker[4]);
        }
    }

    public static void startServerThread(IntegratedServer integratedServer) {
        integratedServer.B();
    }

    public static boolean m(IntegratedServer integratedServer) {
        return integratedServer.d();
    }

    public static String a(IntegratedServer integratedServer, GameType gameType, boolean bl) {
        return integratedServer.a(gameType, bl);
    }

    public static boolean b(IntegratedServer integratedServer) {
        return integratedServer.W();
    }

    public static void g(IntegratedServer integratedServer) {
        integratedServer.b();
    }

    public static void e(IntegratedServer integratedServer) {
        integratedServer.X();
    }

    public static String c(IntegratedServer integratedServer) {
        return integratedServer.f();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static String k(IntegratedServer integratedServer) {
        return integratedServer.au();
    }

    public static NetworkSystem f(IntegratedServer integratedServer) {
        return integratedServer.al();
    }

    public static PlayerUsageSnooper i(IntegratedServer integratedServer) {
        return integratedServer.r();
    }
}

