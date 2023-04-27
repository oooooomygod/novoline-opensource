/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.PixelFormat
 *  tv.twitch.broadcast.RTMPState
 *  tv.twitch.broadcast.StartFlags
 *  tv.twitch.broadcast.Stream
 *  tv.twitch.broadcast.VideoParams
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.util.Iterator;
import java.util.List;
import net.HM;
import net.aEK;
import net.aL0;
import net.acd_1;
import net.amw_2;
import net.an3_0;
import net.atg_0;
import net.axx_0;
import net.azz_0;
import net.dz_0;
import net.ea_1;
import net.kx_0;
import net.lf_2;
import net.my_0;
import net.ux_0;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.VideoParams;

public class aR3 {
    protected long B = 0L;
    protected boolean n = false;
    protected boolean a = false;
    protected Stream e = null;
    protected boolean m = false;
    protected axx_0 i = null;
    protected boolean q = false;
    protected IStreamCallbacks k = null;
    protected VideoParams u = null;
    protected float A = 0.0f;
    protected long c = 2000L;
    protected int h = 0;
    protected IStatCallbacks f;
    protected float b = 0.0f;
    protected List<FrameBuffer> r = null;
    protected IngestList o = null;
    protected boolean j = false;
    protected long l = 0L;
    protected long v = 8000L;
    protected long z = 0L;
    protected RTMPState d;
    protected boolean y = false;
    protected IStatCallbacks x = null;
    protected AudioParams p = null;
    protected int w = -1;
    protected IStreamCallbacks g;
    protected acd_1 t = acd_1.Uninitalized;
    protected IngestServer s = null;

    public void h() {
        if (!this.a() && !this.q) {
            this.q = true;
            if (this.s != null) {
                this.s.bitrateKbps = 0.0f;
            }
        }
    }

    public IngestServer e() {
        return this.s;
    }

    public float i() {
        return this.b;
    }

    protected void c() {
        this.s = null;
        if (this.r != null) {
            Iterator iterator = ListInvoker.iterator(this.r);
            while (dz_0.c(iterator)) {
                FrameBuffer frameBuffer = (FrameBuffer)dz_0.b(iterator);
                azz_0.a(frameBuffer);
            }
            this.r = null;
        }
        if (atg_0.c(this.e) == this.f) {
            atg_0.a(this.e, this.x);
            this.x = null;
        }
        if (atg_0.a(this.e) == this.g) {
            atg_0.a(this.e, this.k);
            this.k = null;
        }
    }

    protected long g() {
        return SystemInvoker.f() - this.l;
    }

    public aR3(Stream stream, IngestList ingestList) {
        this.d = RTMPState.Invalid;
        this.g = new aEK(this);
        this.f = new amw_2(this);
        this.e = stream;
        this.o = ingestList;
    }

