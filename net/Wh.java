/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import deobf.NetworkManager;
import net.a2R;
import net.aGK;
import net.asd_0;
import net.yo_2;
import org.apache.logging.log4j.Logger;

public class Wh {
    private NetworkManager c;
    private static Logger d = LogManagerInvoker.c();
    private yo_2 a;
    private volatile boolean b = false;

    public void c() {
        this.b = true;
    }

    static yo_2 c(Wh wh) {
        return wh.a;
    }

    public void a(String string, int n) {
        aGK.a(true);
        new a2R(this, asd_0.a, string, n).start();
    }

    static NetworkManager b(Wh wh) {
        return wh.c;
    }

    static Logger b() {
        return d;
    }

    public void a() {
        if (this.c != null) {
            if (NetworkManagerInvoker.d(this.c)) {
                NetworkManagerInvoker.h(this.c);
            } else {
                NetworkManagerInvoker.a(this.c);
            }
        }
    }

    public Wh(yo_2 yo_22) {
        this.a = yo_22;
    }

    static NetworkManager a(Wh wh, NetworkManager networkManager) {
        wh.c = networkManager;
        return wh.c;
    }

    static boolean a(Wh wh) {
        return wh.b;
    }
}

