/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.GuiScreen;
import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import net.I18n;
import net.QG;
import net.ServerData;
import net.ServerResourceMode;
import net.aBO;
import net.aIU;
import net.aKZ;
import net.aL0;
import net.aLQ;
import net.apw_1;
import net.hc_1;
import net.sc_0;

public class RR
extends GuiScreen {
    private ServerData x;
    private QG A;
    private sc_0 w;
    private Predicate<String> y = RR::lambda$new$0;
    private GuiScreen v;
    private sc_0 z;

    public RR(GuiScreen guiScreen, ServerData serverData) {
        this.v = guiScreen;
        this.x = serverData;
    }

    private static boolean lambda$new$0(String string) {
        if (StringInvoker.g(string)) {
            return true;
        }
        String[] stringArray = StringInvoker.g(string, aLQ.k);
        if (stringArray.length == 0) {
            return true;
        }
        try {
            aIU.a(stringArray[0]);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void g() {
        hc_1.c(this.w);
        hc_1.c(this.z);
    }

    @Override
    public void l() {
        KeyboardInvoker.a(true);
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 100, this.f / 4 + 96 + 18, I18n.format(aLQ.d, new Object[0])));
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f / 4 + 120 + 18, I18n.format(aLQ.l, new Object[0])));
        this.A = new QG(2, this.n / 2 - 100, this.f / 4 + 72, aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(aLQ.c, new Object[0])), aLQ.g), aBO.a(apw_1.a(aKZ.a(this.x)))).toString());
        ListInvoker.add(this.l, this.A);
        this.w = new sc_0(0, this.q, this.n / 2 - 100, 66, 200, 20);
        hc_1.c(this.w, true);
        hc_1.b(this.w, this.x.h);
        this.z = new sc_0(1, this.q, this.n / 2 - 100, 106, 200, 20);
        hc_1.a(this.z, 128);
        hc_1.b(this.z, this.x.k);
        hc_1.a(this.z, this.y);
        ((QG)ListInvoker.get((List)this.l, (int)0)).g = !StringInvoker.g(hc_1.a(this.z)) && StringInvoker.g(hc_1.a(this.z), aLQ.e).length > 0 && !StringInvoker.g(hc_1.a(this.w));
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        this.z.a(n, n2, n3);
        this.w.a(n, n2, n3);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(aLQ.f, new Object[0]), this.n / 2, 17, 0xFFFFFF);
        this.a(this.q, I18n.format(aLQ.j, new Object[0]), this.n / 2 - 100, 53, 0xA0A0A0);
        this.a(this.q, I18n.format(aLQ.a, new Object[0]), this.n / 2 - 100, 94, 0xA0A0A0);
        hc_1.d(this.w);
        hc_1.d(this.z);
        super.a(n, n2, f);
    }

    @Override
    protected void a(char c, int n) throws IOException {
        hc_1.a(this.w, c, n);
        hc_1.a(this.z, c, n);
        if (n == 15) {
            hc_1.c(this.w, !hc_1.b(this.w));
            hc_1.c(this.z, !hc_1.b(this.z));
        }
        if (n == 28 || n == 156) {
            this.a((QG)ListInvoker.get(this.l, 0));
        }
        ((QG)ListInvoker.get((List)this.l, (int)0)).g = !StringInvoker.g(hc_1.a(this.z)) && StringInvoker.g(hc_1.a(this.z), aLQ.i).length > 0 && !StringInvoker.g(hc_1.a(this.w));
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }

    @Override
    protected void a(QG qG) {
        if (qG.g) {
            if (qG.m == 2) {
                aKZ.a(this.x, ServerResourceMode.values()[(aKZ.a(this.x).ordinal() + 1) % ServerResourceMode.values().length]);
                this.A.k = aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(aLQ.h, new Object[0])), aLQ.b), aBO.a(apw_1.a(aKZ.a(this.x)))).toString();
            } else if (qG.m == 1) {
                this.v.a(false, 0);
            } else if (qG.m == 0) {
                this.x.h = hc_1.a(this.w);
                this.x.k = hc_1.a(this.z);
                this.v.a(true, 0);
            }
        }
    }
}

