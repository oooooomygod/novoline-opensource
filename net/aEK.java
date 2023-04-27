/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.GameInfoList
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.UserInfo
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import net.aL0;
import net.aR3;
import net.acd_1;
import net.axb_1;
import net.ea_1;
import net.lf_2;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class aEK
implements IStreamCallbacks {
    aR3 a;

    public void loginCallback(ErrorCode errorCode, ChannelInfo channelInfo) {
    }

    public void requestAuthTokenCallback(ErrorCode errorCode, AuthToken authToken) {
    }

    public void bufferUnlockCallback(long l4) {
    }

    public void getStreamInfoCallback(ErrorCode errorCode, StreamInfo streamInfo) {
    }

    public void sendStartSpanMetaDataCallback(ErrorCode errorCode) {
    }

    public void stopCallback(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            ea_1.a(System.out, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), axb_1.a), this.a.s.serverName), axb_1.b), errorCode.toString()).toString());
        }
        this.a.m = false;
        this.a.a = false;
        this.a.a(acd_1.DoneTestingServer);
        this.a.s = null;
        if (this.a.q) {
            this.a.a(acd_1.Cancelling);
        }
    }

    public void getUserInfoCallback(ErrorCode errorCode, UserInfo userInfo) {
    }

    public void getGameNameListCallback(ErrorCode errorCode, GameInfoList gameInfoList) {
    }

    public void startCallback(ErrorCode errorCode) {
        this.a.n = false;
        if (lf_2.c(errorCode)) {
            this.a.a = true;
            this.a.l = SystemInvoker.f();
            this.a.a(acd_1.ConnectingToServer);
        } else {
            this.a.y = false;
            this.a.a(acd_1.DoneTestingServer);
        }
    }

    public void runCommercialCallback(ErrorCode errorCode) {
    }

    public void sendActionMetaDataCallback(ErrorCode errorCode) {
    }

    public void getIngestServersCallback(ErrorCode errorCode, IngestList ingestList) {
    }

    aEK(aR3 aR32) {
        this.a = aR32;
    }

    public void sendEndSpanMetaDataCallback(ErrorCode errorCode) {
    }

    public void setStreamInfoCallback(ErrorCode errorCode) {
    }

    public void getArchivingStateCallback(ErrorCode errorCode, ArchivingState archivingState) {
    }
}

