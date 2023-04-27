/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.Io
 */
public class io_0
extends il_0 {
    private boolean aF;
    private it_2 aH;
    private id_2 aG = new id_2();

    @Override
    protected il_0 c(int n) {
        il_0 il_02 = new io_0(n, true).a(0xD2FFFF, true).a(aL0.a(aL0.a(new StringBuilder(), this.Y), DW.a).toString()).b().a(0.0f, 0.5f).a(new ac_2(this.d + 0.1f, this.a + 0.1f));
        il_02.d = this.d + 0.3f;
        il_02.a = this.a + 0.4f;
        return il_02;
    }

    @Override
    public ii_1 b(Random random) {
        return new i5_0(false);
    }

    public io_0(int n, boolean bl) {
        super(n);
        this.aH = new it_2(4);
        this.aF = bl;
        this.aB = BlocksInvoker.t(Blocks.bq);
        ListInvoker.clear(this.P);
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        if (this.aF) {
            int n = 0;
            while (true) {
                int n2 = a5_0.a(random, 16) + 8;
                int n3 = a5_0.a(random, 16) + 8;
                a45.a(this.aG, world, random, aV8.r(world, amv_2.a(blockPos, n2, 0, n3)));
                ++n;
            }
        }
        super.a(world, random, blockPos);
    }
}

