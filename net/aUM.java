/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import net.FutureTask;
import net.NotificationType;
import net.aAG;
import net.ag3_0;

class aUM
extends FutureTask {
    NotificationType a;
    String f;
    aAG g;

    @Override
    public void f() {
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), this.f, this.a);
    }

    aUM(aAG aAG2, int n, ag3_0 ag3_02, String string, NotificationType notificationType) {
        this.g = aAG2;
        this.f = string;
        this.a = notificationType;
        super(n, ag3_02);
    }

    @Override
    public void b() {
    }
}

