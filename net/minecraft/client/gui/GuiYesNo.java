/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.GuiYesNoCallback;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.I18n;
import net.QG;
import net.acn_1;
import net.dz_0;
import net.my_0;
import net.qe_0;

public class GuiYesNo
extends GuiScreen {
    protected String x;
    protected String B;
    private String A;
    protected GuiYesNoCallback v;
    protected int y;
    protected String z;
    private int w;
    private List<String> C = my_0.c();

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.z, this.n / 2, 70, 0xFFFFFF);
        int n3 = 90;
        Iterator iterator = ListInvoker.iterator(this.C);
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            this.b(this.q, string, this.n / 2, n3, 0xFFFFFF);
            n3 += FontRendererInvoker.d(this.q);
        }
        super.a(n, n2, f);
    }

    public GuiYesNo(GuiYesNoCallback guiYesNoCallback, String string, String string2, int n) {
        this.v = guiYesNoCallback;
        this.z = string;
        this.A = string2;
        this.y = n;
        this.B = I18n.format(acn_1.b, new Object[0]);
        this.x = I18n.format(acn_1.a, new Object[0]);
    }

    @Override
    protected void a(QG qG) throws IOException {
        this.v.a(qG.m == 0, this.y);
    }

    @Override
    public void l() {
        ListInvoker.add(this.l, new qe_0(0, this.n / 2 - 155, this.f / 6 + 96, this.B));
        ListInvoker.add(this.l, new qe_0(1, this.n / 2 - 155 + 160, this.f / 6 + 96, this.x));
        ListInvoker.clear(this.C);
        ListInvoker.addAll(this.C, FontRendererInvoker.b(this.q, this.A, this.n - 50));
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public GuiYesNo(GuiYesNoCallback guiYesNoCallback, String string, String string2, String string3, String string4, int n) {
        this.v = guiYesNoCallback;
        this.z = string;
        this.A = string2;
        this.B = string3;
        this.x = string4;
        this.y = n;
    }

    @Override
    public void g() {
        super.g();
        if (--this.w == 0) {
            Iterator iterator = ListInvoker.iterator(this.l);
            while (dz_0.c(iterator)) {
                QG qG = (QG)dz_0.b(iterator);
                qG.g = true;
            }
        }
    }

    public void a(int n) {
        this.w = n;
        Iterator iterator = ListInvoker.iterator(this.l);
        while (dz_0.c(iterator)) {
            QG qG = (QG)dz_0.b(iterator);
            qG.g = false;
        }
    }
}

