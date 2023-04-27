/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import java.util.function.Predicate;
import net.GE;
import net.P8;
import net.a6X;
import net.aWT;
import net.ad__0;
import net.ake_0;
import net.at6;
import net.axt_2;
import net.axx_1;
import net.db_0;
import net.ki_0;
import net.lx_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

class aIN
implements GE<Number> {
    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Number number, @NonNull ad__0 ad__02) {
        ki_0.a(ad__02, number);
    }

    private static boolean lambda$getPredicate$0(TypeToken typeToken) {
        TypeSerializerCollection.b();
        typeToken = ake_0.c(typeToken);
        Class clazz = ake_0.b(typeToken);
        return Integer.class.equals((Object)clazz) || Long.class.equals((Object)clazz) || Short.class.equals((Object)clazz) || Byte.class.equals((Object)clazz) || Float.class.equals((Object)clazz) || Double.class.equals((Object)clazz);
    }

    aIN(at6 at62) {
        this();
    }

    @Override
    public Number a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a6X {
        typeToken = ake_0.c(typeToken);
        TypeSerializerCollection.b();
        Class clazz = ake_0.b(typeToken);
        if (Integer.class.equals((Object)clazz)) {
            return P8.d(ki_0.f(ad__02));
        }
        if (Long.class.equals((Object)clazz)) {
            return lx_2.b(ki_0.d(ad__02));
        }
        if (Short.class.equals((Object)clazz)) {
            return aWT.b((short)ki_0.f(ad__02));
        }
        if (Byte.class.equals((Object)clazz)) {
            return axt_2.a((byte)ki_0.f(ad__02));
        }
        if (Float.class.equals((Object)clazz)) {
            return axx_1.a(ki_0.k(ad__02));
        }
        if (Double.class.equals((Object)clazz)) {
            return db_0.a(ki_0.l(ad__02));
        }
        return null;
    }

    public static @NonNull Predicate<TypeToken<Number>> a() {
        return aIN::lambda$getPredicate$0;
    }

    private static a6X a(a6X a6X2) {
        return a6X2;
    }

    private aIN() {
    }
}

