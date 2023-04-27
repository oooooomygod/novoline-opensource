/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import net.GO;
import net.NotificationType;
import net.Q1;
import net.a20;
import net.a28;
import net.a2w;
import net.aL0;
import net.auk_2;
import net.aye_2;

public class QT
extends Q1 {
    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
    }

    private static void lambda$onInitialize$0(Integer n) {
        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), aL0.a(aL0.a(new StringBuilder(), aye_2.b), n).toString(), NotificationType.SUCCESS);
    }

    @Override
    protected void a() {
        this.a(new a28(new a2w(aye_2.c, -16711936, GO.a), 10, 10, QT::lambda$onInitialize$0));
        auk_2.b();
        this.a(new a20(new a2w(aye_2.a, -16711936, GO.a), 8, 10, 40, 400, 200));
        ListInvoker.b(new ListInvoker[3]);
    }
}

