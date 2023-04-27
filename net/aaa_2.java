/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aaa
 */
public class aaa_2 {
    private int b;
    private int c;
    private BlockPos a;
    private int d;

    public void a(int n) {
        if (n > 10) {
            n = 10;
        }
        this.d = n;
    }

    public aaa_2(int n, BlockPos blockPos) {
        this.b = n;
        this.a = blockPos;
    }

    public void b(int n) {
        this.c = n;
    }

    public BlockPos c() {
        return this.a;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }
}

