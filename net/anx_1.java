/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.DatagramPacket;
import java.net.InetAddress;

/*
 * Renamed from net.anX
 */
public class anx_1 {
    public static InetAddress d(DatagramPacket datagramPacket) {
        return datagramPacket.getAddress();
    }

    public static int c(DatagramPacket datagramPacket) {
        return datagramPacket.getOffset();
    }

    public static int a(DatagramPacket datagramPacket) {
        return datagramPacket.getLength();
    }

    public static byte[] b(DatagramPacket datagramPacket) {
        return datagramPacket.getData();
    }
}

