/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.Potion;
import net.ResourceLocation;
import net.VO;
import net.atn_0;

public class PotionHealthBoost
extends Potion {
    public PotionHealthBoost(int n, ResourceLocation resourceLocation, boolean bl, int n2) {
        super(n, resourceLocation, bl, n2);
    }

    @Override
    public void b(EntityLivingBase entityLivingBase, VO vO, int n) {
        super.b(entityLivingBase, vO, n);
        if (atn_0.c(entityLivingBase) > atn_0.y(entityLivingBase)) {
            atn_0.a(entityLivingBase, atn_0.y(entityLivingBase));
        }
    }
}

