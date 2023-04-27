/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL13
 */
package net;

import org.lwjgl.opengl.GL13;

/*
 * Renamed from net.aQg
 */
public class aqg_0 {
    public static void a(int n, float f, float f2) {
        GL13.glMultiTexCoord2f((int)n, (float)f, (float)f2);
    }

    public static void b(int n) {
        GL13.glActiveTexture((int)n);
    }

    public static void a(int n) {
        GL13.glClientActiveTexture((int)n);
    }
}

