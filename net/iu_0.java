/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.Iu
 */
public class iu_0
extends il_0 {
    public iu_0(int n) {
        super(n);
        this.ai.w = -100;
        this.ai.e = -100;
        this.ai.j = -100;
        this.ai.b = 1;
        this.ai.n = 1;
        this.aB = amg_2.a(Blocks.aE);
        ListInvoker.clear(this.ar);
        ListInvoker.clear(this.P);
        ListInvoker.clear(this.x);
        ListInvoker.add(this.P, new cp_0(nr_1.class, 8, 4, 8));
    }
}

