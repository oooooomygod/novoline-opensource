/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import net.FP;
import net.UY;
import net.aL0;
import net.aS1;
import net.aVH;
import net.amh_0;
import net.ami_0;
import net.asg_0;
import net.xt_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.amC
 */
class amc_1
extends amh_0 {
    private volatile Object b;

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), ami_0.a), this.b), '}').toString();
    }

    @Override
    aS1 d() {
        return aS1.SCALAR;
    }

    @Override
    public @NonNull Iterable<xt_2> c() {
        return asg_0.d();
    }

    @Override
    @NonNull amc_1 a(@NonNull xt_2 xt_22) {
        amc_1 amc_12 = new amc_1(xt_22);
        amc_12.b = this.b;
        return amc_12;
    }

    amc_1(xt_2 xt_22) {
        super(xt_22);
    }

    @Override
    public void b(@Nullable Object object) {
        aS1.b();
        if (!aVH.a(FP.a(this.a), UY.b(object).getClass())) {
            throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), ami_0.b), object.getClass()).toString());
        }
        this.b = object;
    }

    public boolean equals(Object object) {
        aS1.b();
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        amc_1 amc_12 = (amc_1)object;
        return UY.a(this.b, amc_12.b);
    }

    @Override
    public @Nullable xt_2 a(@Nullable Object object) {
        return null;
    }

    public int hashCode() {
        return 7 + UY.a(this.b);
    }

    @Override
    @Nullable xt_2 b(@NonNull Object object, @Nullable xt_2 xt_22) {
        return null;
    }

    @Override
    public void a() {
        this.b = null;
    }

    @Override
    @Nullable xt_2 a(@NonNull Object object, @Nullable xt_2 xt_22) {
        return null;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public @Nullable Object b() {
        return this.b;
    }
}

