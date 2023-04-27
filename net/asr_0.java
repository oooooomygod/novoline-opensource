/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Vec3;
import net.aP2;
import net.ys_2;

/*
 * Renamed from net.aSr
 */
public class asr_0 {
    private Vec3 a = null;
    private long b = SystemInvoker.f();

    public Vec3 a(double d, double d2, double d3) {
        aP2.b();
        if (this.a == null) {
            this.a = new Vec3(d, d2, d3);
            return this.a;
        }
        long l4 = SystemInvoker.f();
        long l5 = l4 - this.b;
        if (l5 == 0L) {
            return this.a;
        }
        this.b = l4;
        if (MathInvoker.a(d - this.a.xCoord) < 0.004 && MathInvoker.a(d2 - this.a.yCoord) < 0.004 && MathInvoker.a(d3 - this.a.zCoord) < 0.004) {
            return this.a;
        }
        double d4 = (double)l5 * 0.001;
        d4 = ys_2.a(d4, 0.0, 1.0);
        double d5 = d - this.a.xCoord;
        double d6 = d2 - this.a.yCoord;
        double d7 = d3 - this.a.zCoord;
        double d8 = this.a.xCoord + d5 * d4;
        double d9 = this.a.yCoord + d6 * d4;
        double d10 = this.a.zCoord + d7 * d4;
        this.a = new Vec3(d8, d9, d10);
        return this.a;
    }
}

