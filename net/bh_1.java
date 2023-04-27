/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.EntityPlayerMP;
import net.minecraft.world.GameType;
import deobf.MinecraftServer;
import java.util.Iterator;

/*
 * Renamed from net.bh
 */
public class bh_1
extends ba_0 {
    @Override
    public String b() {
        return aP4.a;
    }

    private static ht_1 b(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aP4.e;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length <= 0) {
            throw new ip_2(aP4.c, new Object[0]);
        }
        GameType gameType = this.a(iCommandSender, stringArray[0]);
        this.a(gameType);
        bh_1.a(iCommandSender, (ICommand)this, aP4.b, new aoz_1(aL0.a(aL0.a(new StringBuilder(), aP4.d), ar3_0.b(gameType)).toString(), new Object[0]));
    }

    protected void a(GameType gameType) {
        MinecraftServer minecraftServer = ServerInvoker.d();
        minecraftServer.a(gameType);
        if (ServerInvoker.K(minecraftServer)) {
            Iterator iterator = ListInvoker.iterator(aek_1.l(ServerInvoker.R(ServerInvoker.d())));
            while (dz_0.c(iterator)) {
                EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
                entityPlayerMP.a(gameType);
                entityPlayerMP.fallDistance = 0.0f;
            }
        }
    }
}

