/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.MCInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.BlockPos;

public class KO {
    private static aMK[] f = new aMK[]{new aMK(1.0, 0.0, 0.0), new aMK(-1.0, 0.0, 0.0), new aMK(0.0, 0.0, 1.0), new aMK(0.0, 0.0, -1.0)};
    private double c = 9.0;
    private ArrayList<aMK> d = new ArrayList();
    private aMK e;
    private boolean h = true;
    private aMK b;
    private ArrayList<anq_1> g = new ArrayList();
    private ArrayList<anq_1> a = new ArrayList();

    public static boolean a(int n, int n2, int n3, boolean bl) {
        aMK.f();
        BlockPos blockPos = new BlockPos(n, n2, n3);
        BlockPos blockPos2 = new BlockPos(n, n2 + 1, n3);
        BlockPos blockPos3 = new BlockPos(n, n2 - 1, n3);
        return !KO.a(blockPos) && !KO.a(blockPos2) && (KO.a(blockPos3) || !bl) && KO.b(blockPos3);
    }

    public anq_1 a(aMK aMK2) {
        anq_1 anq_12;
        aMK.f();
        Iterator iterator = akr_1.a(this.g);
        if (dz_0.c(iterator) && aks_0.b((anq_12 = (anq_1)dz_0.b(iterator)).f()) == aks_0.b(aMK2) && aks_0.e(anq_12.f()) == aks_0.e(aMK2) && aks_0.d(anq_12.f()) == aks_0.d(aMK2)) {
            return anq_12;
        }
        iterator = akr_1.a(this.a);
        if (dz_0.c(iterator) && aks_0.b((anq_12 = (anq_1)dz_0.b(iterator)).f()) == aks_0.b(aMK2) && aks_0.e(anq_12.f()) == aks_0.e(aMK2) && aks_0.d(anq_12.f()) == aks_0.d(aMK2)) {
            return anq_12;
        }
        return null;
    }

    private static boolean b(BlockPos blockPos) {
        aMK.f();
        return !(BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof g2_0) && !(BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof hr_0);
    }

    public static boolean a(aMK aMK2, boolean bl) {
        return KO.a((int)aks_0.b(aMK2), (int)aks_0.e(aMK2), (int)aks_0.d(aMK2), bl);
    }

    public KO(aMK aMK2, aMK aMK3) {
        this.e = aks_0.c(aks_0.a(aMK2, 0.0, 0.0, 0.0));
        this.b = aks_0.c(aks_0.a(aMK3, 0.0, 0.0, 0.0));
    }

    public void a() {
        this.a(1000, 4);
    }

    public ArrayList<aMK> b() {
        return this.d;
    }

    public void a(int n, int n2) {
        akr_1.c(this.d);
        akr_1.c(this.a);
        aMK.f();
        ArrayList arrayList = new ArrayList();
        akr_1.a(arrayList, this.e);
        akr_1.a(this.a, new anq_1(this, this.e, null, arrayList, aks_0.a(this.e, this.b), 0.0, 0.0));
        int n3 = 0;
        if (n3 < n) {
            Iterator iterator;
            asg_0.a(this.a, new aUZ(this));
            int n4 = 0;
            if (akr_1.d(this.a) == 0) {
                // empty if block
            }
            if (dz_0.c(iterator = akr_1.a(new ArrayList<anq_1>(this.a)))) {
                aMK aMK2;
                anq_1 anq_12 = (anq_1)dz_0.b(iterator);
                if (++n4 > n2) {
                    // empty if block
                }
                akr_1.b(this.a, anq_12);
                akr_1.a(this.g, anq_12);
                Object object = f;
                int n5 = ((aMK[])object).length;
                int n6 = 0;
                if (n6 < n5) {
                    aMK aMK3 = object[n6];
                    aMK aMK4 = aks_0.c(aks_0.b(anq_12.f(), aMK3));
                    if (!KO.a(aMK4, false) || this.a(anq_12, aMK4, 0.0)) {
                        // empty if block
                    }
                    ++n6;
                }
                if (!KO.a((aMK)(object = aks_0.c(aks_0.a(anq_12.f(), 0.0, 1.0, 0.0))), false) || this.a(anq_12, (aMK)object, 0.0)) {
                    // empty if block
                }
                if (!KO.a(aMK2 = aks_0.c(aks_0.a(anq_12.f(), 0.0, -1.0, 0.0)), false) || this.a(anq_12, aMK2, 0.0)) {
                    // empty if block
                }
            }
            ++n3;
        }
        if (this.h) {
            asg_0.a(this.g, new aUZ(this));
            this.d = ((anq_1)akr_1.a(this.g, 0)).e();
        }
    }

    private static boolean a(BlockPos blockPos) {
        aMK.f();
        return BlocksInvoker.s(BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos))) || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof hj_2 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof hn_2 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof ff_1 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof fs_1 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof fc_1 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof g6_0 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof gd_2 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof g2_0 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof hr_0 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof fx_2 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof gi_2 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof g8_0 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof ft_1 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof fg_2 || BlockInvoker.a(MCInvoker.f().world, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)) instanceof h4_0;
    }

    public boolean a(anq_1 anq_12, aMK aMK2, double d) {
        ArrayList<aMK> arrayList;
        anq_1 anq_13 = this.a(aMK2);
        aMK.f();
        double d2 = d;
        if (anq_12 != null) {
            d2 += anq_12.a();
        }
        if (anq_13 == null) {
            if (aks_0.b(aMK2) == aks_0.b(this.b) && aks_0.e(aMK2) == aks_0.e(this.b) && aks_0.d(aMK2) == aks_0.d(this.b) || this.c != 0.0 && aks_0.a(aMK2, this.b) <= this.c) {
                akr_1.c(this.d);
                this.d = anq_12.e();
                akr_1.a(this.d, aMK2);
                return true;
            }
            arrayList = new ArrayList<aMK>(anq_12.e());
            akr_1.a(arrayList, aMK2);
            akr_1.a(this.a, new anq_1(this, aMK2, anq_12, arrayList, aks_0.a(aMK2, this.b), d, d2));
        }
        if (anq_13.b() > d) {
            arrayList = new ArrayList<aMK>(anq_12.e());
            akr_1.a(arrayList, aMK2);
            anq_13.a(aMK2);
            anq_13.a(anq_12);
            anq_13.a(arrayList);
            anq_13.a(aks_0.a(aMK2, this.b));
            anq_13.b(d);
            anq_13.c(d2);
        }
        return false;
    }
}

