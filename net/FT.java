/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.FontRenderer;
import deobf.GameSettings;
import java.util.Map;
import net.RenderManager;
import net.World;
import net.ao7_0;
import net.j7_0;

public class FT {
    public static void b(RenderManager renderManager, Entity entity, float f) {
        renderManager.b(entity, f);
    }

    public static j7_0 a(RenderManager renderManager, Entity entity) {
        return renderManager.a(entity);
    }

    public static FontRenderer a(RenderManager renderManager) {
        return renderManager.d();
    }

    public static Map b(RenderManager renderManager) {
        return renderManager.c();
    }

    public static void a(RenderManager renderManager, boolean bl) {
        renderManager.c(bl);
    }

    public static void b(RenderManager renderManager, double d, double d2, double d3) {
        renderManager.a(d, d2, d3);
    }

    public static boolean a(RenderManager renderManager, Entity entity, ao7_0 ao7_02, double d, double d2, double d3) {
        return renderManager.a(entity, ao7_02, d, d2, d3);
    }

    public static boolean d(RenderManager renderManager) {
        return renderManager.a();
    }

    public static void b(RenderManager renderManager, boolean bl) {
        renderManager.a(bl);
    }

    public static boolean c(RenderManager renderManager) {
        return renderManager.e();
    }

    public static void a(RenderManager renderManager, Entity entity, double d, double d2, double d3, float f, float f2) {
        renderManager.b(entity, d, d2, d3, f, f2);
    }

    public static void a(RenderManager renderManager, World world) {
        renderManager.a(world);
    }

    public static double a(RenderManager renderManager, double d, double d2, double d3) {
        return renderManager.b(d, d2, d3);
    }

    public static void a(RenderManager renderManager, Entity entity, float f) {
        renderManager.a(entity, f);
    }

    public static void a(RenderManager renderManager, float f) {
        renderManager.a(f);
    }

    public static void a(RenderManager renderManager, World world, FontRenderer fontRenderer, Entity entity, Entity entity2, GameSettings gameSettings, float f) {
        renderManager.a(world, fontRenderer, entity, entity2, gameSettings, f);
    }

    public static void c(RenderManager renderManager, boolean bl) {
        renderManager.b(bl);
    }
}

