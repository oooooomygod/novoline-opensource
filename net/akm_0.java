/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.aKX;
import net.ys_1;

/*
 * Renamed from net.aKm
 */
public class akm_0
extends aKX {
    public static akm_0 a(ResourceLocation resourceLocation, float f, float f2, float f3) {
        return new akm_0(resourceLocation, 4.0f, 1.0f, false, 0, ys_1.LINEAR, f, f2, f3);
    }

    private akm_0(ResourceLocation resourceLocation, float f, float f2, boolean bl, int n, ys_1 ys_12, float f3, float f4, float f5) {
        super(resourceLocation);
        this.g = f;
        this.b = f2;
        this.d = f3;
        this.h = f4;
        this.i = f5;
        this.e = bl;
        this.c = n;
        this.a = ys_12;
    }

    public static akm_0 a(ResourceLocation resourceLocation, float f) {
        return new akm_0(resourceLocation, 0.25f, f, false, 0, ys_1.NONE, 0.0f, 0.0f, 0.0f);
    }

    public static akm_0 a(ResourceLocation resourceLocation) {
        return new akm_0(resourceLocation, 1.0f, 1.0f, false, 0, ys_1.NONE, 0.0f, 0.0f, 0.0f);
    }

    public akm_0(ResourceLocation resourceLocation, float f, float f2, float f3, float f4, float f5) {
        this(resourceLocation, f, f2, false, 0, ys_1.LINEAR, f3, f4, f5);
    }
}

