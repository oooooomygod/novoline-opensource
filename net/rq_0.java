/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SnooperInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.FG;
import net.I18n;
import net.QG;
import net.a8x_0;
import net.a9C;
import net.aL0;
import net.aS0;
import net.aj2;
import net.atj_0;
import net.awu_1;
import net.dz_0;
import net.my_0;

/*
 * Renamed from net.Rq
 */
public class rq_0
extends GuiScreen {
    private GuiScreen y;
    private GameSettings C;
    private String w;
    private String[] v;
    private List<String> x;
    private List<String> z = my_0.c();
    private a8x_0 B;
    private QG A;

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 2) {
                awu_1.c(this.C);
                awu_1.c(this.C);
                MCInvoker.displayGuiScreen(this.t, this.y);
            }
            if (qG.m == 1) {
                awu_1.a(this.C, aj2.SNOOPER_ENABLED, 1);
                this.A.k = awu_1.a(this.C, aj2.SNOOPER_ENABLED);
            }
        }
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.B.g();
    }

    @Override
    public void l() {
        Map.Entry entry;
        Object object;
        this.w = I18n.format(a9C.c, new Object[0]);
        String string = I18n.format(a9C.e, new Object[0]);
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(FontRendererInvoker.b(this.q, string, this.n - 30));
        while (dz_0.c(iterator)) {
            object = dz_0.b(iterator);
            ListInvoker.add(arrayList, (String)object);
        }
        this.v = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        ListInvoker.clear(this.z);
        ListInvoker.clear(this.x);
        this.A = new QG(1, this.n / 2 - 152, this.f - 30, 150, 20, awu_1.a(this.C, aj2.SNOOPER_ENABLED));
        ListInvoker.add(this.l, this.A);
        ListInvoker.add(this.l, new QG(2, this.n / 2 + 2, this.f - 30, 150, 20, I18n.format(a9C.b, new Object[0])));
        boolean bl = MCInvoker.q(this.t) != null && IntegratedServerInvoker.i(MCInvoker.q(this.t)) != null;
        object = aS0.f(atj_0.c(new TreeMap(SnooperInvoker.a(MCInvoker.d(this.t)))));
        while (dz_0.c((Iterator)object)) {
            entry = (Map.Entry)dz_0.b((Iterator)object);
            ListInvoker.add(this.z, aL0.a(aL0.a(new StringBuilder(), a9C.a), (String)FG.b(entry)).toString());
            ListInvoker.add(this.x, FontRendererInvoker.a(this.q, (String)FG.a(entry), this.n - 220));
        }
        object = aS0.f(atj_0.c(new TreeMap(SnooperInvoker.a(IntegratedServerInvoker.i(MCInvoker.q(this.t))))));
        while (dz_0.c((Iterator)object)) {
            entry = (Map.Entry)dz_0.b((Iterator)object);
            ListInvoker.add(this.z, aL0.a(aL0.a(new StringBuilder(), a9C.d), (String)FG.b(entry)).toString());
            ListInvoker.add(this.x, FontRendererInvoker.a(this.q, (String)FG.a(entry), this.n - 220));
        }
        this.B = new a8x_0(this);
    }

    static List a(rq_0 rq_02) {
        return rq_02.x;
    }

    static List b(rq_0 rq_02) {
        return rq_02.z;
    }

    public rq_0(GuiScreen guiScreen, GameSettings gameSettings) {
        this.x = my_0.c();
        this.y = guiScreen;
        this.C = gameSettings;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.B.a(n, n2, f);
        this.b(this.q, this.w, this.n / 2, 8, 0xFFFFFF);
        int n3 = 22;
        for (String string : this.v) {
            this.b(this.q, string, this.n / 2, n3, 0x808080);
            n3 += FontRendererInvoker.d(this.q);
        }
        super.a(n, n2, f);
    }
}

