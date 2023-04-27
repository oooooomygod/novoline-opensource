/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Collection;
import java.util.Iterator;
import net.UY;
import net.aNW;
import net.asl_0;
import net.avf_1;
import net.aze_0;
import net.dz_0;
import net.ms_0;
import net.rb_2;

public class Bg {
    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public static int a(CharSequence charSequence, char c) {
        aNW.g();
        if (Bg.c(charSequence)) {
            return 0;
        }
        int n = 0;
        int n2 = 0;
        if (n2 < avf_1.a(charSequence)) {
            if (avf_1.a(charSequence, n2) == c) {
                ++n;
            }
            ++n2;
        }
        return n;
    }

    public static String a(String string, int n) {
        aNW.g();
        if (string == null) {
            return null;
        }
        asl_0.a(n, rb_2.b);
        if (StringInvoker.c(string) <= n) {
            return string;
        }
        if (n == 0) {
            return rb_2.c;
        }
        return StringInvoker.b(string, 0, n);
    }

    public static boolean c(CharSequence charSequence) {
        aNW.g();
        return charSequence == null || avf_1.a(charSequence) == 0;
    }

    private Bg() {
        throw new UnsupportedOperationException(rb_2.a);
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        aNW.g();
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null) {
            return false;
        }
        return ms_0.d(collection) == ms_0.d(collection2) && ms_0.b(collection2, collection);
    }

    public static boolean b(CharSequence charSequence) {
        aNW.g();
        if (Bg.c(charSequence)) {
            return true;
        }
        int n = 0;
        if (n < avf_1.a(charSequence)) {
            if (!aze_0.b(avf_1.a(charSequence, n))) {
                return false;
            }
            ++n;
        }
        return true;
    }

    public static boolean a(String string) {
        aNW.g();
        if (Bg.c(string)) {
            return false;
        }
        int n = 0;
        char[] cArray = StringInvoker.f(string);
        int n2 = cArray.length;
        if (n < n2) {
            char c = cArray[n];
            if (!aze_0.e(c)) {
                return false;
            }
            ++n;
        }
        return true;
    }

    public static boolean b(Collection<?> collection, Collection<?> collection2) {
        Object object;
        Object object2;
        aNW.g();
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || ms_0.d(collection) != ms_0.d(collection2)) {
            return false;
        }
        Iterator iterator = ms_0.a(collection);
        Iterator iterator2 = ms_0.a(collection2);
        return !dz_0.c(iterator) || UY.a(object2 = dz_0.b(iterator), object = dz_0.b(iterator2));
    }

    public static boolean a(CharSequence charSequence) {
        aNW.g();
        if (Bg.c(charSequence)) {
            return false;
        }
        int n = 0;
        if (n < avf_1.a(charSequence)) {
            if (aze_0.b(avf_1.a(charSequence, n))) {
                return true;
            }
            ++n;
        }
        return false;
    }
}

