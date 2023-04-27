/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import net.aS0;
import net.ace_2;
import net.dz_0;

/*
 * Renamed from net.adG
 */
public enum adg_0 {
    X(0),
    Y(1),
    Z(2),
    Y_ROT(3),
    X_ROT(4);

    private int b;

    private int a() {
        return 1 << this.b;
    }

    public static int a(Set<adg_0> set) {
        int n = 0;
        Iterator iterator = aS0.f(set);
        while (dz_0.c(iterator)) {
            adg_0 adg_02 = (adg_0)((Object)dz_0.b(iterator));
            n |= adg_02.a();
        }
        return n;
    }

    public static Set<adg_0> b(int n) {
        EnumSet enumSet = ace_2.b(adg_0.class);
        for (adg_0 adg_02 : adg_0.values()) {
            if (!adg_02.a(n)) continue;
            aS0.b((Set)enumSet, (Object)adg_02);
        }
        return enumSet;
    }

    private adg_0(int n2) {
        this.b = n2;
    }

    private boolean a(int n) {
        return (n & this.a()) == this.a();
    }
}

