/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.S24PacketBlockAction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.afW
 */
public class afw_1 {
    public static int b(S24PacketBlockAction s24PacketBlockAction) {
        return s24PacketBlockAction.d();
    }

    public static BlockPos c(S24PacketBlockAction s24PacketBlockAction) {
        return s24PacketBlockAction.b();
    }

    public static Block a(S24PacketBlockAction s24PacketBlockAction) {
        return s24PacketBlockAction.a();
    }

    public static int d(S24PacketBlockAction s24PacketBlockAction) {
        return s24PacketBlockAction.c();
    }
}

