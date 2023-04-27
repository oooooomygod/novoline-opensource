/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.renderer.chunk.RenderChunk;
import java.util.Set;

/*
 * Renamed from net._y
 */
public class _y_0 {
    Set<EnumFacing> d = ace_2.b(EnumFacing.class);
    EnumFacing c;
    RenderChunk b;
    int a;

    public _y_0(RenderChunk renderChunk, EnumFacing enumFacing, int n) {
        this.b = renderChunk;
        this.c = enumFacing;
        this.a = n;
    }

    _y_0(RenderChunk renderChunk, EnumFacing enumFacing, int n, Object object) {
        this(renderChunk, enumFacing, n);
    }
}

