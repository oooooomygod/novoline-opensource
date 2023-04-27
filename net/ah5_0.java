/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthResult
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthenticator
 */
package net;

import deobf.MCInvoker;
import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticator;
import net.Session;
import net.a69;
import net.aAQ;
import net.aIL;
import net.ads_0;
import net.aeo_0;
import net.ah2_0;
import net.ahr_2;
import net.ahu_2;
import net.ahv_2;
import net.avs_1;
import net.awz_1;

/*
 * Renamed from net.ah5
 */
class ah5_0
extends ah2_0 {
    ahr_2 i;

    @Override
    public boolean b() {
        return true;
    }

    ah5_0(ahr_2 ahr_22, ahu_2 ahu_22, String string) {
        this.i = ahr_22;
        super(ahu_22, string);
    }

    @Override
    public double e() {
        return ((ahu_2)this.c()).e() + 230.0;
    }

    private void lambda$clicked$0(MicrosoftAuthResult microsoftAuthResult, Throwable throwable) {
        MCInvoker.f().session = new Session(ads_0.a(aAQ.a(microsoftAuthResult)), ads_0.b(aAQ.a(microsoftAuthResult)), aAQ.c(microsoftAuthResult), awz_1.a);
        a69.a((ahu_2)this.c(), true);
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 200.0;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.e();
        if (this.a(n, n2) && n3 == 0) {
            this.a(false);
            ((ahu_2)this.c()).a(true);
            MicrosoftAuthenticator microsoftAuthenticator = new MicrosoftAuthenticator();
            avs_1.a(aIL.b(microsoftAuthenticator, aeo_0.a(ahr_2.a(this.i))), this::lambda$clicked$0);
        }
    }
}

