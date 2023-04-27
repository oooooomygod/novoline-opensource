/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;
import cc.novoline.events.events.script.ScriptMoveEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.EntityPlayerSP;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;
import net.MathHelper;

public class MoveEvent
implements Event {
    private double z;
    private double x;
    private double y;

    public MoveEvent(double d, double d2, double d3) {
        ScriptMoveEvent scriptMoveEvent = new ScriptMoveEvent(d, d2, d3);
        EventManagerInvoker.call(scriptMoveEvent);
        this.x = scriptMoveEvent.getX();
        this.y = scriptMoveEvent.getY();
        this.z = scriptMoveEvent.getZ();
    }

    public double getZ() {
        return this.z;
    }

    public void setSpeed(double d) {
        MotionUpdateEvent.d();
        Minecraft minecraft = MCInvoker.f();
        double d2 = PlayerInvoker.c(minecraft.player);
        if (PlayerInvoker.q(minecraft.player)) {
            this.setX(-((double)MathHelper.h(MathInvoker.o(d2)) * d));
            this.setZ((double)MathHelper.b(MathInvoker.o(d2)) * d);
        }
        this.setX(0.0);
        this.setZ(0.0);
    }

    public void setZ(double d) {
        this.z = d;
    }

    public void setY(double d) {
        this.y = d;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double d) {
        this.x = d;
    }

    public double getX() {
        return this.x;
    }

    public void a(float f, double d) {
        MotionUpdateEvent.d();
        EntityPlayerSP entityPlayerSP = MCInvoker.f().player;
        if (PlayerInvoker.q(entityPlayerSP)) {
            this.setX(-((double)MathHelper.h(MathInvoker.o(f)) * d));
            this.setZ((double)MathHelper.b(MathInvoker.o(f)) * d);
        }
        this.setX(0.0);
        this.setZ(0.0);
    }
}

