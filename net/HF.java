/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

public class HF {
    public int b;
    public int a;
    public int f;
    public int e;
    public int c;
    public int d;

    public boolean a(int n, int n2, int n3, int n4) {
        return this.d >= n && this.f <= n3 && this.e >= n2 && this.b <= n4;
    }

    public HF(zl_2 zl_22, zl_2 zl_23) {
        this.f = MathInvoker.b(FJ.a(zl_22), FJ.a(zl_23));
        this.c = MathInvoker.b(FJ.b(zl_22), FJ.b(zl_23));
        this.b = MathInvoker.b(FJ.c(zl_22), FJ.c(zl_23));
        this.d = MathInvoker.max(FJ.a(zl_22), FJ.a(zl_23));
        this.a = MathInvoker.max(FJ.b(zl_22), FJ.b(zl_23));
        this.e = MathInvoker.max(FJ.c(zl_22), FJ.c(zl_23));
    }

    public static HF a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, EnumFacing enumFacing) {
        switch (a9g_0.a[enumFacing.ordinal()]) {
            case 1: {
                return new HF(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case 2: {
                return new HF(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case 3: {
                return new HF(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case 4: {
                return new HF(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
        }
        return new HF(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
    }

    public zl_2 f() {
        return new BlockPos(this.f + (this.d - this.f + 1) / 2, this.c + (this.a - this.c + 1) / 2, this.b + (this.e - this.b + 1) / 2);
    }

    public String toString() {
        return mg_2.a(mg_2.a(mg_2.a(mg_2.a(mg_2.a(mg_2.a(aWU.a(this), qb_1.d, this.f), qb_1.f, this.c), qb_1.e, this.b), qb_1.b, this.d), qb_1.c, this.a), qb_1.a, this.e).toString();
    }

    public HF() {
    }

    public boolean a(zl_2 zl_22) {
        return FJ.a(zl_22) >= this.f && FJ.a(zl_22) <= this.d && FJ.c(zl_22) >= this.b && FJ.c(zl_22) <= this.e && FJ.b(zl_22) >= this.c && FJ.b(zl_22) <= this.a;
    }

    public int g() {
        return this.a - this.c + 1;
    }

    public HF(int n, int n2, int n3, int n4, int n5, int n6) {
        this.f = n;
        this.c = n2;
        this.b = n3;
        this.d = n4;
        this.a = n5;
        this.e = n6;
    }

    public HF(HF hF) {
        this.f = hF.f;
        this.c = hF.c;
        this.b = hF.b;
        this.d = hF.d;
        this.a = hF.a;
        this.e = hF.e;
    }

    public int e() {
        return this.e - this.b + 1;
    }

    public HF(int n, int n2, int n3, int n4) {
        this.f = n;
        this.b = n2;
        this.d = n3;
        this.e = n4;
        this.c = 1;
        this.a = 512;
    }

    public void b(HF hF) {
        this.f = MathInvoker.b(this.f, hF.f);
        this.c = MathInvoker.b(this.c, hF.c);
        this.b = MathInvoker.b(this.b, hF.b);
        this.d = MathInvoker.max(this.d, hF.d);
        this.a = MathInvoker.max(this.a, hF.a);
        this.e = MathInvoker.max(this.e, hF.e);
    }

    public aDO a() {
        return new aDO(new int[]{this.f, this.c, this.b, this.d, this.a, this.e});
    }

    public static HF a(int n, int n2, int n3, int n4, int n5, int n6) {
        return new HF(MathInvoker.b(n, n4), MathInvoker.b(n2, n5), MathInvoker.b(n3, n6), MathInvoker.max(n, n4), MathInvoker.max(n2, n5), MathInvoker.max(n3, n6));
    }

    public boolean a(HF hF) {
        return this.d >= hF.f && this.f <= hF.d && this.e >= hF.b && this.b <= hF.e && this.a >= hF.c && this.c <= hF.a;
    }

    public zl_2 c() {
        return new zl_2(this.d - this.f, this.a - this.c, this.e - this.b);
    }

    public HF(int[] nArray) {
        if (nArray.length == 6) {
            this.f = nArray[0];
            this.c = nArray[1];
            this.b = nArray[2];
            this.d = nArray[3];
            this.a = nArray[4];
            this.e = nArray[5];
        }
    }

    public void a(int n, int n2, int n3) {
        this.f += n;
        this.c += n2;
        this.b += n3;
        this.d += n;
        this.a += n2;
        this.e += n3;
    }

    public int b() {
        return this.d - this.f + 1;
    }

    public static HF d() {
        return new HF(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}

