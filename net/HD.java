/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.nio.Buffer;
import java.nio.IntBuffer;

public class HD {
    public static int g(IntBuffer intBuffer) {
        return intBuffer.get();
    }

    public static IntBuffer i(IntBuffer intBuffer) {
        return intBuffer.slice();
    }

    public static int a(IntBuffer intBuffer) {
        return intBuffer.capacity();
    }

    public static int f(IntBuffer intBuffer) {
        return intBuffer.limit();
    }

    public static Buffer h(IntBuffer intBuffer) {
        return intBuffer.clear();
    }

    public static IntBuffer a(IntBuffer intBuffer, int n, int n2) {
        return intBuffer.put(n, n2);
    }

    public static IntBuffer a(IntBuffer intBuffer, int[] nArray) {
        return intBuffer.get(nArray);
    }

    public static Buffer c(IntBuffer intBuffer, int n) {
        return intBuffer.limit(n);
    }

    public static Buffer a(IntBuffer intBuffer, int n) {
        return intBuffer.position(n);
    }

    public static Buffer d(IntBuffer intBuffer) {
        return intBuffer.rewind();
    }

    public static IntBuffer b(IntBuffer intBuffer, int[] nArray) {
        return intBuffer.put(nArray);
    }

    public static IntBuffer a(IntBuffer intBuffer, IntBuffer intBuffer2) {
        return intBuffer.put(intBuffer2);
    }

    public static IntBuffer d(IntBuffer intBuffer, int n) {
        return intBuffer.put(n);
    }

    public static Buffer c(IntBuffer intBuffer) {
        return intBuffer.flip();
    }

    public static int e(IntBuffer intBuffer) {
        return intBuffer.remaining();
    }

    public static IntBuffer a(IntBuffer intBuffer, int[] nArray, int n, int n2) {
        return intBuffer.put(nArray, n, n2);
    }

    public static int b(IntBuffer intBuffer) {
        return intBuffer.position();
    }

    public static int b(IntBuffer intBuffer, int n) {
        return intBuffer.get(n);
    }
}

