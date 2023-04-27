/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public class aSZ {
    public Vector3f c;
    public Vector3f a;
    public Vector3f b;
    public static aSZ d = new aSZ(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));

    public int hashCode() {
        int n = this.a.hashCode();
        n = 31 * n + this.b.hashCode();
        n = 31 * n + this.c.hashCode();
        return n;
    }

    public aSZ(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        this.a = new Vector3f((ReadableVector3f)vector3f);
        this.b = new Vector3f((ReadableVector3f)vector3f2);
        this.c = new Vector3f((ReadableVector3f)vector3f3);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        aSZ aSZ2 = (aSZ)object;
        return this.a.equals((Object)aSZ2.a) && this.c.equals((Object)aSZ2.c) && this.b.equals((Object)aSZ2.b);
    }
}

