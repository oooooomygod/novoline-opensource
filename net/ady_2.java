/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.ady
 */
public class ady_2 {
    private static int b;

    public static Vector3f a(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        return Vector3f.sub((Vector3f)vector3f, (Vector3f)vector3f2, (Vector3f)vector3f3);
    }

    public static Vector a(Vector3f vector3f, float f) {
        return vector3f.scale(f);
    }

    public static int a() {
        ady_2.b();
        return 119;
    }

    static {
        if (ady_2.a() == 0) {
            ady_2.b(11);
        }
    }

    public static float d(Vector3f vector3f) {
        return vector3f.getZ();
    }

    public static float a(Vector3f vector3f, Vector3f vector3f2) {
        return Vector3f.dot((Vector3f)vector3f, (Vector3f)vector3f2);
    }

    public static void b(int n) {
        b = n;
    }

    public static float a(Vector3f vector3f) {
        return vector3f.getX();
    }

    public static Vector3f c(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        return Vector3f.add((Vector3f)vector3f, (Vector3f)vector3f2, (Vector3f)vector3f3);
    }

    public static Vector3f a(Vector3f vector3f, ReadableVector3f readableVector3f) {
        return vector3f.set(readableVector3f);
    }

    public static Vector3f b(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        return Vector3f.cross((Vector3f)vector3f, (Vector3f)vector3f2, (Vector3f)vector3f3);
    }

    public static Vector c(Vector3f vector3f) {
        return vector3f.normalise();
    }

    public static void a(Vector3f vector3f, float f, float f2, float f3) {
        vector3f.set(f, f2, f3);
    }

    public static int b() {
        return b;
    }

    public static float b(Vector3f vector3f) {
        return vector3f.getY();
    }
}

