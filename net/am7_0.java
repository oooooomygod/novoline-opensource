/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashReportCategoryInvoker;
import deobf.Chunk;
import java.util.concurrent.Callable;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.am7
 */
class am7_0
implements Callable<String> {
    BlockPos a;
    Chunk b;

    am7_0(Chunk chunk, BlockPos blockPos) {
        this.b = chunk;
        this.a = blockPos;
    }

    public String a() throws Exception {
        return CrashReportCategoryInvoker.a(this.a);
    }
}

