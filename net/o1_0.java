/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.AuthToken
 *  tv.twitch.Core
 *  tv.twitch.CoreAPI
 *  tv.twitch.ErrorCode
 *  tv.twitch.MessageLevel
 *  tv.twitch.StandardCoreAPI
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.AudioDeviceType
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.DesktopStreamAPI
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.PixelFormat
 *  tv.twitch.broadcast.StartFlags
 *  tv.twitch.broadcast.Stream
 *  tv.twitch.broadcast.StreamAPI
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.StreamInfoForSetting
 *  tv.twitch.broadcast.UserInfo
 *  tv.twitch.broadcast.VideoParams
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.ThreadInvoker;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.CoreAPI;
import tv.twitch.ErrorCode;
import tv.twitch.MessageLevel;
import tv.twitch.StandardCoreAPI;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.DesktopStreamAPI;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamAPI;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.StreamInfoForSetting;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

/*
 * Renamed from net.o1
 */
public class o1_0 {
    protected AudioParams i = null;
    protected aR3 E = null;
    private static j_0<String> F;
    protected UserInfo b;
    protected ArchivingState e;
    private String g = null;
    private static Logger q;
    protected ChannelInfo z;
    protected List<FrameBuffer> C;
    protected int D = 3;
    protected boolean A = false;
    protected Stream w;
    protected long n = 0L;
    protected boolean G = true;
    protected StreamInfo k;
    protected String o;
    protected AuthToken x;
    protected IStatCallbacks f;
    protected IngestServer r = null;
    protected azu_2 u = null;
    protected aj9 h;
    protected String c = null;
    protected IStreamCallbacks v;
    protected String t = LT.b;
    protected String m;
    protected int y = 30;
    protected List<FrameBuffer> B;
    protected Core l;
    protected IngestList j;
    protected boolean a = false;
    protected boolean d = false;
    protected VideoParams p = null;
    private ErrorCode s;

    protected void a(aj9 aj92) {
        if (aj92 != this.h) {
            this.h = aj92;
            try {
                if (this.u != null) {
                    qm_1.a(this.u, aj92);
                }
            }
            catch (Exception exception) {
                this.a(exception.toString());
            }
        }
    }

    public boolean w() {
        if (!this.d) {
            return true;
        }
        if (this.f()) {
            return false;
        }
        this.a = true;
        this.m();
        atg_0.a(this.w, null);
        atg_0.a(this.w, null);
        ErrorCode errorCode = PG.a(this.l);
        this.a(errorCode);
        this.d = false;
        this.a = false;
        this.a(aj9.Uninitialized);
        return true;
    }

