/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.anx
 */
public class anx_2
implements avh_2 {
    private Minecraft d = MCInvoker.f();
    private Gui b;
    private Gui c;
    private Gui a;

    private void a(Qw qw, int n, int n2, int n3, boolean bl) {
        qw.t = n;
        qt_2.a(qw, this.d, n2, n3);
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.a(this.c, n3, 0, 0, true);
        this.a(this.a, n3, 0, 0, true);
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        this.a(this.c, n2, n3, n4);
        this.a(this.a, n2, n3, n4);
    }

    private void b(QG qG, int n, int n2, int n3) {
        atB.b(qG, n, n2);
    }

    static Gui c(anx_2 anx_22) {
        return anx_22.c;
    }

    private boolean b(Gui gui, int n, int n2, int n3) {
        return false;
    }

    private void a(Gui gui, int n, int n2, int n3) {
        if (gui instanceof QG) {
            this.b((QG)gui, n, n2, n3);
        }
    }

    public Gui b() {
        return this.c;
    }

    private void a(sc_0 sc_02, int n, int n2, int n3) {
        hc_1.a(sc_02, n, n2, n3);
        if (hc_1.b(sc_02)) {
            this.b = sc_02;
        }
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.b(this.c, n2, n3, n4);
        this.b(this.a, n2, n3, n4);
        return true;
    }

    public anx_2(Gui gui, Gui gui2) {
        this.c = gui;
        this.a = gui2;
    }

    public Gui a() {
        return this.a;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        this.a(this.c, n3, n6, n7, false);
        this.a(this.a, n3, n6, n7, false);
    }

    private void a(sc_0 sc_02, int n, boolean bl) {
        sc_02.m = n;
        hc_1.d(sc_02);
    }

    static Gui b(anx_2 anx_22) {
        return anx_22.b;
    }

    private void a(Gui gui, int n, int n2, int n3, boolean bl) {
        if (gui instanceof QG) {
            this.a((QG)gui, n, n2, n3, bl);
        } else if (gui instanceof sc_0) {
            this.a((sc_0)gui, n, bl);
        } else if (gui instanceof Qw) {
            this.a((Qw)gui, n, n2, n3, bl);
        }
    }

    private void a(QG qG, int n, int n2, int n3, boolean bl) {
        qG.h = n;
        atB.b(qG, this.d, n2, n3);
    }

    private boolean a(QG qG, int n, int n2, int n3) {
        boolean bl = atB.a(qG, this.d, n, n2);
        this.b = qG;
        return bl;
    }

    static Gui a(anx_2 anx_22) {
        return anx_22.a;
    }
}

