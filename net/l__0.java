/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 */
package net;

import org.lwjgl.opengl.EXTFramebufferObject;

/*
 * Renamed from net.l_
 */
public class l__0 {
    public static void a(int n, int n2) {
        EXTFramebufferObject.glBindFramebufferEXT((int)n, (int)n2);
    }

    public static void b(int n) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)n);
    }

    public static void a(int n, int n2, int n3, int n4) {
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static int c(int n) {
        return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n);
    }

    public static void a(int n, int n2, int n3, int n4, int n5) {
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static int a() {
        return EXTFramebufferObject.glGenFramebuffersEXT();
    }

    public static void a(int n) {
        EXTFramebufferObject.glDeleteFramebuffersEXT((int)n);
    }

    public static void b(int n, int n2) {
        EXTFramebufferObject.glBindRenderbufferEXT((int)n, (int)n2);
    }

    public static int b() {
        return EXTFramebufferObject.glGenRenderbuffersEXT();
    }

    public static void b(int n, int n2, int n3, int n4) {
        EXTFramebufferObject.glRenderbufferStorageEXT((int)n, (int)n2, (int)n3, (int)n4);
    }
}

