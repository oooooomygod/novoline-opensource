/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Pattern;
import net.P8;
import net.aB0;
import net.aL0;
import net.aMF;
import net.aj_;
import net.anf_2;
import net.atj_0;
import net.aw__0;
import net.aze_0;
import net.dz_0;
import net.ly_2;
import net.my_0;
import net.ow_1;
import net.wk_2;

public class SR {
    private static List<String> a;
    private static TreeMap<Integer, String> d;
    private static Pattern c;
    private static List<Character> b;

    public static String a(String string, Object ... objectArray) {
        return StringInvoker.a(String.format(string, objectArray), (CharSequence)ly_2.L, (CharSequence)ly_2.B);
    }

    public static String b(int n) {
        int n2 = n / 20;
        int n3 = n2 / 60;
        return (n2 %= 60) < 10 ? aL0.c(aL0.a(aL0.c(new StringBuilder(), n3), ly_2.K), n2).toString() : aL0.c(aL0.a(aL0.c(new StringBuilder(), n3), ly_2.c), n2).toString();
    }

    public static boolean a(char c) {
        return ListInvoker.contains(b, aze_0.c(c));
    }

    public static boolean a(List<Character> list, char c) {
        return ListInvoker.contains(list, aze_0.c(c));
    }

    public static String b(String string) {
        Iterator iterator = ListInvoker.iterator(a);
        while (dz_0.c(iterator)) {
            String string2 = (String)dz_0.b(iterator);
            string = StringInvoker.a(string, (CharSequence)string2, (CharSequence)ly_2.w);
        }
        return string;
    }

    private static Character lambda$digitString$0(int n) {
        return aze_0.c((char)n);
    }

    public static boolean a(String string) {
        return aw__0.b((CharSequence)string);
    }

    public static String e(String string) {
        return wk_2.a(ow_1.a(c, string), ly_2.b);
    }

    public static String a(int n) {
        int n2 = P8.b((Integer)atj_0.a(d, P8.d(n)));
        if (n == n2) {
            return (String)atj_0.b(d, P8.d(n));
        }
        return aL0.a(aL0.a(new StringBuilder(), (String)atj_0.b(d, P8.d(n2))), SR.a(n - n2)).toString();
    }

    public static List<String> a(String string, int n, int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        char[] cArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < n; ++i) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n2; ++j) {
                aL0.a(stringBuilder, cArray[anf_2.a(anf_2.c(), cArray.length)]);
            }
            String string2 = aL0.a(aL0.a(new StringBuilder(), string), stringBuilder).toString();
            ListInvoker.add(arrayList, string2);
        }
        return arrayList;
    }

    static {
        c = ow_1.c(ly_2.z);
        a = my_0.a(new String[]{ly_2.D, ly_2.Q, ly_2.l, ly_2.e, ly_2.a, ly_2.j, ly_2.N, ly_2.g, ly_2.I, ly_2.p, ly_2.C, ly_2.v, ly_2.u, ly_2.k, ly_2.m, ly_2.q, ly_2.x, ly_2.E, ly_2.A, ly_2.O, ly_2.P, ly_2.F, ly_2.t});
        b = my_0.a(new Character[]{aze_0.c('0'), aze_0.c('1'), aze_0.c('2'), aze_0.c('3'), aze_0.c('4'), aze_0.c('5'), aze_0.c('6'), aze_0.c('7'), aze_0.c('8'), aze_0.c('9'), aze_0.c('.')});
        d = new TreeMap();
        atj_0.a(d, P8.d(1000), ly_2.h);
        atj_0.a(d, P8.d(900), ly_2.M);
        atj_0.a(d, P8.d(500), ly_2.r);
        atj_0.a(d, P8.d(400), ly_2.n);
        atj_0.a(d, P8.d(100), ly_2.G);
        atj_0.a(d, P8.d(90), ly_2.s);
        atj_0.a(d, P8.d(50), ly_2.f);
        atj_0.a(d, P8.d(40), ly_2.o);
        atj_0.a(d, P8.d(10), ly_2.d);
        atj_0.a(d, P8.d(9), ly_2.H);
        atj_0.a(d, P8.d(5), ly_2.J);
        atj_0.a(d, P8.d(4), ly_2.i);
        atj_0.a(d, P8.d(1), ly_2.y);
    }

    public static boolean d(String string) {
        int n = 0;
        while (!StringInvoker.a(string, (CharSequence)StringInvoker.a(n))) {
            ++n;
        }
        return true;
    }

    public static String c(String string) {
        return aL0.a(aL0.a(new StringBuilder(), StringInvoker.a(StringInvoker.b(string, 0, 1))), StringInvoker.i(StringInvoker.a(string, 1))).toString();
    }

    public static String f(String string) {
        return (String)aMF.a(aMF.a(aMF.b(aj_.a(StringInvoker.b(string), SR::lambda$digitString$0), Character::isDigit), String::valueOf), aB0.c());
    }
}

