/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.alt_0;

/*
 * Renamed from net.aHs
 */
public class ahs_0 {
    private boolean b;
    private int a;
    private ResourceLocation c;
    private alt_0 d;

    public ResourceLocation c() {
        return this.c;
    }

    public boolean d() {
        return this.b;
    }

    public alt_0 a() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ahs_0)) {
            return false;
        }
        ahs_0 ahs_02 = (ahs_0)object;
        return this.c.equals(ahs_02.c) && this.d == ahs_02.d && this.b == ahs_02.b;
    }

    public int b() {
        return this.a;
    }

    public ahs_0(ResourceLocation resourceLocation, alt_0 alt_02, boolean bl, int n) {
        this.c = resourceLocation;
        this.d = alt_02;
        this.b = bl;
        this.a = n;
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = 31 * n + (this.d != null ? this.d.hashCode() : 0);
        n = 31 * n + (this.b ? 1 : 0);
        return n;
    }
}

