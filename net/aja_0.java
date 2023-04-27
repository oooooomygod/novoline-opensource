/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.S35PacketUpdateTileEntity;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aja
 */
public class aja_0 {
    public static int a(S35PacketUpdateTileEntity s35PacketUpdateTileEntity) {
        return s35PacketUpdateTileEntity.b();
    }

    public static NBTTagCompound b(S35PacketUpdateTileEntity s35PacketUpdateTileEntity) {
        return s35PacketUpdateTileEntity.a();
    }

    public static BlockPos c(S35PacketUpdateTileEntity s35PacketUpdateTileEntity) {
        return s35PacketUpdateTileEntity.c();
    }
}

