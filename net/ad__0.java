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
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import net.ConfigurationOptions;
import net.P8;
import net.a68;
import net.a7c_0;
import net.aS1;
import net.auk_2;
import net.axx_1;
import net.db_0;
import net.ks_0;
import net.lx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.ad_
 */
public interface ad__0 {
    public static int a = 0;

    public <T> T a(@NotNull TypeToken<T> var1, @NotNull Supplier<T> var2) throws a68;

    @NotNull
    public aS1 o();

    @Nullable
    public ad__0 s();

    @NotNull
    public Map<Object, ? extends ad__0> k();

    public boolean c(@NotNull Object var1);

    default public float a(float f) {
        return axx_1.a(this.a(ks_0::g, axx_1.a(f)));
    }

    @NotNull
    public <T> List<T> b(@NotNull Function<Object, T> var1);

    default public int j() {
        return this.a(0);
    }

    public <T> List<T> b(@NotNull Function<Object, T> var1, @NotNull Supplier<List<T>> var2);

    @NotNull
    public ConfigurationOptions a();

    default public boolean p() {
        return this.a(false);
    }

    default public float b() {
        return this.a(0.0f);
    }

    @NotNull
    public ad__0 a(@NotNull ad__0 var1);

    default public boolean a(boolean bl) {
        return auk_2.a(this.a(ks_0::l, auk_2.b(bl)));
    }

    default public boolean q() {
        return this.o() == aS1.MAP;
    }

    @Nullable
    default public Object r() {
        return this.b((Object)null);
    }

    public <T> T a(@NotNull Function<Object, T> var1, @Nullable T var2);

    @NotNull
    public ad__0 n();

    public <T> List<T> b(@NotNull TypeToken<List<T>> var1, @NotNull Supplier<List<T>> var2) throws a68;

    @NotNull
    public List<? extends ad__0> g();

    @NotNull
    public Object[] f();

    public <T> T a(@NotNull Function<Object, T> var1, @NotNull Supplier<T> var2);

    public Object b(@Nullable Object var1);

    default public boolean e() {
        return this.o() == aS1.LIST;
    }

    public Object a(@NotNull Supplier<Object> var1);

    public <T> List<T> a(@NotNull TypeToken<List<T>> var1, @Nullable List<T> var2) throws a68;

    @Nullable
    public Object l();

    @Nullable
    default public String m() {
        return this.a((String)null);
    }

    default public double i() {
        return this.a(0.0);
    }

    default public int a(int n) {
        return P8.b(this.a(ks_0::f, P8.d(n)));
    }

    default public String a(@Nullable String string) {
        return this.a(ks_0::e, string);
    }

    @Nullable
    default public <T> T a(@NotNull Function<Object, T> function) {
        return this.a(function, (T)null);
    }

    default public long a(long l4) {
        return lx_2.a(this.a(ks_0::k, lx_2.b(l4)));
    }

    @NotNull
    public ad__0 a(@Nullable Object var1);

    @NotNull
    public ad__0 a(Object ... var1);

    public <T> T a(@NotNull TypeToken<T> var1, T var2) throws a68;

    @NotNull
    default public <T> ad__0 b(@NotNull TypeToken<T> typeToken, @Nullable T t) throws a68 {
        aS1.b();
        this.a((Object)null);
        return this;
    }

    default public double a(double d) {
        return db_0.b(this.a(ks_0::a, db_0.a(d)));
    }

    public <T> List<T> a(@NotNull Function<Object, T> var1, @Nullable List<T> var2);

    default public long d() {
        return this.a(0L);
    }

    @Nullable
    default public <T> T a(@NotNull TypeToken<T> typeToken) throws a68 {
        return this.a(typeToken, (T)null);
    }

    public boolean h();

    private static a68 a(a68 a682) {
        return a682;
    }

    @NotNull
    public ad__0 c();

    @NotNull
    default public <T> List<T> b(@NotNull TypeToken<List<T>> typeToken) throws a68 {
        return this.a((TypeToken<T>)typeToken, (T)a7c_0.b());
    }
}

