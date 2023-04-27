/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
package net;

import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from net.aw_
 */
public class aw__0 {
    private static int[] b;

    public static String b(String string) {
        return StringUtils.capitalize((String)string);
    }

    public static boolean c(CharSequence charSequence) {
        return StringUtils.isNumeric((CharSequence)charSequence);
    }

    public static String a(String string) {
        return StringUtils.trim((String)string);
    }

    public static String a(String string, int n, int n2) {
        return StringUtils.substring((String)string, (int)n, (int)n2);
    }

    public static String a(String string, String string2, int n) {
        return StringUtils.abbreviateMiddle((String)string, (String)string2, (int)n);
    }

    public static boolean d(CharSequence charSequence) {
        return StringUtils.isBlank((CharSequence)charSequence);
    }

    public static String a(String[] stringArray) {
        return StringUtils.getCommonPrefix((String[])stringArray);
    }

    public static String c(String string) {
        return StringUtils.normalizeSpace((String)string);
    }

    public static boolean b(CharSequence charSequence) {
        return StringUtils.isEmpty((CharSequence)charSequence);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (aw__0.b() == null) {
            aw__0.b(new int[5]);
        }
    }

    public static int[] b() {
        return b;
    }

    public static boolean a(CharSequence charSequence) {
        return StringUtils.isNotEmpty((CharSequence)charSequence);
    }

    public static String a(Iterable iterable, String string) {
        return StringUtils.join((Iterable)iterable, (String)string);
    }

    public static boolean e(CharSequence charSequence) {
        return StringUtils.isNotBlank((CharSequence)charSequence);
    }
}

