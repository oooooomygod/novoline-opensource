/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package ninja.leaping.configurate.objectmapping;

import net.a68;
import net.a9j_0;
import org.jetbrains.annotations.NotNull;

public interface ObjectMapperFactory {
    @NotNull
    public <T> a9j_0<T> a(@NotNull Class<T> var1) throws a68;
}

