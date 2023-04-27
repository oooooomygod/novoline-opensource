/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.StatType
 */
package net;

import net.acd_1;
import tv.twitch.broadcast.StatType;

/*
 * Renamed from net.aUp
 */
class aup_0 {
    static int[] b;
    static int[] a;

    static {
        a = new int[acd_1.values().length];
        try {
            aup_0.a[acd_1.Starting.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.DoneTestingServer.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.ConnectingToServer.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.TestingServer.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.Cancelling.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.Uninitalized.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.Finished.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.Cancelled.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.a[acd_1.Failed.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = new int[StatType.values().length];
        try {
            aup_0.b[StatType.TTV_ST_RTMPSTATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aup_0.b[StatType.TTV_ST_RTMPDATASENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

