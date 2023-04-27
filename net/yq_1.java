/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.Entity;

/*
 * Renamed from net.yQ
 */
public class yq_1
extends yl_2 {
    private static String[] H = new String[]{apu_0.b, apu_0.f, apu_0.d, apu_0.e, apu_0.c};
    private static int[] G;
    private static int[] I;
    public int J;
    private static int[] K;

    @Override
    public int d(int n) {
        return this.a(n) + G[this.J];
    }

    @Override
    public int a(int n, DamageSource damageSource) {
        if (aDJ.g(damageSource)) {
            return 0;
        }
        float f = (float)(6 + n * n) / 3.0f;
        return this.J == 0 ? MathHelper.f(f * 0.75f) : (this.J == 1 && aDJ.m(damageSource) ? MathHelper.f(f * 1.25f) : (this.J == 2 && damageSource == DamageSource.n ? MathHelper.f(f * 2.5f) : (this.J == 3 && aDJ.h(damageSource) ? MathHelper.f(f * 1.5f) : (this.J == 4 && aDJ.e(damageSource) ? MathHelper.f(f * 1.5f) : 0))));
    }

    @Override
    public boolean a(yl_2 yl_22) {
        if (yl_22 instanceof yq_1) {
            yq_1 yq_12 = (yq_1)yl_22;
            return yq_12.J != this.J && (this.J == 2 || yq_12.J == 2);
        }
        return super.a(yl_22);
    }

    public static int a(Entity entity, int n) {
        int n2 = alf_0.a(yl_2.o.c, ayj_0.w(entity));
        n -= MathHelper.f((float)n * (float)n2 * 0.15f);
        return n;
    }

    @Override
    public int a(int n) {
        return K[this.J] + (n - 1) * I[this.J];
    }

    static {
        K = new int[]{1, 10, 5, 5, 3};
        I = new int[]{11, 8, 6, 8, 6};
        G = new int[]{20, 12, 10, 12, 15};
    }

    @Override
    public int c() {
        return 4;
    }

    public static double a(Entity entity, double d) {
        int n = alf_0.a(yl_2.D.c, ayj_0.w(entity));
        d -= (double)MathHelper.floor_double(d * (double)((float)n * 0.15f));
        return d;
    }

    public yq_1(int n, ResourceLocation resourceLocation, int n2, int n3) {
        super(n, resourceLocation, n2, b_0.ARMOR);
        this.J = n3;
        if (n3 == 2) {
            this.g = b_0.ARMOR_FEET;
        }
    }

    @Override
    public String d() {
        return aL0.a(aL0.a(new StringBuilder(), apu_0.a), H[this.J]).toString();
    }
}

