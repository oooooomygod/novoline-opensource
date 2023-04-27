/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.FontRenderer;
import deobf.TileEntity;
import net.TextureManager;
import net.World;
import net.eg_0;
import net.hq_0;

public class aFR {
    private static boolean b;

    public static boolean c() {
        aFR.b();
        return true;
    }

    public static void a(hq_0 hq_02, World world, TextureManager textureManager, FontRenderer fontRenderer, Entity entity, float f) {
        hq_02.a(world, textureManager, fontRenderer, entity, f);
    }

    public static FontRenderer a(hq_0 hq_02) {
        return hq_02.a();
    }

    public static void a(hq_0 hq_02, TileEntity tileEntity, double d, double d2, double d3, float f) {
        hq_02.a(tileEntity, d, d2, d3, f);
    }

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(hq_0 hq_02, TileEntity tileEntity, float f, int n) {
        hq_02.a(tileEntity, f, n);
    }

    static {
        if (aFR.b()) {
            aFR.b(true);
        }
    }

    public static eg_0 a(hq_0 hq_02, TileEntity tileEntity) {
        return hq_02.a(tileEntity);
    }
}

