/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.Cache
 */
package net;

import com.google.common.cache.Cache;
import java.util.concurrent.Callable;

public class aLY {
    public static Object a(Cache cache, Object object, Callable callable) {
        return cache.get(object, callable);
    }
}

