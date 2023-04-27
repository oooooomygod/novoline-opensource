/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.StringInvoker;
import com.google.common.reflect.TypeToken;
import deobf.TypeSerializerCollection;
import net.GE;
import net.a68;
import net.a9x_0;
import net.aL0;
import net.ad__0;
import net.at6;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.akl
 */
class akl_2
implements GE<Enum> {
    @Override
    public Enum a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        TypeSerializerCollection.b();
        ki_0.o(ad__02);
        throw new a68(aL0.a(aL0.a(new StringBuilder(), a9x_0.a), ad__02).toString());
    }

    akl_2(at6 at62) {
        this();
    }

    private static a68 a(a68 a682) {
        return a682;
    }

    private akl_2() {
    }

    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable Enum enum_, @NonNull ad__0 ad__02) {
        TypeSerializerCollection.b();
        ki_0.a(ad__02, enum_ != null ? StringInvoker.i(enum_.name()) : null);
    }
}

