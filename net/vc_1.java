/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.go_0;

/*
 * Renamed from net.vC
 */
class vc_1 {
    static int[] a = new int[go_0.values().length];

    static {
        try {
            vc_1.a[go_0.THIRD_PERSON.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vc_1.a[go_0.FIRST_PERSON.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vc_1.a[go_0.HEAD.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vc_1.a[go_0.GUI.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vc_1.a[go_0.GROUND.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            vc_1.a[go_0.FIXED.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

