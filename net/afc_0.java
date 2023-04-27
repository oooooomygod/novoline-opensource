/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.NBTTagList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aFc
 */
class afc_0
implements aiy_2 {
    @Override
    public boolean a(adb_1 adb_12, World world) {
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) != Items.banner) continue;
            return false;
        }
        return false;
    }

    @Override
    public int a() {
        return 10;
    }

    private afc_0() {
    }

    afc_0(xm_0 xm_02) {
        this();
    }

    @Override
    public ItemStack b() {
        return null;
    }

    @Override
    public ItemStack b(adb_1 adb_12) {
        Object object;
        ItemStack itemStack = null;
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack2 = aVF.b(adb_12, i);
            if (act_2.k(itemStack2) != Items.banner) continue;
            itemStack = act_2.C(itemStack2);
            itemStack.a = 1;
            break;
        }
        qv_2 qv_22 = this.a(adb_12);
        int n = 0;
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            object = aVF.b(adb_12, i);
            if (act_2.k((ItemStack)object) != Items.dye) continue;
            n = act_2.c((ItemStack)object);
            break;
        }
        NBTTagCompound nBTTagCompound = act_2.a(itemStack, axr_1.f, true);
        object = null;
        if (tn_0.a(nBTTagCompound, axr_1.d, 9)) {
            object = tn_0.c(nBTTagCompound, axr_1.c, 10);
        } else {
            object = new NBTTagList();
            tn_0.a(nBTTagCompound, axr_1.b, (NBTBase)object);
        }
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        tn_0.a(nBTTagCompound2, axr_1.e, aib_0.a(qv_22));
        tn_0.b(nBTTagCompound2, axr_1.a, n);
        kv_0.a((NBTTagList)object, nBTTagCompound2);
        return itemStack;
    }

    @Override
    public ItemStack[] a(adb_1 adb_12) {
        ItemStack[] itemStackArray = new ItemStack[aVF.c(adb_12)];
        for (int i = 0; i < itemStackArray.length; ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (!px_0.b(act_2.k(itemStack))) continue;
            itemStackArray[i] = new ItemStack(px_0.f(act_2.k(itemStack)));
        }
        return itemStackArray;
    }

    private qv_2 a(adb_1 adb_12) {
        block0: for (qv_2 qv_22 : qv_2.values()) {
            int n;
            int n2;
            int n3;
            if (!aib_0.d(qv_22)) continue;
            if (aib_0.c(qv_22)) {
                n3 = 0;
                n2 = 0;
                for (n = 0; n < aVF.c(adb_12); ++n) {
                    ItemStack itemStack = aVF.b(adb_12, n);
                    if (act_2.k(itemStack) == Items.banner) continue;
                    if (act_2.k(itemStack) == Items.dye || !act_2.a(itemStack, aib_0.b(qv_22))) break;
                    n3 = 1;
                }
                return qv_22;
            }
            if (aVF.c(adb_12) != aib_0.e(qv_22).length * StringInvoker.c(aib_0.e(qv_22)[0])) continue;
            n3 = -1;
            for (n2 = 0; n2 < aVF.c(adb_12); ++n2) {
                n = n2 / 3;
                int n4 = n2 % 3;
                ItemStack itemStack = aVF.b(adb_12, n2);
                if (act_2.k(itemStack) != Items.banner) {
                    if (act_2.k(itemStack) != Items.dye || StringInvoker.b(aib_0.e(qv_22)[n], n4) == ' ') continue block0;
                    n3 = act_2.c(itemStack);
                    continue;
                }
                if (StringInvoker.b(aib_0.e(qv_22)[n], n4) != ' ') continue block0;
            }
        }
        return null;
    }
}

