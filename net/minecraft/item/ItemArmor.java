/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import deobf.EntityPlayer;
import deobf.NBTBase;
import net.minecraft.block.BlockDispenser;
import net.CG;
import net.CreativeTabs;
import net.IBehaviorDispenseItem;
import net.Item;
import net.NBTTagCompound;
import net.World;
import net.a6w_0;
import net.abc_1;
import net.act_2;
import net.aut_0;
import net.ax1_0;
import net.tn_0;
import net.vx_1;


public class ItemArmor
extends Item {
    private static int[] maxDamageArray = new int[]{11, 16, 15, 13};
    public int q;
    public int o;
    public int n;
    public static String[] m = new String[]{aut_0.q, aut_0.k, aut_0.p, aut_0.f};
    private static IBehaviorDispenseItem p = new abc_1();
    private ArmorMaterial s;

    public boolean c(ItemStack itemStack) {
        return this.s == ArmorMaterial.LEATHER && act_2.b(itemStack) && tn_0.a(act_2.a(itemStack), aut_0.c, 10) && tn_0.a(tn_0.d(act_2.a(itemStack), aut_0.d), aut_0.l, 3);
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public int a(ItemStack itemStack) {
        if (this.s != ArmorMaterial.LEATHER) {
            return -1;
        }
        NBTTagCompound nBTTagCompound = act_2.a(itemStack);
        NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, aut_0.o);
        if (tn_0.a(nBTTagCompound2, aut_0.g, 3)) {
            return tn_0.g(nBTTagCompound2, aut_0.e);
        }
        return 10511680;
    }

    public ItemArmor(ArmorMaterial armorMaterial, int n, int n2) {
        this.s = armorMaterial;
        this.n = n2;
        this.q = n;
        this.o = ax1_0.a(armorMaterial, n2);
        this.setMaxDamage(ax1_0.b(armorMaterial, n2));
        this.c = 1;
        this.a(CreativeTabs.a);
        vx_1.a(BlockDispenser.dispenseBehaviorRegistry, this, p);
    }

    @Override
    public boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return ax1_0.c(this.s) == act_2.k(itemStack2) || super.a(itemStack, itemStack2);
    }

    static int[] a() {
        return maxDamageArray;
    }

    @Override
    public int q() {
        return ax1_0.b(this.s);
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        int n = CG.a(itemStack) - 1;
        a6w_0.b(entityPlayer, n);
        a6w_0.a(entityPlayer, n, act_2.C(itemStack));
        itemStack.a = 0;
        return itemStack;
    }

    public ArmorMaterial b() {
        return this.s;
    }

    public void a(ItemStack itemStack, int n) {
        if (this.s != ArmorMaterial.LEATHER) {
            throw new UnsupportedOperationException(aut_0.j);
        }
        NBTTagCompound nBTTagCompound = act_2.a(itemStack);
        nBTTagCompound = new NBTTagCompound();
        act_2.b(itemStack, nBTTagCompound);
        NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, aut_0.a);
        if (!tn_0.a(nBTTagCompound, aut_0.n, 10)) {
            tn_0.a(nBTTagCompound, aut_0.i, (NBTBase)nBTTagCompound2);
        }
        tn_0.b(nBTTagCompound2, aut_0.b, n);
    }

    public void d(ItemStack itemStack) {
        NBTTagCompound nBTTagCompound;
        NBTTagCompound nBTTagCompound2;
        if (this.s == ArmorMaterial.LEATHER && tn_0.b(nBTTagCompound2 = tn_0.d(nBTTagCompound = act_2.a(itemStack), aut_0.h), aut_0.m)) {
            tn_0.a(nBTTagCompound2, aut_0.r);
        }
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        return 0xFFFFFF;
    }
}

