/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.IntProperty;
import java.awt.Color;
import net.P8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from net.Eu
 */
public class eu_0
extends IntProperty {
    @Override
    public float[] e() {
        IntProperty.c();
        if (this.a == null) {
            return new float[]{0.0f, 0.0f, 0.0f};
        }
        float[] fArray = new float[3];
        int n = MathInvoker.max(P8.b((Integer)this.a) >>> 16 & 0xFF, P8.b((Integer)this.a) >>> 8 & 0xFF);
        if ((P8.b((Integer)this.a) & 0xFF) > n) {
            n = P8.b((Integer)this.a) & 0xFF;
        }
        int n2 = MathInvoker.b(P8.b((Integer)this.a) >>> 16 & 0xFF, P8.b((Integer)this.a) >>> 8 & 0xFF);
        if ((P8.b((Integer)this.a) & 0xFF) < n2) {
            n2 = P8.b((Integer)this.a) & 0xFF;
        }
        float f = (float)n / 255.0f;
        float f2 = n != 0 ? (float)(n - n2) / (float)n : 0.0f;
        float f3 = f2 - 0.0f;
        int cfr_ignored_1 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
        float f4 = 0.0f;
        float f5 = (float)(n - (P8.b((Integer)this.a) >>> 16 & 0xFF)) / (float)(n - n2);
        float f6 = (float)(n - (P8.b((Integer)this.a) >>> 8 & 0xFF)) / (float)(n - n2);
        float f7 = (float)(n - (P8.b((Integer)this.a) & 0xFF)) / (float)(n - n2);
        f4 = ((P8.b((Integer)this.a) >>> 16 & 0xFF) == n ? f7 - f6 : ((P8.b((Integer)this.a) >>> 8 & 0xFF) == n ? 2.0f + f5 - f7 : 4.0f + f6 - f5)) / 6.0f;
        if (f4 < 0.0f) {
            f4 += 1.0f;
        }
        fArray[0] = f4;
        fArray[1] = f2;
        fArray[2] = f;
        return fArray;
    }

    public int c() {
        IntProperty.c();
        return this.a != null ? P8.b((Integer)this.a) >>> 24 : 0;
    }

    @Override
    public void f(@Nullable Integer n) {
        IntProperty.c();
        this.a = n;
    }

    @Override
    @Nullable
    public Integer b() {
        return (Integer)this.a;
    }

    public Integer g() {
        return this.b();
    }

    @Nullable
    public Color d() {
        if (this.a == null) {
            return null;
        }
        return new Color(P8.b((Integer)this.a), true);
    }

    public int f() {
        IntProperty.c();
        return this.a != null ? P8.b((Integer)this.a) & 0xFF : 0;
    }

    @Override
    public int a() {
        IntProperty.c();
        return this.a != null ? P8.b((Integer)this.a) >>> 8 & 0xFF : 0;
    }

    public int h() {
        IntProperty.c();
        return this.a != null ? P8.b((Integer)this.a) >>> 16 & 0xFF : 0;
    }

    @NotNull
    public static eu_0 a(@Nullable Integer n) {
        return new eu_0(n);
    }

    @Override
    public void e(@Nullable Integer n) {
        this.a = n;
    }

    public void b(@Nullable Integer n) {
        this.e(n);
    }

    public eu_0(@Nullable Integer n) {
        super(n);
    }
}

