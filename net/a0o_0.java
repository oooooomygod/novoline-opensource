/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.ByteArrayOutputStream;

/*
 * Renamed from net.a0o
 */
public class a0o_0 {
    public static void a(ByteArrayOutputStream byteArrayOutputStream, byte[] byArray, int n, int n2) {
        byteArrayOutputStream.write(byArray, n, n2);
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, byte[] byArray) {
        byteArrayOutputStream.write(byArray);
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, int n) {
        byteArrayOutputStream.write(n);
    }

    public static byte[] a(ByteArrayOutputStream byteArrayOutputStream) {
        return byteArrayOutputStream.toByteArray();
    }
}

