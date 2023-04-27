/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.ady_2;
import net.ay_2;
import org.lwjgl.util.vector.Vector3f;

public class aYX {
    public static Vector3f a(Vector3f vector3f, Vector3f vector3f2) {
        vector3f.x *= vector3f2.x;
        vector3f.y *= vector3f2.y;
        vector3f.z *= vector3f2.z;
        return vector3f;
    }

    public static Vector3f[] c(Vector3f[] vector3fArray, float f) {
        ay_2.c();
        int n = 0;
        if (n < vector3fArray.length) {
            vector3fArray[n] = aYX.c(vector3fArray[n], f);
            ++n;
        }
        return vector3fArray;
    }

    public static Vector3f b(Vector3f vector3f, float f) {
        ay_2.c();
        Vector3f vector3f2 = vector3f;
        if (vector3f.x > f) {
            vector3f2.x = f;
        }
        if (vector3f.y > f) {
            vector3f2.y = f;
        }
        if (vector3f.z > f) {
            vector3f2.z = f;
        }
        return vector3f2;
    }

    public static Vector3f c(Vector3f vector3f, float f) {
        Vector3f vector3f2 = new Vector3f();
        Vector3f vector3f3 = new Vector3f();
        vector3f2.x = (float)MathInvoker.m((double)(-f / 180.0f) * Math.PI);
        vector3f2.z = (float)MathInvoker.i((double)(-f / 180.0f) * Math.PI);
        ady_2.c(vector3f2);
        vector3f2.x *= -vector3f.x;
        vector3f2.z *= vector3f.x;
        vector3f3.x = (float)MathInvoker.i((double)(-f / 180.0f) * Math.PI);
        vector3f3.z = (float)MathInvoker.m((double)(-f / 180.0f) * Math.PI);
        ady_2.c(vector3f3);
        vector3f3.x *= vector3f.z;
        vector3f3.z *= vector3f.z;
        vector3f = new Vector3f(vector3f2.x + vector3f3.x, vector3f.y, vector3f2.z + vector3f3.z);
        return vector3f;
    }

    public static Vector3f d(Vector3f vector3f, float f) {
        Vector3f vector3f2 = new Vector3f();
        ay_2.c();
        Vector3f vector3f3 = new Vector3f();
        vector3f2.x = (float)MathInvoker.i((double)((f - 90.0f) / 180.0f) * Math.PI);
        vector3f2.y = (float)MathInvoker.m((double)((f - 90.0f) / 180.0f) * Math.PI);
        ady_2.c(vector3f2);
        vector3f2.x *= -vector3f.x;
        vector3f2.y *= vector3f.x;
        vector3f3.x = (float)MathInvoker.m((double)((f - 90.0f) / 180.0f) * Math.PI);
        vector3f3.y = (float)MathInvoker.i((double)((f - 90.0f) / 180.0f) * Math.PI);
        ady_2.c(vector3f3);
        vector3f3.x *= -vector3f.y;
        vector3f3.y *= -vector3f.y;
        vector3f = new Vector3f(vector3f3.x + vector3f2.x, vector3f3.y + vector3f2.y, vector3f.z);
        ListInvoker.b(new ListInvoker[4]);
        return vector3f;
    }

    public static Vector3f[] b(Vector3f[] vector3fArray, float f) {
        ay_2.b();
        int n = 0;
        if (n < vector3fArray.length) {
            vector3fArray[n] = aYX.a(vector3fArray[n], f);
            ++n;
        }
        return vector3fArray;
    }

    public static float b(float f, float f2) {
        ay_2.b();
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public static Vector3f[] a(Vector3f[] vector3fArray, float f) {
        ay_2.c();
        int n = 0;
        if (n < vector3fArray.length) {
            vector3fArray[n] = aYX.d(vector3fArray[n], f);
            ++n;
        }
        return vector3fArray;
    }

    public static Vector3f a(Vector3f vector3f, float f) {
        Vector3f vector3f2 = new Vector3f();
        Vector3f vector3f3 = new Vector3f();
        vector3f2.y = (float)MathInvoker.m((double)((180.0f + f) / 180.0f) * Math.PI);
        vector3f2.z = (float)MathInvoker.i((double)((180.0f + f) / 180.0f) * Math.PI);
        ady_2.c(vector3f2);
        vector3f2.y *= -vector3f.y;
        int n = ay_2.c();
        vector3f2.z *= vector3f.y;
        vector3f3.y = (float)MathInvoker.i((double)((180.0f + f) / 180.0f) * Math.PI);
        vector3f3.z = (float)MathInvoker.m((double)((180.0f + f) / 180.0f) * Math.PI);
        ady_2.c(vector3f3);
        vector3f3.y *= -vector3f.z;
        vector3f3.z *= -vector3f.z;
        vector3f = new Vector3f(vector3f.x, vector3f2.y + vector3f3.y, vector3f2.z + vector3f3.z);
        if (ListInvoker.b() != null) {
            ay_2.b(++n);
        }
        return vector3f;
    }

    public static Vector3f[] b(Vector3f[] vector3fArray, Vector3f vector3f) {
        ay_2.c();
        int n = 0;
        if (n < vector3fArray.length) {
            vector3fArray[n] = aYX.b(vector3fArray[n], vector3f);
            ++n;
        }
        return vector3fArray;
    }

    public static Vector3f[] a(Vector3f[] vector3fArray, Vector3f vector3f) {
        ay_2.c();
        int n = 0;
        if (n < vector3fArray.length) {
            vector3fArray[n] = aYX.a(vector3fArray[n], vector3f);
            ++n;
        }
        return vector3fArray;
    }

    public static float a(float f, float f2) {
        ay_2.b();
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public static Vector3f b(Vector3f vector3f, Vector3f vector3f2) {
        vector3f.x += vector3f2.x;
        vector3f.y += vector3f2.y;
        vector3f.z += vector3f2.z;
        return vector3f;
    }
}

