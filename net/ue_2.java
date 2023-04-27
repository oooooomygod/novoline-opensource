/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.minecraft.network.packts.S02PacketChat;

/*
 * Renamed from net.ue
 */
public class ue_2 {
    private static String b = "YRg5kc";

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static boolean b(S02PacketChat s02PacketChat) {
        return s02PacketChat.c();
    }

    public static IChatComponent c(S02PacketChat s02PacketChat) {
        return s02PacketChat.a();
    }

    static {
        if (ue_2.b() == null) {
            ue_2.b("YRg5kc");
        }
    }

    public static byte a(S02PacketChat s02PacketChat) {
        return s02PacketChat.b();
    }
}

