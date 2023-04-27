/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.abc
 */
class abc_1
extends aKT {
    @Override
    protected ItemStack b(aYE aYE2, ItemStack itemStack) {
        BlockPos blockPos = amv_2.a(tb_2.f(aYE2), hy_0.a(tb_2.e(aYE2)));
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        rm_2 rm_22 = new rm_2(n, n2, n3, n + 1, n2 + 1, n3 + 1);
        List list = aV8.a(tb_2.a(aYE2), EntityLivingBase.class, rm_22, an7_0.a(od_2.d, new OZ(itemStack)));
        if (!ListInvoker.isEmpty(list)) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)ListInvoker.get(list, 0);
            int n4 = entityLivingBase instanceof EntityPlayer ? 1 : 0;
            int n5 = CG.a(itemStack);
            ItemStack itemStack2 = act_2.C(itemStack);
            itemStack2.a = 1;
            atn_0.a(entityLivingBase, n5 - n4, itemStack2);
            if (entityLivingBase instanceof nl_1) {
                CG.a((nl_1)entityLivingBase, n5, 2.0f);
            }
            --itemStack.a;
            return itemStack;
        }
        return super.b(aYE2, itemStack);
    }

    abc_1() {
    }
}

