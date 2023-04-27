/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.BlockPos;

public class aK5
extends aKU {
    public aK5(World world, Random random, int n, int n2) {
        super(n, n2);
        il_0 il_02 = aV8.o(world, new BlockPos(n * 16 + 8, 0, n2 * 16 + 8));
        if (il_02 != il_0.at && il_02 != il_0.al) {
            if (il_02 == il_0.aw) {
                YY yY = new YY(random, n * 16, n2 * 16);
                aky_1.a(this.c, yY);
            } else if (il_02 == il_0.V || il_02 == il_0.c) {
                yw_0 yw_02 = new yw_0(random, n * 16, n2 * 16);
                aky_1.a(this.c, yw_02);
            }
        } else {
            ys_0 ys_02 = new ys_0(random, n * 16, n2 * 16);
            aky_1.a(this.c, ys_02);
        }
        this.b();
    }

    public aK5() {
    }
}

