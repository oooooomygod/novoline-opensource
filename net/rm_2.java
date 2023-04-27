/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;

/*
 * Renamed from net.rm
 */
public class rm_2 {
    public double d;
    public double a;
    public double e;
    public double b;
    public double c;
    public double f;

    public double b(rm_2 rm_22, double d) {
        if (rm_22.b > this.e && rm_22.e < this.b && rm_22.d > this.f && rm_22.f < this.d) {
            double d2;
            if (d > 0.0 && rm_22.c <= this.a) {
                double d3 = this.a - rm_22.c;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && rm_22.a >= this.c && (d2 = this.c - rm_22.a) > d) {
                d = d2;
            }
        }
        return d;
    }

    public rm_2 b(double d, double d2, double d3) {
        double d4 = this.e - d;
        double d5 = this.a - d2;
        double d6 = this.f - d3;
        double d7 = this.b + d;
        double d8 = this.c + d2;
        double d9 = this.d + d3;
        return new rm_2(d4, d5, d6, d7, d8, d9);
    }

    public rm_2(BlockPos blockPos, BlockPos blockPos2) {
        this.e = amv_2.j(blockPos);
        this.a = amv_2.h(blockPos);
        this.f = amv_2.i(blockPos);
        this.b = amv_2.j(blockPos2);
        this.c = amv_2.h(blockPos2);
        this.d = amv_2.i(blockPos2);
    }

    public boolean a() {
        return db_0.f(this.e) || db_0.f(this.a) || db_0.f(this.f) || db_0.f(this.b) || db_0.f(this.c) || db_0.f(this.d);
    }

    public boolean b(Vec3 vec3) {
        return vec3.xCoord > this.e && vec3.xCoord < this.b && vec3.yCoord > this.a && vec3.yCoord < this.c && vec3.zCoord > this.f && vec3.zCoord < this.d;
    }

    public rm_2 b(rm_2 rm_22) {
        double d = MathInvoker.a(this.e, rm_22.e);
        double d2 = MathInvoker.a(this.a, rm_22.a);
        double d3 = MathInvoker.a(this.f, rm_22.f);
        double d4 = MathInvoker.d(this.b, rm_22.b);
        double d5 = MathInvoker.d(this.c, rm_22.c);
        double d6 = MathInvoker.d(this.d, rm_22.d);
        return new rm_2(d, d2, d3, d4, d5, d6);
    }

