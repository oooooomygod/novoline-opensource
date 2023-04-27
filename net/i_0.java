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
import deobf.TypeSerializerCollection;
import java.util.UUID;
import net.GE;
import net.KE;
import net.a68;
import net.ad__0;
import net.at6;
import net.awc_1;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.i
 */
class i_0
implements GE<UUID> {
    i_0(at6 at62) {
        this();
    }

    private i_0() {
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable UUID uUID, @NonNull ad__0 ad__02) {
        TypeSerializerCollection.b();
        ki_0.a(ad__02, uUID != null ? uUID.toString() : null);
    }

    @Override
    public UUID a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        try {
            return awc_1.a(ki_0.o(ad__02));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new a68(KE.a, illegalArgumentException);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

