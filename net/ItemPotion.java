/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IAttribute;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ItemPotion
extends Item {
    private Map<Integer, List<a2l_0>> m = MapsInvoker.a();
    private static Map<List<a2l_0>, Integer> n = MapsInvoker.c();

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (ItemPotion.b(act_2.c(itemStack))) {
            if (!aSY.a(entityPlayer.abilities)) {
                --itemStack.a;
            }
            aV8.a(world, (Entity)entityPlayer, ds_0.f, 0.5f, 0.4f / (a5_0.e(j) * 0.4f + 0.8f));
            if (!world.isRemote) {
                aV8.b(world, new of_2(world, (EntityLivingBase)entityPlayer, itemStack));
            }
            a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        } else {
            a6w_0.a(entityPlayer, itemStack, this.getMaxItemUseDuration(itemStack));
        }
        return itemStack;
    }

    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        if (act_2.c(itemStack) != 0) {
            Object object;
            Object object2;
            Object object3;
            List<a2l_0> list2 = Items.potionitem.a(itemStack);
            HashMultimap hashMultimap = zi_2.a();
            if (!ListInvoker.isEmpty(list2)) {
                object3 = ListInvoker.iterator(list2);
                while (dz_0.c((Iterator)object3)) {
                    object2 = (a2l_0)dz_0.b((Iterator)object3);
                    object = StringInvoker.h(ahq_0.b(a3M.d((a2l_0)object2)));
                    Potion potion = Potion.potionTypes[a3M.b((a2l_0)object2)];
                    Map map = ari_0.a(potion);
                    if (!MapInvoker.e(map)) {
                        Iterator iterator = aS0.f(MapInvoker.b(map));
                        while (dz_0.c(iterator)) {
                            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                            AttributeModifier attributeModifier = (AttributeModifier)FG.a(entry);
                            AttributeModifier attributeModifier2 = new AttributeModifier(ow_0.e(attributeModifier), ari_0.a(potion, a3M.g((a2l_0)object2), attributeModifier), ow_0.b(attributeModifier));
                            MM.b((Multimap)hashMultimap, dc_0.c((IAttribute)FG.b(entry)), attributeModifier2);
                        }
                    }
                    if (a3M.g((a2l_0)object2) > 0) {
                        object = aL0.a(aL0.a(aL0.a(new StringBuilder(), (String)object), ds_0.g), StringInvoker.h(ahq_0.b(aL0.c(aL0.a(new StringBuilder(), ds_0.m), a3M.g((a2l_0)object2)).toString()))).toString();
                    }
                    if (a3M.c((a2l_0)object2) > 20) {
                        object = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (String)object), ds_0.t), ari_0.a((a2l_0)object2)), ds_0.i).toString();
                    }
                    if (ari_0.b(potion)) {
                        ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), (String)object).toString());
                        continue;
                    }
                    ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), (String)object).toString());
                }
            } else {
                object3 = StringInvoker.h(ahq_0.b(ds_0.d));
                ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), (String)object3).toString());
            }
            if (!MM.c((Multimap)hashMultimap)) {
                ListInvoker.add(list, ds_0.e);
                ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_PURPLE), ahq_0.b(ds_0.r)).toString());
                object3 = ms_0.a(MM.a((Multimap)hashMultimap));
                while (dz_0.c((Iterator)object3)) {
                    object2 = (Map.Entry)dz_0.b((Iterator)object3);
                    object = (AttributeModifier)FG.a((Map.Entry)object2);
                    double d = ow_0.d((AttributeModifier)object);
                    double d2 = ow_0.b((AttributeModifier)object) != 1 && ow_0.b((AttributeModifier)object) != 2 ? ow_0.d((AttributeModifier)object) : ow_0.d((AttributeModifier)object) * 100.0;
                    if (d > 0.0) {
                        ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.BLUE), ahq_0.a(aL0.c(aL0.a(new StringBuilder(), ds_0.p), ow_0.b((AttributeModifier)object)).toString(), new Object[]{aBC.a(ItemStack.c, d2), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), ds_0.c), (String)FG.b((Map.Entry)object2)).toString())})).toString());
                        continue;
                    }
                    if (!(d < 0.0)) continue;
                    ListInvoker.add(list, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), ahq_0.a(aL0.c(aL0.a(new StringBuilder(), ds_0.k), ow_0.b((AttributeModifier)object)).toString(), new Object[]{aBC.a(ItemStack.c, d2 *= -1.0), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), ds_0.s), (String)FG.b((Map.Entry)object2)).toString())})).toString());
                }
            }
        }
    }

    public int d(int n) {
        return a39.a(n, false);
    }

    @Override
    public ti_1 c(ItemStack itemStack) {
        return ti_1.DRINK;
    }

    @Override
    public String e(ItemStack itemStack) {
        List<a2l_0> list;
        if (act_2.c(itemStack) == 0) {
            return StringInvoker.h(ahq_0.b(ds_0.n));
        }
        String string = ds_0.b;
        if (ItemPotion.b(act_2.c(itemStack))) {
            string = aL0.a(aL0.a(new StringBuilder(), StringInvoker.h(ahq_0.b(ds_0.q))), ds_0.a).toString();
        }
        if (!ListInvoker.isEmpty(list = Items.potionitem.a(itemStack))) {
            String string2 = a3M.d((a2l_0)ListInvoker.get(list, 0));
            string2 = aL0.a(aL0.a(new StringBuilder(), string2), ds_0.h).toString();
            return aL0.a(aL0.a(new StringBuilder(), string), StringInvoker.h(ahq_0.b(string2))).toString();
        }
        String string3 = a39.a(act_2.c(itemStack));
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), StringInvoker.h(ahq_0.b(string3))), ds_0.o), super.e(itemStack)).toString();
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 32;
    }

    public static boolean b(int n) {
        return (n & 0x4000) != 0;
    }

    public List<a2l_0> a(int n) {
        List list = (List)MapInvoker.c(this.m, P8.d(n));
        list = a39.b(n, false);
        MapInvoker.c(this.m, P8.d(n), list);
        return list;
    }

    public List<a2l_0> a(ItemStack itemStack) {
        if (act_2.b(itemStack) && tn_0.a(act_2.a(itemStack), ds_0.j, 9)) {
            ArrayList arrayList = my_0.c();
            NBTTagList nBTTagList = tn_0.c(act_2.a(itemStack), ds_0.l, 10);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
                a2l_0 a2l_02 = a3M.a(nBTTagCompound);
                ListInvoker.add(arrayList, a2l_02);
            }
            return arrayList;
        }
        List list = (List)MapInvoker.c(this.m, P8.d(act_2.c(itemStack)));
        list = a39.b(act_2.c(itemStack), false);
        MapInvoker.c(this.m, P8.d(act_2.c(itemStack)), list);
        return list;
    }

    @Override
    public ItemStack c(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!aSY.a(entityPlayer.abilities)) {
            --itemStack.a;
        }
        if (!world.isRemote) {
            List<a2l_0> list = this.a(itemStack);
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
                a6w_0.a(entityPlayer, new a2l_0(a2l_02));
            }
        }
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        if (!aSY.a(entityPlayer.abilities)) {
            if (itemStack.a <= 0) {
                return new ItemStack(Items.glass_bottle);
            }
            InventoryInvoker.b(entityPlayer.inventory, new ItemStack(Items.glass_bottle));
        }
        return itemStack;
    }

    @Override
    public boolean h(ItemStack itemStack) {
        List<a2l_0> list = this.a(itemStack);
        return !ListInvoker.isEmpty(list);
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        return 0xFFFFFF;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        super.a(item, creativeTabs, list);
        if (MapInvoker.e(n)) {
            int n = 0;
            boolean bl = false;
            int n2 = n | 0x2000;
            int n3 = 0;
            while (true) {
                int n4;
                List list2;
                if (!ListInvoker.isEmpty(list2 = a39.b(n4 = n2, false))) {
                    MapInvoker.c(ItemPotion.n, list2, P8.d(n4));
                }
                ++n3;
            }
        }
        Iterator iterator = ms_0.a(n.values());
        while (dz_0.c(iterator)) {
            int n = P8.b((Integer)dz_0.b(iterator));
            ListInvoker.add(list, new ItemStack(item, 1, n));
        }
    }

    public ItemPotion() {
        this.a(1);
        this.a(true);
        this.setMaxDamage(0);
        this.a(CreativeTabs.h);
    }

    public boolean e(int n) {
        List<a2l_0> list = this.a(n);
        if (!ListInvoker.isEmpty(list)) {
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
                if (!ari_0.h(Potion.potionTypes[a3M.b(a2l_02)])) continue;
                return true;
            }
        }
        return false;
    }
}

