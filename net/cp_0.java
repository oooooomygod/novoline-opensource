/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.BT;
import net.a8b_0;
import net.aL0;
import net.ara_2;
import net.nl_1;

/*
 * Renamed from net.Cp
 */
public class cp_0
extends BT {
    public int c;
    public int d;
    public Class<? extends nl_1> b;

    public String toString() {
        return aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), ara_2.k(this.b)), a8b_0.c), this.c), a8b_0.b), this.d), a8b_0.a), this.a).toString();
    }

    public cp_0(Class<? extends nl_1> clazz, int n, int n2, int n3) {
        super(n);
        this.b = clazz;
        this.c = n2;
        this.d = n3;
    }
}

