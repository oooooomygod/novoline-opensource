/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.ta
 */
class ta_1
extends t5_0 {
    private ta_1() {
    }

    @Override
    public void a(Random random, int n, int n2, int n3, boolean bl) {
        float f = a5_0.e(random);
        this.a = f < 0.2f ? BlocksInvoker.a(Blocks.z, hk_1.Q) : (f < 0.5f ? BlocksInvoker.a(Blocks.z, hk_1.R) : (f < 0.55f ? BlocksInvoker.a(Blocks.bV, SL.a(vx_0.STONEBRICK)) : BlocksInvoker.t(Blocks.z)));
    }

    ta_1(agc_1 agc_12) {
        this();
    }
}

