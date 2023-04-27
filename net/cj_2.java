/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.MinecraftServer;
import net.I5;
import net.ICommand;
import net.ICommandSender;
import net.WorldServer;
import net.am_0;
import net.ht_1;

/*
 * Renamed from net.cj
 */
public class cj_2
extends am_0 {
    @Override
    public String b() {
        return I5.c;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        MinecraftServer minecraftServer = ServerInvoker.d();
        for (int i = 0; i < minecraftServer.r.length; ++i) {
            if (minecraftServer.r[i] == null) continue;
            WorldServer worldServer = minecraftServer.r[i];
            if (!worldServer.P) continue;
            worldServer.P = false;
        }
        cj_2.a(iCommandSender, (ICommand)this, I5.a, new Object[0]);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return I5.b;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

