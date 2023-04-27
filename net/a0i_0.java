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
import net.a0z_0;
import net.a4Z;
import net.a8S;
import net.a8d_0;
import net.dz_0;
import net.ms_0;

/*
 * Renamed from net.a0i
 */
public class a0i_0
extends a0z_0<GameProfile, a8S> {
    protected String a(GameProfile gameProfile) {
        return a4Z.a(gameProfile).toString();
    }

    @Override
    protected a8d_0<GameProfile> a(JsonObject jsonObject) {
        return new a8S(jsonObject);
    }

    public GameProfile a(String string) {
        Iterator iterator = ms_0.a(this.b().values());
        while (dz_0.c(iterator)) {
            a8S a8S2 = (a8S)dz_0.b(iterator);
            if (!StringInvoker.d(string, a4Z.d((GameProfile)a8S2.b()))) continue;
            return (GameProfile)a8S2.b();
        }
        return null;
    }

    @Override
    public String[] e() {
        String[] stringArray = new String[MapInvoker.a(this.b())];
        int n = 0;
        Iterator iterator = ms_0.a(this.b().values());
        while (dz_0.c(iterator)) {
            a8S a8S2 = (a8S)dz_0.b(iterator);
            stringArray[n++] = a4Z.d((GameProfile)a8S2.b());
        }
        return stringArray;
    }

    public a0i_0(File file) {
        super(file);
    }
}

