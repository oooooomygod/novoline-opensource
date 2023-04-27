/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.freeutils.httpserver.HTTPServer$Headers
 *  net.freeutils.httpserver.HTTPServer$Response
 */
package net;

import net.freeutils.httpserver.HTTPServer;

/*
 * Renamed from net.Ck
 */
public class ck_0 {
    public static void a(HTTPServer.Response response, int n, String string) {
        response.send(n, string);
    }

    public static HTTPServer.Headers a(HTTPServer.Response response) {
        return response.getHeaders();
    }
}

