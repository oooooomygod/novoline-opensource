/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import deobf.MCInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Un
 */
public class un_0 {
    private double c;
    private float d;
    private float a;
    private double b;
    private double e;

    public un_0 a(double d) {
        this.e = d;
        return this;
    }

    public un_0 a(float f) {
        this.a = f;
        return this;
    }

    public static un_0 a(BlockPos blockPos) {
        return new un_0(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos));
    }

    public un_0(int n, int n2, int n3) {
        this.b = n;
        this.c = n2;
        this.e = n3;
        this.a = 0.0f;
        this.d = 0.0f;
    }

    public un_0(BlockPos blockPos) {
        this.b = amv_2.j(blockPos);
        this.c = amv_2.h(blockPos);
        this.e = amv_2.i(blockPos);
        this.a = 0.0f;
        this.d = 0.0f;
    }

    public double c() {
        return this.e;
    }

    public double b(un_0 un_02) {
        double d = un_02.b - this.b;
        double d2 = un_02.e - this.e;
        double d3 = un_02.c - this.c;
        return MathInvoker.d(d * d + d3 * d3 + d2 * d2);
    }

    public un_0 b(double d) {
        this.c = d;
        return this;
    }

    public double b() {
        return this.b;
    }

    public double g() {
        return this.c;
    }

    public double a(un_0 un_02) {
        double d = un_02.c - this.c;
        return MathInvoker.d(d * d);
    }

    public un_0(double d, double d2, double d3) {
        this.b = d;
        this.c = d2;
        this.e = d3;
        this.a = 0.0f;
        this.d = 0.0f;
    }

    public BlockPos e() {
        return new BlockPos(this.b(), this.g(), this.c());
    }

    public un_0 a(double d, double d2, double d3) {
        this.b -= d;
        this.c -= d2;
        this.e -= d3;
        return this;
    }

    public un_0 b(double d, double d2, double d3) {
        this.b += d;
        this.c += d2;
        this.e += d3;
        return this;
    }

    public float d() {
        return this.d;
    }

    public un_0(double d, double d2, double d3, float f, float f2) {
        this.b = d;
        this.c = d2;
        this.e = d3;
        this.a = f;
        this.d = f2;
    }

    public un_0 a(int n, int n2, int n3) {
        this.b -= (double)n;
        this.c -= (double)n2;
        this.e -= (double)n3;
        return this;
    }

    public un_0 b(int n, int n2, int n3) {
        this.b += (double)n;
        this.c += (double)n2;
        this.e += (double)n3;
        return this;
    }

    public un_0(EntityLivingBase entityLivingBase) {
        this.b = entityLivingBase.posX;
        this.c = entityLivingBase.posY;
        this.e = entityLivingBase.posZ;
        this.a = 0.0f;
        this.d = 0.0f;
    }

    public Block a() {
        return BlockInvoker.getMaterial(MCInvoker.f().world, this.e()).b();
    }

    public float f() {
        return this.a;
    }

    public un_0 c(double d) {
        this.b = d;
        return this;
    }

    public un_0 b(float f) {
        this.d = f;
        return this;
    }
}

