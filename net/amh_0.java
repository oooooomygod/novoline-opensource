/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import java.util.Iterator;
import net.OV;
import net.aS1;
import net.dz_0;
import net.xt_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.amH
 */
abstract class amh_0 {
    protected @NonNull xt_2 a;

    abstract @NonNull amh_0 a(@NonNull xt_2 var1);

    abstract aS1 d();

    protected amh_0(@NonNull xt_2 xt_22) {
        this.a = xt_22;
    }

    abstract @Nullable xt_2 a(@NonNull Object var1, @Nullable xt_2 var2);

    abstract @Nullable Object b();

    abstract @NonNull Iterable<xt_2> c();

    abstract @Nullable xt_2 a(@Nullable Object var1);

    void a() {
        aS1.b();
        Iterator iterator = OV.a(this.c());
        if (dz_0.c(iterator)) {
            xt_2 xt_22 = (xt_2)dz_0.b(iterator);
            xt_22.d = false;
            dz_0.a(iterator);
            if (xt_22.d().equals(this.a)) {
                xt_22.f();
            }
        }
    }

    abstract @Nullable xt_2 b(@NonNull Object var1, @Nullable xt_2 var2);

    abstract void b(@Nullable Object var1);
}

