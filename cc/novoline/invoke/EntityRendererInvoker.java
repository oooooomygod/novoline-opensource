/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityRenderer;
import net.aGC;
import net.aGQ;

public class EntityRendererInvoker {
    public static void renderStreamIndicator(EntityRenderer entityRenderer, float f) {
        entityRenderer.e(f);
    }

    public static void b(EntityRenderer entityRenderer) {
        entityRenderer.l();
    }

    public static void a(EntityRenderer entityRenderer, int n, int n2) {
        entityRenderer.a(n, n2);
    }

    public static void j(EntityRenderer entityRenderer) {
        entityRenderer.g();
    }

    public static void g(EntityRenderer entityRenderer) {
        entityRenderer.a();
    }

    public static void a(EntityRenderer entityRenderer, float f, long l4) {
        entityRenderer.b(f, l4);
    }

    public static void c(EntityRenderer entityRenderer) {
        entityRenderer.o();
    }

    public static void h(EntityRenderer entityRenderer) {
        entityRenderer.c();
    }

    public static void a(EntityRenderer entityRenderer, Entity entity) {
        entityRenderer.a(entity);
    }

    public static aGC e(EntityRenderer entityRenderer) {
        return entityRenderer.q();
    }

    public static void a(EntityRenderer entityRenderer, float f, int n, boolean bl, boolean bl2, boolean bl3) {
        entityRenderer.a(f, n, bl, bl2, bl3);
    }

    public static void a(EntityRenderer entityRenderer, float f, int n) {
        entityRenderer.b(f, n);
    }

    public static float a(EntityRenderer entityRenderer, EntityLivingBase entityLivingBase, float f) {
        return entityRenderer.a(entityLivingBase, f);
    }

    public static void c(EntityRenderer entityRenderer, float f) {
        entityRenderer.f(f);
    }

    public static void i(EntityRenderer entityRenderer) {
        entityRenderer.s();
    }

    public static void d(EntityRenderer entityRenderer) {
        entityRenderer.h();
    }

    public static void a(EntityRenderer entityRenderer, float f) {
        entityRenderer.h(f);
    }

    public static aGQ a(EntityRenderer entityRenderer) {
        return entityRenderer.b();
    }

    public static boolean f(EntityRenderer entityRenderer) {
        return entityRenderer.k();
    }
}

