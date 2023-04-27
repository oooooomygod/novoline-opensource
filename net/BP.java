/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.CancellableEvent;
import deobf.Entity;
import net.ad3_0;
import net.jg_1;

public class BP
extends CancellableEvent {
    private jg_1 h;
    private double i;
    private double f;
    private Entity c;
    private double d;
    private boolean e;
    private ad3_0 g;

    public double f() {
        return this.f;
    }

    public double d() {
        return this.i;
    }

    public jg_1 b() {
        return this.h;
    }

    public double c() {
        return this.d;
    }

    public Entity e() {
        return this.c;
    }

    public BP(jg_1 jg_12, Entity entity, double d, double d2, double d3, ad3_0 ad3_02) {
        this.c = entity;
        this.g = ad3_02;
        this.d = d;
        this.f = d2;
        this.i = d3;
        this.h = jg_12;
    }

    public ad3_0 a() {
        return this.g;
    }

    public BP(Entity entity, ad3_0 ad3_02) {
        this.c = entity;
        this.g = ad3_02;
    }
}

