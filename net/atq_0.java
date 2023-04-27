/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.atq
 */
public class atq_0 {
    public static EnumFacing c(C07PacketPlayerDigging c07PacketPlayerDigging) {
        return c07PacketPlayerDigging.a();
    }

    public static C07PacketPlayerDigging$Action b(C07PacketPlayerDigging c07PacketPlayerDigging) {
        return c07PacketPlayerDigging.c();
    }

    public static BlockPos a(C07PacketPlayerDigging c07PacketPlayerDigging) {
        return c07PacketPlayerDigging.b();
    }
}

