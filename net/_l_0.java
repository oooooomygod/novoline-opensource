/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.ISaveHandler;
import deobf.MinecraftServer;
import net.minecraft.profiler.Profiler;
import net.minecraft.network.packts.S2BPacketChangeGameState;

/*
 * Renamed from net._l
 */
public class _l_0
extends WorldServer {
    private MinecraftServer ag;

    @Override
    protected void y() {
        aP2.b();
        if (!ys_2.ap()) {
            this.e();
        }
        super.y();
    }

    @Override
    public void i() {
        aP2.b();
        super.i();
        if (!ys_2.k()) {
            this.c();
        }
        if (tf_0.e) {
            tf_0.e = false;
            aru_1.a(ys_2.ax(), this);
        }
    }

    public _l_0(MinecraftServer minecraftServer, ISaveHandler iSaveHandler, WorldInfo worldInfo, int n, Profiler profiler) {
        super(minecraftServer, iSaveHandler, worldInfo, n, profiler);
        this.ag = minecraftServer;
    }

    private void e() {
        aP2.b();
        if (this.z.t() || this.z.J()) {
            uv_2.h(this.z, 0);
            uv_2.d(this.z, false);
            this.e(0.0f);
            uv_2.b(this.z, 0);
            uv_2.e(this.z, false);
            this.b(0.0f);
            aek_1.a(ServerInvoker.R(this.ag), new S2BPacketChangeGameState(2, 0.0f));
            aek_1.a(ServerInvoker.R(this.ag), new S2BPacketChangeGameState(7, 0.0f));
            aek_1.a(ServerInvoker.R(this.ag), new S2BPacketChangeGameState(8, 0.0f));
        }
    }

    private void c() {
        aP2.b();
        if (ar3_0.a(uv_2.C(this.z)) == 1) {
            long l4 = this.E();
            long l5 = l4 % 24000L;
            if (ys_2.ar()) {
                if (l5 <= 1000L) {
                    this.a(l4 - l5 + 1001L);
                }
                if (l5 >= 11000L) {
                    this.a(l4 - l5 + 24001L);
                }
            }
            if (ys_2.Y()) {
                if (l5 <= 14000L) {
                    this.a(l4 - l5 + 14001L);
                }
                if (l5 >= 22000L) {
                    this.a(l4 - l5 + 24000L + 14001L);
                }
            }
        }
    }
}

