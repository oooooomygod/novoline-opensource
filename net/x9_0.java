/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.EnumFacing;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

/*
 * Renamed from net.x9
 */
public class x9_0 {
    private static float a = 1.0f / MathHelper.b(0.3926991f) - 1.0f;
    private static float b = 1.0f / MathHelper.b(0.7853981633974483) - 1.0f;

    public int a(Vector3f vector3f, EnumFacing enumFacing, int n, alt_0 alt_02, boolean bl) {
        return this.a(vector3f, enumFacing, n, alt_02, bl);
    }

    private int b(EnumFacing enumFacing) {
        float f = this.a(enumFacing);
        int n = MathHelper.a((int)(f * 255.0f), 0, 255);
        return 0xFF000000 | n << 16 | n << 8 | n;
    }

    public int a(Vector3f vector3f, EnumFacing enumFacing, int n, agy_0 agy_02, boolean bl) {
        if (agy_02 == alt_0.X0_Y0) {
            return n;
        }
        if (ayy_0.d(ail_0.ak)) {
            aDb.f(ail_0.ak, new Object[]{vector3f, aj6.a(agy_02)});
        } else {
            this.a(vector3f, new Vector3f(0.5f, 0.5f, 0.5f), aD3.a((alt_0)agy_02), new Vector3f(1.0f, 1.0f, 1.0f));
        }
        return aj6.a(agy_02, enumFacing, n);
    }

    public a9Z a(Vector3f vector3f, Vector3f vector3f2, aL1 aL12, KM kM, EnumFacing enumFacing, alt_0 alt_02, WJ wJ, boolean bl, boolean bl2) {
        int[] nArray = this.a(aL12, kM, enumFacing, this.a(vector3f, vector3f2), alt_02, wJ, bl, bl2);
        EnumFacing enumFacing2 = x9_0.a(nArray);
        this.a(nArray, enumFacing2, aL12.a, kM);
        this.a(nArray, enumFacing2);
        return new a9Z(nArray, aL12.c, enumFacing2, kM);
    }

    private void a(int[] nArray, EnumFacing enumFacing) {
        int[] nArray2 = new int[nArray.length];
        SystemInvoker.a(nArray, 0, nArray2, 0, nArray.length);
        float[] fArray = new float[EnumFacing.values().length];
        fArray[ej_0.d] = 999.0f;
        fArray[ej_0.c] = 999.0f;
        fArray[ej_0.f] = 999.0f;
        fArray[ej_0.e] = -999.0f;
        fArray[ej_0.b] = -999.0f;
        fArray[ej_0.a] = -999.0f;
        int n = nArray.length / 4;
        int n2 = 0;
        while (true) {
            int n3 = n * n2;
            float f = axx_1.a(nArray2[n3]);
            float f2 = axx_1.a(nArray2[n3 + 1]);
            float f3 = axx_1.a(nArray2[n3 + 2]);
            if (f < fArray[ej_0.d]) {
                fArray[ej_0.d] = f;
            }
            if (f2 < fArray[ej_0.c]) {
                fArray[ej_0.c] = f2;
            }
            if (f3 < fArray[ej_0.f]) {
                fArray[ej_0.f] = f3;
            }
            if (f > fArray[ej_0.e]) {
                fArray[ej_0.e] = f;
            }
            if (f2 > fArray[ej_0.b]) {
                fArray[ej_0.b] = f2;
            }
            if (f3 > fArray[ej_0.a]) {
                fArray[ej_0.a] = f3;
            }
            ++n2;
        }
    }

    public static EnumFacing a(int[] nArray) {
        int n = nArray.length / 4;
        int n2 = n * 2;
        int cfr_ignored_1 = n * 3;
        Vector3f vector3f = new Vector3f(axx_1.a(nArray[0]), axx_1.a(nArray[1]), axx_1.a(nArray[2]));
        Vector3f vector3f2 = new Vector3f(axx_1.a(nArray[n]), axx_1.a(nArray[n + 1]), axx_1.a(nArray[n + 2]));
        Vector3f vector3f3 = new Vector3f(axx_1.a(nArray[n2]), axx_1.a(nArray[n2 + 1]), axx_1.a(nArray[n2 + 2]));
        Vector3f vector3f4 = new Vector3f();
        Vector3f vector3f5 = new Vector3f();
        Vector3f vector3f6 = new Vector3f();
        ady_2.a(vector3f, vector3f2, vector3f4);
        ady_2.a(vector3f3, vector3f2, vector3f5);
        ady_2.b(vector3f5, vector3f4, vector3f6);
        float f = (float)MathInvoker.d(vector3f6.x * vector3f6.x + vector3f6.y * vector3f6.y + vector3f6.z * vector3f6.z);
        vector3f6.x /= f;
        vector3f6.y /= f;
        vector3f6.z /= f;
        float f2 = 0.0f;
        for (EnumFacing enumFacing : EnumFacing.values()) {
            zl_2 zl_22 = SJ.g(enumFacing);
            Vector3f vector3f7 = new Vector3f((float)FJ.a(zl_22), (float)FJ.b(zl_22), (float)FJ.c(zl_22));
            float f3 = ady_2.a(vector3f6, vector3f7);
            if (!(f3 >= 0.0f) || !(f3 > f2)) continue;
            f2 = f3;
        }
        float f4 = f2 - 0.719f;
        int cfr_ignored_2 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
        return EnumFacing.UP;
    }

