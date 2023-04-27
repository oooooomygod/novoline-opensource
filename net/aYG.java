/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import net.aG1;
import net.aL0;
import net.aQ8;
import net.akg_1;
import net.auq_0;
import net.oc_1;
import net.s5_0;
import org.checkerframework.checker.nullness.qual.NonNull;

class aYG
implements s5_0 {
    private String a;

    aYG(String string) {
        this.a = string;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private String lambda$toComment$0(String string) {
        akg_1.b();
        if (StringInvoker.e(string, aQ8.b)) {
            return aL0.a(aL0.a(new StringBuilder(), this.a), string).toString();
        }
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), this.a), aQ8.d), string).toString();
    }

    @Override
    public @NonNull Collection<String> a(@NonNull Collection<String> collection) {
        return aG1.a(collection, this::lambda$toComment$0);
    }

    @Override
    public @NonNull Optional<String> a(@NonNull BufferedReader bufferedReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        akg_1.b();
        String string = auq_0.c(bufferedReader);
        if (StringInvoker.e(StringInvoker.h(string), this.a)) {
            if (StringInvoker.e(string = StringInvoker.a(string, StringInvoker.b(string, this.a) + 1), aQ8.c)) {
                string = StringInvoker.a(string, 1);
            }
            if (aL0.a(stringBuilder) > 0) {
                aL0.a(stringBuilder, aQ8.a);
            }
            aL0.a(stringBuilder, string);
        }
        if (StringInvoker.g(StringInvoker.h(string))) {
            // empty if block
        }
        return oc_1.c();
    }
}

