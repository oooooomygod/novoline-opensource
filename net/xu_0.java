/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import net.JC;

/*
 * Renamed from net.Xu
 */
public class xu_0 {
    private static String[] b;

    public static JC a(String string, Class clazz, Enum[] enumArray) {
        return JC.a((String)string, (Class)clazz, (Enum[])enumArray);
    }

    public static String a(JC jC, Enum enum_) {
        return jC.a(enum_);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (xu_0.b() != null) {
            xu_0.b(new String[3]);
        }
    }

    public static JC a(String string, Class clazz, Predicate predicate) {
        return JC.a(string, clazz, predicate);
    }

    public static JC a(String string, Class clazz) {
        return JC.a(string, clazz);
    }

    public static String[] b() {
        return b;
    }
}

