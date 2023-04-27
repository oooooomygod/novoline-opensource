/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.NBTTagCompound;
import net.ServerData;
import net.ServerResourceMode;
import net.ahr_0;

public class aKZ {
    public static ServerData a(NBTTagCompound nBTTagCompound) {
        return ServerData.a(nBTTagCompound);
    }

    public static ahr_0 c(ServerData serverData) {
        return serverData.c();
    }

    public static ServerResourceMode a(ServerData serverData) {
        return serverData.d();
    }

    public static String d(ServerData serverData) {
        return serverData.e();
    }

    public static void a(ServerData serverData, ServerData serverData2) {
        serverData.a(serverData2);
    }

    public static void a(ServerData serverData, ServerResourceMode serverResourceMode) {
        serverData.a(serverResourceMode);
    }

    public static NBTTagCompound b(ServerData serverData) {
        return serverData.a();
    }

    public static boolean e(ServerData serverData) {
        return serverData.b();
    }

    public static void a(ServerData serverData, String string) {
        serverData.a(string);
    }
}

