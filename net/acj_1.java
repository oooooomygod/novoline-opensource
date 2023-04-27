/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import net.aL0;
import net.am8_0;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.acj
 */
public abstract class acj_1 {
    private static int[] b;
    private static String a = "[Shaders] ";
    private static Logger c;

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (acj_1.b() == null) {
            acj_1.b(new int[1]);
        }
        int n = -1;
        char[] cArray = "\u000e\b>ZKP\u000f&\u0006v".toCharArray();
        int n2 = 0;
        int n3 = 65;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x14));
            n3 = n3;
        }
    }

    public static void c(String string, Object ... objectArray) {
        String string2 = StringInvoker.a(string, objectArray);
        LoggerInvoker.f(c, aL0.a(aL0.a(new StringBuilder(), am8_0.g), string2).toString());
    }

    public static void c(String string) {
        LoggerInvoker.f(c, aL0.a(aL0.a(new StringBuilder(), am8_0.c), string).toString());
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(String string, Object ... objectArray) {
        String string2 = StringInvoker.a(string, objectArray);
        LoggerInvoker.warn(c, aL0.a(aL0.a(new StringBuilder(), am8_0.b), string2).toString());
    }

    public static void b(String string) {
        LoggerInvoker.warn(c, aL0.a(aL0.a(new StringBuilder(), am8_0.e), string).toString());
    }

    public static void a(String string) {
        LoggerInvoker.b(c, aL0.a(aL0.a(new StringBuilder(), am8_0.f), string).toString());
    }

    public static void d(String string) {
        c.info(aL0.a(aL0.a(new StringBuilder(), am8_0.a), string).toString());
    }

    public static void d(String string, Object ... objectArray) {
        String string2 = StringInvoker.a(string, objectArray);
        acj_1.b();
        c.info(aL0.a(aL0.a(new StringBuilder(), am8_0.h), string2).toString());
        if (ListInvoker.b() != null) {
            acj_1.b(new int[4]);
        }
    }

    public static void b(String string, Object ... objectArray) {
        acj_1.b();
        String string2 = StringInvoker.a(string, objectArray);
        LoggerInvoker.b(c, aL0.a(aL0.a(new StringBuilder(), am8_0.d), string2).toString());
        ListInvoker.b(new ListInvoker[3]);
    }

    public static int[] b() {
        return b;
    }
}

