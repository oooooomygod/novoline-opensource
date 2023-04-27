/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.script.Script;
import cc.novoline.modules.visual.ClickGui;
import deobf.ModuleRegistry;
import java.awt.Color;

public class H2 {
    private float c = 0.0f;
    private Script a;
    private boolean b;
    private double e;
    private double d;

    public H2(Script script) {
        this.a = script;
    }

    public boolean b() {
        return this.b;
    }

    public void a(int n, int n2, int n3) {
        wr_2.b();
        if (this.a(n, n2)) {
            this.b = true;
        }
        if (this.b) {
            this.b = false;
        }
    }

    public void a(ClickGUI clickGUI, int n, int n2, double d, double d2, Color color) {
        ClickGui clickGui;
        block7: {
            block6: {
                wr_2.b();
                this.d = d;
                this.e = d2;
                if (!this.a(n, n2)) break block6;
                if (!(this.c < 1.0f)) break block7;
                this.c += (1.0f - this.c) * 0.1f;
            }
            if (this.c > 0.0f) {
                this.c -= this.c * 0.1f;
            }
        }
        if (this.b) {
            this.c = 1.0f;
        }
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI)), axc_0.a)) {
            a1V.b(d, d2, d + 130.0, d2 + 20.0, aol_1.b(new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), (int)(this.c * 150.0f))));
            KN.b(clickGUI, adj_1.a(ng_0.a, 20), asu_1.a(this.a), d + 6.0, d2 + 6.5, -1, true);
        }
        a1V.b(d, d2, d + 130.0, d2 + 20.0, aol_1.b(new Color(0, 0, 0, (int)(this.c * 60.0f))));
        KN.b(clickGUI, adj_1.a(ng_0.a, 20), asu_1.a(this.a), d + 6.0, d2 + 6.5, this.a(n, n2) || this.b ? aol_1.b(color) : -1, true);
    }

    public boolean a(int n, int n2) {
        wr_2.b();
        return (double)n > this.d && (double)n < this.d + 120.0 && (double)n2 > this.e && (double)n2 < this.e + 20.0;
    }

    public Script a() {
        return this.a;
    }
}

