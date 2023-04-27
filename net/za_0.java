/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.Za
 */
public class za_0
extends zg_0 {
    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.j.c / 25 > 0) {
            this.a(world, hF, 0, 0, this.j.f[SJ.i(EnumFacing.DOWN)]);
        }
        if (this.j.a[SJ.i(EnumFacing.UP)] == null) {
            this.a(world, hF, 1, 4, 1, 6, 4, 6, e);
        }
        int n = 1;
        int n2 = 1;
        while (true) {
            if (a5_0.a(random, 3) != 0) {
                int n3 = 2 + (a5_0.a(random, 4) == 0 ? 0 : 1);
                this.a(world, hF, n, n3, n2, n, 3, n2, BlocksInvoker.a(Blocks.aM, 1), BlocksInvoker.a(Blocks.aM, 1), false);
            }
            ++n2;
        }
    }

    public za_0() {
    }

    public za_0(EnumFacing enumFacing, ajM ajM2, Random random) {
        super(1, enumFacing, ajM2, 1, 1, 1);
    }
}

