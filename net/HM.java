/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 */
package net;

import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;

public class HM {
    private static int[] b;

    public static IngestServer a(IngestList ingestList) {
        return ingestList.getDefaultServer();
    }

    public static IngestServer[] b(IngestList ingestList) {
        return ingestList.getServers();
    }

    public static int[] b() {
        return b;
    }

    static {
        if (HM.b() != null) {
            HM.b(new int[5]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

