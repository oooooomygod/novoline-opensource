/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import net.minecraft.world.GameType;

/*
 * Renamed from net.cl
 */
public class cl_1
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aps_0.b;
    }

    @Override
    public String b() {
        return aps_0.c;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        String string = ServerInvoker.a(ServerInvoker.d(), GameType.SURVIVAL, false);
        cl_1.a(iCommandSender, (ICommand)this, aps_0.d, string);
    }
}

