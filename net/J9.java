/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.NBTTagCompound;
import net.w__0;
import net.wb_2;

public class J9 {
    private static String[] b;

    public static String[] b(w__0 w__02) {
        return w__02.b();
    }

    public static NBTTagCompound a(w__0 w__02) {
        return w__02.a();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(w__0 w__02, NBTTagCompound nBTTagCompound) {
        w__02.a(nBTTagCompound);
    }

    public static void a(w__0 w__02, String string, String string2) {
        w__02.a(string, string2);
    }

    static {
        if (J9.b() != null) {
            J9.b(new String[3]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static String a(w__0 w__02, String string) {
        return w__02.b(string);
    }

    public static boolean a(w__0 w__02, String string, wb_2 wb_22) {
        return w__02.a(string, wb_22);
    }

    public static boolean b(w__0 w__02, String string) {
        return w__02.c(string);
    }

    public static boolean c(w__0 w__02, String string) {
        return w__02.a(string);
    }

    public static int d(w__0 w__02, String string) {
        return w__02.d(string);
    }
}

