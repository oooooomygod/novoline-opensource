/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.UnmodifiableIterator
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package ninja.leaping.configurate;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import deobf.MapFactory;
import deobf.TypeSerializerCollection;
import java.util.Iterator;
import java.util.Set;
import net.MV;
import net.ObjectMapperFactory;
import net.U;
import net.UY;
import net.aL0;
import net.aOQ;
import net.aS1;
import net.aak_0;
import net.aov_1;
import net.ara_2;
import net.auk_2;
import net.dz_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConfigurationOptions {
    private MapFactory d;
    private ImmutableSet<Class<?>> a;
    private TypeSerializerCollection f;
    private String e;
    private boolean b;
    private ObjectMapperFactory c;

    @NotNull
    public ConfigurationOptions a(@NotNull ObjectMapperFactory objectMapperFactory) {
        aS1.b();
        UY.a((Object)objectMapperFactory, aak_0.a);
        if (this.c == objectMapperFactory) {
            return this;
        }
        return new ConfigurationOptions(this.d, this.e, this.f, (Set<Class<?>>)this.a, objectMapperFactory, this.b);
    }

    @NotNull
    public ConfigurationOptions a(@Nullable Set<Class<?>> set) {
        aS1.b();
        if (UY.a(this.a, set)) {
            return this;
        }
        return new ConfigurationOptions(this.d, this.e, this.f, set, this.c, this.b);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aak_0.h), this.d), aak_0.c), this.e), '\''), aak_0.j), this.f), aak_0.d), this.a), aak_0.e), this.c), aak_0.g), this.b), '}').toString();
    }

    @NotNull
    public ConfigurationOptions a(boolean bl) {
        aS1.b();
        if (this.b == bl) {
            return this;
        }
        return new ConfigurationOptions(this.d, this.e, this.f, (Set<Class<?>>)this.a, this.c, bl);
    }

    public int hashCode() {
        return UY.a(new Object[]{this.d, this.e, this.f, this.a, this.c, auk_2.b(this.b)});
    }

    public boolean g() {
        return this.b;
    }

    @NotNull
    public TypeSerializerCollection b() {
        return this.f;
    }

    @NotNull
    public ConfigurationOptions a(@NotNull MapFactory mapFactory) {
        aS1.b();
        UY.a((Object)mapFactory, aak_0.f);
        if (this.d == mapFactory) {
            return this;
        }
        return new ConfigurationOptions(mapFactory, this.e, this.f, (Set<Class<?>>)this.a, this.c, this.b);
    }

    @NotNull
    public ObjectMapperFactory c() {
        return this.c;
    }

    @NotNull
    public ConfigurationOptions a(@Nullable String string) {
        aS1.b();
        if (UY.a((Object)this.e, (Object)string)) {
            return this;
        }
        return new ConfigurationOptions(this.d, string, this.f, (Set<Class<?>>)this.a, this.c, this.b);
    }

    public boolean equals(Object object) {
        aS1.b();
        if (this == object) {
            return true;
        }
        if (!(object instanceof ConfigurationOptions)) {
            return false;
        }
        ConfigurationOptions configurationOptions = (ConfigurationOptions)object;
        return UY.a((Object)auk_2.b(this.b), auk_2.b(configurationOptions.b)) && UY.a((Object)this.d, configurationOptions.d) && UY.a((Object)this.e, (Object)configurationOptions.e) && UY.a((Object)this.f, configurationOptions.f) && UY.a(this.a, configurationOptions.a) && UY.a((Object)this.c, configurationOptions.c);
    }

    @Nullable
    public String d() {
        return this.e;
    }

    public boolean a(@NotNull Class<?> clazz) {
        Class clazz2;
        aS1.b();
        UY.a(clazz, aak_0.b);
        if (this.a == null) {
            return true;
        }
        if (MV.a(this.a, clazz)) {
            return true;
        }
        UnmodifiableIterator unmodifiableIterator = MV.a(this.a);
        return dz_0.c((Iterator)unmodifiableIterator) && ara_2.a(clazz2 = (Class)dz_0.b((Iterator)unmodifiableIterator), clazz);
    }

    @Nullable
    public ImmutableSet<Class<?>> a() {
        return this.a;
    }

    @NotNull
    public static ConfigurationOptions f() {
        return new ConfigurationOptions(aov_1.a(), null, aOQ.a(), null, U.a(), false);
    }

    @NotNull
    public ConfigurationOptions a(@NotNull TypeSerializerCollection typeSerializerCollection) {
        aS1.b();
        UY.a((Object)typeSerializerCollection, aak_0.i);
        if (this.f == typeSerializerCollection) {
            return this;
        }
        return new ConfigurationOptions(this.d, this.e, typeSerializerCollection, (Set<Class<?>>)this.a, this.c, this.b);
    }

    @NotNull
    public MapFactory e() {
        return this.d;
    }

    private ConfigurationOptions(@NotNull MapFactory mapFactory, @Nullable String string, @NotNull TypeSerializerCollection typeSerializerCollection, @Nullable Set<Class<?>> set, @NotNull ObjectMapperFactory objectMapperFactory, boolean bl) {
        aS1.b();
        this.d = mapFactory;
        this.e = string;
        this.f = typeSerializerCollection;
        this.a = set == null ? null : MV.a(set);
        this.c = objectMapperFactory;
        this.b = bl;
    }
}

