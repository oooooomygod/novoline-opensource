/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import sun.misc.IOUtils;

/*
 * Renamed from net.asA
 */
public class asa_1 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    public static byte[] a(InputStream inputStream, int n, boolean bl) {
        return IOUtils.readFully(inputStream, n, bl);
    }

    static {
        if (asa_1.b() == null) {
            asa_1.b(new String[3]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

