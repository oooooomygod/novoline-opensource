/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.Files
 */
package net;

import com.google.common.io.Files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.Charset;

public class aWM {
    private static String b = "bR2wIb";

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static BufferedWriter b(File file, Charset charset) {
        return Files.newWriter((File)file, (Charset)charset);
    }

    public static BufferedReader a(File file, Charset charset) {
        return Files.newReader((File)file, (Charset)charset);
    }

    public static byte[] a(File file) {
        return Files.toByteArray((File)file);
    }

    static {
        if (aWM.b() == null) {
            aWM.b("bR2wIb");
        }
    }
}

