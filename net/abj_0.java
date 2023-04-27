/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 */
package net;

import com.google.common.cache.LoadingCache;

/*
 * Renamed from net.aBj
 */
public class abj_0 {
    public static Object b(LoadingCache loadingCache, Object object) {
        return loadingCache.getUnchecked(object);
    }

    public static Object a(LoadingCache loadingCache, Object object) {
        return loadingCache.get(object);
    }
}

