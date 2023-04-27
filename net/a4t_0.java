/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL30
 */
package net;

import org.lwjgl.opengl.GL30;

/*
 * Renamed from net.a4t
 */
public class a4t_0 {
    public static void a(int n) {
        GL30.glGenerateMipmap((int)n);
    }

    public static String a(int n, int n2) {
        return GL30.glGetStringi((int)n, (int)n2);
    }
}

