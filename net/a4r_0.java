/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import com.google.common.reflect.TypeToken;
import net.GE;
import net.aRt;
import net.ad__0;
import net.ae6_0;
import net.age_2;
import net.auh_2;
import net.azc_1;
import net.ki_0;
import net.ym_1;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.a4r
 */
public class a4r_0
implements GE<ae6_0> {
    @Override
    public @Nullable ae6_0 a(@NonNull TypeToken<?> typeToken, ad__0 ad__02) {
        ym_1.b();
        if (ki_0.e(ad__02) == null) {
            return null;
        }
        ki_0.o(ki_0.a(ad__02, new Object[]{azc_1.d}));
        return null;
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable ae6_0 ae6_02, @NonNull ad__0 ad__02) {
        ym_1.b();
        if (ae6_02 == null) {
            ki_0.a(ad__02, null);
            return;
        }
        if (age_2.a(ae6_02) == 0) {
            return;
        }
        if (ae6_02 instanceof auh_2) {
        }
        if (ae6_02 instanceof aRt) {
        }
        ki_0.a(ad__02, null);
    }
}

