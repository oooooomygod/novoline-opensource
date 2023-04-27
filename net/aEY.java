/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.P8;
import net.Potion;
import net.a2l_0;
import net.a3M;
import net.aXC;
import net.ajT;
import net.akr_1;
import net.ari_0;
import net.dz_0;
import net.ms_0;
import net.my_0;
import net.ys_2;

public class aEY {
    public static String a = "+5-6-7";
    public static String m = "+0-1+2-3&4-4+13";
    public static String j = "+0+1-2+3&4-4+13";
    public static String d = "-0+1-2-3&4-4+13";
    public static String h = "-0+3-4+13";
    public static String g = "+14&13-13";
    public static String c = "-5+6-7";
    private static String n = "CL_00000078";
    public static String r = "+0-1-2-3&4-4+13";
    private static Map i;
    private static Map e;
    public static String s = "-0+1+2-3+13&4-4";
    public static String l = "+0-1-2+3&4-4+13";
    public static String o = "+0-1+2+3+13&4-4";
    public static String b = "-0-1+2-3&4-4+13";
    private static Map f;
    public static String k;
    private static String[] q;
    public static String p = "+0+1-2-3&4-4+13";

    public static String c(int n) {
        int n2 = aEY.b(n);
        return q[n2];
    }

    private static int c(int n, int n2) {
        return aEY.a(n, n2) ? 0 : 1;
    }

    private static int b(int n, int n2) {
        return aEY.a(n, n2) ? 1 : 0;
    }

    private static int a(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        if (!aEY.a(n, n2)) {
            return 0;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    private static int a(int n) {
        while (true) {
            void var1_1;
            n &= n - 1;
            ++var1_1;
        }
    }

    private static int a(boolean bl, boolean bl2, boolean bl3, int n, int n2, int n3, int n4) {
        int n5 = 0;
        n5 = aEY.c(n4, n2);
        n5 *= n3;
        return n5 *= -1;
    }

    public static List a(int n, boolean bl) {
        ArrayList arrayList = null;
        for (Potion potion : Potion.potionTypes) {
            if (ari_0.g(potion)) {
                // empty if block
            }
            String string = (String)MapInvoker.c(i, P8.d(ari_0.f(potion)));
            int n2 = aEY.a(string, 0, StringInvoker.c(string), n);
            int n3 = 0;
            String string2 = (String)MapInvoker.c(e, P8.d(ari_0.f(potion)));
            n3 = aEY.a(string2, 0, StringInvoker.c(string2), n);
            n3 = 0;
            if (ari_0.h(potion)) {
                n2 = 1;
            } else {
                n2 = 1200 * (n2 * 3 + (n2 - 1) * 2);
                n2 >>= n3;
                n2 = (int)MathInvoker.f((double)n2 * ari_0.j(potion));
                if ((n & 0x4000) != 0) {
                    n2 = (int)MathInvoker.f((double)n2 * 0.75 + 0.5);
                }
            }
            arrayList = my_0.c();
            a2l_0 a2l_02 = new a2l_0(ari_0.f(potion), n2, n3);
            if ((n & 0x4000) != 0) {
                a3M.a(a2l_02, true);
            }
            akr_1.a(arrayList, a2l_02);
        }
        return arrayList;
    }

    public static boolean a(int n, int n2) {
        return (n & 1 << n2) != 0;
    }

    public static void a() {
        MapInvoker.d(f);
    }

    public static int b(int n) {
        return aEY.a(n, 5, 4, 3, 2, 1);
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[14];
        int n = 0;
        String string = "T}I\u0004'F\u000b:\u0004=\u0002:A\u001dIxU\n\tTxI\u0001'E\u0006H{\u000fRxI\u0003'C\u0000JnV\u001f>Z\u001cJ\tRyV\u0014;B\u0000H{\u000fTxI\u0003'C\u0000JnV\u001f>Z\u001cJ\u0006R}O\u0004'F\u000fTxO\u0003!C\u0000JnV\u001f>Z\u001cJ\u000fRxO\u0003'C\u0000JnV\u001f>Z\u001cJ\u000fTxI\u0003!C\u0000JcS\u0001,E\u0000M\u000fRxO\u0003!C\u0000JnV\u001f>Z\u001cJ\u000fRxI\u0003'C\u0006JnV\u001f>Z\u001cJ";
        int n2 = "T}I\u0004'F\u000b:\u0004=\u0002:A\u001dIxU\n\tTxI\u0001'E\u0006H{\u000fRxI\u0003'C\u0000JnV\u001f>Z\u001cJ\tRyV\u0014;B\u0000H{\u000fTxI\u0003'C\u0000JnV\u001f>Z\u001cJ\u0006R}O\u0004'F\u000fTxO\u0003!C\u0000JnV\u001f>Z\u001cJ\u000fRxO\u0003'C\u0000JnV\u001f>Z\u001cJ\u000fTxI\u0003!C\u0000JcS\u0001,E\u0000M\u000fRxO\u0003!C\u0000JnV\u001f>Z\u001cJ\u000fRxI\u0003'C\u0006JnV\u001f>Z\u001cJ".length();
        int n3 = 6;
        int n4 = -1;
        while (true) {
            int n5 = 40;
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
                            string = "-\u00070|X<y5\u0011)`A%c5\u000f-\u00070|^<y5\u001c,~S:\u007f2";
                            n2 = "-\u00070|X<y5\u0011)`A%c5\u000f-\u00070|^<y5\u001c,~S:\u007f2".length();
                            n3 = 15;
                            n4 = -1;
                            n5 = 87;
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
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x51));
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

    public static int a(int n, int n2, int n3, int n4, int n5, int n6) {
        return (aEY.a(n, n2) ? 16 : 0) | (aEY.a(n, n3) ? 8 : 0) | (aEY.a(n, n4) ? 4 : 0) | (aEY.a(n, n5) ? 2 : 0) | (aEY.a(n, n6) ? 1 : 0);
    }

    public static int a(Collection collection) {
        int n = 3694022;
        if (!ms_0.c(collection)) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            Iterator iterator = ms_0.a(collection);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                a2l_0 a2l_02 = (a2l_0)object;
                if (!a3M.e(a2l_02)) continue;
                int n2 = ari_0.c(Potion.potionTypes[a3M.b(a2l_02)]);
                if (ys_2.aF()) {
                    n2 = ajT.a(a3M.b(a2l_02), n2);
                }
                for (int i = 0; i <= a3M.g(a2l_02); ++i) {
                    f += (float)(n2 >> 16 & 0xFF) / 255.0f;
                    f2 += (float)(n2 >> 8 & 0xFF) / 255.0f;
                    f3 += (float)(n2 & 0xFF) / 255.0f;
                    f4 += 1.0f;
                }
            }
            float f5 = f4 - 0.0f;
            int cfr_ignored_1 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
            return 0;
        }
        if (ys_2.aF()) {
            n = ajT.a(0, n);
        }
        return n;
    }

