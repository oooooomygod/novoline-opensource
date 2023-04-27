/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aL0;
import net.k_0;
import net.lq_1;

/*
 * Renamed from net.awv
 */
public class awv_1 {
    private k_0 b;
    private String a;

    public awv_1(k_0 k_02, String string) {
        this.b = k_02;
        this.a = string;
    }

    public String a() {
        return this.a;
    }

    public int hashCode() {
        int n = this.b.hashCode();
        n = 31 * n + (this.a != null ? this.a.hashCode() : 0);
        return n;
    }

    public k_0 b() {
        return this.b;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), lq_1.b), (Object)this.b), lq_1.a), this.a), '\''), '}').toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            awv_1 awv_12 = (awv_1)object;
            if (this.b != awv_12.b) {
                return false;
            }
            if (this.a != null) {
                return this.a.equals(awv_12.a);
            }
            return awv_12.a == null;
        }
        return false;
    }
}

