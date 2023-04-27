/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.ad__0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.apO
 */
public interface apo_1
extends ad__0 {
    @Override
    @NotNull
    public apo_1 a(@Nullable Object var1);

    @NotNull
    public Map<Object, ? extends apo_1> k();

    @NotNull
    public apo_1 a(@Nullable String var1);

    @NotNull
    public apo_1 b();

    @NotNull
    public Optional<String> d();

    @Override
    @Nullable
    public apo_1 c();

    @Override
    @NotNull
    public apo_1 a(@NotNull ad__0 var1);

    @NotNull
    public List<? extends apo_1> g();

    @NotNull
    public apo_1 a();

    @Override
    @NotNull
    public apo_1 a(Object ... var1);
}

