/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

/*
 * Renamed from net.dk
 */
public class dk_2 {
    private static String b;

    static {
        if (dk_2.b() != null) {
            dk_2.b("ij8GU");
        }
    }

    public static Enumeration a(JarFile jarFile) {
        return jarFile.entries();
    }

    public static InputStream a(JarFile jarFile, ZipEntry zipEntry) {
        return jarFile.getInputStream(zipEntry);
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    public static Manifest b(JarFile jarFile) {
        return jarFile.getManifest();
    }
}

