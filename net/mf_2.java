/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.QF;
import net.QG;
import net.ResourceLocation;
import net.akb_1;
import net.xc_1;

/*
 * Renamed from net.mf
 */
public class mf_2 {
    protected static ResourceLocation a = new ResourceLocation(akb_1.a);
    private QF b;

    public void b(boolean bl) {
        xc_1.b(this.b, bl);
    }

    public mf_2(int n, int n2, int n3, String string) {
        this.b = new QF(this, n, n2, n3, string);
    }

    public QG c() {
        return this.b;
    }

    public mf_2(int n, int n2, int n3, int n4, int n5, String string) {
        this.b = new QF(this, n, n2, n3, string, n4, n5);
    }

    public int b() {
        return xc_1.a(this.b);
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        xc_1.a(this.b, n, n2, n3, n4, n5, n6);
    }

    public int d() {
        return xc_1.f(this.b);
    }

    public int e() {
        return xc_1.d(this.b);
    }

    public void c(int n, int n2) {
    }

    public void a(String string) {
        xc_1.a(this.b, string);
    }

    public void d(int n, int n2) {
        xc_1.a(this.b, MCInvoker.f(), n, n2);
    }

    public int f() {
        return xc_1.b(this.b);
    }

    public void a(int n, int n2) {
    }

    public int a(boolean bl) {
        return xc_1.a(this.b, bl);
    }

    public boolean a() {
        return xc_1.e(this.b);
    }

    public void b(int n, int n2) {
    }
}

