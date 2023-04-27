/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AB {
    private VertexFormat a;

    public int g() {
        return this.a.g();
    }

    public String toString() {
        return this.a.toString();
    }

    public boolean c() {
        return this.a.i();
    }

    public int f() {
        return zv_2.a(this.a);
    }

    public int e() {
        return zv_2.d(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public VertexFormat j() {
        return this.a;
    }

    public int c(int n) {
        return zv_2.c(this.a, n);
    }

    public AB a(akd_1 akd_12) {
        return this.a(zv_2.a(this.a, m2.a(akd_12)));
    }

    public boolean d(int n) {
        return zv_2.d(this.a, n);
    }

    public akd_1 b(int n) {
        return new akd_1(zv_2.a(this.a, n));
    }

    public int i() {
        return this.a.e();
    }

    public AB a(VertexFormat aqn_02) {
        this.a = aqn_02;
        return this;
    }

    public void h() {
        this.a.b();
    }

    public int a(int n) {
        return zv_2.b(this.a, n);
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public List<akd_1> a() {
        ArrayList<akd_1> arrayList = new ArrayList<akd_1>();
        Iterator iterator = ListInvoker.iterator(this.a.d());
        while (dz_0.c(iterator)) {
            VertexFormatElement asw_02 = (VertexFormatElement)dz_0.b(iterator);
            ListInvoker.add(arrayList, new akd_1(asw_02));
        }
        return arrayList;
    }

    public int b() {
        return this.a.j();
    }

    public boolean d() {
        return this.a.h();
    }

    public AB(VertexFormat aqn_02) {
        this.a = aqn_02;
    }
}

