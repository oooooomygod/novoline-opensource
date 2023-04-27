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
import net.P8;
import net.WN;
import net.a4Z;
import net.a8d_0;
import net.auk_2;
import net.awc_1;
import net.qc_1;


public class a8X
extends a8d_0<GameProfile> {
    private int b;
    private boolean c;

    public a8X(JsonObject jsonObject) {
        super(a8X.a(jsonObject), jsonObject);
        this.b = M0.c(jsonObject, qc_1.g) ? WN.e(M0.d(jsonObject, qc_1.b)) : 0;
        this.c = M0.c(jsonObject, qc_1.i) && WN.b(M0.d(jsonObject, qc_1.j));
    }

    public a8X(GameProfile gameProfile, int n, boolean bl) {
        super(gameProfile);
        this.b = n;
        this.c = bl;
    }

    public int a() {
        return this.b;
    }

    private static GameProfile a(JsonObject jsonObject) {
        if (M0.c(jsonObject, qc_1.f) && M0.c(jsonObject, qc_1.d)) {
            UUID uUID;
            String string = WN.f(M0.d(jsonObject, qc_1.c));
            try {
                uUID = awc_1.a(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, WN.f(M0.d(jsonObject, qc_1.l)));
        }
        return null;
    }

    @Override
    public boolean b() {
        return this.c;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    protected void a(JsonObject jsonObject) {
        if (this.b() != null) {
            M0.a(jsonObject, qc_1.e, a4Z.a((GameProfile)this.b()) == null ? qc_1.h : a4Z.a((GameProfile)this.b()).toString());
            M0.a(jsonObject, qc_1.k, a4Z.d((GameProfile)this.b()));
            super.a(jsonObject);
            M0.a(jsonObject, qc_1.a, P8.d(this.b));
            M0.a(jsonObject, qc_1.m, auk_2.b(this.c));
        }
    }
}