    public static rm_2 a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = MathInvoker.a(d, d4);
        double d8 = MathInvoker.a(d2, d5);
        double d9 = MathInvoker.a(d3, d6);
        double d10 = MathInvoker.d(d, d4);
        double d11 = MathInvoker.d(d2, d5);
        double d12 = MathInvoker.d(d3, d6);
        return new rm_2(d7, d8, d9, d10, d11, d12);
    }

    public rm_2 a(double d, double d2, double d3) {
        double d4 = this.e;
        double d5 = this.a;
        double d6 = this.f;
        double d7 = this.b;
        double d8 = this.c;
        double d9 = this.d;
        if (d < 0.0) {
            d4 += d;
        } else if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        return new rm_2(d4, d5, d6, d7, d8, d9);
    }

    public MovingObjectPosition a(Vec3 vec3, Vec3 vec32) {
        Vec3 vec33 = aNE.c(vec3, vec32, this.e);
        Vec3 vec34 = aNE.c(vec3, vec32, this.b);
        Vec3 vec35 = aNE.a(vec3, vec32, this.a);
        Vec3 vec36 = aNE.a(vec3, vec32, this.c);
        Vec3 vec37 = aNE.b(vec3, vec32, this.f);
        Vec3 vec38 = aNE.b(vec3, vec32, this.d);
        if (this.c(vec33)) {
            vec33 = null;
        }
        if (this.c(vec34)) {
            vec34 = null;
        }
        if (this.d(vec35)) {
            vec35 = null;
        }
        if (this.d(vec36)) {
            vec36 = null;
        }
        if (this.a(vec37)) {
            vec37 = null;
        }
        if (this.a(vec38)) {
            vec38 = null;
        }
        Vec3 vec39 = null;
        vec39 = vec33;
        if (aNE.e(vec3, vec34) < aNE.e(vec3, vec39)) {
            vec39 = vec34;
        }
        if (aNE.e(vec3, vec35) < aNE.e(vec3, vec39)) {
            vec39 = vec35;
        }
        if (aNE.e(vec3, vec36) < aNE.e(vec3, vec39)) {
            vec39 = vec36;
        }
        if (aNE.e(vec3, vec37) < aNE.e(vec3, vec39)) {
            vec39 = vec37;
        }
        if (aNE.e(vec3, vec38) < aNE.e(vec3, vec39)) {
            vec39 = vec38;
        }
        return null;
    }

    public rm_2(double d, double d2, double d3, double d4, double d5, double d6) {
        this.e = MathInvoker.a(d, d4);
        this.a = MathInvoker.a(d2, d5);
        this.f = MathInvoker.a(d3, d6);
        this.b = MathInvoker.d(d, d4);
        this.c = MathInvoker.d(d2, d5);
        this.d = MathInvoker.d(d3, d6);
    }

    public double c(rm_2 rm_22, double d) {
        if (rm_22.b > this.e && rm_22.e < this.b && rm_22.c > this.a && rm_22.a < this.c) {
            double d2;
            if (d > 0.0 && rm_22.d <= this.f) {
                double d3 = this.f - rm_22.d;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && rm_22.f >= this.d && (d2 = this.d - rm_22.f) > d) {
                d = d2;
            }
        }
        return d;
    }

    public double b() {
        double d = this.b - this.e;
        double d2 = this.c - this.a;
        double d3 = this.d - this.f;
        return (d + d2 + d3) / 3.0;
    }

    private boolean a(Vec3 vec3) {
        return !(vec3.xCoord >= this.e && vec3.xCoord <= this.b && vec3.yCoord >= this.a && vec3.yCoord <= this.c);
    }

    private boolean c(Vec3 vec3) {
        return !(vec3.yCoord >= this.a && vec3.yCoord <= this.c && vec3.zCoord >= this.f && vec3.zCoord <= this.d);
    }

    public boolean a(rm_2 rm_22) {
        return rm_22.b > this.e && rm_22.e < this.b && rm_22.c > this.a && rm_22.a < this.c && rm_22.d > this.f && rm_22.f < this.d;
    }

    public rm_2 d(double d, double d2, double d3) {
        return new rm_2(this.e + d, this.a + d2, this.f + d3, this.b + d, this.c + d2, this.d + d3);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a99.a), this.e), a99.g), this.a), a99.f), this.f), a99.e), this.b), a99.d), this.c), a99.c), this.d), a99.b).toString();
    }

    private boolean d(Vec3 vec3) {
        return !(vec3.xCoord >= this.e && vec3.xCoord <= this.b && vec3.zCoord >= this.f && vec3.zCoord <= this.d);
    }

    public rm_2 c(double d, double d2, double d3) {
        double d4 = this.e + d;
        double d5 = this.a + d2;
        double d6 = this.f + d3;
        double d7 = this.b - d;
        double d8 = this.c - d2;
        double d9 = this.d - d3;
        return new rm_2(d4, d5, d6, d7, d8, d9);
    }

    public double a(rm_2 rm_22, double d) {
        if (rm_22.c > this.a && rm_22.a < this.c && rm_22.d > this.f && rm_22.f < this.d) {
            double d2;
            if (d > 0.0 && rm_22.b <= this.e) {
                double d3 = this.e - rm_22.b;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && rm_22.e >= this.b && (d2 = this.b - rm_22.e) > d) {
                d = d2;
            }
        }
        return d;
    }
}

