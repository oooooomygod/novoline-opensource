/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.block.BlockPos;
import net.FJ;
import net.MathHelper;
import net.aL0;
import net.aR1;
import net.amv_2;
import net.zl_2;

public class Vec3 {
    public double xCoord;
    public double yCoord;
    public double zCoord;

    public Vec3 c(Vec3 vec3, double d) {
        double d2 = vec3.xCoord - this.xCoord;
        double d3 = vec3.yCoord - this.yCoord;
        double d4 = vec3.zCoord - this.zCoord;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.zCoord) / d4;
        return d5 >= 0.0 && d5 <= 1.0 ? new Vec3(this.xCoord + d2 * d5, this.yCoord + d3 * d5, this.zCoord + d4 * d5) : null;
    }

    public double a(Vec3 vec3) {
        return this.xCoord * vec3.xCoord + this.yCoord * vec3.yCoord + this.zCoord * vec3.zCoord;
    }

    public double a() {
        return this.yCoord;
    }

    public Vec3 a(Vec3 vec3, double d) {
        double d2 = vec3.xCoord - this.xCoord;
        double d3 = vec3.yCoord - this.yCoord;
        double d4 = vec3.zCoord - this.zCoord;
        if (d2 * d2 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.xCoord) / d2;
        return d5 >= 0.0 && d5 <= 1.0 ? new Vec3(this.xCoord + d2 * d5, this.yCoord + d3 * d5, this.zCoord + d4 * d5) : null;
    }

    public Vec3 b(double d, double d2, double d3) {
        return this.a(-d, -d2, -d3);
    }

    public double b(Vec3 vec3) {
        double d = vec3.xCoord - this.xCoord;
        double d2 = vec3.yCoord - this.yCoord;
        double d3 = vec3.zCoord - this.zCoord;
        return d * d + d2 * d2 + d3 * d3;
    }

    public Vec3 b(float f) {
        float f2 = MathHelper.cos(f);
        float f3 = MathHelper.sin(f);
        double d = this.xCoord * (double)f2 + this.zCoord * (double)f3;
        double d2 = this.yCoord;
        double d3 = this.zCoord * (double)f2 - this.xCoord * (double)f3;
        return new Vec3(d, d2, d3);
    }

    public double c(Vec3 vec3) {
        double d = vec3.xCoord - this.xCoord;
        double d2 = vec3.yCoord - this.yCoord;
        double d3 = vec3.zCoord - this.zCoord;
        return MathHelper.e(d * d + d2 * d2 + d3 * d3);
    }

    public Vec3 f(Vec3 vec3) {
        return this.a(vec3.xCoord, vec3.yCoord, vec3.zCoord);
    }

    public double d() {
        return this.xCoord;
    }

    public Vec3 d(Vec3 vec3) {
        return new Vec3(this.yCoord * vec3.zCoord - this.zCoord * vec3.yCoord, this.zCoord * vec3.xCoord - this.xCoord * vec3.zCoord, this.xCoord * vec3.yCoord - this.yCoord * vec3.xCoord);
    }

    public Vec3 g(Vec3 vec3) {
        return new Vec3(vec3.xCoord - this.xCoord, vec3.yCoord - this.yCoord, vec3.zCoord - this.zCoord);
    }

    public Vec3(BlockPos blockPos) {
        double d = amv_2.j(blockPos);
        double d2 = amv_2.h(blockPos);
        double d3 = amv_2.i(blockPos);
        if (d == -0.0) {
            d = 0.0;
        }
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        this.xCoord = d;
        this.yCoord = d2;
        this.zCoord = d3;
    }

    public double e() {
        return MathHelper.e(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
    }

    public Vec3 a(double d, double d2, double d3) {
        return new Vec3(this.xCoord + d, this.yCoord + d2, this.zCoord + d3);
    }

    public Vec3(zl_2 zl_22) {
        this(FJ.a(zl_22), FJ.b(zl_22), FJ.c(zl_22));
    }

    public Vec3 a(float f) {
        float f2 = MathHelper.cos(f);
        float f3 = MathHelper.sin(f);
        double d = this.xCoord;
        double d2 = this.yCoord * (double)f2 + this.zCoord * (double)f3;
        double d3 = this.zCoord * (double)f2 - this.yCoord * (double)f3;
        return new Vec3(d, d2, d3);
    }

    public Vec3(double d, double d2, double d3) {
        if (d == -0.0) {
            d = 0.0;
        }
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        this.xCoord = d;
        this.yCoord = d2;
        this.zCoord = d3;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aR1.a), this.xCoord), aR1.d), this.yCoord), aR1.c), this.zCoord), aR1.b).toString();
    }

    public double b() {
        return this.zCoord;
    }

    public Vec3 c() {
        double d = MathHelper.e(this.xCoord * this.xCoord + this.yCoord * this.yCoord + this.zCoord * this.zCoord);
        return d < 1.0E-4 ? new Vec3(0.0, 0.0, 0.0) : new Vec3(this.xCoord / d, this.yCoord / d, this.zCoord / d);
    }

    public Vec3 b(Vec3 vec3, double d) {
        double d2 = vec3.xCoord - this.xCoord;
        double d3 = vec3.yCoord - this.yCoord;
        double d4 = vec3.zCoord - this.zCoord;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.yCoord) / d3;
        return d5 >= 0.0 && d5 <= 1.0 ? new Vec3(this.xCoord + d2 * d5, this.yCoord + d3 * d5, this.zCoord + d4 * d5) : null;
    }

    public Vec3 e(Vec3 vec3) {
        return this.b(vec3.xCoord, vec3.yCoord, vec3.zCoord);
    }
}

