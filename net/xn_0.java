/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.ConfigurationOptions;
import net.UY;
import net.aL0;
import net.aVH;
import net.ad__0;
import net.apo_1;
import net.oc_1;
import net.pv_0;
import net.xt_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.xN
 */
public class xn_0
extends xt_2
implements apo_1 {
    private static boolean h;
    private String g = null;

    public static @NonNull xn_0 b() {
        return xn_0.a(aVH.a());
    }

    public static boolean f() {
        xn_0.g();
        return true;
    }

    @Override
    public boolean equals(Object object) {
        xn_0.f();
        if (this == object) {
            return true;
        }
        if (!(object instanceof xn_0)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        xn_0 xn_02 = (xn_0)object;
        return UY.a((Object)this.g, (Object)xn_02.g);
    }

    @Override
    public @NonNull xn_0 a(Object ... objectArray) {
        return (xn_0)super.a(objectArray);
    }

    @Override
    public @NonNull xn_0 a(@Nullable String string) {
        this.b();
        this.g = string;
        return this;
    }

    @Override
    public @NonNull Optional<String> d() {
        return oc_1.a(this.g);
    }

    @Override
    public String toString() {
        xn_0.g();
        String string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), pv_0.a), super.toString()), pv_0.b), this.g), '}').toString();
        ListInvoker.b(new ListInvoker[2]);
        return string;
    }

    @Override
    public @NonNull xn_0 d() {
        return this.a((xt_2)null);
    }

    @Override
    public @NonNull xn_0 a(@NonNull ad__0 ad__02) {
        xn_0.g();
        if (ad__02 instanceof apo_1) {
            Optional<String> optional = ((apo_1)ad__02).d();
            if (this.g == null && oc_1.a(optional)) {
                this.g = (String)oc_1.b(optional);
            }
        }
        return (xn_0)super.a(ad__02);
    }

    static {
        if (!xn_0.f()) {
            xn_0.b(true);
        }
    }

    public static @NonNull xn_0 a(@NonNull ConfigurationOptions configurationOptions) {
        return new xn_0(null, null, configurationOptions);
    }

    protected xn_0(@Nullable Object object, @Nullable xt_2 xt_22, @NonNull ConfigurationOptions configurationOptions) {
        super(object, xt_22, configurationOptions);
    }

    public static void b(boolean bl) {
        h = bl;
    }

    @Override
    public @NonNull xn_0 b(@Nullable Object object) {
        xn_0.f();
        if (object instanceof apo_1 && oc_1.a(((apo_1)object).d())) {
            this.a((String)oc_1.b(((apo_1)object).d()));
        }
        return (xn_0)super.c(object);
    }

    protected @NonNull xn_0 a(@Nullable xt_2 xt_22) {
        xn_0 xn_02 = new xn_0(xt_22, this);
        xn_02.g = this.g;
        return xn_02;
    }

    @Override
    public @NonNull xn_0 a() {
        return (xn_0)super.a();
    }

    public @NonNull List<? extends xn_0> g() {
        return super.g();
    }

    @Override
    public @Nullable xn_0 c() {
        return (xn_0)super.g();
    }

    @Override
    protected xn_0 a(Object object) {
        return new xn_0(object, this, this.a());
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        xn_0.f();
        n = 31 * n + UY.a(this.g);
        if (ListInvoker.b() != null) {
            xn_0.b(false);
        }
        return n;
    }

    public @NonNull Map<Object, ? extends xn_0> k() {
        return super.k();
    }

    public static boolean g() {
        return h;
    }

    protected xn_0(@Nullable xt_2 xt_22, @NonNull xt_2 xt_23) {
        super(xt_22, xt_23);
    }
}

