/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Type;

/*
 * Renamed from net.aKe
 */
public class ake_0 {
    private static int b;

    static {
        if (ake_0.b() == 0) {
            ake_0.b(25);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static Type a(TypeToken typeToken) {
        return typeToken.getType();
    }

    public static int b() {
        return b;
    }

    public static int c() {
        ake_0.b();
        return 70;
    }

    public static TypeToken a(Class clazz) {
        return TypeToken.of((Class)clazz);
    }

    public static TypeToken a(TypeToken typeToken, Type type) {
        return typeToken.resolveType(type);
    }

    public static TypeToken a(Type type) {
        return TypeToken.of((Type)type);
    }

    public static Class b(TypeToken typeToken) {
        return typeToken.getRawType();
    }

    public static TypeToken c(TypeToken typeToken) {
        return typeToken.wrap();
    }
}

