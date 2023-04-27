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
import java.util.UUID;
import net.M0;
import net.WN;
import net.a4Z;
import net.a8d_0;
import net.awc_1;
import net.hp_1;


public class a8S
extends a8d_0<GameProfile> {
    public a8S(JsonObject jsonObject) {
        super(a8S.a(jsonObject), jsonObject);
    }

    @Override
    protected void a(JsonObject jsonObject) {
        if (this.b() != null) {
            M0.a(jsonObject, hp_1.a, a4Z.a((GameProfile)this.b()) == null ? hp_1.f : a4Z.a((GameProfile)this.b()).toString());
            M0.a(jsonObject, hp_1.c, a4Z.d((GameProfile)this.b()));
            super.a(jsonObject);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public a8S(GameProfile gameProfile) {
        super(gameProfile);
    }

    private static GameProfile a(JsonObject jsonObject) {
        if (M0.c(jsonObject, hp_1.d) && M0.c(jsonObject, hp_1.g)) {
            UUID uUID;
            String string = WN.f(M0.d(jsonObject, hp_1.b));
            try {
                uUID = awc_1.a(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, WN.f(M0.d(jsonObject, hp_1.e)));
        }
        return null;
    }
}

