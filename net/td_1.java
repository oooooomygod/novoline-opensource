/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.tD
 */
class td_1
extends t5_0 {
    td_1(aW2 aW22) {
        this();
    }

    @Override
    public void a(Random random, int n, int n2, int n3, boolean bl) {
        this.a = a5_0.e(random) < 0.4f ? BlocksInvoker.t(Blocks.cobblestone) : BlocksInvoker.t(Blocks.L);
    }

    private td_1() {
    }
}

