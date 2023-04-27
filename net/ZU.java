/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import deobf.EnumFacing;


public class ZU
extends zg_0 {
    private ajM q;
    private ajM o;
    private List<zg_0> p = my_0.c();

    public ZU() {
    }

    private void d(World world, Random random, HF hF) {
        if (this.a(hF, 21, 21, 36, 36)) {
            this.a(world, hF, 21, 0, 22, 36, 0, 36, e, e, false);
            this.a(world, hF, 21, 1, 22, 36, 23, 36, false);
            int n = 0;
            while (true) {
                this.a(world, hF, 21 + n, 13 + n, 21 + n, 36 - n, 13 + n, 21 + n, i, i, false);
                this.a(world, hF, 21 + n, 13 + n, 36 - n, 36 - n, 13 + n, 36 - n, i, i, false);
                this.a(world, hF, 21 + n, 13 + n, 22 + n, 21 + n, 13 + n, 35 - n, i, i, false);
                this.a(world, hF, 36 - n, 13 + n, 22 + n, 36 - n, 13 + n, 35 - n, i, i, false);
                ++n;
            }
        }
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        int n = MathInvoker.max(aV8.c(world), 64) - this.b.c;
        this.a(world, hF, 0, 0, 0, 58, n, 58, false);
        this.a(false, 0, world, random, hF);
        this.a(true, 33, world, random, hF);
        this.a(world, random, hF);
        this.b(world, random, hF);
        this.d(world, random, hF);
        this.e(world, random, hF);
        this.f(world, random, hF);
        this.c(world, random, hF);
        int n2 = 0;
        int n3 = 0;
        int n4 = n2 * 9;
        int n5 = n3 * 9;
        int n6 = 0;
        int n7 = 0;
        while (true) {
            this.b(world, i, n4 + n6, 0, n5 + n7, hF);
            this.a(world, i, n4 + n6, -1, n5 + n7, hF);
            ++n7;
        }
    }

    public ZU(Random random, int n, int n2, EnumFacing enumFacing) {
        super(0);
        Object object;
        Object object2;
        this.c = enumFacing;
        switch (anr_2.a[this.c.ordinal()]) {
            case 1: 
            case 2: {
                this.b = new HF(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1);
                break;
            }
            default: {
                this.b = new HF(n, 39, n2, n + 58 - 1, 61, n2 + 58 - 1);
            }
        }
        List<ajM> list = this.a(random);
        this.q.b = true;
        ListInvoker.add(this.p, new ZL(this.c, this.q));
        ListInvoker.add(this.p, new Z4(this.c, this.o, random));
        ArrayList arrayList = my_0.c();
        ListInvoker.add(arrayList, new G_(null));
        ListInvoker.add(arrayList, new aOL(null));
        ListInvoker.add(arrayList, new axi_0(null));
        ListInvoker.add(arrayList, new l7_0(null));
        ListInvoker.add(arrayList, new aI6(null));
        ListInvoker.add(arrayList, new ajL(null));
        ListInvoker.add(arrayList, new awi_1(null));
        Iterator iterator = ListInvoker.iterator(list);
        block3: while (dz_0.c(iterator)) {
            ajM ajM2 = (ajM)dz_0.b(iterator);
            if (ajM2.b || ajM2.c()) continue;
            Iterator iterator2 = ListInvoker.iterator(arrayList);
            while (dz_0.c(iterator2)) {
                object2 = (ahb_1)dz_0.b(iterator2);
                if (!object2.a(ajM2)) continue;
                ListInvoker.add(this.p, object2.a(this.c, ajM2, random));
                continue block3;
            }
        }
        int n3 = this.b.c;
        int n4 = this.b(9, 22);
        int n5 = this.a(9, 22);
        object2 = ListInvoker.iterator(this.p);
        while (dz_0.c((Iterator)object2)) {
            object = (zg_0)dz_0.b((Iterator)object2);
            aqu_2.a(((Y_)object).d(), n4, n3, n5);
        }
        object2 = aqu_2.a(this.b(1, 1), this.a(1), this.a(1, 1), this.b(23, 21), this.a(8), this.a(23, 21));
        object = aqu_2.a(this.b(34, 1), this.a(1), this.a(34, 1), this.b(56, 21), this.a(8), this.a(56, 21));
        HF hF = aqu_2.a(this.b(22, 22), this.a(13), this.a(22, 22), this.b(35, 35), this.a(17), this.a(35, 35));
        int n6 = a5_0.d(random);
        ListInvoker.add(this.p, new ZR(this.c, (HF)object2, n6++));
        ListInvoker.add(this.p, new ZR(this.c, (HF)object, n6++));
        ListInvoker.add(this.p, new Z5(this.c, hF));
    }

    private void a(World world, Random random, HF hF) {
        if (this.a(hF, 22, 5, 35, 17)) {
            this.a(world, hF, 25, 0, 0, 32, 8, 20, false);
            int n = 0;
            while (true) {
                this.a(world, hF, 24, 2, 5 + n * 4, 24, 4, 5 + n * 4, i, i, false);
                this.a(world, hF, 22, 4, 5 + n * 4, 23, 4, 5 + n * 4, i, i, false);
                this.b(world, i, 25, 5, 5 + n * 4, hF);
                this.b(world, i, 26, 6, 5 + n * 4, hF);
                this.b(world, l, 26, 5, 5 + n * 4, hF);
                this.a(world, hF, 33, 2, 5 + n * 4, 33, 4, 5 + n * 4, i, i, false);
                this.a(world, hF, 34, 4, 5 + n * 4, 35, 4, 5 + n * 4, i, i, false);
                this.b(world, i, 32, 5, 5 + n * 4, hF);
                this.b(world, i, 31, 6, 5 + n * 4, hF);
                this.b(world, l, 31, 5, 5 + n * 4, hF);
                this.a(world, hF, 27, 6, 5 + n * 4, 30, 6, 5 + n * 4, e, e, false);
                ++n;
            }
        }
    }

    private void a(boolean bl, int n, World world, Random random, HF hF) {
        if (this.a(hF, n, 0, n + 23, 20)) {
            this.a(world, hF, n, 0, 0, n + 24, 0, 20, e, e, false);
            this.a(world, hF, n, 1, 0, n + 24, 10, 20, false);
            int n2 = 0;
            while (true) {
                this.a(world, hF, n + n2, n2 + 1, n2, n + n2, n2 + 1, 20, i, i, false);
                this.a(world, hF, n + n2 + 7, n2 + 5, n2 + 7, n + n2 + 7, n2 + 5, 20, i, i, false);
                this.a(world, hF, n + 17 - n2, n2 + 5, n2 + 7, n + 17 - n2, n2 + 5, 20, i, i, false);
                this.a(world, hF, n + 24 - n2, n2 + 1, n2, n + 24 - n2, n2 + 1, 20, i, i, false);
                this.a(world, hF, n + n2 + 1, n2 + 1, n2, n + 23 - n2, n2 + 1, n2, i, i, false);
                this.a(world, hF, n + n2 + 8, n2 + 5, n2 + 7, n + 16 - n2, n2 + 5, n2 + 7, i, i, false);
                ++n2;
            }
        }
    }

    private List<ajM> a(Random random) {
        ajM[] ajMArray = new ajM[75];
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3 = 0;
            int n4 = ZU.a(n, n3, n2);
            ajMArray[n4] = new ajM(n4);
            ++n2;
        }
    }

    private void e(World world, Random random, HF hF) {
        if (this.a(hF, 0, 21, 6, 58)) {
            this.a(world, hF, 0, 0, 21, 6, 0, 57, e, e, false);
            this.a(world, hF, 0, 1, 21, 6, 7, 57, false);
            this.a(world, hF, 4, 4, 21, 6, 4, 53, e, e, false);
            int n = 0;
            while (true) {
                this.a(world, hF, n, n + 1, 21, n, n + 1, 57 - n, i, i, false);
                ++n;
            }
        }
        if (this.a(hF, 51, 21, 58, 58)) {
            this.a(world, hF, 51, 0, 21, 57, 0, 57, e, e, false);
            this.a(world, hF, 51, 1, 21, 57, 7, 57, false);
            this.a(world, hF, 51, 4, 21, 53, 4, 53, e, e, false);
            int n = 0;
            while (true) {
                this.a(world, hF, 57 - n, n + 1, 21, 57 - n, n + 1, 57 - n, i, i, false);
                ++n;
            }
        }
        if (this.a(hF, 0, 51, 57, 57)) {
            this.a(world, hF, 7, 0, 51, 50, 0, 57, e, e, false);
            this.a(world, hF, 7, 1, 51, 50, 10, 57, false);
            int n = 0;
            while (true) {
                this.a(world, hF, n + 1, n + 1, 57 - n, 56 - n, n + 1, 57 - n, i, i, false);
                ++n;
            }
        }
    }

    private void b(World world, Random random, HF hF) {
        if (this.a(hF, 15, 20, 42, 21)) {
            this.a(world, hF, 15, 0, 21, 42, 0, 21, e, e, false);
            this.a(world, hF, 26, 1, 21, 31, 3, 21, false);
            this.a(world, hF, 21, 12, 21, 36, 12, 21, e, e, false);
            this.a(world, hF, 17, 11, 21, 40, 11, 21, e, e, false);
            this.a(world, hF, 16, 10, 21, 41, 10, 21, e, e, false);
            this.a(world, hF, 15, 7, 21, 42, 9, 21, e, e, false);
            this.a(world, hF, 16, 6, 21, 41, 6, 21, e, e, false);
            this.a(world, hF, 17, 5, 21, 40, 5, 21, e, e, false);
            this.a(world, hF, 21, 4, 21, 36, 4, 21, e, e, false);
            this.a(world, hF, 22, 3, 21, 26, 3, 21, e, e, false);
            this.a(world, hF, 31, 3, 21, 35, 3, 21, e, e, false);
            this.a(world, hF, 23, 2, 21, 25, 2, 21, e, e, false);
            this.a(world, hF, 32, 2, 21, 34, 2, 21, e, e, false);
            this.a(world, hF, 28, 4, 20, 29, 4, 21, i, i, false);
            this.b(world, i, 27, 3, 21, hF);
            this.b(world, i, 30, 3, 21, hF);
            this.b(world, i, 26, 2, 21, hF);
            this.b(world, i, 31, 2, 21, hF);
            this.b(world, i, 25, 1, 21, hF);
            this.b(world, i, 32, 1, 21, hF);
            int n = 0;
            while (true) {
                this.b(world, h, 28 - n, 6 + n, 21, hF);
                this.b(world, h, 29 + n, 6 + n, 21, hF);
                ++n;
            }
        }
    }

    private void f(World world, Random random, HF hF) {
        if (this.a(hF, 7, 21, 13, 50)) {
            this.a(world, hF, 7, 0, 21, 13, 0, 50, e, e, false);
            this.a(world, hF, 7, 1, 21, 13, 10, 50, false);
            this.a(world, hF, 11, 8, 21, 13, 8, 53, e, e, false);
            int n = 0;
            while (true) {
                this.a(world, hF, n + 7, n + 5, 21, n + 7, n + 5, 54, i, i, false);
                ++n;
            }
        }
        if (this.a(hF, 44, 21, 50, 54)) {
            this.a(world, hF, 44, 0, 21, 50, 0, 50, e, e, false);
            this.a(world, hF, 44, 1, 21, 50, 10, 50, false);
            this.a(world, hF, 44, 8, 21, 46, 8, 53, e, e, false);
            int n = 0;
            while (true) {
                this.a(world, hF, 50 - n, n + 5, 21, 50 - n, n + 5, 54, i, i, false);
                ++n;
            }
        }
        if (this.a(hF, 8, 44, 49, 54)) {
            this.a(world, hF, 14, 0, 44, 43, 0, 50, e, e, false);
            this.a(world, hF, 14, 1, 44, 43, 10, 50, false);
            int n = 12;
            while (true) {
                this.b(world, d, n, 9, 45, hF);
                this.b(world, d, n, 9, 52, hF);
                this.b(world, d, n, 9, 47, hF);
                this.b(world, d, n, 9, 50, hF);
                this.b(world, d, n, 10, 45, hF);
                this.b(world, d, n, 10, 46, hF);
                this.b(world, d, n, 10, 51, hF);
                this.b(world, d, n, 10, 52, hF);
                this.b(world, d, n, 11, 47, hF);
                this.b(world, d, n, 11, 50, hF);
                this.b(world, d, n, 12, 48, hF);
                this.b(world, d, n, 12, 49, hF);
                n += 3;
            }
        }
    }

    private void c(World world, Random random, HF hF) {
        if (this.a(hF, 14, 21, 20, 43)) {
            this.a(world, hF, 14, 0, 21, 20, 0, 43, e, e, false);
            this.a(world, hF, 14, 1, 22, 20, 14, 43, false);
            this.a(world, hF, 18, 12, 22, 20, 12, 39, e, e, false);
            this.a(world, hF, 18, 12, 21, 20, 12, 21, i, i, false);
            int n = 0;
            while (true) {
                this.a(world, hF, n + 14, n + 9, 21, n + 14, n + 9, 43 - n, i, i, false);
                ++n;
            }
        }
        if (this.a(hF, 37, 21, 43, 43)) {
            this.a(world, hF, 37, 0, 21, 43, 0, 43, e, e, false);
            this.a(world, hF, 37, 1, 22, 43, 14, 43, false);
            this.a(world, hF, 37, 12, 22, 39, 12, 39, e, e, false);
            this.a(world, hF, 37, 12, 21, 39, 12, 21, i, i, false);
            int n = 0;
            while (true) {
                this.a(world, hF, 43 - n, n + 9, 21, 43 - n, n + 9, 43 - n, i, i, false);
                ++n;
            }
        }
        if (this.a(hF, 15, 37, 42, 43)) {
            this.a(world, hF, 21, 0, 37, 36, 0, 43, e, e, false);
            this.a(world, hF, 21, 1, 37, 36, 14, 43, false);
            this.a(world, hF, 21, 12, 37, 36, 12, 39, e, e, false);
            int n = 0;
            while (true) {
                this.a(world, hF, 15 + n, n + 9, 43 - n, 42 - n, n + 9, 43 - n, i, i, false);
                ++n;
            }
        }
    }
}

