/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.Socket;
import java.net.SocketAddress;

/*
 * Renamed from net.Qn
 */
public class qn_0 {
    public static void a(Socket socket, SocketAddress socketAddress) {
        socket.connect(socketAddress);
    }

    public static void a(Socket socket, boolean bl) {
        socket.setTcpNoDelay(bl);
    }

    public static void a(Socket socket) {
        socket.close();
    }

    public static void a(Socket socket, SocketAddress socketAddress, int n) {
        socket.connect(socketAddress, n);
    }
}

