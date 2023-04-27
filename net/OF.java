/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.Event;
import cc.novoline.modules.AbstractModule;

public class OF
implements Event {
    private AbstractModule c;
    private int b;
    private String a;

    public AbstractModule c() {
        return this.c;
    }

    public int a() {
        return this.b;
    }

    public OF(AbstractModule abstractModule, int n, String string) {
        this.c = abstractModule;
        this.b = n;
        this.a = string;
    }

    public String b() {
        return this.a;
    }
}

