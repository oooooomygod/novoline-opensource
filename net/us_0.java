/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Vec3;
import java.util.Iterator;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Us
 */
public class us_0
implements Iterator<BlockPos> {
    private static int a = 2;
    private zw_1 d;
    private static int e = 0;
    private int b;
    private int f;
    private a7L h;
    private static int i = 1;
    private int c;
    private int g;

    public BlockPos a() {
        a0D.r();
        BlockPos blockPos = this.h.a();
        switch (this.f) {
            case 0: {
                aut_1.a(this.d, amv_2.j(blockPos) * this.b, amv_2.h(blockPos) * this.g, amv_2.i(blockPos) * this.c);
                return this.d;
            }
            case 1: {
                aut_1.a(this.d, amv_2.h(blockPos) * this.b, amv_2.j(blockPos) * this.g, amv_2.i(blockPos) * this.c);
                return this.d;
            }
            case 2: {
                aut_1.a(this.d, amv_2.i(blockPos) * this.b, amv_2.h(blockPos) * this.g, amv_2.j(blockPos) * this.c);
                return this.d;
            }
        }
        aut_1.a(this.d, amv_2.j(blockPos) * this.b, amv_2.h(blockPos) * this.g, amv_2.i(blockPos) * this.c);
        return this.d;
    }

    @Override
    public boolean hasNext() {
        return this.h.hasNext();
    }

    public static void main(String[] stringArray) {
        a0D.r();
        BlockPos blockPos = new BlockPos(10, 20, 30);
        BlockPos blockPos2 = new BlockPos(30, 40, 20);
        us_0 us_02 = new us_0(blockPos, blockPos2, 1, 1);
        if (us_02.hasNext()) {
            BlockPos blockPos3 = us_02.a();
            ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), aiw_0.b), blockPos3).toString());
        }
    }

    private BlockPos a(BlockPos blockPos, boolean bl, boolean bl2, boolean bl3) {
        a0D.r();
        if (bl) {
            blockPos = new BlockPos(-amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos));
        }
        if (bl2) {
            blockPos = new BlockPos(amv_2.j(blockPos), -amv_2.h(blockPos), amv_2.i(blockPos));
        }
        if (bl3) {
            blockPos = new BlockPos(amv_2.j(blockPos), amv_2.h(blockPos), -amv_2.i(blockPos));
        }
        return blockPos;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    @Override
    public void remove() {
        throw new RuntimeException(aiw_0.a);
    }

    public us_0(BlockPos blockPos, BlockPos blockPos2, int n, int n2) {
        double d;
        double d2;
        int n3;
        BlockPos blockPos3;
        BlockPos blockPos4;
        a0D.k();
        this.d = new zw_1(0, 0, 0);
        this.f = 0;
        boolean bl = amv_2.j(blockPos) > amv_2.j(blockPos2);
        boolean bl2 = amv_2.h(blockPos) > amv_2.h(blockPos2);
        boolean bl3 = amv_2.i(blockPos) > amv_2.i(blockPos2);
        blockPos = this.a(blockPos, bl, bl2, bl3);
        blockPos2 = this.a(blockPos2, bl, bl2, bl3);
        this.b = 1;
        this.g = 1;
        this.c = 1;
        Vec3 vec3 = new Vec3(amv_2.j(blockPos2) - amv_2.j(blockPos), amv_2.h(blockPos2) - amv_2.h(blockPos), amv_2.i(blockPos2) - amv_2.i(blockPos));
        Vec3 vec32 = aNE.b(vec3);
        Vec3 vec33 = new Vec3(1.0, 0.0, 0.0);
        double d3 = aNE.c(vec32, vec33);
        double d4 = MathInvoker.a(d3);
        Vec3 vec34 = new Vec3(0.0, 1.0, 0.0);
        double d5 = aNE.c(vec32, vec34);
        double d6 = MathInvoker.a(d5);
        Vec3 vec35 = new Vec3(0.0, 0.0, 1.0);
        double d7 = aNE.c(vec32, vec35);
        double d8 = MathInvoker.a(d7);
        if (d8 >= d6 && d8 >= d4) {
            this.f = 2;
            blockPos4 = new BlockPos(amv_2.i(blockPos), amv_2.h(blockPos) - n, amv_2.j(blockPos) - n2);
            blockPos3 = new BlockPos(amv_2.i(blockPos2), amv_2.h(blockPos) + n + 1, amv_2.j(blockPos) + n2 + 1);
            n3 = amv_2.i(blockPos2) - amv_2.i(blockPos);
            d2 = (double)(amv_2.h(blockPos2) - amv_2.h(blockPos)) / (1.0 * (double)n3);
            d = (double)(amv_2.j(blockPos2) - amv_2.j(blockPos)) / (1.0 * (double)n3);
            this.h = new a7L(blockPos4, blockPos3, d2, d);
        }
        if (d6 >= d4 && d6 >= d8) {
            this.f = 1;
            blockPos4 = new BlockPos(amv_2.h(blockPos), amv_2.j(blockPos) - n, amv_2.i(blockPos) - n2);
            blockPos3 = new BlockPos(amv_2.h(blockPos2), amv_2.j(blockPos) + n + 1, amv_2.i(blockPos) + n2 + 1);
            n3 = amv_2.h(blockPos2) - amv_2.h(blockPos);
            d2 = (double)(amv_2.j(blockPos2) - amv_2.j(blockPos)) / (1.0 * (double)n3);
            d = (double)(amv_2.i(blockPos2) - amv_2.i(blockPos)) / (1.0 * (double)n3);
            this.h = new a7L(blockPos4, blockPos3, d2, d);
        }
        this.f = 0;
        blockPos4 = new BlockPos(amv_2.j(blockPos), amv_2.h(blockPos) - n, amv_2.i(blockPos) - n2);
        blockPos3 = new BlockPos(amv_2.j(blockPos2), amv_2.h(blockPos) + n + 1, amv_2.i(blockPos) + n2 + 1);
        n3 = amv_2.j(blockPos2) - amv_2.j(blockPos);
        d2 = (double)(amv_2.h(blockPos2) - amv_2.h(blockPos)) / (1.0 * (double)n3);
        d = (double)(amv_2.i(blockPos2) - amv_2.i(blockPos)) / (1.0 * (double)n3);
        this.h = new a7L(blockPos4, blockPos3, d2, d);
    }
}

