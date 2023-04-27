/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.axs_1;

/*
 * Renamed from net.aIv
 */
class aiv_0 {
    private int c;
    private int d;
    private axs_1 a;
    private int b;

    public int a() {
        return this.d;
    }

    public void a(int n) {
        if (n < this.d) {
            this.d = n;
        } else if (n > this.b) {
            this.b = n;
        }
    }

    public axs_1 d() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public aiv_0(axs_1 axs_12, int n, int n2) {
        this.a = axs_12;
        this.d = n;
        this.b = n;
        this.c = n2;
    }

    public int c() {
        return this.b;
    }
}

