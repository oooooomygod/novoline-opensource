/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/*
 * Renamed from net.aju
 */
public class aju_0 {
    private static String b;

    public static void b(String string) {
        b = string;
    }

    public static Enumeration b(ZipFile zipFile) {
        return zipFile.entries();
    }

    public static ZipEntry a(ZipFile zipFile, String string) {
        return zipFile.getEntry(string);
    }

    public static InputStream a(ZipFile zipFile, ZipEntry zipEntry) {
        return zipFile.getInputStream(zipEntry);
    }

    public static void a(ZipFile zipFile) {
        zipFile.close();
    }

    static {
        if (aju_0.b() != null) {
            aju_0.b("sUvDW");
        }
    }

    public static String b() {
        return b;
    }
}

