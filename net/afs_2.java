/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.glu.GLU
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.util.glu.GLU;

/*
 * Renamed from net.afs
 */
public class afs_2 {
    private static ListInvoker[] b;

    public static void a(float f, float f2, float f3, float f4) {
        GLU.gluPerspective((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static String a(int n) {
        return GLU.gluErrorString((int)n);
    }

    public static boolean b(float f, float f2, float f3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, IntBuffer intBuffer, FloatBuffer floatBuffer3) {
        afs_2.b();
        boolean bl = GLU.gluUnProject((float)f, (float)f2, (float)f3, (FloatBuffer)floatBuffer, (FloatBuffer)floatBuffer2, (IntBuffer)intBuffer, (FloatBuffer)floatBuffer3);
        ListInvoker.b(new ListInvoker[4]);
        return bl;
    }

    static {
        if (afs_2.b() != null) {
            afs_2.b(new ListInvoker[1]);
        }
    }

    public static boolean a(float f, float f2, float f3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, IntBuffer intBuffer, FloatBuffer floatBuffer3) {
        afs_2.b();
        boolean bl = GLU.gluProject((float)f, (float)f2, (float)f3, (FloatBuffer)floatBuffer, (FloatBuffer)floatBuffer2, (IntBuffer)intBuffer, (FloatBuffer)floatBuffer3);
        if (ListInvoker.b() != null) {
            afs_2.b(new ListInvoker[3]);
        }
        return bl;
    }
}