    protected void a(IngestServer ingestServer) {
        if (this.n) {
            this.j = true;
        } else if (this.a) {
            this.m = true;
            ErrorCode errorCode = atg_0.a(this.e, true);
            if (lf_2.a(errorCode)) {
                an3_0.a(this.g, ErrorCode.TTV_EC_SUCCESS);
                ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), kx_0.a), errorCode.toString()).toString());
            }
            atg_0.f(this.e);
        } else {
            an3_0.a(this.g, ErrorCode.TTV_EC_SUCCESS);
        }
    }

    public void a(axx_0 axx_02) {
        this.i = axx_02;
    }

    protected void f() {
        float f = this.g();
        switch (this.t) {
            case Starting: 
            case ConnectingToServer: 
            case Uninitalized: 
            case Finished: 
            case Cancelled: 
            case Failed: {
                this.b = 0.0f;
                break;
            }
            case DoneTestingServer: {
                this.b = 1.0f;
                break;
            }
            default: {
                this.b = f / (float)this.v;
            }
        }
        switch (this.t) {
            case Finished: 
            case Cancelled: 
            case Failed: {
                this.A = 1.0f;
                break;
            }
            default: {
                this.A = (float)this.w / (float)HM.b(this.o).length;
                this.A += this.b / (float)HM.b(this.o).length;
            }
        }
    }

    public void d() {
        if (this.t == acd_1.Uninitalized) {
            this.w = 0;
            this.q = false;
            this.j = false;
            this.a = false;
            this.n = false;
            this.m = false;
            this.x = atg_0.c(this.e);
            atg_0.a(this.e, this.f);
            this.k = atg_0.a(this.e);
            atg_0.a(this.e, this.g);
            this.u = new VideoParams();
            this.u.targetFps = 60;
            this.u.maxKbps = 3500;
            this.u.outputWidth = 1280;
            this.u.outputHeight = 720;
            this.u.pixelFormat = PixelFormat.TTV_PF_BGRA;
            this.u.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
            this.u.disableAdaptiveBitrate = true;
            this.u.verticalFlip = false;
            atg_0.a(this.e, this.u);
            this.p = new AudioParams();
            this.p.audioEnabled = false;
            this.p.enableMicCapture = false;
            this.p.enablePlaybackCapture = false;
            this.p.enablePassthroughAudio = false;
            this.r = my_0.c();
            int n = 3;
            int n2 = 0;
            while (true) {
                FrameBuffer frameBuffer;
                if (!azz_0.b(frameBuffer = atg_0.a(this.e, this.u.outputWidth * this.u.outputHeight * 4))) {
                    this.c();
                    this.a(acd_1.Failed);
                    return;
                }
                ListInvoker.add(this.r, frameBuffer);
                atg_0.c(this.e, frameBuffer);
                ++n2;
            }
        }
    }

    protected boolean c(IngestServer ingestServer) {
        this.y = true;
        this.B = 0L;
        this.d = RTMPState.Idle;
        this.s = ingestServer;
        this.n = true;
        this.a(acd_1.ConnectingToServer);
        ErrorCode errorCode = atg_0.a(this.e, this.u, this.p, ingestServer, StartFlags.TTV_Start_BandwidthTest, true);
        if (lf_2.a(errorCode)) {
            this.n = false;
            this.y = false;
            this.a(acd_1.DoneTestingServer);
            return false;
        }
        this.z = this.B;
        ingestServer.bitrateKbps = 0.0f;
        this.h = 0;
        return true;
    }

    protected void a(acd_1 acd_12) {
        if (acd_12 != this.t) {
            this.t = acd_12;
            if (this.i != null) {
                ux_0.a(this.i, this, acd_12);
            }
        }
    }

    protected boolean b(IngestServer ingestServer) {
        if (!this.j && !this.q && this.g() < this.v) {
            if (!this.n && !this.m) {
                ErrorCode errorCode = atg_0.b(this.e, (FrameBuffer)ListInvoker.get(this.r, this.h));
                if (lf_2.a(errorCode)) {
                    this.y = false;
                    this.a(acd_1.DoneTestingServer);
                    return false;
                }
                this.h = (this.h + 1) % ListInvoker.size(this.r);
                atg_0.f(this.e);
                if (this.d == RTMPState.SendVideo) {
                    this.a(acd_1.TestingServer);
                    long l4 = this.g();
                    if (l4 > 0L && this.B > this.z) {
                        ingestServer.bitrateKbps = (float)(this.B * 8L) / (float)this.g();
                        this.z = this.B;
                    }
                }
                return true;
            }
            return true;
        }
        this.a(acd_1.DoneTestingServer);
        return true;
    }

    public void j() {
        if (!(this.a() || this.t == acd_1.Uninitalized || this.n || this.m)) {
            switch (this.t) {
                case Starting: 
                case DoneTestingServer: {
                    if (this.s != null) {
                        if (this.j || !this.y) {
                            this.s.bitrateKbps = 0.0f;
                        }
                        this.a(this.s);
                        break;
                    }
                    this.l = 0L;
                    this.j = false;
                    this.y = true;
                    if (this.t != acd_1.Starting) {
                        ++this.w;
                    }
                    if (this.w < HM.b(this.o).length) {
                        this.s = HM.b(this.o)[this.w];
                        this.c(this.s);
                        break;
                    }
                    this.a(acd_1.Finished);
                    break;
                }
                case ConnectingToServer: 
                case TestingServer: {
                    this.b(this.s);
                    break;
                }
                case Cancelling: {
                    this.a(acd_1.Cancelled);
                }
            }
            this.f();
            if (this.t == acd_1.Cancelled || this.t == acd_1.Finished) {
                this.c();
            }
        }
    }

    public boolean a() {
        return this.t == acd_1.Finished || this.t == acd_1.Cancelled || this.t == acd_1.Failed;
    }

    public int b() {
        return this.w;
    }
}

