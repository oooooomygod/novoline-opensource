/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.IChatComponent;
import java.util.Iterator;
import java.util.List;
import net.T3;
import net.aBO;
import net.aGK;
import net.dz_0;
import net.mf_2;
import net.qk_1;
import net.yo_2;

/*
 * Renamed from net.yk
 */
public class yk_2
extends yo_2 {
    private List<String> o;
    private int s;
    private IChatComponent r;
    private yo_2 p;
    private String q;

    @Override
    public void a(int n, int n2, float f) {
        this.j();
        this.c(this.q, this.n() / 2, this.c() / 2 - this.s / 2 - this.h() * 2, 0xAAAAAA);
        int n3 = this.c() / 2 - this.s / 2;
        if (this.o != null) {
            Iterator iterator = ListInvoker.iterator(this.o);
            while (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                this.c(string, this.n() / 2, n3, 0xFFFFFF);
                n3 += this.h();
            }
        }
        super.a(n, n2, f);
    }

    @Override
    public void e() {
        aGK.a(false);
        this.f();
        this.o = this.a(aBO.a(this.r), this.n() - 50);
        this.s = ListInvoker.size(this.o) * this.h();
        this.a(yk_2.a(0, this.n() / 2 - 100, this.c() / 2 + this.s / 2 + this.h(), yk_2.c(qk_1.a)));
    }

    @Override
    public void c(mf_2 mf_22) {
        if (T3.a(mf_22) == 0) {
            aGK.a(this.p);
        }
    }

    @Override
    public void a(char c, int n) {
        if (n == 1) {
            aGK.a(this.p);
        }
    }

    public yk_2(yo_2 yo_22, String string, IChatComponent iChatComponent) {
        this.p = yo_22;
        this.q = yk_2.c(string);
        this.r = iChatComponent;
    }
}

