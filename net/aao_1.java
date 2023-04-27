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
import net.ES;
import net.ObjectMapperFactory;
import net.UY;
import net.a5M;
import net.a68;
import net.a9j_0;
import net.aM4;
import net.abj_0;
import net.arv_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aaO
 */
public class aao_1
implements ObjectMapperFactory {
    private static ObjectMapperFactory b = new aao_1();
    private LoadingCache<Class<?>, a9j_0<?>> a = aM4.a(aM4.a(aM4.b(aM4.c()), 500L), new ES(this));

    public static @NonNull ObjectMapperFactory a() {
        return b;
    }

    public String toString() {
        return arv_1.a;
    }

    private static ExecutionException a(ExecutionException executionException) {
        return executionException;
    }

    @Override
    public <T> @NonNull a9j_0<T> a(@NonNull Class<T> clazz) throws a68 {
        a68.b();
        UY.a(clazz, arv_1.b);
        try {
            return (a9j_0)abj_0.a(this.a, clazz);
        }
        catch (ExecutionException executionException) {
            if (a5M.a(executionException) instanceof a68) {
                throw (a68)a5M.a(executionException);
            }
            throw new a68(executionException);
        }
    }
}

