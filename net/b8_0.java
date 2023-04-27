/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import net.ICommand;
import net.ICommandSender;
import net.WorldInfo;
import net.a3V;
import net.am_0;
import net.ama_1;
import net.ht_1;
import net.uv_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.b8
 */
public class b8_0
extends am_0 {
    @Override
    public String b(ICommandSender iCommandSender) {
        return ama_1.b;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        this.a();
        b8_0.a(iCommandSender, (ICommand)this, ama_1.c, new Object[0]);
    }

    @Override
    public String b() {
        return ama_1.a;
    }

    protected void a() {
        WorldInfo worldInfo;
        uv_2.d(worldInfo, !uv_2.b(worldInfo = a3V.d(ServerInvoker.d().r[0])));
    }
}

