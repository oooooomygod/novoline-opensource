/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import cc.novoline.events.State;
import cc.novoline.events.events.PacketEvent;
import deobf.Packet;

public class PacketEventInvoker {
    private static int b;

    public static void a(PacketEvent packetEvent, Packet packet) {
        packetEvent.b(packet);
    }

    static {
        if (PacketEventInvoker.c() == 0) {
            PacketEventInvoker.b(1);
        }
    }

    public static Packet c(PacketEvent packetEvent) {
        return packetEvent.b();
    }

    public static void b(int n) {
        b = n;
    }

    public static State getState(PacketEvent packetEvent) {
        return packetEvent.c();
    }

    public static boolean a(PacketEvent packetEvent) {
        return packetEvent.isCancelled();
    }

    public static int b() {
        return b;
    }

    public static void setCancelled(PacketEvent packetEvent, boolean bl) {
        packetEvent.setCancelled(bl);
    }

    public static int c() {
        PacketEventInvoker.b();
        return 47;
    }
}

