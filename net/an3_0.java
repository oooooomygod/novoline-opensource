/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.IStreamCallbacks
 */
package net;

import tv.twitch.ErrorCode;
import tv.twitch.broadcast.IStreamCallbacks;

/*
 * Renamed from net.an3
 */
public class an3_0 {
    public static void a(IStreamCallbacks iStreamCallbacks, ErrorCode errorCode) {
        iStreamCallbacks.stopCallback(errorCode);
    }
}

