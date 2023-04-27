/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import net.aWW;
import net.ajJ;
import org.lwjgl.util.vector.Vector3f;

/*
 * Renamed from net.ay
 */
public class ay_2 {
    public Vector3f f = new Vector3f(0.0f, 0.0f, 0.0f);
    public Vector3f b;
    public Vector3f c;
    private static int d;
    public Vector3f a;
    public Vector3f e = new Vector3f(0.0f, 0.0f, 0.0f);

    public void a(ay_2 ay_22) {
        this.a = ay_22.a;
        this.b = ay_22.b;
        this.c = ay_22.c;
        this.f = ay_22.f;
        this.e = ay_22.e;
    }

    public void c(float f) {
        this.c(f, 0.6f);
    }

    public void a(float f) {
        this.a(new Vector3f(0.0f, 0.0f, 0.0f), f);
    }

    public static int c() {
        ay_2.b();
        return 109;
    }

    public void g(float f) {
        this.f.x = f;
        this.e.x = f;
        this.c.x = f;
        this.a.x = 1.0f;
    }

    public static int b() {
        return d;
    }

    public void f(float f) {
        ay_2.c();
        this.a.x += f * this.b.x;
        this.a.y += f * this.b.y;
        this.a.z += f * this.b.z;
        this.a = aWW.a(this.a, 1.0f);
        if (this.a.x >= 1.0f) {
            this.f.x = this.e.x = this.c.x;
        }
        this.e.x = this.f.x + (this.c.x - this.f.x) * this.a.x;
        if (this.a.y >= 1.0f) {
            this.f.y = this.e.y = this.c.y;
        }
        this.e.y = this.f.y + (this.c.y - this.f.y) * this.a.y;
        if (this.a.z >= 1.0f) {
            this.f.z = this.e.z = this.c.z;
        }
        this.e.z = this.f.z + (this.c.z - this.f.z) * this.a.z;
        this.a(new Vector3f(0.0f, 0.0f, 0.0f), 0.5f);
    }

    public void d() {
        this.a(1.0f);
    }

    public void h(float f) {
        this.a(f, 0.6f);
    }

    public void a(float f, float f2) {
        ay_2.c();
        if (this.c.x != f) {
            this.c.x = f;
            this.f.x = this.e.x;
            this.a.x = 0.0f;
        }
        this.b.x = f2;
    }

    public ay_2() {
        this.c = new Vector3f(0.0f, 0.0f, 0.0f);
        this.b = new Vector3f(1.0f, 1.0f, 1.0f);
        this.a = new Vector3f(0.0f, 0.0f, 0.0f);
    }

    public float a() {
        return this.e.z;
    }

    public void a(ajJ ajJ2, float f, float f2) {
        ay_2.c();
        if ((ajJ2 == ajJ.X ? this.c.x : (ajJ2 == ajJ.Y ? this.c.y : this.c.z)) != f) {
            if (ajJ2 == ajJ.X) {
                this.c.x = f;
            }
            if (ajJ2 == ajJ.Y) {
                this.c.y = f;
            }
            if (ajJ2 == ajJ.Z) {
                this.c.z = f;
            }
            if (ajJ2 == ajJ.X) {
                this.f.x = this.e.x;
            }
            if (ajJ2 == ajJ.Y) {
                this.f.y = this.e.y;
            }
            if (ajJ2 == ajJ.Z) {
                this.f.z = this.e.z;
            }
            if (ajJ2 == ajJ.X) {
                this.a.x = 0.0f;
            }
            if (ajJ2 == ajJ.Y) {
                this.a.y = 0.0f;
            }
            if (ajJ2 == ajJ.Z) {
                this.a.z = 0.0f;
            }
        }
        if (ajJ2 == ajJ.X) {
            this.b.x = f2;
        }
        if (ajJ2 == ajJ.Y) {
            this.b.y = f2;
        }
        if (ajJ2 == ajJ.Z) {
            this.b.z = f2;
        }
    }

    public void d(float f) {
        this.f.y = f;
        this.e.y = f;
        this.c.y = f;
        this.a.y = 1.0f;
    }

    public void b(float f, float f2) {
        ay_2.c();
        if (this.c.z != f) {
            this.c.z = f;
            this.f.z = this.e.z;
            this.a.z = 0.0f;
        }
        this.b.z = f2;
    }

    static {
        if (ay_2.c() == 0) {
            ay_2.b(24);
        }
    }

    public void e(float f) {
        this.f.z = f;
        this.e.z = f;
        this.c.z = f;
        this.a.z = 1.0f;
    }

    public float e() {
        return this.e.x;
    }

    public float f() {
        return this.e.y;
    }

    public void a(Vector3f vector3f, float f) {
        ay_2.b();
        if (this.c != vector3f) {
            this.c = vector3f;
            this.f = this.e;
            this.a = new Vector3f(0.0f, 0.0f, 0.0f);
            this.b = new Vector3f(f, f, f);
        }
    }

    public void c(float f, float f2) {
        ay_2.c();
        if (this.c.y != f) {
            this.c.y = f;
            this.f.y = this.e.y;
            this.a.y = 0.0f;
        }
        this.b.y = f2;
    }

    public void b(float f) {
        this.b(f, 0.6f);
    }

    public void a(Vector3f vector3f) {
        this.a(vector3f, 1.0f);
    }

    public static void b(int n) {
        d = n;
    }
}