    private int[] a(aL1 aL12, KM kM, EnumFacing enumFacing, float[] fArray, agy_0 agy_02, WJ wJ, boolean bl, boolean bl2) {
        int n = 28;
        if (ys_2.aC()) {
            n = 56;
        }
        int[] nArray = new int[n];
        int n2 = 0;
        while (true) {
            this.a(nArray, n2, enumFacing, aL12, fArray, kM, agy_02, wJ, bl, bl2);
            ++n2;
        }
    }

    private float[] a(Vector3f vector3f, Vector3f vector3f2) {
        float[] fArray = new float[EnumFacing.values().length];
        fArray[ej_0.d] = vector3f.x / 16.0f;
        fArray[ej_0.c] = vector3f.y / 16.0f;
        fArray[ej_0.f] = vector3f.z / 16.0f;
        fArray[ej_0.e] = vector3f2.x / 16.0f;
        fArray[ej_0.b] = vector3f2.y / 16.0f;
        fArray[ej_0.a] = vector3f2.z / 16.0f;
        return fArray;
    }

    private Matrix4f a() {
        Matrix4f matrix4f = new Matrix4f();
        a4S.a(matrix4f);
        return matrix4f;
    }

    private void a(int[] nArray, int n, int n2, Vector3f vector3f, int n3, KM kM, a4M a4M2) {
        int n4 = nArray.length / 4;
        int n5 = n * n4;
        nArray[n5] = axx_1.e(vector3f.x);
        nArray[n5 + 1] = axx_1.e(vector3f.y);
        nArray[n5 + 2] = axx_1.e(vector3f.z);
        nArray[n5 + 3] = n3;
        nArray[n5 + 4] = axx_1.e(qg_2.a(kM, (double)aiq_1.b(a4M2, n2)));
        nArray[n5 + 4 + 1] = axx_1.e(qg_2.b(kM, (double)aiq_1.a(a4M2, n2)));
    }

    private float a(EnumFacing enumFacing) {
        switch (co_1.b[enumFacing.ordinal()]) {
            case 1: {
                if (ys_2.aC()) {
                    return aVE.U;
                }
                return 0.5f;
            }
            case 2: {
                return 1.0f;
            }
            case 3: 
            case 4: {
                if (ys_2.aC()) {
                    return aVE.b0;
                }
                return 0.8f;
            }
            case 5: 
            case 6: {
                if (ys_2.aC()) {
                    return aVE.l;
                }
                return 0.6f;
            }
        }
        return 1.0f;
    }

