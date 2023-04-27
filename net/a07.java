/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Vec3;
import java.util.Random;
import java.util.UUID;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

public class a07 {
    private static float o = (float)Math.PI * 2;
    private static int r = 12;
    private static double n;
    private static float d = 651.8986f;
    private static int l = 4095;
    public static float j = (float)Math.PI * 2;
    private static float a = 360.0f;
    private static double[] k;
    private static int[] b;
    public static boolean q;
    public static float h = (float)Math.PI / 180;
    private static float[] g;
    private static float i = 11.377778f;
    private static double[] m;
    public static float f = (float)Math.PI;
    public static float e = 1.5707964f;
    private static int p = 4096;
    private static float[] c;
    public static float s;

    public static int c(int n, int n2) {
        return (n % n2 + n2) % n2;
    }

    public static int b(int n, int n2, int n3) {
        int n4 = (n << 8) + n2;
        n4 = (n4 << 8) + n3;
        return n4;
    }

    public static int d(double d) {
        return (int)(d + 1024.0) - 1024;
    }

    public static double b(double d, int n) {
        throw new IllegalArgumentException();
    }

    public static int a(int n) {
        return a07.b(n) - (a07.d(n) ? 0 : 1);
    }

    public static long a(zl_2 zl_22) {
        return a07.a(FJ.a(zl_22), FJ.b(zl_22), FJ.c(zl_22));
    }

    public static float e(double d) {
        return q ? g[(int)((d + 1.5707963705062866) * 651.8986206054688) & 0xFFF] : c[(int)(d * 10430.3779296875 + 16384.0) & 0xFFFF];
    }

