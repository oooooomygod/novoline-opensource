/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aj9;

class aUG {
    static int[] a = new int[aj9.values().length];

    static {
        try {
            aUG.a[aj9.Authenticated.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.LoggedIn.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.ReceivedIngestServers.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.Starting.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.Stopping.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.FindingIngestServer.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.Authenticating.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.Initialized.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.Uninitialized.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.IngestTesting.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.Paused.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUG.a[aj9.Broadcasting.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

