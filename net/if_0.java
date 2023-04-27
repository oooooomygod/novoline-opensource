/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.axh_0;

/*
 * Renamed from net.If
 */
public enum if_0 {
    MENU(new ResourceLocation(axh_0.k), 20, 600),
    GAME(new ResourceLocation(axh_0.d), 12000, 24000),
    CREATIVE(new ResourceLocation(axh_0.g), 1200, 3600),
    CREDITS(new ResourceLocation(axh_0.b), Integer.MAX_VALUE, Integer.MAX_VALUE),
    NETHER(new ResourceLocation(axh_0.l), 1200, 3600),
    END_BOSS(new ResourceLocation(axh_0.n), 0, 0),
    END(new ResourceLocation(axh_0.e), 6000, 24000);

    private int b;
    private ResourceLocation a;
    private int c;

    private if_0(ResourceLocation resourceLocation, int n2, int n3) {
        this.a = resourceLocation;
        this.b = n2;
        this.c = n3;
    }

    public ResourceLocation a() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}

