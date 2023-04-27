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
import net.a6X;
import net.ad__0;
import net.at6;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.ak7
 */
class ak7_0
implements GE<String> {
    ak7_0(at6 at62) {
        this();
    }

    private ak7_0() {
    }

    @Override
    public String a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a6X {
        return ki_0.o(ad__02);
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable String string, @NonNull ad__0 ad__02) {
        ki_0.a(ad__02, string);
    }
}

