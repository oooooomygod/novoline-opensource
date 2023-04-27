/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.freeutils.httpserver.HTTPServer$ContextHandler
 *  net.freeutils.httpserver.HTTPServer$VirtualHost
 */
package net;

import net.freeutils.httpserver.HTTPServer;

public class EP {
    public static void a(HTTPServer.VirtualHost virtualHost, String string, HTTPServer.ContextHandler contextHandler, String[] stringArray) {
        virtualHost.addContext(string, contextHandler, stringArray);
    }
}

