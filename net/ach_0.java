/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumDifficulty;
import net.MathHelper;
import net.aYj;

/*
 * Renamed from net.aCh
 */
public class ach_0 {
    private float b;
    private EnumDifficulty a;

    public float b() {
        return this.b < 2.0f ? 0.0f : (this.b > 4.0f ? 1.0f : (this.b - 2.0f) / 2.0f);
    }

    public float a() {
        return this.b;
    }

    private float a(EnumDifficulty enumDifficulty, long l4, long l5, float f) {
        if (enumDifficulty == EnumDifficulty.PEACEFUL) {
            return 0.0f;
        }
        boolean bl = enumDifficulty == EnumDifficulty.HARD;
        float f2 = 0.75f;
        float f3 = MathHelper.b(((float)l4 + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        f2 += f3;
        float f4 = 0.0f;
        f4 += MathHelper.b((float)l5 / 3600000.0f, 0.0f, 1.0f) * 1.0f;
        f4 += MathHelper.b(f * 0.25f, 0.0f, f3);
        if (enumDifficulty == EnumDifficulty.EASY) {
            f4 *= 0.5f;
        }
        return (float)aYj.a(enumDifficulty) * (f2 += f4);
    }

    public ach_0(EnumDifficulty enumDifficulty, long l4, long l5, float f) {
        this.a = enumDifficulty;
        this.b = this.a(enumDifficulty, l4, l5, f);
    }
}

