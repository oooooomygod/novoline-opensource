/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;
import net.SN;
import net.a0z_0;
import net.a4Z;
import net.a8X;
import net.a8d_0;
import net.dz_0;
import net.ms_0;

public class a0N
extends a0z_0<GameProfile, a8X> {
    public a0N(File file) {
        super(file);
    }

    public boolean b(GameProfile gameProfile) {
        a8X a8X2 = (a8X)this.c(gameProfile);
        return SN.a(a8X2);
    }

    protected String a(GameProfile gameProfile) {
        return a4Z.a(gameProfile).toString();
    }

    @Override
    protected a8d_0<GameProfile> a(JsonObject jsonObject) {
        return new a8X(jsonObject);
    }

    @Override
    public String[] e() {
        String[] stringArray = new String[MapInvoker.a(this.b())];
        int n = 0;
        Iterator iterator = ms_0.a(this.b().values());
        while (dz_0.c(iterator)) {
            a8X a8X2 = (a8X)dz_0.b(iterator);
            stringArray[n++] = a4Z.d((GameProfile)a8X2.b());
        }
        return stringArray;
    }

    public GameProfile a(String string) {
        Iterator iterator = ms_0.a(this.b().values());
        while (dz_0.c(iterator)) {
            a8X a8X2 = (a8X)dz_0.b(iterator);
            if (!StringInvoker.d(string, a4Z.d((GameProfile)a8X2.b()))) continue;
            return (GameProfile)a8X2.b();
        }
        return null;
    }
}

