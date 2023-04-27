/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import net.I18n;
import net.QG;
import net.a8l_0;
import net.aII;
import net.aL0;
import net.aaj_2;
import net.acC;
import net.anw_0;
import net.atB;
import net.avh_2;
import net.awu_1;

/*
 * Renamed from net.awR
 */
public class awr_1
implements avh_2 {
    private QG a;
    private aII c;
    private String b;
    a8l_0 d;
    private QG e;

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (atB.a(this.a, a8l_0.c(this.d), n2, n3)) {
            a8l_0.a((a8l_0)this.d).x = this.c;
            return true;
        }
        if (atB.a(this.e, a8l_0.c(this.d), n2, n3)) {
            awu_1.a(a8l_0.c((a8l_0)this.d).gameSettings, this.c, GameSettingsInvoker.a(this.c));
            GameSettingsInvoker.a();
            return true;
        }
        return false;
    }

    awr_1(a8l_0 a8l_02, aII aII2, acC acC2) {
        this(a8l_02, aII2);
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        atB.b(this.a, n2, n3);
        atB.b(this.e, n2, n3);
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    private awr_1(a8l_0 a8l_02, aII aII2) {
        this.d = a8l_02;
        this.c = aII2;
        this.b = I18n.format(GameSettingsInvoker.f(aII2), new Object[0]);
        this.a = new QG(0, 0, 0, 75, 20, I18n.format(GameSettingsInvoker.f(aII2), new Object[0]));
        this.e = new QG(0, 0, 0, 50, 20, I18n.format(aaj_2.b, new Object[0]));
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        boolean bl2 = a8l_0.a((a8l_0)this.d).x == this.c;
        FontRendererInvoker.a(a8l_0.c((a8l_0)this.d).fontRendererObj, this.b, n2 + 90 - a8l_0.b(this.d), n3 + n5 / 2 - FontRendererInvoker.d(a8l_0.c((a8l_0)this.d).fontRendererObj) / 2, 0xFFFFFF);
        this.e.n = n2 + 190;
        this.e.h = n3;
        this.e.g = GameSettingsInvoker.getKeyCode(this.c) != GameSettingsInvoker.a(this.c);
        atB.b(this.e, a8l_0.c(this.d), n6, n7);
        this.a.n = n2 + 105;
        this.a.h = n3;
        this.a.k = awu_1.a(GameSettingsInvoker.getKeyCode(this.c));
        if (GameSettingsInvoker.getKeyCode(this.c) != 0) {
            for (aII aII2 : a8l_0.c((a8l_0)this.d).gameSettings.aP) {
                if (aII2 != this.c && GameSettingsInvoker.getKeyCode(aII2) == GameSettingsInvoker.getKeyCode(this.c)) break;
            }
        }
        this.a.k = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.WHITE), aaj_2.a), (Object)anw_0.YELLOW), this.a.k), (Object)anw_0.WHITE), aaj_2.c).toString();
        atB.b(this.a, a8l_0.c(this.d), n6, n7);
    }
}

