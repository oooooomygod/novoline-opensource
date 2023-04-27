/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.renderer.chunk.RenderChunk;

public class aQA {
    private RenderChunk b;
    private _y_0 a;

    public RenderChunk b() {
        return this.b;
    }

    public void a(RenderChunk renderChunk) {
        this.b = renderChunk;
        this.a = null;
    }

    public _y_0 a() {
        aP2.b();
        if (this.a == null) {
            this.a = new _y_0(this.b, null, 0);
        }
        return this.a;
    }
}

