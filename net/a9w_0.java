/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package net;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;

/*
 * Renamed from net.a9w
 */
public class a9w_0 {
    private static int b;

    public static FloatBuffer a(int n) {
        return BufferUtils.createFloatBuffer((int)n);
    }

    public static void c(int n) {
        b = n;
    }

    public static ByteBuffer d(int n) {
        return BufferUtils.createByteBuffer((int)n);
    }

    public static int b() {
        return b;
    }

    public static int c() {
        a9w_0.b();
        return 20;
    }

    public static IntBuffer b(int n) {
        return BufferUtils.createIntBuffer((int)n);
    }

    static {
        if (a9w_0.c() != 0) {
            a9w_0.c(96);
        }
    }
}

