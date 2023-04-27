/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.List;

/*
 * Renamed from net.ano
 */
public class ano_2 {
    private int c;
    private static String a = "CL_00000375";
    private aqs_0 e;
    private char[] g;
    private int f;
    private aqs_0 b;
    private int d;

    public void b(int n, int n2, int n3, int n4) {
        awc_0.a(this.e, n, n2, n3, n4);
    }

    public Block c(int n, int n2, int n3) {
        return BlockStateInvoker.getBlock(this.a(n, n2, n3));
    }

    public IBlockState a(int n, int n2, int n3) {
        IBlockState iBlockState = (IBlockState)aZv.a(Block.H, this.g[n2 << 8 | n3 << 4 | n]);
        return iBlockState;
    }

    public void a(int n, int n2, int n3, int n4) {
        awc_0.a(this.b, n, n2, n3, n4);
    }

    public boolean b() {
        return this.d == 0;
    }

    public void a(int n, int n2, int n3, IBlockState iBlockState) {
        if (aC8.a(ail_0.cm, iBlockState)) {
            iBlockState = (IBlockState)aDb.f(iBlockState, ail_0.dq, new Object[0]);
        }
        IBlockState iBlockState2 = this.a(n, n2, n3);
        Block block = BlockStateInvoker.getBlock(iBlockState2);
        Block block2 = BlockStateInvoker.getBlock(iBlockState);
        if (block != Blocks.air) {
            --this.d;
            if (BlocksInvoker.J(block)) {
                --this.c;
            }
        }
        if (block2 != Blocks.air) {
            ++this.d;
            if (BlocksInvoker.J(block2)) {
                ++this.c;
            }
        }
        this.g[n2 << 8 | n3 << 4 | n] = (char)aZv.a(Block.H, iBlockState);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "*Z\u000bRq\u0019|Y%cW".toCharArray();
        int n2 = 0;
        int n3 = 59;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x52));
            n3 = n3;
        }
    }

    public aqs_0 a() {
        return this.e;
    }

    public void a(aqs_0 aqs_02) {
        this.e = aqs_02;
    }

    public int d(int n, int n2, int n3) {
        return awc_0.a(this.e, n, n2, n3);
    }

    public boolean d() {
        return this.c > 0;
    }

    public int g() {
        return this.f;
    }

    public int b(int n, int n2, int n3) {
        return awc_0.a(this.b, n, n2, n3);
    }

    public void b(aqs_0 aqs_02) {
        this.b = aqs_02;
    }

    /*
     * WARNING - void declaration
     */
    public void e() {
        List list = aZv.a(Block.H);
        int n = ListInvoker.size(list);
        int n2 = 0;
        int n3 = n2 << 8;
        int n4 = 0;
        int n5 = n3 | n4 << 4;
        int n6 = 0;
        while (true) {
            IBlockState iBlockState;
            Block block;
            void var3_8;
            char c = this.g[n5 | n6];
            ++var3_8;
            if (c < n && BlocksInvoker.J(block = BlockStateInvoker.getBlock(iBlockState = (IBlockState)ListInvoker.get(list, c)))) {
                void var4_9;
                ++var4_9;
            }
            ++n6;
        }
    }

    public ano_2(int n, boolean bl) {
        this.f = n;
        this.g = new char[4096];
        this.b = new aqs_0();
        this.e = new aqs_0();
    }

    public int e(int n, int n2, int n3) {
        IBlockState iBlockState = this.a(n, n2, n3);
        return BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState);
    }

    public char[] f() {
        return this.g;
    }

    public void a(char[] cArray) {
        this.g = cArray;
    }

    public aqs_0 c() {
        return this.b;
    }
}

