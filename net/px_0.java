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
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.Px
 */
public class px_0 {
    private static int[] b;

    public static boolean c(Item item, ItemStack itemStack) {
        return item.f(itemStack);
    }

    public static CreativeTabs j(Item item) {
        return item.g();
    }

    public static boolean i(Item item) {
        return item.p();
    }

    public static int p(Item item) {
        return item.q();
    }

    public static boolean h(Item item) {
        return item.j();
    }

    public static void a(Item item, NBTTagCompound nBTTagCompound) {
        item.a(nBTTagCompound);
    }

    public static String h(Item item, ItemStack itemStack) {
        return item.i(itemStack);
    }

    public static Item a(String string) {
        return Item.a(string);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (px_0.b() == null) {
            px_0.b(new int[1]);
        }
    }

    public static boolean a(Item item, ItemStack itemStack, ItemStack itemStack2) {
        return item.a(itemStack, itemStack2);
    }

    public static boolean a(Item item, ItemStack itemStack, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        return item.a(itemStack, entityLivingBase, entityLivingBase2);
    }

    public static boolean b(Item item) {
        return item.h();
    }

    public static Multimap e(Item item) {
        return item.e();
    }

    public static ItemStack c(Item item, ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return item.c(itemStack, world, entityPlayer);
    }

    public static ry_1 a(Item item, EntityLivingBase entityLivingBase, ItemStack itemStack, int n) {
        return item.a(entityLivingBase, itemStack, n);
    }

    public static int m(Item item) {
        return item.m();
    }

    public static void a(Item item, ItemStack itemStack, World world, EntityPlayer entityPlayer, int n) {
        item.onPlayerStoppedUsing(itemStack, world, entityPlayer, n);
    }

    public static boolean f(Item item, ItemStack itemStack) {
        return item.b(itemStack);
    }

    public static void c() {
        Item.f();
    }

    public static boolean a(Item item, ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        act_2.b();
        boolean bl = item.a(itemStack, entityPlayer, world, blockPos, enumFacing, f, f2, f3);
        ListInvoker.b(new ListInvoker[4]);
        return bl;
    }

    public static Item a(Block block) {
        return Item.a(block);
    }

    public static ti_1 d(Item item, ItemStack itemStack) {
        return item.c(itemStack);
    }

    public static Item a(int n) {
        return Item.d(n);
    }

    public static int[] b() {
        return b;
    }

    public static arq_0 b(Item item, ItemStack itemStack) {
        return item.d(itemStack);
    }

    public static String a(Item item, ItemStack itemStack) {
        return item.a(itemStack);
    }

    public static int a(Item item) {
        return Item.b(item);
    }

    public static int k(Item item) {
        return item.b();
    }

    public static String c(Item item) {
        return item.d();
    }

    public static void a(Item item, ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        item.a(itemStack, world, entityPlayer);
    }

    public static boolean i(Item item, ItemStack itemStack) {
        return item.h(itemStack);
    }

    public static boolean a(Item item, ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        return item.a(itemStack, entityPlayer, entityLivingBase);
    }

    public static void a(Item item, ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean bl) {
        item.a(itemStack, entityPlayer, list, bl);
    }

    public static void a(Item item, ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
        item.a(itemStack, world, entity, n, bl);
    }

    public static Item f(Item item) {
        return item.c();
    }

    public static boolean o(Item item) {
        return item.a();
    }

    public static String g(Item item, ItemStack itemStack) {
        return item.e(itemStack);
    }

    public static int a(Item item, ItemStack itemStack, int n) {
        return item.a(itemStack, n);
    }

    public static boolean n(Item item) {
        return item.n();
    }

    public static boolean a(Item item, ItemStack itemStack, World world, Block block, BlockPos blockPos, EntityLivingBase entityLivingBase) {
        return item.a(itemStack, world, block, blockPos, entityLivingBase);
    }

    public static boolean d(Item item) {
        return item.l();
    }

    public static boolean l(Item item) {
        return item.i();
    }

    public static float a(Item item, ItemStack itemStack, Block block) {
        return item.a(itemStack, block);
    }

    public static boolean g(Item item) {
        return item.o();
    }

    public static ItemStack b(Item item, ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return item.b(itemStack, world, entityPlayer);
    }

    public static void a(Item item, Item item2, CreativeTabs creativeTabs, List list) {
        item.a(item2, creativeTabs, list);
    }

    public static int e(Item item, ItemStack itemStack) {
        return item.getMaxItemUseDuration(itemStack);
    }
}

