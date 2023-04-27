/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBMultitexture
 */
package net;

import org.lwjgl.opengl.ARBMultitexture;

/*
 * Renamed from net.aOj
 */
public class aoj_0 {
    public static void a(int n, float f, float f2) {
        ARBMultitexture.glMultiTexCoord2fARB((int)n, (float)f, (float)f2);
    }

    public static void b(int n) {
        ARBMultitexture.glClientActiveTextureARB((int)n);
    }

    public static void a(int n) {
        ARBMultitexture.glActiveTextureARB((int)n);
    }
}

