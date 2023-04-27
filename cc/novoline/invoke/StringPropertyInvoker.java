/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.util.List;
import net.StringProperty;

public class StringPropertyInvoker {
    private static String b;

    static {
        if (StringPropertyInvoker.b() != null) {
            StringPropertyInvoker.b("kouMYb");
        }
    }

    public static StringProperty b(StringProperty stringProperty, String[] stringArray) {
        return stringProperty.a(stringArray);
    }

    public static void b(String string) {
        b = string;
    }

    public static StringProperty c() {
        return StringProperty.a();
    }

    public static boolean isMode(StringProperty stringProperty, String string) {
        return stringProperty.b(string);
    }

    public static Object b(StringProperty stringProperty) {
        return stringProperty.get();
    }

    public static List a(StringProperty stringProperty) {
        return stringProperty.b();
    }

    public static boolean a(StringProperty stringProperty, String[] stringArray) {
        return stringProperty.b(stringArray);
    }

    public static String b() {
        return b;
    }

    public static boolean a(StringProperty stringProperty, String string) {
        return stringProperty.a(string);
    }

    public static StringProperty c(String string) {
        return StringProperty.c(string);
    }

    public static StringProperty a(StringProperty stringProperty, Object object) {
        return stringProperty.a(object);
    }

    public static void b(StringProperty stringProperty, String string) {
        stringProperty.d(string);
    }
}

