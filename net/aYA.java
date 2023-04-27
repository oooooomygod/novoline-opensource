/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.OutputStream;

public class aYA {
    public static void a(OutputStream outputStream, byte[] byArray) {
        outputStream.write(byArray);
    }

    public static void a(OutputStream outputStream, byte[] byArray, int n, int n2) {
        outputStream.write(byArray, n, n2);
    }

    public static void b(OutputStream outputStream) {
        outputStream.close();
    }

    public static void a(OutputStream outputStream) {
        outputStream.flush();
    }
}

