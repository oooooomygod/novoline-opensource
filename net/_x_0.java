/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.Vec3;
import java.util.List;
import net.F0;
import net._v_0;
import net.aEV;
import net.aMH;
import net.aMY;
import net.aV8;
import net.an7_0;
import net.avu_1;
import net.h__0;
import net.nu_1;
import net.od_2;
import net.tz_1;

/*
 * Renamed from net._x
 */
public class _x_0<T extends Entity>
extends _v_0 {
    private Predicate<? super T> c;
    private F0 b;
    private float k;
    private Class<T> h;
    private double g;
    private Predicate<Entity> e = new aEV(this);
    private double d;
    protected nu_1 j;
    private aMH f;
    protected T i;

    @Override
    public void a() {
        this.i = null;
    }

    @Override
    public void d() {
        if (aMY.a(this.j, this.i) < 49.0) {
            tz_1.a(aMY.a(this.j), this.d);
        } else {
            tz_1.a(aMY.a(this.j), this.g);
        }
    }

    @Override
    public boolean g() {
        List list = aV8.a(this.j.worldObj, this.h, h__0.d(aMY.c(this.j), this.k, 3.0, this.k), an7_0.a(new Predicate[]{od_2.d, this.e, this.c}));
        if (ListInvoker.isEmpty(list)) {
            return false;
        }
        this.i = (Entity)ListInvoker.get(list, 0);
        avu_1.b(this.j, 16, 7, new Vec3(((Entity)this.i).posX, ((Entity)this.i).posY, ((Entity)this.i).posZ));
        return false;
    }

    public _x_0(nu_1 nu_12, Class<T> clazz, Predicate<? super T> predicate, float f, double d, double d2) {
        this.j = nu_12;
        this.h = clazz;
        this.c = predicate;
        this.k = f;
        this.g = d;
        this.d = d2;
        this.b = aMY.a(nu_12);
        this.a(1);
    }

    @Override
    public void b() {
        tz_1.a(this.b, this.f, this.g);
    }

    @Override
    public boolean f() {
        return !tz_1.b(this.b);
    }

    public _x_0(nu_1 nu_12, Class<T> clazz, float f, double d, double d2) {
        this(nu_12, clazz, an7_0.a(), f, d, d2);
    }
}

