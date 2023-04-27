/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.Chat
 *  tv.twitch.chat.ChatBadgeData
 *  tv.twitch.chat.ChatEmoticonData
 *  tv.twitch.chat.IChatAPIListener
 *  tv.twitch.chat.IChatChannelListener
 */
package net;

import java.util.HashSet;
import tv.twitch.ErrorCode;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatEmoticonData;
import tv.twitch.chat.IChatAPIListener;
import tv.twitch.chat.IChatChannelListener;

public class BM {
    private static boolean b;

    public static ErrorCode c(Chat chat) {
        return chat.flushEvents();
    }

    public static ErrorCode b(Chat chat, String string) {
        return chat.disconnect(string);
    }

    public static ErrorCode a(Chat chat, HashSet hashSet, IChatAPIListener iChatAPIListener) {
        return chat.initialize(hashSet, iChatAPIListener);
    }

    public static ErrorCode a(Chat chat, String string, IChatChannelListener iChatChannelListener) {
        return chat.connectAnonymous(string, iChatChannelListener);
    }

    public static ErrorCode a(Chat chat) {
        return chat.downloadEmoticonData();
    }

    public static ErrorCode a(Chat chat, String string, ChatBadgeData chatBadgeData) {
        return chat.getBadgeData(string, chatBadgeData);
    }

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        BM.b();
        return true;
    }

    public static ErrorCode a(Chat chat, String string) {
        return chat.downloadBadgeData(string);
    }

    public static ErrorCode c(Chat chat, String string) {
        return chat.clearBadgeData(string);
    }

    static {
        if (BM.c()) {
            BM.b(true);
        }
    }

    public static ErrorCode a(Chat chat, String string, String string2, String string3, IChatChannelListener iChatChannelListener) {
        return chat.connect(string, string2, string3, iChatChannelListener);
    }

    public static ErrorCode b(Chat chat) {
        return chat.shutdown();
    }

    public static ErrorCode b(Chat chat, int n) {
        return chat.setMessageFlushInterval(n);
    }

    public static ErrorCode a(Chat chat, String string, String string2) {
        return chat.sendMessage(string, string2);
    }

    public static ErrorCode a(Chat chat, ChatEmoticonData chatEmoticonData) {
        return chat.getEmoticonData(chatEmoticonData);
    }

    public static ErrorCode a(Chat chat, int n) {
        return chat.setUserChangeEventInterval(n);
    }

    public static ErrorCode d(Chat chat) {
        return chat.clearEmoticonData();
    }
}

