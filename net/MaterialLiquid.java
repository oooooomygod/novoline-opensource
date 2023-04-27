/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.Material;

public class MaterialLiquid
extends Material {
    @Override
    public boolean l() {
        return true;
    }

    public MaterialLiquid(MapColor mapColor) {
        super(mapColor);
        this.i();
        this.d();
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean q() {
        return false;
    }
}

