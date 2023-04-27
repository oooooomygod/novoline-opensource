/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.modules.configurations.property.Property;
import com.google.common.reflect.TypeToken;
import java.util.Collection;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.yM
 */
public class ym_1
implements GE<Property<?>> {
    private static String b = "rvpbN";

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    private static a68 a(a68 a682) {
        return a682;
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Property<?> property, @NonNull ad__0 ad__02) {
        ym_1.b();
        if (arr_1.a(property) == null) {
            ki_0.a(ad__02, null);
            return;
        }
        ki_0.a(ad__02, arr_1.a(property));
    }

    static {
        if (ym_1.b() == null) {
            ym_1.b("rvpbN");
        }
    }

    @Override
    public @Nullable Property<?> a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        ym_1.b();
        switch (fd_0.a[ki_0.m(ad__02).ordinal()]) {
            case 1: {
                return asp_2.a((Collection)ki_0.b(ad__02, new al_0(this)));
            }
            case 2: {
                Object object = ki_0.e(ad__02);
                if (object instanceof CharSequence) {
                    return asp_2.a(object.toString());
                }
                if (object instanceof Integer) {
                    return asp_2.a(P8.d(P8.b((Integer)object)));
                }
                if (object instanceof Double) {
                    return asp_2.a(db_0.a(db_0.b((Double)object)));
                }
                if (object instanceof Boolean) {
                    return asp_2.a(auk_2.b(auk_2.a((Boolean)object)));
                }
                if (object instanceof Float) {
                    return asp_2.a(axx_1.a(axx_1.a((Float)object)));
                }
                if (!(object instanceof Long)) break;
                return asp_2.a(lx_2.b(lx_2.a((Long)object)));
            }
            case 3: {
                throw new a68(lv_1.a);
            }
        }
        return null;
    }
}

