/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.Vec3;
import java.util.Random;
import net.nw_1;
import net.py_0;
import net.rm_2;

/*
 * Renamed from net.lW
 */
public class lw_1 {
    public static boolean a(nw_1 nw_12, Entity entity) {
        return nw_12.a(entity);
    }

    public static Random e(nw_1 nw_12) {
        return nw_12.E();
    }

    public static boolean d(nw_1 nw_12) {
        return nw_12.d();
    }

    public static int f(nw_1 nw_12) {
        return nw_12.a();
    }

    public static py_0 a(nw_1 nw_12) {
        return nw_12.a();
    }

    public static Vec3 a(nw_1 nw_12, float f) {
        return nw_12.a(f);
    }

    public static EntityLivingBase b(nw_1 nw_12) {
        return nw_12.ak();
    }

    public static rm_2 c(nw_1 nw_12) {
        return nw_12.getEntityBoundingBox();
    }

    public static void a(nw_1 nw_12, boolean bl) {
        nw_12.k(bl);
    }
}

