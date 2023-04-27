/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.hc_1;
import net.sc_0;

public class ai0 {
    private sc_0 a;

    public void a() {
        hc_1.d(this.a);
    }

    public void b(boolean bl) {
        hc_1.c(this.a, bl);
    }

    public void b() {
        hc_1.c(this.a);
    }

    public void a(int n) {
        hc_1.a(this.a, n);
    }

    public void a(char c, int n) {
        hc_1.a(this.a, c, n);
    }

    public void a(String string) {
        hc_1.b(this.a, string);
    }

    public String c() {
        return hc_1.a(this.a);
    }

    public void a(int n, int n2, int n3) {
        this.a.a(n, n2, n3);
    }

    public boolean d() {
        return this.a.n();
    }

    public void a(boolean bl) {
        hc_1.d(this.a, bl);
    }

    public ai0(int n, int n2, int n3, int n4, int n5) {
        this.a = new sc_0(n, MCInvoker.f().fontRendererObj, n2, n3, n4, n5);
    }
}

