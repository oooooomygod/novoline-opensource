/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.N6;
import net.ResourceLocation;
import net.SoundHandler;
import net.a5_0;
import net.asc_0;
import net.atL;
import net.dz_0;
import net.my_0;
import net.qz_2;


public class ajZ
implements qz_2<atL> {
    private double f;
    private ResourceLocation e;
    private N6 d;
    private double b;
    private Random a;
    private List<qz_2<atL>> c = my_0.c();

    public ajZ(ResourceLocation resourceLocation, double d, double d2, N6 n6) {
        this.a = new Random();
        this.e = resourceLocation;
        this.b = d2;
        this.f = d;
        this.d = n6;
    }

    public N6 a() {
        return this.d;
    }

    @Override
    public ResourceLocation b() {
        return this.e;
    }

    public void a(qz_2<atL> qz_22) {
        ListInvoker.add(this.c, qz_22);
    }

    @Override
    public int a() {
        int n = 0;
        Iterator iterator = ListInvoker.iterator(this.c);
        while (dz_0.c(iterator)) {
            qz_2 qz_22 = (qz_2)dz_0.b(iterator);
            n += qz_22.a();
        }
        return n;
    }

    public atL c() {
        int n = this.a();
        if (!ListInvoker.isEmpty(this.c)) {
            int n2 = a5_0.a(this.a, n);
            Iterator iterator = ListInvoker.iterator(this.c);
            if (dz_0.c(iterator)) {
                qz_2 qz_22 = (qz_2)dz_0.b(iterator);
                n2 -= qz_22.a();
                atL atL2 = (atL)qz_22.b();
                asc_0.b(atL2, asc_0.c(atL2) * this.f);
                asc_0.a(atL2, asc_0.a(atL2) * this.b);
                return atL2;
            }
        }
        return SoundHandler.f;
    }
}

