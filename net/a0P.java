/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashReportCategoryInvoker;
import deobf.Chunk;
import java.util.concurrent.Callable;
import net.minecraft.block.BlockPos;

class a0P
implements Callable<String> {
    int b;
    int d;
    int a;
    Chunk c;

    public String a() throws Exception {
        return CrashReportCategoryInvoker.a(new BlockPos(this.c.f * 16 + this.a, this.b, this.c.v * 16 + this.d));
    }

    a0P(Chunk chunk, int n, int n2, int n3) {
        this.c = chunk;
        this.a = n;
        this.b = n2;
        this.d = n3;
    }
}

