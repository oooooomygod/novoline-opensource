/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.minecraft.network.packts.C12PacketUpdateSign;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aun
 */
public class aun_2 {
    public static BlockPos b(C12PacketUpdateSign c12PacketUpdateSign) {
        return c12PacketUpdateSign.b();
    }

    public static IChatComponent[] a(C12PacketUpdateSign c12PacketUpdateSign) {
        return c12PacketUpdateSign.a();
    }
}

