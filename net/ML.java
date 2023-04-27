/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ServerInvoker;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import deobf.MinecraftServer;
import java.util.List;
import net.TT;
import net.a0Q;
import net.a4Z;
import net.aL0;
import net.aUu;

class ML
implements ProfileLookupCallback {
    MinecraftServer a;
    List b;

    ML(MinecraftServer minecraftServer, List list) {
        this.a = minecraftServer;
        this.b = list;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        aUu.a(ServerInvoker.L(this.a), gameProfile);
        ListInvoker.add(this.b, gameProfile);
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        LoggerInvoker.b(TT.a(), aL0.a(aL0.a(new StringBuilder(), a0Q.a), a4Z.d(gameProfile)).toString(), exception);
    }
}

