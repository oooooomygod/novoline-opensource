/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import java.util.Comparator;
import java.util.List;
import net.MF;
import net.VM;
import net.aaa_0;
import net.acl_0;
import net.afi_1;
import net.aon_1;
import net.za_2;

public class QU {
    public static Comparator<QU> a = new aaa_0();
    private za_2 d;
    private boolean b;
    private boolean g;
    private String c;
    private int e;
    private acl_0 f;

    public za_2 e() {
        return this.d;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public String d() {
        return this.c;
    }

    public acl_0 b() {
        return this.f;
    }

    public boolean c() {
        return this.g;
    }

    public void b(int n) {
        int n2 = this.e;
        this.e = n;
        if (n2 != n || this.b) {
            this.b = false;
            VM.a(this.e(), this);
        }
    }

    public void a(List<EntityPlayer> list) {
        this.b(aon_1.a(afi_1.a(this.f), list));
    }

    public void a(int n) {
        if (aon_1.b(afi_1.a(this.f))) {
            throw new IllegalStateException(MF.a);
        }
        this.b(this.a() + n);
    }

    public int a() {
        return this.e;
    }

    public void f() {
        if (aon_1.b(afi_1.a(this.f))) {
            throw new IllegalStateException(MF.c);
        }
        this.a(1);
    }

    public void c(int n) {
        if (aon_1.b(afi_1.a(this.f))) {
            throw new IllegalStateException(MF.b);
        }
        this.b(this.a() - n);
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public QU(za_2 za_22, acl_0 acl_02, String string) {
        this.d = za_22;
        this.f = acl_02;
        this.c = string;
        this.b = true;
    }
}

