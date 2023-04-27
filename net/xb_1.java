/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.xB
 */
public class xb_1 {
    private short[] a = new short[65536];
    private IBlockState b = BlocksInvoker.t(Blocks.air);

    public IBlockState a(int n) {
        if (n < this.a.length) {
            IBlockState iBlockState = (IBlockState)aZv.a(Block.H, this.a[n]);
            return iBlockState;
        }
        throw new IndexOutOfBoundsException(anu_0.a);
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    public void a(int n, int n2, int n3, IBlockState iBlockState) {
        int n4 = n << 12 | n3 << 8 | n2;
        this.a(n4, iBlockState);
    }

    public void a(int n, IBlockState iBlockState) {
        if (n < this.a.length) {
            this.a[n] = (short)aZv.a(Block.H, iBlockState);
            return;
        }
        throw new IndexOutOfBoundsException(anu_0.b);
    }

    public IBlockState a(int n, int n2, int n3) {
        int n4 = n << 12 | n3 << 8 | n2;
        return this.a(n4);
    }
}

