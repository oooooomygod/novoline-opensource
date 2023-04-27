/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import net.ChatComponentText;
import net.ICommandSender;
import net.Mb;
import net.P8;
import net.a9N;
import net.aek_1;
import net.alj_1;
import net.am_0;
import net.aoz_1;
import net.ht_1;

/*
 * Renamed from net.bY
 */
public class by_1
extends am_0 {
    @Override
    public int a() {
        return 0;
    }

    @Override
    public String b() {
        return Mb.a;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return Mb.c;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        int n = ServerInvoker.a(ServerInvoker.d());
        alj_1.a(iCommandSender, new aoz_1(Mb.d, P8.d(n), P8.d(ServerInvoker.v(ServerInvoker.d()))));
        alj_1.a(iCommandSender, new ChatComponentText(aek_1.a(ServerInvoker.R(ServerInvoker.d()), stringArray.length > 0 && StringInvoker.d(Mb.b, stringArray[0]))));
        alj_1.a(iCommandSender, a9N.QUERY_RESULT, n);
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

