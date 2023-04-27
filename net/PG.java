/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.Core
 *  tv.twitch.ErrorCode
 *  tv.twitch.MessageLevel
 */
package net;

import tv.twitch.Core;
import tv.twitch.ErrorCode;
import tv.twitch.MessageLevel;

public class PG {
    public static Core a() {
        return Core.getInstance();
    }

    public static ErrorCode a(Core core, MessageLevel messageLevel) {
        return core.setTraceLevel(messageLevel);
    }

    public static ErrorCode a(Core core, String string, String string2) {
        return core.initialize(string, string2);
    }

    public static ErrorCode a(Core core) {
        return core.shutdown();
    }
}

