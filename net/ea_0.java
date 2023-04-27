/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a5w_0;
import net.axm_2;

/*
 * Renamed from net.Ea
 */
class ea_0 {
    static int[] b = new int[a5w_0.values().length];
    static int[] a;

    static {
        try {
            ea_0.b[a5w_0.SOLID.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.b[a5w_0.CUTOUT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.b[a5w_0.CUTOUT_MIPPED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.b[a5w_0.TRANSLUCENT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = new int[axm_2.values().length];
        try {
            ea_0.a[axm_2.ANTIALIASING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.NORMAL_MAP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.SPECULAR_MAP.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.RENDER_RES_MUL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.SHADOW_RES_MUL.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.HAND_DEPTH_MUL.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.CLOUD_SHADOW.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.OLD_HAND_LIGHT.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.OLD_LIGHTING.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.SHADER_PACK.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.TWEAK_BLOCK_DAMAGE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.SHADOW_CLIP_FRUSTRUM.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.TEX_MIN_FIL_B.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.TEX_MIN_FIL_N.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.TEX_MIN_FIL_S.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.TEX_MAG_FIL_B.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.TEX_MAG_FIL_N.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ea_0.a[axm_2.TEX_MAG_FIL_S.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

