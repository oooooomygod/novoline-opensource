/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AttributeModifier;
import net.Potion;
import net.ResourceLocation;

public class PotionAttackDamage
extends Potion {
    protected PotionAttackDamage(int n, ResourceLocation resourceLocation, boolean bl, int n2) {
        super(n, resourceLocation, bl, n2);
    }

    @Override
    public double a(int n, AttributeModifier attributeModifier) {
        return this.a() == Potion.weakness.a() ? (double)(-0.5f * (float)(n + 1)) : 1.3 * (double)(n + 1);
    }
}

