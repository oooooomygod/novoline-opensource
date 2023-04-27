/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

public class bB
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length == 0) {
            EntityPlayerMP entityPlayerMP = bB.a(iCommandSender);
            a6w_0.D(entityPlayerMP);
            bB.a(iCommandSender, (ICommand)this, dn_1.a, a6w_0.w(entityPlayerMP));
        } else {
            Entity entity = bB.b(iCommandSender, stringArray[0]);
            ayj_0.M(entity);
            bB.a(iCommandSender, (ICommand)this, dn_1.d, ayj_0.P(entity));
        }
    }

    @Override
    public String b() {
        return dn_1.b;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bB.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return dn_1.c;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }
}

