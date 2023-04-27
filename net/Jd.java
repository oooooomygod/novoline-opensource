/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.typesafe.config.ConfigValueType
 */
package net;

import com.typesafe.config.ConfigValueType;

class Jd {
    static int[] a = new int[ConfigValueType.values().length];

    static {
        try {
            Jd.a[ConfigValueType.OBJECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Jd.a[ConfigValueType.LIST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Jd.a[ConfigValueType.NULL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

