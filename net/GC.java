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
import java.lang.reflect.ParameterizedType;
import java.util.List;
import net.GE;
import net.a68;
import net.aL0;
import net.aVH;
import net.ad__0;
import net.ake_0;
import net.ara_2;
import net.asq_0;
import net.at6;
import net.ki_0;
import net.wg_1;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

class GC
implements GE<List<?>> {
    private static a68 a(a68 a682) {
        return a682;
    }

    GC(at6 at62) {
        this();
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable List<?> list, @NonNull ad__0 ad__02) throws a68 {
        TypeSerializerCollection.b();
        if (!(ake_0.a(typeToken) instanceof ParameterizedType)) {
            throw new a68(wg_1.d);
        }
        ki_0.a(ad__02, null);
    }

    private GC() {
    }

    @Override
    public List<?> a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        TypeSerializerCollection.b();
        if (!(ake_0.a(typeToken) instanceof ParameterizedType)) {
            throw new a68(wg_1.c);
        }
        TypeToken typeToken2 = ake_0.a(typeToken, ara_2.l(List.class)[0]);
        asq_0.a(aVH.c(ki_0.j(ad__02)), typeToken2);
        throw new a68(aL0.a(aL0.a(new StringBuilder(), wg_1.a), typeToken2).toString());
    }
}

