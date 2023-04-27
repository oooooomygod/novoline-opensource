/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;
import net.M0;
import net.WN;
import net.a4Z;
import net.a8N;
import net.aw5_0;
import net.awc_1;


public class a88
extends a8N<GameProfile> {
    public a88(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        super(gameProfile, date2, string, date2, string2);
    }

    public a88(JsonObject jsonObject) {
        super(a88.a(jsonObject), jsonObject);
    }

    public a88(GameProfile gameProfile) {
        this(gameProfile, (Date)null, (String)null, (Date)null, (String)null);
    }

    private static GameProfile a(JsonObject jsonObject) {
        if (M0.c(jsonObject, aw5_0.b) && M0.c(jsonObject, aw5_0.d)) {
            UUID uUID;
            String string = WN.f(M0.d(jsonObject, aw5_0.a));
            try {
                uUID = awc_1.a(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, WN.f(M0.d(jsonObject, aw5_0.c)));
        }
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    protected void a(JsonObject jsonObject) {
        if (this.b() != null) {
            M0.a(jsonObject, aw5_0.f, a4Z.a((GameProfile)this.b()) == null ? aw5_0.e : a4Z.a((GameProfile)this.b()).toString());
            M0.a(jsonObject, aw5_0.g, a4Z.d((GameProfile)this.b()));
            super.a(jsonObject);
        }
    }
}

