/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.CookieHandler;
import java.net.URI;
import java.util.Map;

/*
 * Renamed from net.cB
 */
public class cb_1 {
    public static CookieHandler a() {
        return CookieHandler.getDefault();
    }

    public static void a(CookieHandler cookieHandler, URI uRI, Map map) {
        cookieHandler.put(uRI, map);
    }

    public static void a(CookieHandler cookieHandler) {
        CookieHandler.setDefault(cookieHandler);
    }
}

