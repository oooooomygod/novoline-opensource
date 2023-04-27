/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.uJ
 */
public class uj_1 {
    private WorldRenderer[] a = new WorldRenderer[a5w_0.values().length];

    public WorldRenderer a(a5w_0 a5w_02) {
        return this.a[a5w_02.ordinal()];
    }

    public WorldRenderer a(int n) {
        return this.a[n];
    }

    public uj_1() {
        this.a[a5w_0.SOLID.ordinal()] = new WorldRenderer(0x200000);
        this.a[a5w_0.CUTOUT.ordinal()] = new WorldRenderer(131072);
        this.a[a5w_0.CUTOUT_MIPPED.ordinal()] = new WorldRenderer(131072);
        this.a[a5w_0.TRANSLUCENT.ordinal()] = new WorldRenderer(262144);
    }
}

