/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;

public class _E
extends _v_0 {
    private List<aY6> b = my_0.c();
    private aY6 e;
    private nu_1 g;
    private boolean d;
    private aMH c;
    private double f;

    private aY6 a(aym_1 aym_12) {
        aY6 aY62 = null;
        int n = Integer.MAX_VALUE;
        Iterator iterator = ListInvoker.iterator(xx_2.d(aym_12));
        while (dz_0.c(iterator)) {
            aY6 aY63 = (aY6)dz_0.b(iterator);
            int n2 = hH.a(aY63, MathHelper.floor_double(this.g.posX), MathHelper.floor_double(this.g.posY), MathHelper.floor_double(this.g.posZ));
            if (n2 >= n || this.a(aY63)) continue;
            aY62 = aY63;
            n = n2;
        }
        return aY62;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void a() {
        if (tz_1.b(aMY.a(this.g)) || aMY.a(this.g, hH.g(this.e)) < 16.0) {
            ListInvoker.add(this.b, this.e);
        }
    }

    @Override
    public boolean f() {
        if (tz_1.b(aMY.a(this.g))) {
            return false;
        }
        float f = this.g.width + 4.0f;
        return aMY.a(this.g, hH.g(this.e)) > (double)(f * f);
    }

    private boolean a(aY6 aY62) {
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            aY6 aY63 = (aY6)dz_0.b(iterator);
            if (!hH.g(aY62).equals(hH.g(aY63))) continue;
            return true;
        }
        return false;
    }

    @Override
    public void b() {
        tz_1.a(aMY.a(this.g), this.c, this.f);
    }

    public _E(nu_1 nu_12, double d, boolean bl) {
        this.g = nu_12;
        this.f = d;
        this.d = bl;
        this.a(1);
        if (!(aMY.a(nu_12) instanceof F_)) {
            throw new IllegalArgumentException(aG0.a);
        }
    }

    @Override
    public boolean g() {
        this.c();
        if (this.d && aV8.t(this.g.worldObj)) {
            return false;
        }
        EX.a(aV8.o(this.g.worldObj), new BlockPos(this.g), 0);
        return false;
    }

    private void c() {
        if (ListInvoker.size(this.b) > 15) {
            ListInvoker.remove(this.b, 0);
        }
    }
}

