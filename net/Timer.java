/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import deobf.MCInvoker;
import net.MathHelper;

public class Timer {
    public float renderPartialTicks;
    private long i;
    private long f;
    public float b;
    private double g;
    float d;
    private double h = 1.0;
    private long j;
    public int e;
    public float timerSpeed = 1.0f;

    public Timer(float f) {
        this.d = f;
        this.i = MCInvoker.a();
        this.j = SystemInvoker.nanoTime() / 1000000L;
    }

    public void a() {
        long l4 = MCInvoker.a();
        long l5 = l4 - this.i;
        long l6 = SystemInvoker.nanoTime() / 1000000L;
        double d = (double)l6 / 1000.0;
        if (l5 <= 1000L && l5 >= 0L) {
            this.f += l5;
            if (this.f > 1000L) {
                long l7 = l6 - this.j;
                double d2 = (double)this.f / (double)l7;
                this.h += (d2 - this.h) * (double)0.2f;
                this.j = l6;
                this.f = 0L;
            }
            if (this.f < 0L) {
                this.j = l6;
            }
        } else {
            this.g = d;
        }
        this.i = l4;
        double d3 = (d - this.g) * this.h;
        this.g = d;
        d3 = MathHelper.b(d3, 0.0, 1.0);
        this.b = (float)((double)this.b + d3 * (double)this.timerSpeed * (double)this.d);
        this.e = (int)this.b;
        this.b -= (float)this.e;
        if (this.e > 10) {
            this.e = 10;
        }
        this.renderPartialTicks = this.b;
    }

    public void a(float f) {
        long l4 = MCInvoker.a();
        long l5 = l4 - this.i;
        long l6 = SystemInvoker.nanoTime() / 1000000L;
        double d = (double)l6 / 1000.0;
        if (l5 <= 1000L && l5 >= 0L) {
            this.f += l5;
            if (this.f > 1000L) {
                long l7 = l6 - this.j;
                double d2 = (double)this.f / (double)l7;
                this.h += (d2 - this.h) * (double)0.2f;
                this.j = l6;
                this.f = 0L;
            }
            if (this.f < 0L) {
                this.j = l6;
            }
        } else {
            this.g = d;
        }
        this.i = l4;
        double d3 = (d - this.g) * this.h;
        this.g = d;
        d3 = MathHelper.b(d3, 0.0, 1.0);
        this.b = (float)((double)this.b + d3 * (double)f * (double)this.d);
        this.e = (int)this.b;
        this.b -= (float)this.e;
        if (this.e > 10) {
            this.e = 10;
        }
        this.renderPartialTicks = this.b;
    }
}

