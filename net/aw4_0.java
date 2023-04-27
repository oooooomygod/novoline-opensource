/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.MinecraftServer;
import net.IProgressUpdate;
import net.aL0;
import net.p_0;

/*
 * Renamed from net.aw4
 */
class aw4_0
implements IProgressUpdate {
    MinecraftServer a;
    private long b;

    @Override
    public void a(String string) {
    }

    aw4_0(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
        this.b = SystemInvoker.f();
    }

    @Override
    public void b(String string) {
    }

    @Override
    public void b() {
    }

    @Override
    public void a(int n) {
        if (SystemInvoker.f() - this.b >= 1000L) {
            this.b = SystemInvoker.f();
            LoggerInvoker.info(MinecraftServer.v(), aL0.a(aL0.c(aL0.a(new StringBuilder(), p_0.a), n), p_0.b).toString());
        }
    }

    @Override
    public void c(String string) {
    }
}

