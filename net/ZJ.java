/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.world.GameType;
import deobf.ISaveHandler;
import deobf.MinecraftServer;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.WorldSettings;

public class ZJ
extends WorldServer {
    public static WorldSettings ah;
    private static long ag;

    public ZJ(MinecraftServer minecraftServer, ISaveHandler iSaveHandler, WorldInfo worldInfo, int n, Profiler profiler) {
        super(minecraftServer, iSaveHandler, worldInfo, n, profiler);
        uv_2.a(this.z, ah);
    }

    static {
        ag = tz_2.a.hashCode();
        ah = add_1.f(new WorldSettings(ag, GameType.SURVIVAL, true, false, WorldType.n));
    }
}

