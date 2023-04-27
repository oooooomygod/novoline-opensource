/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C00PacketServerQuery;
import net.minecraft.network.packts.C01PacketPing;

/*
 * Renamed from net.auZ
 */
public class auz_1 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (auz_1.b() != null) {
            auz_1.b(new String[5]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static void a(INetHandlerStatusServer iNetHandlerStatusServer, C00PacketServerQuery c00PacketServerQuery) {
        iNetHandlerStatusServer.a(c00PacketServerQuery);
    }

    public static void a(INetHandlerStatusServer iNetHandlerStatusServer, C01PacketPing c01PacketPing) {
        iNetHandlerStatusServer.a(c01PacketPing);
    }
}

