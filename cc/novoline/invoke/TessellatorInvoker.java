/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;

public class TessellatorInvoker {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static Tessellator getInstance() {
        return Tessellator.a();
    }

    public static boolean a() {
        TessellatorInvoker.b();
        return true;
    }

    static {
        if (TessellatorInvoker.a()) {
            TessellatorInvoker.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static WorldRenderer getWorldRenderer(Tessellator tessellator) {
        return tessellator.c();
    }

    public static void draw(Tessellator tessellator) {
        tessellator.b();
    }
}

