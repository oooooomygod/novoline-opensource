/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.uW
 */
public class uw_1
implements avh_2 {
    private QG c;
    private Minecraft a = MCInvoker.f();
    private QG b;

    @Override
    public void a(int n, int n2, int n3) {
    }

    public uw_1(QG qG, QG qG2) {
        this.c = qG;
        this.b = qG2;
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.c != null) {
            atB.b(this.c, n2, n3);
        }
        if (this.b != null) {
            atB.b(this.b, n2, n3);
        }
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        if (this.c != null) {
            this.c.h = n3;
            atB.b(this.c, this.a, n6, n7);
        }
        if (this.b != null) {
            this.b.h = n3;
            atB.b(this.b, this.a, n6, n7);
        }
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (atB.a(this.c, this.a, n2, n3)) {
            if (this.c instanceof qe_0) {
                awu_1.a(this.a.gameSettings, ud_0.a((qe_0)this.c), 1);
                this.c.k = awu_1.a(this.a.gameSettings, aDY.a(this.c.m));
            }
            return true;
        }
        if (this.b != null && atB.a(this.b, this.a, n2, n3)) {
            if (this.b instanceof qe_0) {
                awu_1.a(this.a.gameSettings, ud_0.a((qe_0)this.b), 1);
                this.b.k = awu_1.a(this.a.gameSettings, aDY.a(this.b.m));
            }
            return true;
        }
        return false;
    }
}

