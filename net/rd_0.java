/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GuiYesNoCallback;
import java.io.IOException;
import net.GuiYesNo;
import net.I18n;
import net.QG;
import net.aI3;

/*
 * Renamed from net.Rd
 */
public class rd_0
extends GuiYesNo {
    private boolean G = true;
    private String E;
    private String D;
    private String F;

    @Override
    public void l() {
        super.l();
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 50 - 105, this.f / 6 + 96, 100, 20, this.B));
        ListInvoker.add(this.l, new QG(2, this.n / 2 - 50, this.f / 6 + 96, 100, 20, this.E));
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 50 + 105, this.f / 6 + 96, 100, 20, this.x));
    }

    public void a() {
        rd_0.e(this.F);
    }

    public rd_0(GuiYesNoCallback guiYesNoCallback, String string, int n, boolean bl) {
        super(guiYesNoCallback, I18n.format(aI3.e, new Object[0]), string, n);
        this.B = I18n.format(aI3.b, new Object[0]);
        this.x = I18n.format(aI3.a, new Object[0]);
        this.E = I18n.format(aI3.d, new Object[0]);
        this.D = I18n.format(aI3.h, new Object[0]);
        this.F = string;
    }

    private static IOException b(IOException iOException) {
        return iOException;
    }

    public void b() {
        this.G = false;
    }

    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
        if (this.G) {
            this.b(this.q, this.D, this.n / 2, 110, 0xFFCCCC);
        }
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 2) {
            this.a();
        }
        this.v.a(qG.m == 0, this.y);
    }
}

