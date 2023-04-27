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
import java.net.MalformedURLException;
import java.net.URL;
import net.GE;
import net.a68;
import net.aG9;
import net.aL0;
import net.ad__0;
import net.at6;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.pb
 */
class pb_2
implements GE<URL> {
    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable URL uRL, @NonNull ad__0 ad__02) {
        TypeSerializerCollection.b();
        ki_0.a(ad__02, uRL != null ? uRL.toString() : null);
    }

    pb_2(at6 at62) {
        this();
    }

    @Override
    public URL a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        ki_0.o(ad__02);
        throw new a68(aL0.a(aL0.a(new StringBuilder(), aG9.c), ad__02).toString());
    }

    private pb_2() {
    }

    private static MalformedURLException a(MalformedURLException malformedURLException) {
        return malformedURLException;
    }
}

