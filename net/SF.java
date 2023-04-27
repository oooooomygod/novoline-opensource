/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.entity.AbstractClientPlayer;

public class SF {
    private aHK[] a = new aHK[0];
    private boolean b = false;

    public void a(ry_1 ry_12, AbstractClientPlayer abstractClientPlayer, float f, float f2) {
        int n;
        aP2.b();
        if (this.b && (n = 0) < this.a.length) {
            aHK aHK2 = this.a[n];
            z8_0.a(aHK2, ry_12, abstractClientPlayer, f, f2);
            ++n;
        }
    }

    public boolean a() {
        return this.b;
    }

    public void a(aHK aHK2) {
        this.a = (aHK[])ys_2.a((Object[])this.a, (Object)aHK2);
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public aHK[] b() {
        return this.a;
    }
}

