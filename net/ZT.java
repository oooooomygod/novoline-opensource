/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ISaveHandler;
import deobf.MinecraftServer;
import net.minecraft.profiler.Profiler;

public class ZT
extends WorldServer {
    private WorldServer ag;

    public ZT(MinecraftServer minecraftServer, ISaveHandler iSaveHandler, int n, WorldServer worldServer, Profiler profiler) {
        super(minecraftServer, iSaveHandler, new agd_1(worldServer.w()), n, profiler);
        this.ag = worldServer;
        ak9_0.a(worldServer.R(), new qu_1(this));
    }

    @Override
    public World Q() {
        this.K = this.ag.g();
        this.v = this.ag.m();
        String string = EX.a(this.d);
        wf_1 cfr_ignored_0 = (wf_1)P7.a(this.K, wf_1.class, string);
        this.n = new wf_1(this);
        P7.a(this.K, string, this.n);
        return this;
    }

    @Override
    protected void n() throws cd_1 {
    }
}

