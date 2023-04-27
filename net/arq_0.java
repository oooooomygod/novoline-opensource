/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.anw_0;
import net.me_1;

/*
 * Renamed from net.aRq
 */
public enum arq_0 {
    COMMON(anw_0.WHITE, me_1.e),
    UNCOMMON(anw_0.YELLOW, me_1.g),
    RARE(anw_0.AQUA, me_1.h),
    EPIC(anw_0.LIGHT_PURPLE, me_1.c);

    public anw_0 rarityColor;
    public String rarityName;

    private arq_0(anw_0 anw_02, String string2) {
        this.rarityColor = anw_02;
        this.rarityName = string2;
    }
}

