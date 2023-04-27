/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/*
 * Renamed from net.a8q
 */
public class a8q_0 {
    public static ByteBuffer a(ByteBuffer byteBuffer, int n) {
        return byteBuffer.putInt(n);
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return byteBuffer.put(byteBuffer2);
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int n, byte by) {
        return byteBuffer.put(n, by);
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return byteBuffer.slice();
    }

    public static Buffer b(ByteBuffer byteBuffer, int n) {
        return byteBuffer.limit(n);
    }

    public static FloatBuffer g(ByteBuffer byteBuffer) {
        return byteBuffer.asFloatBuffer();
    }

    public static ByteBuffer a(int n) {
        return ByteBuffer.allocateDirect(n);
    }

    public static ShortBuffer h(ByteBuffer byteBuffer) {
        return byteBuffer.asShortBuffer();
    }

    public static ByteBuffer b(int n) {
        return ByteBuffer.allocate(n);
    }

    public static IntBuffer e(ByteBuffer byteBuffer) {
        return byteBuffer.asIntBuffer();
    }

    public static int a(ByteBuffer byteBuffer) {
        return byteBuffer.limit();
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int n, float f) {
        return byteBuffer.putFloat(n, f);
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, byte[] byArray) {
        return byteBuffer.put(byArray);
    }

    public static ByteBuffer b(ByteBuffer byteBuffer, byte[] byArray) {
        return byteBuffer.get(byArray);
    }

    public static Buffer f(ByteBuffer byteBuffer) {
        return byteBuffer.flip();
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int n, short s) {
        return byteBuffer.putShort(n, s);
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, ByteOrder byteOrder) {
        return byteBuffer.order(byteOrder);
    }

    public static Buffer c(ByteBuffer byteBuffer, int n) {
        return byteBuffer.position(n);
    }

    public static Buffer d(ByteBuffer byteBuffer) {
        return byteBuffer.rewind();
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int n, int n2) {
        return byteBuffer.putInt(n, n2);
    }

    public static int b(ByteBuffer byteBuffer) {
        return byteBuffer.capacity();
    }
}

