/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityArrow;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IChatComponent;

public class aDJ {
    private static boolean b;

    public static boolean e(DamageSource damageSource) {
        return damageSource.g();
    }

    public static DamageSource a(Entity entity) {
        return DamageSource.a(entity);
    }

    public static String k(DamageSource damageSource) {
        return damageSource.f();
    }

    public static boolean h(DamageSource damageSource) {
        return damageSource.i();
    }

    public static float j(DamageSource damageSource) {
        return damageSource.t();
    }

    public static boolean b(DamageSource damageSource) {
        return damageSource.l();
    }

    public static DamageSource b(Entity entity, Entity entity2) {
        return DamageSource.a(entity, entity2);
    }

    public static boolean c() {
        aDJ.b();
        return true;
    }

    public static boolean f(DamageSource damageSource) {
        return damageSource.b();
    }

    public static Entity l(DamageSource damageSource) {
        return damageSource.o();
    }

    public static DamageSource a(aw0_0 aw0_02) {
        return DamageSource.a(aw0_02);
    }

    public static IChatComponent a(DamageSource damageSource, EntityLivingBase entityLivingBase) {
        return damageSource.a(entityLivingBase);
    }

    static {
        if (aDJ.b()) {
            aDJ.b(true);
        }
    }

    public static DamageSource a(Entity entity, Entity entity2) {
        return DamageSource.b(entity, entity2);
    }

    public static boolean g(DamageSource damageSource) {
        return damageSource.j();
    }

    public static boolean i(DamageSource damageSource) {
        return damageSource.q();
    }

    public static Entity d(DamageSource damageSource) {
        return damageSource.h();
    }

    public static DamageSource a(oa_1 oa_12, Entity entity) {
        return DamageSource.a(oa_12, entity);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean m(DamageSource damageSource) {
        return damageSource.e();
    }

    public static DamageSource a(EntityLivingBase entityLivingBase) {
        return DamageSource.b(entityLivingBase);
    }

    public static boolean c(DamageSource damageSource) {
        return damageSource.p();
    }

    public static boolean b() {
        return b;
    }

    public static DamageSource a(EntityArrow entityArrow, Entity entity) {
        return DamageSource.a(entityArrow, entity);
    }

    public static boolean a(DamageSource damageSource) {
        return damageSource.d();
    }

    public static DamageSource a(EntityPlayer entityPlayer) {
        return DamageSource.a(entityPlayer);
    }
}

