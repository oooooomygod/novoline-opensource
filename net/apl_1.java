/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBFramebufferObject
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  oshi.SystemInfo
 *  oshi.hardware.Processor
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.EY;
import net.J;
import net.P8;
import net.a5i;
import net.aDY;
import net.aF3;
import net.aL0;
import net.aXQ;
import net.adk_2;
import net.aj2;
import net.aj_0;
import net.aoj_0;
import net.aqg_0;
import net.avb_2;
import net.l__0;
import net.oc_0;
import net.ys_2;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import oshi.SystemInfo;
import oshi.hardware.Processor;

/*
 * Renamed from net.apL
 */
public class apl_1 {
    public static boolean i;
    public static int s;
    private static boolean v;
    public static boolean a;
    private static boolean Z;
    public static int L;
    public static int n;
    public static boolean u;
    private static int H;
    private static String G;
    public static boolean C;
    public static int x;
    public static int F;
    public static int ae;
    public static int g;
    public static int Q;
    public static int Y;
    public static int M;
    private static boolean j;
    public static int w;
    public static int z;
    public static int o;
    public static int q;
    public static int N;
    public static boolean ac;
    public static boolean I;
    public static int U;
    public static int e;
    public static int X;
    public static int A;
    public static boolean h;
    public static int B;
    private static boolean V;
    public static int t;
    public static int O;
    public static int m;
    public static int D;
    public static int T;
    public static int K;
    public static int y;
    public static int ab;
    public static int b;
    public static int S;
    private static String R = "CL_00001179";
    public static int P;
    public static float ad;
    public static int l;
    public static boolean r;
    public static int aa;
    public static int c;
    private static boolean f;
    public static int k;
    private static boolean d;
    public static int p;
    public static float W;
    public static int E;
    private static String J = "";

