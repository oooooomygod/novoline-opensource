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
import net.auk_2;
import net.avs_2;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

class NS
implements GE<Boolean> {
    NS(at6 at62) {
        this();
    }

    @Override
    public Boolean a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a6X {
        return auk_2.b(ki_0.a(ad__02));
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Boolean bl, @NonNull ad__0 ad__02) {
        ki_0.a(ad__02, avs_2.b(bl));
    }

    private NS() {
    }
}

