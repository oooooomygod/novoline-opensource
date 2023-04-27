/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
package net;

import com.google.common.cache.CacheLoader;
import net.a9p_0;
import net.aSf;

/*
 * Renamed from net.Yv
 */
class yv_0
extends CacheLoader<Class<?>, a9p_0<?>> {
    aSf a;

    public a9p_0<?> a(Class<?> clazz) throws Exception {
        return new a9p_0(clazz);
    }

    yv_0(aSf aSf2) {
        this.a = aSf2;
    }
}

