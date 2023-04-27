/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Packet;

/*
 * Renamed from net.pT
 */
public class pt_1 {
    public static wp_1 a(int n, World world) {
        return ItemMap.a(n, world);
    }

    public static wp_1 a(ItemMap itemMap, ItemStack itemStack, World world) {
        return itemMap.a(itemStack, world);
    }

    public static Packet a(ItemMap itemMap, ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return itemMap.a(itemStack, world, entityPlayer);
    }
}

