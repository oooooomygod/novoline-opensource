/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import net.ux_1;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.uM
 */
class um_1
extends ux_1 {
    @Override
    public <K, V> @NonNull ConcurrentMap<K, V> create() {
        return new ConcurrentSkipListMap();
    }
}

