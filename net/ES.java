/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
package net;

import com.google.common.cache.CacheLoader;
import net.a9j_0;
import net.aao_1;

class ES
extends CacheLoader<Class<?>, a9j_0<?>> {
    aao_1 a;

    ES(aao_1 aao_12) {
        this.a = aao_12;
    }

    public a9j_0<?> a(Class<?> clazz) throws Exception {
        return new a9j_0(clazz);
    }
}

