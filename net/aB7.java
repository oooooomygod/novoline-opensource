/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class aB7 {
    public static void a(MulticastSocket multicastSocket, InetAddress inetAddress) {
        multicastSocket.leaveGroup(inetAddress);
    }

    public static void a(MulticastSocket multicastSocket, DatagramPacket datagramPacket) {
        multicastSocket.receive(datagramPacket);
    }

    public static void a(MulticastSocket multicastSocket, int n) {
        multicastSocket.setSoTimeout(n);
    }

    public static void b(MulticastSocket multicastSocket, InetAddress inetAddress) {
        multicastSocket.joinGroup(inetAddress);
    }

    public static void a(MulticastSocket multicastSocket) {
        multicastSocket.close();
    }
}

