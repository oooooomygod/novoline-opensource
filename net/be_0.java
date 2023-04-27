/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ServerInvoker;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.be
 */
public class be_0
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        BlockPos blockPos;
        if (stringArray.length > 1 && stringArray.length < 4) {
            throw new ip_2(aN1.b, new Object[0]);
        }
        EntityPlayerMP entityPlayerMP = stringArray.length > 0 ? be_0.f(iCommandSender, stringArray[0]) : be_0.a(iCommandSender);
        BlockPos blockPos2 = blockPos = stringArray.length > 3 ? be_0.b(iCommandSender, stringArray, 1, true) : EntityPlayerInvoker.x(entityPlayerMP);
        if (entityPlayerMP.worldObj != null) {
            EntityPlayerInvoker.a(entityPlayerMP, blockPos, true);
            be_0.a(iCommandSender, (ICommand)this, aN1.d, EntityPlayerInvoker.s(entityPlayerMP), P8.d(amv_2.j(blockPos)), P8.d(amv_2.h(blockPos)), P8.d(amv_2.i(blockPos)));
        }
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aN1.c;
    }

    @Override
    public String b() {
        return aN1.a;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? be_0.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : (stringArray.length > 1 && stringArray.length <= 4 ? be_0.b(stringArray, 1, blockPos) : null);
    }

    @Override
    public int a() {
        return 2;
    }
}

