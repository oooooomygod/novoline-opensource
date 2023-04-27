/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bX
 */
public class bx_1
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b() {
        return aka_2.b;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        Object object;
        EntityPlayerMP entityPlayerMP;
        if (stringArray.length < 3) {
            throw new ip_2(aka_2.d, new Object[0]);
        }
        if (iCommandSender instanceof EntityPlayerMP) {
            entityPlayerMP = (EntityPlayerMP)iCommandSender;
        } else {
            object = alj_1.e(iCommandSender);
            if (!(object instanceof EntityPlayerMP)) {
                throw new ht_1(aka_2.l, new Object[0]);
            }
            entityPlayerMP = (EntityPlayerMP)object;
        }
        object = a3V.b(ServerInvoker.a(ServerInvoker.d(), 0));
        acl_0 acl_02 = VM.a((za_2)object, stringArray[0]);
        if (afi_1.a(acl_02) == aOA.b) {
            int n = bx_1.d(stringArray[2]);
            if (!VM.a((za_2)object, EntityPlayerInvoker.s(entityPlayerMP), acl_02)) {
                throw new ht_1(aka_2.m, stringArray[0]);
            }
            QU qU = VM.c((za_2)object, EntityPlayerInvoker.s(entityPlayerMP), acl_02);
            if (hs_0.b(qU)) {
                throw new ht_1(aka_2.j, stringArray[0]);
            }
            if (aka_2.g.equals(stringArray[1])) {
                hs_0.a(qU, n);
            } else {
                if (!aka_2.h.equals(stringArray[1])) {
                    throw new ht_1(aka_2.e, stringArray[1]);
                }
                hs_0.c(qU, n);
            }
            hs_0.a(qU, true);
            if (Uf.d(entityPlayerMP.bX)) {
                bx_1.a(iCommandSender, (ICommand)this, aka_2.a, stringArray[0], stringArray[1], stringArray[2]);
            }
            return;
        }
        throw new ht_1(aka_2.k, stringArray[0]);
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aka_2.c;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        if (stringArray.length == 1) {
            za_2 za_22 = a3V.b(ServerInvoker.a(ServerInvoker.d(), 0));
            ArrayList arrayList = my_0.c();
            Iterator iterator = ms_0.a(VM.e(za_22));
            while (dz_0.c(iterator)) {
                acl_0 acl_02 = (acl_0)dz_0.b(iterator);
                if (afi_1.a(acl_02) != aOA.b) continue;
                ListInvoker.add(arrayList, afi_1.d(acl_02));
            }
            return bx_1.a(stringArray, (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]));
        }
        return stringArray.length == 2 ? bx_1.a(stringArray, aka_2.f, aka_2.i) : null;
    }
}

