/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.util.ArrayList;
import java.util.List;

public class L5
extends Item {
    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!world.isRemote) {
            oi_1 oi_12 = new oi_1(world, (float)amv_2.j(blockPos) + f, (float)amv_2.h(blockPos) + f2, (float)amv_2.i(blockPos) + f3, itemStack);
            aV8.b(world, oi_12);
            if (!aSY.a(entityPlayer.abilities)) {
                --itemStack.a;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        if (act_2.b(itemStack)) {
            NBTTagList nBTTagList;
            NBTTagCompound nBTTagCompound = tn_0.d(act_2.a(itemStack), aaf_1.c);
            if (tn_0.a(nBTTagCompound, aaf_1.b, 99)) {
                ListInvoker.add(list, aL0.c(aL0.a(aL0.a(new StringBuilder(), ahq_0.b(aaf_1.e)), aaf_1.f), tn_0.e(nBTTagCompound, aaf_1.d)).toString());
            }
            if (kv_0.c(nBTTagList = tn_0.c(nBTTagCompound, aaf_1.g, 10)) > 0) {
                for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                    NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
                    ArrayList arrayList = my_0.c();
                    aej_0.a(nBTTagCompound2, arrayList);
                    if (ListInvoker.isEmpty(arrayList)) continue;
                    for (int j = 1; j < ListInvoker.size(arrayList); ++j) {
                        ListInvoker.set(arrayList, j, aL0.a(aL0.a(new StringBuilder(), aaf_1.a), (String)ListInvoker.get(arrayList, j)).toString());
                    }
                    ListInvoker.addAll(list, arrayList);
                }
            }
        }
    }
}

