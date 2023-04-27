/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.visual.JumpCircle;
import deobf.Vec3;

/*
 * Renamed from net.lT
 */
class lt_1 {
    private float b;
    private float a;
    JumpCircle d;
    private Vec3 c;

    public lt_1(JumpCircle jumpCircle) {
        this.d = jumpCircle;
        this.c = new Vec3(JumpCircle.b((JumpCircle)jumpCircle).player.posX, JumpCircle.c((JumpCircle)jumpCircle).player.prevPosY, JumpCircle.a((JumpCircle)jumpCircle).player.posZ);
        this.b = 0.0f;
        this.a = 180.0f;
    }

    public void a(float f) {
        this.a = f;
    }

    static Vec3 a(lt_1 lt_12) {
        return lt_12.c;
    }

    public void b(float f) {
        this.b = f;
    }

    public float b() {
        return this.b;
    }

    public lt_1(JumpCircle jumpCircle, double d, double d2, double d3) {
        this.d = jumpCircle;
        this.c = new Vec3(d, d2, d3);
        this.b = 0.0f;
        this.a = 180.0f;
    }

    static float b(lt_1 lt_12) {
        return lt_12.a;
    }

    public float a() {
        return this.a;
    }
}

