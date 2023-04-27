/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import net.FutureTask;
import net.NotificationType;
import net.ag3_0;
import net.aky_0;

class aUY
extends FutureTask {
    NotificationType g;
    String a;
    aky_0 f;
    String h;

    @Override
    public void f() {
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), this.a, this.h, this.g);
    }

    aUY(aky_0 aky_02, int n, ag3_0 ag3_02, String string, String string2, NotificationType notificationType) {
        this.f = aky_02;
        this.a = string;
        this.h = string2;
        this.g = notificationType;
        super(n, ag3_02);
    }

    @Override
    public void b() {
    }
}

