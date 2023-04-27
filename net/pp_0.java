/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.CG;
import net.Ma;
import net.a5_0;
import net.abb_0;
import net.apt_2;
import net.ny_1;
import net.py_0;
import net.qo_2;

/*
 * Renamed from net.Pp
 */
class pp_0
extends py_0 {
    private int g;
    private float j;
    private ny_1 h;
    private boolean i;

    public pp_0(ny_1 ny_12) {
        super(ny_12);
        this.h = ny_12;
    }

    public void a(float f, boolean bl) {
        this.j = f;
        this.i = bl;
    }

    public void a(double d) {
        this.d = d;
        this.b = true;
    }

    @Override
    public void e() {
        this.a.aP = this.a.rotationYaw = this.a(this.a.rotationYaw, this.j, 30.0f);
        this.a.aD = this.a.rotationYaw;
        if (!this.b) {
            CG.b(this.a, 0.0f);
        } else {
            this.b = false;
            if (this.a.onGround) {
                CG.a(this.a, (float)(this.d * Ma.d(CG.a(this.a, abb_0.e))));
                if (this.g-- <= 0) {
                    this.g = this.h.g();
                    if (this.i) {
                        this.g /= 3;
                    }
                    qo_2.a(apt_2.d(this.h));
                    if (this.h.a()) {
                        apt_2.a(this.h, this.h.f(), this.h.f(), ((a5_0.e(apt_2.i(this.h)) - a5_0.e(apt_2.i(this.h))) * 0.2f + 1.0f) * 0.8f);
                    }
                } else {
                    this.h.moveForward = 0.0f;
                    this.h.moveStrafing = 0.0f;
                    CG.a(this.a, 0.0f);
                }
            } else {
                CG.a(this.a, (float)(this.d * Ma.d(CG.a(this.a, abb_0.e))));
            }
        }
    }
}