    private void a(int n, int[] nArray, EnumFacing enumFacing, a4M a4M2, KM kM) {
        int n2 = nArray.length / 4;
        int n3 = n2 * n;
        float f = axx_1.a(nArray[n3]);
        float f2 = axx_1.a(nArray[n3 + 1]);
        float f3 = axx_1.a(nArray[n3 + 2]);
        if (f < -0.1f || f >= 1.1f) {
            f -= (float)MathHelper.f(f);
        }
        if (f2 < -0.1f || f2 >= 1.1f) {
            f2 -= (float)MathHelper.f(f2);
        }
        if (f3 < -0.1f || f3 >= 1.1f) {
            f3 -= (float)MathHelper.f(f3);
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        switch (co_1.b[enumFacing.ordinal()]) {
            case 1: {
                f4 = f * 16.0f;
                f5 = (1.0f - f3) * 16.0f;
                break;
            }
            case 2: {
                f4 = f * 16.0f;
                f5 = f3 * 16.0f;
                break;
            }
            case 3: {
                f4 = (1.0f - f) * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
                break;
            }
            case 4: {
                f4 = f * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
                break;
            }
            case 5: {
                f4 = f3 * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
                break;
            }
            case 6: {
                f4 = (1.0f - f3) * 16.0f;
                f5 = (1.0f - f2) * 16.0f;
            }
        }
        int n4 = aiq_1.c(a4M2, n) * n2;
        nArray[n4 + 4] = axx_1.e(qg_2.a(kM, (double)f4));
        nArray[n4 + 4 + 1] = axx_1.e(qg_2.b(kM, (double)f5));
    }

    public a9Z a(Vector3f vector3f, Vector3f vector3f2, aL1 aL12, KM kM, EnumFacing enumFacing, agy_0 agy_02, WJ wJ, boolean bl, boolean bl2) {
        int[] nArray = this.a(aL12, kM, enumFacing, this.a(vector3f, vector3f2), agy_02, wJ, bl, bl2);
        EnumFacing enumFacing2 = x9_0.a(nArray);
        this.a(nArray, enumFacing2, aL12.a, kM);
        this.a(nArray, enumFacing2);
        if (ayy_0.d(ail_0.bi)) {
            aDb.c(ail_0.bi, new Object[]{nArray, enumFacing2});
        }
        return new a9Z(nArray, aL12.c, enumFacing2, kM);
    }

    private void a(Vector3f vector3f, WJ wJ) {
        Matrix4f matrix4f = this.a();
        Vector3f vector3f2 = new Vector3f(0.0f, 0.0f, 0.0f);
        switch (co_1.a[wJ.d.ordinal()]) {
            case 1: {
                a4S.a(wJ.a * ((float)Math.PI / 180), new Vector3f(1.0f, 0.0f, 0.0f), matrix4f, matrix4f);
                ady_2.a(vector3f2, 0.0f, 1.0f, 1.0f);
                break;
            }
            case 2: {
                a4S.a(wJ.a * ((float)Math.PI / 180), new Vector3f(0.0f, 1.0f, 0.0f), matrix4f, matrix4f);
                ady_2.a(vector3f2, 1.0f, 0.0f, 1.0f);
                break;
            }
            case 3: {
                a4S.a(wJ.a * ((float)Math.PI / 180), new Vector3f(0.0f, 0.0f, 1.0f), matrix4f, matrix4f);
                ady_2.a(vector3f2, 1.0f, 1.0f, 0.0f);
            }
        }
        if (wJ.c) {
            if (MathInvoker.b(wJ.a) == 22.5f) {
                ady_2.a(vector3f2, a);
            } else {
                ady_2.a(vector3f2, b);
            }
            ady_2.c(vector3f2, new Vector3f(1.0f, 1.0f, 1.0f), vector3f2);
        } else {
            ady_2.a(vector3f2, 1.0f, 1.0f, 1.0f);
        }
        this.a(vector3f, new Vector3f((ReadableVector3f)wJ.b), matrix4f, vector3f2);
    }

    public void a(int[] nArray, EnumFacing enumFacing, a4M a4M2, KM kM) {
        int n = 0;
        while (true) {
            this.a(n, nArray, enumFacing, a4M2, kM);
            ++n;
        }
    }

    private void a(int[] nArray, int n, EnumFacing enumFacing, aL1 aL12, float[] fArray, KM kM, agy_0 agy_02, WJ wJ, boolean bl, boolean bl2) {
        EnumFacing enumFacing2 = aj6.a(agy_02, enumFacing);
        int n2 = this.b(enumFacing2);
        av6 av62 = aHW.a(aHW.a(enumFacing), n);
        Vector3f vector3f = new Vector3f(fArray[av62.a], fArray[av62.c], fArray[av62.b]);
        this.a(vector3f, wJ);
        int n3 = this.a(vector3f, enumFacing, n, agy_02, bl);
        this.a(nArray, n3, n, vector3f, n2, kM, aL12.a);
    }

    private void a(Vector3f vector3f, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f3) {
        Vector4f vector4f = new Vector4f(vector3f.x - vector3f2.x, vector3f.y - vector3f2.y, vector3f.z - vector3f2.z, 1.0f);
        a4S.a(matrix4f, vector4f, vector4f);
        vector4f.x *= vector3f3.x;
        vector4f.y *= vector3f3.y;
        vector4f.z *= vector3f3.z;
        ady_2.a(vector3f, vector4f.x + vector3f2.x, vector4f.y + vector3f2.y, vector4f.z + vector3f2.z);
    }
}

