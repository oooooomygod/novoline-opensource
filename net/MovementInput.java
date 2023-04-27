/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.events.SneakEvent;
import cc.novoline.invoke.EventManagerInvoker;
import net.xo_0;

public class MovementInput {
    private float d;
    private boolean c;
    private boolean a;
    private float b;

    public void b(float f) {
        this.d = f;
    }

    public float a() {
        return this.b;
    }

    public void a(float f) {
        this.b = f;
    }

    public float b() {
        return this.d;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public boolean d() {
        return this.a;
    }

    public void b(boolean bl) {
        SneakEvent sneakEvent = new SneakEvent(bl);
        EventManagerInvoker.call(sneakEvent);
        this.c = xo_0.a(sneakEvent);
    }

    public void e() {
    }
}

