/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.ConfigurationOptions;
import net.FG;
import net.aL0;
import net.aS0;
import net.aVH;
import net.ad__0;
import net.ae3_0;
import net.da_1;
import net.dz_0;
import net.sx_1;
import net.sy_2;
import net.xt_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.xd
 */
public class xd_2
extends xt_2
implements sx_1 {
    private static String g;
    private Map<String, String> h = new LinkedHashMap<String, String>();
    private String i;

    protected @NonNull xd_2 a(@Nullable xt_2 xt_22) {
        xd_2 xd_22 = new xd_2(this.i, xt_22, this);
        MapInvoker.a(xd_22.h, this.h);
        return xd_22;
    }

    @Override
    public @NonNull xd_2 a(Object ... objectArray) {
        return (xd_2)super.a(objectArray);
    }

    @Override
    public boolean f() {
        xd_2.b();
        return !MapInvoker.e(this.h);
    }

    @Override
    public @NonNull String d() {
        return this.i;
    }

    @Override
    public @NonNull xd_2 a(@NonNull ad__0 ad__02) {
        xd_2.b();
        if (ad__02 instanceof sx_1) {
            sx_1 sx_12 = (sx_1)ad__02;
            this.c(sx_12.d());
            Iterator iterator = aS0.f(MapInvoker.b(sx_12.c()));
            if (dz_0.c(iterator)) {
                Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                this.a((String)entry.getKey(), (String)FG.a(entry));
            }
        }
        return (xd_2)super.a(ad__02);
    }

    public static @NonNull xd_2 e() {
        return xd_2.a(ae3_0.a, aVH.a());
    }

    @Override
    public @NonNull xd_2 a(@Nullable Object object) {
        xd_2.b();
        if (object instanceof sx_1) {
            sx_1 sx_12 = (sx_1)object;
            this.c(sx_12.d());
            this.a((Map)sx_12.c());
        }
        return (xd_2)super.c(object);
    }

    public static @NonNull xd_2 a(@NonNull String string) {
        return xd_2.a(string, aVH.a());
    }

    public static @NonNull xd_2 a(@NonNull String string, @NonNull ConfigurationOptions configurationOptions) {
        return new xd_2(string, null, null, configurationOptions);
    }

    public @NonNull xd_2 d(@NonNull String string) {
        MapInvoker.a(this.h, string);
        return this;
    }

    @Override
    public @NonNull xd_2 a(@NonNull Map<String, String> map) {
        String string;
        xd_2.b();
        Iterator iterator = aS0.f(MapInvoker.c(map));
        if (dz_0.c(iterator) && sy_2.a(string = (String)dz_0.b(iterator))) {
            throw new IllegalArgumentException(ae3_0.c);
        }
        this.h.clear();
        MapInvoker.a(this.h, map);
        return this;
    }

    @Override
    public @NonNull xd_2 a(@NonNull String string, @NonNull String string2) {
        xd_2.b();
        if (sy_2.a(string)) {
            throw new IllegalArgumentException(ae3_0.f);
        }
        MapInvoker.c(this.h, string, string2);
        return this;
    }

    protected xd_2(@NonNull String string, @Nullable Object object, @Nullable xt_2 xt_22, @NonNull ConfigurationOptions configurationOptions) {
        super(object, xt_22, configurationOptions);
        this.c(string);
    }

    public @NonNull List<? extends xd_2> g() {
        return super.g();
    }

    @Override
    protected xd_2 b(Object object) {
        return new xd_2(ae3_0.h, object, this, this.a());
    }

    public @NonNull Map<Object, ? extends xd_2> k() {
        return super.k();
    }

    static {
        if (xd_2.b() != null) {
            xd_2.b("CN1Buc");
        }
    }

    @Override
    public String toString() {
        xd_2.b();
        String string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ae3_0.g), super.toString()), ae3_0.b), this.i), ae3_0.e), this.h), '}').toString();
        if (ListInvoker.b() != null) {
            xd_2.b("GRaDrb");
        }
        return string;
    }

    @Override
    public @NonNull xd_2 c() {
        return (xd_2)super.a();
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        xd_2.b();
        n = 31 * n + this.i.hashCode();
        n = 31 * n + this.h.hashCode();
        ListInvoker.b(new ListInvoker[5]);
        return n;
    }

    @Override
    public @NonNull Map<String, String> c() {
        return da_1.a(this.h);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public @NonNull xd_2 c(@NonNull String string) {
        xd_2.b();
        if (sy_2.a(string)) {
            throw new IllegalArgumentException(ae3_0.d);
        }
        this.i = string;
        return this;
    }

    @Override
    public @Nullable String b(@NonNull String string) {
        return (String)MapInvoker.c(this.h, string);
    }

    @Override
    public boolean equals(Object object) {
        xd_2.b();
        if (this == object) {
            return true;
        }
        if (!(object instanceof xd_2)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        xd_2 xd_22 = (xd_2)object;
        return this.i.equals(xd_22.i) && this.h.equals(xd_22.h);
    }

    @Override
    public @NonNull xd_2 d() {
        return this.a((xt_2)null);
    }

    public @Nullable xd_2 f() {
        return (xd_2)super.g();
    }

    protected xd_2(@NonNull String string, @Nullable xt_2 xt_22, @NonNull xt_2 xt_23) {
        super(xt_22, xt_23);
        this.c(string);
    }

    public static void b(String string) {
        g = string;
    }

    public static String b() {
        return g;
    }
}

