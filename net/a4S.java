/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package net;

import org.lwjgl.util.vector.Matrix;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class a4S {
    public static Matrix a(Matrix4f matrix4f) {
        return matrix4f.setIdentity();
    }

    public static Vector4f a(Matrix4f matrix4f, Vector4f vector4f, Vector4f vector4f2) {
        return Matrix4f.transform((Matrix4f)matrix4f, (Vector4f)vector4f, (Vector4f)vector4f2);
    }

    public static Matrix4f a(Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3) {
        return Matrix4f.mul((Matrix4f)matrix4f, (Matrix4f)matrix4f2, (Matrix4f)matrix4f3);
    }

    public static Matrix4f a(float f, Vector3f vector3f, Matrix4f matrix4f, Matrix4f matrix4f2) {
        return Matrix4f.rotate((float)f, (Vector3f)vector3f, (Matrix4f)matrix4f, (Matrix4f)matrix4f2);
    }
}

