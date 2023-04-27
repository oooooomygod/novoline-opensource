/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Vec3;

public abstract class a9K {
    protected boolean c;
    public static float[] i = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    protected boolean b;
    private String e;
    private WorldType d;
    protected World g;
    private float[] j;
    protected float[] h = new float[16];
    protected ct_2 a;
    protected int f;

    public static a9K a(int n) {
        return n == -1 ? new a9T() : new a9J();
    }

    public int k() {
        return this.f;
    }

    public a9K() {
        this.j = new float[4];
    }

    public float a(long l4, float f) {
        int n = (int)(l4 % 24000L);
        float f2 = ((float)n + f) / 24000.0f - 0.25f;
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        f2 = 1.0f - (float)(((double)MathHelper.b((double)f2 * Math.PI) + 1.0) / 2.0);
        f2 += (f2 - f2) / 3.0f;
        return f2;
    }

    public int r() {
        return this.d == WorldType.e ? 4 : aV8.c(this.g) + 1;
    }

    public float[] j() {
        return this.h;
    }

    public boolean b(int n, int n2) {
        return aV8.m(this.g, new BlockPos(n, 0, n2)) == Blocks.grass;
    }

    public abstract String c();

    public boolean l() {
        return this.c;
    }

    public boolean o() {
        return this.b;
    }

    public float i() {
        return 128.0f;
    }

    public boolean g() {
        return true;
    }

    public abstract String h();

    public double n() {
        return this.d == WorldType.e ? 1.0 : 0.03125;
    }

    public boolean a() {
        return true;
    }

    public float[] a(float f, float f2) {
        float f3;
        float f4 = 0.4f;
        float f5 = MathHelper.cos(f * (float)Math.PI * 2.0f) - 0.0f;
        if (f5 >= (f3 = -0.0f) - f4 && f5 <= f3 + f4) {
            float f6 = (f5 - f3) / f4 * 0.5f + 0.5f;
            float f7 = 1.0f - (1.0f - MathHelper.sin(f6 * (float)Math.PI)) * 0.99f;
            f7 *= f7;
            this.j[0] = f6 * 0.3f + 0.7f;
            this.j[1] = f6 * f6 * 0.7f + 0.2f;
            this.j[2] = f6 * f6 * 0.0f + 0.2f;
            this.j[3] = f7;
            return this.j;
        }
        return null;
    }

    public em_1 f() {
        return this.d == WorldType.e ? new aep_1(this.g, aV8.w(this.g), uv_2.w(aV8.s(this.g)), this.e) : (this.d == WorldType.l ? new xm_2(this.g) : (this.d == WorldType.i ? new HS(this.g, aV8.w(this.g), uv_2.w(aV8.s(this.g)), this.e) : new HS(this.g, aV8.w(this.g), uv_2.w(aV8.s(this.g)), this.e)));
    }

    public ct_2 q() {
        return this.a;
    }

    public void a(World world) {
        this.g = world;
        this.d = uv_2.r(aV8.s(world));
        this.e = uv_2.n(aV8.s(world));
        this.d();
        this.e();
    }

    protected void d() {
        WorldType worldType = uv_2.r(aV8.s(this.g));
        if (worldType == WorldType.e) {
            nv_0 nv_02 = KX.a(uv_2.n(aV8.s(this.g)));
            this.a = new cd_2(hw_0.a(KX.c(nv_02), il_0.as), 0.5f);
        } else {
            this.a = worldType == WorldType.l ? new cd_2(il_0.G, 0.0f) : new ct_2(this.g);
        }
    }

    public BlockPos b() {
        return null;
    }

    public Vec3 b(float f, float f2) {
        float f3 = MathHelper.cos(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f3 = MathHelper.b(f3, 0.0f, 1.0f);
        float f4 = 0.7529412f;
        float f5 = 0.84705883f;
        float f6 = 1.0f;
        return new Vec3(f4 *= f3 * 0.94f + 0.06f, f5 *= f3 * 0.94f + 0.06f, f6 *= f3 * 0.91f + 0.09f);
    }

    public int a(long l4) {
        return (int)(l4 / 24000L % 8L + 8L) % 8;
    }

    public boolean m() {
        return true;
    }

    public boolean a(int n, int n2) {
        return false;
    }

    protected void e() {
        float f = 0.0f;
        int n = 0;
        while (true) {
            float f2 = 1.0f - (float)n / 15.0f;
            this.h[n] = (1.0f - f2) / (f2 * 3.0f + 1.0f) * (1.0f - f) + f;
            ++n;
        }
    }

    public agl_1 p() {
        return new agl_1();
    }
}

