/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.StreamInfo
 */
package net;

import net.aj9;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;

/*
 * Renamed from net.azu
 */
public interface azu_2 {
    public void a(ErrorCode var1, AuthToken var2);

    public void c(ErrorCode var1);

    public void c();

    public void a(ErrorCode var1);

    public void b();

    public void a(StreamInfo var1);

    public void a(IngestList var1);

    public void b(ErrorCode var1);

    public void a(ErrorCode var1, GameInfo[] var2);

    public void a();

    public void a(aj9 var1);
}

