/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ProfilerInvoker;
import deobf.MinecraftServer;
import java.util.concurrent.Callable;
import net.l0_0;

/*
 * Renamed from net.w7
 */
class w7_0
implements Callable<String> {
    MinecraftServer a;

    w7_0(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
    }

    public String a() throws Exception {
        return this.a.m.g ? ProfilerInvoker.c(this.a.m) : l0_0.a;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

