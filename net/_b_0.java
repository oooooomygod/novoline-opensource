/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net._b
 */
public class _b_0
extends _v_0 {
    private double g;
    private nu_1 i;
    private double l;
    private double f;
    private Item m;
    private boolean b;
    private double c;
    private boolean h;
    private EntityPlayer d;
    private int n;
    private double k;
    private boolean j;
    private double e;

    @Override
    public void a() {
        this.d = null;
        tz_1.a(aMY.a(this.i));
        this.n = 100;
        this.j = false;
        afv_0.b((F_)aMY.a(this.i), this.h);
    }

    public boolean a() {
        return this.j;
    }

    @Override
    public void b() {
        this.e = this.d.posX;
        this.c = this.d.posY;
        this.f = this.d.posZ;
        this.j = true;
        this.h = afv_0.a((F_)aMY.a(this.i));
        afv_0.b((F_)aMY.a(this.i), false);
    }

    @Override
    public boolean g() {
        if (this.n > 0) {
            --this.n;
            return false;
        }
        this.d = aV8.a(this.i.worldObj, (Entity)this.i, 10.0);
        if (this.d == null) {
            return false;
        }
        ItemStack itemStack = a6w_0.n(this.d);
        return act_2.k(itemStack) == this.m;
    }

    @Override
    public boolean f() {
        if (this.b) {
            if (aMY.a(this.i, (Entity)this.d) < 36.0) {
                if (a6w_0.b(this.d, this.e, this.c, this.f) > 0.010000000000000002) {
                    return false;
                }
                if (MathInvoker.a((double)this.d.rotationPitch - this.k) > 5.0 || MathInvoker.a((double)this.d.rotationYaw - this.l) > 5.0) {
                    return false;
                }
            } else {
                this.e = this.d.posX;
                this.c = this.d.posY;
                this.f = this.d.posZ;
            }
            this.k = this.d.rotationPitch;
            this.l = this.d.rotationYaw;
        }
        return this.g();
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public _b_0(nu_1 nu_12, double d, Item item, boolean bl) {
        this.i = nu_12;
        this.g = d;
        this.m = item;
        this.b = bl;
        this.a(3);
        if (!(aMY.a(nu_12) instanceof F_)) {
            throw new IllegalArgumentException(amq_1.a);
        }
    }

    @Override
    public void d() {
        abs_1.a(aMY.p(this.i), this.d, 30.0f, aMY.s(this.i));
        if (aMY.a(this.i, (Entity)this.d) < 6.25) {
            tz_1.a(aMY.a(this.i));
        } else {
            tz_1.a(aMY.a(this.i), this.d, this.g);
        }
    }
}

