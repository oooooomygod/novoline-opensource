/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.function.Function;
import net.agx_2;
import net.ko_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class HZ<T>
implements ko_0<T> {
    private @NonNull Function<T, String> c;
    private static boolean b;

    protected HZ(@NonNull Function<T, String> function) {
        this.c = function;
    }

    @Override
    public String a(T t) {
        return (String)agx_2.a(this.c, t);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        HZ.b();
        return true;
    }

    static {
        if (HZ.b()) {
            HZ.b(true);
        }
    }

    static <T> @NonNull HZ<T> a(@NonNull Function<T, String> function) {
        return new HZ<T>(function);
    }

    public static boolean b() {
        return b;
    }
}

