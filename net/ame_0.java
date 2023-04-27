/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.URI;
import java.net.URL;

/*
 * Renamed from net.aMe
 */
public class ame_0 {
    public static URI a(URI uRI, URI uRI2) {
        return uRI.relativize(uRI2);
    }

    public static URL a(URI uRI) {
        return uRI.toURL();
    }

    public static URI a(String string) {
        return URI.create(string);
    }

    public static String d(URI uRI) {
        return uRI.getPath();
    }

    public static String b(URI uRI) {
        return uRI.getHost();
    }

    public static String c(URI uRI) {
        return uRI.getScheme();
    }
}

