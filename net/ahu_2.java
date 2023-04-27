/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.gui.alt.AltList;
import deobf.MCInvoker;

/*
 * Renamed from net.ahu
 */
public class ahu_2
extends ahp_2<ahv_2> {
    private ahg_2 g;
    private ahg_2 j;
    private ahg_2 a;
    private boolean h;
    private ahg_2 k;
    private ah2_0 i = new ahd_1(this, this, wv_0.d);

    public void c(boolean bl) {
        this.h = bl;
    }

    @Override
    public void c(int n, int n2) {
        adp_0.b(false);
        double[] dArray = avf_2.e((AltList)((ahv_2)this.c()).c());
        a1V.a(dArray[0], dArray[1], dArray[2], dArray[3], -1);
        adp_0.a(true);
        this.a.c(n, n2);
        this.j.c(n, n2);
        this.k.c(n, n2);
        this.g.c(n, n2);
        this.i.c(n, n2);
        a7l_0.b(adj_1.a(ob_0.a, 25), wv_0.c, this.e(), this.a() + 13.0, -1, true);
        adp_0.a();
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.k.a(n, n2, n3);
        this.j.a(n, n2, n3);
        this.a.a(n, n2, n3);
        this.g.a(n, n2, n3);
        this.i.a(n, n2, n3);
    }

    @Override
    public double a() {
        return ((AltList)((ahv_2)this.c()).c()).q();
    }

    @Override
    public void a(char c, int n) {
    }

    public ahu_2(ahv_2 ahv_22) {
        super(ahv_22);
        this.a = new ahc_2(this, this);
        this.j = new ahn_2(this, this);
        this.g = new aho_2(this, this);
        this.k = new ahk_2(this, this);
    }

    @Override
    public double e() {
        return ((AltList)((ahv_2)this.c()).c()).k() + 15.0 + (double)ListInvoker.indexOf(avf_2.b((AltList)((ahv_2)this.c()).c()), this) * avf_2.d((AltList)((ahv_2)this.c()).c()) - (double)220.3f - avf_2.h((AltList)((ahv_2)this.c()).c());
    }

    @Override
    public void b(int n, int n2) {
        ahv_2.e();
        if (this.h) {
            NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), wv_0.b, aL0.a(aL0.a(new StringBuilder(), wv_0.a), SessionInvoker.getUsername(MCInvoker.f().session)).toString(), NotificationType.INFO);
            this.h = false;
        }
        a3v_0.a(this.a, n, n2);
        a3v_0.a(this.j, n, n2);
        this.j.b(n, n2);
        a3v_0.a(this.g, n, n2);
        this.g.b(n, n2);
        a3v_0.a(this.k, n, n2);
        this.i.b(n, n2);
    }
}

