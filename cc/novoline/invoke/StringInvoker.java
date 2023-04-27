/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class StringInvoker {
    private static String b;

    public static IntStream b(String string) {
        return string.chars();
    }

    public static String a(boolean bl) {
        return String.valueOf(bl);
    }

    public static String a(String string, Locale locale) {
        return string.toLowerCase(locale);
    }

    public static String b(String string, int n, int n2) {
        return string.substring(n, n2);
    }

    public static String f(String string, String string2) {
        return string.concat(string2);
    }

    public static byte[] a(String string, Charset charset) {
        return string.getBytes(charset);
    }

    public static String a(String string, String string2, String string3) {
        return string.replaceAll(string2, string3);
    }

    public static int c(String string, int n) {
        return string.lastIndexOf(n);
    }

    public static String a(String string, CharSequence charSequence, CharSequence charSequence2) {
        return string.replace(charSequence, charSequence2);
    }

    public static String i(String string) {
        return string.toLowerCase();
    }

    public static boolean d(String string, String string2) {
        return string.equalsIgnoreCase(string2);
    }

    public static String a(Locale locale, String string, Object[] objectArray) {
        return String.format(locale, string, objectArray);
    }

    public static int a(String string, int n, int n2) {
        return string.indexOf(n, n2);
    }

    public static char[] f(String string) {
        return string.toCharArray();
    }

    public static String a(long l4) {
        return String.valueOf(l4);
    }

    public static boolean e(String string, String string2) {
        return string.startsWith(string2);
    }

    public static String b(String string, Locale locale) {
        return string.toUpperCase(locale);
    }

    public static String a(String string) {
        return string.toUpperCase();
    }

    public static int i(String string, String string2) {
        return string.compareTo(string2);
    }

    public static String a(String string, Object[] objectArray) {
        return String.format(string, objectArray);
    }

    public static String a(Object object) {
        return String.valueOf(object);
    }

    public static boolean k(String string, String string2) {
        return string.matches(string2);
    }

    public static String a(char c) {
        return String.valueOf(c);
    }

    static {
        if (StringInvoker.b() != null) {
            StringInvoker.d("PHMrs");
        }
    }

    public static boolean g(String string) {
        return string.isEmpty();
    }

    public static String[] g(String string, String string2) {
        return string.split(string2);
    }

    public static String a(double d) {
        return String.valueOf(d);
    }

    public static String a(CharSequence charSequence, CharSequence[] charSequenceArray) {
        return String.join(charSequence, charSequenceArray);
    }

    public static int d(String string, int n) {
        return string.indexOf(n);
    }

    public static String b(String string, String string2, String string3) {
        return string.replaceFirst(string2, string3);
    }

    public static String a(int n) {
        return String.valueOf(n);
    }

    public static String[] a(String string, String string2, int n) {
        return string.split(string2, n);
    }

    public static boolean c(String string, String string2) {
        return string.endsWith(string2);
    }

    public static int j(String string, String string2) {
        return string.lastIndexOf(string2);
    }

    public static String h(String string) {
        return string.trim();
    }

    public static String b() {
        return b;
    }

    public static byte[] a(String string, String string2) {
        return string.getBytes(string2);
    }

    public static int c(String string) {
        return string.length();
    }

    public static void d(String string) {
        b = string;
    }

    public static int h(String string, String string2) {
        return string.compareToIgnoreCase(string2);
    }

    public static String a(String string, char c, char c2) {
        return string.replace(c, c2);
    }

    public static int b(String string, String string2, int n) {
        return string.indexOf(string2, n);
    }

    public static String a(String string, int n) {
        return string.substring(n);
    }

    public static boolean a(String string, boolean bl, int n, String string2, int n2, int n3) {
        return string.regionMatches(bl, n, string2, n2, n3);
    }

    public static boolean a(String string, CharSequence charSequence) {
        return string.contains(charSequence);
    }

    public static char b(String string, int n) {
        return string.charAt(n);
    }

    public static int b(String string, String string2) {
        return string.indexOf(string2);
    }

    public static byte[] e(String string) {
        return string.getBytes();
    }
}

