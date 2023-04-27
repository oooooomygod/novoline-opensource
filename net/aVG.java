/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.S23PacketBlockChange;
import net.minecraft.block.BlockPos;

public class aVG {
    public static IBlockState a(S23PacketBlockChange s23PacketBlockChange) {
        return s23PacketBlockChange.b();
    }

    public static BlockPos b(S23PacketBlockChange s23PacketBlockChange) {
        return s23PacketBlockChange.a();
    }
}

