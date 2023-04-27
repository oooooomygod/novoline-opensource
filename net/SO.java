/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.RandomAccessFile;

public class SO {
    public static int b(RandomAccessFile randomAccessFile) {
        return randomAccessFile.readInt();
    }

    public static void b(RandomAccessFile randomAccessFile, int n) {
        randomAccessFile.write(n);
    }

    public static void a(RandomAccessFile randomAccessFile, long l4) {
        randomAccessFile.seek(l4);
    }

    public static long c(RandomAccessFile randomAccessFile) {
        return randomAccessFile.length();
    }

    public static byte a(RandomAccessFile randomAccessFile) {
        return randomAccessFile.readByte();
    }

    public static void a(RandomAccessFile randomAccessFile, byte[] byArray, int n, int n2) {
        randomAccessFile.write(byArray, n, n2);
    }

    public static int b(RandomAccessFile randomAccessFile, byte[] byArray) {
        return randomAccessFile.read(byArray);
    }

    public static void c(RandomAccessFile randomAccessFile, int n) {
        randomAccessFile.writeByte(n);
    }

    public static void a(RandomAccessFile randomAccessFile, byte[] byArray) {
        randomAccessFile.write(byArray);
    }

    public static void a(RandomAccessFile randomAccessFile, int n) {
        randomAccessFile.writeInt(n);
    }
}

