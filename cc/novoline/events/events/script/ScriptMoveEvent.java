/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events.script;

import cc.novoline.events.Event;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;
import net.MathHelper;
import net.MovementInput;
import net.bd_0;
import net.wj_0;
import net.skidunion.annotations;

public class ScriptMoveEvent
implements Event {
    private double c;
    private double b;
    private double a;

    @annotations
    public double getX() {
        return this.c;
    }

    public ScriptMoveEvent(double d, double d2, double d3) {
        this.c = d;
        this.b = d2;
        this.a = d3;
    }

    @annotations
    public double getZ() {
        return this.a;
    }

    @annotations
    public void setZ(double d) {
        this.a = d;
    }

    @annotations
    public void setX(double d) {
        this.c = d;
    }

    @annotations
    public void setY(double d) {
        this.b = d;
    }

    @annotations
    public void setMoveSpeed(double d) {
        bd_0.a();
        Minecraft minecraft = MCInvoker.f();
        MovementInput movementInput = PlayerInvoker.j(minecraft.player);
        double d2 = wj_0.c(movementInput);
        double d3 = wj_0.b(movementInput);
        double d4 = minecraft.player.rotationYaw;
        double d5 = d2 == 0.0 ? 90.0 : (d2 < 0.0 ? -45.0 : 45.0);
        boolean bl = d2 != 0.0 || d3 != 0.0;
        d4 += d2 < 0.0 ? 180.0 : 0.0;
        if (d3 < 0.0) {
            d4 += d5;
            ListInvoker.b(new ListInvoker[3]);
        }
        if (d3 > 0.0) {
            d4 -= d5;
        }
        this.setX(-((double)MathHelper.h(MathInvoker.o(d4)) * d));
        this.setZ((double)MathHelper.b(MathInvoker.o(d4)) * d);
        this.setX(0.0);
        this.setZ(0.0);
    }

    @annotations
    public double getY() {
        return this.b;
    }
}

