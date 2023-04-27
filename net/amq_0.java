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

import net.asx_0;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;

/*
 * Renamed from net.aMq
 */
public interface amq_0 {
    public void a(asx_0 var1);

    public void a(String var1);

    public void a(String var1, ChatRawMessage[] var2);

    public void d(String var1);

    public void a(String var1, ChatTokenizedMessage[] var2);

    public void a(String var1, ChatUserInfo[] var2, ChatUserInfo[] var3, ChatUserInfo[] var4);

    public void d(ErrorCode var1);

    public void b(String var1);

    public void e(ErrorCode var1);

    public void c(String var1);

    public void e();

    public void a(String var1, String var2);

    public void d();
}

