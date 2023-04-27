/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.init.Blocks;

public class Ij
extends il_0 {
    @Override
    public int a(float f) {
        return 0;
    }

    public Ij(int n) {
        super(n);
        ListInvoker.clear(this.ar);
        ListInvoker.clear(this.P);
        ListInvoker.clear(this.x);
        ListInvoker.clear(this.aj);
        ListInvoker.add(this.ar, new cp_0(nn_0.class, 10, 4, 4));
        this.aB = BlocksInvoker.t(Blocks.dirt);
        this.J = BlocksInvoker.t(Blocks.dirt);
        this.ai = new cf_2();
    }
}

