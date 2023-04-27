/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;
import cc.novoline.events.type.State;
import cc.novoline.invoke.ListInvoker;
import net.bd_0;
import net.skidunion.annotations;

public class ScriptUpdateEvent
implements Event {
    private float e;
    private float f;
    private double d;
    private boolean b;
    private double a;
    private State c;
    private double g;

    @annotations
    public double getZ() {
        return this.d;
    }

    @annotations
    public float getYaw() {
        return this.e;
    }

    @annotations
    public void setOnGround(boolean bl) {
        this.b = bl;
    }

    @annotations
    public void setState(State state) {
        this.c = state;
    }

    @annotations
    public void setYaw(float f) {
        this.e = f;
    }

    @annotations
    public void setPitch(float f) {
        this.f = f;
    }

    @annotations
    public void setX(double d) {
        this.g = d;
    }

    @annotations
    public State getState() {
        return this.c;
    }

    @annotations
    public float getPitch() {
        return this.f;
    }

    public ScriptUpdateEvent(double d, double d2, double d3, float f, float f2, boolean bl, State state) {
        bd_0.a();
        this.g = d;
        this.a = d2;
        this.d = d3;
        this.e = f;
        this.f = f2;
        this.b = bl;
        this.c = state;
        if (ListInvoker.b() != null) {
            bd_0.b("vUP7Tb");
        }
    }

    @annotations
    public boolean isOnGround() {
        return this.b;
    }

    @annotations
    public void setZ(double d) {
        this.d = d;
    }

    @annotations
    public double getX() {
        return this.g;
    }

    @annotations
    public double getY() {
        return this.a;
    }

    public ScriptUpdateEvent(State state) {
        this.c = state;
    }

    @annotations
    public void setY(double d) {
        this.a = d;
    }
}

