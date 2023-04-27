/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.ArrayList;
import net.KO;
import net.aMK;

/*
 * Renamed from net.anq
 */
class anq_1 {
    KO b;
    private anq_1 d;
    private double a;
    private aMK e;
    private double g;
    private ArrayList<aMK> f;
    private double c;

    public void c(double d) {
        this.c = d;
    }

    public double a() {
        return this.c;
    }

    public ArrayList<aMK> e() {
        return this.f;
    }

    public double b() {
        return this.g;
    }

    public void a(ArrayList<aMK> arrayList) {
        this.f = arrayList;
    }

    public anq_1 c() {
        return this.d;
    }

    public void b(double d) {
        this.g = d;
    }

    public void a(double d) {
        this.a = d;
    }

    public void a(aMK aMK2) {
        this.e = aMK2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public anq_1(KO kO, aMK aMK2, anq_1 anq_12, ArrayList arrayList, double d, double d2, double d3) {
        this.b = kO;
        this.e = null;
        this.d = null;
        this.e = aMK2;
        this.d = anq_12;
        this.f = arrayList;
        this.a = d;
        this.g = d2;
        this.c = d3;
    }

    public void a(anq_1 anq_12) {
        this.d = anq_12;
    }

    public aMK f() {
        return this.e;
    }

    public double d() {
        return this.a;
    }
}

