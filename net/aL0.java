/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;

public class aL0 {
    private static ListInvoker[] b;

    public static void b(StringBuilder stringBuilder, int n, char c) {
        stringBuilder.setCharAt(n, c);
    }

    public static void a(StringBuilder stringBuilder, int n) {
        stringBuilder.setLength(n);
    }

    public static StringBuilder c(StringBuilder stringBuilder, int n) {
        return stringBuilder.append(n);
    }

    public static char b(StringBuilder stringBuilder, int n) {
        return stringBuilder.charAt(n);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static StringBuilder a(StringBuilder stringBuilder, Object object) {
        return stringBuilder.append(object);
    }

    static {
        if (aL0.b() != null) {
            aL0.b(new ListInvoker[4]);
        }
    }

    public static StringBuilder a(StringBuilder stringBuilder, char c) {
        return stringBuilder.append(c);
    }

    public static StringBuilder a(StringBuilder stringBuilder, float f) {
        return stringBuilder.append(f);
    }

    public static StringBuilder a(StringBuilder stringBuilder, int n, char c) {
        return stringBuilder.insert(n, c);
    }

    public static StringBuilder a(StringBuilder stringBuilder, boolean bl) {
        return stringBuilder.append(bl);
    }

    public static StringBuilder a(StringBuilder stringBuilder, String string) {
        return stringBuilder.append(string);
    }

    public static StringBuilder a(StringBuilder stringBuilder, double d) {
        return stringBuilder.append(d);
    }

    public static int a(StringBuilder stringBuilder) {
        return stringBuilder.length();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static StringBuilder a(StringBuilder stringBuilder, long l4) {
        return stringBuilder.append(l4);
    }

    public static StringBuilder a(StringBuilder stringBuilder, int n, String string) {
        return stringBuilder.insert(n, string);
    }
}

