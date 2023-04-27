/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 */
package net;

import net.amq_0;
import net.asx_0;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;

/*
 * Renamed from net.aWb
 */
public class awb_0 {
    public static void a(amq_0 amq_02, ErrorCode errorCode) {
        amq_02.d(errorCode);
    }

    public static void a(amq_0 amq_02, String string, ChatTokenizedMessage[] chatTokenizedMessageArray) {
        amq_02.a(string, chatTokenizedMessageArray);
    }

    public static void a(amq_0 amq_02, String string, ChatUserInfo[] chatUserInfoArray, ChatUserInfo[] chatUserInfoArray2, ChatUserInfo[] chatUserInfoArray3) {
        amq_02.a(string, chatUserInfoArray, chatUserInfoArray2, chatUserInfoArray3);
    }

    public static void b(amq_0 amq_02, ErrorCode errorCode) {
        amq_02.e(errorCode);
    }

    public static void d(amq_0 amq_02, String string) {
        amq_02.d(string);
    }

    public static void a(amq_0 amq_02, String string, String string2) {
        amq_02.a(string, string2);
    }

    public static void c(amq_0 amq_02, String string) {
        amq_02.b(string);
    }

    public static void a(amq_0 amq_02, asx_0 asx_02) {
        amq_02.a(asx_02);
    }

    public static void b(amq_0 amq_02, String string) {
        amq_02.c(string);
    }

    public static void b(amq_0 amq_02) {
        amq_02.d();
    }

    public static void a(amq_0 amq_02, String string) {
        amq_02.a(string);
    }

    public static void a(amq_0 amq_02) {
        amq_02.e();
    }

    public static void a(amq_0 amq_02, String string, ChatRawMessage[] chatRawMessageArray) {
        amq_02.a(string, chatRawMessageArray);
    }
}

