/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.renderer.texture.TextureMap;
import net.JE;
import net.ModelManager;
import net.aRJ;
import net.atF;

public class ModelManagerInvoker {
    public static JE a(ModelManager modelManager) {
        return modelManager.b();
    }

    public static TextureMap b(ModelManager modelManager) {
        return modelManager.a();
    }

    public static JE a(ModelManager modelManager, aRJ aRJ2) {
        return modelManager.a(aRJ2);
    }

    public static atF getBlockModelShapes(ModelManager modelManager) {
        return modelManager.c();
    }
}

