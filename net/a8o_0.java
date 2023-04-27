/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.ArrayList;
import net.IN;
import net.M7;
import net.S7;
import net.a0D;
import net.a3c_0;
import net.aVE;
import net.aiy_1;
import net.akr_1;
import net.ok_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a8o
 */
class a8o_0
extends aiy_1 {
    private ArrayList A;
    S7 z;
    private int x;
    private long y = 0L;

    @Override
    protected boolean c(int n) {
        a0D.k();
        return n == this.x;
    }

    @Override
    protected void a() {
    }

    public int a() {
        return this.x;
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        a0D.k();
        if (n != this.x || this.g != this.y) {
            this.x = n;
            this.y = this.g;
            a3c_0.g((String)akr_1.a(this.A, n));
            a3c_0.M();
            M7.a(this.z);
        }
    }

    public a8o_0(S7 s7, int n, int n2, int n3, int n4, int n5) {
        super(M7.b(s7), n, n2, n3, n4, n5);
        this.z = s7;
        this.c();
        this.p = 0.0f;
        int n6 = this.x * n5;
        int n7 = (n4 - n3) / 2;
        if (n6 > n7) {
            this.b(n6 - n7);
        }
    }

    @Override
    protected int e() {
        return this.f() * 18;
    }

    @Override
    public int d() {
        return this.r - 20;
    }

    @Override
    protected int h() {
        return this.r - 6;
    }

    public void c() {
        this.A = aVE.al();
        a0D.k();
        this.x = 0;
        int n = 0;
        int n2 = akr_1.d(this.A);
        if (n < n2) {
            if (((String)akr_1.a(this.A, n)).equals(aVE.aS)) {
                this.x = n;
            }
            ++n;
        }
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        a0D.k();
        String string = (String)akr_1.a(this.A, n);
        if (string.equals(aVE.cq)) {
            string = IN.a(ok_1.a);
        }
        if (string.equals(aVE.E)) {
            string = IN.a(ok_1.b);
        }
        M7.a(this.z, string, this.r / 2, n3 + 1, 0xFFFFFF);
    }

    @Override
    protected int f() {
        return akr_1.d(this.A);
    }
}

