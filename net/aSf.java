/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;
import net.ObjectMapperFactory;
import net.a5M;
import net.a68;
import net.a9p_0;
import net.aM4;
import net.abj_0;
import net.asl_0;
import net.qr_1;
import net.yv_0;
import org.checkerframework.checker.nullness.qual.NonNull;

public class aSf
implements ObjectMapperFactory {
    private LoadingCache<Class<?>, a9p_0<?>> b = aM4.a(aM4.a(aM4.b(aM4.c()), 500L), new yv_0(this));
    private static aSf a = new aSf();

    public @NonNull String toString() {
        return qr_1.b;
    }

    public static @NonNull ObjectMapperFactory a() {
        return a;
    }

    public <T> @NonNull a9p_0<T> a(@NonNull Class<T> clazz) throws a68 {
        a9p_0.b();
        asl_0.a(clazz, qr_1.a);
        try {
            return (a9p_0)abj_0.a(this.b, clazz);
        }
        catch (ExecutionException executionException) {
            if (a5M.a(executionException) instanceof a68) {
                throw (a68)a5M.a(executionException);
            }
            throw new a68(executionException);
        }
    }

    private static ExecutionException a(ExecutionException executionException) {
        return executionException;
    }
}

