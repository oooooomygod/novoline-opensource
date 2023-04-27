/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import com.google.common.collect.ImmutableList;
import com.google.common.reflect.TypeToken;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import net.ConfigurationOptions;
import net.FG;
import net.FP;
import net.GE;
import net.JM;
import net.OV;
import net.P8;
import net.UY;
import net.WB;
import net.a68;
import net.a7c_0;
import net.aGX;
import net.aL0;
import net.aS0;
import net.aS1;
import net.aVH;
import net.ad__0;
import net.agx_2;
import net.ake_0;
import net.aky_1;
import net.am0_0;
import net.am__0;
import net.amc_1;
import net.amh_0;
import net.amm_2;
import net.any_0;
import net.apa_2;
import net.ara_2;
import net.asg_0;
import net.asq_0;
import net.da_1;
import net.dz_0;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.xt
 */
public class xt_2
implements ad__0 {
    private @Nullable xt_2 b;
    volatile boolean d;
    private @NonNull ConfigurationOptions e;
    private volatile @NonNull amh_0 f;
    volatile @Nullable Object c;

    protected xt_2(xt_2 xt_22, xt_2 xt_23) {
        this.e = xt_23.e;
        this.d = true;
        this.c = xt_23.c;
        this.b = xt_22;
        this.f = xt_23.f.a(this);
    }

    @Override
    public @NonNull xt_2 a(Object ... objectArray) {
        aS1.b();
        xt_2 xt_22 = this;
        Object[] objectArray2 = objectArray;
        int n = objectArray2.length;
        int n2 = 0;
        if (n2 < n) {
            Object object = objectArray2[n2];
            xt_22 = xt_22.a(object, false);
            ++n2;
        }
        return xt_22;
    }

    @Override
    public <T> @NonNull List<T> b(Function<Object, T> function) {
        Object object;
        aS1.b();
        ImmutableList.Builder builder = a7c_0.a();
        amh_0 amh_02 = this.f;
        if (amh_02 instanceof amm_2 && dz_0.c((Iterator)(object = OV.a(amh_02.c())))) {
            xt_2 xt_22 = (xt_2)dz_0.b((Iterator)object);
            Object object2 = agx_2.a(function, FP.b(xt_22));
            apa_2.a(builder, object2);
        }
        object = agx_2.a(function, amh_02.b());
        apa_2.a(builder, object);
        return apa_2.a(builder);
    }

    @Override
    public <T> List<T> a(@NonNull TypeToken<List<T>> typeToken, List<T> list) throws a68 {
        aS1.b();
        List<T> list2 = this.a((TypeToken<T>)typeToken, (T)list);
        return ListInvoker.isEmpty(list2) ? this.a((T)list) : list2;
    }

    @Override
    public <T> T a(@NonNull Function<Object, T> function, @NonNull Supplier<T> supplier) {
        aS1.b();
        Object object = agx_2.a(function, FP.b(this));
        return (T)(object == null ? this.a((T)JM.a(supplier)) : object);
    }

    @Override
    public <T> List<T> b(@NonNull TypeToken<List<T>> typeToken, @NonNull Supplier<List<T>> supplier) throws a68 {
        aS1.b();
        List list = (List)((Object)this.a((TypeToken<T>)typeToken, (T)supplier));
        return ListInvoker.isEmpty(list) ? (List)this.a((T)JM.a(supplier)) : list;
    }

    @Override
    public <T> T a(@NonNull TypeToken<T> typeToken, @NonNull Supplier<T> supplier) throws a68 {
        aS1.b();
        Object object = FP.b(this);
        if (object == null) {
            return (T)this.b(typeToken, JM.a(supplier));
        }
        GE gE = asq_0.a(aVH.c(this.a()), typeToken);
        if (gE == null) {
            if (ara_2.b(ake_0.b(typeToken), object)) {
                return (T)ara_2.a(ake_0.b(typeToken), object);
            }
            return (T)this.b(typeToken, JM.a(supplier));
        }
        return (T)WB.a(gE, typeToken, this);
    }

    public static @NonNull xt_2 c() {
        return xt_2.a(aVH.a());
    }

    public @NonNull xt_2 a() {
        return this.a((Object)P8.d(-1), false);
    }

    @Override
    public <T> List<T> b(@NonNull Function<Object, T> function, @NonNull Supplier<List<T>> supplier) {
        aS1.b();
        List list = this.b(function);
        return ListInvoker.isEmpty(list) ? (List)this.a((T)JM.a(supplier)) : list;
    }

    @Override
    public Object b(Object object) {
        aS1.b();
        Object object2 = this.f.b();
        return object2 == null ? this.a((T)object) : object2;
    }

    @Override
    protected xt_2 b(Object object) {
        return new xt_2(object, this, this.e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private xt_2 a(xt_2 xt_22, boolean bl) {
        amh_0 amh_02;
        amh_0 amh_03;
        block10: {
            block11: {
                aS1.b();
                if (this.h()) {
                    throw new IllegalStateException(aGX.e);
                }
                if (!xt_22.d().equals(this)) {
                    throw new IllegalStateException(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aGX.b), xt_22), aGX.c), this), aGX.a).toString());
                }
                xt_2 xt_23 = this;
                // MONITORENTER : xt_23
                amh_02 = amh_03 = this.f;
                if (amh_03 instanceof am0_0) break block10;
                if (!(xt_22.c instanceof Integer)) break block11;
                if (amh_03 instanceof am__0) {
                    amh_02 = new amm_2(this);
                }
                if (amh_03 instanceof amm_2) break block10;
                amh_02 = new amm_2(this, amh_03.b());
            }
            amh_02 = new am0_0(this);
        }
        if (bl) {
            xt_2 xt_24 = amh_02.a(xt_22.c, xt_22);
            // MONITOREXIT : xt_23
            return xt_24;
        }
        xt_2.a(amh_02.b(xt_22.c, xt_22));
        this.f = amh_02;
        // MONITOREXIT : xt_23
        if (amh_02 != amh_03) {
            amh_03.a();
        }
        xt_22.d = true;
        return xt_22;
    }

    private static xt_2 a(xt_2 xt_22) {
        aS1.b();
        if (xt_22 != null) {
            xt_22.d = false;
            xt_22.f();
        }
        return xt_22;
    }

    @Override
    public @NonNull Object[] f() {
        aS1.b();
        LinkedList linkedList = new LinkedList();
        ad__0 ad__02 = this;
        if (ad__02.s() == null) {
            return new Object[]{this.l()};
        }
        do {
            aky_1.b(linkedList, ad__02.l());
        } while ((ad__02 = ad__02.s()).s() != null);
        return aky_1.b(linkedList);
    }

    @Override
    public @Nullable Object l() {
        return this.c;
    }

    public @NonNull List<? extends xt_2> g() {
        aS1.b();
        amh_0 amh_02 = this.f;
        return amh_02 instanceof amm_2 ? a7c_0.a((Collection)any_0.a(((amm_2)amh_02).b)) : asg_0.e();
    }

    @Override
    public @NonNull ConfigurationOptions a() {
        return this.e;
    }

    @Override
    public <T> T a(@NonNull TypeToken<T> typeToken, T t) throws a68 {
        aS1.b();
        Object object = FP.b(this);
        if (object == null) {
            return this.b(typeToken, t);
        }
        GE gE = asq_0.a(aVH.c(this.a()), typeToken);
        if (gE == null) {
            if (ara_2.b(ake_0.b(typeToken), object)) {
                return (T)ara_2.a(ake_0.b(typeToken), object);
            }
            return this.b(typeToken, t);
        }
        return (T)WB.a(gE, typeToken, this);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aGX.g), this.c), aGX.f), this.f), '}').toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public @NonNull xt_2 c(@Nullable Object object) {
        aS1.b();
        if (object instanceof ad__0) {
            ad__0 ad__02 = (ad__0)object;
            if (ki_0.q(ad__02)) {
                this.b();
                amm_2 amm_22 = new amm_2(this);
                ad__0 ad__03 = ad__02;
                synchronized (ad__03) {
                    amm_22.b(ad__02.g());
                }
                this.f = amm_22;
                return this;
            }
            if (ki_0.i(ad__02)) {
                this.b();
                am0_0 am0_02 = new am0_0(this);
                ad__0 ad__04 = ad__02;
                synchronized (ad__04) {
                    am0_02.b(ad__02.k());
                }
                this.f = am0_02;
                return this;
            }
            object = ki_0.e(ad__02);
        }
        if (object != null) {
            this.b(object, false);
            return this;
        }
        if (this.b == null) {
            this.f();
        }
        this.b.c(this.c);
        return this;
    }

    @Override
    public boolean h() {
        aS1.b();
        return !this.d;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public @NonNull ad__0 a(@NonNull ad__0 ad__02) {
        aS1.b();
        if (ki_0.i(ad__02)) {
            xt_2 xt_22 = this;
            synchronized (xt_22) {
                amh_0 amh_02;
                amh_0 amh_03 = amh_02 = this.f;
                if (!(amh_03 instanceof am0_0)) {
                    if (amh_03 instanceof am__0) {
                        amh_02 = new am0_0(this);
                    }
                    return this;
                }
                Iterator iterator = aS0.f(MapInvoker.b(ad__02.k()));
                if (dz_0.c(iterator)) {
                    Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                    xt_2 xt_23 = amh_02.a(entry.getKey());
                    if (FP.b(xt_23) == null || ki_0.e((ad__0)FG.a(entry)) == null) {
                        // empty if block
                    }
                    Object object = this.b(entry.getKey());
                    ((xt_2)object).d = true;
                    ((xt_2)object).c(FG.a(entry));
                    xt_2 xt_24 = amh_02.a(entry.getKey(), (xt_2)object);
                    xt_24.a((ad__0)object);
                }
                this.f = amh_02;
            }
        }
        if (ki_0.e(ad__02) != null) {
            this.b(ki_0.e(ad__02), true);
        }
        return this;
    }

    protected xt_2 b(xt_2 xt_22) {
        return this.a(xt_22, true);
    }

    @Override
    public boolean c(@NonNull Object object) {
        return xt_2.a(this.f.b(object, null)) != null;
    }

    protected xt_2 a(Object object, boolean bl) {
        aS1.b();
        Object object2 = this.f.a(object);
        if (object2 == null) {
            this.b();
            object2 = this.b(object);
            xt_2 xt_22 = this.f.a(object, (xt_2)object2);
            if (xt_22 != null) {
                object2 = xt_22;
            }
            this.d((xt_2)object2);
            object2 = this.b(object);
        }
        return object2;
    }

    private void d(xt_2 xt_22) {
        this.a(xt_22, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void f() {
        xt_2 xt_22 = this;
        synchronized (xt_22) {
            amh_0 amh_02 = this.f;
            this.f = new am__0(this);
            amh_02.a();
            return;
        }
    }

    xt_2 d() {
        aS1.b();
        xt_2 xt_22 = this.b;
        if (xt_22.h()) {
            xt_22 = xt_22.d().b(xt_22);
        }
        this.b = xt_22;
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(Object object, boolean bl) {
        this.b();
        aS1.b();
        xt_2 xt_22 = this;
        synchronized (xt_22) {
            amh_0 amh_02;
            block9: {
                block10: {
                    block8: {
                        amh_0 amh_03 = amh_02 = this.f;
                        if (bl && !(amh_03 instanceof am__0)) {
                            return;
                        }
                        if (!(object instanceof Collection)) break block8;
                        if (amh_02 instanceof amm_2) break block9;
                        amh_02 = new amm_2(this);
                    }
                    if (!(object instanceof Map)) break block10;
                    if (amh_02 instanceof am0_0) break block9;
                    amh_02 = new am0_0(this);
                }
                if (!(amh_02 instanceof amc_1)) {
                    amh_02 = new amc_1(this);
                }
            }
            amh_02.b(object);
            this.f = amh_02;
            return;
        }
    }

    public @NonNull xt_2 e() {
        return this.c(null);
    }

    protected xt_2(@Nullable Object object, @Nullable xt_2 xt_22, @NonNull ConfigurationOptions configurationOptions) {
        UY.a((Object)configurationOptions, aGX.d);
        this.c = object;
        aS1.b();
        this.e = configurationOptions;
        this.b = xt_22;
        this.f = new am__0(this);
        if (xt_22 == null) {
            this.d = true;
        }
    }

    @Override
    public <T> List<T> a(@NonNull Function<Object, T> function, List<T> list) {
        aS1.b();
        List<T> list2 = this.b(function);
        return ListInvoker.isEmpty(list2) ? this.a((T)list) : list2;
    }

    @Override
    public @NonNull aS1 o() {
        return this.f.d();
    }

    public boolean equals(Object object) {
        aS1.b();
        if (this == object) {
            return true;
        }
        if (!(object instanceof xt_2)) {
            return false;
        }
        xt_2 xt_22 = (xt_2)object;
        return UY.a(this.c, xt_22.c) && UY.a((Object)this.f, xt_22.f);
    }

    protected @NonNull xt_2 c(@Nullable xt_2 xt_22) {
        return new xt_2(xt_22, this);
    }

    private <T> T b(TypeToken<T> typeToken, T t) throws a68 {
        aS1.b();
        if (t != null && aVH.b(this.a())) {
            FP.a(this, typeToken, t);
        }
        return t;
    }

    public int hashCode() {
        return UY.a(this.c) ^ UY.a(this.f);
    }

    public @Nullable xt_2 g() {
        return this.b;
    }

    @Override
    public Object a(@NonNull Supplier<Object> supplier) {
        aS1.b();
        Object object = this.f.b();
        return object == null ? this.a((T)JM.a(supplier)) : object;
    }

    protected void b() {
        aS1.b();
        if (!this.d) {
            this.d().d(this);
        }
    }

    public static @NonNull xt_2 a(@NonNull ConfigurationOptions configurationOptions) {
        return new xt_2(null, null, configurationOptions);
    }

    private <T> T a(T t) {
        aS1.b();
        if (t != null && aVH.b(this.a())) {
            this.c(t);
        }
        return t;
    }

    public @NonNull Map<Object, ? extends xt_2> k() {
        aS1.b();
        amh_0 amh_02 = this.f;
        return amh_02 instanceof am0_0 ? da_1.a(((am0_0)amh_02).b) : asg_0.c();
    }

    @Override
    public <T> T a(@NonNull Function<Object, T> function, T t) {
        aS1.b();
        Object object = agx_2.a(function, FP.b(this));
        return (T)(object == null ? this.a(t) : object);
    }
}

