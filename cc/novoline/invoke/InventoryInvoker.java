/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import net.minecraft.block.Block;
import net.Item;
import net.NBTTagCompound;
import net.aSK;

public class InventoryInvoker {
    private static int b;

    public static void a(aSK aSK2, Item item, int n, boolean bl, boolean bl2) {
        aSK2.a(item, n, bl, bl2);
    }

    public static ItemStack b(aSK aSK2, int n) {
        return aSK2.b(n);
    }

    public static boolean b(aSK aSK2, Item item) {
        return aSK2.b(item);
    }

    public static NBTTagList b(aSK aSK2, NBTTagList nBTTagList) {
        return aSK2.b(nBTTagList);
    }

    public static ItemStack a(aSK aSK2, int n) {
        return aSK2.c(n);
    }

    public static ItemStack g(aSK aSK2) {
        return aSK2.i();
    }

    public static ItemStack a(aSK aSK2, int n, int n2) {
        return aSK2.b(n, n2);
    }

    public static int b() {
        return b;
    }

    public static void c(aSK aSK2, ItemStack itemStack) {
        aSK2.e(itemStack);
    }

    public static boolean b(aSK aSK2, Block block) {
        return aSK2.b(block);
    }

    public static boolean a(aSK aSK2, Item item) {
        return aSK2.c(item);
    }

    public static int c() {
        InventoryInvoker.b();
        return 108;
    }

    public static void a(aSK aSK2, NBTTagList nBTTagList) {
        aSK2.a(nBTTagList);
    }

    public static ItemStack c(aSK aSK2, int n) {
        return aSK2.a(n);
    }

    public static boolean a(aSK aSK2, ItemStack itemStack) {
        return aSK2.c(itemStack);
    }

    public static boolean b(aSK aSK2, ItemStack itemStack) {
        return aSK2.a(itemStack);
    }

    static {
        if (InventoryInvoker.c() != 0) {
            InventoryInvoker.b(12);
        }
    }

    public static int b(aSK aSK2) {
        return aSK2.e();
    }

    public static void c(aSK aSK2) {
        aSK2.h();
    }

    public static void b(int n) {
        b = n;
    }

    public static int a(aSK aSK2, Item item, int n, int n2, NBTTagCompound nBTTagCompound) {
        return aSK2.a(item, n, n2, nBTTagCompound);
    }

    public static void d(aSK aSK2, int n) {
        aSK2.a(n);
    }

    public static ItemStack f(aSK aSK2) {
        return aSK2.f();
    }

    public static void a(aSK aSK2, int n, ItemStack itemStack) {
        aSK2.b(n, itemStack);
    }

    public static IChatComponent d(aSK aSK2) {
        return aSK2.getDisplayName();
    }

    public static void a(aSK aSK2, aSK aSK3) {
        aSK2.a(aSK3);
    }

    public static float a(aSK aSK2, Block block) {
        return aSK2.a(block);
    }

    public static int e(aSK aSK2) {
        return aSK2.a();
    }

    public static void a(aSK aSK2) {
        aSK2.e();
    }

    public static int a() {
        return aSK.d();
    }
}

