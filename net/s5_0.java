/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.s5
 */
public interface s5_0 {
    @NotNull
    public Collection<String> a(@NotNull Collection<String> var1);

    @NotNull
    public Optional<String> a(@NotNull BufferedReader var1) throws IOException;
}

