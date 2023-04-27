/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.MapColor;
import net.Material;

public class MaterialTransparent
extends Material {
    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean q() {
        return false;
    }

    public MaterialTransparent(MapColor mapColor) {
        super(mapColor);
        this.i();
    }
}

