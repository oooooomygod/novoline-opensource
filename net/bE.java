/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;


public class bE
extends am_0 {
    protected String[] a() {
        return ServerInvoker.r(ServerInvoker.d());
    }

    @Override
    public int a() {
        return 2;
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bE.a(stringArray, this.a()) : (stringArray.length == 2 ? bE.a(stringArray, aLP.b(Item.k)) : null);
    }

    @Override
    public String b() {
        return apy_0.b;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 2) {
            throw new ip_2(apy_0.e, new Object[0]);
        }
        EntityPlayerMP entityPlayerMP = bE.f(iCommandSender, stringArray[0]);
        Item item = bE.a(iCommandSender, stringArray[1]);
        int n = stringArray.length >= 3 ? bE.a(stringArray[2], 1, 64) : 1;
        int n2 = stringArray.length >= 4 ? bE.d(stringArray[3]) : 0;
        ItemStack itemStack = new ItemStack(item, n, n2);
        if (stringArray.length >= 5) {
            String string = aBO.d(bE.a(iCommandSender, stringArray, 4));
            try {
                act_2.b(itemStack, jv_2.a(string));
            }
            catch (az3_0 az3_02) {
                throw new ht_1(apy_0.f, az3_02.getMessage());
            }
        }
        boolean bl = InventoryInvoker.b(entityPlayerMP.inventory, itemStack);
        aV8.a(entityPlayerMP.worldObj, (Entity)entityPlayerMP, apy_0.a, 0.2f, ((a5_0.e(a6w_0.H(entityPlayerMP)) - a5_0.e(a6w_0.H(entityPlayerMP))) * 0.7f + 1.0f) * 2.0f);
        afy_2.b(entityPlayerMP.bp);
        if (itemStack.a <= 0) {
            itemStack.a = 1;
            alj_1.a(iCommandSender, a9N.AFFECTED_ITEMS, n);
            og_0 og_02 = a6w_0.a((EntityPlayer)entityPlayerMP, itemStack, false);
            aec_0.e(og_02);
        } else {
            alj_1.a(iCommandSender, a9N.AFFECTED_ITEMS, n - itemStack.a);
            og_0 og_03 = a6w_0.a((EntityPlayer)entityPlayerMP, itemStack, false);
            aec_0.d(og_03);
            aec_0.a(og_03, a6w_0.C(entityPlayerMP));
        }
        bE.a(iCommandSender, (ICommand)this, apy_0.c, act_2.B(itemStack), P8.d(n), a6w_0.C(entityPlayerMP));
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return apy_0.d;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }
}

