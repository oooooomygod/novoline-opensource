/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bd
 */
public class bd_2
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        String string;
        if (stringArray.length < 1) {
            throw new ip_2(aLK.e, new Object[0]);
        }
        if (stringArray[0].equals(aLK.D)) {
            if (stringArray.length < 5) {
                throw new ip_2(aLK.g, new Object[0]);
            }
        } else if (!stringArray[0].equals(aLK.z)) {
            throw new ip_2(aLK.r, new Object[0]);
        }
        int n = 4;
        if (aLK.E.equals(string = stringArray[n++])) {
            if (stringArray.length < n + 3) {
                if (n == 5) {
                    throw new ip_2(aLK.d, new Object[0]);
                }
                throw new ip_2(aLK.k, new Object[0]);
            }
        } else {
            if (!aLK.y.equals(string)) {
                throw new ip_2(aLK.m, new Object[0]);
            }
            if (stringArray.length < n + 1) {
                if (n == 5) {
                    throw new ip_2(aLK.h, new Object[0]);
                }
                throw new ip_2(aLK.u, new Object[0]);
            }
        }
        ax8_0.a(stringArray[n++]);
        throw new ht_1(aLK.p, new Object[0]);
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aLK.q;
    }

    protected String[] c() {
        return ServerInvoker.r(ServerInvoker.d());
    }

    protected List<String> b() {
        Collection collection = VM.e(a3V.b(ServerInvoker.a(ServerInvoker.d(), 0)));
        ArrayList arrayList = my_0.c();
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            if (aon_1.b(afi_1.a(acl_02))) continue;
            ListInvoker.add(arrayList, afi_1.d(acl_02));
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return stringArray.length > 0 && stringArray[0].equals(aLK.o) && n == 1;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bd_2.a(stringArray, aLK.i, aLK.f) : (stringArray.length == 2 && stringArray[0].equals(aLK.b) ? bd_2.a(stringArray, this.c()) : (stringArray.length >= 2 && stringArray.length <= 4 && stringArray[0].equals(aLK.n) ? bd_2.b(stringArray, 1, blockPos) : (!(stringArray.length == 3 && stringArray[0].equals(aLK.t) || stringArray.length == 5 && stringArray[0].equals(aLK.F)) ? (!(stringArray.length == 4 && stringArray[0].equals(aLK.j) || stringArray.length == 6 && stringArray[0].equals(aLK.C)) ? (!(stringArray.length == 6 && stringArray[0].equals(aLK.s) || stringArray.length == 8 && stringArray[0].equals(aLK.B)) ? null : bd_2.a(stringArray, this.b())) : bd_2.a(stringArray, ax8_0.a())) : bd_2.a(stringArray, aLK.I, aLK.G))));
    }

    @Override
    public String b() {
        return aLK.x;
    }
}

