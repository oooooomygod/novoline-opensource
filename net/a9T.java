/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Vec3;
import net.UC;
import net.a9K;
import net.aV8;
import net.agl_1;
import net.agu_1;
import net.asq_2;
import net.cd_2;
import net.em_1;
import net.il_0;
import net.uv_2;

public class a9T
extends a9K {
    @Override
    public boolean b(int n, int n2) {
        return false;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    protected void e() {
        float f = 0.1f;
        int n = 0;
        while (true) {
            float f2 = 1.0f - (float)n / 15.0f;
            this.h[n] = (1.0f - f2) / (f2 * 3.0f + 1.0f) * (1.0f - f) + f;
            ++n;
        }
    }

    @Override
    public Vec3 b(float f, float f2) {
        return new Vec3(0.2f, 0.03f, 0.03f);
    }

    @Override
    public em_1 f() {
        return new UC(this.g, uv_2.w(aV8.s(this.g)), aV8.w(this.g));
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void d() {
        this.a = new cd_2(il_0.q, 0.0f);
        this.b = true;
        this.c = true;
        this.f = -1;
    }

    @Override
    public String c() {
        return asq_2.a;
    }

    @Override
    public float a(long l4, float f) {
        return 0.5f;
    }

    @Override
    public String h() {
        return asq_2.b;
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public agl_1 p() {
        return new agu_1(this);
    }
}

