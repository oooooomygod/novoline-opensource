/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import net.I4;
import net.aUK;
import net.aYG;
import net.akg_1;
import net.auq_0;
import net.oc_1;
import net.s5_0;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.aN
 */
public enum an_1 implements s5_0
{
    HASH(new aYG(I4.f)),
    DOUBLE_SLASH(new aYG(I4.d)),
    SLASH_BLOCK(new aUK(I4.l, I4.a, I4.k, null)),
    XML_STYLE(new aUK(I4.h, I4.j, I4.e, null));

    private s5_0 a;
    private static int b = 4096;

    @Override
    public @NonNull Collection<String> a(@NonNull Collection<String> collection) {
        return this.a.a(collection);
    }

    private an_1(s5_0 s5_02) {
        this.a = s5_02;
    }

    public static @Nullable String a(@NonNull BufferedReader bufferedReader, s5_0 ... s5_0Array) throws IOException {
        auq_0.a(bufferedReader, 4096);
        s5_0[] s5_0Array2 = s5_0Array;
        akg_1.b();
        int n = s5_0Array2.length;
        int n2 = 0;
        if (n2 < n) {
            s5_0 s5_02 = s5_0Array2[n2];
            Optional<String> optional = s5_02.a(bufferedReader);
            if (!oc_1.a(optional)) {
                auq_0.d(bufferedReader);
            }
            return (String)oc_1.b(optional);
        }
        return null;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public @NonNull Optional<String> a(@NonNull BufferedReader bufferedReader) throws IOException {
        return this.a.a(bufferedReader);
    }
}

