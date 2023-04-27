/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;

/*
 * Renamed from net.wi
 */
public class wi_1 {
    private IBlockState d;
    private int a = 1;
    private int b;
    private int c;

    private int a() {
        return BlocksInvoker.c(BlockStateInvoker.getBlock(this.d), this.d);
    }

    public void a(int n) {
        this.b = n;
    }

    public IBlockState e() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public wi_1(int n, int n2, Block block) {
        this.c = n;
        this.a = n2;
        this.d = BlocksInvoker.t(block);
    }

    public int b() {
        return this.a;
    }

    private Block d() {
        return BlockStateInvoker.getBlock(this.d);
    }

    public String toString() {
        String string;
        if (this.c >= 3) {
            ResourceLocation resourceLocation = (ResourceLocation)a82.b(Block.m, this.d());
            string = ki_2.b;
            if (this.a > 1) {
                string = aL0.a(aL0.a(aL0.c(new StringBuilder(), this.a), ki_2.a), string).toString();
            }
        } else {
            string = P8.g(BlocksInvoker.v(this.d()));
            if (this.a > 1) {
                string = aL0.a(aL0.a(aL0.c(new StringBuilder(), this.a), ki_2.d), string).toString();
            }
        }
        int n = this.a();
        string = aL0.c(aL0.a(aL0.a(new StringBuilder(), string), ki_2.c), n).toString();
        return string;
    }

    public wi_1(int n, int n2, Block block, int n3) {
        this(n, n2, block);
        this.d = BlocksInvoker.a(block, n3);
    }

    public wi_1(int n, Block block) {
        this(3, n, block);
    }
}

