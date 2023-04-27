/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumConnectionState;
import deobf.Packet;
import deobf.EnumPacketDirection;

public class aK3 {
    public static EnumConnectionState a(Packet packet) {
        return EnumConnectionState.a(packet);
    }

    public static int a(EnumConnectionState enumConnectionState) {
        return enumConnectionState.a();
    }

    public static Integer a(EnumConnectionState enumConnectionState, EnumPacketDirection enumPacketDirection, Packet packet) {
        return enumConnectionState.a(enumPacketDirection, packet);
    }

    public static EnumConnectionState a(int n) {
        return EnumConnectionState.a(n);
    }

    public static Packet a(EnumConnectionState enumConnectionState, EnumPacketDirection enumPacketDirection, int n) {
        return enumConnectionState.a(enumPacketDirection, n);
    }
}

