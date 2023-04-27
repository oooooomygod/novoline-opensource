/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.GameInfoList
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.UserInfo
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import net.HM;
import net.aj9;
import net.azu_2;
import net.azz_0;
import net.ec_0;
import net.lf_2;
import net.o1_0;
import net.qm_1;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class aM5
implements IStreamCallbacks {
    o1_0 a;

    public void getGameNameListCallback(ErrorCode errorCode, GameInfoList gameInfoList) {
        block4: {
            if (lf_2.a(errorCode)) {
                String string = lf_2.b(errorCode);
                this.a.a(StringInvoker.a(ec_0.n, new Object[]{string}));
            }
            if (this.a.u == null) break block4;
            azu_2 azu_22 = this.a.u;
            ErrorCode errorCode2 = errorCode;
            try {
                qm_1.a(azu_22, errorCode2, new GameInfo[0]);
            }
            catch (Exception exception) {
                this.a.a(exception.toString());
            }
        }
    }

    public void getUserInfoCallback(ErrorCode errorCode, UserInfo userInfo) {
        this.a.b = userInfo;
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.l, new Object[]{string}));
        }
    }

    public void sendStartSpanMetaDataCallback(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.g, new Object[]{string}));
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void sendActionMetaDataCallback(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.d, new Object[]{string}));
        }
    }

    public void runCommercialCallback(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.a.c(StringInvoker.a(ec_0.k, new Object[]{string}));
        }
    }

    public void requestAuthTokenCallback(ErrorCode errorCode, AuthToken authToken) {
        if (lf_2.c(errorCode)) {
            this.a.x = authToken;
            this.a.a(aj9.Authenticated);
        } else {
            this.a.x.data = ec_0.f;
            this.a.a(aj9.Initialized);
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.j, new Object[]{string}));
        }
        try {
            if (this.a.u != null) {
                qm_1.a(this.a.u, errorCode, authToken);
            }
        }
        catch (Exception exception) {
            this.a.a(exception.toString());
        }
    }

    aM5(o1_0 o1_02) {
        this.a = o1_02;
    }

    public void bufferUnlockCallback(long l4) {
        FrameBuffer frameBuffer = azz_0.a(l4);
        ListInvoker.add(this.a.B, frameBuffer);
    }

    public void getArchivingStateCallback(ErrorCode errorCode, ArchivingState archivingState) {
        this.a.e = archivingState;
        if (lf_2.a(errorCode)) {
            // empty if block
        }
    }

    public void setStreamInfoCallback(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.a.c(StringInvoker.a(ec_0.h, new Object[]{string}));
        }
    }

    public void sendEndSpanMetaDataCallback(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.c, new Object[]{string}));
        }
    }

    public void getIngestServersCallback(ErrorCode errorCode, IngestList ingestList) {
        if (lf_2.c(errorCode)) {
            this.a.j = ingestList;
            this.a.r = HM.a(this.a.j);
            this.a.a(aj9.ReceivedIngestServers);
            try {
                if (this.a.u != null) {
                    qm_1.a(this.a.u, ingestList);
                }
            }
            catch (Exception exception) {
                this.a.a(exception.toString());
            }
        } else {
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.e, new Object[]{string}));
            this.a.a(aj9.LoggingIn);
        }
    }

    public void getStreamInfoCallback(ErrorCode errorCode, StreamInfo streamInfo) {
        if (lf_2.c(errorCode)) {
            this.a.k = streamInfo;
            try {
                if (this.a.u != null) {
                    qm_1.a(this.a.u, streamInfo);
                }
            }
            catch (Exception exception) {
                this.a.a(exception.toString());
            }
        } else {
            String string = lf_2.b(errorCode);
            this.a.c(StringInvoker.a(ec_0.i, new Object[]{string}));
        }
    }

    public void stopCallback(ErrorCode errorCode) {
        if (lf_2.c(errorCode)) {
            this.a.p = null;
            this.a.i = null;
            this.a.e();
            try {
                if (this.a.u != null) {
                    qm_1.c(this.a.u);
                }
            }
            catch (Exception exception) {
                this.a.a(exception.toString());
            }
            if (this.a.A) {
                this.a.a(aj9.ReadyToBroadcast);
            } else {
                this.a.a(aj9.Initialized);
            }
        } else {
            this.a.a(aj9.ReadyToBroadcast);
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.m, new Object[]{string}));
        }
    }

    public void startCallback(ErrorCode errorCode) {
        if (lf_2.c(errorCode)) {
            try {
                if (this.a.u != null) {
                    qm_1.b(this.a.u);
                }
            }
            catch (Exception exception) {
                this.a.a(exception.toString());
            }
            this.a.a(aj9.Broadcasting);
        } else {
            this.a.p = null;
            this.a.i = null;
            this.a.a(aj9.ReadyToBroadcast);
            try {
                if (this.a.u != null) {
                    qm_1.b(this.a.u, errorCode);
                }
            }
            catch (Exception exception) {
                this.a.a(exception.toString());
            }
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.a, new Object[]{string}));
        }
    }

    public void loginCallback(ErrorCode errorCode, ChannelInfo channelInfo) {
        if (lf_2.c(errorCode)) {
            this.a.z = channelInfo;
            this.a.a(aj9.LoggedIn);
            this.a.A = true;
        } else {
            this.a.a(aj9.Initialized);
            this.a.A = false;
            String string = lf_2.b(errorCode);
            this.a.a(StringInvoker.a(ec_0.b, new Object[]{string}));
        }
        try {
            if (this.a.u != null) {
                qm_1.c(this.a.u, errorCode);
            }
        }
        catch (Exception exception) {
            this.a.a(exception.toString());
        }
    }
}

