/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StatListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;
import net.minecraft.stats.Achievement;
import deobf.StatBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.bH
 */
public class bh_0
extends am_0 {
    @Override
    public String b(ICommandSender iCommandSender) {
        return aA9.e;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        if (stringArray.length == 1) {
            return bh_0.a(stringArray, aA9.d, aA9.b);
        }
        if (stringArray.length != 2) {
            return stringArray.length == 3 ? bh_0.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
        }
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(aop_1.o);
        while (dz_0.c(iterator)) {
            StatBase statBase = (StatBase)dz_0.b(iterator);
            ListInvoker.add(arrayList, statBase.l);
        }
        return bh_0.a(stringArray, arrayList);
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b() {
        return aA9.i;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return n == 2;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 2) {
            throw new ip_2(aA9.f, new Object[0]);
        }
        StatListInvoker.a(stringArray[1]);
        if (!stringArray[1].equals(aA9.h)) {
            throw new ht_1(aA9.k, stringArray[1]);
        }
        EntityPlayerMP entityPlayerMP = stringArray.length >= 3 ? bh_0.f(iCommandSender, stringArray[2]) : bh_0.a(iCommandSender);
        StringInvoker.d(stringArray[0], aA9.m);
        StringInvoker.d(stringArray[0], aA9.g);
        Iterator iterator = ListInvoker.iterator(apf_0.G);
        while (dz_0.c(iterator)) {
            Achievement achievement = (Achievement)dz_0.b(iterator);
            EntityPlayerInvoker.a(entityPlayerMP, achievement);
        }
        bh_0.a(iCommandSender, (ICommand)this, aA9.l, EntityPlayerInvoker.s(entityPlayerMP));
    }
}

