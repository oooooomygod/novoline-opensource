/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import net.ahs_0;

public class a38 {
    private List<ahs_0> a;
    private String b;

    public int hashCode() {
        int n = this.b.hashCode();
        n = 31 * n + this.a.hashCode();
        return n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a38)) {
            return false;
        }
        a38 a382 = (a38)object;
        return this.b.equals(a382.b) && this.a.equals(a382.a);
    }

    public a38(String string, List<ahs_0> list) {
        this.b = string;
        this.a = list;
    }

    static String a(a38 a382) {
        return a382.b;
    }

    public List<ahs_0> a() {
        return this.a;
    }
}

