/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.H0;
import net.aFY;
import net.agz_0;

public class aSU
extends Thread {
    private agz_0 b = null;
    private String a = null;

    public agz_0 a() {
        return this.b;
    }

    @Override
    public void run() {
        try {
            byte[] byArray = aFY.a(this.a, MCInvoker.R(MCInvoker.f()));
            H0.a(this.b, this.a, byArray, null);
        }
        catch (Exception exception) {
            H0.a(this.b, this.a, null, exception);
        }
    }

    public aSU(String string, agz_0 agz_02) {
        this.a = string;
        this.b = agz_02;
    }

    public String b() {
        return this.a;
    }
}

