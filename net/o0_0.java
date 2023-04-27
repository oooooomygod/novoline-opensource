/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MouseInvoker;
import java.awt.Color;
import java.util.Iterator;
import net.IZ;
import net.MathHelper;
import net.UhcCrafts;
import net.aV3;
import net.alu_0;
import net.dz_0;

/*
 * Renamed from net.o0
 */
public class o0_0 {
    private boolean d;
    UhcCrafts g;
    private float b;
    private float f;
    private float i;
    private float a;
    private UhcCrafts h;
    private float e;
    private float j;
    private float c;

    public float c() {
        return this.f;
    }

    public void a(boolean bl) {
        UhcCrafts.d();
        int n = MouseInvoker.m();
        if (bl && n != 0) {
            if (n < 0) {
                this.j += 10.0f;
            }
            this.j -= 10.0f;
        }
    }

    public float a() {
        return this.i;
    }

    public void a(int n, int n2, int n3, float f) {
        UhcCrafts.d();
        if (this.a(n, n2, f) && n3 == 0 && this.d() > f) {
            this.d = true;
            this.c = n2;
        }
    }

    public void a(float f, float f2) {
        this.a = f;
        this.e = f2;
    }

    public o0_0(UhcCrafts uhcCrafts, UhcCrafts uhcCrafts2) {
        this.g = uhcCrafts;
        this.h = uhcCrafts2;
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return this.a;
    }

    public void g() {
        this.j = 0.0f;
        this.i = 0.0f;
        this.f = 0.0f;
    }

    public float d() {
        UhcCrafts.d();
        float f = 3.5f;
        Iterator iterator = ListInvoker.iterator(alu_0.a(this.h));
        if (dz_0.c(iterator)) {
            IZ cfr_ignored_0 = (IZ)dz_0.b(iterator);
            f += 22.0f + 4.0f;
        }
        return f - 8.0f;
    }

    public void b() {
        this.d = false;
    }

    public boolean a(int n, int n2, float f) {
        UhcCrafts.d();
        return (float)n > this.f() && (float)n < this.f() + 5.0f && (float)n2 > this.e() && (float)n2 < this.e() + f;
    }

    public void a(int n, int n2, float f, double[] dArray) {
        UhcCrafts.d();
        if (this.d() < f) {
            this.f = 0.0f;
            this.i = 0.0f;
            return;
        }
        float f2 = this.d();
        float f3 = f / f2 * f;
        float f4 = f - f3;
        float f5 = f2 - f;
        float f6 = f5 / f4;
        this.f += (this.i - this.f) * 0.1f;
        this.i = this.j * f6;
        if (this.a(n, n2, f) || this.d) {
            this.b += (1.0f - this.b) * 0.02f;
        }
        this.b -= this.b * 0.02f;
        this.j = MathHelper.b(this.j, 0.0f, f - f3);
        if (this.d && (float)n2 - this.c != 0.0f) {
            this.j += (float)n2 - this.c;
            this.j = MathHelper.b(this.j, 0.0f, f - f3);
            this.c = n2;
        }
        aV3.a(aV3.a(), (double)this.f(), (double)this.e(), 5.0, (double)f, 5.0, 2.0, new Color(20, 20, 20), dArray, false);
        aV3.a(aV3.a(), (double)this.f(), (double)(this.e() + this.j), 5.0, (double)f3, 5.0, 2.0, new Color(40, 40, 40), dArray, false);
    }
}

