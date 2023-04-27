/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.P8;
import net.aS1;
import net.acU;
import net.auk_2;
import net.axx_1;
import net.ayw_1;
import net.db_0;
import net.lx_2;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.ks
 */
public class ks_0 {
    public static @Nullable Boolean i(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        return object instanceof Boolean ? (Boolean)object : null;
    }

    private ks_0() {
    }

    public static @Nullable Float h(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Float || object instanceof Integer) {
            return axx_1.a(acU.b((Number)object));
        }
        return null;
    }

    public static @Nullable Integer f(@Nullable Object object) {
        double d;
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Integer) {
            return (Integer)object;
        }
        if ((object instanceof Float || object instanceof Double) && (d = acU.d((Number)object)) == MathInvoker.n(d)) {
            return P8.d((int)d);
        }
        try {
            return P8.d(P8.a(object.toString()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static @Nullable Double j(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Double || object instanceof Float || object instanceof Integer || object instanceof Long) {
            return db_0.a(acU.d((Number)object));
        }
        return null;
    }

    public static @Nullable Integer d(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        return object instanceof Integer ? (Integer)object : null;
    }

    public static @Nullable Long k(@Nullable Object object) {
        double d;
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Long) {
            return (Long)object;
        }
        if (object instanceof Integer) {
            return lx_2.b(acU.c((Number)object));
        }
        if ((object instanceof Float || object instanceof Double) && (d = acU.d((Number)object)) == MathInvoker.n(d)) {
            return lx_2.b((long)d);
        }
        try {
            return lx_2.b(lx_2.a(object.toString()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static @Nullable Double a(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Double) {
            return (Double)object;
        }
        if (object instanceof Integer || object instanceof Long || object instanceof Float) {
            return db_0.a(acU.d((Number)object));
        }
        try {
            return db_0.a(db_0.c(object.toString()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static @Nullable String c(@Nullable Object object) {
        aS1.b();
        return object instanceof String ? (String)object : null;
    }

    public static @Nullable Long b(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Long) {
            return (Long)object;
        }
        if (object instanceof Integer) {
            return lx_2.b(acU.c((Number)object));
        }
        return null;
    }

    public static @Nullable Float g(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Float) {
            return (Float)object;
        }
        if (object instanceof Integer) {
            return axx_1.a(acU.b((Number)object));
        }
        try {
            return axx_1.a(axx_1.a(object.toString()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static @Nullable Boolean l(@Nullable Object object) {
        aS1.b();
        if (object == null) {
            return null;
        }
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        if (object instanceof Number) {
            return auk_2.b(!object.equals(P8.d(0)));
        }
        String string = object.toString();
        if (string.equals(ayw_1.b) || string.equals(ayw_1.a) || string.equals(ayw_1.j) || string.equals(ayw_1.c) || string.equals(ayw_1.f)) {
            return auk_2.b(true);
        }
        if (string.equals(ayw_1.e) || string.equals(ayw_1.g) || string.equals(ayw_1.d) || string.equals(ayw_1.i) || string.equals(ayw_1.h)) {
            return auk_2.b(false);
        }
        return null;
    }

    public static @Nullable String e(@Nullable Object object) {
        aS1.b();
        return object == null ? null : object.toString();
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

