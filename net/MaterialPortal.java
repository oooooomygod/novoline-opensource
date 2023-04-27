/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MapColor;
import net.Material;

public class MaterialPortal
extends Material {
    @Override
    public boolean q() {
        return false;
    }

    public MaterialPortal(MapColor mapColor) {
        super(mapColor);
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }
}

