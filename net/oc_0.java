/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBVertexShader
 */
package net;

import org.lwjgl.opengl.ARBVertexShader;

/*
 * Renamed from net.Oc
 */
public class oc_0 {
    public static int a(int n, CharSequence charSequence) {
        return ARBVertexShader.glGetAttribLocationARB((int)n, (CharSequence)charSequence);
    }

    public static void a(int n, int n2, CharSequence charSequence) {
        ARBVertexShader.glBindAttribLocationARB((int)n, (int)n2, (CharSequence)charSequence);
    }
}

