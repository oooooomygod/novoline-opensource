/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.Stack;
import java.util.regex.Pattern;
import net.NBTTagCompound;
import net.aAH;
import net.aL0;
import net.at8;
import net.atM;
import net.atS;
import net.atX;
import net.az3_0;
import net.aze_0;
import net.e__0;
import net.ow_1;
import net.wk_2;

public class E_ {
    private static Pattern a = ow_1.c(e__0.n);

    private static at8 a(String string, boolean bl) throws az3_0 {
        String string2 = E_.b(string, bl);
        String string3 = E_.d(string, bl);
        return E_.a(new String[]{string2, string3});
    }

    static at8 a(String ... stringArray) throws az3_0 {
        return E_.a(stringArray[0], stringArray[1]);
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    private static String a(String string, int n) throws az3_0 {
        int n2;
        Stack stack = new Stack();
        int n3 = 0;
        for (n2 = n + 1; n2 < StringInvoker.c(string); ++n2) {
            char c = StringInvoker.b(string, n2);
            if (c == '\"') {
                if (E_.b(string, n2)) {
                    throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.j), string).toString());
                }
                n3 = n2;
            } else if (c != '{' && c != '[') {
                if (c == '}' && (aAH.a(stack) || aze_0.a((Character)aAH.b(stack)) != '{')) {
                    throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.e), string).toString());
                }
                if (c == ']' && (aAH.a(stack) || aze_0.a((Character)aAH.b(stack)) != '[')) {
                    throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.h), string).toString());
                }
                if (c == ',' && aAH.a(stack)) {
                    return StringInvoker.b(string, 0, n2);
                }
            } else {
                aAH.a(stack, aze_0.c(c));
            }
            if (aze_0.b(c) || n3 == n2) continue;
            return StringInvoker.b(string, 0, n3 + 1);
        }
        return StringInvoker.b(string, 0, n2);
    }

    static at8 a(String string, String string2) throws az3_0 {
        if (StringInvoker.e(string2 = StringInvoker.h(string2), e__0.z)) {
            string2 = StringInvoker.b(string2, 1, StringInvoker.c(string2) - 1);
            atX atX2 = new atX(string);
            while (!StringInvoker.g(string2)) {
                char c;
                String string3 = E_.c(string2, true);
                if (!StringInvoker.g(string3)) {
                    c = '\u0000';
                    ListInvoker.add(atX2.b, E_.a(string3, false));
                }
                if (StringInvoker.c(string2) < StringInvoker.c(string3) + 1) break;
                c = StringInvoker.b(string2, StringInvoker.c(string3));
                if (c != ',' && c != '{' && c != '}' && c != '[' && c != ']') {
                    throw new az3_0(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), e__0.v), c), e__0.p), StringInvoker.a(string2, StringInvoker.c(string3))).toString());
                }
                string2 = StringInvoker.a(string2, StringInvoker.c(string3) + 1);
            }
            return atX2;
        }
        if (StringInvoker.e(string2, e__0.B) && !wk_2.a(ow_1.a(a, string2))) {
            string2 = StringInvoker.b(string2, 1, StringInvoker.c(string2) - 1);
            atS atS2 = new atS(string);
            while (!StringInvoker.g(string2)) {
                char c;
                String string4 = E_.c(string2, false);
                if (!StringInvoker.g(string4)) {
                    c = '\u0001';
                    ListInvoker.add(atS2.b, E_.a(string4, true));
                }
                if (StringInvoker.c(string2) < StringInvoker.c(string4) + 1) break;
                c = StringInvoker.b(string2, StringInvoker.c(string4));
                if (c != ',' && c != '{' && c != '}' && c != '[' && c != ']') {
                    throw new az3_0(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), e__0.r), c), e__0.g), StringInvoker.a(string2, StringInvoker.c(string4))).toString());
                }
                string2 = StringInvoker.a(string2, StringInvoker.c(string4) + 1);
            }
            return atS2;
        }
        return new atM(string, string2);
    }

    private static String d(String string, boolean bl) throws az3_0 {
        if (StringInvoker.e(string = StringInvoker.h(string), e__0.u) || StringInvoker.e(string, e__0.b)) {
            return string;
        }
        int n = E_.a(string, ':');
        if (n == -1) {
            return string;
        }
        return StringInvoker.h(StringInvoker.a(string, n + 1));
    }

    private static int a(String string, char c) {
        for (int i = 0; i < StringInvoker.c(string); ++i) {
            char c2 = StringInvoker.b(string, i);
            if (c2 == '\"') {
                if (E_.b(string, i)) continue;
                continue;
            }
            if (c2 == c) {
                return i;
            }
            if (c2 != '{' && c2 != '[') continue;
            return -1;
        }
        return -1;
    }

    private static boolean b(String string, int n) {
        return StringInvoker.b(string, n - 1) == '\\' && !E_.b(string, n - 1);
    }

    /*
     * WARNING - void declaration
     */
    static int a(String string) throws az3_0 {
        Stack stack = new Stack();
        for (int i = 0; i < StringInvoker.c(string); ++i) {
            char c = StringInvoker.b(string, i);
            if (c == '\"') {
                if (!E_.b(string, i)) continue;
                throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.c), string).toString());
            }
            if (c != '{' && c != '[') {
                if (c == '}' && (aAH.a(stack) || aze_0.a((Character)aAH.b(stack)) != '{')) {
                    throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.t), string).toString());
                }
                if (c != ']' || !aAH.a(stack) && aze_0.a((Character)aAH.b(stack)) == '[') continue;
                throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.k), string).toString());
            }
            if (aAH.a(stack)) {
                void var1_3;
                ++var1_3;
            }
            aAH.a(stack, aze_0.c(c));
        }
        throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.y), string).toString());
    }

    private static String c(String string, boolean bl) throws az3_0 {
        int n = E_.a(string, ':');
        int n2 = E_.a(string, ',');
        if (n == -1) {
            throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.i), string).toString());
        }
        if (n2 != -1 && n2 < n) {
            throw new az3_0(aL0.a(aL0.a(new StringBuilder(), e__0.C), string).toString());
        }
        return E_.a(string, n);
    }

    public static NBTTagCompound b(String string) throws az3_0 {
        if (!StringInvoker.e(string = StringInvoker.h(string), e__0.s)) {
            throw new az3_0(e__0.a);
        }
        if (E_.a(string) != 1) {
            throw new az3_0(e__0.f);
        }
        return (NBTTagCompound)E_.a(e__0.w, string).a();
    }

    private static String b(String string, boolean bl) throws az3_0 {
        if (StringInvoker.e(string = StringInvoker.h(string), e__0.o) || StringInvoker.e(string, e__0.l)) {
            return e__0.m;
        }
        int n = E_.a(string, ':');
        if (n == -1) {
            return e__0.x;
        }
        return StringInvoker.h(StringInvoker.b(string, 0, n));
    }
}

