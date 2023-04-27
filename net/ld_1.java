/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.aL0;

/*
 * Renamed from net.lD
 */
public class ld_1 {
    public static char[] a = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};

    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : StringInvoker.f(string)) {
            if (!ld_1.a(c)) continue;
            aL0.a(stringBuilder, c);
        }
        return stringBuilder.toString();
    }

    public static boolean a(char c) {
        return c != '\u00a7' && c >= ' ' && c != '\u007f';
    }
}

