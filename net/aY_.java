/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package net;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;

public class aY_ {
    public static void g(int n) {
        GL20.glDisableVertexAttribArray((int)n);
    }

    public static void a(int n, float f, float f2) {
        GL20.glUniform2f((int)n, (float)f, (float)f2);
    }

    public static void a(int n, FloatBuffer floatBuffer) {
        GL20.glUniform1((int)n, (FloatBuffer)floatBuffer);
    }

    public static void a(int n, int n2, int n3) {
        GL20.glUniform2i((int)n, (int)n2, (int)n3);
    }

    public static void f(int n) {
        GL20.glEnableVertexAttribArray((int)n);
    }

    public static int a(int n, int n2) {
        return GL20.glGetProgrami((int)n, (int)n2);
    }

    public static int a(int n, CharSequence charSequence) {
        return GL20.glGetUniformLocation((int)n, (CharSequence)charSequence);
    }

    public static void a(int n, int n2, int n3, boolean bl, int n4, long l4) {
        GL20.glVertexAttribPointer((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (long)l4);
    }

    public static void a(int n, float f, float f2, float f3) {
        GL20.glUniform3f((int)n, (float)f, (float)f2, (float)f3);
    }

    public static void b(int n, CharSequence charSequence) {
        GL20.glShaderSource((int)n, (CharSequence)charSequence);
    }

    public static void a(int n, float f, float f2, float f3, float f4) {
        GL20.glUniform4f((int)n, (float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void a(int n, int n2, int n3, int n4) {
        GL20.glUniform3i((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static void d(int n) {
        GL20.glCompileShader((int)n);
    }

    public static void a(IntBuffer intBuffer) {
        GL20.glDrawBuffers((IntBuffer)intBuffer);
    }

    public static void a(int n, float f) {
        GL20.glUniform1f((int)n, (float)f);
    }

    public static void b(int n) {
        GL20.glUseProgram((int)n);
    }

    public static void a(int n) {
        GL20.glLinkProgram((int)n);
    }

    public static String e(int n, int n2) {
        return GL20.glGetProgramInfoLog((int)n, (int)n2);
    }

    public static int b(int n, int n2) {
        return GL20.glGetShaderi((int)n, (int)n2);
    }

    public static void a(int n, int n2, int n3, boolean bl, int n4, ByteBuffer byteBuffer) {
        GL20.glVertexAttribPointer((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (ByteBuffer)byteBuffer);
    }

    public static void c(int n) {
        GL20.glDrawBuffers((int)n);
    }

    public static void d(int n, int n2) {
        GL20.glUniform1i((int)n, (int)n2);
    }

    public static void f(int n, int n2) {
        GL20.glAttachShader((int)n, (int)n2);
    }

    public static int e(int n) {
        return GL20.glCreateShader((int)n);
    }

    public static String c(int n, int n2) {
        return GL20.glGetShaderInfoLog((int)n, (int)n2);
    }

    public static int a() {
        return GL20.glCreateProgram();
    }
}

