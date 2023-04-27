/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.Item;
import net.Slot;
import net.rs_1;

public class ItemStackInvoker {
    private static boolean b;

    public static ItemStack a(Slot slot) {
        return slot.f();
    }

    public static boolean a(Slot slot, rs_1 rs_12, int n) {
        return slot.a(rs_12, n);
    }

    public static void a(Slot slot, ItemStack itemStack) {
        slot.d(itemStack);
    }

    public static boolean c(Slot slot) {
        return slot.c();
    }

    public static String d(Slot slot) {
        return slot.b();
    }

    public static boolean b(Slot slot, ItemStack itemStack) {
        return slot.a(itemStack);
    }

    public static ItemStack a(Slot slot, int n) {
        return slot.a(n);
    }

    public static boolean e(Slot slot) {
        return slot.d();
    }

    public static void a(Slot slot, ItemStack itemStack, ItemStack itemStack2) {
        slot.a(itemStack, itemStack2);
    }

    public static boolean b() {
        return b;
    }

    public static void b(Slot slot) {
        slot.e();
    }

    public static void a(Slot slot, EntityPlayer entityPlayer, ItemStack itemStack) {
        slot.a(entityPlayer, itemStack);
    }

    public static int c(Slot slot, ItemStack itemStack) {
        return slot.c(itemStack);
    }

    static {
        if (ItemStackInvoker.b()) {
            ItemStackInvoker.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean a() {
        ItemStackInvoker.b();
        return true;
    }

    public static boolean a(Slot slot, EntityPlayer entityPlayer) {
        return slot.a(entityPlayer);
    }

    public static boolean a(Slot slot, Item item) {
        return slot.a(item);
    }
}

