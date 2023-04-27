/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import deobf.PlayerProfileCache;
import java.util.Date;
import net.aq5;

/*
 * Renamed from net.aYp
 */
class ayp_0 {
    private GameProfile c;
    PlayerProfileCache b;
    private Date a;

    ayp_0(PlayerProfileCache playerProfileCache, GameProfile gameProfile, Date date, aq5 aq52) {
        this(playerProfileCache, gameProfile, date);
    }

    public GameProfile b() {
        return this.c;
    }

    private ayp_0(PlayerProfileCache playerProfileCache, GameProfile gameProfile, Date date) {
        this.b = playerProfileCache;
        this.c = gameProfile;
        this.a = date;
    }

    static Date a(ayp_0 ayp_02) {
        return ayp_02.a;
    }

    public Date a() {
        return this.a;
    }
}

