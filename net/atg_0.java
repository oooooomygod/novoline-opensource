/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.AudioDeviceType
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.StartFlags
 *  tv.twitch.broadcast.Stream
 *  tv.twitch.broadcast.StreamInfoForSetting
 *  tv.twitch.broadcast.VideoParams
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.HM;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamInfoForSetting;
import tv.twitch.broadcast.VideoParams;

/*
 * Renamed from net.atg
 */
public class atg_0 {
    public static ErrorCode c(Stream stream, AuthToken authToken) {
        return stream.getArchivingState(authToken);
    }

    public static ErrorCode b(Stream stream, AuthToken authToken) {
        return stream.runCommercial(authToken);
    }

    public static ErrorCode c(Stream stream, FrameBuffer frameBuffer) {
        return stream.randomizeFrameBuffer(frameBuffer);
    }

    public static ErrorCode f(Stream stream) {
        return stream.pollStats();
    }

    public static ErrorCode b(Stream stream) {
        return stream.pollTasks();
    }

    public static IStatCallbacks c(Stream stream) {
        return stream.getStatCallbacks();
    }

    public static IStreamCallbacks a(Stream stream) {
        return stream.getStreamCallbacks();
    }

    public static ErrorCode d(Stream stream, AuthToken authToken) {
        return stream.getUserInfo(authToken);
    }

    public static ErrorCode b(Stream stream, FrameBuffer frameBuffer) {
        return stream.submitVideoFrame(frameBuffer);
    }

    public static ErrorCode a(Stream stream, AuthToken authToken, String string, StreamInfoForSetting streamInfoForSetting) {
        return stream.setStreamInfo(authToken, string, streamInfoForSetting);
    }

    public static ErrorCode a(Stream stream, AuthToken authToken, String string) {
        return stream.getStreamInfo(authToken, string);
    }

    public static long e(Stream stream) {
        return stream.getStreamTime();
    }

    public static FrameBuffer a(Stream stream, int n) {
        return stream.allocateFrameBuffer(n);
    }

    public static ErrorCode b(Stream stream, AuthToken authToken, String string, long l4, String string2, String string3) {
        return stream.sendActionMetaData(authToken, string, l4, string2, string3);
    }

    public static ErrorCode a(Stream stream, AuthToken authToken) {
        return stream.getIngestServers(authToken);
    }

    public static long a(Stream stream, AuthToken authToken, String string, long l4, String string2, String string3) {
        return stream.sendStartSpanMetaData(authToken, string, l4, string2, string3);
    }

    public static ErrorCode a(Stream stream, AuthToken authToken, String string, long l4, long l5, String string2, String string3) {
        HM.b();
        ErrorCode errorCode = stream.sendEndSpanMetaData(authToken, string, l4, l5, string2, string3);
        ListInvoker.b(new ListInvoker[5]);
        return errorCode;
    }

    public static ErrorCode a(Stream stream, boolean bl) {
        return stream.stop(bl);
    }

    public static void a(Stream stream, IStreamCallbacks iStreamCallbacks) {
        stream.setStreamCallbacks(iStreamCallbacks);
    }

    public static int[] a(Stream stream, int n, int n2, float f, float f2) {
        return stream.getMaxResolution(n, n2, f, f2);
    }

    public static ErrorCode a(Stream stream, FrameBuffer frameBuffer) {
        return stream.captureFrameBuffer_ReadPixels(frameBuffer);
    }

    public static ErrorCode d(Stream stream) {
        return stream.pauseVideo();
    }

    public static ErrorCode e(Stream stream, AuthToken authToken) {
        return stream.login(authToken);
    }

    public static ErrorCode a(Stream stream, VideoParams videoParams, AudioParams audioParams, IngestServer ingestServer, StartFlags startFlags, boolean bl) {
        return stream.start(videoParams, audioParams, ingestServer, startFlags, bl);
    }

    public static ErrorCode a(Stream stream, AudioDeviceType audioDeviceType, float f) {
        return stream.setVolume(audioDeviceType, f);
    }

    public static void a(Stream stream, IStatCallbacks iStatCallbacks) {
        stream.setStatCallbacks(iStatCallbacks);
    }

    public static ErrorCode a(Stream stream, VideoParams videoParams) {
        return stream.getDefaultParams(videoParams);
    }
}

