/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.network.packts.S49PacketUpdateEntityNBT;

public class GU {
    public static Entity a(S49PacketUpdateEntityNBT s49PacketUpdateEntityNBT, World world) {
        return s49PacketUpdateEntityNBT.a(world);
    }

    public static NBTTagCompound a(S49PacketUpdateEntityNBT s49PacketUpdateEntityNBT) {
        return s49PacketUpdateEntityNBT.a();
    }
}

