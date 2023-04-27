/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aor
 */
public class aor_2 {
    int d;
    int c;
    int e;
    int a;
    int b;

    public int a() {
        return this.a + this.e;
    }

    public aor_2(int n, int n2, int n3, int n4) {
        this.b = n;
        this.d = n2;
        this.a = n3;
        this.e = n4;
    }

    public int b() {
        return this.d;
    }

    public BlockPos a(int n) {
        return new BlockPos(this.b, n, this.d);
    }

    public int c() {
        return this.b;
    }
}

