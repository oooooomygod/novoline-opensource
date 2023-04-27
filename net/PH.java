/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ServerStatusResponse;
import net.minecraft.network.packts.S00PacketServerInfo;

public class PH {
    private static boolean b;

    static {
        if (PH.b()) {
            PH.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static ServerStatusResponse a(S00PacketServerInfo s00PacketServerInfo) {
        return s00PacketServerInfo.a();
    }

    public static boolean c() {
        PH.b();
        return true;
    }
}

