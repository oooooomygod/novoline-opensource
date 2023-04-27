/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/*
 * Renamed from net.a7s
 */
class a7s_0
extends Authenticator {
    String b;
    String a;

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.b, StringInvoker.f(this.a));
    }

    a7s_0(String string, String string2) {
        this.b = string;
        this.a = string2;
    }
}

