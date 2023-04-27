/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.axm_2;

/*
 * Renamed from net.lF
 */
class lf_1 {
    static int[] a = new int[axm_2.values().length];

    static {
        try {
            lf_1.a[axm_2.ANTIALIASING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.NORMAL_MAP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.SPECULAR_MAP.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.RENDER_RES_MUL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.SHADOW_RES_MUL.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.HAND_DEPTH_MUL.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.CLOUD_SHADOW.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.OLD_HAND_LIGHT.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.OLD_LIGHTING.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.SHADOW_CLIP_FRUSTRUM.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lf_1.a[axm_2.TWEAK_BLOCK_DAMAGE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

