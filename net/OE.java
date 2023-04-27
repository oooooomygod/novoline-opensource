/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MinecraftServer;
import java.util.concurrent.Callable;
import net.aL0;
import net.aek_1;
import net.ann_1;

class OE
implements Callable<String> {
    MinecraftServer a;

    OE(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
    }

    public String a() {
        return aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(new StringBuilder(), MinecraftServer.a(this.a).o()), ann_1.b), MinecraftServer.a(this.a).a()), ann_1.a), aek_1.l(MinecraftServer.a(this.a))).toString();
    }
}

