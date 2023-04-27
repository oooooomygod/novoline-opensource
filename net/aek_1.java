/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.mojang.authlib.GameProfile;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EntityPlayerMP;
import deobf.IChatComponent;
import deobf.NetworkManager;
import deobf.Packet;
import net.minecraft.server.management.ServerConfigurationManager;
import java.net.SocketAddress;
import java.util.List;
import java.util.UUID;

/*
 * Renamed from net.aeK
 */
public class aek_1 {
    private static ListInvoker[] b;

    public static void c(ServerConfigurationManager serverConfigurationManager, GameProfile gameProfile) {
        serverConfigurationManager.h(gameProfile);
    }

    public static void d(ServerConfigurationManager serverConfigurationManager, GameProfile gameProfile) {
        serverConfigurationManager.d(gameProfile);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, EntityPlayerMP entityPlayerMP) {
        serverConfigurationManager.f(entityPlayerMP);
    }

    public static boolean a(ServerConfigurationManager serverConfigurationManager, GameProfile gameProfile) {
        return serverConfigurationManager.f(gameProfile);
    }

    public static a0i_0 n(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.n();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, WorldServer[] worldServerArray) {
        serverConfigurationManager.a(worldServerArray);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, IChatComponent iChatComponent) {
        serverConfigurationManager.a(iChatComponent);
    }

    public static void c(ServerConfigurationManager serverConfigurationManager) {
        serverConfigurationManager.m();
    }

    public static EntityPlayerMP a(ServerConfigurationManager serverConfigurationManager, String string) {
        return serverConfigurationManager.b(string);
    }

    public static a0t_0 f(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.c();
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, IChatComponent iChatComponent, boolean bl) {
        serverConfigurationManager.a(iChatComponent, bl);
    }

    public static void b(ServerConfigurationManager serverConfigurationManager, EntityPlayerMP entityPlayerMP) {
        serverConfigurationManager.b(entityPlayerMP);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, EntityPlayer entityPlayer, double d, double d2, double d3, double d4, int n, Packet packet) {
        aek_1.b();
        serverConfigurationManager.a(entityPlayer, d, d2, d3, d4, n, packet);
        if (ListInvoker.b() != null) {
            aek_1.b(new ListInvoker[5]);
        }
    }

    public static List l(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.g();
    }

    public static EntityPlayerMP b(ServerConfigurationManager serverConfigurationManager, GameProfile gameProfile) {
        return serverConfigurationManager.g(gameProfile);
    }

    static {
        if (aek_1.b() != null) {
            aek_1.b(new ListInvoker[5]);
        }
    }

    public static List b(ServerConfigurationManager serverConfigurationManager, String string) {
        return serverConfigurationManager.a(string);
    }

    public static String[] h(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.e();
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, double d, double d2, double d3, double d4, int n, Packet packet) {
        serverConfigurationManager.a(d, d2, d3, d4, n, packet);
    }

    public static GameProfile[] g(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.i();
    }

    public static String a(ServerConfigurationManager serverConfigurationManager, boolean bl) {
        return serverConfigurationManager.c(bl);
    }

    public static a0d_0 o(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.p();
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, EntityPlayerMP entityPlayerMP, int n) {
        serverConfigurationManager.a(entityPlayerMP, n);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, NetworkManager networkManager, EntityPlayerMP entityPlayerMP) {
        serverConfigurationManager.a(networkManager, entityPlayerMP);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, Packet packet) {
        serverConfigurationManager.a(packet);
    }

    public static EntityPlayerMP a(ServerConfigurationManager serverConfigurationManager, UUID uUID) {
        return serverConfigurationManager.a(uUID);
    }

    public static a0N p(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.b();
    }

    public static void b(ServerConfigurationManager serverConfigurationManager, boolean bl) {
        serverConfigurationManager.a(bl);
    }

    public static void b(ServerConfigurationManager serverConfigurationManager, EntityPlayerMP entityPlayerMP, WorldServer worldServer) {
        serverConfigurationManager.b(entityPlayerMP, worldServer);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager) {
        serverConfigurationManager.t();
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, Packet packet, int n) {
        serverConfigurationManager.a(packet, n);
    }

    public static void f(ServerConfigurationManager serverConfigurationManager, GameProfile gameProfile) {
        serverConfigurationManager.c(gameProfile);
    }

    public static void c(ServerConfigurationManager serverConfigurationManager, boolean bl) {
        serverConfigurationManager.b(bl);
    }

    public static void c(ServerConfigurationManager serverConfigurationManager, EntityPlayerMP entityPlayerMP) {
        serverConfigurationManager.a(entityPlayerMP);
    }

    public static EntityPlayerMP a(ServerConfigurationManager serverConfigurationManager, EntityPlayerMP entityPlayerMP, int n, boolean bl) {
        return serverConfigurationManager.a(entityPlayerMP, n, bl);
    }

    public static l1_0 a(ServerConfigurationManager serverConfigurationManager, EntityPlayer entityPlayer) {
        return serverConfigurationManager.a(entityPlayer);
    }

    public static void b(ServerConfigurationManager serverConfigurationManager) {
        serverConfigurationManager.j();
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, EntityPlayer entityPlayer, IChatComponent iChatComponent) {
        serverConfigurationManager.b(entityPlayer, iChatComponent);
    }

    public static int e(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.l();
    }

    public static NBTTagCompound j(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.d();
    }

    public static void m(ServerConfigurationManager serverConfigurationManager) {
        serverConfigurationManager.s();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static String[] d(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.f();
    }

    public static String[] i(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.h();
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, int n) {
        serverConfigurationManager.a(n);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, EntityPlayerMP entityPlayerMP, WorldServer worldServer) {
        serverConfigurationManager.a(entityPlayerMP, worldServer);
    }

    public static void a(ServerConfigurationManager serverConfigurationManager, Entity entity, int n, WorldServer worldServer, WorldServer worldServer2) {
        serverConfigurationManager.a(entity, n, worldServer, worldServer2);
    }

    public static int k(ServerConfigurationManager serverConfigurationManager) {
        return serverConfigurationManager.q();
    }

    public static void b(ServerConfigurationManager serverConfigurationManager, EntityPlayer entityPlayer, IChatComponent iChatComponent) {
        serverConfigurationManager.a(entityPlayer, iChatComponent);
    }

    public static void e(ServerConfigurationManager serverConfigurationManager, GameProfile gameProfile) {
        serverConfigurationManager.b(gameProfile);
    }

    public static String a(ServerConfigurationManager serverConfigurationManager, SocketAddress socketAddress, GameProfile gameProfile) {
        return serverConfigurationManager.a(socketAddress, gameProfile);
    }
}

