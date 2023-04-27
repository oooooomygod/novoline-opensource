/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

public class aG4 {
    public static ahh_0 a(F8 f8, ItemStack itemStack, ItemStack itemStack2, int n) {
        return f8.a(itemStack, itemStack2, n);
    }

    public static void a(F8 f8, PacketBuffer packetBuffer) {
        f8.b(packetBuffer);
    }

    public static F8 a(PacketBuffer packetBuffer) {
        return F8.a(packetBuffer);
    }

    public static NBTTagCompound a(F8 f8) {
        return f8.a();
    }
}

