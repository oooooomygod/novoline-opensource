/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.NBTTagList;
import java.util.List;
import java.util.Random;
import net.C6;
import net.Item;
import net.Items;
import net.NBTTagCompound;
import net.aI5;
import net.act_2;
import net.alf_0;
import net.arq_0;
import net.cl_0;
import net.kv_0;
import net.tn_0;
import net.xr_1;
import net.yl_2;

public class ItemEnchantedBook
extends Item {
    public C6 a(Random random) {
        return this.a(random, 1, 1, 1);
    }

    public NBTTagList a(ItemStack itemStack) {
        NBTTagCompound nBTTagCompound = act_2.a(itemStack);
        return tn_0.a(nBTTagCompound, aI5.b, 9) ? (NBTTagList)tn_0.h(nBTTagCompound, aI5.f) : new NBTTagList();
    }

    @Override
    public arq_0 d(ItemStack itemStack) {
        return kv_0.c(this.a(itemStack)) > 0 ? arq_0.UNCOMMON : super.d(itemStack);
    }

    public ItemStack a(cl_0 cl_02) {
        ItemStack itemStack = new ItemStack(this);
        this.a(itemStack, cl_02);
        return itemStack;
    }

    public void a(yl_2 yl_22, List<ItemStack> list) {
        for (int i = xr_1.b(yl_22); i <= xr_1.c(yl_22); ++i) {
            ListInvoker.add(list, this.a(new cl_0(yl_22, i)));
        }
    }

    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        super.a(itemStack, entityPlayer, list, bl);
        NBTTagList nBTTagList = this.a(itemStack);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            short s = tn_0.o(kv_0.g(nBTTagList, i), aI5.i);
            short s3 = tn_0.o(kv_0.g(nBTTagList, i), aI5.j);
            if (xr_1.a(s) == null) continue;
            ListInvoker.add(list, xr_1.c(xr_1.a(s), s3));
        }
    }

    public C6 a(Random random, int n, int n2, int n3) {
        ItemStack itemStack = new ItemStack(Items.book, 1, 0);
        alf_0.b(random, itemStack, 30);
        return new C6(itemStack, n, n2, n3);
    }

    public void a(ItemStack itemStack, cl_0 cl_02) {
        NBTTagList nBTTagList = this.a(itemStack);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
            if (tn_0.o(nBTTagCompound, aI5.h) != cl_02.c.c) continue;
            if (tn_0.o(nBTTagCompound, aI5.d) >= cl_02.b) break;
            tn_0.a(nBTTagCompound, aI5.a, (short)cl_02.b);
            break;
        }
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, aI5.c, (short)cl_02.c.c);
        tn_0.a(nBTTagCompound, aI5.e, (short)cl_02.b);
        kv_0.a(nBTTagList, nBTTagCompound);
        if (!act_2.b(itemStack)) {
            act_2.b(itemStack, new NBTTagCompound());
        }
        tn_0.a(act_2.a(itemStack), aI5.g, nBTTagList);
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return false;
    }

    @Override
    public boolean h(ItemStack itemStack) {
        return true;
    }
}