    public static int a(float f, float f2, float f3) {
        return a07.b(a07.g(f * 255.0f), a07.g(f2 * 255.0f), a07.g(f3 * 255.0f));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static double a(String string, double d, double d2) {
        return MathInvoker.d(d2, a07.a(string, d));
    }

    public static double a(Random random, double d, double d2) {
        return d >= d2 ? d : a5_0.c(random) * (d2 - d) + d;
    }

    public static int b(int n, int n2) {
        int n3 = (n & 0xFF0000) >> 16;
        int n4 = (n2 & 0xFF0000) >> 16;
        int n5 = (n & 0xFF00) >> 8;
        int n6 = (n2 & 0xFF00) >> 8;
        int n7 = n & 0xFF;
        int n8 = n2 & 0xFF;
        int n9 = (int)((float)n3 * (float)n4 / 255.0f);
        int n10 = (int)((float)n5 * (float)n6 / 255.0f);
        int n11 = (int)((float)n7 * (float)n8 / 255.0f);
        return n & 0xFF000000 | n9 << 16 | n10 << 8 | n11;
    }

    public static int a(double d) {
        int n = (int)d;
        return d < (double)n ? n - 1 : n;
    }

    public static int b(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        int n = (int)(f * 6.0f) % 6;
        float f7 = f * 6.0f - (float)n;
        float f8 = f3 * (1.0f - f2);
        float f9 = f3 * (1.0f - f7 * f2);
        float f10 = f3 * (1.0f - (1.0f - f7) * f2);
        switch (n) {
            case 0: {
                f6 = f3;
                f5 = f10;
                f4 = f8;
                break;
            }
            case 1: {
                f6 = f9;
                f5 = f3;
                f4 = f8;
                break;
            }
            case 2: {
                f6 = f8;
                f5 = f3;
                f4 = f10;
                break;
            }
            case 3: {
                f6 = f8;
                f5 = f9;
                f4 = f3;
                break;
            }
            case 4: {
                f6 = f10;
                f5 = f8;
                f4 = f3;
                break;
            }
            case 5: {
                f6 = f3;
                f5 = f8;
                f4 = f9;
                break;
            }
            default: {
                throw new RuntimeException(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), gi_0.a), f), gi_0.b), f2), gi_0.c), f3).toString());
            }
        }
        int n2 = a07.c((int)(f6 * 255.0f), 0, 255);
        int n3 = a07.c((int)(f5 * 255.0f), 0, 255);
        int n4 = a07.c((int)(f4 * 255.0f), 0, 255);
        return n2 << 16 | n3 << 8 | n4;
    }

    private static boolean d(int n) {
        return (n & n - 1) == 0;
    }

    public static int a(int n, int n2) {
        return 0;
    }

    public static long j(double d) {
        long l4 = (long)d;
        return d < (double)l4 ? l4 - 1L : l4;
    }

    public static double a(double d, double d2) {
        if (d < 0.0) {
            d = -d;
        }
        if (d2 < 0.0) {
            d2 = -d2;
        }
        return MathInvoker.d(d, d2);
    }

    public static int c(int n, int n2, int n3) {
        return n < n2 ? n2 : MathInvoker.b(n, n3);
    }

    public static float a(float f, float f2, float f3, float f4) {
        float f5 = 100.0f / f;
        float f6 = f2 * f5;
        float f7 = Math.abs(f3 - f4);
        float f8 = f7 / 100.0f;
        return f3 - f6 * f8;
    }

    public static double d(int n, int n2) {
        return anf_2.a(anf_2.c(), n, n2);
    }

    public static float k(double d) {
        return (float)MathInvoker.d(d);
    }

    public static double d(double d, double d2) {
        double d3;
        Random random = new Random();
        double d4 = d2 - d;
        double d5 = a5_0.c(random) * d4;
        if (d5 > d2) {
            d5 = d2;
        }
        if ((d3 = d5 + d) > d2) {
            d3 = d2;
        }
        return d3;
    }

    static {
        s = a07.b(2.0f);
        g = new float[4096];
        q = false;
        c = new float[65536];
        int n = 0;
        while (true) {
            a07.c[n] = (float)MathInvoker.i((double)n * Math.PI * 2.0 / 65536.0);
            ++n;
        }
    }

    public static UUID a(Random random) {
        long l4 = a5_0.b(random) & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
        long l5 = a5_0.b(random) & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l4, l5);
    }

    public static float a(float f) {
        return q ? g[(int)(f * 651.8986f) & 0xFFF] : c[(int)(f * 10430.378f) & 0xFFFF];
    }

    public static double c(double d, int n) {
        if ((d %= (double)n) >= (double)(n / 2)) {
            d -= (double)n;
        }
        if (d < (double)(-(n / 2))) {
            d += (double)n;
        }
        return d;
    }

    public static int a(String string, int n, int n2) {
        return MathInvoker.max(n2, a07.a(string, n));
    }

    public static float a(Random random, float f, float f2) {
        return f >= f2 ? f : a5_0.e(random) * (f2 - f) + f;
    }

    public static int d(float f) {
        int n = (int)f;
        return f > (float)n ? n + 1 : n;
    }

    public static int e(int n) {
        return n;
    }

    public static Vec3 a(BlockPos blockPos, EnumFacing enumFacing) {
        Vec3 vec3 = new Vec3(blockPos);
        double d = anf_2.b(anf_2.c());
        if (enumFacing == EnumFacing.NORTH) {
            vec3.xCoord += d;
        } else if (enumFacing == EnumFacing.SOUTH) {
            vec3.xCoord += d;
            vec3.zCoord += 1.0;
        } else if (enumFacing == EnumFacing.WEST) {
            vec3.zCoord += d;
        } else if (enumFacing == EnumFacing.EAST) {
            vec3.zCoord += d;
            vec3.xCoord += 1.0;
        }
        if (enumFacing == EnumFacing.UP) {
            vec3.xCoord += d;
            vec3.zCoord += d;
            vec3.yCoord += 1.0;
        } else {
            vec3.yCoord += d;
        }
        return vec3;
    }

    public static double a(String string, double d) {
        try {
            return db_0.c(string);
        }
        catch (Throwable throwable) {
            return d;
        }
    }

    public static int a(Random random, int n, int n2) {
        return n >= n2 ? n : a5_0.a(random, n2 - n + 1) + n;
    }

    public static double a(long[] lArray) {
        long l4 = 0L;
        for (long l5 : lArray) {
            l4 += l5;
        }
        return (double)l4 / (double)lArray.length;
    }

    public static double g(double d) {
        if ((d %= 360.0) >= 180.0) {
            d -= 360.0;
        }
        if (d < -180.0) {
            d += 360.0;
        }
        return d;
    }

    public static double c(double d, double d2) {
        double d3 = 1.0 / d2;
        return (double)MathInvoker.f(d * d3) / d3;
    }

    public static double a(double d, int n) {
        return a07.b(d % 1.0, n);
    }

    public static float c(float f, float f2, float f3) {
        return f < f2 ? f2 : MathInvoker.a(f, f3);
    }

    public static float c(double d) {
        return q ? g[(int)(d * 651.8986206054688) & 0xFFF] : c[(int)(d * 10430.3779296875) & 0xFFFF];
    }

    public static double c(double d, double d2, double d3) {
        return d3 < 0.0 ? d : (d3 > 1.0 ? d2 : d + (d2 - d) * d3);
    }

    public static double b(double d) {
        double d2 = 0.5 * d;
        long l4 = db_0.b(d);
        l4 = 6910469410427058090L - (l4 >> 1);
        d = db_0.a(l4);
        d *= 1.5 - d2 * d * d;
        return d;
    }

    public static long a(int n, int n2, int n3) {
        long l4 = (long)n * 3129871L ^ (long)n3 * 116129781L ^ (long)n2;
        l4 = l4 * l4 * 42317861L + l4 * 11L;
        return l4;
    }

    public static double b(double d, double d2) {
        double d3 = d2 * d2 + d * d;
        if (db_0.f(d3)) {
            return Double.NaN;
        }
        boolean bl = d < 0.0;
        d = -d;
        boolean bl2 = d2 < 0.0;
        d2 = -d2;
        boolean bl3 = d > d2;
        double d4 = d2;
        d2 = d;
        d = d4;
        d4 = a07.b(d3);
        d2 *= d4;
        double d5 = n + (d *= d4);
        int n = (int)db_0.b(d5);
        double d6 = m[n];
        double d7 = k[n];
        double d8 = d5 - a07.n;
        double d9 = d * d7 - d2 * d8;
        double d10 = (6.0 + d9 * d9) * d9 * 0.16666666666666666;
        double d11 = d6 + d10;
        d11 = 1.5707963267948966 - d11;
        d11 = Math.PI - d11;
        d11 = -d11;
        return d11;
    }

    public static int c(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    public static float c(float f) {
        return q ? g[(int)((f + 1.5707964f) * 651.8986f) & 0xFFF] : c[(int)(f * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static float e(float f) {
        if ((f %= 360.0f) >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static float a(float f, float f2) {
        return f + a5_0.e(new Random()) * (f2 - f);
    }

    private static int b(int n) {
        n = a07.d(n) ? n : a07.c(n);
        return b[(int)((long)n * 125613361L >> 27) & 0x1F];
    }

    public static double a(double d, double d2, double d3) {
        return d < d2 ? d2 : MathInvoker.a(d, d3);
    }

    public static double a(double d, double d2, boolean bl) {
        double d3 = 1.0 / d2;
        return MathInvoker.n(d * d3) / d3;
    }

    public static double b(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    public static int f(int n, int n2) {
        return -((-n - 1) / n2) - 1;
    }

    public static int e(int n, int n2) {
        return MathInvoker.a((float)n2 + (float)MathInvoker.a() * (float)(n - n2));
    }

    public static int h(double d) {
        int n = (int)d;
        return d > (double)n ? n + 1 : n;
    }

    public static float f(float f) {
        return f >= 0.0f ? f : -f;
    }

    public static int f(double d) {
        return (int)(d >= 0.0 ? d : -d + 1.0);
    }

    public static int g(float f) {
        int n = (int)f;
        return f < (float)n ? n - 1 : n;
    }

    public static boolean b(float f, float f2) {
        return a07.f(f2 - f) < 1.0E-5f;
    }

    public static double i(double d) {
        return d - MathInvoker.n(d);
    }

    public static float b(float f) {
        return (float)MathInvoker.d(f);
    }

    public static int a(String string, int n) {
        try {
            return P8.a(string);
        }
        catch (Throwable throwable) {
            return n;
        }
    }
}

