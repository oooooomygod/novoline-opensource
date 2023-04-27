/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentMap;
import net.aaf_0;
import net.ux_1;
import org.checkerframework.checker.nullness.qual.NonNull;

class u9
extends ux_1 {
    @Override
    public <K, V> @NonNull ConcurrentMap<K, V> create() {
        return new aaf_0(new LinkedHashMap(), null);
    }
}

