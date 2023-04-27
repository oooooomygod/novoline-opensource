/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  javax.vecmath.Matrix4f
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 */
package net;

import cc.novoline.invoke.MapInvoker;
import com.google.common.base.Optional;
import java.util.Map;
import deobf.EnumFacing;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aLt
 */
public class alt_0
extends Enum<alt_0>
implements hs_1,
agy_0 {
    public static /* enum */ alt_0 X270_Y180;
    public static /* enum */ alt_0 X0_Y270;
    private static alt_0[] b;
    public static /* enum */ alt_0 X180_Y270;
    public static /* enum */ alt_0 X0_Y180;
    public static /* enum */ alt_0 X90_Y270;
    private int c;
    private static String e = "CL_00002393";
    public static /* enum */ alt_0 X90_Y0;
    private int h;
    private Matrix4f f;
    public static /* enum */ alt_0 X180_Y90;
    public static /* enum */ alt_0 X180_Y180;
    private static Map g;
    public static /* enum */ alt_0 X270_Y270;
    public static /* enum */ alt_0 X270_Y90;
    public static /* enum */ alt_0 X270_Y0;
    public static /* enum */ alt_0 X0_Y0;
    public static /* enum */ alt_0 X0_Y90;
    public static /* enum */ alt_0 X90_Y180;
    private static alt_0[] d;
    public static /* enum */ alt_0 X90_Y90;
    private int a;
    public static /* enum */ alt_0 X180_Y0;

    private static int b(int n, int n2) {
        return n * 360 + n2;
    }

    public Matrix4f a() {
        return this.f;
    }

    public static alt_0 valueOf(String string) {
        return (alt_0)jc_0.a(alt_0.class, string);
    }

    public int b(EnumFacing enumFacing, int n) {
        int n2 = n;
        if (SJ.h(enumFacing) == kl_1.X) {
            n2 = (n + this.h) % 4;
        }
        EnumFacing enumFacing2 = enumFacing;
        for (int i = 0; i < this.h; ++i) {
            enumFacing2 = SJ.a(enumFacing2, kl_1.X);
        }
        if (SJ.h(enumFacing2) == kl_1.Y) {
            n2 = (n2 + this.c) % 4;
        }
        return n2;
    }

    public static alt_0[] values() {
        return (alt_0[])d.clone();
    }

    public EnumFacing b(EnumFacing enumFacing) {
        int n;
        EnumFacing enumFacing2 = enumFacing;
        for (n = 0; n < this.h; ++n) {
            enumFacing2 = SJ.a(enumFacing2, kl_1.X);
        }
        if (SJ.h(enumFacing2) != kl_1.Y) {
            for (n = 0; n < this.c; ++n) {
                enumFacing2 = SJ.a(enumFacing2, kl_1.Y);
            }
        }
        return enumFacing2;
    }

    @Override
    public EnumFacing a(EnumFacing enumFacing) {
        return this.b(enumFacing);
    }

    public static alt_0 a(int n, int n2) {
        return (alt_0)MapInvoker.c(g, P8.d(alt_0.b(MathHelper.d(n, 360), MathHelper.d(n2, 360))));
    }

    @Override
    public int a(EnumFacing enumFacing, int n) {
        return this.b(enumFacing, n);
    }

    @Override
    public javax.vecmath.Matrix4f a() {
        return ayy_0.d(ail_0.az) ? (javax.vecmath.Matrix4f)aDb.f(ail_0.az, new Object[]{this}) : new javax.vecmath.Matrix4f();
    }

    @Override
    public Optional<a4s_0> a(Optional<? extends XM> optional) {
        return (Optional)aDb.f(ail_0.bG, new Object[]{this.a(), optional});
    }

    private alt_0(String string2, int n2, int n3, int n4) {
        this.a = alt_0.b(n3, n4);
        this.f = new Matrix4f();
        Matrix4f matrix4f = new Matrix4f();
        a4S.a(matrix4f);
        a4S.a((float)(-n3) * ((float)Math.PI / 180), new Vector3f(1.0f, 0.0f, 0.0f), matrix4f, matrix4f);
        this.h = MathHelper.a(n3 / 90);
        Matrix4f matrix4f2 = new Matrix4f();
        a4S.a(matrix4f2);
        a4S.a((float)(-n4) * ((float)Math.PI / 180), new Vector3f(0.0f, 1.0f, 0.0f), matrix4f2, matrix4f2);
        this.c = MathHelper.a(n4 / 90);
        a4S.a(matrix4f2, matrix4f, this.f);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "]\u0006L\u0012[C=,y*\u0011".toCharArray();
        int n2 = 0;
        int n3 = 70;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x58));
            n3 = n3;
        }
    }
}

