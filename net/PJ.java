/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import net.minecraft.network.packts.C10PacketCreativeInventoryAction;

public class PJ {
    public static ItemStack a(C10PacketCreativeInventoryAction c10PacketCreativeInventoryAction) {
        return c10PacketCreativeInventoryAction.b();
    }

    public static int b(C10PacketCreativeInventoryAction c10PacketCreativeInventoryAction) {
        return c10PacketCreativeInventoryAction.a();
    }
}

