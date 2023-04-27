/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.adC
 */
public class adc_0 {
    private BlockPos a;
    private int d;
    private Block c;
    private int b;

    public int c() {
        return this.b;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aAX.b), this.a), aAX.c), this.b), aAX.d), this.d), aAX.a), this.c).toString();
    }

    public adc_0(BlockPos blockPos, Block block, int n, int n2) {
        this.a = blockPos;
        this.b = n;
        this.d = n2;
        this.c = block;
    }

    public boolean equals(Object object) {
        if (!(object instanceof adc_0)) {
            return false;
        }
        adc_0 adc_02 = (adc_0)object;
        return this.a.equals(adc_02.a) && this.b == adc_02.b && this.d == adc_02.d && this.c == adc_02.c;
    }

    public Block b() {
        return this.c;
    }

    public BlockPos d() {
        return this.a;
    }

    public int a() {
        return this.d;
    }
}

