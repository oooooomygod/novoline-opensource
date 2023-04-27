/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.zip.Deflater;

public class a1x {
    public static void a(Deflater deflater, byte[] byArray, int n, int n2) {
        deflater.setInput(byArray, n, n2);
    }

    public static int a(Deflater deflater, byte[] byArray) {
        return deflater.deflate(byArray);
    }

    public static boolean c(Deflater deflater) {
        return deflater.finished();
    }

    public static void a(Deflater deflater) {
        deflater.reset();
    }

    public static void b(Deflater deflater) {
        deflater.finish();
    }
}

