/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBShaderObjects;

/*
 * Renamed from net.adk
 */
public class adk_2 {
    public static void e(int n) {
        ARBShaderObjects.glUseProgramObjectARB((int)n);
    }

    public static void b(int n, FloatBuffer floatBuffer) {
        ARBShaderObjects.glUniform3ARB((int)n, (FloatBuffer)floatBuffer);
    }

    public static void a(int n, IntBuffer intBuffer) {
        ARBShaderObjects.glUniform2ARB((int)n, (IntBuffer)intBuffer);
    }

    public static int a() {
        return ARBShaderObjects.glCreateProgramObjectARB();
    }

    public static void a(int n, int n2, IntBuffer intBuffer) {
        ARBShaderObjects.glGetObjectParameterARB((int)n, (int)n2, (IntBuffer)intBuffer);
    }

    public static void c(int n, boolean bl, FloatBuffer floatBuffer) {
        ARBShaderObjects.glUniformMatrix2ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void a(int n, float f, float f2, float f3) {
        ARBShaderObjects.glUniform3fARB((int)n, (float)f, (float)f2, (float)f3);
    }

    public static void a(int n, float f, float f2, float f3, float f4) {
        ARBShaderObjects.glUniform4fARB((int)n, (float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void a(int n, FloatBuffer floatBuffer) {
        ARBShaderObjects.glUniform2ARB((int)n, (FloatBuffer)floatBuffer);
    }

    public static void d(int n, FloatBuffer floatBuffer) {
        ARBShaderObjects.glUniform4ARB((int)n, (FloatBuffer)floatBuffer);
    }

    public static void e(int n, int n2) {
        ARBShaderObjects.glUniform1iARB((int)n, (int)n2);
    }

    public static void f(int n) {
        ARBShaderObjects.glValidateProgramARB((int)n);
    }

    public static void c(int n) {
        ARBShaderObjects.glCompileShaderARB((int)n);
    }

    public static String b(int n, int n2) {
        return ARBShaderObjects.glGetInfoLogARB((int)n, (int)n2);
    }

    public static void a(int n, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        ARBShaderObjects.glGetInfoLogARB((int)n, (IntBuffer)intBuffer, (ByteBuffer)byteBuffer);
    }

    public static void a(int n, float f) {
        ARBShaderObjects.glUniform1fARB((int)n, (float)f);
    }

    public static int c(int n, int n2) {
        return ARBShaderObjects.glGetObjectParameteriARB((int)n, (int)n2);
    }

    public static void a(int n, int n2, int n3) {
        ARBShaderObjects.glUniform2iARB((int)n, (int)n2, (int)n3);
    }

    public static void a(int n, boolean bl, FloatBuffer floatBuffer) {
        ARBShaderObjects.glUniformMatrix4ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void b(int n) {
        ARBShaderObjects.glLinkProgramARB((int)n);
    }

    public static void b(int n, boolean bl, FloatBuffer floatBuffer) {
        ARBShaderObjects.glUniformMatrix3ARB((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void a(int n, CharSequence charSequence) {
        ARBShaderObjects.glShaderSourceARB((int)n, (CharSequence)charSequence);
    }

    public static void d(int n, int n2) {
        ARBShaderObjects.glAttachObjectARB((int)n, (int)n2);
    }

    public static void a(int n, ByteBuffer byteBuffer) {
        ARBShaderObjects.glShaderSourceARB((int)n, (ByteBuffer)byteBuffer);
    }

    public static void d(int n, IntBuffer intBuffer) {
        ARBShaderObjects.glUniform4ARB((int)n, (IntBuffer)intBuffer);
    }

    public static void a(int n) {
        ARBShaderObjects.glDeleteObjectARB((int)n);
    }

    public static int b(int n, CharSequence charSequence) {
        return ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)charSequence);
    }

    public static void a(int n, int n2) {
        ARBShaderObjects.glDetachObjectARB((int)n, (int)n2);
    }

    public static int d(int n) {
        return ARBShaderObjects.glCreateShaderObjectARB((int)n);
    }

    public static void b(int n, IntBuffer intBuffer) {
        ARBShaderObjects.glUniform3ARB((int)n, (IntBuffer)intBuffer);
    }

    public static void c(int n, FloatBuffer floatBuffer) {
        ARBShaderObjects.glUniform1ARB((int)n, (FloatBuffer)floatBuffer);
    }

    public static void c(int n, IntBuffer intBuffer) {
        ARBShaderObjects.glUniform1ARB((int)n, (IntBuffer)intBuffer);
    }
}

