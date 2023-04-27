/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 */
package cc.novoline.invoke;

import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import deobf.ICommandManager;
import deobf.MinecraftServer;
import deobf.PlayerProfileCache;
import net.minecraft.server.management.ServerConfigurationManager;
import deobf.ServerStatusResponse;
import java.io.File;
import java.net.Proxy;
import java.security.KeyPair;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.BlockPos;
import net.ICommandSender;
import net.World;
import net.WorldServer;

public class ServerInvoker {
    private static int b;

    public static boolean G(MinecraftServer minecraftServer) {
        return minecraftServer.j();
    }

    public static int a() {
        ServerInvoker.b();
        return 65;
    }

    public static int a(MinecraftServer minecraftServer) {
        return minecraftServer.ar();
    }

    public static String A(MinecraftServer minecraftServer) {
        return minecraftServer.e();
    }

    public static File b(MinecraftServer minecraftServer, String string) {
        return minecraftServer.h(string);
    }

    public static Proxy p(MinecraftServer minecraftServer) {
        return minecraftServer.D();
    }

    public static boolean N(MinecraftServer minecraftServer) {
        return minecraftServer.L();
    }

    public static int z(MinecraftServer minecraftServer) {
        return minecraftServer.ab();
    }

    public static List a(MinecraftServer minecraftServer, ICommandSender iCommandSender, String string, BlockPos blockPos) {
        return minecraftServer.a(iCommandSender, string, blockPos);
    }

    public static boolean j(MinecraftServer minecraftServer) {
        return minecraftServer.N();
    }

    public static boolean q(MinecraftServer minecraftServer) {
        return minecraftServer.o();
    }

    public static MinecraftServer d() {
        return MinecraftServer.ah();
    }

    public static ListenableFuture a(MinecraftServer minecraftServer, Runnable runnable) {
        return minecraftServer.addScheduledTask(runnable);
    }

    public static boolean g(MinecraftServer minecraftServer) {
        return minecraftServer.s();
    }

    public static GameProfileRepository E(MinecraftServer minecraftServer) {
        return minecraftServer.d();
    }

    public static String c(MinecraftServer minecraftServer) {
        return minecraftServer.au();
    }

    public static boolean w(MinecraftServer minecraftServer) {
        return minecraftServer.J();
    }

    public static String[] r(MinecraftServer minecraftServer) {
        return minecraftServer.C();
    }

    public static Entity a(MinecraftServer minecraftServer, UUID uUID) {
        return minecraftServer.a(uUID);
    }

    public static int F(MinecraftServer minecraftServer) {
        return minecraftServer.y();
    }

    public static String x(MinecraftServer minecraftServer) {
        return minecraftServer.h();
    }

    public static boolean f(MinecraftServer minecraftServer) {
        return minecraftServer.ao();
    }

    public static int y(MinecraftServer minecraftServer) {
        return minecraftServer.k();
    }

    public static KeyPair D(MinecraftServer minecraftServer) {
        return minecraftServer.ag();
    }

    public static boolean b(MinecraftServer minecraftServer) {
        return minecraftServer.K();
    }

    static {
        if (ServerInvoker.a() != 0) {
            ServerInvoker.b(67);
        }
    }

    public static String t(MinecraftServer minecraftServer) {
        return minecraftServer.S();
    }

    public static void n(MinecraftServer minecraftServer) {
        minecraftServer.p();
    }

    public static void C(MinecraftServer minecraftServer) {
        minecraftServer.x();
    }

    public static boolean T(MinecraftServer minecraftServer) {
        return minecraftServer.H();
    }

    public static PlayerProfileCache L(MinecraftServer minecraftServer) {
        return minecraftServer.Z();
    }

    public static boolean e(MinecraftServer minecraftServer) {
        return minecraftServer.R();
    }

    public static GameType l(MinecraftServer minecraftServer) {
        return minecraftServer.g();
    }

    public static boolean S(MinecraftServer minecraftServer) {
        return minecraftServer.ak();
    }

    public static ICommandManager k(MinecraftServer minecraftServer) {
        return minecraftServer.c();
    }

    public static String d(MinecraftServer minecraftServer) {
        return minecraftServer.U();
    }

    public static boolean i(MinecraftServer minecraftServer) {
        return minecraftServer.af();
    }

    public static void a(MinecraftServer minecraftServer, EnumDifficulty enumDifficulty) {
        minecraftServer.a(enumDifficulty);
    }

    public static void h(MinecraftServer minecraftServer) {
        minecraftServer.F();
    }

    public static void I(MinecraftServer minecraftServer) {
        minecraftServer.aq();
    }

    public static int P(MinecraftServer minecraftServer) {
        return minecraftServer.O();
    }

    public static void b(MinecraftServer minecraftServer, int n) {
        minecraftServer.b(n);
    }

    public static void a(MinecraftServer minecraftServer, String string) {
        minecraftServer.c(string);
    }

    public static int o(MinecraftServer minecraftServer) {
        return minecraftServer.z();
    }

    public static int v(MinecraftServer minecraftServer) {
        return minecraftServer.as();
    }

    public static boolean K(MinecraftServer minecraftServer) {
        return minecraftServer.w();
    }

    public static void b(int n) {
        b = n;
    }

    public static boolean a(MinecraftServer minecraftServer, World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        return minecraftServer.a(world, blockPos, entityPlayer);
    }

    public static boolean Q(MinecraftServer minecraftServer) {
        return minecraftServer.am();
    }

    public static ServerConfigurationManager R(MinecraftServer minecraftServer) {
        return minecraftServer.an();
    }

    public static int b() {
        return b;
    }

    public static boolean M(MinecraftServer minecraftServer) {
        return minecraftServer.av();
    }

    public static void a(MinecraftServer minecraftServer, IChatComponent iChatComponent) {
        minecraftServer.addChatComponentMessage(iChatComponent);
    }

    public static boolean B(MinecraftServer minecraftServer) {
        return minecraftServer.m();
    }

    public static GameProfile[] J(MinecraftServer minecraftServer) {
        return minecraftServer.ap();
    }

    public static long c() {
        return MinecraftServer.ae();
    }

    public static ServerStatusResponse m(MinecraftServer minecraftServer) {
        return minecraftServer.M();
    }

    public static int s(MinecraftServer minecraftServer) {
        return minecraftServer.l();
    }

    public static String O(MinecraftServer minecraftServer) {
        return minecraftServer.E();
    }

    public static MinecraftSessionService u(MinecraftServer minecraftServer) {
        return minecraftServer.ac();
    }

    public static int H(MinecraftServer minecraftServer) {
        return minecraftServer.Q();
    }

    public static WorldServer a(MinecraftServer minecraftServer, int n) {
        return minecraftServer.c(n);
    }

    public static String a(MinecraftServer minecraftServer, GameType gameType, boolean bl) {
        return minecraftServer.a(gameType, bl);
    }
}

