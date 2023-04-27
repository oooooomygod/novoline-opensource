/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package cc.novoline.invoke;

import deobf.EnumConnectionState;
import deobf.IChatComponent;
import deobf.NetworkManager;
import deobf.Packet;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import javax.crypto.SecretKey;
import net.INetHandler;

public class NetworkManagerInvoker {
    private static int[] b;

    public static boolean g(NetworkManager networkManager) {
        return networkManager.g();
    }

    public static void a(NetworkManager networkManager, int n) {
        networkManager.a(n);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void h(NetworkManager networkManager) {
        networkManager.b();
    }

    public static NetworkManager a(InetAddress inetAddress, int n, boolean bl) {
        return NetworkManager.a(inetAddress, n, bl);
    }

    static {
        if (NetworkManagerInvoker.b() == null) {
            NetworkManagerInvoker.b(new int[5]);
        }
    }

    public static void a(NetworkManager networkManager) {
        networkManager.c();
    }

    public static void a(NetworkManager networkManager, IChatComponent iChatComponent) {
        networkManager.a(iChatComponent);
    }

    public static void setNetHandler(NetworkManager networkManager, INetHandler INetHandler) {
        networkManager.a(INetHandler);
    }

    public static void e(NetworkManager networkManager) {
        networkManager.h();
    }

    public static NetworkManager provideLocalClient(SocketAddress socketAddress) {
        return NetworkManager.a(socketAddress);
    }

    public static void a(NetworkManager networkManager, Packet packet, GenericFutureListener genericFutureListener, GenericFutureListener[] genericFutureListenerArray) {
        networkManager.a(packet, (GenericFutureListener<? extends Future<? super Void>>)genericFutureListener, genericFutureListenerArray);
    }

    public static SocketAddress b(NetworkManager networkManager) {
        return networkManager.j();
    }

    public static void sendPacket(NetworkManager networkManager, Packet packet) {
        networkManager.sendPacket(packet);
    }

    public static boolean c(NetworkManager networkManager) {
        return networkManager.f();
    }

    public static void a(NetworkManager networkManager, EnumConnectionState enumConnectionState) {
        networkManager.a(enumConnectionState);
    }

    public static boolean d(NetworkManager networkManager) {
        return networkManager.d();
    }

    public static int[] b() {
        return b;
    }

    public static boolean f(NetworkManager networkManager) {
        return networkManager.i();
    }

    public static void a(NetworkManager networkManager, SecretKey secretKey) {
        networkManager.a(secretKey);
    }
}