    public boolean i() {
        if (!this.h()) {
            return false;
        }
        ErrorCode errorCode = atg_0.a(this.w, true);
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.a(StringInvoker.a(LT.E, new Object[]{string}));
            return false;
        }
        this.a(aj9.Stopping);
        return lf_2.c(errorCode);
    }

    protected void c(String string) {
        oh_0.a(F, aL0.a(aL0.a(new StringBuilder(), LT.j), string).toString());
        LoggerInvoker.a(q, xi_1.c, LT.a, new Object[]{string});
    }

    public boolean a() {
        return this.h == aj9.ReadyToBroadcast;
    }

    public boolean z() {
        if (!this.A()) {
            return false;
        }
        this.a(aj9.Broadcasting);
        return true;
    }

    public IngestList c() {
        return this.j;
    }

    public boolean a(VideoParams videoParams) {
        if (this.a()) {
            this.p = abe_1.a(videoParams);
            this.i = new AudioParams();
            this.i.enableMicCapture = this.i.audioEnabled = this.G && this.C();
            this.i.enablePlaybackCapture = this.i.audioEnabled;
            this.i.enablePassthroughAudio = false;
            if (!this.q()) {
                this.p = null;
                this.i = null;
                return false;
            }
            ErrorCode errorCode = atg_0.a(this.w, videoParams, this.i, this.r, StartFlags.None, true);
            if (lf_2.a(errorCode)) {
                this.e();
                String string = lf_2.b(errorCode);
                this.a(StringInvoker.a(LT.s, new Object[]{string}));
                this.p = null;
                this.i = null;
                return false;
            }
            this.a(aj9.Starting);
            return true;
        }
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        q = LogManagerInvoker.c();
        F = new j_0<String>(String.class, 50);
    }

    public void b(String string) {
        this.t = string;
    }

    protected void e() {
        Iterator iterator = ListInvoker.iterator(this.C);
        while (dz_0.c(iterator)) {
            FrameBuffer frameBuffer;
            FrameBuffer frameBuffer2 = frameBuffer = (FrameBuffer)dz_0.b(iterator);
            azz_0.a(frameBuffer2);
        }
        ListInvoker.clear(this.B);
        ListInvoker.clear(this.C);
    }

    public boolean a(String string, AuthToken authToken) {
        if (this.f()) {
            return false;
        }
        this.m();
        if (!StringInvoker.g(string)) {
            if (authToken.data != null && !StringInvoker.g(authToken.data)) {
                this.c = string;
                this.x = authToken;
                if (this.x()) {
                    this.a(aj9.Authenticated);
                }
                return true;
            }
            this.a(LT.t);
            return false;
        }
        this.a(LT.I);
        return false;
    }

    public aR3 v() {
        if (this.a() && this.j != null) {
            if (this.f()) {
                return null;
            }
            this.E = new aR3(this.w, this.j);
            iw_1.f(this.E);
            this.a(aj9.IngestTesting);
            return this.E;
        }
        return null;
    }

    public long n() {
        return atg_0.e(this.w);
    }

    public boolean A() {
        return this.h == aj9.Paused;
    }

    public boolean f() {
        return this.h == aj9.IngestTesting;
    }

    public boolean h() {
        return this.h == aj9.Broadcasting || this.h == aj9.Paused;
    }

    public ChannelInfo t() {
        return this.z;
    }

    public boolean m() {
        if (this.f()) {
            return false;
        }
        if (this.h()) {
            atg_0.a(this.w, false);
        }
        this.c = LT.x;
        this.x = new AuthToken();
        if (!this.A) {
            return false;
        }
        this.A = false;
        if (!this.a) {
            try {
                if (this.u != null) {
                    qm_1.a(this.u);
                }
            }
            catch (Exception exception) {
                this.a(exception.toString());
            }
        }
        this.a(aj9.Initialized);
        return true;
    }

    public ErrorCode B() {
        return this.s;
    }

    public void a(float f) {
        atg_0.a(this.w, AudioDeviceType.TTV_RECORDER_DEVICE, f);
    }

    public boolean p() {
        if (!this.h()) {
            return false;
        }
        ErrorCode errorCode = atg_0.d(this.w);
        if (lf_2.a(errorCode)) {
            this.i();
            String string = lf_2.b(errorCode);
            this.a(StringInvoker.a(LT.J, new Object[]{string}));
        } else {
            this.a(aj9.Paused);
        }
        return lf_2.c(errorCode);
    }

    public FrameBuffer d() {
        if (ListInvoker.isEmpty(this.B)) {
            this.a(StringInvoker.a(LT.B, new Object[0]));
            return null;
        }
        FrameBuffer frameBuffer = (FrameBuffer)ListInvoker.get(this.B, ListInvoker.size(this.B) - 1);
        ListInvoker.remove(this.B, ListInvoker.size(this.B) - 1);
        return frameBuffer;
    }

    public void b(FrameBuffer frameBuffer) {
        try {
            atg_0.a(this.w, frameBuffer);
            return;
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, LT.H);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, LT.D);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, LT.d, a7r_0.b(oh_0.a(F)));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, LT.C, frameBuffer);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, LT.c, P8.d(ListInvoker.size(this.B)));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, LT.l, P8.d(ListInvoker.size(this.C)));
            throw new ReportedException(crashReport);
        }
    }

    public void r() {
        if (this.w != null && this.d) {
            ErrorCode errorCode = atg_0.b(this.w);
            this.a(errorCode);
            if (this.f()) {
                iw_1.c(this.E);
                if (iw_1.e(this.E)) {
                    this.E = null;
                    this.a(aj9.ReadyToBroadcast);
                }
            }
            switch (aUG.a[this.h.ordinal()]) {
                case 1: {
                    this.a(aj9.LoggingIn);
                    errorCode = atg_0.e(this.w, this.x);
                    if (!lf_2.a(errorCode)) break;
                    String string = lf_2.b(errorCode);
                    this.a(StringInvoker.a(LT.v, new Object[]{string}));
                    break;
                }
                case 2: {
                    this.a(aj9.FindingIngestServer);
                    errorCode = atg_0.a(this.w, this.x);
                    if (!lf_2.a(errorCode)) break;
                    this.a(aj9.LoggedIn);
                    String string = lf_2.b(errorCode);
                    this.a(StringInvoker.a(LT.n, new Object[]{string}));
                    break;
                }
                case 3: {
                    String string;
                    this.a(aj9.ReadyToBroadcast);
                    errorCode = atg_0.d(this.w, this.x);
                    if (lf_2.a(errorCode)) {
                        string = lf_2.b(errorCode);
                        this.a(StringInvoker.a(LT.g, new Object[]{string}));
                    }
                    this.g();
                    errorCode = atg_0.c(this.w, this.x);
                    if (lf_2.a(errorCode)) {
                        string = lf_2.b(errorCode);
                        this.a(StringInvoker.a(LT.u, new Object[]{string}));
                    }
                }
                default: {
                    break;
                }
                case 11: 
                case 12: {
                    this.g();
                }
            }
        }
    }

    public void a(IngestServer ingestServer) {
        this.r = ingestServer;
    }

    public boolean b(String string, long l4, String string2, String string3) {
        ErrorCode errorCode = atg_0.b(this.w, this.x, string, l4, string2, string3);
        if (lf_2.a(errorCode)) {
            String string4 = lf_2.b(errorCode);
            this.a(StringInvoker.a(LT.k, new Object[]{string4}));
            return false;
        }
        return true;
    }

    public boolean a(String string, String string2, String string3) {
        if (!this.A) {
            return false;
        }
        if (string.equals(LT.z)) {
            string = this.c;
        }
        string2 = LT.F;
        string3 = LT.h;
        StreamInfoForSetting streamInfoForSetting = new StreamInfoForSetting();
        streamInfoForSetting.streamTitle = string3;
        streamInfoForSetting.gameName = string2;
        ErrorCode errorCode = atg_0.a(this.w, this.x, string, streamInfoForSetting);
        this.a(errorCode);
        return lf_2.c(errorCode);
    }

    protected void a(String string) {
        this.g = string;
        oh_0.a(F, aL0.a(aL0.a(new StringBuilder(), LT.y), string).toString());
        LoggerInvoker.b(q, xi_1.c, LT.G, new Object[]{string});
    }

    public boolean a(String string, long l4, long l5, String string2, String string3) {
        if (l5 == -1L) {
            this.a(StringInvoker.a(LT.e, new Object[]{lx_2.b(l5)}));
            return false;
        }
        ErrorCode errorCode = atg_0.a(this.w, this.x, string, l4, l5, string2, string3);
        if (lf_2.a(errorCode)) {
            String string4 = lf_2.b(errorCode);
            this.a(StringInvoker.a(LT.r, new Object[]{string4}));
            return false;
        }
        return true;
    }

    public void j() {
        if (this.h != aj9.Uninitialized) {
            if (this.E != null) {
                iw_1.g(this.E);
            }
            while (this.E != null) {
                try {
                    ThreadInvoker.sleep(200L);
                }
                catch (Exception exception) {
                    this.a(exception.toString());
                }
                this.r();
            }
            this.w();
        }
    }

    public boolean s() {
        if (!this.h()) {
            return false;
        }
        ErrorCode errorCode = atg_0.b(this.w, this.x);
        this.a(errorCode);
        return lf_2.c(errorCode);
    }

    protected boolean a(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            this.a(lf_2.b(errorCode));
            return false;
        }
        return true;
    }

    public StreamInfo b() {
        return this.k;
    }

    public void a(azu_2 azu_22) {
        this.u = azu_22;
    }

    public aR3 y() {
        return this.E;
    }

    public o1_0() {
        this.o = LT.w;
        this.m = LT.i;
        this.C = my_0.c();
        this.B = my_0.c();
        this.h = aj9.Uninitialized;
        this.j = new IngestList(new IngestServer[0]);
        this.x = new AuthToken();
        this.z = new ChannelInfo();
        this.b = new UserInfo();
        this.k = new StreamInfo();
        this.e = new ArchivingState();
        this.v = new aM5(this);
        this.f = new U4(this);
        this.l = PG.a();
        if (PG.a() == null) {
            this.l = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.w = new Stream((StreamAPI)new DesktopStreamAPI());
    }

    public long a(String string, long l4, String string2, String string3) {
        long l5 = atg_0.a(this.w, this.x, string, l4, string2, string3);
        if (l5 == -1L) {
            this.a(StringInvoker.a(LT.f, new Object[0]));
        }
        return l5;
    }

    public IngestServer u() {
        return this.r;
    }

    public ErrorCode a(FrameBuffer frameBuffer) {
        if (this.A()) {
            this.z();
        } else if (!this.h()) {
            return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
        }
        ErrorCode errorCode = atg_0.b(this.w, frameBuffer);
        if (errorCode != ErrorCode.TTV_EC_SUCCESS) {
            String string = lf_2.b(errorCode);
            if (lf_2.c(errorCode)) {
                this.c(StringInvoker.a(LT.A, new Object[]{string}));
            } else {
                this.a(StringInvoker.a(LT.o, new Object[]{string}));
                this.i();
            }
            if (this.u != null) {
                qm_1.a(this.u, errorCode);
            }
        }
        return errorCode;
    }

    protected PixelFormat l() {
        return PixelFormat.TTV_PF_RGBA;
    }

    public VideoParams a(int n, int n2, float f, float f2) {
        int[] nArray = atg_0.a(this.w, n, n2, f, f2);
        VideoParams videoParams = new VideoParams();
        videoParams.maxKbps = n;
        videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        videoParams.pixelFormat = this.l();
        videoParams.targetFps = n2;
        videoParams.outputWidth = nArray[0];
        videoParams.outputHeight = nArray[1];
        videoParams.disableAdaptiveBitrate = false;
        videoParams.verticalFlip = false;
        return videoParams;
    }

    public boolean o() {
        return this.A;
    }

    protected boolean C() {
        return true;
    }

    public void b(float f) {
        atg_0.a(this.w, AudioDeviceType.TTV_PLAYBACK_DEVICE, f);
    }

    public boolean k() {
        if (this.d) {
            return false;
        }
        atg_0.a(this.w, this.v);
        ErrorCode errorCode = PG.a(this.l, this.t, SystemInvoker.c(LT.q));
        if (!this.a(errorCode)) {
            atg_0.a(this.w, null);
            this.s = errorCode;
            return false;
        }
        errorCode = PG.a(this.l, MessageLevel.TTV_ML_ERROR);
        if (!this.a(errorCode)) {
            atg_0.a(this.w, null);
            PG.a(this.l);
            this.s = errorCode;
            return false;
        }
        if (lf_2.c(errorCode)) {
            this.d = true;
            this.a(aj9.Initialized);
            return true;
        }
        this.s = errorCode;
        PG.a(this.l);
        return false;
    }

    public boolean x() {
        return this.d;
    }

    protected void g() {
        long l4 = SystemInvoker.nanoTime();
        long l5 = (l4 - this.n) / 1000000000L;
        if (l5 >= 30L) {
            this.n = l4;
            ErrorCode errorCode = atg_0.a(this.w, this.x, this.c);
            if (lf_2.a(errorCode)) {
                String string = lf_2.b(errorCode);
                this.a(StringInvoker.a(LT.p, new Object[]{string}));
            }
        }
    }

    protected boolean q() {
        int n = 0;
        while (true) {
            FrameBuffer frameBuffer;
            if (!azz_0.b(frameBuffer = atg_0.a(this.w, this.p.outputWidth * this.p.outputHeight * 4))) {
                this.a(StringInvoker.a(LT.m, new Object[0]));
                return false;
            }
            ListInvoker.add(this.C, frameBuffer);
            ListInvoker.add(this.B, frameBuffer);
            ++n;
        }
    }
}

