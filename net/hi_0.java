/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import net.ConfigurationOptions;
import net.UY;
import net.VF;
import net.a5R;
import net.a6H;
import net.aVH;
import net.aev_1;
import net.ah__0;
import net.akg_1;
import net.ayq_0;
import net.pi_0;
import net.zq_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.Hi
 */
public abstract class hi_0<T extends hi_0> {
    @NotNull
    protected a6H a = a6H.PRESERVE;
    @Nullable
    protected Callable<BufferedWriter> b;
    @Nullable
    protected Callable<BufferedReader> d;
    @NotNull
    protected ConfigurationOptions c = aVH.a();

    @NotNull
    private T f() {
        return (T)this;
    }

    @NotNull
    public T a(@NotNull File file) {
        return this.a(zq_2.g((File)UY.a((Object)file, ayq_0.c)));
    }

    @NotNull
    public T a(@NotNull URL uRL) {
        UY.a((Object)uRL, ayq_0.d);
        this.d = () -> hi_0.lambda$setURL$1(uRL);
        return this.f();
    }

    @NotNull
    public T a(@NotNull a6H a6H2) {
        this.a = (a6H)((Object)UY.a((Object)a6H2, ayq_0.a));
        return this.f();
    }

    @NotNull
    public T a(@Nullable Callable<BufferedWriter> callable) {
        this.b = callable;
        return this.f();
    }

    @NotNull
    public T a(@NotNull ConfigurationOptions configurationOptions) {
        this.c = (ConfigurationOptions)UY.a((Object)configurationOptions, ayq_0.e);
        return this.f();
    }

    @NotNull
    public ConfigurationOptions c() {
        return this.c;
    }

    protected hi_0() {
    }

    @Nullable
    public Callable<BufferedReader> g() {
        return this.d;
    }

    @Nullable
    public Callable<BufferedWriter> e() {
        return this.b;
    }

    private static BufferedReader lambda$setPath$0(Path path) throws Exception {
        return aev_1.a(path, StandardCharsets.UTF_8);
    }

    @Deprecated
    public boolean b() {
        return this.a == a6H.PRESERVE;
    }

    @Deprecated
    @NotNull
    public T a(boolean bl) {
        this.a = a6H.PRESERVE;
        return this.f();
    }

    @NotNull
    public T b(@Nullable Callable<BufferedReader> callable) {
        this.d = callable;
        return this.f();
    }

    @NotNull
    public a6H a() {
        return this.a;
    }

    @NotNull
    public abstract akg_1 d();

    @NotNull
    public T a(@NotNull Path path) {
        Path path2 = ah__0.a((Path)UY.a((Object)path, ayq_0.b));
        this.d = () -> hi_0.lambda$setPath$0(path2);
        this.b = pi_0.a(path2, StandardCharsets.UTF_8);
        return this.f();
    }

    private static BufferedReader lambda$setURL$1(URL uRL) throws Exception {
        return new BufferedReader(new InputStreamReader(VF.a(a5R.e(uRL)), StandardCharsets.UTF_8));
    }
}

