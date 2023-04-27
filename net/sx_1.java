/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import java.util.List;
import java.util.Map;
import net.ad__0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.sX
 */
public interface sx_1
extends ad__0 {
    public @NonNull Map<Object, ? extends sx_1> k();

    public @NonNull sx_1 a();

    public boolean f();

    public @NonNull sx_1 a(@NonNull Map<String, String> var1);

    public @NonNull Map<String, String> c();

    public @NonNull String d();

    @Override
    public @NonNull sx_1 a(Object ... var1);

    public @NonNull List<? extends sx_1> g();

    public @NonNull sx_1 a(@NonNull String var1, @NonNull String var2);

    public @Nullable String b(@NonNull String var1);

    public @NonNull sx_1 g();

    public @Nullable sx_1 b();

    public @NonNull sx_1 a(@NonNull String var1);

    public @NonNull sx_1 c(@NonNull String var1);

    @Override
    public @NonNull sx_1 a(@NonNull ad__0 var1);

    @Override
    public @NonNull sx_1 a(@Nullable Object var1);
}

