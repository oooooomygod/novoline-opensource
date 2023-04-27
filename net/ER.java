/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ER {
    private static Random b = new Random();
    private static yf_2 e = new yf_2(null);
    private static ay_0 d;
    private static aNU a;
    private static aP8 c;

    public static Map<Integer, cl_0> b(int n, ItemStack itemStack) {
        Item item = act_2.k(itemStack);
        HashMap hashMap = null;
        boolean bl = act_2.k(itemStack) == Items.book;
        for (yl_2 yl_22 : yl_2.m) {
            if (!ab_0.a(yl_22.g, item)) {
                // empty if block
            }
            for (int i = xr_1.b(yl_22); i <= xr_1.c(yl_22); ++i) {
                if (n < xr_1.a(yl_22, i) || n > xr_1.b(yl_22, i)) continue;
                hashMap = MapsInvoker.a();
                MapInvoker.c(hashMap, P8.d(yl_22.c), new cl_0(yl_22, i));
            }
        }
        return hashMap;
    }

    private static void a(abk_0 abk_02, ItemStack[] itemStackArray) {
        for (ItemStack itemStack : itemStackArray) {
            ER.a(abk_02, itemStack);
        }
    }

    public static int g(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.s.c, atn_0.z(entityLivingBase));
    }

    public static List<cl_0> a(Random random, ItemStack itemStack, int n) {
        Item item = act_2.k(itemStack);
        px_0.p(item);
        return null;
    }

    public static Map<Integer, Integer> a(ItemStack itemStack) {
        LinkedHashMap linkedHashMap = MapsInvoker.c();
        NBTTagList nBTTagList = act_2.k(itemStack) == Items.enchanted_book ? arw_2.a(Items.enchanted_book, itemStack) : act_2.h(itemStack);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            short s = tn_0.o(kv_0.g(nBTTagList, i), aRQ.d);
            short s3 = tn_0.o(kv_0.g(nBTTagList, i), aRQ.g);
            MapInvoker.c(linkedHashMap, P8.d(s), P8.d(s3));
        }
        return linkedHashMap;
    }

    public static int a(Entity entity) {
        return ER.a(yl_2.l.c, ayj_0.w(entity));
    }

    public static int a(int n, ItemStack itemStack) {
        NBTTagList nBTTagList = act_2.h(itemStack);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            short s = tn_0.o(kv_0.g(nBTTagList, i), aRQ.j);
            short s3 = tn_0.o(kv_0.g(nBTTagList, i), aRQ.c);
            if (s != n) continue;
            return s3;
        }
        return 0;
    }

    public static void b(EntityLivingBase entityLivingBase, Entity entity) {
        ER.d.b = entity;
        ER.d.a = entityLivingBase;
        ER.a((abk_0)d, atn_0.t(entityLivingBase));
        if (entity instanceof EntityPlayer) {
            ER.a((abk_0)d, atn_0.z(entityLivingBase));
        }
    }

    public static int b(Entity entity) {
        return ER.a(yl_2.n.c, ayj_0.w(entity));
    }

    public static int a(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.C.c, atn_0.z(entityLivingBase));
    }

    public static int a(Random random, int n, int n2, ItemStack itemStack) {
        Item item = act_2.k(itemStack);
        px_0.p(item);
        return 0;
    }

    private static void a(abk_0 abk_02, ItemStack itemStack) {
        NBTTagList nBTTagList = act_2.h(itemStack);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            short s = tn_0.o(kv_0.g(nBTTagList, i), aRQ.a);
            short s3 = tn_0.o(kv_0.g(nBTTagList, i), aRQ.b);
            if (xr_1.a(s) == null) continue;
            abk_02.a(xr_1.a(s), s3);
        }
    }

    public static int h(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.z.c, atn_0.z(entityLivingBase));
    }

    public static int c(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.F.c, atn_0.z(entityLivingBase));
    }

    public static int a(int n, ItemStack[] itemStackArray) {
        return 0;
    }

    public static int d(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.p.c, atn_0.z(entityLivingBase));
    }

    public static ItemStack b(Random random, ItemStack itemStack, int n) {
        List<cl_0> list = ER.a(random, itemStack, n);
        boolean bl = act_2.k(itemStack) == Items.book;
        act_2.a(itemStack, Items.enchanted_book);
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            cl_0 cl_02 = (cl_0)dz_0.b(iterator);
            arw_2.a(Items.enchanted_book, itemStack, cl_02);
        }
        return itemStack;
    }

    public static ItemStack a(yl_2 yl_22, EntityLivingBase entityLivingBase) {
        for (ItemStack itemStack : atn_0.t(entityLivingBase)) {
            if (ER.a(yl_22.c, itemStack) <= 0) continue;
            return itemStack;
        }
        return null;
    }

    public static float a(ItemStack itemStack, aH2 aH22) {
        ER.c.b = 0.0f;
        ER.c.a = aH22;
        ER.a((abk_0)c, itemStack);
        return ER.c.b;
    }

    public static int e(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.f.c, atn_0.z(entityLivingBase));
    }

    public static boolean i(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.y.c, atn_0.t(entityLivingBase)) > 0;
    }

    static {
        c = new aP8(null);
        d = new ay_0(null);
        a = new aNU(null);
    }

    public static int b(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.e.c, atn_0.z(entityLivingBase));
    }

    public static void a(EntityLivingBase entityLivingBase, Entity entity) {
        ER.a.b = entityLivingBase;
        ER.a.a = entity;
        ER.a((abk_0)a, atn_0.t(entityLivingBase));
        if (entityLivingBase instanceof EntityPlayer) {
            ER.a((abk_0)a, atn_0.z(entityLivingBase));
        }
    }

    public static int a(ItemStack[] itemStackArray, DamageSource damageSource) {
        ER.e.b = 0;
        ER.e.a = damageSource;
        ER.a((abk_0)e, itemStackArray);
        if (ER.e.b > 25) {
            ER.e.b = 25;
        } else if (ER.e.b < 0) {
            ER.e.b = 0;
        }
        return (ER.e.b + 1 >> 1) + a5_0.a(b, (ER.e.b >> 1) + 1);
    }

    public static boolean f(EntityLivingBase entityLivingBase) {
        return ER.a(yl_2.w.c, atn_0.z(entityLivingBase)) > 0;
    }

    public static void a(Map<Integer, Integer> map, ItemStack itemStack) {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = aS0.f(MapInvoker.c(map));
        while (dz_0.c(iterator)) {
            int n = P8.b((Integer)dz_0.b(iterator));
            yl_2 yl_22 = xr_1.a(n);
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            tn_0.a(nBTTagCompound, aRQ.e, (short)n);
            tn_0.a(nBTTagCompound, aRQ.h, (short)P8.b((Integer)MapInvoker.c(map, P8.d(n))));
            kv_0.a(nBTTagList, nBTTagCompound);
            if (act_2.k(itemStack) != Items.enchanted_book) continue;
            arw_2.a(Items.enchanted_book, itemStack, new cl_0(yl_22, P8.b((Integer)MapInvoker.c(map, P8.d(n)))));
        }
        if (kv_0.c(nBTTagList) > 0) {
            if (act_2.k(itemStack) != Items.enchanted_book) {
                act_2.a(itemStack, aRQ.f, nBTTagList);
            }
        } else if (act_2.b(itemStack)) {
            tn_0.a(act_2.a(itemStack), aRQ.i);
        }
    }
}

