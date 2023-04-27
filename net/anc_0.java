/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.aNc
 */
public class anc_0
extends WorldVertexBufferUploader {
    private aH5 b = null;

    @Override
    public void a(WorldRenderer worldRenderer) {
        WorldRendererInvoker.b(worldRenderer);
        dg_1.a(this.b, WorldRendererInvoker.l(worldRenderer));
    }

    public void a(aH5 aH52) {
        this.b = aH52;
    }
}

