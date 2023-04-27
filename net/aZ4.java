/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.MapInvoker;
import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.Map;
import net.FG;
import net.FP;
import net.GE;
import net.a3I;
import net.a68;
import net.aL0;
import net.aS0;
import net.aVH;
import net.ad__0;
import net.ake_0;
import net.ara_2;
import net.asq_0;
import net.at6;
import net.dz_0;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

class aZ4
implements GE<Map<?, ?>> {
    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Map<?, ?> map, @NonNull ad__0 ad__02) throws a68 {
        TypeSerializerCollection.b();
        if (!(ake_0.a(typeToken) instanceof ParameterizedType)) {
            throw new a68(a3I.d);
        }
        ki_0.a(ad__02, null);
    }

    private aZ4() {
    }

    aZ4(at6 at62) {
        this();
    }

    @Override
    public Map<?, ?> a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        TypeSerializerCollection.b();
        Object2ObjectLinkedOpenHashMap object2ObjectLinkedOpenHashMap = new Object2ObjectLinkedOpenHashMap();
        if (ki_0.i(ad__02)) {
            if (!(ake_0.a(typeToken) instanceof ParameterizedType)) {
                throw new a68(a3I.a);
            }
            TypeToken typeToken2 = ake_0.a(typeToken, ara_2.l(Map.class)[0]);
            TypeToken typeToken3 = ake_0.a(typeToken, ara_2.l(Map.class)[1]);
            GE gE = asq_0.a(aVH.c(ki_0.j(ad__02)), typeToken2);
            GE gE2 = asq_0.a(aVH.c(ki_0.j(ad__02)), typeToken3);
            if (gE == null) {
                throw new a68(aL0.a(aL0.a(new StringBuilder(), a3I.b), typeToken2).toString());
            }
            if (gE2 == null) {
                throw new a68(aL0.a(aL0.a(new StringBuilder(), a3I.c), typeToken3).toString());
            }
            Iterator iterator = aS0.f(MapInvoker.b(ki_0.g(ad__02)));
            while (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                Object t = gE.a(typeToken2, FP.a(FP.a(), FG.b(entry)));
                Object t2 = gE2.a(typeToken3, (ad__0)FG.a(entry));
                if (t == null) continue;
                if (t2 == null) {
                    // empty if block
                }
                MapInvoker.c((Map)object2ObjectLinkedOpenHashMap, t, t2);
                break;
            }
        }
        return object2ObjectLinkedOpenHashMap;
    }

    private static a68 a(a68 a682) {
        return a682;
    }
}

