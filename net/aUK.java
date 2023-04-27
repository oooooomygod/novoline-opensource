/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.StringInvoker;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import net.a2g_0;
import net.aB0;
import net.aL0;
import net.aMF;
import net.akg_1;
import net.auq_0;
import net.ms_0;
import net.oc_1;
import net.s5_0;
import net.zz_1;
import org.checkerframework.checker.nullness.qual.NonNull;

class aUK
implements s5_0 {
    private String c;
    private String a;
    private String b;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private String lambda$toComment$0(String string) {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.b), zz_1.n), string), zz_1.a), this.c).toString();
    }

    private aUK(String string, String string2, String string3) {
        this.b = string;
        this.c = string2;
        this.a = string3;
    }

    private String lambda$toComment$1(String string) {
        return aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), zz_1.l), this.a), zz_1.e), string).toString();
    }

    @Override
    public @NonNull Optional<String> a(@NonNull BufferedReader bufferedReader) throws IOException {
        akg_1.b();
        StringBuilder stringBuilder = new StringBuilder();
        String string = auq_0.c(bufferedReader);
        if (string == null) {
            return oc_1.c();
        }
        if (!StringInvoker.e(StringInvoker.h(string), this.b)) {
            return oc_1.c();
        }
        if (this.a(stringBuilder, string = StringInvoker.a(string, StringInvoker.b(string, this.b) + StringInvoker.c(this.b)))) {
            string = auq_0.c(bufferedReader);
            if (!this.a(stringBuilder, string)) {
                // empty if block
            }
            string = auq_0.c(bufferedReader);
        }
        if ((string = auq_0.c(bufferedReader)) != null && !StringInvoker.g(StringInvoker.h(string))) {
            return oc_1.c();
        }
        if (aL0.a(stringBuilder) > 0) {
            return oc_1.b(stringBuilder.toString());
        }
        return oc_1.c();
    }

    aUK(String string, String string2, String string3, a2g_0 a2g_02) {
        this(string, string2, string3);
    }

    @Override
    public @NonNull Collection<String> a(@NonNull Collection<String> collection) {
        akg_1.b();
        if (ms_0.d(collection) == 1) {
            return (Collection)aMF.a(aMF.a(ms_0.b(collection), this::lambda$toComment$0), aB0.a(ObjectArrayList::new));
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        ms_0.c(arrayList, this.b);
        ms_0.a(arrayList, (Collection)aMF.a(aMF.a(ms_0.b(collection), this::lambda$toComment$1), aB0.a(ObjectArrayList::new)));
        ms_0.c(arrayList, aL0.a(aL0.a(new StringBuilder(), zz_1.g), this.c).toString());
        return arrayList;
    }

    private boolean a(StringBuilder stringBuilder, String string) {
        akg_1.b();
        boolean bl = true;
        if (StringInvoker.c(StringInvoker.h(string), this.c)) {
            if (StringInvoker.c(string = StringInvoker.b(string, 0, StringInvoker.j(string, this.c)), zz_1.i)) {
                string = StringInvoker.b(string, 0, StringInvoker.c(string) - 1);
            }
            bl = false;
            if (StringInvoker.g(string)) {
                return false;
            }
        }
        if (StringInvoker.e(StringInvoker.h(string), this.a)) {
            string = StringInvoker.a(string, StringInvoker.b(string, this.a) + 1);
        }
        if (StringInvoker.e(string, zz_1.d)) {
            string = StringInvoker.a(string, 1);
        }
        if (aL0.a(stringBuilder) > 0) {
            aL0.a(stringBuilder, zz_1.m);
        }
        aL0.a(stringBuilder, StringInvoker.a(StringInvoker.a(StringInvoker.a(string, (CharSequence)zz_1.b, (CharSequence)zz_1.c), (CharSequence)zz_1.j, (CharSequence)zz_1.f), (CharSequence)zz_1.h, (CharSequence)zz_1.k));
        return bl;
    }
}

