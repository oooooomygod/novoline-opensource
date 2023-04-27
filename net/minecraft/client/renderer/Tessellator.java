/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.renderer.WorldRenderer;
import net.aij_0;
import net.WorldVertexBufferUploader;

public class Tessellator {
    private WorldVertexBufferUploader b = new WorldVertexBufferUploader();
    private WorldRenderer a;
    private static Tessellator c = new Tessellator(0x200000);

    public static Tessellator a() {
        return c;
    }

    public WorldRenderer c() {
        return this.a;
    }

    public Tessellator(int n) {
        this.a = new WorldRenderer(n);
    }

    public void b() {
        WorldRendererInvoker.a(this.a);
        aij_0.a(this.b, this.a);
    }
}

