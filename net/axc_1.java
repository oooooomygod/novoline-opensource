/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ModuleInvoker;
import deobf.ModuleRegistry;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.axC
 */
public class axc_1 {
    private static int e;
    private static int[] f;
    private int d = 4096;
    private static int a;
    private static String c = "CL_00002450";
    private BitSet b = new BitSet(4096);
    private static int g;

    private Set a(int n) {
        EnumSet enumSet = ace_2.b(EnumFacing.class);
        ArrayDeque arrayDeque = new ArrayDeque(384);
        a8O.b(arrayDeque, VN.a(n));
        aM_.a(this.b, n, true);
        while (!a8O.f(arrayDeque)) {
            int n2 = P8.b((Integer)a8O.e(arrayDeque));
            this.a(n2, enumSet);
            for (EnumFacing enumFacing : EnumFacing.VALUES) {
                int n3 = this.a(n2, enumFacing);
                if (aM_.a(this.b, n3)) continue;
                aM_.a(this.b, n3, true);
                a8O.b(arrayDeque, VN.a(n3));
            }
        }
        return enumSet;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "V0s\t\u0018x\t'H\u0019\t".toCharArray();
        int n2 = 0;
        int n3 = 96;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x75));
            n3 = n3;
        }
    }

    private static int a(int n, int n2, int n3) {
        return n | n2 << 8 | n3 << 4;
    }

    public aEO a() {
        aEO aEO2 = new aEO();
        if (wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY))) {
            BI.a(aEO2, true);
            return aEO2;
        }
        if (4096 - this.d < 256) {
            BI.a(aEO2, true);
        } else if (this.d == 0) {
            BI.a(aEO2, false);
        } else {
            for (int n : f) {
                if (aM_.a(this.b, n)) continue;
                BI.a(aEO2, this.a(n));
            }
        }
        return aEO2;
    }

    public void c(BlockPos blockPos) {
        aM_.a(this.b, axc_1.a(blockPos), true);
        --this.d;
    }

    private static int a(BlockPos blockPos) {
        return axc_1.a(amv_2.j(blockPos) & 0xF, amv_2.h(blockPos) & 0xF, amv_2.i(blockPos) & 0xF);
    }

    private void a(int n, Set set) {
        int cfr_ignored_0 = n & 0xF;
        aS0.b(set, EnumFacing.WEST);
        int cfr_ignored_1 = n >> 8 & 0xF;
        aS0.b(set, EnumFacing.DOWN);
        int cfr_ignored_2 = n >> 4 & 0xF;
        aS0.b(set, EnumFacing.NORTH);
    }

    private int a(int n, EnumFacing enumFacing) {
        switch (aNJ.a[enumFacing.ordinal()]) {
            case 1: {
                if ((n >> 8 & 0xF) == 0) {
                    return -1;
                }
                return n - g;
            }
            case 2: {
                if ((n >> 8 & 0xF) == 15) {
                    return -1;
                }
                return n + g;
            }
            case 3: {
                if ((n >> 4 & 0xF) == 0) {
                    return -1;
                }
                return n - e;
            }
            case 4: {
                if ((n >> 4 & 0xF) == 15) {
                    return -1;
                }
                return n + e;
            }
            case 5: {
                if ((n >> 0 & 0xF) == 0) {
                    return -1;
                }
                return n - a;
            }
            case 6: {
                if ((n >> 0 & 0xF) == 15) {
                    return -1;
                }
                return n + a;
            }
        }
        return -1;
    }

    public Set b(BlockPos blockPos) {
        return this.a(axc_1.a(blockPos));
    }
}

