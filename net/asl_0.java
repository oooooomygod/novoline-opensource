/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import net.wo_1;

/*
 * Renamed from net.asl
 */
public class asl_0 {
    private static String b = "iYozi";

    public static void b(String string) {
        b = string;
    }

    public static void a(Object object, String string) {
        wo_1.a(object, string);
    }

    public static void a(int n, String string) {
        wo_1.b(n, string);
    }

    public static String a(String string, String string2) {
        return wo_1.a(string, string2);
    }

    public static void a(boolean bl, String string) {
        wo_1.a(bl, string);
    }

    static {
        if (asl_0.b() == null) {
            asl_0.b("iYozi");
        }
    }

    public static void a(Collection collection, String string) {
        wo_1.e(collection, string);
    }

    public static String b() {
        return b;
    }
}

