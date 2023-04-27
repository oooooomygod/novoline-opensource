/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.packts.C00PacketLoginStart;

public class YP {
    public static GameProfile a(C00PacketLoginStart c00PacketLoginStart) {
        return c00PacketLoginStart.a();
    }
}

