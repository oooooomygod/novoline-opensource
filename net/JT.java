/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.ServerSocket;

public class JT {
    public static int a(ServerSocket serverSocket) {
        return serverSocket.getLocalPort();
    }

    public static void b(ServerSocket serverSocket) {
        serverSocket.close();
    }
}

