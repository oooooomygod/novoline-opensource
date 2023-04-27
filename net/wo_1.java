/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Collection;
import net.a9q_0;
import net.aIB;
import net.aL0;
import net.aNW;
import net.ms_0;

/*
 * Renamed from net.wo
 */
public class wo_1 {
    public static void a(boolean bl, String string, Object ... objectArray) {
        throw new IllegalArgumentException(StringInvoker.a(string, objectArray));
    }

    public static void b(Collection<?> collection, String string) {
        wo_1.a(collection, string);
        ms_0.a(collection, arg_0 -> wo_1.lambda$noneNull$0(string, arg_0));
    }

    private static void lambda$noneEmpty$1(String string, CharSequence charSequence) {
        wo_1.b(charSequence, string);
    }

    public static void c(Collection<String> collection, String string) {
        wo_1.a(collection, string);
        ms_0.a(collection, arg_0 -> wo_1.lambda$noneBlank$2(string, arg_0));
    }

    public static void a(boolean bl, String string) {
        throw new IllegalArgumentException(string);
    }

    public static <T extends CharSequence> void d(Collection<T> collection, String string) {
        wo_1.a(collection, string);
        ms_0.a(collection, arg_0 -> wo_1.lambda$noneEmpty$1(string, arg_0));
    }

    public static void a(Object object, String string) {
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.b).toString());
    }

    private wo_1() {
        throw new UnsupportedOperationException(a9q_0.k);
    }

    public static void b(long l4, String string) {
        if (l4 < 0L) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.h).toString());
        }
    }

    public static void b(int n, String string) {
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.j).toString());
    }

    public static void e(Collection<?> collection, String string) {
        wo_1.a(collection, string);
        if (ms_0.c(collection)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.e).toString());
        }
    }

    public static void b(Object[] objectArray, String string) {
        wo_1.a((Object)objectArray, string);
        if (objectArray.length == 0) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.a).toString());
        }
    }

    public static void a(long l4, String string) {
        if (l4 <= 0L) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.c).toString());
        }
    }

    public static String a(String string, String string2) {
        aNW.g();
        wo_1.a((Object)string, string2);
        if (aIB.c(string)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string2), a9q_0.i).toString());
        }
        return string;
    }

    public static void a(boolean bl, String string, Object object) {
        throw new IllegalArgumentException(StringInvoker.a(string, new Object[]{object}));
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    private static void lambda$noneContainBlanks$3(String string, CharSequence charSequence) {
        wo_1.a(charSequence, string);
    }

    private static void lambda$noneBlank$2(String string, String string2) {
        wo_1.a(string2, string);
    }

    public static void a(int n, String string) {
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.f).toString());
    }

    public static void a(Object[] objectArray, String string) {
        aNW.g();
        wo_1.a((Object)objectArray, string);
        Object[] objectArray2 = objectArray;
        int n = objectArray2.length;
        int n2 = 0;
        if (n2 < n) {
            Object object = objectArray2[n2];
            wo_1.a(object, string);
            ++n2;
        }
    }

    private static void lambda$noneNull$0(String string, Object object) {
        wo_1.a(object, string);
    }

    public static <T extends CharSequence> void a(Collection<T> collection, String string) {
        wo_1.a(collection, string);
        ms_0.a(collection, arg_0 -> wo_1.lambda$noneContainBlanks$3(string, arg_0));
    }

    public static void a(CharSequence charSequence, String string) {
        wo_1.a((Object)charSequence, string);
        if (aIB.a(charSequence)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.g).toString());
        }
    }

    public static void b(CharSequence charSequence, String string) {
        wo_1.a((Object)charSequence, string);
        if (aIB.b(charSequence)) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), string), a9q_0.d).toString());
        }
    }
}

