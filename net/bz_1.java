/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.EntityPlayer;
import net.ICommandSender;
import net.World;
import net.aV8;
import net.alj_1;
import net.am_0;
import net.aoz_1;
import net.ht_1;
import net.kx_1;
import net.lx_2;

/*
 * Renamed from net.bz
 */
public class bz_1
extends am_0 {
    @Override
    public String b(ICommandSender iCommandSender) {
        return kx_1.b;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return ServerInvoker.T(ServerInvoker.d()) || super.a(iCommandSender);
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String b() {
        return kx_1.c;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        World world = iCommandSender instanceof EntityPlayer ? ((EntityPlayer)iCommandSender).worldObj : ServerInvoker.a(ServerInvoker.d(), 0);
        alj_1.a(iCommandSender, new aoz_1(kx_1.a, lx_2.b(aV8.w(world))));
    }
}

