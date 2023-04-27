/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.Util;
import net.a0D;
import net.a3t_0;
import net.aL0;
import net.tf_0;
import net.x2_0;
import net.ys_2;

/*
 * Renamed from net.a3l
 */
public class a3l_0 {
    private static String i = "MC_";
    public static String t = "MC_OS_WINDOWS";
    public static String e = "MC_GL_VERSION";
    private static String[] f;
    public static String m = "MC_OS_LINUX";
    public static String q = "MC_GL_VENDOR_ATI";
    public static String r = "MC_GL_VENDOR_INTEL";
    public static String n = "MC_OS_MAC";
    public static String h = "MC_GL_RENDERER_GALLIUM";
    public static String g = "MC_GLSL_VERSION";
    public static String c = "MC_GL_RENDERER_INTEL";
    public static String j = "MC_VERSION";
    public static String k = "MC_GL_RENDERER_OTHER";
    public static String s = "MC_GL_RENDERER_GEFORCE";
    public static String d = "MC_GL_RENDERER_QUADRO";
    public static String l = "MC_GL_RENDERER_RADEON";
    public static String a = "MC_OS_OTHER";
    public static String p = "MC_GL_RENDERER_MESA";
    public static String u = "MC_GL_VENDOR_XORG";
    public static String b = "MC_GL_VENDOR_OTHER";
    public static String o = "MC_GL_VENDOR_NVIDIA";

    public static String b() {
        a0D.r();
        String string = tf_0.p;
        if (string == null) {
            return x2_0.F;
        }
        return StringInvoker.e(string = StringInvoker.i(string), x2_0.k) ? x2_0.g : (StringInvoker.e(string, x2_0.J) ? x2_0.c : (StringInvoker.e(string, x2_0.m) ? x2_0.b : (StringInvoker.e(string, x2_0.y) ? x2_0.K : x2_0.n)));
    }

    public static String[] c() {
        a0D.r();
        if (f == null) {
            String[] stringArray = ys_2.ai();
            String[] stringArray2 = new String[stringArray.length];
            int n = 0;
            if (n < stringArray.length) {
                stringArray2[n] = aL0.a(aL0.a(new StringBuilder(), i), stringArray[n]).toString();
                ++n;
            }
            f = stringArray2;
        }
        return f;
    }

    public static String e() {
        return i;
    }

    public static String a() {
        a0D.k();
        String string = tf_0.m;
        if (string == null) {
            return x2_0.H;
        }
        return StringInvoker.e(string = StringInvoker.i(string), x2_0.i) ? x2_0.f : (StringInvoker.e(string, x2_0.D) ? x2_0.p : (StringInvoker.e(string, x2_0.x) ? x2_0.E : (StringInvoker.e(string, x2_0.r) ? x2_0.A : (StringInvoker.e(string, x2_0.z) ? x2_0.v : (StringInvoker.e(string, x2_0.a) ? x2_0.I : (StringInvoker.e(string, x2_0.C) ? x2_0.h : (StringInvoker.e(string, x2_0.t) ? x2_0.e : (StringInvoker.e(string, x2_0.l) ? x2_0.d : (StringInvoker.e(string, x2_0.j) ? x2_0.w : x2_0.q)))))))));
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[19];
        int n = 0;
        String string = "cNask`TgBp\u000fcNabbaKq[{w}{H`\u0016cNabbmUkCz`|wUqJ\u007fib{Rc\u0014cNabbmUkCz`|wUqDpqk~\u0012cNabbmQkCzj|mN`Y{i\u0015cNabbmUkCz`|wUq\\kdj`H\u0014cNabbmUkCz`|wUqBjmk`\u000bcNaj}mKgCk}\tcNaj}mJoN\u0016cNabbmUkCz`|wUqJ{ca`Dk\u0013cNabbmQkCzj|mIxDzlo\u0011cNabbmQkCzj|m_a_y\u0012cNabbmQkCzj|mHzE{w\u0015cNabbmUkCz`|wUq_\u007fak}I\rcNabbmQk_mla|\u0013cNabbmUkCz`|wUq@{vo\rcNaj}mPgCzjya";
        int n2 = "cNask`TgBp\u000fcNabbaKq[{w}{H`\u0016cNabbmUkCz`|wUqJ\u007fib{Rc\u0014cNabbmUkCz`|wUqDpqk~\u0012cNabbmQkCzj|mN`Y{i\u0015cNabbmUkCz`|wUq\\kdj`H\u0014cNabbmUkCz`|wUqBjmk`\u000bcNaj}mKgCk}\tcNaj}mJoN\u0016cNabbmUkCz`|wUqJ{ca`Dk\u0013cNabbmQkCzj|mIxDzlo\u0011cNabbmQkCzj|m_a_y\u0012cNabbmQkCzj|mHzE{w\u0015cNabbmUkCz`|wUq_\u007fak}I\rcNabbmQk_mla|\u0013cNabbmUkCz`|wUq@{vo\rcNaj}mPgCzjya".length();
        int n3 = 10;
        int n4 = -1;
        while (true) {
            int n5 = 18;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "\u0013>\u0011\u0012\u0012\u001d!\u001b3\n\u001a\f\u001d6\n4\u000b\u0013>\u0011\u001a\r\u001d8\n5\u000b\u0007";
                            n2 = "\u0013>\u0011\u0012\u0012\u001d!\u001b3\n\u001a\f\u001d6\n4\u000b\u0013>\u0011\u001a\r\u001d8\n5\u000b\u0007".length();
                            n3 = 16;
                            n4 = -1;
                            n5 = 98;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x3C));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    public static String d() {
        a3t_0 a3t_02 = Util.a();
        switch (a3t_02) {
            case WINDOWS: {
                return x2_0.s;
            }
            case OSX: {
                return x2_0.o;
            }
            case LINUX: {
                return x2_0.u;
            }
        }
        return x2_0.B;
    }
}

