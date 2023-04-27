/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.ChatBadgeData
 *  tv.twitch.chat.ChatChannelInfo
 *  tv.twitch.chat.ChatEvent
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.IChatChannelListener
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import net.BM;
import net.G8;
import net.JY;
import net.aA2;
import net.aL0;
import net.aky_1;
import net.awb_0;
import net.ds_2;
import net.lf_2;
import net.my_0;
import net.qg_0;
import net.vg_1;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatChannelListener;

/*
 * Renamed from net.as7
 */
public class as7_0
implements IChatChannelListener {
    protected LinkedList<ChatTokenizedMessage> e;
    protected ChatBadgeData h;
    G8 b;
    protected boolean c;
    protected List<ChatUserInfo> a;
    protected LinkedList<ChatRawMessage> g;
    protected String d;
    protected aA2 f;

    protected void f() {
        ErrorCode errorCode;
        if (this.b.a != vg_1.None && this.h == null && lf_2.a(errorCode = BM.a(this.b.g, this.d))) {
            String string = lf_2.b(errorCode);
            this.b.c(StringInvoker.a(qg_0.d, new Object[]{string}));
        }
    }

    public aA2 c() {
        return this.f;
    }

    public as7_0(G8 g8, String string) {
        this.b = g8;
        this.d = null;
        this.c = false;
        this.f = aA2.Created;
        this.a = my_0.c();
        this.g = new LinkedList();
        this.e = new LinkedList();
        this.h = null;
        this.d = string;
    }

    public boolean a(boolean bl) {
        this.c = bl;
        ErrorCode errorCode = ErrorCode.TTV_EC_SUCCESS;
        errorCode = BM.a(this.b.g, this.d, this);
        if (lf_2.a(errorCode)) {
            String string = lf_2.b(errorCode);
            this.b.c(StringInvoker.a(qg_0.a, new Object[]{string}));
            this.c(this.d);
            return false;
        }
        this.a(aA2.Connecting);
        this.f();
        return true;
    }

    public void chatChannelMembershipCallback(String string, ChatEvent chatEvent, ChatChannelInfo chatChannelInfo) {
        switch (chatEvent) {
            case TTV_CHAT_JOINED_CHANNEL: {
                this.a(aA2.Connected);
                this.d(string);
                break;
            }
            case TTV_CHAT_LEFT_CHANNEL: {
                this.b();
            }
        }
    }

    public void b(String string) {
        if (this.b.a == vg_1.None) {
            aky_1.e(this.g);
            aky_1.e(this.e);
        } else {
            ChatRawMessage chatRawMessage;
            ListIterator listIterator;
            if (!aky_1.c(this.g)) {
                listIterator = aky_1.a(this.g);
                while (JY.c(listIterator)) {
                    chatRawMessage = (ChatRawMessage)JY.a(listIterator);
                    if (!chatRawMessage.userName.equals(string)) continue;
                    JY.b(listIterator);
                }
            }
            if (!aky_1.c(this.e)) {
                listIterator = aky_1.a(this.e);
                while (JY.c(listIterator)) {
                    chatRawMessage = (ChatTokenizedMessage)JY.a(listIterator);
                    if (!chatRawMessage.displayName.equals(string)) continue;
                    JY.b(listIterator);
                }
            }
        }
        try {
            if (this.b.b != null) {
                awb_0.a(this.b.b, this.d, string);
            }
        }
        catch (Exception exception) {
            this.b.c(exception.toString());
        }
    }

    protected void d() {
        if (this.h == null) {
            this.h = new ChatBadgeData();
            ErrorCode errorCode = BM.a(this.b.g, this.d, this.h);
            if (lf_2.c(errorCode)) {
                try {
                    if (this.b.b != null) {
                        awb_0.d(this.b.b, this.d);
                    }
                }
                catch (Exception exception) {
                    this.b.c(exception.toString());
                }
            } else {
                this.b.c(aL0.a(aL0.a(new StringBuilder(), qg_0.b), lf_2.b(errorCode)).toString());
            }
        }
    }

    public void chatChannelRawMessageCallback(String string, ChatRawMessage[] chatRawMessageArray) {
        for (ChatRawMessage chatRawMessage : chatRawMessageArray) {
            aky_1.d(this.g, chatRawMessage);
        }
        try {
            if (this.b.b != null) {
                awb_0.a(this.b.b, this.d, chatRawMessageArray);
            }
        }
        catch (Exception exception) {
            this.b.c(exception.toString());
        }
        while (aky_1.d(this.g) > this.b.m) {
            aky_1.g(this.g);
        }
    }

    protected void d(String string) {
        try {
            if (this.b.b != null) {
                awb_0.a(this.b.b, string);
            }
        }
        catch (Exception exception) {
            this.b.c(exception.toString());
        }
    }

    protected void e() {
        if (this.h != null) {
            ErrorCode errorCode = BM.c(this.b.g, this.d);
            if (lf_2.c(errorCode)) {
                this.h = null;
                try {
                    if (this.b.b != null) {
                        awb_0.b(this.b.b, this.d);
                    }
                }
                catch (Exception exception) {
                    this.b.c(exception.toString());
                }
            } else {
                this.b.c(aL0.a(aL0.a(new StringBuilder(), qg_0.e), lf_2.b(errorCode)).toString());
            }
        }
    }

    public void chatStatusCallback(String string, ErrorCode errorCode) {
        if (!lf_2.c(errorCode)) {
            ds_2.c(this.b.p, string);
            this.b();
        }
    }

    protected void a(aA2 aA22) {
        if (aA22 != this.f) {
            this.f = aA22;
        }
    }

    protected void c(String string) {
        try {
            if (this.b.b != null) {
                awb_0.c(this.b.b, string);
            }
        }
        catch (Exception exception) {
            this.b.c(exception.toString());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void chatChannelUserChangeCallback(String string, ChatUserInfo[] chatUserInfoArray, ChatUserInfo[] chatUserInfoArray2, ChatUserInfo[] chatUserInfoArray3) {
        int n;
        for (ChatUserInfo chatUserInfo : chatUserInfoArray2) {
            n = ListInvoker.indexOf(this.a, chatUserInfo);
            ListInvoker.remove(this.a, n);
        }
        for (ChatUserInfo chatUserInfo : chatUserInfoArray3) {
            n = ListInvoker.indexOf(this.a, chatUserInfo);
            ListInvoker.remove(this.a, n);
            ListInvoker.add(this.a, chatUserInfo);
        }
        for (ChatUserInfo chatUserInfo : chatUserInfoArray) {
            ListInvoker.add(this.a, chatUserInfo);
        }
        try {
            if (this.b.b != null) {
                awb_0.a(this.b.b, this.d, chatUserInfoArray, chatUserInfoArray2, chatUserInfoArray3);
            }
        }
        catch (Exception exception) {
            this.b.c(exception.toString());
        }
    }

    public boolean a(String string) {
        if (this.f != aA2.Connected) {
            return false;
        }
        ErrorCode errorCode = BM.a(this.b.g, this.d, string);
        if (lf_2.a(errorCode)) {
            String string2 = lf_2.b(errorCode);
            this.b.c(StringInvoker.a(qg_0.c, new Object[]{string2}));
            return false;
        }
        return true;
    }

    public boolean a() {
        switch (this.f) {
            case Connected: 
            case Connecting: {
                ErrorCode errorCode = BM.b(this.b.g, this.d);
                if (lf_2.a(errorCode)) {
                    String string = lf_2.b(errorCode);
                    this.b.c(StringInvoker.a(qg_0.f, new Object[]{string}));
                    return false;
                }
                this.a(aA2.Disconnecting);
                return true;
            }
        }
        return false;
    }

    public void chatBadgeDataDownloadCallback(String string, ErrorCode errorCode) {
        if (lf_2.c(errorCode)) {
            this.d();
        }
    }

    public void chatClearCallback(String string, String string2) {
        this.b(string2);
    }

    public void chatChannelTokenizedMessageCallback(String string, ChatTokenizedMessage[] chatTokenizedMessageArray) {
        for (ChatTokenizedMessage chatTokenizedMessage : chatTokenizedMessageArray) {
            aky_1.d(this.e, chatTokenizedMessage);
        }
        try {
            if (this.b.b != null) {
                awb_0.a(this.b.b, this.d, chatTokenizedMessageArray);
            }
        }
        catch (Exception exception) {
            this.b.c(exception.toString());
        }
        while (aky_1.d(this.e) > this.b.m) {
            aky_1.g(this.e);
        }
    }

    private void b() {
        if (this.f != aA2.Disconnected) {
            this.a(aA2.Disconnected);
            this.c(this.d);
            this.e();
        }
    }
}

