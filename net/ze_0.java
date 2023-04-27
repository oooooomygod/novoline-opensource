/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Ze
 */
public class ze_0
extends zq_0 {
    public ag__0 g;
    public List<Y_> h = my_0.c();
    public ZZ f;

    public ze_0() {
    }

    public ze_0(int n, Random random, int n2, int n3) {
        super(0, random, n2, n3);
    }

    @Override
    public BlockPos c() {
        return this.f != null ? this.f.c() : super.c();
    }
}

