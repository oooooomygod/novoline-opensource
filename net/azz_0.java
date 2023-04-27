/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.FrameBuffer
 */
package net;

import tv.twitch.broadcast.FrameBuffer;

/*
 * Renamed from net.aZz
 */
public class azz_0 {
    public static boolean b(FrameBuffer frameBuffer) {
        return frameBuffer.getIsValid();
    }

    public static FrameBuffer a(long l4) {
        return FrameBuffer.lookupBuffer((long)l4);
    }

    public static void a(FrameBuffer frameBuffer) {
        frameBuffer.free();
    }
}

