/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import com.google.common.reflect.TypeToken;
import net.a68;
import net.ad__0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface GE<T> {
    public void a(@NotNull TypeToken<?> var1, @Nullable T var2, @NotNull ad__0 var3) throws a68;

    @Nullable
    public T a(@NotNull TypeToken<?> var1, @NotNull ad__0 var2) throws a68;
}

