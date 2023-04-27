/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.GuiScreen;
import deobf.MCInvoker;
import net.IProgressUpdate;
import net.aL0;
import net.aty_0;

public class RZ
extends GuiScreen
implements IProgressUpdate {
    private String x = aty_0.a;
    private int y;
    private String w = aty_0.c;
    private boolean v;

    @Override
    public void b(String string) {
        this.w = string;
        this.a(0);
    }

    @Override
    public void a(int n) {
        this.y = n;
    }

    @Override
    public void c(String string) {
        this.a(string);
    }

    @Override
    public void a(int n, int n2, float f) {
        if (this.v) {
            if (!MCInvoker.t(this.t)) {
                MCInvoker.displayGuiScreen(this.t, null);
            }
        } else {
            this.h();
            this.b(this.q, this.x, this.n / 2, 70, 0xFFFFFF);
            this.b(this.q, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.w), aty_0.e), this.y), aty_0.d).toString(), this.n / 2, 90, 0xFFFFFF);
            super.a(n, n2, f);
        }
    }

    @Override
    public void b() {
        this.v = true;
    }

    @Override
    public void a(String string) {
        this.x = string;
        this.b(aty_0.b);
    }
}

