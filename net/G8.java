/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.AuthToken
 *  tv.twitch.Core
 *  tv.twitch.CoreAPI
 *  tv.twitch.ErrorCode
 *  tv.twitch.StandardCoreAPI
 *  tv.twitch.chat.Chat
 *  tv.twitch.chat.ChatAPI
 *  tv.twitch.chat.ChatEmoticonData
 *  tv.twitch.chat.ChatTokenizationOption
 *  tv.twitch.chat.IChatAPIListener
 *  tv.twitch.chat.StandardChatAPI
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import java.util.HashMap;
import java.util.HashSet;
import net.BM;
import net.PG;
import net.a0m_0;
import net.aA2;
import net.aL0;
import net.afa_2;
import net.amq_0;
import net.as7_0;
import net.asx_0;
import net.avz_0;
import net.awb_0;
import net.ds_2;
import net.lf_2;
import net.vg_1;
import net.xi_1;
import net.yp_0;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.CoreAPI;
import tv.twitch.ErrorCode;
import tv.twitch.StandardCoreAPI;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatAPI;
import tv.twitch.chat.ChatEmoticonData;
import tv.twitch.chat.ChatTokenizationOption;
import tv.twitch.chat.IChatAPIListener;
import tv.twitch.chat.StandardChatAPI;

public class G8 {
    protected Core k;
    protected Chat g;
    protected asx_0 l;
    protected int e = 2000;
    protected String n = afa_2.i;
    protected HashMap<String, as7_0> p;
    protected String h = afa_2.b;
    private static Logger d = LogManagerInvoker.c();
    protected AuthToken f;
    protected ChatEmoticonData o = null;
    protected vg_1 a;
    protected IChatAPIListener j;
    protected amq_0 b = null;
    protected int m = 128;
    protected int i = 500;
    protected String q = afa_2.e;
    protected vg_1 c;

    protected void c(String string) {
        LoggerInvoker.b(d, xi_1.c, afa_2.m, new Object[]{string});
    }

    protected boolean a(String string, boolean bl) {
        if (this.l != asx_0.Initialized) {
            return false;
        }
        if (ds_2.b(this.p, string)) {
            this.c(aL0.a(aL0.a(new StringBuilder(), afa_2.k), string).toString());
            return false;
        }
        if (!string.equals(afa_2.g)) {
            as7_0 as7_02 = new as7_0(this, string);
            ds_2.a(this.p, string, as7_02);
            boolean bl2 = a0m_0.a(as7_02, bl);
            ds_2.c(this.p, string);
            return bl2;
        }
        return false;
    }

    public boolean d(String string) {
        return this.a(string, false);
    }

    protected void b() {
        ErrorCode errorCode;
        if (this.a != vg_1.None && this.o == null && lf_2.a(errorCode = BM.a(this.g))) {
            String string = lf_2.b(errorCode);
            this.c(StringInvoker.a(afa_2.a, new Object[]{string}));
        }
    }

