/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.HttpCookie;

/*
 * Renamed from net.aUj
 */
public class auj_0 {
    public static boolean a(HttpCookie httpCookie) {
        return httpCookie.getSecure();
    }

    public static String c(HttpCookie httpCookie) {
        return httpCookie.getDomain();
    }

    public static boolean d(HttpCookie httpCookie) {
        return httpCookie.hasExpired();
    }

    public static int e(HttpCookie httpCookie) {
        return httpCookie.getVersion();
    }

    public static long b(HttpCookie httpCookie) {
        return httpCookie.getMaxAge();
    }

    public static boolean a(String string, String string2) {
        return HttpCookie.domainMatches(string, string2);
    }
}

