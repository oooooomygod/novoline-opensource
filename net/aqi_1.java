/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import com.google.common.reflect.TypeToken;
import cc.novoline.modules.visual.HUD;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aqI
 */
public class aqi_1
implements GE<lj_1> {
    public static TypeToken<lj_1> a = ake_0.a(lj_1.class);

    @Override
    public void a(@NonNull TypeToken<?> typeToken, lj_1 lj_12, @NonNull ad__0 ad__02) {
        HUD.t();
    }

    @Override
    public lj_1 a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) {
        String string = ki_0.o(ki_0.a(ad__02, new Object[]{pz_0.e}));
        int n = ki_0.f(ki_0.a(ad__02, new Object[]{pz_0.f}));
        int n2 = ki_0.f(ki_0.a(ad__02, new Object[]{pz_0.a}));
        int n3 = ki_0.f(ki_0.a(ad__02, new Object[]{pz_0.d}));
        return asi_1.a(string, n, n2, n3);
    }
}