    protected void a(asx_0 asx_02) {
        if (asx_02 != this.l) {
            this.l = asx_02;
            try {
                if (this.b != null) {
                    awb_0.a(this.b, asx_02);
                }
            }
            catch (Exception exception) {
                this.c(exception.toString());
            }
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    public void c() {
        if (this.g() != asx_0.Uninitialized) {
            this.h();
            if (this.g() == asx_0.ShuttingDown) {
                while (this.g() != asx_0.Uninitialized) {
                    try {
                        ThreadInvoker.sleep(200L);
                        this.a();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
        }
    }

    public boolean a(String string) {
        if (!ds_2.b(this.p, string)) {
            return false;
        }
        as7_0 as7_02 = (as7_0)ds_2.a(this.p, string);
        return a0m_0.b(as7_02) == aA2.Connected;
    }

    public asx_0 g() {
        return this.l;
    }

    public boolean d() {
        if (this.l != asx_0.Uninitialized) {
            return false;
        }
        this.a(asx_0.Initializing);
        ErrorCode errorCode = PG.a(this.k, this.h, null);
        if (lf_2.a(errorCode)) {
            this.a(asx_0.Uninitialized);
            String string = lf_2.b(errorCode);
            this.c(StringInvoker.a(afa_2.h, new Object[]{string}));
            return false;
        }
        this.a = this.c;
        HashSet hashSet = new HashSet();
        switch (this.c) {
            case None: {
                yp_0.a(hashSet, ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE);
                break;
            }
            case Url: {
                yp_0.a(hashSet, ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS);
                break;
            }
            case TextureAtlas: {
                yp_0.a(hashSet, ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES);
            }
        }
        errorCode = BM.a(this.g, hashSet, this.j);
        if (lf_2.a(errorCode)) {
            PG.a(this.k);
            this.a(asx_0.Uninitialized);
            String string = lf_2.b(errorCode);
            this.c(StringInvoker.a(afa_2.c, new Object[]{string}));
            return false;
        }
        this.a(asx_0.Initialized);
        return true;
    }

    public G8() {
        this.l = asx_0.Uninitialized;
        this.f = new AuthToken();
        this.p = new HashMap();
        this.c = vg_1.None;
        this.a = vg_1.None;
        this.j = new avz_0(this);
        this.k = PG.a();
        if (this.k == null) {
            this.k = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.g = new Chat((ChatAPI)new StandardChatAPI());
    }

    public void a() {
        ErrorCode errorCode;
        if (this.l != asx_0.Uninitialized && lf_2.a(errorCode = BM.c(this.g))) {
            String string = lf_2.b(errorCode);
            this.c(StringInvoker.a(afa_2.l, new Object[]{string}));
        }
    }

    public boolean a(String string, String string2) {
        if (this.l != asx_0.Initialized) {
            return false;
        }
        if (!ds_2.b(this.p, string)) {
            this.c(aL0.a(aL0.a(new StringBuilder(), afa_2.n), string).toString());
            return false;
        }
        as7_0 as7_02 = (as7_0)ds_2.a(this.p, string);
        return a0m_0.a(as7_02, string2);
    }

    public aA2 f(String string) {
        if (!ds_2.b(this.p, string)) {
            return aA2.Disconnected;
        }
        as7_0 as7_02 = (as7_0)ds_2.a(this.p, string);
        return a0m_0.b(as7_02);
    }

    public boolean b(String string) {
        if (this.l != asx_0.Initialized) {
            return false;
        }
        if (!ds_2.b(this.p, string)) {
            this.c(aL0.a(aL0.a(new StringBuilder(), afa_2.f), string).toString());
            return false;
        }
        as7_0 as7_02 = (as7_0)ds_2.a(this.p, string);
        return a0m_0.a(as7_02);
    }

    public void a(AuthToken authToken) {
        this.f = authToken;
    }

    protected void e() {
        if (this.o != null) {
            ErrorCode errorCode = BM.d(this.g);
            if (lf_2.c(errorCode)) {
                this.o = null;
                try {
                    if (this.b != null) {
                        awb_0.b(this.b);
                    }
                }
                catch (Exception exception) {
                    this.c(exception.toString());
                }
            } else {
                this.c(aL0.a(aL0.a(new StringBuilder(), afa_2.j), lf_2.b(errorCode)).toString());
            }
        }
    }

    public boolean h() {
        if (this.l != asx_0.Initialized) {
            return false;
        }
        ErrorCode errorCode = BM.b(this.g);
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.c(StringInvoker.a(afa_2.o, new Object[]{string}));
            return false;
        }
        this.e();
        this.a(asx_0.ShuttingDown);
        return true;
    }

    public void a(amq_0 amq_02) {
        this.b = amq_02;
    }

    public void e(String string) {
        this.n = string;
    }

    public void g(String string) {
        this.h = string;
    }

    protected void f() {
        if (this.o == null) {
            this.o = new ChatEmoticonData();
            ErrorCode errorCode = BM.a(this.g, this.o);
            if (lf_2.c(errorCode)) {
                try {
                    if (this.b != null) {
                        awb_0.a(this.b);
                    }
                }
                catch (Exception exception) {
                    this.c(exception.toString());
                }
            } else {
                this.c(aL0.a(aL0.a(new StringBuilder(), afa_2.d), lf_2.b(errorCode)).toString());
            }
        }
    }
}

