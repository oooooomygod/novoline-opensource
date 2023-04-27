/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SessionInvoker;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.Proxy;
import net.AltRepositoryGUI;
import net.Session;
import net.UJ;
import net.a4Z;
import net.a6m;
import net.ad_1;
import net.ais_0;
import net.akh_0;
import net.aks_1;
import net.alc_0;
import net.apt_0;
import net.ayb_0;
import net.aye_0;
import net.dx_0;
import net.ea_1;
import net.ex_0;
import net.z_0;
import net.zd_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.aqX
 */
public class aqx_1 {
    private static z_0 b = UJ.a();
    private @Nullable String c;
    public @Nullable dx_0 e;
    private @Nullable AltRepositoryGUI d;
    public @NonNull ais_0 a;

    public aqx_1(@NonNull AltRepositoryGUI altRepositoryGUI, @NonNull ais_0 ais_02, @NonNull dx_0 dx_02) {
        aye_0.b();
        this.a = ais_02;
        this.e = dx_02;
        this.d = altRepositoryGUI;
        UJ.a(b, ayb_0.MOJANG);
        if (ListInvoker.b() != null) {
            aye_0.b(new int[4]);
        }
    }

    public aqx_1(@NonNull ais_0 ais_02, @Nullable String string) {
        this.a = ais_02;
        this.c = string;
        UJ.a(b, ayb_0.MOJANG);
    }

    public @Nullable Session a() {
        aye_0.b();
        Session session = new Session(aks_1.b(this.a), alc_0.e, alc_0.c, alc_0.b);
        ea_1.a(System.out, SessionInvoker.getUsername(session));
        if (this.e != null) {
            ad_1.a(this.e, apt_0.CRACKED, session);
            zd_2.b(this.d, null);
        }
        ListInvoker.b(new ListInvoker[2]);
        return session;
    }

    public static @Nullable Session a(String string) {
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, alc_0.a);
        YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)akh_0.a(yggdrasilAuthenticationService, Agent.MINECRAFT);
        a6m.a(yggdrasilUserAuthentication, string);
        try {
            a6m.b(yggdrasilUserAuthentication);
            GameProfile gameProfile = a6m.a(yggdrasilUserAuthentication);
            return new Session(a4Z.d(gameProfile), a4Z.a(gameProfile).toString(), a6m.c(yggdrasilUserAuthentication), alc_0.d);
        }
        catch (AuthenticationException authenticationException) {
            ex_0.b(authenticationException);
            return null;
        }
    }
}

