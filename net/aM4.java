/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.Cache
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 */
package net;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.TimeUnit;

public class aM4 {
    private static String b;

    public static CacheBuilder a(CacheBuilder cacheBuilder, long l4) {
        return cacheBuilder.maximumSize(l4);
    }

    public static CacheBuilder a(CacheBuilder cacheBuilder, long l4, TimeUnit timeUnit) {
        return cacheBuilder.expireAfterAccess(l4, timeUnit);
    }

    public static Cache a(CacheBuilder cacheBuilder) {
        return cacheBuilder.build();
    }

    public static CacheBuilder b(CacheBuilder cacheBuilder) {
        return cacheBuilder.weakKeys();
    }

    static {
        if (aM4.b() != null) {
            aM4.b("xt2bUc");
        }
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    public static LoadingCache a(CacheBuilder cacheBuilder, CacheLoader cacheLoader) {
        return cacheBuilder.build(cacheLoader);
    }

    public static CacheBuilder c() {
        return CacheBuilder.newBuilder();
    }
}

