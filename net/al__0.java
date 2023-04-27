/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.freeutils.httpserver.HTTPServer
 *  net.freeutils.httpserver.HTTPServer$VirtualHost
 */
package net;

import net.freeutils.httpserver.HTTPServer;

/*
 * Renamed from net.al_
 */
public class al__0 {
    private static int[] b;

    static {
        if (al__0.b() == null) {
            al__0.b(new int[2]);
        }
    }

    public static void a(HTTPServer hTTPServer) {
        hTTPServer.stop();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void b(HTTPServer hTTPServer) {
        hTTPServer.start();
    }

    public static HTTPServer.VirtualHost a(HTTPServer hTTPServer, String string) {
        return hTTPServer.getVirtualHost(string);
    }

    public static int[] b() {
        return b;
    }
}

