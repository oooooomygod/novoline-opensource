/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.Pd;
import net.a3t_0;
import net.aZF;

class OR {
    static int[] b;
    static int[] a;
    static int[] c;

    static {
        a = new int[aZF.values().length];
        try {
            OR.a[aZF.INVALID_TOKEN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.a[aZF.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = new int[a3t_0.values().length];
        try {
            OR.b[a3t_0.WINDOWS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.b[a3t_0.OSX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        c = new int[Pd.values().length];
        try {
            OR.c[Pd.ACCOUNT_NOT_BOUND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.c[Pd.FAILED_TWITCH_AUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.c[Pd.ACCOUNT_NOT_MIGRATED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.c[Pd.UNSUPPORTED_OS_MAC.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.c[Pd.UNKNOWN.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.c[Pd.LIBRARY_FAILURE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            OR.c[Pd.INITIALIZATION_FAILURE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

