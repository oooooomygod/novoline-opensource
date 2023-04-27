/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.SessionInvoker;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import net.minecraft.world.GameType;
import deobf.MCInvoker;
import java.net.Proxy;

/*
 * Renamed from net.Sb
 */
public class sb_0 {
    public static String l() {
        return SessionInvoker.getPlayerID(MCInvoker.y(MCInvoker.f()));
    }

    public static ListenableFuture<Object> a(String string, String string2) {
        ListenableFuture<Object> listenableFuture = MCInvoker.D(MCInvoker.f()).a(string, string2);
        return listenableFuture;
    }

    public static String m() {
        return SessionInvoker.getUsername(MCInvoker.y(MCInvoker.f()));
    }

    public static String d() {
        return zq_2.j(MCInvoker.f().mcDataDir);
    }

    public static int h() {
        return ar3_0.a(GameType.CREATIVE);
    }

    public static String a() {
        MCInvoker.y(MCInvoker.f());
        return null;
    }

    public static int k() {
        return ar3_0.a(GameType.SPECTATOR);
    }

    public static String c() {
        return SessionInvoker.d(MCInvoker.y(MCInvoker.f()));
    }

    public static Proxy b() {
        return MCInvoker.f().getProxy();
    }

    public static void a(yo_2 yo_22) {
        MCInvoker.displayGuiScreen(MCInvoker.f(), dz_1.c(yo_22));
    }

    public static int e() {
        return ar3_0.a(GameType.SURVIVAL);
    }

    public static int f() {
        return ar3_0.a(GameType.ADVENTURE);
    }

    public static void g() {
        mf_1.c(MCInvoker.D(MCInvoker.f()));
    }

    public static void a(boolean bl) {
        MCInvoker.a(MCInvoker.f(), bl);
    }

    public static String i() {
        MCInvoker.y(MCInvoker.f());
        return null;
    }

    public static boolean n() {
        return MCInvoker.f().gameSettings.Y;
    }

    public static long j() {
        return MCInvoker.a();
    }

    public static String a(String string) {
        return aSI.b(MCInvoker.T(MCInvoker.f()), new GameProfile(WZ.a(string), (String)null), false).getName();
    }
}

