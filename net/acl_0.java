/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.PL;
import net.VM;
import net.aOA;
import net.za_2;

/*
 * Renamed from net.acl
 */
public class acl_0 {
    private String b;
    private za_2 a;
    private aOA d;
    private String c;
    private PL e;

    public aOA c() {
        return this.d;
    }

    public String a() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public void a(PL pL) {
        this.e = pL;
        VM.a(this.a, this);
    }

    public za_2 d() {
        return this.a;
    }

    public PL b() {
        return this.e;
    }

    public void a(String string) {
        this.c = string;
        VM.a(this.a, this);
    }

    public acl_0(za_2 za_22, String string, aOA aOA2) {
        this.a = za_22;
        this.b = string;
        this.d = aOA2;
        this.c = string;
        this.e = aOA2.b();
    }
}

