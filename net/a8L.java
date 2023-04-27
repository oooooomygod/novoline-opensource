/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import net.minecraft.network.packts.S04PacketEntityEquipment;

public class a8L {
    public static ItemStack a(S04PacketEntityEquipment s04PacketEntityEquipment) {
        return s04PacketEntityEquipment.b();
    }

    public static int b(S04PacketEntityEquipment s04PacketEntityEquipment) {
        return s04PacketEntityEquipment.c();
    }

    public static int c(S04PacketEntityEquipment s04PacketEntityEquipment) {
        return s04PacketEntityEquipment.a();
    }
}