    private static int a(String string, int n, int n2, int n3) {
        if (n < StringInvoker.c(string) && n < n2) {
            int n4 = StringInvoker.a(string, 124, n);
            if (n4 < n2) {
                int n5 = aEY.a(string, n, n4 - 1, n3);
                return n5;
            }
            int n6 = StringInvoker.a(string, 38, n);
            if (n6 < n2) {
                aEY.a(string, n, n6 - 1, n3);
                return 0;
            }
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            int n7 = -1;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            for (int i = n; i < n2; ++i) {
                char c = StringInvoker.b(string, i);
                if (c >= '0' && c <= '9') {
                    n9 = c - 48;
                    bl = true;
                    continue;
                }
                if (c == '*') continue;
                if (c == '!') {
                    n10 += aEY.a(bl2, bl, bl3, n7, n8, n9, n3);
                    bl2 = false;
                    bl3 = false;
                    bl = false;
                    n9 = 0;
                    n8 = 0;
                    n7 = -1;
                    bl2 = true;
                    continue;
                }
                if (c == '-') {
                    n10 += aEY.a(bl2, bl, bl3, n7, n8, n9, n3);
                    bl2 = false;
                    bl3 = false;
                    bl = false;
                    n9 = 0;
                    n8 = 0;
                    n7 = -1;
                    bl3 = true;
                    continue;
                }
                if (c != '=' && c != '<' && c != '>') {
                    if (c != '+') continue;
                    n10 += aEY.a(bl2, bl, bl3, n7, n8, n9, n3);
                    bl2 = false;
                    bl3 = false;
                    bl = false;
                    n9 = 0;
                    n8 = 0;
                    n7 = -1;
                    continue;
                }
                n10 += aEY.a(bl2, bl, bl3, n7, n8, n9, n3);
                bl2 = false;
                bl3 = false;
                bl = false;
                n9 = 0;
                n8 = 0;
                n7 = -1;
                if (c == '=') {
                    n7 = 0;
                    continue;
                }
                if (c == '<') {
                    n7 = 2;
                    continue;
                }
                if (c != '>') continue;
                n7 = 1;
            }
            return n10 += aEY.a(bl2, bl, bl3, n7, n8, n9, n3);
        }
        return 0;
    }

    public static int a(int n, String string) {
        int n2 = 0;
        int n3 = StringInvoker.c(string);
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        int n4 = 0;
        for (int i = n2; i < n3; ++i) {
            char c = StringInvoker.b(string, i);
            if (c >= '0' && c <= '9') {
                n4 *= 10;
                n4 = n4 + c - 48;
                continue;
            }
            if (c == '!') {
                n = aEY.a(n, n4, bl2, bl, bl3);
                bl3 = false;
                bl = false;
                bl2 = false;
                n4 = 0;
                bl = true;
                continue;
            }
            if (c == '-') {
                n = aEY.a(n, n4, bl2, bl, bl3);
                bl3 = false;
                bl = false;
                bl2 = false;
                n4 = 0;
                bl2 = true;
                continue;
            }
            if (c == '+') {
                n = aEY.a(n, n4, bl2, bl, bl3);
                bl3 = false;
                bl = false;
                bl2 = false;
                n4 = 0;
                continue;
            }
            if (c != '&') continue;
            n = aEY.a(n, n4, bl2, bl, bl3);
            bl3 = false;
            bl = false;
            bl2 = false;
            n4 = 0;
            bl3 = true;
        }
        n = aEY.a(n, n4, bl2, bl, bl3);
        return n & Short.MAX_VALUE;
    }

    public static boolean b(Collection collection) {
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (a3M.a((a2l_0)object)) continue;
            return false;
        }
        return true;
    }

    public static int b(int n, boolean bl) {
        Integer n2 = aXC.a(n);
        if (MapInvoker.b(f, n2)) {
            return P8.b((Integer)MapInvoker.c(f, n2));
        }
        int n3 = aEY.a(aEY.a(P8.b(n2), false));
        MapInvoker.c(f, n2, P8.d(n3));
        return n3;
    }
}