    public static void g(int n, int n2) {
        if (r) {
            switch (H) {
                case 0: {
                    GL30.glBindRenderbuffer((int)n, (int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindRenderbuffer((int)n, (int)n2);
                    break;
                }
                case 2: {
                    l__0.b(n, n2);
                }
            }
        }
    }

    public static void a(int n, int n2, int n3, int n4, int n5) {
        if (r) {
            switch (H) {
                case 0: {
                    GL30.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
                    break;
                }
                case 2: {
                    l__0.a(n, n2, n3, n4, n5);
                }
            }
        }
    }

    public static void k(int n) {
        if (d) {
            adk_2.c(n);
        } else {
            GL20.glCompileShader((int)n);
        }
    }

    public static void d(int n, IntBuffer intBuffer) {
        if (d) {
            adk_2.b(n, intBuffer);
        } else {
            GL20.glUniform3((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void a(int n, FloatBuffer floatBuffer) {
        if (d) {
            adk_2.b(n, floatBuffer);
        } else {
            GL20.glUniform3((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void a(int n, float f, float f2) {
        if (V) {
            aoj_0.a(n, f, f2);
        } else {
            aqg_0.a(n, f, f2);
        }
        if (n == ab) {
            W = f;
            ad = f2;
        }
    }

    public static void b(int n, boolean bl, FloatBuffer floatBuffer) {
        if (d) {
            adk_2.a(n, bl, floatBuffer);
        } else {
            GL20.glUniformMatrix4((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static int g() {
        if (!r) {
            return -1;
        }
        switch (H) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return l__0.b();
            }
        }
        return -1;
    }

    public static void d(int n) {
        if (V) {
            aoj_0.b(n);
        } else {
            aqg_0.a(n);
        }
    }

    public static int e(int n) {
        if (!r) {
            return -1;
        }
        switch (H) {
            case 0: {
                return GL30.glCheckFramebufferStatus((int)n);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus((int)n);
            }
            case 2: {
                return l__0.c(n);
            }
        }
        return -1;
    }

    public static int b(int n) {
        return d ? adk_2.d(n) : GL20.glCreateShader((int)n);
    }

    public static String e(int n, int n2) {
        return d ? adk_2.b(n, n2) : GL20.glGetProgramInfoLog((int)n, (int)n2);
    }

    public static void h(int n) {
        if (d) {
            adk_2.a(n);
        } else {
            GL20.glDeleteShader((int)n);
        }
    }

    public static void g(int n) {
        if (V) {
            aoj_0.a(n);
        } else {
            aqg_0.b(n);
        }
    }

    public static int h(int n, int n2) {
        return d ? adk_2.c(n, n2) : GL20.glGetProgrami((int)n, (int)n2);
    }

    public static boolean j() {
        return !ys_2.O() && a && MCInvoker.f().gameSettings.aQ;
    }

    public static String b() {
        return J;
    }

    public static void i(int n) {
        if (r) {
            switch (H) {
                case 0: {
                    GL30.glDeleteRenderbuffers((int)n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteRenderbuffers((int)n);
                    break;
                }
                case 2: {
                    l__0.b(n);
                }
            }
        }
    }

    public static void f(int n) {
        if (v) {
            avb_2.a(n);
        } else {
            GL15.glDeleteBuffers((int)n);
        }
    }

    public static void a(int n) {
        if (r) {
            switch (H) {
                case 0: {
                    GL30.glDeleteFramebuffers((int)n);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glDeleteFramebuffers((int)n);
                    break;
                }
                case 2: {
                    l__0.a(n);
                }
            }
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static void c(int n, boolean bl, FloatBuffer floatBuffer) {
        if (d) {
            adk_2.c(n, bl, floatBuffer);
        } else {
            GL20.glUniformMatrix2((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static void l(int n) {
        if (d) {
            adk_2.a(n);
        } else {
            GL20.glDeleteProgram((int)n);
        }
    }

    public static void a(int n, ByteBuffer byteBuffer) {
        if (d) {
            adk_2.a(n, byteBuffer);
        } else {
            GL20.glShaderSource((int)n, (ByteBuffer)byteBuffer);
        }
    }

    public static int a(int n, CharSequence charSequence) {
        return d ? adk_2.b(n, charSequence) : GL20.glGetUniformLocation((int)n, (CharSequence)charSequence);
    }

    public static int e() {
        return d ? adk_2.a() : GL20.glCreateProgram();
    }

    public static int b(int n, int n2) {
        return d ? adk_2.c(n, n2) : GL20.glGetShaderi((int)n, (int)n2);
    }

    public static void c(int n) {
        if (d) {
            adk_2.e(n);
        } else {
            GL20.glUseProgram((int)n);
        }
    }

    public static void b(int n, IntBuffer intBuffer) {
        if (d) {
            adk_2.d(n, intBuffer);
        } else {
            GL20.glUniform4((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void c(int n, IntBuffer intBuffer) {
        if (d) {
            adk_2.c(n, intBuffer);
        } else {
            GL20.glUniform1((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void d(int n, int n2) {
        if (d) {
            adk_2.e(n, n2);
        } else {
            GL20.glUniform1i((int)n, (int)n2);
        }
    }

    public static boolean i() {
        return u;
    }

    public static int b(int n, CharSequence charSequence) {
        return d ? oc_0.a(n, charSequence) : GL20.glGetAttribLocation((int)n, (CharSequence)charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0005N=aC@yw3Uh".toCharArray();
        int n2 = 0;
        int n3 = 47;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x69));
            n3 = n3;
        }
    }

    public static void d(int n, FloatBuffer floatBuffer) {
        if (d) {
            adk_2.c(n, floatBuffer);
        } else {
            GL20.glUniform1((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void a(int n, boolean bl, FloatBuffer floatBuffer) {
        if (d) {
            adk_2.b(n, bl, floatBuffer);
        } else {
            GL20.glUniformMatrix3((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
        }
    }

    public static String d() {
        return G == null ? aj_0.a : G;
    }

    public static int a() {
        if (!r) {
            return -1;
        }
        switch (H) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return l__0.a();
            }
        }
        return -1;
    }

    public static void i(int n, int n2) {
        if (r) {
            switch (H) {
                case 0: {
                    GL30.glBindFramebuffer((int)n, (int)n2);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glBindFramebuffer((int)n, (int)n2);
                    break;
                }
                case 2: {
                    l__0.a(n, n2);
                }
            }
        }
    }

    public static void c(int n, int n2, int n3, int n4) {
        if (r) {
            switch (H) {
                case 0: {
                    GL30.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glFramebufferRenderbuffer((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 2: {
                    l__0.a(n, n2, n3, n4);
                }
            }
        }
    }

    public static void a(int n, ByteBuffer byteBuffer, int n2) {
        if (v) {
            avb_2.a(n, byteBuffer, n2);
        } else {
            GL15.glBufferData((int)n, (ByteBuffer)byteBuffer, (int)n2);
        }
    }

    public static void h() {
        ys_2.aQ();
        ContextCapabilities contextCapabilities = aXQ.a();
        V = contextCapabilities.GL_ARB_multitexture && !contextCapabilities.OpenGL13;
        f = contextCapabilities.GL_ARB_texture_env_combine && !contextCapabilities.OpenGL13;
        J = V ? aL0.a(aL0.a(new StringBuilder(), J), aj_0.m).toString() : aL0.a(aL0.a(new StringBuilder(), J), aj_0.K).toString();
        S = 33984;
        ab = 33985;
        p = 33986;
        J = f ? aL0.a(aL0.a(new StringBuilder(), J), aj_0.O).toString() : aL0.a(aL0.a(new StringBuilder(), J), aj_0.l).toString();
        k = 34160;
        b = 34165;
        B = 34167;
        T = 34166;
        aa = 34168;
        E = 34161;
        P = 34176;
        U = 34177;
        g = 34178;
        L = 34192;
        N = 34193;
        A = 34194;
        K = 34162;
        n = 34184;
        s = 34185;
        O = 34186;
        m = 34200;
        M = 34201;
        l = 34202;
        h = contextCapabilities.GL_EXT_blend_func_separate && !contextCapabilities.OpenGL14;
        Z = contextCapabilities.OpenGL14 || contextCapabilities.GL_EXT_blend_func_separate;
        boolean bl = r = Z && (contextCapabilities.GL_ARB_framebuffer_object || contextCapabilities.GL_EXT_framebuffer_object || contextCapabilities.OpenGL30);
        if (r) {
            J = aL0.a(aL0.a(new StringBuilder(), J), aj_0.aj).toString();
            if (contextCapabilities.OpenGL30) {
                J = aL0.a(aL0.a(new StringBuilder(), J), aj_0.u).toString();
                H = 0;
                t = 36160;
                y = 36161;
                ae = 36064;
                c = 36096;
                Q = 36053;
                D = 36054;
                X = 36055;
                z = 36059;
                o = 36060;
            } else if (contextCapabilities.GL_ARB_framebuffer_object) {
                J = aL0.a(aL0.a(new StringBuilder(), J), aj_0.p).toString();
                H = 1;
                t = 36160;
                y = 36161;
                ae = 36064;
                c = 36096;
                Q = 36053;
                X = 36055;
                D = 36054;
                z = 36059;
                o = 36060;
            } else if (contextCapabilities.GL_EXT_framebuffer_object) {
                J = aL0.a(aL0.a(new StringBuilder(), J), aj_0.B).toString();
                H = 2;
                t = 36160;
                y = 36161;
                ae = 36064;
                c = 36096;
                Q = 36053;
                X = 36055;
                D = 36054;
                z = 36059;
                o = 36060;
            }
        } else {
            J = aL0.a(aL0.a(new StringBuilder(), J), aj_0.x).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.T), contextCapabilities.OpenGL14 ? aj_0.C : aj_0.t), aj_0.q).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.D), contextCapabilities.GL_EXT_blend_func_separate ? aj_0.R : aj_0.V), aj_0.s).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.S), contextCapabilities.OpenGL30 ? aj_0.o : aj_0.ak), aj_0.W).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.U), contextCapabilities.GL_ARB_framebuffer_object ? aj_0.f : aj_0.ae), aj_0.X).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.n), contextCapabilities.GL_EXT_framebuffer_object ? aj_0.ai : aj_0.af), aj_0.Q).toString();
        }
        C = contextCapabilities.OpenGL21;
        j = C || contextCapabilities.GL_ARB_vertex_shader && contextCapabilities.GL_ARB_fragment_shader && contextCapabilities.GL_ARB_shader_objects;
        J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.g), j ? aj_0.ab : aj_0.ad), aj_0.F).toString();
        if (j) {
            if (contextCapabilities.OpenGL21) {
                J = aL0.a(aL0.a(new StringBuilder(), J), aj_0.j).toString();
                d = false;
            } else {
                J = aL0.a(aL0.a(new StringBuilder(), J), aj_0.A).toString();
                d = true;
            }
            Y = 35714;
            q = 35713;
            F = 35633;
            e = 35632;
        } else {
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.y), contextCapabilities.OpenGL21 ? aj_0.w : aj_0.Y), aj_0.G).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.P), contextCapabilities.GL_ARB_shader_objects ? aj_0.ag : aj_0.c), aj_0.r).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.L), contextCapabilities.GL_ARB_vertex_shader ? aj_0.k : aj_0.J), aj_0.Z).toString();
            J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.al), contextCapabilities.GL_ARB_fragment_shader ? aj_0.d : aj_0.ah), aj_0.h).toString();
        }
        u = r && j;
        String string = StringInvoker.i(GL11.glGetString((int)7936));
        I = StringInvoker.a(string, (CharSequence)aj_0.ac);
        v = !contextCapabilities.OpenGL15 && contextCapabilities.GL_ARB_vertex_buffer_object;
        a = contextCapabilities.OpenGL15 || v;
        J = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), J), aj_0.z), a ? aj_0.M : aj_0.v), aj_0.H).toString();
        if (a) {
            J = v ? aL0.a(aL0.a(new StringBuilder(), J), aj_0.aa).toString() : aL0.a(aL0.a(new StringBuilder(), J), aj_0.E).toString();
            x = 35044;
            w = 34962;
        }
        if (ac = StringInvoker.a(string, (CharSequence)aj_0.b)) {
            if (a) {
                i = true;
            } else {
                aDY.a(aj2.RENDER_DISTANCE, 16.0f);
            }
        }
        try {
            Processor[] processorArray = EY.a(net.J.a(new SystemInfo()));
            G = StringInvoker.a(StringInvoker.a(aj_0.i, new Object[]{P8.d(processorArray.length), processorArray[0]}), aj_0.e, aj_0.N);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static void a(int n, int n2) {
        if (v) {
            avb_2.a(n, n2);
        } else {
            GL15.glBindBuffer((int)n, (int)n2);
        }
    }

    public static void b(int n, int n2, int n3, int n4) {
        if (Z) {
            if (h) {
                a5i.a(n, n2, n3, n4);
            } else {
                aF3.a(n, n2, n3, n4);
            }
        } else {
            GL11.glBlendFunc((int)n, (int)n2);
        }
    }

    public static void j(int n) {
        if (d) {
            adk_2.b(n);
        } else {
            GL20.glLinkProgram((int)n);
        }
    }

    public static void f(int n, int n2) {
        if (d) {
            adk_2.d(n, n2);
        } else {
            GL20.glAttachShader((int)n, (int)n2);
        }
    }

    public static void a(int n, IntBuffer intBuffer) {
        if (d) {
            adk_2.a(n, intBuffer);
        } else {
            GL20.glUniform2((int)n, (IntBuffer)intBuffer);
        }
    }

    public static void a(int n, int n2, int n3, int n4) {
        if (r) {
            switch (H) {
                case 0: {
                    GL30.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 1: {
                    ARBFramebufferObject.glRenderbufferStorage((int)n, (int)n2, (int)n3, (int)n4);
                    break;
                }
                case 2: {
                    l__0.b(n, n2, n3, n4);
                }
            }
        }
    }

    public static String c(int n, int n2) {
        return d ? adk_2.b(n, n2) : GL20.glGetShaderInfoLog((int)n, (int)n2);
    }

    public static boolean f() {
        return !ys_2.L() && r && MCInvoker.f().gameSettings.a8;
    }

    public static void b(int n, FloatBuffer floatBuffer) {
        if (d) {
            adk_2.a(n, floatBuffer);
        } else {
            GL20.glUniform2((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static void c(int n, FloatBuffer floatBuffer) {
        if (d) {
            adk_2.d(n, floatBuffer);
        } else {
            GL20.glUniform4((int)n, (FloatBuffer)floatBuffer);
        }
    }

    public static int c() {
        return v ? avb_2.a() : GL15.glGenBuffers();
    }
}

