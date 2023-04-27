/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Comparator;
import net.P8;
import net.a4Z;
import net.aAG;
import net.aL0;
import net.aku_2;
import net.apz_1;
import net.at1;
import net.db_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.auK
 */
enum auk_1 {
    DATE(aku_2.c, auk_1::lambda$static$0),
    LEVEL(aku_2.f, auk_1::lambda$static$1),
    NAME(aku_2.d, auk_1::lambda$static$2);

    private Comparator<aAG> c;
    private String b;

    private static int lambda$static$2(aAG aAG2, aAG aAG3) {
        return StringInvoker.i(a4Z.d(apz_1.b(at1.e(aAG2))), a4Z.d(apz_1.b(at1.e(aAG3))));
    }

    private static int lambda$static$1(aAG aAG2, aAG aAG3) {
        P8.b();
        if (at1.g(aAG2) == 0.0) {
            if (at1.g(aAG3) == 0.0) {
                return 0;
            }
            return 1;
        }
        if (at1.g(aAG3) == 0.0) {
            return -1;
        }
        return db_0.a(at1.g(aAG3), at1.g(aAG2));
    }

    public @NonNull String b() {
        return aL0.a(aL0.a(new StringBuilder(), aku_2.g), this.b).toString();
    }

    private auk_1(String string2, Comparator<aAG> comparator) {
        this.b = string2;
        this.c = comparator;
    }

    private static int lambda$static$0(aAG aAG2, aAG aAG3) {
        return 0;
    }

    public Comparator<aAG> a() {
        return this.c;
    }
}

