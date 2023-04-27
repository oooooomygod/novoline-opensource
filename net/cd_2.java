/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.cd
 */
public class cd_2
extends ct_2 {
    private float g;
    private il_0 f;

    @Override
    public boolean a(int n, int n2, int n3, List<il_0> list) {
        return ListInvoker.contains(list, this.f);
    }

    @Override
    public float[] a(float[] fArray, int n, int n2, int n3, int n4) {
        if (fArray.length < n3 * n4) {
            fArray = new float[n3 * n4];
        }
        a7r_0.a(fArray, 0, n3 * n4, this.g);
        return fArray;
    }

    public cd_2(il_0 il_02, float f) {
        this.f = il_02;
        this.g = f;
    }

    @Override
    public BlockPos a(int n, int n2, int n3, List<il_0> list, Random random) {
        return ListInvoker.contains(list, this.f) ? new BlockPos(n - n3 + a5_0.a(random, n3 * 2 + 1), 0, n2 - n3 + a5_0.a(random, n3 * 2 + 1)) : null;
    }

    @Override
    public il_0[] a(il_0[] il_0Array, int n, int n2, int n3, int n4, boolean bl) {
        return this.b(il_0Array, n, n2, n3, n4);
    }

    @Override
    public il_0 a(BlockPos blockPos) {
        return this.f;
    }

    @Override
    public il_0[] a(il_0[] il_0Array, int n, int n2, int n3, int n4) {
        if (il_0Array.length < n3 * n4) {
            il_0Array = new il_0[n3 * n4];
        }
        a7r_0.a(il_0Array, 0, n3 * n4, this.f);
        return il_0Array;
    }

    @Override
    public il_0[] b(il_0[] il_0Array, int n, int n2, int n3, int n4) {
        if (il_0Array.length < n3 * n4) {
            il_0Array = new il_0[n3 * n4];
        }
        a7r_0.a(il_0Array, 0, n3 * n4, this.f);
        return il_0Array;
    }
}

