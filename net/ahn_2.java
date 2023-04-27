/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthResult
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthenticator
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import deobf.MCInvoker;
import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticator;
import java.awt.Color;

/*
 * Renamed from net.ahn
 */
class ahn_2
extends ahg_2 {
    ahu_2 g;

    private void lambda$clicked$0(MicrosoftAuthResult microsoftAuthResult, Throwable throwable) {
        ea_1.a(System.out, aAQ.c(microsoftAuthResult));
        MCInvoker.f().session = new Session(ads_0.a(aAQ.a(microsoftAuthResult)), ads_0.b(aAQ.a(microsoftAuthResult)), aAQ.c(microsoftAuthResult), al9_0.c);
        ((ahu_2)this.c()).c(true);
    }

    @Override
    public void b(int n, int n2) {
        a1V.a(this.e() + 80.0 - 14.0, this.a() + 28.0 - 22.0, 12.0f, 4.0f, avf_2.e((AltList)((ahv_2)((ahu_2)this.c()).c()).c()));
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.d();
        if (this.e(n, n2) && n3 == 0) {
            MicrosoftAuthenticator microsoftAuthenticator = new MicrosoftAuthenticator();
            avs_1.a(aIL.a(microsoftAuthenticator), this::lambda$clicked$0);
        }
    }

    @Override
    public boolean e(int n, int n2) {
        ahv_2.e();
        return (double)n > this.e() && (double)n < this.e() + 160.0 && (double)n2 > this.a() && (double)n2 < this.a() + 57.0;
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 97.0;
    }

    @Override
    public void d(int n, int n2) {
        ahv_2.e();
        if (this.e(n, n2) || this.b()) {
            this.a(this.a() + (1.0f - this.a()) * 0.04f);
        }
        this.a(this.a() - this.a() * 0.04f);
        aV3.a(aV3.a(), this.e(), this.a(), 160.0, 57.0, 12.0, 2.0, new Color(a1V.a(new Color(26, 26, 26), new Color(20, 20, 20), (double)this.a())), avf_2.e((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), true);
    }

    ahn_2(ahu_2 ahu_22, ahu_2 ahu_23) {
        this.g = ahu_22;
        super(ahu_23);
    }

    @Override
    public void c(int n, int n2) {
        FontRenderer fontRenderer = adj_1.a(ob_0.a, 25);
        a7l_0.b(fontRenderer, al9_0.a, this.e() + 80.0 - (double)(a7l_0.a(fontRenderer, al9_0.b) / 2), this.a() + 28.0 - (double)(a7l_0.a(fontRenderer) / 2) + 18.0, -1, true);
    }
}

