/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.awt.Color;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import net.AltRepositoryGUI;
import net.P8;
import net.QA;
import net.QG;
import net.QO;
import net.a7l_0;
import net.aE3;
import net.aL0;
import net.aYW;
import net.ais_0;
import net.aj7;
import net.aks_1;
import net.alq_0;
import net.anw_0;
import net.aol_1;
import net.arv_2;
import net.asl_0;
import net.aw__0;
import net.axj_0;
import net.ch_2;
import net.hc_1;
import net.ow_1;
import net.sc_0;
import net.sn_0;
import net.tm_2;
import net.wk_2;
import net.xg_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.Rl
 */
public class rl_0
extends GuiScreen {
    private String x;
    private sc_0 A;
    private static Pattern v = ow_1.c(axj_0.a);
    private AltRepositoryGUI y;
    private QA w;
    private String z;
    private BiConsumer<rl_0, ? super ais_0> B;

    private void b() {
        ais_0 ais_02;
        block8: {
            String string;
            block7: {
                block6: {
                    P8.b();
                    if (!StringInvoker.g(StringInvoker.h(hc_1.a(this.A)))) break block6;
                    return;
                }
                ais_02 = new ais_0(hc_1.a(this.A));
                string = aks_1.b(ais_02);
                if (StringInvoker.k(string, axj_0.g)) break block7;
                alq_0.a(this.w, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), axj_0.i).toString());
                return;
            }
            if (StringInvoker.c(string) <= 16) break block8;
            alq_0.a(this.w, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), axj_0.h).toString());
            return;
        }
        try {
            arv_2.a(this.B, this, ais_02);
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    protected void a(char c, int n) {
        P8.b();
        if (n == 1) {
            MCInvoker.displayGuiScreen(this.t, this.y);
            return;
        }
        if (n == 28) {
            this.b();
            return;
        }
        switch (c) {
            case '\t': {
                hc_1.b(this.A);
                hc_1.c(this.A, true);
            }
            case '\r': {
                this.a((QG)ListInvoker.get(this.l, 0));
            }
        }
        hc_1.a(this.A, c, n);
    }

    public QA a() {
        return this.w;
    }

    @Override
    public void a(int n, int n2, float f) {
        FontRenderer fontRenderer = aE3.a;
        P8.b();
        this.a(0, 0, this.n, this.f, aol_1.b(new Color(32, 34, 37)));
        sc_0 sc_02 = this.A;
        hc_1.d(sc_02);
        alq_0.a(this.w, this.t, n, n2);
        if (aw__0.d(hc_1.a(sc_02)) && !hc_1.b(sc_02)) {
            a7l_0.a(fontRenderer, (CharSequence)axj_0.f, (float)this.n / 2.0f - 96.0f, 64.0f, -7829368);
        }
        super.a(n, n2, f);
    }

    @Override
    protected void a(QG qG) {
        P8.b();
        switch (qG.m) {
            case 0: {
                this.b();
            }
            case 1: {
                MCInvoker.displayGuiScreen(this.t, this.y);
            }
            case 2: {
                this.c();
                return;
            }
        }
    }

    public rl_0(@NotNull AltRepositoryGUI altRepositoryGUI, @NotNull String string, @NotNull String string2, @NotNull BiConsumer<rl_0, ? super ais_0> biConsumer) {
        this.y = altRepositoryGUI;
        this.z = string;
        this.x = string2;
        this.B = biConsumer;
    }

    @Override
    protected void b(int n, int n2, int n3) {
        try {
            super.b(n, n2, n3);
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(NovolineInvoker.getLogger(), throwable);
        }
        this.A.a(n, n2, n3);
    }

    static boolean a(@NotNull String string) {
        asl_0.a(string, axj_0.c);
        return wk_2.a(ow_1.a(v, string));
    }

    @Nullable
    private ais_0 c() {
        String string;
        block5: {
            P8.b();
            string = null;
            Transferable transferable = tm_2.a(aj7.b(aj7.a()), null);
            if (transferable == null) break block5;
            if (!xg_2.b(transferable, DataFlavor.stringFlavor)) break block5;
            try {
                string = StringInvoker.h((String)xg_2.a(transferable, DataFlavor.stringFlavor));
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (string == null) {
            return null;
        }
        int n = StringInvoker.d(string, 58);
        return n == -1 ? null : new ais_0(StringInvoker.b(string, 0, n));
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }

    @Override
    public void l() {
        int n = this.f / 4 - 70;
        this.w = new QA(this, this.x);
        List list = this.l;
        ListInvoker.add(list, new QO(this.z, 0, this.n / 2 - 100, n + 24, 10, aYW.a));
        ListInvoker.add(list, new QO(axj_0.b, 1, this.n / 2 - 100, n + 48, 10, aYW.a));
        P8.b();
        this.A = new sn_0(0, this.t.fontRendererObj, this.n / 2 - 100, 60, 200, 20, axj_0.d);
        hc_1.c(this.A, true);
        KeyboardInvoker.a(true);
        if (ListInvoker.b() != null) {
            P8.b(new int[2]);
        }
    }
}

