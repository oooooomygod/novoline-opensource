/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import net.ICommand;
import net.ICommandSender;
import net.am_0;
import net.ht_1;
import net.hz_1;

/*
 * Renamed from net.cV
 */
public class cv_1
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b() {
        return hz_1.c;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return hz_1.a;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (ServerInvoker.d().r != null) {
            cv_1.a(iCommandSender, (ICommand)this, hz_1.b, new Object[0]);
        }
        ServerInvoker.n(ServerInvoker.d());
    }
}

