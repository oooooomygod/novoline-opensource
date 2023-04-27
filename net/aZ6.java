/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;

public class aZ6 {
    public static int a(InputStream inputStream, byte[] byArray) {
        return inputStream.read(byArray);
    }

    public static void b(InputStream inputStream) {
        inputStream.close();
    }

    public static int a(InputStream inputStream) {
        return inputStream.read();
    }

    public static int a(InputStream inputStream, byte[] byArray, int n, int n2) {
        return inputStream.read(byArray, n, n2);
    }
}

