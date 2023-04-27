/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.cert.Certificate;
import java.util.jar.JarEntry;

public class a5C {
    public static String b(JarEntry jarEntry) {
        return jarEntry.getName();
    }

    public static boolean c(JarEntry jarEntry) {
        return jarEntry.isDirectory();
    }

    public static Certificate[] a(JarEntry jarEntry) {
        return jarEntry.getCertificates();
    }
}

