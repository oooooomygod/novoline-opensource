/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.t5
 */
public abstract class t5_0 {
    protected IBlockState a = BlocksInvoker.t(Blocks.air);

    public IBlockState a() {
        return this.a;
    }

    public abstract void a(Random var1, int var2, int var3, int var4, boolean var5);
}

