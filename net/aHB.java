/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.nio.Buffer;
import java.nio.FloatBuffer;

public class aHB {
    private static boolean b;

    public static FloatBuffer a(FloatBuffer floatBuffer, float[] fArray) {
        return floatBuffer.put(fArray);
    }

    public static FloatBuffer a(FloatBuffer floatBuffer, float[] fArray, int n, int n2) {
        return floatBuffer.get(fArray, n, n2);
    }

    public static FloatBuffer a(FloatBuffer floatBuffer, float f) {
        return floatBuffer.put(f);
    }

    public static FloatBuffer a(FloatBuffer floatBuffer, int n, float f) {
        return floatBuffer.put(n, f);
    }

    public static FloatBuffer a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        return floatBuffer.put(floatBuffer2);
    }

    public static Buffer a(FloatBuffer floatBuffer, int n) {
        return floatBuffer.position(n);
    }

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static Buffer a(FloatBuffer floatBuffer) {
        return floatBuffer.clear();
    }

    public static boolean c() {
        aHB.b();
        return true;
    }

    public static float b(FloatBuffer floatBuffer, int n) {
        return floatBuffer.get(n);
    }

    public static FloatBuffer b(FloatBuffer floatBuffer, float[] fArray) {
        return floatBuffer.get(fArray);
    }

    public static Buffer b(FloatBuffer floatBuffer) {
        return floatBuffer.flip();
    }

    static {
        if (aHB.c()) {
            aHB.b(true);
        }
    }
}

