/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.regex.Matcher;

/*
 * Renamed from net.wk
 */
public class wk_2 {
    private static boolean b;

    public static boolean a(Matcher matcher) {
        return matcher.matches();
    }

    public static boolean c() {
        wk_2.b();
        return true;
    }

    public static String a(Matcher matcher, String string) {
        return matcher.replaceAll(string);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    static {
        if (wk_2.c()) {
            wk_2.b(true);
        }
    }

    public static int d(Matcher matcher) {
        return matcher.end();
    }

    public static boolean a(Matcher matcher, int n) {
        return matcher.find(n);
    }

    public static int b(Matcher matcher) {
        return matcher.start();
    }

    public static boolean c(Matcher matcher) {
        return matcher.find();
    }

    public static String b(Matcher matcher, int n) {
        return matcher.group(n);
    }
}

