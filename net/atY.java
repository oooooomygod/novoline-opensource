/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.hk_0;

public enum atY implements ab9_0
{
    EMPTY(hk_0.B),
    POPPY(hk_0.p),
    BLUE_ORCHID(hk_0.R),
    ALLIUM(hk_0.c),
    HOUSTONIA(hk_0.d),
    RED_TULIP(hk_0.M),
    ORANGE_TULIP(hk_0.l),
    WHITE_TULIP(hk_0.H),
    PINK_TULIP(hk_0.a),
    OXEYE_DAISY(hk_0.x),
    DANDELION(hk_0.G),
    OAK_SAPLING(hk_0.I),
    SPRUCE_SAPLING(hk_0.b),
    BIRCH_SAPLING(hk_0.f),
    JUNGLE_SAPLING(hk_0.C),
    ACACIA_SAPLING(hk_0.n),
    DARK_OAK_SAPLING(hk_0.z),
    MUSHROOM_RED(hk_0.N),
    MUSHROOM_BROWN(hk_0.j),
    DEAD_BUSH(hk_0.t),
    FERN(hk_0.u),
    CACTUS(hk_0.s);

    private String b;

    public String toString() {
        return this.b;
    }

    private atY(String string2) {
        this.b = string2;
    }

    @Override
    public String a() {
        return this.b;
    }
}

