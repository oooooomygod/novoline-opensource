/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.network.packts.S0APacketUseBed;
import net.minecraft.block.BlockPos;

public class aN7 {
    public static EntityPlayer a(S0APacketUseBed s0APacketUseBed, World world) {
        return s0APacketUseBed.a(world);
    }

    public static BlockPos a(S0APacketUseBed s0APacketUseBed) {
        return s0APacketUseBed.a();
    }
}

