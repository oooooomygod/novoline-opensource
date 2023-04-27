/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class a5R {
    private static String b;

    static {
        if (a5R.b() != null) {
            a5R.b("VkHRec");
        }
    }

    public static int d(URL uRL) {
        return uRL.getPort();
    }

    public static String c(URL uRL) {
        return uRL.getProtocol();
    }

    public static String b(URL uRL) {
        return uRL.getHost();
    }

    public static String a(URL uRL) {
        return uRL.getFile();
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    public static URLConnection e(URL uRL) {
        return uRL.openConnection();
    }

    public static URLConnection a(URL uRL, Proxy proxy) {
        return uRL.openConnection(proxy);
    }
}

