/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.cache.LoadingCache;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import net.aL0;
import net.aM4;
import net.abj_0;
import net.asl_0;
import net.oc_1;
import net.sm_1;
import net.uv_1;
import net.w2_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aeU
 */
public class aeu_1 {
    private static LoadingCache<Class<? extends Enum<?>>, Map<String, Enum<?>>> a = aM4.a(aM4.a(aM4.b(aM4.c()), 512L), new uv_1());

    private aeu_1() {
    }

    public static <T extends Enum<T>> @NonNull Optional<T> a(@NonNull Class<T> clazz, @NonNull String string) {
        Map map;
        block4: {
            Enum enum_;
            asl_0.a(clazz, sm_1.c);
            w2_0.d();
            asl_0.a((Object)string, sm_1.a);
            try {
                map = (Map)abj_0.a(a, clazz);
                enum_ = (Enum)MapInvoker.c(map, string);
                if (enum_ == null) break block4;
            }
            catch (ExecutionException executionException) {
                return oc_1.c();
            }
            return oc_1.b(enum_);
        }
        return oc_1.a((Enum)MapInvoker.c(map, aeu_1.a(string)));
    }

    static String b(String string) {
        return aeu_1.a(string);
    }

    private static ExecutionException a(ExecutionException executionException) {
        return executionException;
    }

    private static @NonNull String a(@NonNull String string) {
        return aL0.a(aL0.a(new StringBuilder(), sm_1.b), StringInvoker.a(StringInvoker.i(string), (CharSequence)sm_1.e, (CharSequence)sm_1.d)).toString();
    }
}

