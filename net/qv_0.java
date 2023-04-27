/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.NetworkManager;
import deobf.Packet;
import java.util.Set;
import net.NetHandlerPlayServer;

/*
 * Renamed from net.Qv
 */
public class qv_0 {
    private static int[] b;

    public static void a(NetHandlerPlayServer netHandlerPlayServer, double d, double d2, double d3, float f, float f2) {
        netHandlerPlayServer.a(d, d2, d3, f, f2);
    }

    public static void a(NetHandlerPlayServer netHandlerPlayServer, double d, double d2, double d3, float f, float f2, Set set) {
        PacketBufferInvoker.b();
        netHandlerPlayServer.a(d, d2, d3, f, f2, set);
        ListInvoker.b(new ListInvoker[2]);
    }

    public static NetworkManager a(NetHandlerPlayServer netHandlerPlayServer) {
        return netHandlerPlayServer.b();
    }

    static {
        if (qv_0.b() == null) {
            qv_0.b(new int[5]);
        }
    }

    public static int[] b() {
        return b;
    }

    public static void a(NetHandlerPlayServer netHandlerPlayServer, String string) {
        netHandlerPlayServer.b(string);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(NetHandlerPlayServer netHandlerPlayServer, Packet packet) {
        netHandlerPlayServer.sendPacket(packet);
    }
}

