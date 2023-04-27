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
import java.net.URI;
import java.net.URISyntaxException;
import net.GE;
import net.a68;
import net.aAT;
import net.aL0;
import net.ad__0;
import net.at6;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

class O4
implements GE<URI> {
    @Override
    public void a(@NonNull TypeToken<?> typeToken, @Nullable URI uRI, @NonNull ad__0 ad__02) {
        TypeSerializerCollection.b();
        ki_0.a(ad__02, uRI != null ? uRI.toString() : null);
    }

    @Override
    public URI a(@NonNull TypeToken<?> typeToken, @NonNull ad__0 ad__02) throws a68 {
        ki_0.o(ad__02);
        throw new a68(aL0.a(aL0.a(new StringBuilder(), aAT.a), ad__02).toString());
    }

    private static URISyntaxException a(URISyntaxException uRISyntaxException) {
        return uRISyntaxException;
    }

    private O4() {
    }

    O4(at6 at62) {
        this();
    }
}

