/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.util.vector.Matrix4f
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.OpenGlHelper;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.HD;
import net.a9w_0;
import net.aHB;
import net.aL0;
import net.ahd_2;
import net.atp_0;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.vector.Matrix4f;

/*
 * Renamed from net.Gu
 */
public class gu_0 {
    private static Logger a = LogManagerInvoker.c();
    private FloatBuffer e;
    private int c;
    private int b;
    private atp_0 f;
    private int g;
    private String h;
    private IntBuffer i;
    private boolean d;

    public void a(float[] fArray) {
        if (fArray.length < this.g) {
            LoggerInvoker.warn(a, aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ahd_2.j), this.g), ahd_2.b), fArray.length), ahd_2.k).toString());
        } else {
            aHB.a(this.e, 0);
            aHB.a(this.e, fArray);
            aHB.a(this.e, 0);
            this.d();
        }
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        aHB.a(this.e, 0);
        aHB.a(this.e, 0, f);
        aHB.a(this.e, 1, f2);
        aHB.a(this.e, 2, f3);
        aHB.a(this.e, 3, f4);
        aHB.a(this.e, 4, f5);
        aHB.a(this.e, 5, f6);
        aHB.a(this.e, 6, f7);
        aHB.a(this.e, 7, f8);
        aHB.a(this.e, 8, f9);
        aHB.a(this.e, 9, f10);
        aHB.a(this.e, 10, f11);
        aHB.a(this.e, 11, f12);
        aHB.a(this.e, 12, f13);
        aHB.a(this.e, 13, f14);
        aHB.a(this.e, 14, f15);
        aHB.a(this.e, 15, f16);
        this.d();
    }

    private void d() {
        this.d = true;
        if (this.f != null) {
            this.f.a();
        }
    }

    public void a(float f) {
        aHB.a(this.e, 0);
        aHB.a(this.e, 0, f);
        this.d();
    }

    public void a(Matrix4f matrix4f) {
        this.a(matrix4f.m00, matrix4f.m01, matrix4f.m02, matrix4f.m03, matrix4f.m10, matrix4f.m11, matrix4f.m12, matrix4f.m13, matrix4f.m20, matrix4f.m21, matrix4f.m22, matrix4f.m23, matrix4f.m30, matrix4f.m31, matrix4f.m32, matrix4f.m33);
    }

    private void c() {
        switch (this.c) {
            case 4: {
                OpenGlHelper.b(this.b, this.e);
                break;
            }
            case 5: {
                OpenGlHelper.d(this.b, this.e);
                break;
            }
            case 6: {
                OpenGlHelper.c(this.b, this.e);
                break;
            }
            case 7: {
                OpenGlHelper.a(this.b, this.e);
                break;
            }
            default: {
                LoggerInvoker.warn(a, aL0.a(aL0.c(aL0.a(new StringBuilder(), ahd_2.g), this.g), ahd_2.a).toString());
            }
        }
    }

    public void e() {
        if (!this.d) {
            // empty if block
        }
        this.d = false;
        if (this.c <= 3) {
            this.a();
        } else if (this.c <= 7) {
            this.c();
        } else {
            if (this.c > 10) {
                LoggerInvoker.warn(a, aL0.a(aL0.c(aL0.a(new StringBuilder(), ahd_2.d), this.c), ahd_2.i).toString());
                return;
            }
            this.b();
        }
    }

    public void a(int n, int n2, int n3, int n4) {
        HD.a(this.i, 0);
        if (this.c >= 0) {
            HD.a(this.i, 0, n);
        }
        if (this.c >= 1) {
            HD.a(this.i, 1, n2);
        }
        if (this.c >= 2) {
            HD.a(this.i, 2, n3);
        }
        if (this.c >= 3) {
            HD.a(this.i, 3, n4);
        }
        this.d();
    }

    public void a(float f, float f2, float f3) {
        aHB.a(this.e, 0);
        aHB.a(this.e, 0, f);
        aHB.a(this.e, 1, f2);
        aHB.a(this.e, 2, f3);
        this.d();
    }

    public static int a(String string) {
        int n = -1;
        if (string.equals(ahd_2.n)) {
            n = 0;
        } else if (string.equals(ahd_2.c)) {
            n = 4;
        } else if (StringInvoker.e(string, ahd_2.m)) {
            if (StringInvoker.c(string, ahd_2.e)) {
                n = 8;
            } else if (StringInvoker.c(string, ahd_2.h)) {
                n = 9;
            } else if (StringInvoker.c(string, ahd_2.o)) {
                n = 10;
            }
        }
        return n;
    }

    public gu_0(String string, int n, int n2, atp_0 atp_02) {
        this.h = string;
        this.g = n2;
        this.c = n;
        this.f = atp_02;
        if (n <= 3) {
            this.i = a9w_0.b(n2);
            this.e = null;
        } else {
            this.i = null;
            this.e = a9w_0.a(n2);
        }
        this.b = -1;
        this.d();
    }

    public void a(int n) {
        this.b = n;
    }

    private void b() {
        switch (this.c) {
            case 8: {
                OpenGlHelper.b(this.b, true, this.e);
                break;
            }
            case 9: {
                OpenGlHelper.a(this.b, true, this.e);
                break;
            }
            case 10: {
                OpenGlHelper.c(this.b, true, this.e);
            }
        }
    }

    public void a(float f, float f2) {
        aHB.a(this.e, 0);
        aHB.a(this.e, 0, f);
        aHB.a(this.e, 1, f2);
        this.d();
    }

    public void b(float f, float f2, float f3, float f4) {
        aHB.a(this.e, 0);
        aHB.a(this.e, f);
        aHB.a(this.e, f2);
        aHB.a(this.e, f3);
        aHB.a(this.e, f4);
        aHB.b(this.e);
        this.d();
    }

    public String f() {
        return this.h;
    }

    public void a(float f, float f2, float f3, float f4) {
        aHB.a(this.e, 0);
        if (this.c >= 4) {
            aHB.a(this.e, 0, f);
        }
        if (this.c >= 5) {
            aHB.a(this.e, 1, f2);
        }
        if (this.c >= 6) {
            aHB.a(this.e, 2, f3);
        }
        if (this.c >= 7) {
            aHB.a(this.e, 3, f4);
        }
        this.d();
    }

    private void a() {
        switch (this.c) {
            case 0: {
                OpenGlHelper.b(this.b, this.i);
                break;
            }
            case 1: {
                OpenGlHelper.d(this.b, this.i);
                break;
            }
            case 2: {
                OpenGlHelper.c(this.b, this.i);
                break;
            }
            case 3: {
                OpenGlHelper.a(this.b, this.i);
                break;
            }
            default: {
                LoggerInvoker.warn(a, aL0.a(aL0.c(aL0.a(new StringBuilder(), ahd_2.f), this.g), ahd_2.l).toString());
            }
        }
    }
}

