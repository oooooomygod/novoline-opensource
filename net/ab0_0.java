/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.a5t_0;
import net.a8q_0;
import net.aL0;
import net.adn_0;
import net.afs_2;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.ab0
 */
public class ab0_0 {
    public static synchronized void a(int n) {
        GL11.glDeleteLists((int)n, (int)1);
    }

    public static FloatBuffer e(int n) {
        return a8q_0.g(ab0_0.d(n << 2));
    }

    public static synchronized int c(int n) {
        GL11.glGenLists((int)n);
        int n2 = GL11.glGetError();
        String string = a5t_0.c;
        string = afs_2.a(n2);
        throw new IllegalStateException(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), a5t_0.b), n), a5t_0.d), n2), a5t_0.a), string).toString());
    }

    public static IntBuffer b(int n) {
        return a8q_0.e(ab0_0.d(n << 2));
    }

    public static synchronized ByteBuffer d(int n) {
        return a8q_0.a(a8q_0.a(n), adn_0.a());
    }

    public static synchronized void a(int n, int n2) {
        GL11.glDeleteLists((int)n, (int)n2);
    }
}

