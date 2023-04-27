/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import java.util.List;

public class LD
extends Item {
    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        if (act_2.b(itemStack)) {
            NBTTagCompound nBTTagCompound = tn_0.d(act_2.a(itemStack), xn_1.q);
            LD.a(nBTTagCompound, list);
        }
    }

    public static NBTBase a(ItemStack itemStack, String string) {
        if (act_2.b(itemStack)) {
            NBTTagCompound nBTTagCompound = tn_0.d(act_2.a(itemStack), xn_1.p);
            return tn_0.h(nBTTagCompound, string);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(NBTTagCompound nBTTagCompound, List<String> list) {
        int[] nArray;
        int n;
        byte by = tn_0.e(nBTTagCompound, xn_1.u);
        if (by <= 4) {
            ListInvoker.add(list, StringInvoker.h(ahq_0.b(aL0.c(aL0.a(new StringBuilder(), xn_1.o), by).toString())));
        } else {
            ListInvoker.add(list, StringInvoker.h(ahq_0.b(xn_1.k)));
        }
        int[] nArray2 = tn_0.i(nBTTagCompound, xn_1.g);
        if (nArray2.length > 0) {
            boolean bl = true;
            String string = xn_1.m;
            for (int n2 : nArray2) {
                string = aL0.a(aL0.a(new StringBuilder(), string), xn_1.h).toString();
                bl = false;
                int n3 = 0;
                for (n = 0; n < lc_0.m.length; ++n) {
                    if (n2 != lc_0.m[n]) continue;
                    n3 = 1;
                    string = aL0.a(aL0.a(new StringBuilder(), string), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), xn_1.i), my_2.b(n).b()).toString())).toString();
                    break;
                }
                string = aL0.a(aL0.a(new StringBuilder(), string), ahq_0.b(xn_1.a)).toString();
            }
            ListInvoker.add(list, string);
        }
        if ((nArray = tn_0.i(nBTTagCompound, xn_1.f)).length > 0) {
            void var6_11;
            boolean bl = true;
            String bl2 = aL0.a(aL0.a(new StringBuilder(), ahq_0.b(xn_1.d)), xn_1.s).toString();
            block2: for (int n3 : nArray) {
                String string = aL0.a(aL0.a(new StringBuilder(), (String)var6_11), xn_1.e).toString();
                bl = false;
                n = 0;
                int n4 = 0;
                while (true) {
                    if (n3 == lc_0.m[n4]) {
                        n = 1;
                        String string3 = aL0.a(aL0.a(new StringBuilder(), string), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), xn_1.l), my_2.b(n4).b()).toString())).toString();
                        string3 = aL0.a(aL0.a(new StringBuilder(), string3), ahq_0.b(xn_1.t)).toString();
                        continue block2;
                    }
                    ++n4;
                }
            }
            ListInvoker.add(list, var6_11);
        }
        boolean bl = tn_0.c(nBTTagCompound, xn_1.b);
        ListInvoker.add(list, ahq_0.b(xn_1.r));
        boolean bl2 = tn_0.c(nBTTagCompound, xn_1.j);
        ListInvoker.add(list, ahq_0.b(xn_1.n));
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        if (n != 1) {
            return super.a(itemStack, n);
        }
        NBTBase nBTBase = LD.a(itemStack, xn_1.c);
        if (!(nBTBase instanceof aDO)) {
            return 0x8A8A8A;
        }
        aDO aDO2 = (aDO)nBTBase;
        int[] nArray = ayv_2.a(aDO2);
        if (nArray.length == 1) {
            return nArray[0];
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int n5 : nArray) {
            n2 += (n5 & 0xFF0000) >> 16;
            n3 += (n5 & 0xFF00) >> 8;
            n4 += n5 & 0xFF;
        }
        return (n2 /= nArray.length) << 16 | (n3 /= nArray.length) << 8 | (n4 /= nArray.length);
    }
}

