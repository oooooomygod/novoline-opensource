/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.List;
import net.UW;
import net.a5K;
import net.aQ2;
import net.asj_0;
import net.atT;
import net.atn_0;
import net.ay_2;
import net.rr_1;

public class atJ
extends atT {
    public ay_2 H;
    public ay_2 B = new ay_2();
    public boolean u = false;
    public a5K F;
    public static List<atJ> K = new ArrayList<atJ>();
    public a5K M;
    public a5K E;
    public ay_2 A = new ay_2();
    public a5K C;
    public a5K x;
    public a5K w;
    public a5K G;
    public a5K y;
    public a5K s;
    public boolean I = false;
    public a5K D;
    public a5K L;
    public a5K v;
    public int z = 0;
    public aQ2 J;
    public a5K t;

    public void a(rr_1 rr_12) {
        atT.f();
        if (this.w == null) {
            this.w = new a5K(rr_12);
        }
        UW.a(this.w, (a5K)rr_12.r);
        if (this.y == null) {
            this.y = new a5K(rr_12);
        }
        UW.a(this.y, (a5K)rr_12.k);
        if (this.M == null) {
            this.M = new a5K(rr_12);
        }
        UW.a(this.M, (a5K)rr_12.q);
        if (this.L == null) {
            this.L = new a5K(rr_12);
        }
        UW.a(this.L, (a5K)rr_12.h);
        if (this.v == null) {
            this.v = new a5K(rr_12);
        }
        UW.a(this.v, (a5K)rr_12.j);
        if (this.G == null) {
            this.G = new a5K(rr_12);
        }
        UW.a(this.G, (a5K)rr_12.l);
        if (this.E == null) {
            this.E = new a5K(rr_12);
        }
        UW.a(this.E, (a5K)rr_12.o);
        if (this.s == null) {
            this.s = new a5K(rr_12);
        }
        UW.a(this.s, rr_12.E);
        if (this.x == null) {
            this.x = new a5K(rr_12);
        }
        UW.a(this.x, rr_12.L);
        if (this.D == null) {
            this.D = new a5K(rr_12);
        }
        UW.a(this.D, rr_12.M);
        if (this.F == null) {
            this.F = new a5K(rr_12);
        }
        UW.a(this.F, rr_12.B);
        asj_0.a(this.B, rr_12.S);
        asj_0.a(this.A, rr_12.Q);
        asj_0.a(this.H, rr_12.A);
        this.J = rr_12.N;
        ListInvoker.b(new ListInvoker[4]);
    }

    public atJ(int n) {
        super(n);
        this.H = new ay_2();
        this.J = new aQ2();
    }

    @Override
    public void j() {
        block8: {
            block7: {
                atT.f();
                if (atn_0.z(this.d()) == null) break block7;
                if (!(this.h > 6.0f)) break block8;
                if (this.z == 0) {
                    this.z = 1;
                    this.h = 0.0f;
                }
                if (!(this.h < 15.0f)) break block8;
                if (this.z == 1) {
                    this.z = 2;
                }
                if (this.z == 2) {
                    this.z = 3;
                }
                if (this.z == 3) {
                    this.z = 1;
                }
                this.h = 0.0f;
            }
            this.u = !this.u;
            this.h = 0.0f;
        }
    }

    public static atJ a(int n) {
        atT.f();
        int n2 = 0;
        if (n2 < ListInvoker.size(K)) {
            if (((atJ)ListInvoker.get(atJ.K, (int)n2)).o == n) {
                return (atJ)ListInvoker.get(K, n2);
            }
            ++n2;
        }
        atJ atJ2 = new atJ(n);
        if (BlockInvoker.b(MCInvoker.f().world, n) != null) {
            ListInvoker.add(K, atJ2);
        }
        return atJ2;
    }

    public static void a(atJ atJ2) {
        ListInvoker.add(K, atJ2);
    }

    @Override
    public void h() {
        super.h();
    }

    @Override
    public void a(float f) {
        atT.f();
        super.a(f);
        if (this.h > 20.0f) {
            this.z = 0;
        }
        if (this.c - this.g == 0.0f) {
            this.I = !this.I;
        }
    }
}

