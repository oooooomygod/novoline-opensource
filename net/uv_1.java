/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.google.common.collect.ImmutableMap
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import net.aai_0;
import net.aeu_1;
import net.ara_2;
import net.asl_0;
import net.da_1;
import net.w2_0;

/*
 * Renamed from net.uV
 */
class uv_1
extends CacheLoader<Class<? extends Enum<?>>, Map<String, Enum<?>>> {
    uv_1() {
    }

    public Map<String, Enum<?>> a(Class<? extends Enum<?>> clazz) {
        asl_0.a(clazz, aai_0.a);
        w2_0.e();
        HashMap hashMap = new HashMap();
        Enum[] enumArray = (Enum[])ara_2.c(clazz);
        int n = enumArray.length;
        int n2 = 0;
        if (n2 < n) {
            Enum enum_ = enumArray[n2];
            MapInvoker.c(hashMap, enum_.name(), enum_);
            MapInvoker.b(hashMap, aeu_1.b(enum_.name()), enum_);
            ++n2;
        }
        ImmutableMap immutableMap = da_1.a(hashMap);
        if (ListInvoker.b() != null) {
            w2_0.b(false);
        }
        return immutableMap;
    }
}

