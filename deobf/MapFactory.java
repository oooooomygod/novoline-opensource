/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package deobf;

import java.util.concurrent.ConcurrentMap;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface MapFactory {
    @NotNull
    public <K, V> ConcurrentMap<K, V> create();
}

