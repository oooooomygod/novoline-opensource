/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.MCInvoker;
import deobf.NBTTagList;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.mK
 */
public class mk_1
extends mi_1 {
    private NBTTagList aC;
    private EffectRenderer aA;
    private int az;
    boolean aB;

    private void a(int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d = a5_0.f(this.Q) * 0.05;
        double d2 = a5_0.f(this.Q) * 0.05;
        int n = 0;
        while (true) {
            double d3 = this.motionX * 0.5 + a5_0.f(this.Q) * 0.15 + d;
            double d4 = this.motionZ * 0.5 + a5_0.f(this.Q) * 0.15 + d2;
            double d5 = this.motionY * 0.5 + a5_0.c(this.Q) * 0.5;
            this.a(this.posX, this.posY, this.posZ, d3, d5, d4, nArray, nArray2, bl, bl2);
            ++n;
        }
    }

    private void a(double d, double d2, double d3, double d4, double d5, double d6, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        my_1 my_12 = new my_1(this.worldObj, d, d2, d3, d4, d5, d6, this.aA);
        my_12.c(0.99f);
        anu_1.a(my_12, bl);
        anu_1.b(my_12, bl2);
        int n = a5_0.a(this.Q, nArray.length);
        anu_1.a(my_12, nArray[n]);
        if (nArray2.length > 0) {
            anu_1.b(my_12, nArray2[a5_0.a(this.Q, nArray2.length)]);
        }
        ayx_2.a(this.aA, my_12);
    }

    @Override
    public void onUpdate() {
        int n;
        if (this.az == 0 && this.aC != null) {
            n = this.a();
            boolean bl = false;
            if (kv_0.c(this.aC) >= 3) {
                bl = true;
            } else {
                for (int i = 0; i < kv_0.c(this.aC); ++i) {
                    NBTTagCompound nBTTagCompound = kv_0.g(this.aC, i);
                    if (tn_0.e(nBTTagCompound, db_1.p) != 1) continue;
                    bl = true;
                    break;
                }
            }
            String string = aL0.a(aL0.a(aL0.a(new StringBuilder(), db_1.c), db_1.o), db_1.e).toString();
            aV8.a(this.worldObj, this.posX, this.posY, this.posZ, string, 20.0f, 0.95f + a5_0.e(this.Q) * 0.1f, true);
        }
        if (this.az % 2 == 0 && this.aC != null && this.az / 2 < kv_0.c(this.aC)) {
            n = this.az / 2;
            NBTTagCompound nBTTagCompound = kv_0.g(this.aC, n);
            byte by = tn_0.e(nBTTagCompound, db_1.j);
            boolean bl = tn_0.c(nBTTagCompound, db_1.b);
            boolean bl2 = tn_0.c(nBTTagCompound, db_1.m);
            int[] nArray = tn_0.i(nBTTagCompound, db_1.h);
            int[] nArray2 = tn_0.i(nBTTagCompound, db_1.f);
            if (nArray.length == 0) {
                nArray = new int[]{lc_0.m[0]};
            }
            if (by == 1) {
                this.a(0.5, 4, nArray, nArray2, bl, bl2);
            } else if (by == 2) {
                this.a(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, nArray, nArray2, bl, bl2, false);
            } else if (by == 3) {
                this.a(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, nArray, nArray2, bl, bl2, true);
            } else if (by == 4) {
                this.a(nArray, nArray2, bl, bl2);
            } else {
                this.a(0.25, 2, nArray, nArray2, bl, bl2);
            }
            int n2 = nArray[0];
            float f = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
            float f2 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
            float f3 = (float)(n2 & 0xFF) / 255.0f;
            ms_2 ms_22 = new ms_2(this.worldObj, this.posX, this.posY, this.posZ);
            ms_22.b(f, f2, f3);
            ayx_2.a(this.aA, ms_22);
        }
        ++this.az;
        if (this.az > this.am) {
            if (this.aB) {
                n = this.a() ? 1 : 0;
                String string = aL0.a(aL0.a(new StringBuilder(), db_1.n), db_1.g).toString();
                aV8.a(this.worldObj, this.posX, this.posY, this.posZ, string, 20.0f, 0.9f + a5_0.e(this.Q) * 0.15f, true);
            }
            this.E();
        }
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public mk_1(World world, double d, double d2, double d3, double d4, double d5, double d6, EffectRenderer effectRenderer, NBTTagCompound nBTTagCompound) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionX = d4;
        this.motionY = d5;
        this.motionZ = d6;
        this.aA = effectRenderer;
        this.am = 8;
        this.aC = tn_0.c(nBTTagCompound, db_1.a, 10);
        if (kv_0.c(this.aC) == 0) {
            this.aC = null;
        } else {
            this.am = kv_0.c(this.aC) * 2 - 1;
            for (int i = 0; i < kv_0.c(this.aC); ++i) {
                NBTTagCompound nBTTagCompound2 = kv_0.g(this.aC, i);
                if (!tn_0.c(nBTTagCompound2, db_1.l)) continue;
                this.aB = true;
                this.am += 15;
                break;
            }
        }
    }

    private void a(double d, int n, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d2 = this.posX;
        double d3 = this.posY;
        double d4 = this.posZ;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    double d5 = (double)j + (a5_0.c(this.Q) - a5_0.c(this.Q)) * 0.5;
                    double d6 = (double)i + (a5_0.c(this.Q) - a5_0.c(this.Q)) * 0.5;
                    double d7 = (double)k + (a5_0.c(this.Q) - a5_0.c(this.Q)) * 0.5;
                    double d8 = (double)MathHelper.e(d5 * d5 + d6 * d6 + d7 * d7) / d + a5_0.f(this.Q) * 0.05;
                    this.a(d2, d3, d4, d5 / d8, d6 / d8, d7 / d8, nArray, nArray2, bl, bl2);
                    if (i == -n || i == n || j == -n || j == n) continue;
                    k += n * 2 - 1;
                }
            }
        }
    }

    private boolean a() {
        Minecraft minecraft = MCInvoker.f();
        return MCInvoker.v(minecraft) == null || MCInvoker.v(minecraft).d(this.posX, this.posY, this.posZ) >= 256.0;
    }

    private void a(double d, double[][] dArray, int[] nArray, int[] nArray2, boolean bl, boolean bl2, boolean bl3) {
        double d2 = dArray[0][0];
        double d3 = dArray[0][1];
        this.a(this.posX, this.posY, this.posZ, d2 * d, d3 * d, 0.0, nArray, nArray2, bl, bl2);
        float f = a5_0.e(this.Q) * (float)Math.PI;
        double d4 = 0.034;
        int n = 0;
        while (true) {
            double d5 = (double)f + (double)((float)n * (float)Math.PI) * d4;
            double d6 = d2;
            double d7 = d3;
            int n2 = 1;
            if (n2 < dArray.length) {
                double d8 = dArray[n2][0];
                double d9 = dArray[n2][1];
                double d10 = 0.25;
                double d11 = d10 - 1.0;
                int cfr_ignored_2 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                double d12 = (d6 + (d8 - d6) * d10) * d;
                double d13 = (d7 + (d9 - d7) * d10) * d;
                double d14 = d12 * (double)MathHelper.h(d5);
                d12 *= (double)MathHelper.b(d5);
                double d15 = -1.0;
                while (true) {
                    double d16;
                    int cfr_ignored_3 = (d16 = d15 - 1.0) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                    this.a(this.posX, this.posY, this.posZ, d12 * d15, d13, d14 * d15, nArray, nArray2, bl, bl2);
                    d15 += 2.0;
                }
            }
            ++n;
        }
    }
}

