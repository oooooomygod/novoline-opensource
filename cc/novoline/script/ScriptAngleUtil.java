/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import deobf.Entity;
import deobf.Vec3;
import net.akv_0;
import net.skidunion.annotations;

public class ScriptAngleUtil {
    @annotations
    public float getYawToPoint(double d, double d2) {
        return akv_0.b(d, d2);
    }

    @annotations
    public float[] getAngles(Entity entity) {
        return akv_0.b(entity);
    }

    @annotations
    public Vec3 getVec3(double d, double d2, double d3) {
        return new Vec3(d, d2, d3);
    }
}

