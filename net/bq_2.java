/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import net.ICommand;
import net.ICommandSender;
import net.P8;
import net.am_0;
import net.ax__0;
import net.ht_1;
import net.ip_2;

/*
 * Renamed from net.bq
 */
public class bq_2
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ax__0.d;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length != 1) {
            throw new ip_2(ax__0.c, new Object[0]);
        }
        int n = bq_2.a(stringArray[0], 0);
        ServerInvoker.b(ServerInvoker.d(), n);
        bq_2.a(iCommandSender, (ICommand)this, ax__0.b, P8.d(n));
    }

    @Override
    public String b() {
        return ax__0.a;
    }

    @Override
    public int a() {
        return 3;
    }
}

