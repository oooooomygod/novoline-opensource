/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.properties.Property
 *  tv.twitch.AuthToken
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.net.URL;
import net.B8;
import net.Ei;
import net.a1r;
import net.aL0;
import net.aZF;
import net.ab__0;
import net.afr_1;
import net.ahi_2;
import net.als_2;
import net.azh_1;
import net.p1_0;
import net.po_1;
import net.xi_1;
import tv.twitch.AuthToken;

class J7
extends Thread {
    xi_1 a;
    Property b;

    @Override
    public void run() {
        try {
            URL uRL = new URL(aL0.a(aL0.a(new StringBuilder(), B8.e), azh_1.a(po_1.b(this.b), B8.g)).toString());
            String string = p1_0.a(uRL);
            JsonObject jsonObject = Ei.d(a1r.a(new JsonParser(), string), B8.b);
            JsonObject jsonObject2 = Ei.a(jsonObject, B8.h);
            if (Ei.d(jsonObject2, B8.d)) {
                String string2 = Ei.f(jsonObject2, B8.f);
                LoggerInvoker.d(xi_1.a(), xi_1.c, B8.a, new Object[]{string2});
                AuthToken authToken = new AuthToken();
                authToken.data = po_1.b(this.b);
                ahi_2.a(xi_1.a(this.a), string2, authToken);
                ab__0.c(xi_1.b(this.a), string2);
                ab__0.a(xi_1.b(this.a), authToken);
                als_2.a(als_2.a(), new afr_1(this, B8.i));
                ahi_2.o(xi_1.a(this.a));
                ab__0.d(xi_1.b(this.a));
            } else {
                xi_1.a(this.a, aZF.INVALID_TOKEN);
                LoggerInvoker.c(xi_1.a(), xi_1.c, B8.j);
            }
        }
        catch (IOException iOException) {
            xi_1.a(this.a, aZF.ERROR);
            LoggerInvoker.a(xi_1.a(), xi_1.c, B8.c, iOException);
        }
    }

    J7(xi_1 xi_12, String string, Property property) {
        this.a = xi_12;
        this.b = property;
        super(string);
    }
}

