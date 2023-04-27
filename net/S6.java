/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.ChatUserMode
 *  tv.twitch.chat.ChatUserSubscription
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.GuiScreen;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.ChatComponentText;
import net.HX;
import net.I18n;
import net.QG;
import net.a5f_0;
import net.aBO;
import net.aL0;
import net.aL4;
import net.aS0;
import net.anw_0;
import net.aoz_1;
import net.dz_0;
import net.my_0;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class S6
extends GuiScreen {
    private static anw_0 x = anw_0.DARK_GREEN;
    private a5f_0 v;
    private int z;
    private static anw_0 w;
    private ChatUserInfo B;
    private List<IChatComponent> y = my_0.c();
    private IChatComponent A;
    private static anw_0 C;

    public static List<IChatComponent> a(Set<ChatUserMode> set, Set<ChatUserSubscription> set2, a5f_0 a5f_02) {
        ChatComponentText chatComponentText;
        IChatComponent iChatComponent;
        ChatUserMode chatUserMode;
        String string = null;
        boolean bl = IStreamInvoker.y(a5f_02);
        ArrayList arrayList = my_0.c();
        Iterator iterator = aS0.f(set);
        while (dz_0.c(iterator)) {
            chatUserMode = (ChatUserMode)dz_0.b(iterator);
            iChatComponent = S6.a(chatUserMode, string, bl);
            chatComponentText = new ChatComponentText(aL4.a);
            aBO.a((IChatComponent)chatComponentText, iChatComponent);
            ListInvoker.add(arrayList, chatComponentText);
        }
        iterator = aS0.f(set2);
        while (dz_0.c(iterator)) {
            chatUserMode = (ChatUserSubscription)dz_0.b(iterator);
            iChatComponent = S6.a((ChatUserSubscription)chatUserMode, string, bl);
            chatComponentText = new ChatComponentText(aL4.s);
            aBO.a((IChatComponent)chatComponentText, iChatComponent);
            ListInvoker.add(arrayList, chatComponentText);
        }
        return arrayList;
    }

    public S6(a5f_0 a5f_02, ChatUserInfo chatUserInfo) {
        this.v = a5f_02;
        this.B = chatUserInfo;
        this.A = new ChatComponentText(chatUserInfo.displayName);
        ListInvoker.addAll(this.y, S6.a(chatUserInfo.modes, chatUserInfo.subscriptions, a5f_02));
    }

    public static IChatComponent a(ChatUserMode chatUserMode, String string, boolean bl) {
        aoz_1 aoz_12 = null;
        if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
            aoz_12 = new aoz_1(aL4.u, new Object[0]);
            HX.a(aBO.f(aoz_12), w);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
            aoz_12 = new aoz_1(aL4.r, new Object[0]);
            HX.a(aBO.f(aoz_12), C);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
            aoz_12 = new aoz_1(aL4.t, new Object[0]);
            HX.a(aBO.f(aoz_12), x);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
            aoz_12 = new aoz_1(aL4.m, new Object[0]);
            HX.a(aBO.f(aoz_12), x);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
            aoz_12 = new aoz_1(aL4.l, new Object[0]);
            HX.a(aBO.f(aoz_12), w);
        }
        return aoz_12;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static IChatComponent a(ChatUserSubscription chatUserSubscription, String string, boolean bl) {
        aoz_1 aoz_12 = null;
        if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
            aoz_12 = new aoz_1(aL4.n, new Object[0]);
            HX.a(aBO.f(aoz_12), x);
        } else if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
            aoz_12 = new aoz_1(aL4.v, new Object[0]);
            HX.a(aBO.f(aoz_12), w);
        }
        return aoz_12;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, aBO.d(this.A), this.n / 2, 70, 0xFFFFFF);
        int n3 = 80;
        Iterator iterator = ListInvoker.iterator(this.y);
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            this.a(this.q, aBO.a(iChatComponent), this.z, n3, 0xFFFFFF);
            n3 += FontRendererInvoker.d(this.q);
        }
        super.a(n, n2, f);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 0) {
                IStreamInvoker.a(this.v, aL0.a(aL0.a(new StringBuilder(), aL4.j), this.B.displayName).toString());
            } else if (qG.m == 3) {
                IStreamInvoker.a(this.v, aL0.a(aL0.a(new StringBuilder(), aL4.y), this.B.displayName).toString());
            } else if (qG.m == 2) {
                IStreamInvoker.a(this.v, aL0.a(aL0.a(new StringBuilder(), aL4.d), this.B.displayName).toString());
            } else if (qG.m == 4) {
                IStreamInvoker.a(this.v, aL0.a(aL0.a(new StringBuilder(), aL4.q), this.B.displayName).toString());
            } else if (qG.m == 1) {
                IStreamInvoker.a(this.v, aL0.a(aL0.a(new StringBuilder(), aL4.x), this.B.displayName).toString());
            }
            MCInvoker.displayGuiScreen(this.t, null);
        }
    }

    @Override
    public void l() {
        int n = this.n / 3;
        int n2 = n - 130;
        ListInvoker.add(this.l, new QG(1, n * 0 + n2 / 2, this.f - 70, 130, 20, I18n.format(aL4.p, new Object[0])));
        ListInvoker.add(this.l, new QG(0, n * 1 + n2 / 2, this.f - 70, 130, 20, I18n.format(aL4.i, new Object[0])));
        ListInvoker.add(this.l, new QG(2, n * 2 + n2 / 2, this.f - 70, 130, 20, I18n.format(aL4.k, new Object[0])));
        ListInvoker.add(this.l, new QG(5, n * 0 + n2 / 2, this.f - 45, 130, 20, I18n.format(aL4.f, new Object[0])));
        ListInvoker.add(this.l, new QG(3, n * 1 + n2 / 2, this.f - 45, 130, 20, I18n.format(aL4.h, new Object[0])));
        ListInvoker.add(this.l, new QG(4, n * 2 + n2 / 2, this.f - 45, 130, 20, I18n.format(aL4.e, new Object[0])));
        int n3 = 0;
        Iterator iterator = ListInvoker.iterator(this.y);
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            n3 = MathInvoker.max(n3, FontRendererInvoker.a(this.q, aBO.a(iChatComponent)));
        }
        this.z = this.n / 2 - n3 / 2;
    }

    static {
        C = anw_0.RED;
        w = anw_0.DARK_PURPLE;
    }
}

