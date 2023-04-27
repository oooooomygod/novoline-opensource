/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.collect.Multimap;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import deobf.IChatComponent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.act
 */
public class act_2 {
    private static int[] b;

    public static int u(ItemStack itemStack) {
        return itemStack.s();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void p(ItemStack itemStack) {
        itemStack.c();
    }

    public static boolean a(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        return itemStack.a(entityPlayer, entityLivingBase);
    }

    public static List a(ItemStack itemStack, EntityPlayer entityPlayer, boolean bl) {
        return itemStack.a(entityPlayer, bl);
    }

    public static String l(ItemStack itemStack) {
        return itemStack.p();
    }

    public static Multimap d(ItemStack itemStack) {
        return itemStack.B();
    }

    public static ItemStack e(ItemStack itemStack) {
        return ItemStack.a(itemStack);
    }

    public static boolean b(ItemStack itemStack, ItemStack itemStack2) {
        return itemStack.b(itemStack2);
    }

    public static boolean n(ItemStack itemStack) {
        return itemStack.f();
    }

    public static boolean d(ItemStack itemStack, ItemStack itemStack2) {
        return ItemStack.b(itemStack, itemStack2);
    }

    public static void a(ItemStack itemStack, Item item) {
        itemStack.a(item);
    }

    public static NBTTagCompound a(ItemStack itemStack, String string, boolean bl) {
        return itemStack.a(string, bl);
    }

    public static float c(ItemStack itemStack, Block block) {
        return itemStack.a(block);
    }

    public static int A(ItemStack itemStack) {
        return itemStack.v();
    }

    public static IChatComponent B(ItemStack itemStack) {
        return itemStack.q();
    }

    static {
        if (act_2.b() == null) {
            act_2.b(new int[4]);
        }
    }

    public static boolean y(ItemStack itemStack) {
        return itemStack.w();
    }

    public static boolean q(ItemStack itemStack) {
        return itemStack.z();
    }

    public static boolean i(ItemStack itemStack) {
        return itemStack.i();
    }

    public static void b(ItemStack itemStack, NBTTagCompound nBTTagCompound) {
        itemStack.d(nBTTagCompound);
    }

    public static boolean x(ItemStack itemStack) {
        return itemStack.b();
    }

    public static int s(ItemStack itemStack) {
        return itemStack.j();
    }

    public static void a(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        itemStack.a(world, entity, n, bl);
    }

    public static ItemStack a(NBTTagCompound nBTTagCompound) {
        return ItemStack.c(nBTTagCompound);
    }

    public static boolean c(ItemStack itemStack, ItemStack itemStack2) {
        return ItemStack.c(itemStack, itemStack2);
    }

    public static boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        act_2.b();
        boolean bl = itemStack.a(entityPlayer, world, blockPos, enumFacing, f, f2, f3);
        if (ListInvoker.b() != null) {
            act_2.b(new int[5]);
        }
        return bl;
    }

    public static void a(ItemStack itemStack, no_2 no_22) {
        itemStack.a(no_22);
    }

    public static boolean t(ItemStack itemStack) {
        return itemStack.h();
    }

    public static NBTTagCompound a(ItemStack itemStack) {
        return itemStack.o();
    }

    public static boolean z(ItemStack itemStack) {
        return itemStack.n();
    }

    public static void c(ItemStack itemStack, int n) {
        itemStack.a(n);
    }

    public static boolean b(ItemStack itemStack) {
        return itemStack.a();
    }

    public static int v(ItemStack itemStack) {
        return itemStack.l();
    }

    public static int c(ItemStack itemStack) {
        return itemStack.y();
    }

    public static int f(ItemStack itemStack) {
        return itemStack.d();
    }

    public static ItemStack b(ItemStack itemStack, int n) {
        return itemStack.c(n);
    }

    public static boolean j(ItemStack itemStack) {
        return itemStack.C();
    }

    public static boolean e(ItemStack itemStack, ItemStack itemStack2) {
        return ItemStack.a(itemStack, itemStack2);
    }

    public static ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return itemStack.b(world, entityPlayer);
    }

    public static void a(ItemStack itemStack, yl_2 yl_22, int n) {
        itemStack.a(yl_22, n);
    }

    public static void a(ItemStack itemStack, World world, Block block, BlockPos blockPos, EntityPlayer entityPlayer) {
        itemStack.a(world, block, blockPos, entityPlayer);
    }

    public static boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return itemStack.d(itemStack2);
    }

    public static String w(ItemStack itemStack) {
        return itemStack.r();
    }

    public static ItemStack a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return itemStack.a(world, entityPlayer);
    }

    public static void a(ItemStack itemStack, World world, EntityPlayer entityPlayer, int n) {
        itemStack.b(world, entityPlayer, n);
    }

    public static boolean b(ItemStack itemStack, Block block) {
        return itemStack.b(block);
    }

    public static void a(ItemStack itemStack, String string, NBTBase nBTBase) {
        itemStack.a(string, nBTBase);
    }

    public static boolean a(ItemStack itemStack, Block block) {
        return itemStack.c(block);
    }

    public static NBTTagCompound a(ItemStack itemStack, NBTTagCompound nBTTagCompound) {
        return itemStack.a(nBTTagCompound);
    }

    public static void damageItem(ItemStack itemStack, int n, EntityLivingBase entityLivingBase) {
        itemStack.a(n, entityLivingBase);
    }

    public static void b(ItemStack itemStack, World world, EntityPlayer entityPlayer, int n) {
        itemStack.a(world, entityPlayer, n);
    }

    public static boolean d(ItemStack itemStack, Block block) {
        return itemStack.d(block);
    }

    public static NBTTagList h(ItemStack itemStack) {
        return itemStack.t();
    }

    public static void a(ItemStack itemStack, int n) {
        itemStack.b(n);
    }

    public static ItemStack C(ItemStack itemStack) {
        return itemStack.u();
    }

    public static arq_0 D(ItemStack itemStack) {
        return itemStack.m();
    }

    public static boolean r(ItemStack itemStack) {
        return itemStack.e();
    }

    public static ItemStack a(ItemStack itemStack, String string) {
        return itemStack.a(string);
    }

    public static no_2 o(ItemStack itemStack) {
        return itemStack.g();
    }

    public static boolean g(ItemStack itemStack) {
        return itemStack.k();
    }

    public static int[] b() {
        return b;
    }

    public static void a(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityPlayer entityPlayer) {
        itemStack.a(entityLivingBase, entityPlayer);
    }

    public static boolean a(ItemStack itemStack, int n, Random random) {
        return itemStack.a(n, random);
    }

    public static ti_1 m(ItemStack itemStack) {
        return itemStack.x();
    }

    public static Item k(ItemStack itemStack) {
        return itemStack.A();
    }
}

