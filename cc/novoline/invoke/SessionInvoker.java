/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package cc.novoline.invoke;

import com.mojang.authlib.GameProfile;
import net.Session;
import net.Type;

public class SessionInvoker {
    public static Type b(Session session) {
        return session.f();
    }

    public static String d(Session session) {
        return session.a();
    }

    public static String getUsername(Session session) {
        return session.e();
    }

    public static String getPlayerID(Session session) {
        return session.c();
    }

    public static String c(Session session) {
        return session.b();
    }

    public static GameProfile a(Session session) {
        return session.d();
    }
}

