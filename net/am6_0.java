/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ServerInvoker;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;
import net.EE;
import net.a4Z;
import net.a8T;
import net.aL0;
import net.aSI;
import net.apn_2;
import net.md_0;
import net.rk_1;
import net.sr_2;

/*
 * Renamed from net.am6
 */
class am6_0
extends Thread {
    md_0 a;

    private static AuthenticationUnavailableException a(AuthenticationUnavailableException authenticationUnavailableException) {
        return authenticationUnavailableException;
    }

    @Override
    public void run() {
        block7: {
            GameProfile gameProfile;
            block6: {
                block5: {
                    gameProfile = md_0.c(this.a);
                    String string = apn_2.a(new BigInteger(rk_1.a(sr_2.c, EE.b(ServerInvoker.D(md_0.a(this.a))), md_0.b(this.a))), 16);
                    md_0.a(this.a, aSI.a(ServerInvoker.u(md_0.a(this.a)), new GameProfile(null, a4Z.d(gameProfile)), string));
                    if (md_0.c(this.a) == null) break block5;
                    LoggerInvoker.info(md_0.b(), aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), sr_2.f), a4Z.d(md_0.c(this.a))), sr_2.h), a4Z.a(md_0.c(this.a))).toString());
                    md_0.a(this.a, a8T.READY_TO_ACCEPT);
                }
                if (!ServerInvoker.T(md_0.a(this.a))) break block6;
                LoggerInvoker.warn(md_0.b(), sr_2.i);
                md_0.a(this.a, this.a.a(gameProfile));
                md_0.a(this.a, a8T.READY_TO_ACCEPT);
            }
            try {
                this.a.a(sr_2.j);
                LoggerInvoker.f(md_0.b(), aL0.a(aL0.a(aL0.a(new StringBuilder(), sr_2.d), a4Z.d(md_0.c(this.a))), sr_2.g).toString());
            }
            catch (AuthenticationUnavailableException authenticationUnavailableException) {
                if (ServerInvoker.T(md_0.a(this.a))) {
                    LoggerInvoker.warn(md_0.b(), sr_2.e);
                    md_0.a(this.a, this.a.a(gameProfile));
                    md_0.a(this.a, a8T.READY_TO_ACCEPT);
                    break block7;
                }
                this.a.a(sr_2.b);
                LoggerInvoker.f(md_0.b(), sr_2.a);
            }
        }
    }

    am6_0(md_0 md_02, String string) {
        this.a = md_02;
        super(string);
    }
}

