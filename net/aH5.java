/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import deobf.OpenGlHelper;
import java.nio.ByteBuffer;

import org.lwjgl.opengl.GL11;

public class aH5 {
    private VertexFormat a;
    private int c;
    private int b;

    public void a(ByteBuffer byteBuffer) {
        this.b();
        OpenGlHelper.a(apl_1.w, byteBuffer, 35044);
        this.c();
        this.c = a8q_0.a(byteBuffer) / zv_2.a(this.a);
    }

    public void b() {
        OpenGlHelper.b(apl_1.w, this.b);
    }

    public aH5(VertexFormat aqn_02) {
        this.a = aqn_02;
        this.b = OpenGlHelper.a();
    }

    public void c() {
        OpenGlHelper.b(apl_1.w, 0);
    }

    public void a() {
        if (this.b >= 0) {
            OpenGlHelper.i(this.b);
            this.b = -1;
        }
    }

    public void a(int n) {
        GL11.glDrawArrays((int)n, (int)0, (int)this.c);
    }
}

