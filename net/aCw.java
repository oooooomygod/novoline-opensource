/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.UY;
import net.aL0;
import net.amv_2;
import net.asl_0;
import net.azp_2;
import net.p5;
import net.s1_0;
import org.checkerframework.checker.nullness.qual.NonNull;

class aCw {
    private List<azp_2> a;

    public boolean equals(Object object) {
        amv_2.b();
        if (this == object) {
            return true;
        }
        if (!(object instanceof aCw)) {
            return false;
        }
        aCw aCw2 = (aCw)object;
        return UY.a(this.a, aCw2.a);
    }

    public List<azp_2> b() {
        return this.a;
    }

    private static @NonNull aCw a(@NonNull List<azp_2> list) {
        return new aCw(list);
    }

    public int hashCode() {
        return UY.a(new Object[]{this.a});
    }

    public azp_2 a() {
        return (azp_2)ListInvoker.get(this.a, ListInvoker.size(this.a) - 1);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), s1_0.b), this.a), '}').toString();
    }

    aCw(List list, p5 p52) {
        this(list);
    }

    private aCw(@NonNull List<azp_2> list) {
        asl_0.a(list, s1_0.a);
        this.a = list;
    }
}

