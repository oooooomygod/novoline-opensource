/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.qa_1;
import net.zd_1;

public class OH {
    private static qa_1 a;
    private static qa_1 b;

    public static long a() {
        return zd_1.a(b);
    }

    public static boolean a(String string) {
        return zd_1.b(b, string);
    }

    public static String c(String string) {
        return zd_1.a(b, string);
    }

    public static String a(String string, Object ... objectArray) {
        return zd_1.a(b, string, objectArray);
    }

    static {
        b = qa_1.a();
        a = new qa_1();
    }

    public static String b(String string) {
        return zd_1.a(a, string);
    }
}

