/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.function.Predicate;
import net.aWU;
import net.e2;

/*
 * Renamed from net.eL
 */
public class el_1
extends e2 {
    private Predicate<String> d;

    public Predicate<String> a() {
        return this.d;
    }

    public el_1(int n, String string, boolean bl, Predicate<String> predicate) {
        super(n, string, bl);
        this.d = (Predicate)aWU.a(predicate, el_1::lambda$new$0);
    }

    private static boolean lambda$new$0(String string) {
        return true;
    }
}

