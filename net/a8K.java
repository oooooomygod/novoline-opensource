/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import deobf.ServerStatusResponse;
import net.aEW;
import net.t6_0;

public class a8K {
    public static IChatComponent c(ServerStatusResponse serverStatusResponse) {
        return serverStatusResponse.c();
    }

    public static aEW b(ServerStatusResponse serverStatusResponse) {
        return serverStatusResponse.b();
    }

    public static t6_0 d(ServerStatusResponse serverStatusResponse) {
        return serverStatusResponse.d();
    }

    public static void a(ServerStatusResponse serverStatusResponse, t6_0 t6_02) {
        serverStatusResponse.a(t6_02);
    }

    public static void a(ServerStatusResponse serverStatusResponse, String string) {
        serverStatusResponse.a(string);
    }

    public static void a(ServerStatusResponse serverStatusResponse, IChatComponent iChatComponent) {
        serverStatusResponse.a(iChatComponent);
    }

    public static void a(ServerStatusResponse serverStatusResponse, aEW aEW2) {
        serverStatusResponse.a(aEW2);
    }

    public static String a(ServerStatusResponse serverStatusResponse) {
        return serverStatusResponse.a();
    }
}

