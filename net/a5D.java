/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

public class a5D
implements Comparable<a5D> {
    public int f;
    public long a;
    private static long d;
    private Block e;
    private long c = d++;
    public BlockPos b;

    public a5D(BlockPos blockPos, Block block) {
        this.b = blockPos;
        this.e = block;
    }

    public Block a() {
        return this.e;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof a5D)) {
            return false;
        }
        a5D a5D2 = (a5D)object;
        return this.b.equals(a5D2.b) && BlocksInvoker.a(this.e, a5D2.e);
    }

    public int a(a5D a5D2) {
        return this.a < a5D2.a ? -1 : (this.a > a5D2.a ? 1 : (this.f != a5D2.f ? this.f - a5D2.f : (this.c < a5D2.c ? -1 : (this.c > a5D2.c ? 1 : 0))));
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(new StringBuilder(), BlocksInvoker.v(this.e)), aer_1.c), this.b), aer_1.b), this.a), aer_1.a), this.f), aer_1.d), this.c).toString();
    }

    public a5D a(long l4) {
        this.a = l4;
        return this;
    }

    public void a(int n) {
        this.f = n;
    }
}

