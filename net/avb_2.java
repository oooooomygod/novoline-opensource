/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBVertexBufferObject
 */
package net;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.ARBVertexBufferObject;

/*
 * Renamed from net.avb
 */
public class avb_2 {
    public static void a(int n, ByteBuffer byteBuffer, int n2) {
        ARBVertexBufferObject.glBufferDataARB((int)n, (ByteBuffer)byteBuffer, (int)n2);
    }

    public static int a() {
        return ARBVertexBufferObject.glGenBuffersARB();
    }

    public static void a(int n, int n2) {
        ARBVertexBufferObject.glBindBufferARB((int)n, (int)n2);
    }

    public static void a(int n) {
        ARBVertexBufferObject.glDeleteBuffersARB((int)n);
    }
}

