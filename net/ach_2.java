/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashReportCategoryInvoker;
import deobf.Chunk;
import java.util.concurrent.Callable;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ach
 */
class ach_2
implements Callable<String> {
    Chunk a;
    BlockPos b;

    ach_2(Chunk chunk, BlockPos blockPos) {
        this.a = chunk;
        this.b = blockPos;
    }

    public String a() throws Exception {
        return CrashReportCategoryInvoker.a(this.b);
    }
}

