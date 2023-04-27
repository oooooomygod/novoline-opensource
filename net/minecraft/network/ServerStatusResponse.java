/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network;

import deobf.IChatComponent;
import net.aEW;
import net.t6_0;

public class ServerStatusResponse {
    private aEW d;
    private IChatComponent b;
    private String a;
    private t6_0 c;

    public String a() {
        return this.a;
    }

    public void a(IChatComponent iChatComponent) {
        this.b = iChatComponent;
    }

    public void a(String string) {
        this.a = string;
    }

    public void a(t6_0 t6_02) {
        this.c = t6_02;
    }

    public IChatComponent c() {
        return this.b;
    }

    public void a(aEW aEW2) {
        this.d = aEW2;
    }

    public aEW b() {
        return this.d;
    }

    public t6_0 d() {
        return this.c;
    }
}

