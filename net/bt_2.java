/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bt
 */
public class bt_2
extends am_0 {
    private int a(aek_0 aek_02, double d, World world, Random random, double d2, double d3, double d4, double d5, aek_0[] aek_0Array, boolean bl) throws ht_1 {
        int n = 0;
        while (true) {
            for (int i = 0; i < aek_0Array.length; ++i) {
                aek_0 aek_03 = aek_0Array[i];
                int n2 = 0;
                aek_0 aek_04 = new aek_0();
                for (int j = 0; j < aek_0Array.length; ++j) {
                }
                aek_04.b /= (double)n2;
                aek_04.a /= (double)n2;
                double d6 = aek_04.a();
                if (d6 > 0.0) {
                    aek_04.b();
                    aek_03.a(aek_04);
                } else {
                    aek_03.a(random, d2, d3, d4, d5);
                }
                if (!aek_03.a(d2, d3, d4, d5)) continue;
            }
            for (aek_0 aek_04 : aek_0Array) {
                if (aek_04.a(world)) continue;
                aek_04.a(random, d2, d3, d4, d5);
            }
            ++n;
        }
    }

    private double a(List<Entity> list, World world, aek_0[] aek_0Array, boolean bl) {
        double d = 0.0;
        int n = 0;
        HashMap hashMap = MapsInvoker.a();
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Team team;
            Entity entity = (Entity)dz_0.b(iterator);
            Entity entity2 = entity;
            Team team2 = team = entity2 instanceof EntityPlayer ? a6w_0.j((EntityPlayer)entity2) : null;
            if (!MapInvoker.b(hashMap, team)) {
                MapInvoker.c(hashMap, team, aek_0Array[n++]);
            }
            aek_0 aek_02 = (aek_0)MapInvoker.c(hashMap, team);
            ayj_0.d(entity2, (float)MathHelper.floor_double(aek_02.b) + 0.5f, aek_02.b(world), (double)MathHelper.floor_double(aek_02.a) + 0.5);
            double d2 = Double.MAX_VALUE;
            for (aek_0 aek_03 : aek_0Array) {
                if (aek_02 == aek_03) continue;
                double d3 = aek_02.b(aek_03);
                d2 = MathInvoker.a(d3, d2);
            }
            d += d2;
        }
        return d /= (double)ListInvoker.size(list);
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length >= 1 && stringArray.length <= 2 ? bt_2.a(stringArray, 0, blockPos) : null;
    }

    private int a(List<Entity> list) {
        HashSet hashSet = axe_2.a();
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            if (entity instanceof EntityPlayer) {
                aS0.b((Set)hashSet, a6w_0.j((EntityPlayer)entity));
                continue;
            }
            aS0.b((Set)hashSet, (Object)null);
        }
        return aS0.d(hashSet);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return wx_1.j;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 6) {
            throw new ip_2(wx_1.m, new Object[0]);
        }
        int n = 0;
        BlockPos blockPos = alj_1.d(iCommandSender);
        double d = bt_2.a(amv_2.j(blockPos), stringArray[n++], true);
        double d2 = bt_2.a(amv_2.i(blockPos), stringArray[n++], true);
        double d3 = bt_2.a(stringArray[n++], 0.0);
        double d4 = bt_2.a(stringArray[n++], d3 + 1.0);
        boolean bl = bt_2.b(stringArray[n++]);
        ArrayList arrayList = my_0.c();
        while (n < stringArray.length) {
            Object object;
            String string;
            if (ans_2.a(string = stringArray[n++])) {
                object = ans_2.b(iCommandSender, string, Entity.class);
                if (ListInvoker.isEmpty((List)object)) {
                    throw new il_2();
                }
                ListInvoker.addAll(arrayList, (Collection)object);
                continue;
            }
            object = aek_1.a(ServerInvoker.R(ServerInvoker.d()), string);
            throw new i6_0();
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_ENTITIES, ListInvoker.size(arrayList));
        if (ListInvoker.isEmpty(arrayList)) {
            throw new il_2();
        }
        alj_1.a(iCommandSender, new aoz_1(aL0.a(aL0.a(new StringBuilder(), wx_1.e), wx_1.a).toString(), P8.d(ListInvoker.size(arrayList)), db_0.a(d4), db_0.a(d), db_0.a(d2), db_0.a(d3)));
        this.a(iCommandSender, arrayList, new aek_0(d, d2), d3, d4, ((Entity)ListInvoker.get((List)arrayList, (int)0)).worldObj, bl);
    }

    private aek_0[] a(Random random, int n, double d, double d2, double d3, double d4) {
        aek_0[] aek_0Array = new aek_0[n];
        for (int i = 0; i < aek_0Array.length; ++i) {
            aek_0 aek_02 = new aek_0();
            aek_02.a(random, d, d2, d3, d4);
            aek_0Array[i] = aek_02;
        }
        return aek_0Array;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public int a() {
        return 2;
    }

    private void a(ICommandSender iCommandSender, List<Entity> list, aek_0 aek_02, double d, double d2, World world, boolean bl) throws ht_1 {
        Random random = new Random();
        double d3 = aek_02.b - d2;
        double d4 = aek_02.a - d2;
        double d5 = aek_02.b + d2;
        double d6 = aek_02.a + d2;
        aek_0[] aek_0Array = this.a(random, this.a(list), d3, d4, d5, d6);
        int n = this.a(aek_02, d, world, random, d3, d4, d5, d6, aek_0Array, bl);
        double d7 = this.a(list, world, aek_0Array, bl);
        bt_2.a(iCommandSender, (ICommand)this, aL0.a(aL0.a(new StringBuilder(), wx_1.f), wx_1.o).toString(), P8.d(aek_0Array.length), db_0.a(aek_02.b), db_0.a(aek_02.a));
        if (aek_0Array.length > 1) {
            alj_1.a(iCommandSender, new aoz_1(aL0.a(aL0.a(new StringBuilder(), wx_1.d), wx_1.p).toString(), StringInvoker.a(wx_1.l, new Object[]{db_0.a(d7)}), P8.d(n)));
        }
    }

    @Override
    public String b() {
        return wx_1.b;
    }
}

