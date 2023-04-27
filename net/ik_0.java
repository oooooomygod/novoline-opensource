/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.Ik
 */
public class ik_0
extends il_0 {
    public ik_0(int n) {
        super(n);
        ListInvoker.clear(this.P);
        this.aB = BlocksInvoker.t(Blocks.stone);
        this.J = BlocksInvoker.t(Blocks.stone);
        this.ai.w = -999;
        this.ai.E = 0;
        this.ai.k = 0;
        this.ai.y = 0;
    }
}

