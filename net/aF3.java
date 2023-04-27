/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL14
 */
package net;

import org.lwjgl.opengl.GL14;

public class aF3 {
    public static void a(int n) {
        GL14.glBlendEquation((int)n);
    }

    public static void a(int n, int n2, int n3, int n4) {
        GL14.glBlendFuncSeparate((int)n, (int)n2, (int)n3, (int)n4);
    }
}

