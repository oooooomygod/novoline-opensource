/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.ICrafting;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;
import java.util.Set;

/*
 * Renamed from net.afy
 */
public class afy_2 {
    private static boolean b;

    public static int a(int n, int n2) {
        return Container.b(n, n2);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(Container container, rs_1 rs_12) {
        container.b(rs_12);
    }

    public static ItemStack a(Container container, int n, int n2, int n3, EntityPlayer entityPlayer) {
        return container.a(n, n2, n3, entityPlayer);
    }

    public static boolean c(Container container, EntityPlayer entityPlayer) {
        return container.a(entityPlayer);
    }

    public static boolean b() {
        return b;
    }

    public static void b(Container container, ICrafting iCrafting) {
        container.b(iCrafting);
    }

    public static int a(TileEntity tileEntity) {
        return Container.a(tileEntity);
    }

    public static void b(Container container, EntityPlayer entityPlayer) {
        container.c(entityPlayer);
    }

    public static void a(Container container, int n, int n2) {
        container.a(n, n2);
    }

    public static int a(rs_1 rs_12) {
        return Container.a(rs_12);
    }

    public static void a(Container container, EntityPlayer entityPlayer, boolean bl) {
        container.a(entityPlayer, bl);
    }

    public static Slot a(Container container, int n) {
        return container.c(n);
    }

    public static boolean a(Slot slot, ItemStack itemStack, boolean bl) {
        return Container.a(slot, itemStack, bl);
    }

    public static boolean c() {
        afy_2.b();
        return true;
    }

    public static void a(Container container, ICrafting iCrafting) {
        container.a(iCrafting);
    }

    public static void a(Set set, int n, ItemStack itemStack, int n2) {
        Container.a(set, n, itemStack, n2);
    }

    public static boolean a(Container container, ItemStack itemStack, Slot slot) {
        return container.a(itemStack, slot);
    }

    static {
        if (!afy_2.c()) {
            afy_2.b(true);
        }
    }

    public static void b(Container container) {
        container.c();
    }

    public static int a(int n) {
        return Container.b(n);
    }

    public static boolean a(Container container, Slot slot) {
        return container.b(slot);
    }

    public static void a(Container container, ItemStack[] itemStackArray) {
        container.a(itemStackArray);
    }

    public static boolean a(Container container, EntityPlayer entityPlayer) {
        return container.b(entityPlayer);
    }

    public static void a(Container container, int n, ItemStack itemStack) {
        container.a(n, itemStack);
    }

    public static short c(Container container) {
        return container.d();
    }

    public static Slot a(Container container, rs_1 rs_12, int n) {
        return container.a(rs_12, n);
    }

    public static List a(Container container) {
        return container.e();
    }

    public static boolean a(Container container, EntityPlayer entityPlayer, int n) {
        return container.a(entityPlayer, n);
    }
}

