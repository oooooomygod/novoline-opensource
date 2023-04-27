/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.properties.Property
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.lwjgl.opengl.GL11
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.VideoParams
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.ChatUserMode
 *  tv.twitch.chat.ChatUserSubscription
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.ThreadInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import com.mojang.authlib.properties.Property;
import deobf.DefaultVertexFormats;
import deobf.Framebuffer;
import deobf.GameSettings;
import deobf.IChatComponent;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.lwjgl.opengl.GL11;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.xI
 */
public class xi_1
implements azu_2,
amq_0,
axx_0,
a5f_0 {
    private IChatComponent i = new ChatComponentText(aKo.X);
    private Framebuffer p;
    private Minecraft q;
    public static Marker c;
    private long h = 0L;
    private boolean b;
    private int m = 30;
    private boolean k;
    private Map<String, ChatUserInfo> j = MapsInvoker.a();
    private o1_0 d;
    private String l;
    private G8 n;
    private static Logger f;
    private aZF a = aZF.ERROR;
    private boolean g;
    private boolean e;
    private static boolean o;

    @Override
    public void c(ErrorCode errorCode) {
        if (errorCode == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED) {
            aoz_1 aoz_12 = new aoz_1(aKo.l, new Object[0]);
            ChatStyle chatStyle = aBO.f(aoz_12);
            HX.a(chatStyle, new awv_1(k_0.OPEN_URL, aKo.t));
            HX.c(chatStyle, Boolean.TRUE);
            aoz_1 aoz_13 = new aoz_1(aKo.L, aoz_12);
            HX.a(aBO.f(aoz_13), anw_0.DARK_RED);
            kp_1.a(GW.f(this.q.ingameGUI), aoz_13);
        } else {
            aoz_1 aoz_14 = new aoz_1(aKo.h, lf_2.b(errorCode));
            HX.a(aBO.f(aoz_14), anw_0.DARK_RED);
            kp_1.a(GW.f(this.q.ingameGUI), aoz_14);
        }
    }

    @Override
    public void a(IngestList ingestList) {
    }

    @Override
    public void a(ErrorCode errorCode, GameInfo[] gameInfoArray) {
    }

    private void a(String string, ChatRawMessage chatRawMessage) {
        ChatUserInfo chatUserInfo = (ChatUserInfo)MapInvoker.c(this.j, string);
        chatUserInfo = new ChatUserInfo();
        chatUserInfo.displayName = string;
        MapInvoker.c(this.j, string, chatUserInfo);
        chatUserInfo.subscriptions = chatRawMessage.subscriptions;
        chatUserInfo.modes = chatRawMessage.modes;
        chatUserInfo.nameColorARGB = chatRawMessage.nameColorARGB;
    }

    @Override
    public boolean C() {
        return this.l != null && this.l.equals(ahi_2.c((o1_0)this.d).name);
    }

    static G8 b(xi_1 xi_12) {
        return xi_12.n;
    }

    @Override
    public aR3 v() {
        return ahi_2.t(this.d);
    }

    @Override
    public void a(String string, String string2) {
    }

    @Override
    public void r() {
        if (ahi_2.q(this.d)) {
            LoggerInvoker.d(f, c, aKo.m);
        } else {
            LoggerInvoker.b(f, c, aKo.ac);
        }
    }

    @Override
    public boolean m() {
        return this.g;
    }

    @Override
    public String k() {
        return this.l;
    }

    @Override
    public IngestServer[] t() {
        return HM.b(ahi_2.e(this.d));
    }

    @Override
    public void a(String string, ChatUserInfo[] chatUserInfoArray, ChatUserInfo[] chatUserInfoArray2, ChatUserInfo[] chatUserInfoArray3) {
        for (ChatUserInfo chatUserInfo : chatUserInfoArray2) {
            MapInvoker.a(this.j, chatUserInfo.displayName);
        }
        for (ChatUserInfo chatUserInfo : chatUserInfoArray3) {
            MapInvoker.c(this.j, chatUserInfo.displayName, chatUserInfo);
        }
        for (ChatUserInfo chatUserInfo : chatUserInfoArray) {
            MapInvoker.c(this.j, chatUserInfo.displayName, chatUserInfo);
        }
    }

    @Override
    public void a(aj9 aj92) {
        LoggerInvoker.d(f, c, aKo.V, new Object[]{aj92});
        if (aj92 == aj9.Initialized) {
            this.d.a(aj9.Authenticated);
        }
    }

    @Override
    public void a(asx_0 asx_02) {
    }

    @Override
    public void e(String string) {
        ab__0.a(this.n, this.l, string);
    }

    public static float a(float f) {
        return 0.1f + f * 0.1f;
    }

    @Override
    public void b(ErrorCode errorCode) {
        if (lf_2.c(errorCode)) {
            LoggerInvoker.d(f, c, aKo.H);
            this.g = true;
        } else {
            LoggerInvoker.a(f, c, aKo.W, new Object[]{lf_2.b(errorCode), P8.d(lf_2.d(errorCode))});
            this.g = false;
        }
    }

    @Override
    public void d() {
    }

    @Override
    public void d(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            LoggerInvoker.c(f, c, aKo.u);
        }
    }

    @Override
    public boolean x() {
        return this.d.h();
    }

    static aZF a(xi_1 xi_12, aZF aZF2) {
        xi_12.a = aZF2;
        return xi_12.a;
    }

    @Override
    public void a() {
        this.j();
        LoggerInvoker.a(f, c, aKo.v);
    }

    public static int c(float f) {
        return MathHelper.f(230.0f + f * 3270.0f);
    }

    @Override
    public boolean i() {
        return ahi_2.k(this.d);
    }

    @Override
    public void q() {
        int n = this.q.gameSettings.at;
        boolean bl = this.l != null && ab__0.e(this.n, this.l);
        boolean bl2 = ab__0.a(this.n) == asx_0.Initialized && (this.l == null || ab__0.a(this.n, this.l) == aA2.Disconnected);
        if (n == 2) {
            LoggerInvoker.d(f, c, aKo.D);
            ab__0.b(this.n, this.l);
        } else if (n == 1) {
            if (ahi_2.k(this.d)) {
                LoggerInvoker.d(f, c, aKo.A);
                this.i();
            }
        } else if (!this.x()) {
            LoggerInvoker.d(f, c, aKo.N);
            ab__0.b(this.n, this.l);
        } else if (this.x()) {
            LoggerInvoker.d(f, c, aKo.I);
            this.i();
        }
        ahi_2.b(this.d);
        ab__0.b(this.n);
    }

    protected void i() {
        String string;
        asx_0 asx_02 = ab__0.a(this.n);
        this.l = string = ahi_2.c((o1_0)this.d).name;
        if (asx_02 != asx_0.Initialized) {
            LoggerInvoker.b(f, aKo.Q, new Object[]{asx_02});
        } else if (ab__0.a(this.n, this.l) == aA2.Disconnected) {
            ab__0.d(this.n, string);
        } else {
            LoggerInvoker.b(f, aKo.f, new Object[]{asx_02});
        }
    }

    @Override
    public void a(String string, ChatTokenizedMessage[] chatTokenizedMessageArray) {
    }

    static o1_0 a(xi_1 xi_12) {
        return xi_12.d;
    }

    @Override
    public ErrorCode w() {
        return !o ? ErrorCode.TTV_EC_OS_TOO_OLD : ahi_2.r(this.d);
    }

    @Override
    public void u() {
        ahi_2.l(this.d);
        this.b = true;
        this.j();
    }

    @Override
    public void a(adj_2 adj_22, long l4, long l5) {
        if (this.x() && this.k) {
            long l6 = ahi_2.p(this.d);
            String string = ayb_2.b(adj_22);
            String string2 = ayb_2.a(adj_22);
            long l7 = ahi_2.b(this.d, ayb_2.c(adj_22), l6 + l4, string, string2);
            if (l7 < 0L) {
                LoggerInvoker.a(f, c, aKo.z, new Object[]{lx_2.b(l6 + l4), lx_2.b(l6 + l5), adj_22});
            } else if (ahi_2.a(this.d, ayb_2.c(adj_22), l6 + l5, l7, string, string2)) {
                LoggerInvoker.d(f, c, aKo.o, new Object[]{lx_2.b(l6 + l4), lx_2.b(l6 + l5), adj_22});
            } else {
                LoggerInvoker.a(f, c, aKo.w, new Object[]{lx_2.b(l6 + l4), lx_2.b(l6 + l5), adj_22});
            }
        }
    }

    @Override
    public void n() {
        if (ahi_2.d(this.d)) {
            LoggerInvoker.a(f, c, aKo.U);
        } else {
            LoggerInvoker.b(f, c, aKo.d);
        }
    }

    @Override
    public void d(String string) {
    }

    @Override
    public void c(String string) {
    }

    @Override
    public void b(String string) {
        LoggerInvoker.d(f, c, aKo.P);
        MapInvoker.d(this.j);
    }

    @Override
    public void a(String string) {
        LoggerInvoker.d(f, c, aKo.J);
    }

    public static int b(float f) {
        return MathHelper.f(10.0f + f * 50.0f);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void h() {
        LoggerInvoker.d(f, c, aKo.R);
        ahi_2.n(this.d);
        ab__0.c(this.n);
    }

    @Override
    public void a(adj_2 adj_22, long l4) {
        if (this.x() && this.k) {
            long l5 = ahi_2.p(this.d);
            if (!ahi_2.a(this.d, ayb_2.c(adj_22), l5 + l4, ayb_2.b(adj_22), ayb_2.a(adj_22))) {
                LoggerInvoker.a(f, c, aKo.C, new Object[]{lx_2.b(l5 + l4), adj_22});
            } else {
                LoggerInvoker.d(f, c, aKo.p, new Object[]{lx_2.b(l5 + l4), adj_22});
            }
        }
    }

    @Override
    public aZF B() {
        return this.a;
    }

    @Override
    public void e() {
    }

    @Override
    public void f() {
        if (this.d.h() && !ahi_2.f(this.d)) {
            long l4;
            long l5 = SystemInvoker.nanoTime();
            long l6 = l5 - this.h;
            boolean bl = l6 >= (l4 = (long)(1000000000 / this.m));
            FrameBuffer frameBuffer = ahi_2.h(this.d);
            Framebuffer framebuffer = MCInvoker.c(this.q);
            FramebufferInvoker.bindFramebuffer(this.p, true);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.ortho(0.0, this.p.g, this.p.d, 0.0, 1000.0, 3000.0);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.viewport(0, 0, this.p.g, this.p.d);
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.disableBlend();
            float f = this.p.g;
            float f2 = this.p.d;
            float f3 = (float)framebuffer.g / (float)framebuffer.i;
            float f4 = (float)framebuffer.d / (float)framebuffer.c;
            FramebufferInvoker.e(framebuffer);
            GL11.glTexParameterf((int)3553, (int)10241, (float)9729.0f);
            GL11.glTexParameterf((int)3553, (int)10240, (float)9729.0f);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, f2, 0.0), 0.0, f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f, f2, 0.0), f3, f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f, 0.0, 0.0), f3, 0.0));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 0.0), 0.0, 0.0));
            TessellatorInvoker.draw(tessellator);
            FramebufferInvoker.b(framebuffer);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5888);
            ahi_2.a(this.d, frameBuffer);
            FramebufferInvoker.unbindFramebuffer(this.p);
            ahi_2.b(this.d, frameBuffer);
            this.h = l5;
        }
    }

    @Override
    public int y() {
        return this.x() ? ahi_2.g((o1_0)this.d).viewers : 0;
    }

    @Override
    public void a(ErrorCode errorCode, AuthToken authToken) {
    }

    @Override
    public void a(StreamInfo streamInfo) {
        LoggerInvoker.d(f, c, aKo.c, new Object[]{P8.d(streamInfo.viewers), lx_2.b(streamInfo.streamId)});
    }

    @Override
    public void a(ErrorCode errorCode) {
        LoggerInvoker.a(f, c, aKo.T, new Object[]{lf_2.b(errorCode), P8.d(lf_2.d(errorCode))});
        kp_1.a(GW.f(this.q.ingameGUI), new ChatComponentText(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aKo.G), errorCode), aKo.j), lf_2.b(errorCode)), aKo.O).toString()), 2);
    }

    private boolean a(Set<ChatUserMode> set, Set<ChatUserSubscription> set2, int n) {
        return !aS0.c(set, ChatUserMode.TTV_CHAT_USERMODE_BANNED) && (aS0.c(set, ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) || aS0.c(set, ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) || aS0.c(set, ChatUserMode.TTV_CHAT_USERMODE_STAFF) || n == 1 && aS0.c(set2, ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER));
    }

    @Override
    public boolean s() {
        return ahi_2.f(this.d);
    }

    @Override
    public boolean l() {
        return ahi_2.j(this.d);
    }

    @Override
    public void z() {
        aR3 aR32 = ahi_2.s(this.d);
        iw_1.a(aR32, this);
    }

    static {
        f = LogManagerInvoker.c();
        c = aSV.a(aKo.g);
        try {
            if (Util.a() == a3t_0.WINDOWS) {
                SystemInvoker.a(aKo.Y);
                SystemInvoker.a(aKo.y);
                SystemInvoker.a(aKo.aa);
                if (StringInvoker.a(SystemInvoker.c(aKo.Z), (CharSequence)aKo.k)) {
                    SystemInvoker.a(aKo.B);
                } else {
                    SystemInvoker.a(aKo.E);
                }
            }
            o = true;
        }
        catch (Throwable throwable) {
            o = false;
        }
    }

    @Override
    public ChatUserInfo f(String string) {
        return (ChatUserInfo)MapInvoker.c(this.j, string);
    }

    @Override
    public void p() {
        GameSettings gameSettings = this.q.gameSettings;
        VideoParams videoParams = ahi_2.a(this.d, xi_1.c(gameSettings.b_), xi_1.b(gameSettings.bb), xi_1.a(gameSettings.bu), (float)this.q.displayWidth / (float)this.q.displayHeight);
        switch (gameSettings.b3) {
            case 0: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
                break;
            }
            case 1: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
                break;
            }
            case 2: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
            }
        }
        if (this.p == null) {
            this.p = new Framebuffer(videoParams.outputWidth, videoParams.outputHeight, false);
        } else {
            FramebufferInvoker.a(this.p, videoParams.outputWidth, videoParams.outputHeight);
        }
        if (gameSettings.H != null && !StringInvoker.g(gameSettings.H)) {
            for (IngestServer ingestServer : this.t()) {
                if (!ingestServer.serverUrl.equals(gameSettings.H)) continue;
                ahi_2.a(this.d, ingestServer);
                break;
            }
        }
        this.m = videoParams.targetFps;
        this.k = gameSettings.t;
        ahi_2.a(this.d, videoParams);
        LoggerInvoker.c(f, c, aKo.a, new Object[]{P8.d(videoParams.outputWidth), P8.d(videoParams.outputHeight), P8.d(videoParams.maxKbps), ahi_2.a((o1_0)this.d).serverUrl});
        ahi_2.a(this.d, null, aKo.n, null);
    }

    @Override
    public void a(boolean bl) {
        this.e = bl;
        this.j();
    }

    @Override
    public void b() {
        LoggerInvoker.a(f, c, aKo.K);
    }

    @Override
    public void g() {
        ahi_2.m(this.d);
        this.b = false;
        this.j();
    }

    static Logger a() {
        return f;
    }

    @Override
    public void a(aR3 aR32, acd_1 acd_12) {
        LoggerInvoker.d(f, c, aKo.S, new Object[]{acd_12});
    }

    @Override
    public void c() {
        LoggerInvoker.a(f, c, aKo.F);
    }

    @Override
    public void j() {
        if (this.x()) {
            float f = this.q.gameSettings.bn;
            boolean bl = this.b || f <= 0.0f;
            ahi_2.a(this.d, 0.0f);
            ahi_2.b(this.d, this.o() ? 0.0f : this.q.gameSettings.ap);
        }
    }

    @Override
    public boolean D() {
        return this.d.a();
    }

    @Override
    public boolean A() {
        return o && ahi_2.i(this.d);
    }

    public xi_1(Minecraft minecraft, Property property) {
        this.q = minecraft;
        this.d = new o1_0();
        this.n = new G8();
        ahi_2.a(this.d, this);
        ab__0.a(this.n, this);
        ahi_2.a(this.d, aKo.x);
        ab__0.f(this.n, aKo.s);
        HX.a(aBO.f(this.i), anw_0.DARK_PURPLE);
        if (!sy_2.a(po_1.b(property)) && apl_1.r) {
            J7 j7 = new J7(this, aKo.ad, property);
            ThreadInvoker.a((Thread)j7, true);
            ThreadInvoker.e(j7);
        }
    }

    @Override
    public boolean o() {
        boolean bl = this.q.gameSettings.aX == 1;
        return this.b || this.q.gameSettings.ap <= 0.0f || bl != this.e;
    }

    @Override
    public void e(ErrorCode errorCode) {
        if (lf_2.a(errorCode)) {
            LoggerInvoker.c(f, c, aKo.ab);
        }
    }

    @Override
    public void a(String string, ChatRawMessage[] chatRawMessageArray) {
        for (ChatRawMessage chatRawMessage : chatRawMessageArray) {
            this.a(chatRawMessage.userName, chatRawMessage);
            if (!this.a(chatRawMessage.modes, chatRawMessage.subscriptions, this.q.gameSettings.bi)) continue;
            ChatComponentText chatComponentText = new ChatComponentText(chatRawMessage.userName);
            aoz_1 aoz_12 = new aoz_1(aL0.a(aL0.a(new StringBuilder(), aKo.i), chatRawMessage.action ? aKo.q : aKo.e).toString(), this.i, chatComponentText, tc_0.b(chatRawMessage.message));
            if (chatRawMessage.action) {
                HX.a(aBO.f(aoz_12), Boolean.TRUE);
            }
            ChatComponentText chatComponentText2 = new ChatComponentText(aKo.b);
            aBO.a((IChatComponent)chatComponentText2, new aoz_1(aKo.r, new Object[0]));
            Object object = ListInvoker.iterator(agm_0.a(chatRawMessage.modes, chatRawMessage.subscriptions, null));
            while (dz_0.c((Iterator)object)) {
                IChatComponent iChatComponent = (IChatComponent)dz_0.b((Iterator)object);
                aBO.a((IChatComponent)chatComponentText2, aKo.M);
                aBO.a((IChatComponent)chatComponentText2, iChatComponent);
            }
            object = aBO.f(chatComponentText);
            HX.a((ChatStyle)object, new amn_0(H6.SHOW_TEXT, chatComponentText2));
            HX.a((ChatStyle)object, new awv_1(k_0.TWITCH_USER_INFO, chatRawMessage.userName));
            kp_1.a(GW.f(this.q.ingameGUI), aoz_12);
        }
    }
}

