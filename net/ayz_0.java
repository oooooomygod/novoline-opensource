/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.SessionInvoker;
import deobf.MCInvoker;
import net.AltRepositoryGUI;
import net.NotificationType;
import net.Session;
import net.aL0;
import net.aME;
import net.alq_0;
import net.apt_0;
import net.asx_1;
import net.aul_2;
import net.aye_0;
import net.rl_0;

/*
 * Renamed from net.aYz
 */
class ayz_0
extends aye_0 {
    AltRepositoryGUI c;
    rl_0 a;

    @Override
    public void a() {
        alq_0.a(aME.a(this.a), aL0.a(aL0.a(new StringBuilder(), (Object)asx_1.RED), aul_2.a).toString());
    }

    @Override
    public void a(apt_0 apt_02, Session session) {
        super.a(apt_02, session);
        String string = aL0.a(aL0.a(new StringBuilder(), aul_2.b), SessionInvoker.getUsername(session)).toString();
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), string, NotificationType.INFO);
        MCInvoker.displayGuiScreen(AltRepositoryGUI.a(this.c), this.c);
    }

    ayz_0(AltRepositoryGUI altRepositoryGUI, rl_0 rl_02) {
        this.c = altRepositoryGUI;
        this.a = rl_02;
    }
}

