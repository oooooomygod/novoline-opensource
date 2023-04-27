/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.ux_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.uS
 */
class us_1
extends ux_1 {
    @Override
    public <K, V> @NonNull ConcurrentMap<K, V> create() {
        return new ConcurrentHashMap();
    }
}

