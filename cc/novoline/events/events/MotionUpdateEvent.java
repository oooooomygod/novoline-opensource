/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.CancellableEvent;
import cc.novoline.events.type.State;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.EntityPlayerSP;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C04PacketPlayerPosition;
import net.minecraft.network.packts.C05PacketPlayerLook;
import net.minecraft.network.packts.C06PacketPlayerPosLook;

public class MotionUpdateEvent
extends CancellableEvent {
    private float yaw;
    private float pitch;
    private State stat;
    private double x;
    private static int j;
    private EntityPlayerSP g;
    private boolean ground;
    private double z;
    private double y;

    public void setOnGround(boolean bl) {
        this.ground = bl;
    }

    public MotionUpdateEvent(EntityPlayerSP entityPlayerSP, State state) {
        ScriptUpdateEvent scriptUpdateEvent = new ScriptUpdateEvent(this.x, this.y, this.z, this.yaw, this.pitch, this.ground, state);
        MotionUpdateEvent.d();
        EventManagerInvoker.call(scriptUpdateEvent);
        this.x = entityPlayerSP.posX;
        this.y = PlayerInvoker.p((EntityPlayerSP)entityPlayerSP).a;
        this.z = entityPlayerSP.posZ;
        this.yaw = entityPlayerSP.rotationYaw;
        this.pitch = entityPlayerSP.rotationPitch;
        this.ground = entityPlayerSP.onGround;
        this.stat = scriptUpdateEvent.getState();
        this.g = entityPlayerSP;
        ListInvoker.b(new ListInvoker[5]);
    }

    public void setX(double d) {
        this.x = d;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double d) {
        this.y = d;
    }

    public static void a(int n) {
        j = n;
    }

    public void setZ(double d) {
        this.z = d;
    }

    public void setYaw(float f) {
        this.yaw = f;
    }

    public void setState(State state) {
        this.stat = state;
    }

    static {
        if (MotionUpdateEvent.g() == 0) {
            MotionUpdateEvent.a(74);
        }
    }

    public MotionUpdateEvent(EntityPlayerSP entityPlayerSP, double d, double d2, double d3, float f, float f2, boolean bl, State state) {
        int n = MotionUpdateEvent.g();
        int n2 = n;
        ScriptUpdateEvent scriptUpdateEvent = new ScriptUpdateEvent(d, d2, d3, f, f2, bl, state);
        EventManagerInvoker.call(scriptUpdateEvent);
        this.x = scriptUpdateEvent.getX();
        this.y = scriptUpdateEvent.getY();
        this.z = scriptUpdateEvent.getZ();
        this.yaw = scriptUpdateEvent.getYaw();
        this.pitch = scriptUpdateEvent.getPitch();
        this.ground = scriptUpdateEvent.isOnGround();
        this.stat = scriptUpdateEvent.getState();
        this.g = entityPlayerSP;
        if (ListInvoker.b() != null) {
            MotionUpdateEvent.a(++n2);
        }
    }

    public float getYaw() {
        return this.yaw;
    }

    public static int g() {
        MotionUpdateEvent.d();
        return 22;
    }

    public float getPitch() {
        return this.pitch;
    }

    public C03PacketPlayer handlePacket(boolean bl) {
        MotionUpdateEvent.d();
        if (PlayerInvoker.a(this.g, this)) {
            if (PlayerInvoker.b(this.g, this)) {
                return new C06PacketPlayerPosLook(this.x, this.y, this.z, this.yaw, this.pitch, bl);
            }
            return new C04PacketPlayerPosition(this.x, this.y, this.z, bl);
        }
        if (PlayerInvoker.b(this.g, this)) {
            return new C05PacketPlayerLook(this.yaw, this.pitch, bl);
        }
        return new C03PacketPlayer(bl);
    }

    public State e() {
        return this.stat;
    }

    public double getY() {
        return this.y;
    }

    public C03PacketPlayer a() {
        MotionUpdateEvent.g();
        if (PlayerInvoker.a(this.g, this)) {
            if (PlayerInvoker.b(this.g, this)) {
                return new C06PacketPlayerPosLook(this.x, this.y, this.z, this.yaw, this.pitch, this.ground);
            }
            return new C04PacketPlayerPosition(this.x, this.y, this.z, this.ground);
        }
        if (PlayerInvoker.b(this.g, this)) {
            return new C05PacketPlayerLook(this.yaw, this.pitch, this.ground);
        }
        return new C03PacketPlayer(this.ground);
    }

    public static int d() {
        return j;
    }

    public boolean isOnGround() {
        return this.ground;
    }

    public void setPitch(float f) {
        this.pitch = f;
    }

    public double getZ() {
        return this.z;
    }
}

